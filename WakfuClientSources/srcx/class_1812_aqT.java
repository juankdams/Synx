public class aqT
{
  private static final aqT dyA = new aqT();

  private final cSR dyB = new cSR();

  public static aqT aDc()
  {
    return dyA;
  }

  public dxi jC(int paramInt) {
    return (dxi)this.dyB.get(paramInt);
  }

  public void a(dxi paramdxi) {
    this.dyB.put(paramdxi.getId(), paramdxi);
  }
}