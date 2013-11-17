public class doU extends aZm
{
  public void a(aZK paramaZK, dhJ paramdhJ)
  {
  }

  public void b(aZK paramaZK, dhJ paramdhJ)
  {
    ctW.csy().c((cAK)paramaZK);
  }

  public dwZ b(dhJ paramdhJ, aZK paramaZK, long paramLong)
  {
    cPT localcPT = aot.dtv.l(paramaZK.getId(), paramLong);
    if (!localcPT.a(paramdhJ, paramaZK))
      return dwZ.lDe;
    if (!localcPT.b(paramdhJ, paramaZK))
      return dwZ.lDe;
    int i = localcPT.qW();
    if (i > 0) if (!bGP.gDv.a(new aGH[] { (aGH)paramdhJ }))
        return dwZ.lDg;
    if ((ccm.a(((byz)paramdhJ).bGF(), localcPT)) && (paramdhJ.JE() < i))
      return dwZ.lDb;
    return dwZ.lDa;
  }

  protected void c(dhJ paramdhJ, aZK paramaZK, long paramLong)
  {
    dKT localdKT = new dKT(paramaZK.getId(), paramLong);
    byv.bFN().aJK().d(localdKT);

    cPT localcPT = aot.dtv.l(paramaZK.getId(), paramLong);

    awT localawT = byv.bFN().bFO().bGF();
    localawT.kO((int)localcPT.getId());
  }

  public boolean a(byz parambyz, cAK paramcAK)
  {
    return true;
  }

  public dFN cHc()
  {
    return dFN.lQh;
  }

  public String a(cAK paramcAK)
  {
    aUg localaUg = new aUg();
    localaUg.a(paramcAK.getId(), paramcAK);

    lZ locallZ = new lZ();
    locallZ.a(bU.fH().b(83, (int)paramcAK.getId(), new Object[0])).tH().tH();

    locallZ.a(bU.fH().getString("destinations")).tH();
    locallZ.a(localaUg.getDescription());
    return locallZ.tP();
  }

  public String b(cAK paramcAK)
  {
    return null;
  }
}