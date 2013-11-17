import java.util.ArrayList;

 enum cCQ
{
  cCQ()
  {
    super(str, i, null);
  }
  public void a(axU paramaxU, ArrayList paramArrayList, int paramInt) { if ((paramArrayList == null) || (paramArrayList.size() == 0)) {
      paramaxU.setContent(null);
      return;
    }
    paramInt = (paramInt % paramArrayList.size() + paramArrayList.size()) % paramArrayList.size();
    paramaxU.setContent(paramArrayList.get(paramInt));
  }

  public float a(float paramFloat1, ArrayList paramArrayList, boolean paramBoolean, float paramFloat2, float paramFloat3, int paramInt)
  {
    return paramFloat1;
  }
}