class dRE
{
  final bfh mnh;
  private float fDr = 1.0F;
  private int mni;

  dRE(bfh parambfh, int paramInt)
  {
    this.mnh = parambfh;
    this.mni = paramInt;
  }

  public int dsx() {
    return this.mni;
  }

  public float xP()
  {
    return this.fDr;
  }

  public void A(float paramFloat) {
    this.fDr = paramFloat;
  }

  public final void update(int paramInt) {
    this.mnh.update(paramInt);
  }

  public final boolean isActive() {
    return this.fDr > 0.0F;
  }
}