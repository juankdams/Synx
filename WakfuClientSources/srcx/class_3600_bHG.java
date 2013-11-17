class bHG
{
  private static final float gGg = 3.141593F;

  static void a(float[] paramArrayOfFloat1, int[] paramArrayOfInt, int paramInt1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3, float paramFloat1, float paramFloat2)
  {
    float f1 = 3.141593F / paramInt2;
    for (int i = 0; i < paramInt3; i++)
      paramArrayOfFloat2[i] = atL.aD(paramArrayOfFloat2[i]);
    int j = paramInt3 / 2 * 2;

    i = 0;
    while (i < paramInt1) {
      int k = paramArrayOfInt[i];
      float f2 = 0.7071068F;
      float f3 = 0.7071068F;
      float f4 = atL.aD(f1 * k);

      for (int m = 0; m < j; m += 2) {
        f3 *= (paramArrayOfFloat2[m] - f4);
        f2 *= (paramArrayOfFloat2[(m + 1)] - f4);
      }

      if ((paramInt3 & 0x1) != 0)
      {
        f3 *= (paramArrayOfFloat2[(paramInt3 - 1)] - f4);
        f3 *= f3;
        f2 *= f2 * (1.0F - f4 * f4);
      }
      else {
        f3 *= f3 * (1.0F + f4);
        f2 *= f2 * (1.0F - f4);
      }

      f3 = f2 + f3;
      m = Float.floatToIntBits(f3);
      int n = 0x7FFFFFFF & m;
      int i1 = 0;

      if ((n < 2139095040) && (n != 0))
      {
        if (n < 8388608) {
          f3 = (float)(f3 * 33554432.0D);
          m = Float.floatToIntBits(f3);
          n = 0x7FFFFFFF & m;
          i1 = -25;
        }
        i1 += (n >>> 23) - 126;
        m = m & 0x807FFFFF | 0x3F000000;
        f3 = Float.intBitsToFloat(m);
      }

      f3 = atL.aF(paramFloat1 * atL.aE(f3) * atL.kn(i1 + paramInt3) - paramFloat2);
      do
      {
        paramArrayOfFloat1[(i++)] *= f3;
      }
      while ((i < paramInt1) && (paramArrayOfInt[i] == k));
    }
  }
}