public enum dLw
{
  private final byte dce;
  public static final int mbp;
  public static final int mbq = 15;
  public static final int mbr = 32767;
  public static final int mbs = 32766;
  private static final int mbt = 5;
  private static final int mbu = 13;
  private static final long mbv = 8191L;
  private static final int mbw = 6;
  private static final int mbx = 14;
  private static final long eVR = 16383L;
  private static final long eVT = 8192L;
  private static final int mby = 19;
  private static final int mbz = 34;

  private dLw()
  {
    this.dce = ((byte)ordinal());
  }

  public final byte asR() {
    return this.dce;
  }

  public static int CR(int paramInt) {
    return paramInt;
  }

  public static boolean kH(long paramLong)
  {
    long l = 281474976710656L;
    return (paramLong >= 0L) && (paramLong < 281474976710656L);
  }

  public static long a(long paramLong1, long paramLong2, int paramInt1, int paramInt2)
  {
    if ((!bB) && (Math.abs(paramLong1) >= 16383L)) throw new AssertionError();
    if ((!bB) && (Math.abs(paramLong2) >= 16383L)) throw new AssertionError();
    if ((!bB) && ((paramInt1 < 0) || (paramInt1 >= 8191L))) throw new AssertionError();
    if ((!bB) && ((paramInt2 < 0) || (paramInt2 >= 31))) throw new AssertionError();
    return (paramLong2 + 8192L & 0x3FFF) << 34 | (paramLong1 + 8192L & 0x3FFF) << 19 | (paramInt1 & 0x1FFF) << 6 | paramInt2;
  }

  static
  {
    mbc = new dLw("GROUND", 0);
    mbd = new dLw("HIGHTLIGHT", 1);
    mbe = new dLw("IE", 2);
    mbf = new dLw("RESOURCE_SMALL", 3);
    mbg = new dLw("DEAD_NPC", 4);
    mbh = new dLw("OBJECT_LOOTED", 5);
    mbi = new dLw("APS", 6);
    mbj = new dLw("EFFECT_AREA_IE", 7);
    mbk = new dLw("DYNAMIC_ELEMENT", 8);
    mbl = new dLw("MOBILE", 9);
    mbm = new dLw("PLAYER", 10);
    mbn = new dLw("RESOURCE_HIGH", 11);
    mbo = new dLw("APS_FRONT", 12);

    mbA = new dLw[] { mbc, mbd, mbe, mbf, mbg, mbh, mbi, mbj, mbk, mbl, mbm, mbn, mbo };

    mbp = values().length;

    if ((!bB) && (mbp >= 8191)) throw new AssertionError();
  }
}