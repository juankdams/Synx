public class cJg
  implements dFU
{
  public boolean b(cWG paramcWG)
  {
    bzu localbzu = (bzu)paramcWG;

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(new bdO(localbzu.getIntValue()));
    else {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
    }
    return false;
  }

  public int vN() {
    return 18223;
  }
}