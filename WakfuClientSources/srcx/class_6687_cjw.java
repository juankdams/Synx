public class cjw
  implements dFU
{
  public boolean b(cWG paramcWG)
  {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
    {
      byz localbyz = byv.bFN().bFO();
      if (!localbyz.bSw()) {
        return false;
      }

      dax localdax = clr.vI(localbyz.bSt().nU() + 1);
      if (localdax == null) {
        return false;
      }
      localcyx.d(new bdO(localdax.cMJ().getId()));
    } else {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
    }
    return false;
  }

  public int vN() {
    return 18222;
  }
}