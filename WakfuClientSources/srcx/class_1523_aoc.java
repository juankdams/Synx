public final class aoc
{
  private static final int dsB = 80;
  private static final bnQ dsC = new bnQ(80);

  static void a(cfb paramcfb, brS[] paramArrayOfbrS)
  {
    bDg localbDg = new bDg();
    for (int i = 0; i < paramArrayOfbrS.length; i++) {
      brS localbrS = paramArrayOfbrS[i];
      localbDg.a(localbrS.aTz, localbrS.dYr, localbrS.bFC, localbrS.fNV);
    }
    acs.aoN().a(localbDg);
    long l = bCO.cM(paramcfb.getX(), paramcfb.getY());
    dsC.put(Long.valueOf(l), localbDg);
  }

  static void b(cfb paramcfb, brS[] paramArrayOfbrS)
  {
    for (int i = 0; i < paramArrayOfbrS.length; i++) {
      brS localbrS = paramArrayOfbrS[i];
      if (localbrS.cTI) {
        cMb localcMb = cMb.a(localbrS.aTz, null);
        paramcfb.g(localcMb);
      }
    }
  }

  public static void bh(int paramInt1, int paramInt2)
  {
    long l = bCO.cM(paramInt1, paramInt2);
    bDg localbDg = (bDg)dsC.get(Long.valueOf(l));
    if (localbDg != null)
      acs.aoN().b(localbDg);
  }
}