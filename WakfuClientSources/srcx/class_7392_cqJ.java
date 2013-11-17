public final class cqJ
{
  public static int a(cDW paramcDW1, cDW paramcDW2)
  {
    return Math.max(0, c(paramcDW1, paramcDW2) - 1);
  }

  public static int b(cDW paramcDW1, cDW paramcDW2)
  {
    return Math.abs(paramcDW1.fa() - paramcDW2.fa()) + Math.abs(paramcDW1.fb() - paramcDW2.fb());
  }

  public static int c(cDW paramcDW1, cDW paramcDW2)
  {
    int i = paramcDW1.afD() + paramcDW2.afD();
    int j = Math.max(0, Math.abs(paramcDW1.fa() - paramcDW2.fa()) - i);
    int k = Math.max(0, Math.abs(paramcDW1.fb() - paramcDW2.fb()) - i);
    return j + k;
  }

  public static int a(cDW paramcDW, cYk paramcYk)
  {
    return Math.max(0, c(paramcDW, paramcYk) - 1);
  }

  public static int b(cDW paramcDW, cYk paramcYk)
  {
    return Math.abs(paramcDW.fa() - paramcYk.getX()) + Math.abs(paramcDW.fb() - paramcYk.getY());
  }

  public static int c(cDW paramcDW, cYk paramcYk)
  {
    int i = Math.max(0, Math.abs(paramcDW.fa() - paramcYk.getX()) - paramcDW.afD());
    int j = Math.max(0, Math.abs(paramcDW.fb() - paramcYk.getY()) - paramcDW.afD());
    return i + j;
  }

  public static int a(cDW paramcDW, int paramInt1, int paramInt2)
  {
    int i = Math.max(0, Math.abs(paramcDW.fa() - paramInt1) - paramcDW.afD());
    int j = Math.max(0, Math.abs(paramcDW.fb() - paramInt2) - paramcDW.afD());
    return i + j;
  }
}