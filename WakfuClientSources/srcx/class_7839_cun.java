public class cun
{
  public static final int ieN = 3700;
  public static final int ieO = 408;
  public static final int ieP = 467;
  private static final int[] ieQ = { 480, 479, 478, 467 };
  private static final int[] ieR = { 510, 509, 508, 507 };
  private static final int[] ieS = { 840, 839, 838, 837 };
  private static final int[] ieT = { 836, 835, 834, 833 };

  private static final adz ieU = new adz();
  private static int ie = 2147483647;

  public static boolean dK(int paramInt1, int paramInt2) {
    if (ie != paramInt1) {
      ie = paramInt1;
      ieU.clear();
      csL();
    }

    return !ieU.contains(paramInt2);
  }

  private static void csL() {
    if (ie != 30)
      ieU.n(ieQ);
    if (ie != 31)
      ieU.n(ieR);
    if (ie != 32)
      ieU.n(ieS);
    if (ie != 33)
      ieU.n(ieT);
  }
}