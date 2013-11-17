public final class dNv extends cZa
{
  public String a(cAK paramcAK)
  {
    return bU.fH().getString("haven.world.zaap.name");
  }

  public String b(cAK paramcAK)
  {
    return "travelCostLabel";
  }

  public boolean a(byz parambyz, cAK paramcAK)
  {
    return true;
  }

  public void a(aZK paramaZK, dhJ paramdhJ)
  {
  }

  public void b(aZK paramaZK, dhJ paramdhJ)
  {
    djB.cSv().c((cAK)paramaZK);
  }

  public dwZ b(dhJ paramdhJ, aZK paramaZK, long paramLong)
  {
    if (!(paramaZK instanceof L))
      return dwZ.lDh;
    if (!(paramdhJ instanceof bWy)) {
      return dwZ.lDh;
    }
    int i = ((L)paramaZK).d(((bWy)paramdhJ).bSD().CD());
    if (paramdhJ.JE() < i)
      return dwZ.lDb;
    aNn localaNn = (aNn)aot.dtv.a(dFN.lQe, paramLong);
    if (!localaNn.af(paramdhJ))
      return dwZ.lDe;
    return dwZ.lDa;
  }

  public dFN cHc()
  {
    return dFN.lQi;
  }
}