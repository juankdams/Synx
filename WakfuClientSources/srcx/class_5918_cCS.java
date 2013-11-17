import java.util.ArrayList;

 enum cCS
{
  cCS()
  {
    super(str, i, null);
  }
  public float a(float paramFloat1, ArrayList paramArrayList, boolean paramBoolean, float paramFloat2, float paramFloat3, int paramInt) {
    float f = (paramBoolean ? paramFloat2 : paramFloat3) - paramInt;
    int i = Math.max(1, (int)Math.floor(paramBoolean ? paramFloat3 : paramFloat2));
    if ((paramArrayList != null) && (paramArrayList.size() / i < f))
      return 0.0F;
    if (((paramArrayList != null) && ((int)Math.ceil(paramArrayList.size() / i) - paramFloat1 < f)) || (paramFloat1 < 0.0F)) {
      return (float)Math.ceil(paramArrayList.size() / i) - f;
    }

    return paramFloat1;
  }

  public void a(axU paramaxU, ArrayList paramArrayList, int paramInt) {
    if ((paramArrayList != null) && (paramInt >= 0) && (paramInt < paramArrayList.size()))
    {
      paramaxU.setContent(paramArrayList.get(paramInt));
    }
    else paramaxU.setContent(null);
  }
}