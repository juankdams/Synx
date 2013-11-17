public final class aUp
{
  public static float K(float paramFloat1, float paramFloat2)
  {
    b(new double[] { paramFloat1, paramFloat2 });
    return paramFloat1 * paramFloat2;
  }

  public static float L(float paramFloat1, float paramFloat2)
  {
    b(new double[] { paramFloat1, paramFloat2 });
    return paramFloat1 + paramFloat2 - K(paramFloat1, paramFloat2);
  }

  public static float n(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    b(new double[] { paramFloat1, paramFloat2 });
    return paramFloat1 + paramFloat2 + paramFloat3 - K(paramFloat1, paramFloat2) - K(paramFloat1, paramFloat3) - K(paramFloat2, paramFloat3) + m(new float[] { paramFloat1, paramFloat2, paramFloat3 });
  }

  public static float m(float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat.length == 0)
      return 0.0F;
    double d1 = paramArrayOfFloat[0];
    for (int i = 1; i < paramArrayOfFloat.length; i++) {
      double d2 = paramArrayOfFloat[i];
      b(new double[] { d2 });
      d1 *= d2;
    }
    return (float)d1;
  }

  private static void b(double[] paramArrayOfDouble) {
    for (int i = 0; i < paramArrayOfDouble.length; i++) {
      if (paramArrayOfDouble[i] < 0.0D)
        throw new IllegalArgumentException("a < 0.0f");
      if (paramArrayOfDouble[i] > 1.0D)
        throw new IllegalArgumentException("a > 1,0f");
    }
  }
}