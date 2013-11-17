import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class axB
  implements cvW
{
  private static final axB dMI;
  private cKX dMJ;
  private static final Logger K;
  public static arl cUs;
  protected static final cYk aUg;
  public static int dyx;
  public static int dyy;
  private boolean dMK;
  private DisplayedScreenElement cgj;
  private static String dML;
  private static final float[] dMM;
  private static final dyY dMN;
  private static final bCm dMO;
  private static final cry dMP;
  private boolean dMQ;
  private final bJ dMR;
  private dGp dMS;

  public axB()
  {
    this.dMJ = null;

    this.dMR = new bJ(null);
  }

  public void a(cmc paramcmc) {
    if ((this.dMR != null) && (this.dMR.fg() != null) && (this.dMR.fg().equals(paramcmc)))
      daO.cML().a(this.dMR);
  }

  public static axB aIZ()
  {
    return dMI;
  }

  public static cYk aJa() {
    return aUg;
  }

  public boolean a(cWG paramcWG) {
    dSz localdSz = WakfuClientInstance.awy().Dg();
    Object localObject1;
    Object localObject2;
    boolean bool;
    Object localObject4;
    switch (paramcWG.getId())
    {
    case 16606:
      return false;
    case 19994:
      localObject1 = (aqQ)paramcWG;
      byz localbyz1 = byv.bFN().bFO();

      if (this.dMK) {
        return b((aqQ)localObject1);
      }

      dyx = ((aqQ)localObject1).aCX();
      dyy = ((aqQ)localObject1).aCY();

      cYk localcYk = a(dyx, dyy, !aJf(), false);
      if (!this.dMQ) {
        t(localcYk);
      }

      if ((!bB) && (cUs == null)) throw new AssertionError("UIFightFrame uniquement pour les gens en combat. m_fight ne peut être null");
      if ((!bB) && (cUs.LB() == null)) throw new AssertionError("UIFightFrame : fight sans fightMap");
      if ((localcYk != null) && (cUs.x(localcYk) == null))
      {
        int m = 0;
        localObject2 = cUs.LC();
        bool = cUs.LB().ap(localcYk.getX(), localcYk.getY());
        Object localObject5;
        if (localObject2 != null) {
          localObject4 = ((aJD)localObject2).bbj();
          if ((localObject4 != null) && (!((Collection)localObject4).isEmpty())) {
            for (localObject5 = ((Collection)localObject4).iterator(); ((Iterator)localObject5).hasNext(); ) { cjK localcjK2 = (cjK)((Iterator)localObject5).next();
              int i;
              int j;
              cjK localcjK1;
              byz localbyz2;
              ArrayList localArrayList2;
              Object localObject3;
              ArrayList localArrayList1;
              int k;
              int n;
              if (((localcjK2 instanceof rE)) && 
                ((localcjK2.getType() != xj.bpv.xj()) || (localbyz1 == localcjK2.axG())) && (
                (!localcjK2.c(aIm.egU)) || (localbyz1.Fx() == localcjK2.Fx())))
              {
                int i1 = (bool) && ((localcjK2 instanceof cmc)) && (!((cmc)localcjK2).bnX()) ? 1 : 0;

                if ((i1 != 0) || ((localcjK2.fa() == localcYk.getX()) && (localcjK2.fb() == localcYk.getY()))) {
                  this.dMR.a((rE)localcjK2);
                  m = 1;
                  break;
                }
              }
            }
          }
        }
        if (m != 0) {
          localObject4 = up.b(localdSz, localcYk.getX(), localcYk.getY(), localcYk.IB());
          this.dMR.setScreenX(bCO.bC(((cYm)localObject4).aOR));
          this.dMR.setScreenY(bCO.bC(((cYm)localObject4).aOS));
          localObject5 = new dD(this.dMR, 0);
          ((dD)localObject5).c(this.dMR.fe(), null);
          cjO.clE().j((cWG)localObject5);
          this.dMR.h(cOg.i(this.dMR.fe()));
        } else if (this.dMR.eX()) {
          daO.cML().a(this.dMR);
          this.dMR.h(cOg.i(this.dMR.fe()));
        }

      }

      return false;
    case 18015:
      c(null);

      if ((cUs != null) && (cUs.LC() != null)) {
        localObject1 = cUs.LC().bbj().iterator();
        i = 0;
        j = 0;
        while (((Iterator)localObject1).hasNext()) {
          localcjK1 = (cjK)((Iterator)localObject1).next();
          if (localcjK1.P(aUg.getX(), aUg.getY(), aUg.IB()))
          {
            localObject2 = xj.dA(localcjK1.getType());
            if (localObject2 != null)
            {
              switch (dLO.gSH[localObject2.ordinal()]) {
              case 1:
                a((beb)localcjK1);
                i = 1;
                break;
              case 2:
                bool = cUs.a((aRS)localcjK1);
                if (!bool) {
                  c((aRS)localcjK1);
                  j = 1; } break;
              case 3:
                c((aAn)localcjK1);
                j = 1;
                break;
              case 4:
                a((aAn)localcjK1, aUg);
                j = 1;
                break;
              case 5:
                localObject4 = (dLR)localcjK1;
                switch (((dLR)localObject4).czh()) {
                case 4:
                  if (localcjK1.ML().bg(aUg)) {
                    c((aAn)localcjK1);
                    j = 1;
                  }

                  break;
                }

                break;
              }
            }
          }
        }

        if (i == 0) {
          a(null);
        }
        if (j == 0) {
          c(null);
        }

      }

      return false;
    case 19992:
      localObject1 = (aqQ)paramcWG;

      if (this.dMK) {
        if (((aqQ)localObject1).aCU()) {
          localbyz2 = byv.bFN().bFO();
          if (localbyz2.c(dKm.lXP)) {
            return false;
          }
          localArrayList2 = localdSz.a(((aqQ)localObject1).aCX(), ((aqQ)localObject1).aCY(), 0.0F, bYP.hoG);
          localcjK1 = (localArrayList2 != null) && (!localArrayList2.isEmpty()) ? (DisplayedScreenElement)localArrayList2.get(0) : null;

          if (localcjK1 == null)
          {
            return false;
          }
          localObject2 = localcjK1.bpc();
          localObject3 = new cYk(((ScreenElement)localObject2).ddI(), ((ScreenElement)localObject2).ddJ(), ((ScreenElement)localObject2).ddH());

          localObject4 = new crM();
          ((crM)localObject4).S((cYk)localObject3);
          byv.bFN().aJK().d((cWG)localObject4);
        }

        if (dbL.cNv().oN(dML) != null) {
          try {
            dbL.cNv().oO(dML);
          } catch (Exception localException) {
            K.error("Exception", localException);
          }
        }
        this.dMK = false;
        return false;
      }

      localArrayList1 = ((aTL)localdSz).bT(dyx, dyy);
      if ((!localArrayList1.isEmpty()) && (((aqQ)localObject1).aCW())) {
        k = 0; for (n = localArrayList1.size(); k < n; k++) {
          if ((localArrayList1.get(k) instanceof cew))
          {
            localObject2 = (cew)localArrayList1.get(k);
            localObject3 = ((cew)localObject2).cbD();
            if (((Su)localObject3).c(cfY.hCg)) {
              localObject3 = ((Su)localObject3).adL();
            }
            if (localObject3 != null)
            {
              if (((Su)localObject3).aeR() == cUs.getId()) {
                aKj.bbx().ah((Su)localObject3);
                break;
              }
            }
          }
        }
      }
      return false;
    case 18013:
      aJd();
      return false;
    case 18000:
      return aJb();
    case 16713:
      aJc();
      return false;
    }

    return true;
  }

  private boolean aJb() {
    if ((cUs != null) && 
      (!cUs.aEt().dtr())) {
      return true;
    }

    byz localbyz = byv.bFN().bFO();
    if (localbyz.c(dKm.lXR)) {
      return true;
    }

    this.dMJ = cBQ.cxL().a(bU.fH().getString("question.giveUpFight"), Cn.et(0), 2073L, 102, 1);

    this.dMJ.a(new dLN(this));

    return false;
  }

  private boolean b(aqQ paramaqQ) {
    byz localbyz = byv.bFN().bFO();
    if (localbyz.aeQ() == null) {
      K.warn("Ciblage de case hors combat. On désenclenche le mode ciblage de case");
      aJd();
      return false;
    }
    dSz localdSz = WakfuClientInstance.awy().Dg();
    ArrayList localArrayList = localdSz.a(paramaqQ.aCX(), paramaqQ.aCY(), 0.0F, bYP.hoG);
    Object localObject = (localArrayList != null) && (localArrayList.size() != 0) ? (DisplayedScreenElement)localArrayList.get(0) : null;

    if (localObject != this.cgj) {
      if (localObject != null) {
        dbL.cNv().oO(dML);
        dbL.cNv().h(localObject.bpf(), dML);
        dbL.cNv().oN(dML).g(dMM);
      }
      this.cgj = localObject;
    }
    return false;
  }

  private static void aJc() {
    if (cUs != null) {
      byz localbyz = byv.bFN().bFO();
      if (localbyz.c(dKm.lXQ))
        return;
      boolean bool = !aJf();
      dtV.proceedHideFightOccluders(bool);
      WakfuClientInstance.awy().awB().a(bmz.fEt, bool);
    }
  }

  public boolean aJd()
  {
    if (this.dMK) {
      dbL.cNv().oO(dML);
    }

    aYX.bnY().bod();
    this.dMK = (!this.dMK);
    return this.dMK;
  }

  public boolean aJe()
  {
    return this.dMK;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      bQK.bXG().g(null);
      acL.apd().g(null);
      bVl.caZ().g(null);

      if (dbL.cNv().oN(dML) == null) {
        try {
          dbL.cNv().oL(dML);
        } catch (Exception localException) {
          K.error("Exception", localException);
        }

      }

      this.dMK = false;

      bEs.bMK().e("fight", true);
      bEs.bMK().e("world", false);

      Dj.My().setVisible(false);

      dLE.doY().t("isInFight", Boolean.valueOf(true));
      dLE.doY().t("isInFightPlayerTurn", Boolean.valueOf(false));

      dLE.doY().t("controlCenterDisplayMode", Integer.valueOf(0));

      cBQ.cxL().j("wakfu.fightAction", dux.class);

      aIH localaIH = WakfuClientInstance.awy().awB();
      bOq.bVv().L(localaIH.a(bmz.fEz));

      cBQ.cxL().j("wakfu.controlCenterFight", aju.class);
      cBQ.cxL().j("wakfu.fightCreationOrPlacement", dbj.class);

      byz localbyz = byv.bFN().bFO();

      dpr localdpr = localbyz.bGD();
      localdpr.cWW();
      if ((localaIH.a(bmz.fEH)) && (localdpr.cWy() == aFy.ebG))
      {
        localdpr.d(aFy.ebH);
      }

      cUs = localbyz.aeQ();

      if (!cUs.aEt().dtp()) {
        br("worldAndFightBarDialog");
      }
      dLE.doY().t("isInFightPlacement", Boolean.valueOf(cUs.aEt().dtp()));
      Bf.Kk().au(false);
      boolean bool1 = cUs.aEt().dtr();
      dLE.doY().c("canGiveUpFight", Boolean.valueOf(bool1), true);
      boolean bool2 = cUs.aEt().dtx();
      dLE.doY().c("fight.velocity.enable", Boolean.valueOf(bool2), true);
      dLE.doY().t("cellReportDisabled", Boolean.valueOf(localbyz.c(dKm.lXP)));
      dLE.doY().t("lockFightDisabled", Boolean.valueOf(localbyz.c(dKm.lXO)));
      dLE.doY().t("callHelpDisabled", Boolean.valueOf(localbyz.c(dKm.lXN)));
      dLE.doY().t("hideFightersDisabled", Boolean.valueOf(localbyz.c(dKm.lXQ)));
      dLE.doY().t("giveUpDisabled", Boolean.valueOf(localbyz.c(dKm.lXR)));
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      aTL localaTL = (aTL)WakfuClientInstance.awy().Dg();
      localaTL.dW(false);
      localaTL.dX(false);

      this.dMS = null;
      aJi();

      this.dMQ = false;

      cmI.cnw().a(null);

      if (this.dMR.eX()) {
        localObject = new sd(this.dMR);
        cjO.clE().j((cWG)localObject);
        this.dMR.h(false);
      }

      dbL.cNv().oM(dML);

      a(null);
      c(null);

      dLE.doY().t("isInFight", Boolean.valueOf(false));
      dLE.doY().t("isInFightPlacement", Boolean.valueOf(false));

      bEs.bMK().e("fight", false);
      bEs.bMK().e("world", true);

      Object localObject = byv.bFN().bFO();

      Dj.My().setVisible(true);

      if (localObject != null) {
        dpr localdpr = ((byz)localObject).bGD();
        localdpr.cWB();
        aIH localaIH = WakfuClientInstance.awy().awB();
        if (localaIH.a(bmz.fEH)) {
          localdpr.d(aFy.ebG);
        }
        localdpr.cWW();
      }

      cBQ.cxL().mN("wakfu.fightAction");
      cBQ.cxL().mN("wakfu.controlCenterFight");

      Bf.Kk().au(true);
      byv.bFN().ay(byv.bFN().bFO());

      cUs = null;
    }
  }

  public void c(aAn paramaAn) {
    a(paramaAn, null);
  }

  public static void a(aAn paramaAn, cYk paramcYk) {
    if ((paramaAn != null) && (!byv.bFN().c(dFM.dhf()))) {
      dle localdle = paramaAn.axG();
      if ((localdle instanceof Su)) {
        if (paramcYk == null)
          dMO.a(paramaAn, (Su)localdle);
        else {
          dMO.a(paramaAn, (Su)localdle, paramcYk);
        }
        return;
      }
      if (localdle == null)
        K.error("Owner du piège est null");
      else {
        K.error("ClassCastException attendu=CharacterInfo : " + localdle.getClass());
      }
    }

    dMO.apj();
  }

  public static void a(beb parambeb) {
    if (parambeb != null) {
      dMN.a(parambeb, (Su)parambeb.axG());
    } else {
      dMN.apk();
      dMN.apj();
    }
  }

  private cYk a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    if ((this.dMS == null) && (cUs != null)) {
      this.dMS = new dGp(cUs.getId(), null);
    }
    ArrayList localArrayList = bYZ.a(WakfuClientInstance.awy().Dg(), paramInt1, paramInt2, paramBoolean1, paramBoolean2, this.dMS);
    if ((localArrayList == null) || (localArrayList.size() == 0)) {
      return null;
    }
    for (cYk localcYk : localArrayList) {
      if (dbL.cNv().B(localcYk)) {
        return localcYk;
      }
    }
    return (cYk)localArrayList.get(0);
  }

  public void cW(boolean paramBoolean) {
    if (cUs == null) {
      return;
    }

    ArrayList localArrayList = new ArrayList(500);
    bQK.bXG().af(localArrayList);
    dps.cXa().af(localArrayList);
    bVl.caZ().af(localArrayList);
    acL.apd().af(localArrayList);

    int i = cUs.getId();
    int j = localArrayList.size(); for (int k = 0; k < j; k++) {
      ahm localahm = (ahm)localArrayList.get(k);
      if (localahm.aeR() == i)
        a((ahm)localArrayList.get(k), paramBoolean);
    }
  }

  private void a(ahm paramahm, boolean paramBoolean)
  {
    if ((paramahm instanceof cew)) {
      e(((cew)paramahm).cbD(), paramBoolean);
      return;
    }
    b(paramahm, paramBoolean);
  }

  private static void e(Su paramSu, boolean paramBoolean) {
    cew localcew = paramSu.aeL();
    if (paramSu.bnX()) {
      if (paramSu.aef())
        localcew.aw(paramBoolean ? 0.2F : 0.4F);
    }
    else
      b(localcew, paramBoolean);
  }

  private static void b(ahm paramahm, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramahm.aw(0.5F);
    } else {
      paramahm.aw(paramahm.atD());
      paramahm.atC();
    }
  }

  public static void ae(Su paramSu) {
    if ((cUs == null) || (paramSu.aeR() != cUs.getId())) {
      return;
    }
    e(paramSu, aJf());
  }

  private static boolean aJf() {
    return WakfuClientInstance.awy().awB().a(bmz.fEt);
  }

  public void i(ahm paramahm) {
    if ((cUs == null) || (paramahm.aeR() != cUs.getId())) {
      return;
    }
    a(paramahm, aJf());
  }

  public void aJg() {
    fN("worldAndFightBarDialog");
  }

  private static void fN(String paramString) {
    byz localbyz = byv.bFN().bFO();

    arl localarl = localbyz.aeQ();
    if (localarl == null) {
      return;
    }

    zu localzu = localarl.aDp();
    if (localzu == null) {
      return;
    }

    cpa localcpa = cBQ.cxL().coO().nf(paramString);
    if (localcpa == null) {
      return;
    }

    dOc localdOc1 = null;
    switch (dLO.dBk[localarl.aEu().ordinal()]) {
    case 1:
      localdOc1 = (dOc)localcpa.fi("readyForFightButton");
      break;
    case 2:
      if (localzu.Ia() == localbyz)
        localdOc1 = (dOc)localcpa.fi("endTurnButton"); break;
    default:
      localdOc1 = null;
    }

    if ((localdOc1 == null) || (!localdOc1.getVisible())) {
      return;
    }

    bNa localbNa1 = new bNa(0.531F, 0.812F, 0.835F, 1.0F);
    bNa localbNa2 = new bNa(bNa.gRx.get());

    localdOc1.getAppearance().a(new gm(localbNa2, localbNa1, localdOc1.getAppearance(), 0, 500, 12, ddp.kWG));

    dOc localdOc2 = (dOc)localcpa.fi("apsContainer");
    localdOc2.setVisible(true);
  }

  public static boolean aJh()
  {
    if (cUs == null) {
      return false;
    }

    dMP.apj();
    Su localSu = (Su)cUs.x(aUg);
    if (localSu != null) {
      return dMP.aT(localSu);
    }
    return false;
  }

  public static void aJi() {
    dMP.apj();
  }

  public static void t(cYk paramcYk)
  {
    if (byv.bFN().bFO().aeQ() == null) {
      K.warn("message recu par UIFightFrame hors combat");
      return;
    }

    if (cUs.aEu() != dzm.lFK) {
      return;
    }

    if ((paramcYk != null) && (!paramcYk.equals(aUg))) {
      aUg.ae(paramcYk);

      bzu localbzu = new bzu();
      localbzu.d(18015);
      cjO.clE().j(localbzu);
    }
  }

  public void cX(boolean paramBoolean) {
    if (cUs != null)
      this.dMQ = paramBoolean;
  }

  public static void b(Su paramSu, boolean paramBoolean)
  {
    if (cUs != null)
      cUs.aDp().b(paramSu, paramBoolean);
  }

  private void br(String paramString)
  {
    cpa localcpa = cBQ.cxL().coO().nf(paramString);
    if (localcpa != null) {
      dOc localdOc = (dOc)localcpa.fi("apsContainer");
      if (localdOc != null)
        localdOc.setVisible(false);
    }
  }

  static
  {
    dMI = new axB();

    K = Logger.getLogger(axB.class);

    cUs = null;
    aUg = new cYk();

    dML = "targetCell";
    dMM = new float[] { 0.9F, 0.9F, 0.9F, 0.5F };

    dMN = dyY.dcU();
    dMO = bCm.bKT();

    dMP = new cry();

    aTL localaTL = (aTL)WakfuClientInstance.awy().Dg();
    localaTL.a(dMP);
    localaTL.a(dMN);
    localaTL.a(dMO);
  }
}