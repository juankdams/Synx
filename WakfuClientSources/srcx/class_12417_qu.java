class qu
{
  final int[] aXB;
  final int[] aXC;
  final int aXD;
  final int[] aXE;
  final int[] aXF;

  qu(int paramInt, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    this.aXE = new int[paramInt * 2];
    this.aXF = new int[paramInt * 2];

    int i = 0;
    int m;
    int n;
    for (int j = 0; j < paramInt; j++) {
      k = paramArrayOfInt2[j];
      if (k > 0)
      {
        m = 0;

        for (n = 0; n < k - 1; n++) {
          int i1 = paramArrayOfInt1[j] >>> n & 0x1;
          if (i1 == 0) {
            if (this.aXE[m] == 0) {
              this.aXE[m] = (++i);
            }
            m = this.aXE[m];
          } else {
            if (this.aXF[m] == 0) {
              this.aXF[m] = (++i);
            }
            m = this.aXF[m];
          }
        }

        if ((paramArrayOfInt1[j] >>> n & 0x1) == 0)
          this.aXE[m] = (-j);
        else {
          this.aXF[m] = (-j);
        }
      }
    }
    this.aXD = cr(paramInt);

    j = 1 << this.aXD;
    this.aXB = new int[j];
    this.aXC = new int[j];
    for (int k = 0; k < j; k++) {
      m = 0;

      for (n = 0; (n < this.aXD) && ((m > 0) || (n == 0)); n++) {
        m = (k & 1 << n) != 0 ? this.aXF[m] : this.aXE[m];
      }
      this.aXB[k] = m;
      this.aXC[k] = n;
    }
  }

  private static int cr(int paramInt)
  {
    int i = bhz.pE(paramInt) - 4;
    return i < 5 ? 5 : i;
  }

  static qu a(duz paramduz)
  {
    int i = paramduz.lyT;
    int[] arrayOfInt = aaN.e(paramduz.lyU, i);

    if (arrayOfInt == null) {
      return null;
    }

    return new qu(i, arrayOfInt, paramduz.lyU);
  }
}