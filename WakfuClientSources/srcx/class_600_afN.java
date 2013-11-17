public class afN
{
  public static boolean aX(int paramInt1, int paramInt2)
  {
    return (paramInt1 & paramInt2) > 0;
  }

  public static int aY(int paramInt1, int paramInt2)
  {
    return paramInt1 & -1 - paramInt2;
  }

  public static int eh(String paramString)
  {
    int i = 0;
    if (paramString != null) {
      i = b(paramString.indexOf('i') == -1, paramString.indexOf('m') != -1, paramString.indexOf('s') != -1);

      if (paramString.indexOf('g') != -1) {
        i |= 16;
      }
    }
    return i;
  }

  public static int bW(boolean paramBoolean)
  {
    return b(paramBoolean, false, false);
  }

  public static int b(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int i = 0;
    if (!paramBoolean1) {
      i |= 256;
    }
    if (paramBoolean2) {
      i |= 4096;
    }
    if (paramBoolean3) {
      i |= 65536;
    }
    return i;
  }
}