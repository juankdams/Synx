public class clr
{
  private static dax[] hNn;

  public static boolean a(alW paramalW, aCl paramaCl, cnm paramcnm)
  {
    aUJ localaUJ = paramalW.az(paramaCl.aOC());
    return (localaUJ != null) && (localaUJ.a(paramcnm));
  }

  private static void cmV() {
    if (hNn == null)
      hNn = new dax[] { dax.kSe, dax.kSf, dax.kSg, dax.kSh, dax.kSi, dax.kSj, dax.kSk, dax.kSl, dax.kSm, dax.kSn };
  }

  public static dax vI(int paramInt)
  {
    cmV();
    for (dax localdax : hNn) {
      cig localcig = localdax.cMJ();
      cql localcql = (cql)localcig.cjZ();
      if (localcql.cpu().bsT().getId() == paramInt) {
        return localdax;
      }
    }

    return null;
  }

  public static boolean a(dax paramdax) {
    cmV();
    return aUP.c(hNn, paramdax);
  }

  public static boolean c(cig paramcig) {
    aRH localaRH = paramcig.cjZ();
    switch (WI.cGB[localaRH.Rf().ordinal()]) {
    case 1:
      cnW localcnW = (cnW)localaRH;
      if (localcnW.yR() == 0) {
        return false;
      }

      break;
    }

    return true;
  }

  public static int[] O(int[] paramArrayOfInt) {
    cSi localcSi = new cSi();
    for (int k : paramArrayOfInt) {
      if (qY.aYI.cw(k) != null) {
        localcSi.add(k);
      }
    }
    return paramArrayOfInt;
  }
}