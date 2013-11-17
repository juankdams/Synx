final class GF extends dcW
{
  public boolean a(wp paramwp)
  {
    ckT localckT = cjS.clP().vz(paramwp.a());

    int i = byv.bFN().bFO().aeQ() == null ? 1 : 0;

    Su localSu = CA.Lv().bj(paramwp.AD());
    localSu.aE(paramwp.Fv());
    localSu.gD(paramwp.a());
    localSu.jk(true);
    czN localczN = (czN)localckT;
    localczN.a(localSu, paramwp.Fx());

    if (i != 0)
    {
      localSu.aeL().dI(paramwp.Fx());

      if (((localSu instanceof byo)) && ((localckT.aEu() == dzm.lFJ) || (localckT.aEu() == dzm.lFL)))
      {
        localSu.aeL().dK((byte)-1);
      }
    }

    dmM.cUe().b(localSu, paramwp.a());
    bOJ.aE(localSu);

    return false;
  }
}