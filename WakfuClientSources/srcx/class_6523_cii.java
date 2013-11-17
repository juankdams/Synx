public class cii
{
  public static String h(String paramString1, String paramString2, String paramString3)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1).append('.').append(paramString2).append('.').append(paramString3);
    return localStringBuilder.toString();
  }

  public static String L(float[] paramArrayOfFloat) {
    int i = (int)(paramArrayOfFloat[0] * 255.0F);
    int j = (int)(paramArrayOfFloat[1] * 255.0F);
    int k = (int)(paramArrayOfFloat[2] * 255.0F);
    StringBuilder localStringBuilder = new StringBuilder();
    if (i < 16) {
      localStringBuilder.append('0');
    }
    localStringBuilder.append(Integer.toHexString(i));
    if (j < 16) {
      localStringBuilder.append('0');
    }
    localStringBuilder.append(Integer.toHexString(j));
    if (k < 16) {
      localStringBuilder.append('0');
    }
    localStringBuilder.append(Integer.toHexString(k));

    return localStringBuilder.toString();
  }

  public static void t(dOc paramdOc) {
    int i = (int)(cBQ.cxL().cxS().MH() - paramdOc.getWidth());
    int j = (int)(cBQ.cxL().cxS().MI() - paramdOc.getHeight());

    int k = bCO.J(paramdOc.getX(), 0, i);
    int m = bCO.J(paramdOc.getY(), 0, j);
    paramdOc.setPosition(k, m);
  }
}