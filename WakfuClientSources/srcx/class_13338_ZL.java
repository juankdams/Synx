public class ZL extends cCD
{
  public boolean e(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = dtb.pU(dlD.cTt().getPath() + dTI.dtC().Ea(paramInt1));
    if (!bool) {
      return false;
    }
    return dTI.dtC().n(paramInt1, new int[] { paramInt2, paramInt3, paramInt4 });
  }
}