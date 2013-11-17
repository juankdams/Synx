class duz
{
  int cPc;
  int lyT;
  int[] lyU;
  private int lyV;
  private int lyW;
  private int lyX;
  private int lyY;
  private int lyZ;
  private int[] lza;
  private static final int lzb = 21;
  private static final int lzc = 768;

  int a(cf paramcf)
  {
    if (paramcf.read(24) != 5653314)
    {
      clear();
      return -1;
    }

    this.cPc = paramcf.read(16);
    this.lyT = paramcf.read(24);
    if (this.lyT == -1)
    {
      clear();
      return -1;
    }
    int i;
    int j;
    switch (paramcf.read(1))
    {
    case 0:
      this.lyU = new int[this.lyT];

      if (paramcf.read(1) != 0)
      {
        for (i = 0; i < this.lyT; i++) {
          if (paramcf.read(1) != 0) {
            j = paramcf.read(5);
            if (j == -1)
            {
              clear();
              return -1;
            }
            this.lyU[i] = (j + 1);
          } else {
            this.lyU[i] = 0;
          }
        }
      }

      for (i = 0; i < this.lyT; ) {
        j = paramcf.read(5);
        if (j == -1)
        {
          clear();
          return -1;
        }
        this.lyU[i] = (j + 1);

        i++; continue;

        j = paramcf.read(5) + 1;
        this.lyU = new int[this.lyT];

        for (i = 0; i < this.lyT; ) {
          int k = paramcf.read(bhz.pE(this.lyT - i));
          if (k == -1)
          {
            clear();
            return -1;
          }
          for (int m = 0; m < k; i++) {
            this.lyU[i] = j;

            m++;
          }

          j++;
        }

        break;

        return -1;
      }
    case 1:
    }
    switch (this.lyV = paramcf.read(4))
    {
    case 0:
      break;
    case 1:
    case 2:
      this.lyW = paramcf.read(32);
      this.lyX = paramcf.read(32);
      this.lyY = (paramcf.read(4) + 1);
      this.lyZ = paramcf.read(1);

      j = 0;
      switch (this.lyV) {
      case 1:
        j = dag();
        break;
      case 2:
        j = this.lyT * this.cPc;
      }

      this.lza = new int[j];
      for (i = 0; i < j; i++) {
        this.lza[i] = paramcf.read(this.lyY);
      }
      if (this.lza[(j - 1)] == -1)
      {
        clear();
        return -1;
      }

      break;
    default:
      clear();
      return -1;
    }

    return 0;
  }

  private int dag()
  {
    int i = (int)Math.floor(Math.pow(this.lyT, 1.0D / this.cPc));
    while (true)
    {
      int j = 1;
      int k = 1;
      for (int m = 0; m < this.cPc; m++) {
        j *= i;
        k *= (i + 1);
      }
      if ((j <= this.lyT) && (k > this.lyT)) {
        return i;
      }
      if (j > this.lyT)
        i--;
      else
        i++;
    }
  }

  void clear()
  {
  }

  float[] dah()
  {
    if ((this.lyV == 1) || (this.lyV == 2))
    {
      float f1 = BL(this.lyW);
      float f2 = BL(this.lyX);
      float[] arrayOfFloat = new float[this.lyT * this.cPc];
      int j;
      float f3;
      int k;
      int m;
      int n;
      switch (this.lyV)
      {
      case 1:
        int i = dag();
        for (j = 0; j < this.lyT; j++) {
          f3 = 0.0F;
          k = 1;
          m = j * this.cPc;
          for (n = 0; n < this.cPc; n++) {
            int i1 = j / k % i;
            float f5 = Math.abs(this.lza[i1]) * f2 + f1 + f3;
            if (this.lyZ != 0)
              f3 = f5;
            arrayOfFloat[(m + n)] = f5;
            k *= i;
          }
        }
        break;
      case 2:
        for (j = 0; j < this.lyT; j++) {
          f3 = 0.0F;
          k = j * this.cPc;
          for (m = 0; m < this.cPc; m++) {
            n = k + m;
            float f4 = Math.abs(this.lza[n]) * f2 + f1 + f3;
            if (this.lyZ != 0)
              f3 = f4;
            arrayOfFloat[n] = f4;
          }
        }
      }
      return arrayOfFloat;
    }
    return null;
  }

  private static float BL(int paramInt)
  {
    float f1 = paramInt & 0x1FFFFF;
    float f2 = (paramInt & 0x7FE00000) >>> 21;
    if ((paramInt & 0x80000000) != 0)
      f1 = -f1;
    return j(f1, (int)f2 - 20 - 768);
  }

  private static float j(float paramFloat, int paramInt) {
    return (float)(paramFloat * Math.pow(2.0D, paramInt));
  }
}