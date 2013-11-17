public abstract class bgr extends dPl
{
  protected int fui;
  protected float fuj;

  public bgr(long paramLong1, String paramString1, short paramShort, byte paramByte, long paramLong2, String paramString2, int paramInt, float paramFloat, cvN paramcvN)
  {
    super(paramLong1, paramString1, paramShort, paramByte, paramLong2, paramString2, paramcvN);

    this.fui = paramInt;
    this.fuj = paramFloat;
  }

  public int bsZ() {
    return this.fui;
  }

  public float bta() {
    return this.fuj;
  }
}