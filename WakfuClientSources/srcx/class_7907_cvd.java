public class cvd
{
  private static int ifM = 0;

  public static int ctc() {
    ifM += 1;
    if (ifM < 0)
      ifM = 0;
    return ifM;
  }
}