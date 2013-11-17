public class xc
{
  public static final int bpb = 1000000;
  public static final int bpc = 990000;

  public static int dv(int paramInt)
  {
    return paramInt % 10;
  }

  public static int dw(int paramInt) {
    return paramInt / 10;
  }

  public static boolean dx(int paramInt)
  {
    return paramInt >= 1000000;
  }

  public static boolean dy(int paramInt) {
    return (paramInt >= 990000) && (!dx(paramInt));
  }

  public static cew a(dPl paramdPl) {
    chp localchp = new chp();

    localchp.c(aQC.bhe().nx(paramdPl.uO()).aii());
    localchp.cO(paramdPl.xK());
    cvN localcvN = paramdPl.dqu();
    localchp.a(localcvN.bRJ(), localcvN.bRK(), true);
    localchp.b(localcvN.bRO(), localcvN.bRP(), true);
    localchp.m(localcvN.bRM(), true);
    localchp.aei();
    localchp.e(localcvN.afn(), true);
    localchp.f(localcvN.afo(), true);
    localchp.aej();
    bBn localbBn1 = Hh.QM().dh(localcvN.ctz());
    bBn localbBn2 = Hh.QM().dh(localcvN.ctA());
    bBn localbBn3 = Hh.QM().dh(localcvN.ctB());

    cew localcew = localchp.aeL();
    if (localbBn1 != null) {
      localcew.a(localbBn1, (short)azO.dRx.hV);
    }
    if (localbBn2 != null) {
      localcew.a(localbBn2, (short)azO.dRA.hV);
    }
    if (localbBn3 != null) {
      localcew.a(localbBn3, (short)azO.dRC.hV);
    }
    localcew.eq("AnimStatique");
    localcew.es("AnimStatique");
    return localchp.aeL();
  }

  public static String dz(int paramInt) {
    if (dx(paramInt)) {
      return "npcGfxPath";
    }

    if (dy(paramInt)) {
      return "petGfxPath";
    }
    return "playerGfxPath";
  }
}