public final class aPE
{
  public static final int eMo = 167;
  public static final int eMp = 168;
  public static final int eMq = 169;
  public static final int eMr = 170;
  public static final int eMs = 1;
  public static final adz eMt = new adz();

  public static boolean a(dhJ paramdhJ, int paramInt, short paramShort)
  {
    dSr localdSr = paramdhJ.bGQ();
    if (localdSr == null)
      return false;
    bWG localbWG = localdSr.bq((short)paramInt);
    if (localbWG == null)
      return false;
    TY localTY = new TY();
    if (!eMt.contains(paramInt)) {
      return false;
    }
    eMt.g(new ckg(paramInt, localdSr, paramShort, localTY));

    return localTY.getValue() > 0;
  }

  static
  {
    eMt.hL(167);
    eMt.hL(168);
    eMt.hL(169);
    eMt.hL(170);
  }
}