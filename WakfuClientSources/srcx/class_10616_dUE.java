class dUE extends doC
{
  private final byte ksC;
  private final float dmV;

  dUE(byte paramByte, float paramFloat)
  {
    this.ksC = paramByte;
    this.dmV = paramFloat;
  }

  public int eQ(short paramShort) {
    return (int)Math.floor(paramShort * this.dmV);
  }

  protected void a(azp paramazp, short paramShort1, short paramShort2) {
    Rx localRx = (Rx)paramazp.a(eu.a(Byte.valueOf(this.ksC)));
    int i = eQ(paramShort2) - eQ(paramShort1);
    localRx.gx(i);
    localRx.gv(i);
  }

  public int a(eu parameu, short paramShort1, short paramShort2) {
    if (this.ksC != parameu.bJ())
      return 0;
    return eQ(paramShort2) - eQ(paramShort1);
  }
}