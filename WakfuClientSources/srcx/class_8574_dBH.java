final class dBH extends dcW
{
  public boolean a(coU paramcoU)
  {
    arl localarl = byv.bFN().bFO().bGv();
    boolean bool = (localarl != null) && (localarl.getId() == paramcoU.a());
    cuB localcuB = paramcoU.coK();

    Object localObject = null;
    dNZ localdNZ = paramcoU.coL();
    if (localdNZ == null)
      localdNZ = dNZ.mew;
    int[] arrayOfInt;
    cYk localcYk;
    switch (aLs.epK[localdNZ.ordinal()]) {
    case 1:
    case 2:
    case 3:
      localObject = new dIR(paramcoU.bQX(), paramcoU.ep().bJ(), paramcoU.eo(), paramcoU.a(), paramcoU.AD(), localdNZ, localcuB, CG.eu(paramcoU.coJ()), bool);

      break;
    case 4:
      arrayOfInt = localcuB.csZ();
      localcYk = new cYk(arrayOfInt);
      localObject = new aLX(paramcoU.bQX(), paramcoU.ep().bJ(), paramcoU.eo(), paramcoU.a(), paramcoU.AD(), localcYk);

      break;
    case 5:
      arrayOfInt = localcuB.csZ();
      localcYk = new cYk(arrayOfInt);
      localObject = new ccV(paramcoU.bQX(), paramcoU.ep().bJ(), paramcoU.eo(), paramcoU.a(), paramcoU.AD(), localcYk);
    }

    bnc.bxw().a(paramcoU.a(), (bSR)localObject);
    return false;
  }

  private cYn e(cuB paramcuB)
  {
    if (paramcuB.csW() == 2) {
      int[] arrayOfInt1 = paramcuB.csY();
      int[] arrayOfInt2 = paramcuB.csZ();
      if ((arrayOfInt1 != null) && (arrayOfInt2 != null)) {
        cYk localcYk = new cYk(arrayOfInt1);
        if (localcYk.X(arrayOfInt2) > 1)
          return cYn.kLN;
      }
    }
    return cYn.kLM;
  }
}