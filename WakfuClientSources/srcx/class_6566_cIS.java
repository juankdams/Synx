import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class cIS extends bLe
{
  private final boolean iGR;
  private boolean iGS;
  private boolean iGT;
  private List frC;
  private List dzr;
  private List frD;

  public cIS(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
    this.iGR = paramBoolean;
  }

  protected void kN()
  {
    cDp();

    if ((mD() instanceof czN)) {
      localObject1 = new beC(0, 0, 0, mD().getId());
      ((beC)localObject1).l(this.frC);
      ((beC)localObject1).m(this.dzr);
      ((beC)localObject1).n(this.frD);
      ((beC)localObject1).kN();
      return;
    }

    if (!(mD() instanceof arl)) {
      return;
    }
    Object localObject1 = (arl)mD();

    K.info("[FIGHT] Fin du combat " + ((arl)localObject1).getId());
    byz localbyz = byv.bFN().bFO();

    if (!this.iGR) {
      bso();
      this.iGS = (!((arl)localObject1).de(localbyz.getId()));
    } else {
      this.iGS = false;
      ((arl)localObject1).ev(localbyz.getId());
      ((arl)localObject1).T(localbyz);
    }

    dmM.cUe(); dmM.m((ckT)localObject1);

    if ((this.iGR) && (((arl)localObject1).aDz())) {
      return;
    }

    dLE.doY().removeProperty("fight");
    dLE.doY().t("isInFightCreationOrPlacement", Boolean.valueOf(false));

    cDr();
    dLE.doY().t("fight.timeline", null);
    cDq();

    m((arl)localObject1);

    akY.axI().clear();
    bOX.bVM().clear();

    z(localbyz);
    Object localObject3;
    if (!this.iGR) {
      localObject2 = ((arl)localObject1).bgU();
      for (localObject3 = ((Collection)localObject2).iterator(); ((Iterator)localObject3).hasNext(); ) { localSu = (Su)((Iterator)localObject3).next();
        localSu.adK();
      }
      Su localSu;
      for (localObject3 = ((Collection)localObject2).iterator(); ((Iterator)localObject3).hasNext(); ) { localSu = (Su)((Iterator)localObject3).next();
        localSu.aeK(); }
      ((arl)localObject1).aDE();
    }
    else {
      localbyz.aeK();

      localObject2 = new cyT((arl)localObject1).cvR();
      dmM.cUe().c(localbyz, ((czN)localObject2).getId());
    }

    if (this.iGT) {
      new aKe().execute();
    }

    for (Object localObject2 = ayg.aJQ().aJS().iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (dWu)((Iterator)localObject2).next();
      ((dWu)localObject3).sM();
    }

    bnc.bxw().qm(((arl)localObject1).getId());
    if (byv.bFN().bFO().bGo() != null)
      ceR.chM().chN();
    dmM.cUe().cUl();

    btL.gcv.ie();
    bQK.bXG().cMO();
    acL.apd().cMO();
    dps.cXa().cMO();
    bVl.caZ().cMO();
  }

  private static void cDp() {
    dmn localdmn = cjS.clP().clQ();
    ckT localckT;
    while (localdmn.hasNext()) {
      localdmn.fl();
      localckT = (ckT)localdmn.value();
      if ((localckT instanceof czN))
      {
        for (Su localSu : localckT.bgG()) {
          localSu.jk(true);
          cew localcew = localSu.aeL();
          if ((localckT.aEu() == dzm.lFJ) && ((localSu instanceof bKm)))
            localcew.dK((byte)0); 
        }
      }
    }
  }

  private static void z(byz parambyz) { aWe localaWe = WakfuClientInstance.awy().Dg().cKV();
    localaWe.a(parambyz.aeL());
    localaWe.B(dmM.cUe().cUg()); }

  private static void m(arl paramarl)
  {
    btL.gcv.b(paramarl.aDC());
  }

  private static void cDq() {
    byv.bFN().a(Rl.acN());
    byv.bFN().a(dME.dpt());
  }

  private static void cDr() {
    try {
      cmI.cnw().cleanUp();

      byv.bFN().b(aKj.bbx());
      byv.bFN().b(cmT.cnA());
      byv.bFN().b(axB.aIZ());
      byv.bFN().b(Ca.Lc());
      byv.bFN().b(cmI.cnw());
      byv.bFN().b(aDd.aPo());
      byv.bFN().b(aYX.bnY());
      byv.bFN().b(csr.cqN());
      byv.bFN().b(aUK.bjU());
      aUK.bjU().f(null);
      byv.bFN().b(bIR.bQl());
    } catch (Exception localException) {
      K.error("Exception levee", localException);
    }
  }

  protected void kO()
  {
    ckT localckT = mD();
    if (localckT == null) {
      return;
    }
    dTw localdTw = localckT.aEt();
    if (localdTw.dtu())
      aWc.blo().en(this.iGS);
  }

  private void bso()
  {
    if (!(mD() instanceof arl)) {
      return;
    }
    arl localarl = (arl)mD();

    dLf.djM().j(new aoS(this, localarl));

    localarl.removeAllItems();
  }

  public void ij(boolean paramBoolean) {
    this.iGT = paramBoolean;
  }

  public void a(List paramList1, List paramList2, List paramList3) {
    this.frD = paramList1;
    this.dzr = paramList2;
    this.frC = paramList3;
  }
}