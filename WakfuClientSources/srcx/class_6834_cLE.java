public class cLE
{
  private final aqF iLb;
  private final int cxl;
  private final int bRG;
  private final lX iLc;

  cLE(aqF paramaqF, int paramInt1, int paramInt2, lX paramlX)
  {
    this.iLb = paramaqF;
    this.cxl = paramInt1;
    this.bRG = paramInt2;
    this.iLc = paramlX;
  }

  public static cLE a(int paramInt1, int paramInt2, int paramInt3, byte paramByte) {
    lX locallX = lX.u(paramByte);
    if (paramInt1 == 0)
      return new cLE(aqF.dyl, paramInt2, paramInt3, locallX);
    return new cLE(aqF.dyk, paramInt1, paramInt3, locallX);
  }

  public aqF cEJ() {
    return this.iLb;
  }

  public int getValue() {
    return this.cxl;
  }

  int Sa() {
    return this.bRG;
  }

  public boolean a(int paramInt, lX paramlX)
  {
    if (paramInt < this.bRG)
      return false;
    return paramlX.a(this.iLc);
  }
}