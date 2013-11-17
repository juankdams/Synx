 enum bge
{
  bge()
  {
    super(str, i, null);
  }
  public float d(float paramFloat1, float paramFloat2, float paramFloat3) { float f1 = paramFloat3 * 3.141593F;
    float f2 = (1.0F - (float)Math.cos(f1)) * 0.5F;
    return paramFloat1 * (1.0F - f2) + paramFloat2 * f2;
  }
}