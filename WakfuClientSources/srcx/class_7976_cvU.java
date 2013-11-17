import java.nio.ByteBuffer;
import java.util.LinkedList;

public class cvU extends bLQ
{
  private final LinkedList ihr = new LinkedList();
  private FT cJV;
  private FT cJW;

  public cvU(String paramString, dNt paramdNt, dUl paramdUl)
  {
    super(paramString, paramdNt, paramdUl);
    this.cJV = ((FT)a(new FT("overLastHour", this, paramdUl)));
    this.cJW = ((FT)a(new FT("overLastTenMinutes", this, paramdUl)));
  }

  public void clear()
  {
    super.clear();
    this.ihr.clear();
  }

  public void update()
  {
    long l = System.currentTimeMillis();
    while ((!this.ihr.isEmpty()) && (l - ((Long)this.ihr.peek()).longValue() > 3600000L)) {
      this.ihr.poll();
    }
    int i = 0;
    for (Long localLong : this.ihr) {
      if (l - localLong.longValue() <= 600000L) {
        break;
      }
      i++;
    }

    this.cJV.fM(this.ihr.size());
    this.cJW.fM(this.ihr.size() - i);
  }

  public final void ctE()
  {
    this.ihr.addLast(Long.valueOf(System.currentTimeMillis()));
  }

  public void a(cXr paramcXr)
  {
    update();
    a(paramcXr, cdG.hxA);
    paramcXr.jn(this.cJV.getValue());
    paramcXr.jn(this.cJW.getValue());
  }

  public void a(ByteBuffer paramByteBuffer, String paramString) {
    throw new UnsupportedOperationException("Un CountOverTimePropertyNode doit être désérialisé en tant que FusioningCountOverTimePropertyNode");
  }
}