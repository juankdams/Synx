public class dxA
{
  public static final int lDP = -4;
  public static final int lDQ = -10;
  public static final int lDR = 8;
  public static final int lDS = 11;
  public static final int lDT = 56401;
  public static final cYk lDU = new cYk(0, -52, (short)0);
  public static final short lDV = 159;
  public static final cYk lDW = new cYk(-1, -52, (short)0);
  public static final int lDX = 19119;
  public static final cYk lDY = new cYk(0, -42, (short)0);
  public static final int lDZ = 19198;
  public static final short lEa = 161;
  public static final int[] lEb = { 0, -33, 0 };
  public static final int[] lEc = { 0, -50, 0 };
  public static final int lEd = 16530;
  public static final cYk lEe = new cYk(0, -32, (short)0);
  public static final short lEf = 226;
  public static final int lEg = 50000000;
  private static final int lEh = 12;
  private static final int lEi = 13;
  private static final int lEj = 14;
  private static final int lEk = 15;
  public static final int lEl = 20;
  public static final adz lEm = new adz(new int[] { 11, 21, 14 });

  private static final cSR lEn = new cSR();
  public static final byte lEo = 0;
  public static final byte lEp = 1;
  public static final byte lEq = 2;
  public static final byte lEr = 3;
  private static final int lEs = 7;
  private static final int lEt = 18;

  public static boolean BU(int paramInt)
  {
    return paramInt == 311;
  }

  public static boolean ev(short paramShort) {
    return (paramShort == 7) || (paramShort == 23) || (paramShort == 22) || (paramShort == 20);
  }

  public static boolean eY(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = (int[])lEn.get(paramInt1);
    return aUP.c(arrayOfInt, paramInt2);
  }

  public static byte i(bOB parambOB)
  {
    if (parambOB.aTC()) {
      return 2;
    }
    if (parambOB.aTz() == 7) {
      return 0;
    }
    if (parambOB.aTz() == 18) {
      return 3;
    }
    return 1;
  }

  static
  {
    lEn.put(12, new int[] { 12 });
    lEn.put(13, new int[] { 12, 13 });
    lEn.put(14, new int[] { 12, 13, 14 });
    lEn.put(15, new int[] { 12, 13, 14, 15 });
  }
}