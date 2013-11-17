public class aot
{
  public static final aot dtv = new aot();

  private final adz dtw = new adz();
  private final aoL dtx = new aoL();
  private final aoL dty = new aoL();

  private final aoL dtz = new aoL();

  private final aoL dtA = new aoL();
  private final aoL dtB = new aoL();

  private final aoL dtC = new aoL();

  public CU a(dFN paramdFN, long paramLong)
  {
    switch (ajx.dgJ[paramdFN.ordinal()]) {
    case 1:
      return (CU)this.dtx.get(paramLong);
    case 2:
      return (CU)this.dtz.get(paramLong);
    case 3:
      return (CU)this.dtA.get(paramLong);
    case 4:
      return (CU)this.dtC.get(paramLong);
    }
    throw new IllegalArgumentException("Type de transport inconnu " + paramdFN);
  }

  public void a(dlz paramdlz)
  {
    this.dtC.put(paramdlz.getId(), paramdlz);
  }

  public void a(aDK paramaDK)
  {
    this.dtA.put(paramaDK.getId(), paramaDK);
  }

  public cPT a(cPT paramcPT) {
    if ((!this.dtA.containsKey(paramcPT.cGW())) || (!this.dtA.containsKey(paramcPT.cGX())))
      throw new IllegalArgumentException("Impossible de rajouter un liens entre deux boats si ceux-ci n'existent pas");
    this.dtB.put(paramcPT.getId(), paramcPT);
    return paramcPT;
  }

  public cPT l(long paramLong1, long paramLong2) {
    for (cHu localcHu = this.dtB.aBa(); localcHu.hasNext(); ) {
      localcHu.fl();
      cPT localcPT = (cPT)localcHu.value();
      int i = localcPT.cGW();
      int j = localcPT.cGX();
      if (((i == paramLong1) && (j == paramLong2)) || ((i == paramLong2) && (j == paramLong1))) {
        return localcPT;
      }
    }
    throw new IllegalArgumentException("Impossible de trouver un lien entre les boats " + paramLong1 + " et " + paramLong2);
  }

  public cPT cW(long paramLong) {
    return (cPT)this.dtB.get(paramLong);
  }

  public void t(dGy paramdGy)
  {
    this.dtB.s(paramdGy);
  }

  public void a(dhD paramdhD)
  {
    this.dtz.put(paramdhD.getId(), paramdhD);
  }

  public dhD cX(long paramLong) {
    return (dhD)this.dtz.get(paramLong);
  }

  public bVn m(long paramLong1, long paramLong2)
  {
    for (cHu localcHu = this.dty.aBa(); localcHu.hasNext(); ) {
      localcHu.fl();
      bVn localbVn = (bVn)localcHu.value();
      int i = localbVn.cbd();
      int j = localbVn.cbe();
      if (((i == paramLong1) && (j == paramLong2)) || ((i == paramLong2) && (j == paramLong1))) {
        return localbVn;
      }
    }
    throw new IllegalArgumentException("Impossible de trouver un lien entre les zaaps " + paramLong1 + " et " + paramLong2);
  }

  public void a(aNn paramaNn, boolean paramBoolean)
  {
    this.dtx.put(paramaNn.getId(), paramaNn);
    if (paramBoolean)
      this.dtw.hL((int)paramaNn.getId());
  }

  public void a(bVn parambVn) {
    if ((!this.dtx.containsKey(parambVn.cbd())) || (!this.dtx.containsKey(parambVn.cbe())))
      throw new IllegalArgumentException("Impossible de rajouter un liens entre deux zaaps si ces zaaps n'existent pas");
    this.dty.put(parambVn.getId(), parambVn);
  }

  public void aAK() {
    for (cHu localcHu1 = this.dtx.aBa(); localcHu1.hasNext(); ) {
      localcHu1.fl();
      for (localcHu2 = this.dtx.aBa(); localcHu2.hasNext(); ) {
        localcHu2.fl();
        if ((localcHu1.bic() != localcHu2.bic()) && (m(localcHu1.bic(), localcHu2.bic()) == null))
          throw new IllegalArgumentException("Impossible de trouver un lien entre les zaaps " + localcHu1.bic() + " et " + localcHu2.bic());
      }
    }
    cHu localcHu2;
  }

  public int[] aAL() {
    return this.dtw.toArray();
  }
}