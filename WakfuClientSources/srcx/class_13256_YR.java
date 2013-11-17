import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

public class YR extends bLQ
{
  private final Map cJU;
  private FT cJV;
  private FT cJW;

  public YR(String paramString, dNt paramdNt, dUl paramdUl)
  {
    super(paramString, paramdNt, paramdUl);
    if (paramdUl == dUl.mrx)
      this.cJU = null;
    else {
      this.cJU = new HashMap(5);
    }
    this.cJV = ((FT)a(new FT("overLastHour", this, paramdUl)));
    this.cJW = ((FT)a(new FT("overLastTenMinutes", this, paramdUl)));
  }

  public void clear()
  {
    super.clear();
    this.cJU.clear();
  }

  public void a(cXr paramcXr) {
    throw new UnsupportedOperationException("Un noeud fusionnant ne peut pas être sérialisé");
  }

  public void a(ByteBuffer paramByteBuffer, String paramString) {
    long l1 = paramByteBuffer.getLong();
    long l2 = paramByteBuffer.getLong();
    if (this.mee != dUl.mrx) {
      dHN localdHN1 = new dHN(null);
      localdHN1.lSF = l1;
      localdHN1.lSG = l2;
      this.cJU.put(paramString, localdHN1);
      l1 = 0L;
      l2 = 0L;
      for (dHN localdHN2 : this.cJU.values()) {
        l1 += localdHN2.lSF;
        l2 += localdHN2.lSG;
      }
      if (this.mee == dUl.mrz) {
        l1 /= this.cJU.size();
        l2 /= this.cJU.size();
      }
    }
    this.cJV.fM(l1);
    this.cJW.fM(l2);
  }
}