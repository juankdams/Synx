public class bGJ
{
  final int hY;
  final int hZ;
  final int ia;
  final int ib;

  public bGJ(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.hY = (paramInt1 * 18);
    this.hZ = (paramInt2 * 18);
    this.ia = paramInt3;
    this.ib = paramInt4;
  }

  public final int L(int paramInt1, int paramInt2, int paramInt3) {
    return paramInt1 - this.hY + (paramInt2 - this.hZ + paramInt3 * this.ib) * this.ia;
  }
}