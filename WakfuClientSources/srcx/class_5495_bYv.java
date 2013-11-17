import java.util.ArrayList;

public final class bYv extends aRw
{
  private final long hou;
  private final ArrayList cm = new ArrayList();

  public bYv(long paramLong) {
    this.hou = paramLong;
  }

  public void f(long paramLong, short paramShort) {
    this.cm.add(new Cs(Long.valueOf(paramLong), Short.valueOf(paramShort)));
  }

  public byte[] encode()
  {
    cXr localcXr = new cXr();
    localcXr.jn(this.hou);
    for (Cs localCs : this.cm) {
      localcXr.jn(((Long)localCs.getFirst()).longValue());
      localcXr.dT(((Short)localCs.Lp()).shortValue());
    }
    return a((byte)3, localcXr.toArray());
  }

  public int getId()
  {
    return 15653;
  }
}