import com.ankamagames.framework.script.libraries.scriptedAction.ScriptedActionFunctionsLibrary;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class dDH
  implements cvW
{
  private static final Logger K = Logger.getLogger(dDH.class);

  private static final dDH lLV = new dDH();
  private long lLW;
  private long lLX;

  public static dDH dfA()
  {
    return lLV;
  }

  public long dfB()
  {
    return this.lLW;
  }

  public long dfC() {
    return this.lLX;
  }

  public boolean a(cWG paramcWG) {
    byv localbyv = byv.bFN();
    WakfuClientInstance localWakfuClientInstance = WakfuClientInstance.awy();
    Object localObject1;
    Object localObject2;
    Object localObject4;
    Object localObject8;
    Object localObject12;
    Object localObject15;
    Object localObject16;
    Object localObject10;
    Object localObject6;
    Object localObject3;
    Object localObject13;
    int i2;
    long l2;
    Object localObject7;
    Object localObject9;
    Object localObject11;
    Object localObject14;
    switch (paramcWG.getId())
    {
    case 4098:
      localObject1 = (buY)paramcWG;

      localObject2 = ((buY)localObject1).bCJ();

      dwF.dbS().removeAll();
      for (int m = 0; m < ((buY)localObject1).bCK().length; m++) {
        dwF.dbS().kr(localObject1.bCK()[m]);
      }

      aWc.blo().el(false);

      dLE.doY().t("isAlive", Boolean.valueOf(true));

      bGP.a(new aiQ(this));

      localObject4 = new byz();
      ((byz)localObject4).aei();
      ((byz)localObject4).q((byte[])localObject2);

      aWc.blo().el(true);

      dpQ.cXg().a(aca.aoj());

      duB.dai().cf(((byz)localObject4).getName());

      aIH localaIH = localWakfuClientInstance.awB();
      bOU.gUc.aKL();
      localObject8 = new cVA(((byz)localObject4).getName());
      localaIH.c((ciW)localObject8);
      try {
        ((ciW)localObject8).load();
      } catch (IOException localIOException) {
        K.warn("Problème au chargement du PreferenceStore", localIOException);
      }
      bOZ.bVO();

      ((byz)localObject4).bHb().fO().a((dIX)localObject4);
      localbyv.c((byz)localObject4);

      int i4 = ((byz)localObject4).d(eu.ayM).acU();
      ((byz)localObject4).initialize();

      for (dmn localdmn = dsh.luB.cgk(); localdmn.hasNext(); ) {
        localdmn.fl();
        ((aYr)localdmn.value()).c(new AV((aYr)localdmn.value()));
        ((aYr)localdmn.value()).a(aem.cVj);
      }

      dtP.lwZ.kl(((byz)localObject4).getId());
      czd.inP.b(dFa.lOv);
      ((byz)localObject4).zV(i4);

      localbyv.ay((Su)localObject4);

      ((byz)localObject4).afs().cgt();
      aiM.dgK.avA();

      aWc.blo().blt();

      cFD.iAd.init();

      bAq.gpk = true;
      this.lLW = cAo.cxf().a(new aiG(this, localbyv), 300000L, 159159160, -1);

      this.lLX = cAo.cxf().a(new aiE(this, localbyv), 4000L, 159159161);

      dLE.doY().t("isInDimensionalBag", Boolean.valueOf(false));
      try
      {
        if (localaIH.a(bmz.fEa)) {
          aAx.aMd().aMu();
          localaIH.a(bmz.fEa, false);
        }
        aQL.bhn();
      } catch (Exception localException) {
        K.error("Erreur à l'initialisation du chat, impossible de le charger : " + localException.getMessage());
      }
      ((byz)localObject4).aej();
      return false;
    case 4128:
      localObject1 = (bFl)paramcWG;

      localObject2 = byv.bFN().bFO().bHg();
      if (localObject2 != null) {
        bnc.bxw().ql(((arl)localObject2).getId());
        localObject4 = new aKe();
        ((aKe)localObject4).execute();
      }
      b(localbyv);

      return false;
    case 4100:
      localObject1 = (bOI)paramcWG;

      short s1 = bOh.D();

      cBQ.cxL().cya();
      WakfuClientInstance.awy().awW();

      ayg.aJQ().clear();
      if (byv.bFN().c(dCr.deY())) {
        byv.bFN().b(dCr.deY());
      }
      bOh.clear();

      localObject4 = AA.JB();
      ((Su)localObject4).JF().a(((Su)localObject4).JF().aQJ(), ((bOI)localObject1).bCJ());
      ((Su)localObject4).JF().a(((Su)localObject4).JF().aQI(), ((bOI)localObject1).bCJ());
      ((Su)localObject4).JF().a(((Su)localObject4).JF().aQM(), ((bOI)localObject1).bCJ());

      short s2 = ((Su)localObject4).Lk();

      ayg.aJQ().b(localbyv.bFO());

      duB.dai().Y(s2);

      localObject8 = bDk.bLI().cr(s2);
      boolean bool2 = Vr.cAl.ai(s2);
      if (!bool2) {
        bOh.a(s2, cDD.czz());
      }
      dLE.doY().t("isInHavenWorld", Boolean.valueOf(bool2));

      dO.hI().h(s2);
      cCZ.cyZ().bLJ();
      aaX.anG().hB(s2);
      localObject12 = ((Su)localObject4).ML();

      KP.bXy.aM(-1);

      cSE.kEZ.clear();
      localObject15 = ((bOI)localObject1).bVE();
      for (localObject16 = ((ArrayList)localObject15).iterator(); ((Iterator)localObject16).hasNext(); ) { byte[] arrayOfByte = (byte[])((Iterator)localObject16).next();
        localObject17 = (ayn)cBP.isO.N(ByteBuffer.wrap(arrayOfByte));
        cSE.kEZ.i((ayn)localObject17);
      }
      Object localObject17;
      localObject16 = ((bOI)localObject1).bVF();
      for (int i8 = ((ArrayList)localObject16).size() - 1; i8 >= 0; i8--) {
        localObject17 = (bkQ)((ArrayList)localObject16).get(i8);
        if (((bkQ)localObject17).UI() != null)
        {
          if (((bkQ)localObject17).UI().aMO().a(((bkQ)localObject17).getId())) {
            n.b(((bkQ)localObject17).getId(), ((bkQ)localObject17).CC());
            n.d(((bkQ)localObject17).getId(), ((bkQ)localObject17).aAQ());
          } else {
            n.c((bkQ)localObject17);
          }
        }
      }
      byJ.gma.rD(s2);
      if (s1 != s2) {
        bUH.caG().a(ack.cRi);
        bUH.caG().caK();
      }

      bzZ.goz.bIx();
      dDE.dft().b(bzZ.goz);
      dDE.dft().b(xV.GU());
      xV.GU().am(false);
      boolean bool3 = ((dUx)localObject8).mrS;
      if (bool3) {
        bzZ.goz.rP(86400);
        bzZ.goz.d(dDE.dft());
        dDE.dft().a(bzZ.goz);
        dDE.dft().a(xV.GU());
        xV.GU().am(true); } dDE.dft().a(buU.geA);
      dLE.doY().t("wakfuEcosystemEnabled", Boolean.valueOf(false));
      dLE.doY().t("isInExterior", Boolean.valueOf(bool3));
      dLE.doY().t("isInWakfuStasisInstance", Boolean.valueOf(((dUx)localObject8).mrW));
      dLE.doY().t("player.displayStates", Boolean.valueOf(true));
      dLE.doY().t("osamodasSymbiotCreatureCapturedState", Boolean.valueOf(false));
      dLE.doY().t("havenWorld", null);
      boolean bool4;
      try { bool4 = ay.bd().getBoolean("activateStuffPreview");
      } catch (bdh localbdh) {
        bool4 = false;
      }
      dLE.doY().t("stuffPreviewActivated", Boolean.valueOf(bool4));

      if (!localbyv.c(dAy.ddT())) {
        localbyv.a(dAy.ddT());
      }
      if (!localbyv.c(bCY.bLy())) {
        localbyv.a(bCY.bLy());
      }
      if (!localbyv.c(asf.aED())) {
        localbyv.a(asf.aED());
      }
      if (!localbyv.c(aaF.cOY)) {
        localbyv.a(aaF.cOY);
      }
      if (!localbyv.c(dME.dpt())) {
        localbyv.a(dME.dpt());
      }
      if (!localbyv.c(avx.aHt())) {
        localbyv.a(avx.aHt());
      }
      if (!localbyv.c(Rl.acN())) {
        localbyv.a(Rl.acN());
      }
      if (!localbyv.c(cqu.cpE())) {
        localbyv.a(cqu.cpE());
      }
      if (!localbyv.c(btv.bBS())) {
        localbyv.a(btv.bBS());
      }
      if (!localbyv.c(zV.IH())) {
        localbyv.a(zV.IH());
      }
      if (!localbyv.c(beK.bsq())) {
        localbyv.a(beK.bsq());
      }
      if (!localbyv.c(ceb.cgG())) {
        localbyv.a(ceb.cgG());
      }
      if (!localbyv.c(daO.cML())) {
        localbyv.a(daO.cML());
      }
      if (!localbyv.c(arD.aDU())) {
        localbyv.a(arD.aDU());
      }
      if (!localbyv.c(cIW.cDt())) {
        localbyv.a(cIW.cDt());
      }

      if (!localbyv.c(dfJ.cPu())) {
        localbyv.a(dfJ.cPu());
      }
      if (!localbyv.c(dnW.loj)) {
        localbyv.a(dnW.loj);
      }
      if (!localbyv.c(coC.coE())) {
        localbyv.a(coC.coE());
      }
      if (!localbyv.c(cLQ.cEP())) {
        localbyv.a(cLQ.cEP());
      }
      if (!localbyv.c(azE.aLy())) {
        localbyv.a(azE.aLy());
      }
      if (!localbyv.c(dzx.dcY())) {
        localbyv.a(dzx.dcY());
      }
      if (!localbyv.c(dFn.dgL())) {
        localbyv.a(dFn.dgL());
      }
      if (!localbyv.c(DI.MJ())) {
        localbyv.a(DI.MJ());
      }
      if (!localbyv.c(bNx.bVf())) {
        localbyv.a(bNx.bVf());
      }
      if (!localbyv.c(bMK.bUv())) {
        localbyv.a(bMK.bUv());
      }
      if (!localbyv.c(rS.ys())) {
        localbyv.a(rS.ys());
      }
      if (!localbyv.c(dNM.meo)) {
        localbyv.a(dNM.meo);
      }
      if (!localbyv.c(bSc.bYV())) {
        localbyv.a(bSc.bYV());
      }
      if (!localbyv.c(aCg.aOq())) {
        localbyv.a(aCg.aOq());
      }
      if (!localbyv.c(dCq.lKJ)) {
        localbyv.a(dCq.lKJ);
      }
      if (!localbyv.c(lG.aPk)) {
        localbyv.a(lG.aPk);
      }
      if (!localbyv.c(apj.dvf)) {
        localbyv.a(apj.dvf);
      }
      if (!localbyv.c(sH.bbP)) {
        localbyv.a(sH.bbP);
      }
      if (!localbyv.c(bro.fMT)) {
        localbyv.a(bro.fMT);
      }
      if (!localbyv.c(bFo.gAq)) {
        localbyv.a(bFo.gAq);
      }
      if (!localbyv.c(ahA.ddk)) {
        localbyv.a(ahA.ddk);
      }
      if (!localbyv.c(Nw.ZC())) {
        localbyv.a(Nw.ZC());
      }

      if (!localbyv.c(Bf.Kk())) {
        localbyv.a(Bf.Kk());
      }

      bEs.bMK().ay(true);

      akb.dkL.a(atY.dFW);

      dSz localdSz = localWakfuClientInstance.Dg();

      localdSz.cKV().R(false);

      if (bool3) {
        btL.gcv.a(bzZ.goz);
        btL.gcv.a(aOf.eup);
      }

      byz localbyz2 = byv.bFN().bFO();
      cew localcew = localbyz2.aeL();
      localcew.atw();
      dlw.cTl().cTm();
      bSH.bZs().ct(s2);
      cCZ.cyZ().ct(s2);
      Dj.My().removeAll();
      bSH.bZs().bLW();
      dO.hI().clear();
      Xm.cHv.clear();
      aWc.blo().blM();
      bdB.b(localcew);

      bOh.a(localdSz, ((cYk)localObject12).getX(), ((cYk)localObject12).getY(), ((cYk)localObject12).IB());

      ayg.aJQ().c(((Su)localObject4).fa(), ((Su)localObject4).fb(), true);

      dO.hI().j(ayg.aJQ().aJU(), ayg.aJQ().aJV());
      acn.aoA().a((dUx)localObject8);
      cMI.krY.initialize();

      if (localbyz2 != null) {
        localbyz2.aei();
        if (CA.Lv().bj(localbyz2.getId()) == null) {
          CA.Lv().p(localbyz2);
        }
        localcew.setVisible(true);
        localcew.asZ();

        localcew.b(ayg.aJQ());
        localbyz2.n(((Su)localObject4).ML());
        localcew.a(ayg.aJQ());

        localbyz2.c(((Su)localObject4).E());

        localcew.a(bz.kt);

        localcew.fE(true);
        localcew.E(localbyz2);
        localbyz2.Y(s2);

        localcew.cht();

        bQK.bXG().d(localcew);

        bSH.bZs().gu(localbyz2.getId());

        localdSz.c(localcew);
        localdSz.apH();

        aWc.blo().blN();

        int i9 = localbyz2.d(eu.ayM).acU();
        localbyz2.f(localbyz2.bEY());
        localbyz2.d(eu.ayM).set(i9);

        if (s2 == 9) {
          localObject18 = localbyz2.bHa();

          btb.bBd().a((aHT)localObject18);
          btb.bBd().a((dTz)localObject18);

          ((dwN)localObject18).dbU();
          ((dUx)localObject8).Ed(((dwN)localObject18).awv());
          bLY.bTB().c((dwN)localObject18);
        }

        bLY.bTB().e(localcew);
        localdSz.iO(true);

        localObject18 = new aiD(this, localdSz, localbyz2, (dUx)localObject8, localWakfuClientInstance, localcew, (cYk)localObject12);

        if (IH.Sd().Se()) {
          IH.Sd().a((dnV)localObject18);
        } else {
          ((dnV)localObject18).Hi();
          ((dnV)localObject18).Hl();
          ((dnV)localObject18).Hj();
        }
      } else {
        K.error("Il n'y a aucun localPlayer de défini, il n'est pas possible d'entrer dans le monde !");
      }
      localdSz.ax(true);

      gA localgA = (gA)localbyz2.ayJ().dB((short)azO.dRT.hV);
      if ((localgA != null) && (localgA.nI())) {
        localObject18 = localgA.nJ();
        localbyz2.c(((cUb)localObject18).cJh().getId(), ((cUb)localObject18).cJi(), ((cUb)localObject18).cJk(), ((cUb)localObject18).cJq(), ((cUb)localObject18).aGa());
      }

      localbyz2.fD(true);

      localbyz2.adp();
      localbyz2.adq();

      buj.bCk().setEnabled(true);

      ckU.cmE().done();

      cBQ.cxL().j("wakfu.windowStick", dek.class);

      cHT.iDr.cCi();

      bOU.gUc.b(new cgY(s1, s2));

      Object localObject18 = new aiw();
      ((aiw)localObject18).setLocale(bU.fH().ajJ().cAZ());
      byv.bFN().aJK().d((cWG)localObject18);
      localbyz2.aej();
      return false;
    case 4106:
      localObject1 = bU.fH().getString("player.unstuck");
      qS((String)localObject1);

      return false;
    case 10004:
      localObject1 = (aBB)paramcWG;
      K.debug("PERSONAL_SPACE_ENTER_RESULT_MESSAGE (success=" + ((aBB)localObject1).aNI() + ")");

      byz localbyz1 = localbyv.bFO();

      if (((aBB)localObject1).aNI())
      {
        if (((aBB)localObject1).aNL()) {
          localObject4 = localbyz1.bHb();
          ((dwN)localObject4).kL(((aBB)localObject1).aNN());
          ((dwN)localObject4).kM(((aBB)localObject1).aNM());
          ((dwN)localObject4).BT(((aBB)localObject1).aNK());
        } else {
          localObject4 = new dwN();
          ((dwN)localObject4).a(((aBB)localObject1).aNJ());
        }
        Ql.cpm.U(localbyz1.Lk());

        dLE.doY().t("isInDimensionalBag", Boolean.valueOf(true));
        localbyz1.b((dwN)localObject4);
        localbyv.a(EP.Oe());

        localbyv.b(dFF.dgY());

        if (((aBB)localObject1).aNL())
          buj.bCk().a(cED.iyy, null);
      }
      else
      {
        localbyz1.aeL().eq("AnimStatique");

        if (((aBB)localObject1).aNL()) {
          ayg.aJQ().dx(0L);
        }

        localbyv.bFO().fC(false);
      }
      return false;
    case 10006:
      K.debug("PERSONAL_SPACE_LEAVE_RESULT_MESSAGE");

      localObject1 = localbyv.bFO();
      btb.bBd().b(((byz)localObject1).bHa());
      btb.bBd().b(((byz)localObject1).bHa());
      localbyv.b(dFk.dgK());
      localbyv.b(cHX.cCk());
      localbyv.b(bLT.bTA());
      localbyv.b(rX.yA());
      localbyv.b(abl.anK());
      if (cBQ.cxL().mZ("exchangeDialog")) {
        localbyv.b(bQs.bXv());
      }
      if (localbyv.c(dxP.dcE())) {
        localbyv.b(dxP.dcE());
      }
      cqu.cpE().alK();
      if (cBQ.cxL().mZ("dimensionalBagFleaHistoryDialog")) {
        cBQ.cxL().mW("dimensionalBagFleaHistoryDialog");
      }

      bLY.bTB().bTD();
      dLE.doY().t("isInDimensionalBag", Boolean.valueOf(false));

      localbyv.b(EP.Oe());

      return false;
    case 6322:
      localObject1 = (apW)paramcWG;
      int i = ((apW)localObject1).Vc();
      localObject4 = (doA)bsj.bAv().kD(i);
      if (localObject4 != null) {
        aVc localaVc = ((doA)localObject4).aO();
        localaVc.b(byv.bFN().bFO().adW());
        localaVc.q(((apW)localObject1).Vd());
        localObject8 = CA.Lv().bj(((apW)localObject1).gA());
        ((Su)localObject8).aeL().b((doA)localaVc, false);
        ((Su)localObject8).ayK().F(localaVc);
      }
      return false;
    case 6324:
      localObject1 = (blA)paramcWG;
      long l1 = ((blA)localObject1).gA();
      long l4 = ((blA)localObject1).bwK();
      localObject10 = CA.Lv().bj(l1);
      if (localObject10 != null) {
        localObject12 = ((Su)localObject10).ayK().kw(l4);
        if (localObject12 != null)
          ((Su)localObject10).n((aVc)localObject12);
        else
          K.error("Réception d'un RunningEffectWorldUnapplicationMessage pour un runningEffect d'uid=" + l4 + " que le characterInfo=[" + localObject10 + "] ne possède pas");
      }
      else
      {
        K.error("Réception d'un RunningEffectWorldUnapplicationMessage pour un characterinfo inconnu d'id=" + l1);
      }
      return false;
    case 6320:
      localObject1 = (bmn)paramcWG;
      int j = ((bmn)localObject1).bxg().bJ();

      localObject4 = (uY)bsj.bAv().kD(((bmn)localObject1).Vc());
      if (localObject4 == null) {
        K.error("Impossible d'instancier un runningEffect :" + ((bmn)localObject1).Vc() + " inconnu");
        return false;
      }

      if (((bmn)localObject1).aGO() != null) {
        for (localObject6 = ((bmn)localObject1).aGO().iterator(); ((Iterator)localObject6).hasNext(); ) { localObject8 = (cFc)((Iterator)localObject6).next();

          localObject10 = (byte[])((cFc)localObject8).cAE();
          long l6 = ByteBuffer.wrap((byte[])localObject10).getLong();
          localObject16 = CA.Lv().bj(l6);

          bSA localbSA = new bSA(((bmn)localObject1).bQX(), j, ((Integer)((cFc)localObject8).getFirst()).intValue(), (uY)localObject4, ((bmn)localObject1).Vd(), ((bmn)localObject1).aGP(), (byte[])localObject10);
          localbSA.ua(((Integer)((cFc)localObject8).Lp()).intValue());
          localbSA.c(new hQ[] { new ScriptedActionFunctionsLibrary(localbSA.bZv()) });
          if ((localObject16 == null) || (!((Su)localObject16).adF()))
            dwj.dbl().d(localbSA);
          else
            bnc.bxw().a(((Su)localObject16).aeR(), localbSA);
        }
      }
      else
      {
        localObject6 = new bSA(((bmn)localObject1).bQX(), j, ((bmn)localObject1).eo(), (uY)localObject4, ((bmn)localObject1).Vd(), ((bmn)localObject1).aGP(), null);
        ((bSA)localObject6).ua(((bmn)localObject1).czG());

        dwj.dbl().d((bSR)localObject6);
        ((bSA)localObject6).c(new hQ[] { new ScriptedActionFunctionsLibrary(((bSA)localObject6).bZv()) });
      }

      dwj.dbl().cZI();
      return false;
    case 6300:
      dwj.dbl().cZI();

      return false;
    case 5242:
      localObject1 = (bjG)paramcWG;
      localObject3 = bU.fH().getString("offlineFlea.transactionSummary", new Object[] { Integer.valueOf(((bjG)localObject1).buU()), Long.valueOf(((bjG)localObject1).buT()) });
      qS((String)localObject3);

      return false;
    case 5244:
      localObject1 = (aZW)paramcWG;
      localObject3 = Hh.QM().dh(((aZW)localObject1).aFY());
      localObject4 = ((bBn)localObject3).getName();
      localObject6 = bU.fH().getString("onlineFlea.transaction", new Object[] { Short.valueOf(((aZW)localObject1).nP()), localObject4, Long.valueOf(((aZW)localObject1).boV()) });
      qS((String)localObject6);

      return false;
    case 2061:
      localObject1 = (mo)paramcWG;

      switch (((mo)localObject1).tY()) {
      case 0:
        localObject3 = ((mo)localObject1).getMessage();
        break;
      case 1:
        localObject3 = bU.fH().getString("error.chat.userNotFound", new Object[] { "" });
        break;
      default:
        return false;
      }

      qS((String)localObject3);

      return false;
    case 4214:
      localObject1 = (bvT)paramcWG;
      if ((byv.bFN().c(aUK.bjU())) && (((bvT)localObject1).bDL()))
      {
        return true;
      }

      localObject3 = aTb.c((bvT)localObject1);
      dwj.dbl().d((bSR)localObject3);

      localObject4 = YJ.b((bvT)localObject1);
      for (localObject13 : localObject4) {
        dwj.dbl().d((bSR)localObject13);
      }

      dwj.dbl().cZI();
      return false;
    case 15001:
      localObject1 = (anl)paramcWG;
      localObject3 = ((anl)localObject1).azV();
      int n = ((cYq)localObject3).getHours();
      i2 = ((cYq)localObject3).getMinutes();
      boolean bool1 = ((anl)localObject1).azW();
      float f = ((anl)localObject1).azX();
      localObject13 = new StringBuffer();

      if (f < 10.0F)
        ((StringBuffer)localObject13).append(bool1 ? bU.fH().getString("calendar.day.starting") : bU.fH().getString("calendar.night.starting"));
      else if (f > 90.0F)
        ((StringBuffer)localObject13).append(bool1 ? bU.fH().getString("calendar.day.ending") : bU.fH().getString("calendar.night.ending"));
      else {
        ((StringBuffer)localObject13).append(bool1 ? bU.fH().getString("calendar.day.during") : bU.fH().getString("calendar.night.during"));
      }

      ((StringBuffer)localObject13).append(", ");
      ((StringBuffer)localObject13).append(bU.fH().getString("calendar.timeNotice", new Object[] { n < 10 ? "0" + n : Integer.valueOf(n), i2 < 10 ? "0" + i2 : Integer.valueOf(i2) }));

      qS(((StringBuffer)localObject13).toString());
      return false;
    case 9301:
      localObject1 = (aqY)paramcWG;
      localObject3 = QI.cpK.gq(((aqY)localObject1).aDi());
      if (localObject3 == null) {
        K.warn("On reçoit un update de chaos de territoire pour un territoire non chargé.");
        return false;
      }

      if (((aqY)localObject1).CC())
        ((bGI)localObject3).bOz().hF();
      else {
        ((bGI)localObject3).bOz().bcL();
      }

      return false;
    case 9305:
      localObject1 = (auV)paramcWG;
      localObject3 = "";
      for (Object localObject5 = ((auV)localObject1).aHb().Vo(); ((dyO)localObject5).hasNext(); ) {
        ((dyO)localObject5).fl();
        i2 = ((dyO)localObject5).fm();
        localObject3 = (String)localObject3 + bU.fH().b(103, i2, new Object[0]);
        localObject3 = (String)localObject3 + bU.fH().getString("colon") + ((dyO)localObject5).value();
        if (((dyO)localObject5).hasNext())
          localObject3 = (String)localObject3 + ", ";
        else {
          localObject3 = (String)localObject3 + ".";
        }
      }
      localObject5 = new az(bU.fH().getString("notification.IEDestroyedTitle"), bU.fH().getString("notification.IEDestroyedText", new Object[] { localObject3 }), ana.dql);

      cjO.clE().j((cWG)localObject5);

      return false;
    case 20002:
      localObject1 = (za)paramcWG;
      l2 = ((za)localObject1).eq();
      localObject7 = ((za)localObject1).HF();

      localObject9 = byv.bFN().bFO();

      if (localObject9 == null) {
        dtP.lwZ.a(l2, new aiB(this, (byte[])localObject7));
      }
      else
      {
        int i6 = ((byz)localObject9).bP();
        ((byz)localObject9).q((byte[])localObject7);
        int i7 = ((byz)localObject9).bP();
        if (i7 != i6) {
          bOU.gUc.b(new clm(i6, i7));
        }
      }

      return false;
    case 15405:
      localObject1 = (IC)paramcWG;
      l2 = ((IC)localObject1).RY();
      localObject7 = CA.Lv().bj(l2);
      localObject9 = ((Su)localObject7).getName();
      localObject11 = bU.fH().getString(((IC)localObject1).RZ());

      localObject14 = new aEe((String)localObject9, l2, (String)localObject11);
      ((aEe)localObject14).mm(1);
      CM.LV().a((aEe)localObject14);
      return false;
    case 15802:
      localObject1 = (ceH)paramcWG;
      dFN localdFN = ((ceH)localObject1).chE();
      long l3 = ((ceH)localObject1).bvt();
      long l5 = ((ceH)localObject1).chF();

      switch (aiL.dgJ[localdFN.ordinal()]) {
      case 1:
        localObject15 = aot.dtv.cW(l5);
        localObject14 = ((cPT)localObject15).I();
        break;
      case 2:
        localObject15 = (dlz)aot.dtv.a(localdFN, l3);
        localObject16 = ((dlz)localObject15).AD((int)l5);
        localObject14 = ((agv)localObject16).I();
        break;
      case 3:
        localObject15 = (aNn)aot.dtv.a(localdFN, l3);
        localObject14 = ((aNn)localObject15).I();
        break;
      case 4:
        localObject15 = (dhD)aot.dtv.a(localdFN, l3);
        localObject14 = ((dhD)localObject15).I();
        break;
      default:
        K.error("Impossible de récupérer le LOADING correspondant au travel " + localdFN);
        return false;
      }

      c((dIk)localObject14);
      return false;
    case 15804:
      localObject1 = (bWT)paramcWG;
      int k = ((bWT)localObject1).cce();
      int i1 = ((bWT)localObject1).anL();

      localObject7 = (dQd)aKY.epr.a(cdc.hvW, k);
      w localw = ((dQd)localObject7).Dq(i1);
      localObject11 = localw.I();

      c((dIk)localObject11);
      return false;
    case 15962:
      localObject1 = (Wx)paramcWG;
      byv.bFN().bFO().bHp().cB(((Wx)localObject1).aiZ());
      return false;
    case 15776:
      ckU.cmE().ak(true).g(bU.fH().getString("charactersLoading.progress"), 0);
      return false;
    case 2065:
      localObject1 = (dCH)paramcWG;

      WakfuClientInstance.awy().awO();
      byv.bFN().a(aFi.aRF());
      byv.bFN().a(rS.ys());
      byv.bFN().a(aTd.biu());

      aPz.bgu().g(((dCH)localObject1).eq());
      aPz.bgu().cf(((dCH)localObject1).aJm());
      aPz.bgu().a(bNO.gSL);
      byv.bFN().a(aPz.bgu());

      return false;
    }

    return true;
  }

  private void b(byv parambyv) {
    byz localbyz = parambyv.bFO();

    bOU.gUc.b(new dAV(localbyz.Lk()));

    int i = bOh.D();
    K.info("on quitte le monde " + i);
    aRs.bhJ().nL(i);

    localbyz.bRE();

    cew localcew = localbyz == null ? null : localbyz.aeL();
    if (localcew != null) {
      bQK.bXG().h(localcew);
    }

    ayg.aJQ().clear();
    cFZ.cBs().clear();

    WakfuClientInstance.awy().axa();
  }

  private void qS(String paramString) {
    aEe localaEe = new aEe(paramString);
    localaEe.mm(4);
    CM.LV().ez(4).a(localaEe);
  }

  private static void c(dIk paramdIk) {
    cjY localcjY = cjY.clY();
    localcjY.lh(paramdIk.bTI());
    localcjY.jc(paramdIk.dic());
    localcjY.vp(paramdIk.clZ());
    localcjY.fm(paramdIk.cma());
  }

  public static void a(aRm[] paramArrayOfaRm, dUx paramdUx) {
    int i = paramdUx == null ? 0 : paramdUx.duA();
    dSz localdSz = WakfuClientInstance.awy().Dg();
    localdSz.dsY();

    if (i == 0) {
      return;
    }
    if (i > paramArrayOfaRm.length) {
      K.warn("trop de parallax");
    }

    for (int j = 0; j < i; j++) {
      dsO localdsO = paramdUx.Eg(j);
      paramArrayOfaRm[j].a(localdsO);
      localdSz.a(paramArrayOfaRm[j]);
    }
  }

  public long getId() {
    return 1L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    byv.bFN().a(agF.asc());
    byv.bFN().a(cNU.cFY());
    byv.bFN().a(cZp.kMU);
    byv.bFN().a(cls.hNo);
    byv.bFN().a(bPy.bWb());
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    dLE.doY().removeProperty("player.displayStates");
    dLE.doY().removeProperty("isInExterior");
    dLE.doY().removeProperty("isInWakfuStasisInstance");
    byv.bFN().b(agF.asc());
    byv.bFN().b(cNU.cFY());
    byv.bFN().b(bPy.bWb());
  }

  static
  {
    K.setLevel(Level.TRACE);
  }
}