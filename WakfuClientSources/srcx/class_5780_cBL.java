final class cBL extends dcW
{
  public boolean a(EM paramEM)
  {
    ckT localckT = cjS.clP().vz(paramEM.a());

    Su localSu = localckT.dg(paramEM.AD());
    if (localSu == null) {
      return false;
    }
    cew localcew = localSu.aeL();
    if (paramEM.gI()) {
      bOJ.a(localcew, localcew.cgZ());
    } else {
      localcew.es("AnimStatique");
      localcew.eq("AnimStatique");
    }
    return false;
  }
}