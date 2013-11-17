class afQ
  implements dRY
{
  private ccG bah;
  private bpn cGL;
  private float cYY;

  private afQ(dtN paramdtN, ccG paramccG, bpn parambpn)
  {
    this.bah = paramccG;
    this.cGL = parambpn;
  }

  public void ci() {
    cii.t(this.cGL);
    if (this.cYY == -1.0F)
      this.cYY = this.bah.getOffset();
    else
      this.bah.setOffset(this.cYY);
  }

  public void setListOffset(float paramFloat)
  {
    this.cYY = paramFloat;
  }
}