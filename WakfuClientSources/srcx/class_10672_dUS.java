public enum dUS
{
  public static dUS a(float paramFloat, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramFloat < paramInt1)
      return msV;
    if (paramFloat < paramInt2)
      return msW;
    if (paramFloat < paramInt3)
      return msX;
    if (paramFloat < paramInt4) {
      return msY;
    }
    return msZ;
  }
}