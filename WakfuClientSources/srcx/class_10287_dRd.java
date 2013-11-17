final class dRd extends dcW
{
  public boolean a(TN paramTN)
  {
    doA localdoA = drY();
    localdoA.q(paramTN.agH());

    dle localdle = localdoA.bkf();
    if ((localdoA.bkM()) && (localdle != null) && 
      (localdle.atO() != null)) {
      localdle.atO().G(localdoA);
    }
    localdoA.release();
    return false;
  }

  private doA drY() {
    uY localuY = (uY)bsj.bAv().kD(bsj.fSj.getId());
    return (doA)localuY.a(SN.aga(), ciQ.ckL());
  }
}