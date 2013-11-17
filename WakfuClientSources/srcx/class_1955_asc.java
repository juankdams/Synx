public class asc
{
  private static final int dBD = 18;
  private static final int dBE = 10;
  public static final int aDZ = 18;
  public static final int dBF = 18;
  public static final int dBG = 324;
  public static final int dBH = 64;
  public static final int dBI = 131071;
  public static final int dBJ = 131071;
  public static final int dBK = 511;
  public static final int dBL = -131072;
  public static final int dBM = -131072;
  public static final int dBN = -512;
  public static final int dBO = 7281;
  public static final int dBP = 7281;
  public static final int dBQ = 511;
  public static final int dBR = -7281;
  public static final int dBS = -7281;
  public static final int dBT = -512;

  public static int jT(int paramInt)
  {
    return bCO.bD(paramInt / 18.0F);
  }

  public static int jU(int paramInt) {
    return bCO.bD(paramInt / 18.0F);
  }

  public static dQx k(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = jT(paramInt1);
    int j = jU(paramInt2);
    int k = jT(paramInt1 + paramInt3) + 1;
    int m = jU(paramInt2 + paramInt4) + 1;
    return new dQx(i, k, j, m);
  }
}