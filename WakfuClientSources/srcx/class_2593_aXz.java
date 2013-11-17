import org.apache.log4j.Logger;

class aXz
  implements dFU
{
  public boolean a(ayI paramayI)
  {
    long l = paramayI.aKF();
    byz localbyz = byv.bFN().bFO();
    int i = 0;

    gA localgA = localbyz.bGP().iS(l);
    if (localgA == null) {
      localgA = (gA)localbyz.ayJ().ci(l);
      i = 1;
    }

    if (localgA == null) {
      bFo.K.warn("On reçoit un GEM_REMOVED_MESSAGE pour l'item " + l + " alors qu'il n'est pas dans notre inventaire ou equipement");
      bmO();
      return false;
    }

    if (!localgA.nM()) {
      bFo.K.warn("On reçoit un GEM_REMOVED_MESSAGE pour l'item " + localgA.oj() + " alors qu'il n'a pas de slots de gemmes");
      bmO();
      return false;
    }

    cdI localcdI = localgA.nO();
    localcdI.aF(paramayI.VH());

    localgA.of();
    if (i != 0) {
      byv.bFN().bFO().ayD();
    }

    bmO();

    return true;
  }

  private void bmO() {
    byv.bFN().bFO().bGP().bUl();
    Pm.abk().abj();
  }

  public int vN() {
    return 13103;
  }
}