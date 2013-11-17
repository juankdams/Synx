import org.apache.log4j.Logger;

public class ceZ
  implements cpw
{
  private static final int hzS = 59;
  private static final Logger K = Logger.getLogger(ceZ.class);

  public boolean a(cWG paramcWG) {
    switch (paramcWG.getId()) {
    case 17013:
      execute();
      return false;
    }
    return true;
  }

  public void execute() {
    byv localbyv = byv.bFN();
    byz localbyz = localbyv.bFO();
    cew localcew = localbyz.aeL();

    if (localbyz.adF()) {
      return;
    }

    if (localbyz.bGK()) {
      return;
    }

    if (aYP.feK.bnQ()) {
      return;
    }

    if (!localbyz.q(false, true)) {
      return;
    }

    if (localbyv.c(cHX.cCk())) {
      localbyv.b(cHX.cCk());
    }

    dwN localdwN = localbyz.bHa();
    if (localdwN != null) {
      localcew.c(CG.bFG);
      aWc.blo().eO(600066L);
      localbyz.fC(true);
      chU();
      return;
    }

    if (!chV()) {
      CM.LV().f(bU.fH().getString("bag.forbiddenAtThisPosition"), 3);
      return;
    }

    if (!chW()) {
      CM.LV().f(bU.fH().getString("bag.forbiddenInEnnemyTerritory"), 3);
      return;
    }

    if (cBQ.cxL().mZ("exchangeDialog"))
      localbyv.b(bQs.bXv());
    if (cBQ.cxL().mZ("recycleDialog"))
      localbyv.b(dhC.cQm());
    if (cBQ.cxL().mZ("protectorManagementDialog"))
      localbyv.b(drM.cYz());
    if (cBQ.cxL().mZ("weatherInfoDialog"))
      localbyv.b(brL.bzT());
    if (localbyv.c(dxP.dcE()))
      localbyv.b(dxP.dcE());
    cqu.cpE().alK();

    czr localczr = (czr)acs.aoN().gh(59L);
    if (localczr != null) {
      localczr.a(0L);
      localczr.n(localbyz.aeL().atB());
      localczr.bC(localbyz.Lk());
      localczr.dO((short)1);
      localczr.x((short)2);
      localczr.setVisible(true);
      localczr.setSelectable(false);
      localczr.sM();

      for (abc localabc : localczr.sL()) {
        if ((localabc instanceof ob)) {
          ob localob = (ob)localabc;
          bVl.caZ().b(localob);
          localob.id(dLw.mbh.asR());
          bdB.b(localob);
        }
      }
      ayg.aJQ().b(localczr);
    } else {
      K.error("[ItemAction] Impossible de spawn visuellement le havre-sac");
    }

    localcew.c(CG.bFG);
    localcew.bIS();

    aWc.blo().eO(600065L);
    localbyz.fC(true);

    chT();
  }

  private void chT() {
    bve localbve = new bve();
    localbve.ge(0L);
    byv.bFN().aJK().d(localbve);
  }

  private void chU() {
    dei localdei = new dei();
    byv.bFN().aJK().d(localdei);
  }

  private boolean chV() {
    byz localbyz = byv.bFN().bFO();
    dUx localdUx = bDk.bLI().cr(localbyz.Lk());
    return adX.a(localbyz.aKb(), localdUx);
  }

  private boolean chW() {
    byz localbyz = byv.bFN().bFO();
    bva localbva = localbyz.bHn();
    if (localbva == null) {
      return true;
    }
    aid localaid = localbva.boT();
    cvY localcvY = localbyz.cJf();
    return (localaid == null) || (dow.cVB().a(localcvY, localaid.avc()));
  }
}