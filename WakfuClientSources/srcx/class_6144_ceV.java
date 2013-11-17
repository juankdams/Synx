public class ceV extends dxy
{
  private final cSi hzN;
  private short hzO;

  public ceV(int paramInt1, short paramShort1, short paramShort2, short paramShort3, short paramShort4, short paramShort5, boolean paramBoolean1, short paramShort6, cSR paramcSR, int paramInt2, boolean paramBoolean2)
  {
    super(paramInt1, paramShort1, paramShort2, paramShort3, paramShort4, paramShort5, paramBoolean1, paramShort6, paramcSR, paramInt2, paramBoolean2);

    this.hzN = new cSi();
  }

  public void N(int[] paramArrayOfInt) {
    this.hzN.add(paramArrayOfInt);
  }

  public short chQ() {
    return this.hzO;
  }

  public void cZ(short paramShort) {
    this.hzO = paramShort;
  }

  public int[] BA() {
    return this.hzN.cIf();
  }
}