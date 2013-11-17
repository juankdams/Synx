public class Fi
{
  private int hY;
  private int hZ;
  private int ia;
  private int ib;

  public Fi(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.hY = paramInt1;
    this.hZ = paramInt2;
    this.ia = paramInt3;
    this.ib = paramInt4;
  }

  public final int getX() {
    return this.hY;
  }

  public final void setX(int paramInt) {
    this.hY = paramInt;
  }

  public final int getY() {
    return this.hZ;
  }

  public final void setY(int paramInt) {
    this.hZ = paramInt;
  }

  public final int getWidth() {
    return this.ia;
  }

  public final void setWidth(int paramInt) {
    this.ia = paramInt;
  }

  public final int getHeight() {
    return this.ib;
  }

  public final void setHeight(int paramInt) {
    this.ib = paramInt;
  }

  public final float ON() {
    return (getWidth() - getX()) * 0.5F;
  }

  public final float OO() {
    return (getHeight() - getY()) * 0.5F;
  }

  public final Fi OP() {
    return new Fi(this.hY, this.hZ, this.ia, this.ib);
  }

  public final void set(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.hY = paramInt1;
    this.hZ = paramInt2;
    this.ia = paramInt3;
    this.ib = paramInt4;
  }

  public final boolean d(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (this.hY == paramInt1) && (this.hZ == paramInt2) && (this.ia == paramInt3) && (this.ib == paramInt4);
  }
}