class aaN
{
  final int cPc;
  private final float[] cPd;
  private final qu cPe;
  private int[] cPf = new int[15];

  aaN(duz paramduz)
  {
    this.cPc = paramduz.cPc;
    this.cPd = paramduz.dah();

    this.cPe = qu.a(paramduz);
    if (this.cPe == null)
      clear();
  }

  int anz()
  {
    return this.cPe.aXE.length;
  }

  synchronized int a(float[] paramArrayOfFloat, int paramInt1, cf paramcf, int paramInt2)
  {
    int i = paramInt2 / this.cPc;

    if (this.cPf.length < i) {
      this.cPf = new int[i];
    }

    for (int j = 0; j < i; j++) {
      k = b(paramcf);
      if (k == -1)
        return -1;
      this.cPf[j] = (k * this.cPc);
    }
    j = 0; for (int k = 0; j < this.cPc; k += i) {
      for (int m = 0; m < i; m++)
        paramArrayOfFloat[(paramInt1 + k + m)] += this.cPd[(this.cPf[m] + j)];
      j++;
    }

    return 0;
  }

  int b(float[] paramArrayOfFloat, int paramInt1, cf paramcf, int paramInt2)
  {
    int i;
    int j;
    int k;
    int m;
    if (this.cPc > 8) {
      for (i = 0; i < paramInt2; ) {
        j = b(paramcf);
        if (j == -1)
          return -1;
        k = j * this.cPc;
        for (m = 0; m < this.cPc; )
          paramArrayOfFloat[(paramInt1 + i++)] += this.cPd[(k + m++)];
      }
    }
    else {
      for (i = 0; i < paramInt2; ) {
        j = b(paramcf);
        if (j == -1)
          return -1;
        k = j * this.cPc;
        m = 0;
        switch (this.cPc) {
        case 8:
          paramArrayOfFloat[(paramInt1 + i++)] += this.cPd[(k + m++)];
        case 7:
          paramArrayOfFloat[(paramInt1 + i++)] += this.cPd[(k + m++)];
        case 6:
          paramArrayOfFloat[(paramInt1 + i++)] += this.cPd[(k + m++)];
        case 5:
          paramArrayOfFloat[(paramInt1 + i++)] += this.cPd[(k + m++)];
        case 4:
          paramArrayOfFloat[(paramInt1 + i++)] += this.cPd[(k + m++)];
        case 3:
          paramArrayOfFloat[(paramInt1 + i++)] += this.cPd[(k + m++)];
        case 2:
          paramArrayOfFloat[(paramInt1 + i++)] += this.cPd[(k + m++)];
        case 1:
          paramArrayOfFloat[(paramInt1 + i++)] += this.cPd[(k + m++)];
        case 0:
        }
      }
    }

    return 0;
  }

  int c(float[] paramArrayOfFloat, int paramInt1, cf paramcf, int paramInt2) {
    for (int i = 0; i < paramInt2; ) {
      int j = b(paramcf);
      if (j == -1)
        return -1;
      k = j * this.cPc;
      for (m = 0; m < this.cPc; )
        paramArrayOfFloat[(paramInt1 + i++)] = this.cPd[(k + m++)];
    }
    int k;
    int m;
    return 0;
  }

  int a(float[][] paramArrayOfFloat, int paramInt1, int paramInt2, cf paramcf, int paramInt3) {
    int i = 0;

    for (int j = paramInt1 / paramInt2; j < (paramInt1 + paramInt3) / paramInt2; ) {
      int k = b(paramcf);
      if (k == -1) {
        return -1;
      }
      int m = k * this.cPc;
      for (int n = 0; n < this.cPc; n++) {
        paramArrayOfFloat[(i++)][j] += this.cPd[(m + n)];
        if (i == paramInt2) {
          i = 0;
          j++;
        }
      }
    }
    return 0;
  }

  int b(cf paramcf)
  {
    int i = 0;
    qu localqu = this.cPe;
    int j = paramcf.W(localqu.aXD);

    if (j >= 0) {
      i = localqu.aXB[j];
      paramcf.Y(localqu.aXC[j]);
      if (i <= 0) {
        return -i;
      }
    }
    do {
      switch (paramcf.fT()) {
      case 0:
        i = localqu.aXE[i];
        break;
      case 1:
        i = localqu.aXF[i];
        break;
      case -1:
      default:
        return -1;
      }
    }
    while (i > 0);
    return -i;
  }

  static void clear()
  {
  }

  private static int[] d(int[] paramArrayOfInt, int paramInt)
  {
    int[] arrayOfInt1 = new int[33];
    int[] arrayOfInt2 = new int[paramInt];
    int j;
    int k;
    for (int i = 0; i < paramInt; i++) {
      j = paramArrayOfInt[i];
      if (j > 0) {
        k = arrayOfInt1[j];

        if ((j < 32) && (k >>> j != 0))
        {
          return null;
        }
        arrayOfInt2[i] = k;

        for (int m = j; m > 0; m--) {
          if ((arrayOfInt1[m] & 0x1) != 0)
          {
            if (m == 1) {
              arrayOfInt1[1] += 1; break;
            }
            arrayOfInt1[m] = (arrayOfInt1[(m - 1)] << 1);
            break;
          }

          arrayOfInt1[m] += 1;
        }

        for (m = j + 1; (m < 33) && 
          (arrayOfInt1[m] >>> 1 == k); m++)
        {
          k = arrayOfInt1[m];
          arrayOfInt1[m] = (arrayOfInt1[(m - 1)] << 1);
        }

      }

    }

    for (i = 0; i < paramInt; i++) {
      j = 0;
      for (k = 0; k < paramArrayOfInt[i]; k++) {
        j <<= 1;
        j |= arrayOfInt2[i] >>> k & 0x1;
      }
      arrayOfInt2[i] = j;
    }

    return arrayOfInt2;
  }
}