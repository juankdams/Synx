final class daf extends dcW
{
  public boolean a(aTf paramaTf)
  {
    Su localSu = CA.Lv().bj(paramaTf.bix());

    if ((localSu != null) && (localSu.aeR() != -1)) {
      ckT localckT = cjS.clP().vz(localSu.aeR());
      if (localckT == null)
        return false;
      if (localckT.aEu() == dzm.lFK) {
        ZH localZH = ZH.a(8, dPD.mhD.bJ(), 0, localSu, new cYk(paramaTf.getX(), paramaTf.getY(), paramaTf.biy()), true);
        bnc.bxw().a(localSu.aeR(), localZH);
        bnc.bxw().d(localckT);
      } else if (paramaTf.biz()) {
        localSu.aeL().a(paramaTf.getX(), paramaTf.getY(), paramaTf.biy(), false, false);
      }
      return false;
    }
    return true;
  }
}