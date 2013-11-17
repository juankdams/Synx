class cEm
{
  private static final cEm ixQ = new cEm(0);
  private static final cEm ixR = new cEm(256);
  private static final cEm ixS = new cEm(2048);
  private final int n;
  private final int ixT;
  private final float[] ixU;
  private final int[] ixV;
  private final float[] ixW;
  private final float[] ixX;

  private cEm(int paramInt)
  {
    this.ixV = new int[paramInt / 4];
    this.ixU = new float[paramInt + paramInt / 4];

    this.ixT = ((int)Math.rint(Math.log(paramInt) / Math.log(2.0D)));
    this.n = paramInt;

    this.ixW = new float[this.n / 2];
    this.ixX = new float[this.n / 2];

    int i = 0;
    int j = 1;
    int k = 0 + paramInt / 2;
    int m = k + 1;
    int i1 = k + paramInt / 2;
    int i2 = i1 + 1;

    for (int i3 = 0; i3 < paramInt / 4; i3++) {
      this.ixU[(0 + i3 * 2)] = ((float)Math.cos(3.141592653589793D / paramInt * (4 * i3)));
      this.ixU[(1 + i3 * 2)] = ((float)-Math.sin(3.141592653589793D / paramInt * (4 * i3)));
      this.ixU[(k + i3 * 2)] = ((float)Math.cos(3.141592653589793D / (2 * paramInt) * (2 * i3 + 1)));
      this.ixU[(m + i3 * 2)] = ((float)Math.sin(3.141592653589793D / (2 * paramInt) * (2 * i3 + 1)));
    }
    for (i3 = 0; i3 < paramInt / 8; i3++) {
      this.ixU[(i1 + i3 * 2)] = ((float)Math.cos(3.141592653589793D / paramInt * (4 * i3 + 2)));
      this.ixU[(i2 + i3 * 2)] = ((float)-Math.sin(3.141592653589793D / paramInt * (4 * i3 + 2)));
    }

    i3 = (1 << this.ixT - 1) - 1;
    int i4 = 1 << this.ixT - 2;
    for (int i5 = 0; i5 < paramInt / 8; i5++) {
      int i6 = 0;
      for (int i7 = 0; i4 >>> i7 != 0; i7++)
        if ((i4 >>> i7 & i5) != 0)
          i6 |= 1 << i7;
      this.ixV[(i5 * 2)] = ((i6 ^ 0xFFFFFFFF) & i3);

      this.ixV[(i5 * 2 + 1)] = i6;
    }
  }

  public static cEm xA(int paramInt)
  {
    if (paramInt == 256)
      return ixR;
    if (paramInt == 2048)
      return ixS;
    if (paramInt == 0)
      return ixQ;
    return new cEm(paramInt);
  }

  synchronized void e(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    float[] arrayOfFloat1 = this.ixW;
    float[] arrayOfFloat2 = this.ixX;
    int i = this.n >>> 1;
    int j = this.n >>> 2;
    int k = this.n >>> 3;

    int m = 1;
    int i1 = 0;
    int i2 = i;

    for (int i3 = 0; i3 < k; i3++) {
      i2 -= 2;
      arrayOfFloat1[(i1++)] = (-paramArrayOfFloat1[(m + 2)] * this.ixU[(i2 + 1)] - paramArrayOfFloat1[m] * this.ixU[i2]);
      arrayOfFloat1[(i1++)] = (paramArrayOfFloat1[m] * this.ixU[(i2 + 1)] - paramArrayOfFloat1[(m + 2)] * this.ixU[i2]);
      m += 4;
    }

    m = i - 4;

    for (i3 = 0; i3 < k; i3++) {
      i2 -= 2;
      arrayOfFloat1[(i1++)] = (paramArrayOfFloat1[m] * this.ixU[(i2 + 1)] + paramArrayOfFloat1[(m + 2)] * this.ixU[i2]);
      arrayOfFloat1[(i1++)] = (paramArrayOfFloat1[m] * this.ixU[i2] - paramArrayOfFloat1[(m + 2)] * this.ixU[(i2 + 1)]);
      m -= 4;
    }

    float[] arrayOfFloat3 = a(arrayOfFloat1, arrayOfFloat2, this.n, i, j, k);
    i1 = 0;

    i2 = i;
    i3 = j; int i4 = i3 - 1;
    int i5 = j + i; int i6 = i5 - 1;

    for (int i7 = 0; i7 < j; i7++) {
      float f1 = arrayOfFloat3[i1] * this.ixU[(i2 + 1)] - arrayOfFloat3[(i1 + 1)] * this.ixU[i2];
      float f2 = -(arrayOfFloat3[i1] * this.ixU[i2] + arrayOfFloat3[(i1 + 1)] * this.ixU[(i2 + 1)]);

      paramArrayOfFloat2[i3] = (-f1);
      paramArrayOfFloat2[i4] = f1;
      paramArrayOfFloat2[i5] = f2;
      paramArrayOfFloat2[i6] = f2;

      i3++;
      i4--;
      i5++;
      i6--;
      i1 += 2;
      i2 += 2;
    }
  }

  private float[] a(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt3;
    int j = 0;
    int k = paramInt3;
    int m = paramInt2;

    for (int i1 = 0; i1 < paramInt3; ) {
      float f1 = paramArrayOfFloat1[i] - paramArrayOfFloat1[j];

      paramArrayOfFloat2[(k + i1)] = (paramArrayOfFloat1[(i++)] + paramArrayOfFloat1[(j++)]);

      float f2 = paramArrayOfFloat1[i] - paramArrayOfFloat1[j];
      m -= 4;

      paramArrayOfFloat2[(i1++)] = (f1 * this.ixU[m] + f2 * this.ixU[(m + 1)]);
      paramArrayOfFloat2[i1] = (f2 * this.ixU[m] - f1 * this.ixU[(m + 1)]);

      paramArrayOfFloat2[(k + i1)] = (paramArrayOfFloat1[(i++)] + paramArrayOfFloat1[(j++)]);
      i1++;
    }
    int i6;
    int i7;
    float f3;
    float f5;
    float f6;
    float f4;
    for (i1 = 0; i1 < this.ixT - 3; i1++) {
      i2 = paramInt1 >>> i1 + 2;
      i3 = 1 << i1 + 3;
      i4 = paramInt2 - 2;

      m = 0;

      for (i6 = 0; i6 < i2 >>> 2; i6++) {
        i7 = i4;
        k = i7 - (i2 >> 1);
        f3 = this.ixU[m];

        f5 = this.ixU[(m + 1)];

        i4 -= 2;

        i2++;
        for (int i8 = 0; i8 < 2 << i1; i8++) {
          f6 = paramArrayOfFloat2[i7] - paramArrayOfFloat2[k];
          paramArrayOfFloat2[i7] += paramArrayOfFloat2[k];

          f4 = paramArrayOfFloat2[(++i7)] - paramArrayOfFloat2[(++k)];
          paramArrayOfFloat2[i7] += paramArrayOfFloat2[k];

          paramArrayOfFloat1[k] = (f4 * f3 - f6 * f5);
          paramArrayOfFloat1[(k - 1)] = (f6 * f3 + f4 * f5);

          i7 -= i2;
          k -= i2;
        }
        i2--;
        m += i3;
      }

      float[] arrayOfFloat = paramArrayOfFloat2;
      paramArrayOfFloat2 = paramArrayOfFloat1;
      paramArrayOfFloat1 = arrayOfFloat;
    }

    i1 = paramInt1;
    int i2 = 0;
    int i3 = 0;
    int i4 = paramInt2 - 1;

    for (int i5 = 0; i5 < paramInt4; i5++) {
      i6 = this.ixV[(i2++)];
      i7 = this.ixV[(i2++)];

      f3 = paramArrayOfFloat2[i6] - paramArrayOfFloat2[(i7 + 1)];
      f4 = paramArrayOfFloat2[(i6 - 1)] + paramArrayOfFloat2[i7];
      f5 = paramArrayOfFloat2[i6] + paramArrayOfFloat2[(i7 + 1)];
      f6 = paramArrayOfFloat2[(i6 - 1)] - paramArrayOfFloat2[i7];

      float f7 = f3 * this.ixU[i1];
      float f8 = f4 * this.ixU[(i1++)];
      float f9 = f3 * this.ixU[i1];
      float f10 = f4 * this.ixU[(i1++)];

      paramArrayOfFloat1[(i3++)] = ((f5 + f9 + f8) * 0.5F);
      paramArrayOfFloat1[(i4--)] = ((-f6 + f10 - f7) * 0.5F);
      paramArrayOfFloat1[(i3++)] = ((f6 + f10 - f7) * 0.5F);
      paramArrayOfFloat1[(i4--)] = ((f5 - f9 - f8) * 0.5F);
    }

    return paramArrayOfFloat1;
  }
}