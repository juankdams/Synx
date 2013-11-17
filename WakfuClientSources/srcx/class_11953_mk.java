final class mk extends dcW
{
  public boolean a(dOY paramdOY)
  {
    Su localSu = CA.Lv().bj(paramdOY.bix());
    if ((localSu != null) && (localSu.aeR() != -1) && (dcu.kVl.kVm.contains(localSu.aeR())))
    {
      if (dcu.kVl.kVx.get(localSu.aeR()) == null)
        dcu.kVl.kVx.put(localSu.aeR(), cUZ.a(7, dPD.mhC.bJ(), 0, localSu.aeL(), paramdOY.cPV()));
      else {
        ((cUZ)dcu.kVl.kVx.get(localSu.aeR())).a(localSu.aeL(), paramdOY.cPV());
      }

      return false;
    }
    return true;
  }
}