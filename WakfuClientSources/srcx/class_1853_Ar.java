public class Ar extends bKZ
{
  private int bvX;

  public Ar(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramInt2, paramInt3, paramInt4);
    this.bvX = paramInt1;
  }

  public boolean dT(int paramInt)
  {
    if (this.bvX > 0) {
      this.bvX -= paramInt;
      return true;
    }
    return super.dT(paramInt);
  }

  public float xP() {
    if (this.bvX > 0) {
      return 0.0F;
    }
    return super.xP();
  }
}