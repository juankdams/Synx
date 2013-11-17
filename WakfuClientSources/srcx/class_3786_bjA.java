import java.util.ArrayList;

public class bjA extends aRw
{
  private final long bTB;
  private final ArrayList cm = new ArrayList();

  public bjA(long paramLong) {
    this.bTB = paramLong;
  }

  public void f(long paramLong, short paramShort) {
    this.cm.add(new Cs(Long.valueOf(paramLong), Short.valueOf(paramShort)));
  }

  public byte[] encode()
  {
    cXr localcXr = new cXr();
    localcXr.jn(this.bTB);
    for (Cs localCs : this.cm) {
      localcXr.jn(((Long)localCs.getFirst()).longValue());
      localcXr.dT(((Short)localCs.Lp()).shortValue());
    }
    return a((byte)3, localcXr.toArray());
  }

  public int getId()
  {
    return 15943;
  }
}