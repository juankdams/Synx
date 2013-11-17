public class Fg
{
  private static final aoL bMy = new aoL();

  public static void d(aoL paramaoL) {
    byz localbyz = byv.bFN().bFO();

    bMy.clear();
    for (cHu localcHu = paramaoL.aBa(); localcHu.hasNext(); ) {
      localcHu.fl();
      long l = localcHu.bic();
      cCA localcCA = (cCA)localcHu.value();
      Object localObject;
      switch (localcCA.L()) {
      case 0:
        localObject = (dOx)localcCA;
        bMy.put(l, localObject);
        break;
      case 1:
        localObject = (cSd)localcCA;
        a(localbyz, l, (cSd)localObject);
        break;
      case 2:
        localObject = (z)localcCA;
        a(localbyz, l, (z)localObject);
      }

    }

    for (localcHu = bMy.aBa(); localcHu.hasNext(); ) {
      localcHu.fl();
      a(localbyz, localcHu.bic(), (dOx)localcHu.value());
    }
    bMy.clear();
  }

  private static void a(dhJ paramdhJ, long paramLong, z paramz) {
    gA localgA = paramdhJ.bHr().iS(paramLong);
    short s = (short)(paramz.K() - localgA.nP());
    paramdhJ.bHr().c(paramLong, s);
    if ((s > 0) && (!paramz.M()))
      dtY.k(localgA, s);
  }

  private static void a(dhJ paramdhJ, long paramLong, cSd paramcSd)
  {
    paramdhJ.bHr().iR(paramLong);
  }

  private static void a(dhJ paramdhJ, long paramLong, dOx paramdOx) {
    bVw localbVw = (bVw)Hh.QM().dh(paramdOx.tc());
    gA localgA = new gA(paramLong);
    localgA.b(localbVw);
    localgA.l(paramdOx.K());
    localgA.a(paramdOx.diS(), true);
    localgA.a(paramdOx.oq());
    paramdhJ.bHr().iO(paramdOx.bgh()).i(localgA, paramdOx.dqq());
    if (!paramdOx.M())
      dtY.k(localgA, localgA.nP());
  }
}