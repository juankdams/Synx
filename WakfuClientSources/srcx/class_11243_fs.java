import org.apache.log4j.Logger;

public class fs
{
  private static final Logger K = Logger.getLogger(fs.class);

  private static final dPx aCs = new dPx();

  private static cOf mq()
  {
    cOf localcOf = new cOf();
    VL localVL = new VL(azO.dRx, 1349907);
    localcOf.a(30, new VL[] { localVL, new VL(azO.dRK, 1329924) });
    localcOf.a(31, new VL[] { localVL, new VL(azO.dRK, 1329925) });
    localcOf.a(32, new VL[] { localVL, new VL(azO.dRK, 1329926) });
    localcOf.a(33, new VL[] { localVL, new VL(azO.dRK, 13210733) });
    return localcOf;
  }

  private static cOf mr() {
    cOf localcOf = new cOf();
    localcOf.a(30, new VL[] { new VL(azO.dRK, 1349913) });
    localcOf.a(31, new VL[] { new VL(azO.dRK, 1349912) });
    localcOf.a(32, new VL[] { new VL(azO.dRK, 1349911) });
    localcOf.a(33, new VL[] { new VL(azO.dRK, 13410435) });
    return localcOf;
  }

  private static cOf ms()
  {
    cOf localcOf = new cOf();
    localcOf.a(30, new VL[] { new VL(azO.dRK, 1349909) });
    localcOf.a(31, new VL[] { new VL(azO.dRK, 1349908) });
    localcOf.a(32, new VL[] { new VL(azO.dRK, 1349910) });
    localcOf.a(33, new VL[] { new VL(azO.dRK, 13410434) });
    return localcOf;
  }

  private static cOf a(VL[] paramArrayOfVL) {
    cOf localcOf = new cOf();
    localcOf.a(30, paramArrayOfVL);
    localcOf.a(31, paramArrayOfVL);
    localcOf.a(32, paramArrayOfVL);
    localcOf.a(33, paramArrayOfVL);
    return localcOf;
  }

  public static void a(Yp paramYp, int paramInt, dOg paramdOg) {
    cOf localcOf = (cOf)aCs.bf(paramYp.ajY());
    if (localcOf == null) {
      K.error("Pas d'equiepement défini pour le rank " + paramYp);
      return;
    }

    VL[] arrayOfVL = localcOf.yJ(paramInt);
    if (arrayOfVL == null) {
      K.error("Pas d'equiepement défini pour le rank " + paramYp + " pour la nation " + paramInt);
      return;
    }

    int i = 0; for (int j = arrayOfVL.length; i < j; i++)
      if (!paramdOg.a(arrayOfVL[i].cAT, arrayOfVL[i].bUm))
        return;
  }

  public static int a(Yp paramYp)
  {
    if (paramYp == null)
      return -1;
    switch (yq.brU[paramYp.ordinal()]) {
    case 1:
      return 800205;
    case 2:
      return 800216;
    case 3:
      return 800215;
    case 4:
      return 800214;
    case 5:
      return 800217;
    case 6:
      return 800218;
    case 7:
      return 800219;
    case 8:
      return 800221;
    }
    return -1;
  }

  public static int[] mt()
  {
    adz localadz = new adz();
    aCs.s(new yu(localadz));

    return localadz.toArray();
  }

  static
  {
    aCs.c(Yp.cIQ.ajY(), mq());
    aCs.c(Yp.cIR.ajY(), a(new VL[] { new VL(azO.dRx, 1349921) }));
    aCs.c(Yp.cIT.ajY(), mr());
    aCs.c(Yp.cIS.ajY(), ms());
    aCs.c(Yp.cIU.ajY(), a(new VL[] { new VL(azO.dRx, 1349917) }));
    aCs.c(Yp.cIZ.ajY(), a(new VL[] { new VL(azO.dRx, 1349918) }));
    aCs.c(Yp.cIV.ajY(), a(new VL[] { new VL(azO.dRx, 1349920) }));
    aCs.c(Yp.cIW.ajY(), a(new VL[] { new VL(azO.dRx, 1349922) }));
  }
}