public class hh extends cLS
{
  private int hY;
  private int hZ;
  private int ib;
  private int ia;
  private boolean aGu;

  public hh(float paramFloat1, float paramFloat2, byte paramByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramFloat1, paramFloat2, paramByte);
    this.hY = paramInt1;
    this.hZ = paramInt2;
    this.ia = paramInt3;
    this.ib = paramInt4;
    this.aGu = true;
  }

  public hh(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super(0.0F, 0.0F, (byte)1);
    this.ib = paramInt4;
    this.hY = paramInt1;
    this.hZ = paramInt2;
    this.ia = paramInt3;
  }

  public void setHeight(int paramInt) {
    this.ib = paramInt;
  }

  public void setWidth(int paramInt) {
    this.ia = paramInt;
  }

  public void setX(int paramInt) {
    this.hY = paramInt;
  }

  public void setY(int paramInt) {
    this.hZ = paramInt;
  }

  public int q(int paramInt1, int paramInt2) {
    if (this.aGu) {
      return super.q(paramInt1, paramInt2);
    }
    return this.ib;
  }

  public int r(int paramInt1, int paramInt2) {
    if (this.aGu) {
      return super.r(paramInt1, paramInt2);
    }
    return this.hY;
  }

  public int s(int paramInt1, int paramInt2) {
    if (this.aGu) {
      return super.s(paramInt1, paramInt2);
    }
    return this.hZ;
  }

  public int t(int paramInt1, int paramInt2) {
    if (this.aGu) {
      return super.t(paramInt1, paramInt2);
    }
    return this.ia;
  }

  public void setRelative(boolean paramBoolean) {
    this.aGu = paramBoolean;
  }
}