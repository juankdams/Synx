class dxw
{
  private Runnable lDE;
  private final ccG bah;
  private final int lDF;
  private final dxw lDG;
  private final byte lDH;
  private short dQt = 0;
  private byte lDI;

  private dxw(bsK parambsK, ccG paramccG, int paramInt, dxw paramdxw, byte paramByte)
  {
    this.bah = paramccG;
    this.lDF = paramInt;
    this.lDG = paramdxw;
    this.lDH = paramByte;
  }

  private dxw(bsK parambsK, ccG paramccG, int paramInt, byte paramByte) {
    this(parambsK, paramccG, paramInt, null, paramByte);
  }

  private void a(short paramShort, boolean paramBoolean, int paramInt, float paramFloat)
  {
    bsK.a(this.lDJ, false);

    int i = paramInt;

    float f = this.bah.getOffset();

    if (this.lDE != null) {
      return;
    }
    this.lDE = new bhp(this, paramBoolean, paramFloat, paramShort, f, i);

    dka.cSF().a(this.lDE, 25L);
  }

  public void dcq() {
    float f = this.lDH / (bsK.g(this.lDJ) / 25.0F);
    int i = bsK.bAT().length;

    a((short)this.lDH, true, this.lDH, f);
  }

  public void dcr() {
    int i = bsK.bAT().length;
    float f = i / (bsK.g(this.lDJ) / 25.0F);
    a((short)i, true, i, f);
  }

  private void setListOffset(float paramFloat)
  {
    this.bah.setListOffset(paramFloat);
  }

  public Byte dcs() {
    return Byte.valueOf(this.lDI);
  }

  public byte dct() {
    return this.lDH;
  }

  public int dcu() {
    return this.lDF;
  }

  public void clean() {
    dka.cSF().j(this.lDE);
  }

  public ccG getList() {
    return this.bah;
  }
}