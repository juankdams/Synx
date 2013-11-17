import org.apache.log4j.Logger;

public final class aGG
{
  private static final Logger K = Logger.getLogger(aGG.class);

  private static float bB(int paramInt1, int paramInt2)
  {
    int i = paramInt1 + paramInt2 * 57;
    i = i << 13 ^ i;
    return 1.0F - (i * (i * i * 15731 + 789221) + 1376312589 & 0x7FFFFFFF) / 1.073742E+009F;
  }

  private static float bC(int paramInt1, int paramInt2) {
    float f1 = (bB(paramInt1 - 1, paramInt2 - 1) + bB(paramInt1 + 1, paramInt2 - 1) + bB(paramInt1 - 1, paramInt2 + 1) + bB(paramInt1 + 1, paramInt2 + 1)) / 16.0F;
    float f2 = (bB(paramInt1 - 1, paramInt2) + bB(paramInt1 + 1, paramInt2) + bB(paramInt1, paramInt2 + 1) + bB(paramInt1, paramInt2 - 1)) / 8.0F;
    float f3 = bB(paramInt1, paramInt2) / 4.0F + f1 + f2;
    return f3;
  }

  private static float a(float paramFloat1, float paramFloat2, bDT parambDT) {
    int i = paramFloat1 < 0.0F ? (int)(paramFloat1 - 1.0F) : (int)paramFloat1;
    int j = paramFloat2 < 0.0F ? (int)(paramFloat2 - 1.0F) : (int)paramFloat2;
    float f1 = paramFloat1 - i;
    float f2 = paramFloat2 - j;

    float f3 = bC(i, j);
    float f4 = bC(i + 1, j);
    float f5 = bC(i, j + 1);
    float f6 = bC(i + 1, j + 1);

    float f7 = parambDT.d(f3, f4, f1);
    float f8 = parambDT.d(f5, f6, f1);

    return parambDT.d(f7, f8, f2);
  }

  public static float a(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, bDT parambDT) {
    float f1 = 0.0F;
    float f2 = 1.0F;
    float f3 = 1.0F;
    for (int i = 0; i < paramInt - 1; i++) {
      f1 += a(paramFloat1 * f2, paramFloat2 * f2, parambDT) * f3;
      f2 *= 2.0F;
      f3 *= paramFloat3;
    }
    return f1;
  }

  public static void a(float[] paramArrayOfFloat, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3, int paramInt4, float paramFloat3, int paramInt5, amr paramamr)
  {
    blp localblp = paramamr != null ? paramamr : blp.fCm;

    for (int i = 0; i < paramInt2; i++) {
      float f1 = (i + paramInt4) * paramFloat2 / paramInt2;
      for (int j = 0; j < paramInt1; j++) {
        float f2 = (j + paramInt3) * paramFloat1 / paramInt1;
        float f3 = a(f2, f1, paramFloat3, paramInt5, localblp.WE());
        paramArrayOfFloat[(j + i * paramInt1)] = localblp.d(f2, f1, f3);
      }
    }
  }
}