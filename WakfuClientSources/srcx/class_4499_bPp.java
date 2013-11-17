public class bPp extends dRK
{
  private static final bPp gVZ = new bPp();
  private static final String cgf = "debugDisplayer";

  public static bPp bVT()
  {
    return gVZ;
  }

  private bPp()
  {
    super("debugDisplayer", clP.hOU);
  }

  public void a(int paramInt, int[][] paramArrayOfInt) {
    clear();

    for (int i = 0; i < paramInt; i++) {
      int[] arrayOfInt = paramArrayOfInt[i];
      Q(arrayOfInt[0], arrayOfInt[1], (short)arrayOfInt[2]);
    }
  }
}