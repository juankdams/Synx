public abstract class P
{
  public static boolean aX = false;

  public abstract String getFontName();

  public abstract int aq();

  public abstract hf getFont();

  public abstract hf a(int paramInt, float paramFloat);

  public abstract int a(char paramChar);

  public abstract int b(char paramChar);

  public abstract int c(char paramChar);

  public abstract int ar();

  public abstract int as();

  public abstract int b(String paramString, int paramInt1, int paramInt2);

  public abstract int f(String paramString);

  public abstract int g(String paramString);

  public abstract int h(String paramString);

  public abstract boolean at();

  public abstract void setColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4);

  public abstract void beginRendering(int paramInt1, int paramInt2);

  public abstract void a(char[] paramArrayOfChar, float paramFloat1, float paramFloat2);

  public abstract void a(char[] paramArrayOfChar, float paramFloat1, float paramFloat2, float paramFloat3);

  public abstract void a(char[] paramArrayOfChar, float paramFloat1, int paramInt, float paramFloat2, float paramFloat3);

  public abstract void a(char[] paramArrayOfChar, float paramFloat1, int paramInt, float paramFloat2, float paramFloat3, float paramFloat4);

  public abstract void endRendering();

  public abstract void begin3DRendering();

  public abstract void end3DRendering();

  public int a(String paramString, int paramInt)
  {
    return a(paramString, paramInt, true);
  }

  public int a(String paramString, int paramInt, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = paramString.length();
    while (j < m) {
      while (j < m) {
        k++;
        n = paramString.charAt(j++);

        int i1 = 1;
        if (j < m) {
          int i2 = paramString.charAt(j);
          if ((i2 == 46) || (i2 == 63) || (i2 == 33) || (i2 == 58) || (i2 == 59) || (i2 == 44))
            i1 = 0;
        }
        if (((n == 32) || (n == 10) || (n == 9)) && (i1 != 0))
        {
          break;
        }
      }
      if (k == 0) {
        k++;
      }
      int n = b(paramString, k, paramInt);
      if (n < k) {
        if (i != 0)
        {
          return i;
        }
        if ((aX) || (paramBoolean))
        {
          return n;
        }
        return 0;
      }

      i = k;
    }
    return m;
  }
}