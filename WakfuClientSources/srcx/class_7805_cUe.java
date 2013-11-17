class cUe
{
  private static final DJ kGr = new DJ();
  private static final int kGs = 1;
  private static final int kGt = 2;
  private static final int kGu = 4;
  private static final int LEFT = 8;
  private static final int RIGHT = 16;
  private static final int kGv = 32;
  private static final int kGw = 64;
  private static final int kGx = 128;

  public static short ze(int paramInt)
  {
    if (!kGr.contains(paramInt))
      return bnp.cu(1, 0);
    return kGr.get(paramInt);
  }

  public static short b(short[][] paramArrayOfShort, int paramInt1, int paramInt2) {
    int i = 0;
    i |= (c(paramArrayOfShort, paramInt1 - 1, paramInt2 - 1) ? 0 : 1);
    i |= (c(paramArrayOfShort, paramInt1 + 0, paramInt2 - 1) ? 0 : 2);
    i |= (c(paramArrayOfShort, paramInt1 + 1, paramInt2 - 1) ? 0 : 4);

    i |= (c(paramArrayOfShort, paramInt1 - 1, paramInt2 + 0) ? 0 : 8);
    i |= (c(paramArrayOfShort, paramInt1 + 1, paramInt2 + 0) ? 0 : 16);

    i |= (c(paramArrayOfShort, paramInt1 - 1, paramInt2 + 1) ? 0 : 32);
    i |= (c(paramArrayOfShort, paramInt1 + 0, paramInt2 + 1) ? 0 : 64);
    i |= (c(paramArrayOfShort, paramInt1 + 1, paramInt2 + 1) ? 0 : 128);

    return ze(i);
  }

  public static boolean c(short[][] paramArrayOfShort, int paramInt1, int paramInt2) {
    if ((paramInt1 < 0) || (paramInt1 >= paramArrayOfShort.length))
      return true;
    if ((paramInt2 < 0) || (paramInt2 >= paramArrayOfShort[paramInt1].length))
      return true;
    return paramArrayOfShort[paramInt1][paramInt2] == bnp.fGg;
  }

  private static boolean d(short[][] paramArrayOfShort, int paramInt1, int paramInt2) {
    return (c(paramArrayOfShort, paramInt1, paramInt2)) || (bnp.qn(paramArrayOfShort[paramInt1][paramInt2]).getX() == 2);
  }

  private static void b(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    short s = bnp.cu(1, paramInt1);

    kGr.i(paramInt2, s);

    for (int k : paramArrayOfInt) {
      b(paramInt1, paramInt2 | k, new int[0]);
      b(paramInt1, paramInt2 | k, m(paramArrayOfInt, k));
    }
  }

  private static int[] m(int[] paramArrayOfInt, int paramInt)
  {
    int[] arrayOfInt = new int[paramArrayOfInt.length - 1];
    int i = 0;
    for (int j = 0; j < paramArrayOfInt.length; j++) {
      if (paramArrayOfInt[j] != paramInt)
        arrayOfInt[(i++)] = paramArrayOfInt[j];
    }
    return arrayOfInt;
  }

  static
  {
    int[] arrayOfInt1 = { 1, 32, 4, 128 };
    int[] arrayOfInt2 = { 32, 4, 128 };

    b(1, 0, arrayOfInt1);
    b(2, 16, arrayOfInt1);
    b(3, 64, arrayOfInt1);

    b(4, 9, arrayOfInt1);
    b(5, 8, arrayOfInt2);

    b(6, 3, arrayOfInt1);
    b(7, 2, arrayOfInt2);

    b(8, 19, arrayOfInt1);
    b(9, 18, arrayOfInt2);

    b(10, 10, arrayOfInt1);

    b(11, 73, arrayOfInt1);
    b(12, 72, arrayOfInt2);

    b(13, 80, arrayOfInt1);
    b(14, 74, arrayOfInt1);
    b(15, 26, arrayOfInt1);

    b(16, 83, arrayOfInt1);
    b(17, 82, arrayOfInt2);

    b(18, 89, arrayOfInt1);
    b(19, 88, arrayOfInt2);

    b(20, 25, arrayOfInt1);
    b(21, 24, arrayOfInt2);

    b(22, 67, arrayOfInt1);
    b(23, 66, arrayOfInt2);

    b(24, 90, arrayOfInt1);

    b(25, 17, arrayOfInt2);
    b(26, 65, arrayOfInt2);
    b(27, 1, arrayOfInt2);
  }
}