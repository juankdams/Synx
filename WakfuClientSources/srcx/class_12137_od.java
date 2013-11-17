import org.apache.log4j.Logger;

class od
  implements dFU
{
  public boolean a(dJF paramdJF)
  {
    long l = paramdJF.aKF();
    int i = paramdJF.diU();

    byz localbyz = byv.bFN().bFO();
    int j = 0;

    gA localgA = localbyz.bGP().iS(l);
    if (localgA == null) {
      localgA = (gA)localbyz.ayJ().ci(l);
      j = 1;
    }

    if (localgA == null) {
      bFo.K.warn("On reçoit un GEM_RESULT_MESSAGE pour l'item " + l + " alors qu'il n'est pas dans notre inventaire ou equipement");
      return false;
    }

    if (!localgA.nM()) {
      bFo.K.warn("On reçoit un GEM_RESULT_MESSAGE pour l'item " + localgA.oj() + " alors qu'il n'a pas de slots de gemmes");
      return false;
    }

    bBn localbBn = Hh.QM().dh(i);

    cdI localcdI = localgA.nO();
    localcdI.e(localbBn);

    localgA.of();
    if (j != 0) {
      byv.bFN().bFO().ayD();
    }

    byv.bFN().bFO().bGP().bUl();

    akm.axz().p(localgA);

    return false;
  }

  public int vN() {
    return 13102;
  }
}