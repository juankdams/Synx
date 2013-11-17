class bUh
{
  final float[][] hfW = new float[4][];

  private static bUh H(int[] paramArrayOfInt) {
    bUh localbUh = new bUh();
    localbUh.hfW[0] = dPO.N(0, paramArrayOfInt[0], paramArrayOfInt[0] / 2, paramArrayOfInt[0] / 2);
    localbUh.hfW[1] = localbUh.hfW[0];
    localbUh.hfW[2] = localbUh.hfW[0];
    localbUh.hfW[3] = localbUh.hfW[0];
    return localbUh;
  }

  private static bUh I(int[] paramArrayOfInt) {
    bUh localbUh = new bUh();
    localbUh.hfW[0] = dPO.N(0, paramArrayOfInt[1], paramArrayOfInt[0] / 2, paramArrayOfInt[0] / 2);
    localbUh.hfW[1] = dPO.N(0, paramArrayOfInt[1], paramArrayOfInt[0] / 2, paramArrayOfInt[1] / 2);
    localbUh.hfW[2] = dPO.N(0, paramArrayOfInt[1], paramArrayOfInt[1] / 2, paramArrayOfInt[0] / 2);
    localbUh.hfW[3] = dPO.N(0, paramArrayOfInt[1], paramArrayOfInt[1] / 2, paramArrayOfInt[1] / 2);
    return localbUh;
  }

  float[] di(int paramInt1, int paramInt2) {
    return this.hfW[(paramInt1 << 1 | paramInt2)];
  }
}