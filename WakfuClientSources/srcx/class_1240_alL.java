public class alL
{
  public static cYq a(bqd parambqd, cig paramcig, double paramDouble)
  {
    return a(parambqd.byZ(), paramcig.cjW(), paramDouble);
  }

  public static boolean e(bqd parambqd) {
    return !parambqd.bza().avJ();
  }

  public static boolean b(bqd parambqd, cig paramcig, double paramDouble) {
    if (e(parambqd))
      return false;
    cYq localcYq = a(parambqd.byZ(), paramcig.cjW(), paramDouble);
    return localcYq.S(dDE.dft().VN());
  }

  public static boolean c(bqd parambqd, cig paramcig, double paramDouble) {
    cYq localcYq = a(parambqd.byZ(), paramcig.cjW(), paramDouble);
    return localcYq.R(dDE.dft().VN());
  }

  public static cYq d(bqd parambqd, cig paramcig, double paramDouble) {
    return a(parambqd.bza(), paramcig.cjY(), paramDouble);
  }

  private static cYq a(dxL paramdxL, cds paramcds, double paramDouble) {
    if ((!bB) && (!paramcds.rN())) throw new AssertionError("La durée devrait être > 0");
    cYq localcYq = new cYq(paramdxL);
    localcYq.n(new kb(bCO.y(paramcds.rO() * paramDouble)));
    return localcYq;
  }
}