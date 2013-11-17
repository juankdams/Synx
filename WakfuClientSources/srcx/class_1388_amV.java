public class amV extends cZL
{
  final int dpG;
  final int dpH;

  public amV(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramInt1, paramInt2);
    this.dpG = paramInt3;
    this.dpH = paramInt4;
  }

  public boolean hasMark() {
    return true;
  }

  public int azp() {
    return this.dpG;
  }

  public int azq() {
    return this.dpH;
  }
}