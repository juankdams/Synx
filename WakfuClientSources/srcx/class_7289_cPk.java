class cPk extends cDn
{
  private final int[][] kyd;

  cPk(int paramInt1, int paramInt2, CG paramCG)
  {
    if (paramCG == CG.bFP) {
      paramCG = CG.bFG;
    }
    int i = paramCG.hY;
    int j = paramCG.hZ;

    this.kyd = new int[][] { { i, -j, paramInt1 }, { j, i, paramInt2 } };
  }

  public int[] R(int[] paramArrayOfInt)
  {
    return new int[] { this.kyd[0][0] * paramArrayOfInt[0] + this.kyd[0][1] * paramArrayOfInt[1] + this.kyd[0][2], this.kyd[1][0] * paramArrayOfInt[0] + this.kyd[1][1] * paramArrayOfInt[1] + this.kyd[1][2] };
  }

  public int[] S(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt[0] - this.kyd[0][2];
    int j = paramArrayOfInt[1] - this.kyd[1][2];
    return new int[] { this.kyd[0][0] * i + this.kyd[1][0] * j, this.kyd[0][1] * i + this.kyd[1][1] * j };
  }
}