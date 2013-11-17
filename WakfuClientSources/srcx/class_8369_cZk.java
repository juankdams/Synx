public class cZk extends aZm
{
  public void a(aZK paramaZK, dhJ paramdhJ)
  {
    awT localawT = byv.bFN().bFO().bGF();
    ((cMb)paramaZK).a(((dWu)paramaZK).adT());
    localawT.kL((int)paramaZK.getId());
  }

  public void b(aZK paramaZK, dhJ paramdhJ) {
    coX.coM().c((cAK)paramaZK);
  }

  public dwZ b(dhJ paramdhJ, aZK paramaZK, long paramLong) {
    int i = a(paramaZK);
    if (i > 0) if (!bGP.gDv.a(new aGH[] { (aGH)paramdhJ })) {
        return dwZ.lDg;
      }
    if (paramdhJ.JE() < i) {
      return dwZ.lDb;
    }
    return dwZ.lDa;
  }

  protected void c(dhJ paramdhJ, aZK paramaZK, long paramLong) {
    dKT localdKT = new dKT(paramaZK.getId(), paramLong);
    byv.bFN().aJK().d(localdKT);
  }

  public boolean a(byz parambyz, cAK paramcAK) {
    return (parambyz.bGy()) && (b(parambyz, paramcAK, -1L) == dwZ.lDa);
  }

  public dFN cHc() {
    return dFN.lQf;
  }

  public String a(cAK paramcAK) {
    return bU.fH().b(82, (int)paramcAK.getId(), new Object[0]);
  }

  public String b(cAK paramcAK)
  {
    byz localbyz = byv.bFN().bFO();
    lZ locallZ = new lZ();
    locallZ.am((b(localbyz, paramcAK, -1L) == dwZ.lDa ? bNa.gRA : bNa.gRz).bUV());
    locallZ.bw(a(paramcAK)).a("§");
    return locallZ.tP();
  }

  private int a(aZK paramaZK) {
    dOy localdOy = bDk.bLI().cr(paramaZK.boC()).mrY;
    return localdOy == dOy.mgi ? 0 : 0;
  }
}