public final class cpC
{
  public static final float hYQ = 0.9F;

  public static Pr v(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    bzM localbzM = bzM.by(paramFloat1);
    if (localbzM == bzM.gok) {
      return Pr.chF;
    }
    cjf localcjf = cjf.vu(Math.round(paramFloat2));

    if (localbzM == bzM.gol) {
      if (localcjf == cjf.hIE)
        return Pr.chL;
      return Pr.chG;
    }

    if (localcjf == cjf.hIE) {
      return paramFloat3 > 0.9F ? Pr.chK : Pr.chI;
    }
    return paramFloat3 > 0.9F ? Pr.chJ : Pr.chH;
  }

  public static Pr a(gB paramgB) {
    return v(paramgB.oE(), paramgB.oF(), paramgB.oG());
  }
}