import org.apache.log4j.Logger;

public class ays
{
  public static final Logger K = Logger.getLogger(ays.class);

  private static final cSR dOF = new cSR();

  public static boolean q(aVc paramaVc)
  {
    if (paramaVc == null) {
      return false;
    }

    if (paramaVc.bke() == paramaVc.bkf()) {
      return false;
    }
    if (((doA)paramaVc).a(PY.coO)) {
      return false;
    }
    return dOF.contains(paramaVc.getId());
  }

  public static int r(aVc paramaVc) {
    if (paramaVc == null)
      return 0;
    dog localdog = t(paramaVc);
    if (localdog == null) {
      return 0;
    }
    int i = localdog.C(paramaVc.bke());
    int j = localdog.D(paramaVc.bkf());
    return i - j;
  }

  public static void s(aVc paramaVc) {
    if (paramaVc == null) {
      return;
    }
    dog localdog = t(paramaVc);
    if (localdog == null)
      return;
    if (localdog.aGz <= 0)
      return;
    if (localdog.lot <= 0) {
      return;
    }
    bZG localbZG = bZG.a(paramaVc.aIq(), paramaVc.bkf(), localdog.aGz, (short)0, false);
    localbZG.j(paramaVc.bkf());
    localbZG.u(paramaVc);
    localbZG.i(paramaVc.bkf());

    float[] arrayOfFloat = { localdog.aGz, 0.0F, localdog.lot, 0.0F, 100.0F, 0.0F };

    bJC localbJC = cNO.cFX().yF(localdog.aGz);
    int i;
    if (localbJC != null) {
      i = localbJC.bRe();
    } else {
      K.error("UNable to find state " + localdog.aGz + " for an EffectProbabilityMOdificator");
      i = 200;
    }
    aar localaar = aar.a(arrayOfFloat, i);
    localbZG.b(localaar);
    localbZG.b(paramaVc.aIq());
    localbZG.cel();
    localbZG.k(paramaVc.bkf());
    localbZG.release();
  }

  private static void a(dog paramdog) {
    dOF.put(paramdog.aRQ, paramdog);
  }

  private static dog t(aVc paramaVc) {
    if (paramaVc == null)
      return null;
    return (dog)dOF.get(paramaVc.getId());
  }

  static
  {
    a(new dog(bsj.fOZ, eu.azA, eu.azy, 993, 20, null));

    a(new dog(bsj.fPd, eu.azA, eu.azy, 993, 20, null));

    a(new dog(bsj.fPb, eu.azA, eu.azy, 993, 20, null));

    a(new dog(bsj.fPw, eu.azA, eu.azy, 993, 20, null));

    a(new dog(bsj.fPi, eu.azB, eu.azx, 1038, 20, null));

    a(new dog(bsj.fPk, eu.azB, eu.azx, 1038, 20, null));

    a(new dog(bsj.fPl, eu.azB, eu.azx, 1038, 20, null));
  }
}