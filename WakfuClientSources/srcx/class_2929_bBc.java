import java.util.Arrays;

public enum bBc
{
  public static final int gtm = 32;
  public static final int[] gtn;
  public static final int[] gto;
  private final short aDx;
  private final short[] gtp;

  private bBc(int arg3, short[] arg4)
  {
    this((short)i, arrayOfShort);
  }

  private bBc(short arg3, short[] arg4)
  {
    short s;
    this.aDx = s;
    Object localObject;
    this.gtp = localObject;
  }

  public short nc() {
    return this.aDx;
  }

  private static short bJM() {
    short s = 0;
    for (bBc localbBc : values()) {
      if (localbBc.nc() > s)
        s = localbBc.nc();
    }
    return s;
  }

  public static int bJN() {
    return (int)Math.ceil(bJM() / 32.0F);
  }

  public boolean ci(short paramShort) {
    for (short s : this.gtp)
      if (s == paramShort)
        return true;
    return false;
  }

  public static void a(int[] paramArrayOfInt, short paramShort) {
    paramArrayOfInt[(paramShort / 32)] |= 1 << paramShort % 32;
  }

  public static void a(int[] paramArrayOfInt, bBc parambBc) {
    a(paramArrayOfInt, parambBc.nc());
  }

  public static boolean f(int[] paramArrayOfInt1, int[] paramArrayOfInt2) {
    return Arrays.equals(paramArrayOfInt1, paramArrayOfInt2);
  }

  public static boolean b(int[] paramArrayOfInt, bBc parambBc) {
    return b(paramArrayOfInt, parambBc.nc());
  }

  public static boolean b(int[] paramArrayOfInt, short paramShort) {
    return (paramArrayOfInt[(paramShort / 32)] & 1 << paramShort % 32) != 0;
  }

  public static bBc cj(short paramShort) {
    for (bBc localbBc : values()) {
      for (short s : localbBc.gtp)
        if (s == paramShort)
          return localbBc;
    }
    return null;
  }

  static
  {
    gtn = new int[bJN()];
    gto = new int[bJN()];

    for (bBc localbBc : values())
      a(gtn, localbBc);
  }
}