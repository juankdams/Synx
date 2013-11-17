import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class drM
  implements cvW
{
  private static drM lue = new drM();

  private static final Logger K = Logger.getLogger(drM.class);
  private ayn dtQ;
  private bnm N;
  private bwe chg;
  private float fBh;
  private float fBi;

  public static drM cYz()
  {
    return lue;
  }

  public boolean a(cWG paramcWG) {
    if ((paramcWG instanceof dKQ)) {
      bWW.ccf().Pp();
      return false;
    }
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    int i;
    Object localObject5;
    boolean bool1;
    ayn localayn;
    btY localbtY;
    switch (paramcWG.getId())
    {
    case 16004:
      localObject1 = (bYT)dLE.doY().rv("selectedProtectorMerchantItem");
      localObject2 = ((bYT)localObject1).cdz();
      localObject3 = ((IQ)paramcWG).Sk();
      if (localObject3 == null) {
        return false;
      }

      localObject4 = ((bFg)localObject3).bLd() != ccq.htW ? "question.confirmPurchase" : "question.confirmPurchaseReplace";

      cKX localcKX = cBQ.cxL().a(bU.fH().getString((String)localObject4, new Object[] { ((bYT)localObject1).getName() }), Cn.et(0), 2073L, 102, 1);

      localcKX.a(new yE(this, (ld)localObject2, (bFg)localObject3));

      return false;
    case 16005:
      localObject1 = (bzu)paramcWG;
      localObject2 = cBQ.cxL().a(bU.fH().getString("question.confirmTaxChanges"), Cn.et(0), 2073L, 102, 1);

      ((cKX)localObject2).a(new yG(this));

      return false;
    case 16011:
      localObject1 = (bzu)paramcWG;
      i = ((bzu)localObject1).getIntValue();
      localObject3 = bmt.cW(((bzu)localObject1).af());

      localObject4 = cBQ.cxL().a(bU.fH().getString("question.confirmAllocateBudget"), Cn.et(0), 2073L, 102, 1);

      ((cKX)localObject4).a(new yH(this, (bmt)localObject3, i));

      return false;
    case 16012:
      localObject1 = (bzu)paramcWG;
      i = (int)((bzu)localObject1).ah();
      int j = ((bzu)localObject1).getIntValue();

      localObject4 = cBQ.cxL().a(bU.fH().getString("question.confirmTransferKamas"), Cn.et(0), 2073L, 102, 1);

      ((cKX)localObject4).a(new yz(this, j, i));

      return false;
    case 16006:
      localObject1 = (bzu)paramcWG;
      i = ((bzu)localObject1).getIntValue();
      boolean bool2 = ((bzu)localObject1).getBooleanValue();
      localObject4 = this.dtQ.aKp();

      int k = ((cSi)localObject4).indexOf(i);
      if ((bool2) && (k == -1))
        ((cSi)localObject4).add(i);
      else if ((!bool2) && (k != -1))
        ((cSi)localObject4).wH(k);
      else {
        return false;
      }

      localObject5 = new dtD();
      ((dtD)localObject5).zi(i);
      ((dtD)localObject5).aM(this.dtQ.getId());
      ((dtD)localObject5).setSelection(bool2);
      byv.bFN().aJK().d((cWG)localObject5);

      return false;
    case 16008:
      localObject1 = (bzu)paramcWG;
      bool1 = ((bzu)localObject1).getBooleanValue();
      localayn = bWW.ccf().FB();
      localObject4 = localayn.aKu().aGA();
      localbtY = ((dEw)localObject4).I(((bzu)localObject1).getIntValue(), bool1);

      if (localayn.aKi().c(bmt.fDW) >= localbtY.bCf()) {
        localObject5 = cBQ.cxL().a(bU.fH().getString("question.confirmPurchaseGeneral"), Cn.et(0), 2073L, 102, 1);

        ((cKX)localObject5).a(new yA(this, bool1, localayn, (bzu)localObject1));
      }
      else
      {
        cBQ.cxL().a(bU.fH().getString("error.notEnoughKamas"), Cn.et(1), 2051L, 102, 1);
      }

      return false;
    case 16009:
      localObject1 = (bzu)paramcWG;
      bool1 = ((bzu)localObject1).getBooleanValue();
      localayn = bWW.ccf().FB();

      localObject4 = cBQ.cxL().a(bU.fH().getString("question.confirmUnprotect"), Cn.et(0), 2073L, 102, 1);

      ((cKX)localObject4).a(new yB(this, bool1, localayn, (bzu)localObject1));

      return false;
    case 16010:
      localObject1 = (bzu)paramcWG;
      bool1 = ((bzu)localObject1).getBooleanValue();
      localayn = bWW.ccf().FB();
      localObject4 = localayn.aKu().aGA();
      localbtY = ((dEw)localObject4).I(((bzu)localObject1).getIntValue(), bool1);

      if (localayn.aKi().c(bmt.fDW) >= localbtY.bCg()) {
        localObject5 = cBQ.cxL().a(bU.fH().getString("question.confirmPurchaseGeneral"), Cn.et(0), 2073L, 102, 1);

        ((cKX)localObject5).a(new yC(this, bool1, localayn, (bzu)localObject1));
      }
      else
      {
        cBQ.cxL().a(bU.fH().getString("error.notEnoughKamas"), Cn.et(1), 2051L, 102, 1);
      }

      return false;
    case 16007:
      cBQ.cxL().a(bU.fH().getString("question.confirmLawChanges"), Cn.et(0), 2073L, 102, 1);

      return false;
    }

    return true;
  }

  private void cYA() {
    c(cVE.kIa);
    c(cVE.kHZ);
  }

  private void c(cVE paramcVE) {
    switch (EW.bMj[paramcVE.ordinal()]) {
    case 1:
      this.fBi = bWW.ccf().b(cVE.kIa).aNH().getValue();
      break;
    case 2:
      this.fBh = bWW.ccf().b(cVE.kHZ).aNH().getValue();
    }

    bhv localbhv = new bhv();
    localbhv.aM(this.dtQ.getId());
    localbhv.d(bWW.ccf().b(paramcVE).aNH());
    WakfuClientInstance.awy().awz().aJK().d(localbhv);
  }

  public long getId() {
    return 4L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      byz localbyz = byv.bFN().bFO();

      this.chg = new yM(this);

      localbyz.aeL().a(this.chg);

      this.dtQ = bWW.ccf().FB();
      if (this.dtQ == null) {
        K.error("Impossible d'initialiser l'interface de management du protecteur, aucun protecteur n'est définie dans la vue !");
        return;
      }

      BJ localBJ = new BJ();
      localBJ.aM(this.dtQ.getId());
      WakfuClientInstance.awy().awz().aJK().d(localBJ);

      WakfuClientInstance.awy().awz().aJK().d(new ej());

      dLE.doY().t("selectedProtectorMerchantItem", null);

      this.fBh = bWW.ccf().b(cVE.kHZ).aNH().getValue();
      this.fBi = bWW.ccf().b(cVE.kIa).aNH().getValue();

      this.N = new yL(this);

      cBQ.cxL().a(this.N);

      dLE.doY().t("weather.manager", sS.Al());

      aig.dej.ev("protectorEcosystemLock");

      aNL localaNL = cBQ.cxL().a("protectorManagementDialog", VV.dJ("protectorManagementDialog"), 32768L, (short)10000);

      dLE.doY().a("currentPage", Integer.valueOf(0), localaNL.getElementMap());

      cBQ.cxL().j("wakfu.protectorManagement", Jr.class);

      cAo.cxf().a(this, 1000L, -1);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      bWW.ccf().b(cVE.kHZ).aNH().setValue(this.fBh);
      bWW.ccf().b(cVE.kIa).aNH().setValue(this.fBi);

      byv.bFN().bFO().aeL().b(this.chg);
      this.chg = null;

      aig.dej.ew("protectorEcosystemLock");

      cBQ.cxL().mN("wakfu.protectorManagement");
      cBQ.cxL().b(this.N);

      dLE.doY().removeProperty("selectedProtectorMerchantItem");
      dLE.doY().removeProperty("weather.manager");

      cBQ.cxL().mW("protectorManagementDialog");

      cAo.cxf().b(this);
    }
  }
}