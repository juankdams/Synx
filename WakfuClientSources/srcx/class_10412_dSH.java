import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

final class dSH
  implements dfH
{
  private static final Logger K = Logger.getLogger(dSH.class);

  public static final dSH moM = new dSH();
  private ZG dAO;
  private bqV moN = bqV.fMe;

  private Runnable moO = new aGu(this);

  public void b(aiJ paramaiJ)
  {
    if (!paramaiJ.aoq().a(byv.bFN().bFO())) {
      return;
    }

    if (cHT.iDr.xW(paramaiJ.getId())) {
      cCZ.cyZ().czb();
    }

    D localD = cHT.iDr.xP(paramaiJ.getId());
    localD.U();

    ckJ localckJ = cHT.iDr.xQ(paramaiJ.aoq().getId());
    localckJ.cmA();

    if ((paramaiJ.avy()) && (bqV.fMf.a(this.moN))) {
      this.moN = bqV.fMf;
      if (this.dAO != null) {
        this.dAO.ald();
      }

      this.dAO = aWc.blo().a(600074L, 0.4F, 100, 1500, 2200);
      DU(2200);
    }
  }

  public void c(dEE paramdEE)
  {
    if (!paramdEE.a(byv.bFN().bFO())) {
      return;
    }

    if (bqV.fMg.a(this.moN)) {
      this.moN = bqV.fMg;
      if (this.dAO != null) {
        this.dAO.ald();
      }

      this.dAO = aWc.blo().a(600075L, 0.4F, 100, 1500, 3300);
      DU(3300);
    }

    ab.bl.l(paramdEE.getId());

    ckJ localckJ1 = cHT.iDr.xQ(paramdEE.getId());
    localckJ1.cmB();

    ab.bl.aC();
    aiM.dgK.iK(paramdEE.getId());

    if (!paramdEE.dgi()) {
      return;
    }
    boolean bool = cHT.iDr.xT(paramdEE.getId());

    ckJ localckJ2 = null;

    String str1 = null;
    String str2;
    ana localana;
    if (paramdEE.dgg().um(83)) {
      str2 = bU.fH().getString("notification.questExploration");
      localana = ana.dqo;
    } else if (bool) {
      locallZ = new lZ();
      locallZ.a(bU.fH().b(62, paramdEE.getId(), new Object[0]));
      locallZ.a(" ");
      locallZ.tI().am(bNa.gRA.bUV());
      locallZ.a(bU.fH().getString("quest.result.success"));
      locallZ.tJ();
      str2 = locallZ.tP();
      localana = ana.dqp;
      localckJ2 = cHT.iDr.xQ(paramdEE.getId());

      localObject1 = new lZ();
      ((lZ)localObject1).tz().am(bNa.gRz.bUV()).a(bU.fH().b(62, paramdEE.getId(), new Object[0])).tA();
      String str3 = ((lZ)localObject1).tP();
      str1 = bU.fH().getString("quest.completedChatMessage", new Object[] { str3 });
    } else {
      str2 = bU.fH().getString("notification.achievementReward");
      localana = ana.dqo;

      bMK.bUv().a(paramdEE);
    }

    if (i(paramdEE)) {
      h(paramdEE);
    }

    lZ locallZ = new lZ();

    Object localObject1 = paramdEE.cfd();
    if (((ArrayList)localObject1).isEmpty()) {
      return;
    }

    int i = 1;
    for (Object localObject2 = ((ArrayList)localObject1).iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (acg)((Iterator)localObject2).next();
      localObject4 = ((acg)localObject3).aos();
      if (i != 0)
        i = 0;
      else {
        locallZ.a(", ");
      }
      if ((localObject4 == bSa.hbU) || (localObject4 == bSa.hbY)) {
        bBn localbBn = Hh.QM().dh(localObject3.aor()[0]);
        if (localbBn != null)
        {
          gA localgA = Hh.QM().eO(localbBn.getId());
          locallZ.a(ceb.ag(localgA));
        }
      }
      else
      {
        int j;
        if (localObject4 == bSa.hbV) {
          j = localObject3.aor()[0];
          locallZ.a(bU.fH().b(34, j, new Object[0]));
        } else if (localObject4 == bSa.hbW) {
          j = localObject3.aor()[0];
          locallZ.a(bU.fH().b(80, j, new Object[0]));
        } else if (localObject4 == bSa.hbX) {
          j = localObject3.aor()[0];
          locallZ.a(bU.fH().getString("landmark.gfx"));
        } else if (localObject4 == bSa.hbZ) {
          j = localObject3.aor()[0];
          locallZ.a(bU.fH().getString("xpGain", new Object[] { Integer.valueOf(j) }));
        } else if (localObject4 == bSa.hca) {
          j = (byte)localObject3.aor()[0];
          int k = localObject3.aor()[1];
          qE localqE = qE.z(j);
          String str4 = "aptitude.points.gain." + localqE;
          locallZ.a(bU.fH().getString(str4, new Object[] { Integer.valueOf(k) }));
        }
        else
        {
          byte b;
          if (localObject4 == bSa.hce) {
            b = (byte)localObject3.aor()[0];
            locallZ.a(bU.fH().getString("kama.shortGain", new Object[] { Byte.valueOf(b) }));
          } else if (localObject4 == bSa.hcf) {
            b = (byte)localObject3.aor()[0];
            locallZ.a(bU.fH().getString("guild.pointsGain", new Object[] { Byte.valueOf(b) }));
          }
        }
      } }
    localObject2 = bU.fH().getString("achievement.unlockedChatMessage", new Object[] { locallZ.tP() });
    Object localObject3 = new lZ();
    if (bool) {
      ((lZ)localObject3).tz().a(bU.fH().b(62, paramdEE.getId(), new Object[0])).tA().tH();
    }
    ((lZ)localObject3).a((CharSequence)localObject2);

    Object localObject4 = new az(str2, ((lZ)localObject3).tP(), localana, -1, localckJ2);
    cjO.clE().j((cWG)localObject4);

    if (str1 != null) {
      aEe localaEe = new aEe(str1);
      localaEe.mm(4);
      CM.LV().a(localaEe);
    }
  }

  public void d(dEE paramdEE) {
    if (!paramdEE.a(byv.bFN().bFO())) {
      return;
    }

    aMT localaMT = cHT.iDr.xR(paramdEE.dgg().getId());
    localaMT.bdW();

    if (i(paramdEE)) {
      h(paramdEE);
    }

    if (cHT.iDr.xT(paramdEE.getId())) {
      if (paramdEE.dgo() != -1) {
        g(paramdEE);
      }

      ab.bl.k(paramdEE.getId());

      localObject = new lZ();
      ((lZ)localObject).tz().am(bNa.gRz.bUV()).a(bU.fH().b(62, paramdEE.getId(), new Object[0])).tA();
      String str1 = ((lZ)localObject).tP();
      String str2 = bU.fH().getString("quest.activatedChatMessage", new Object[] { str1 });
      aEe localaEe = new aEe(str2);
      localaEe.mm(4);
      CM.LV().a(localaEe);

      dLE.doY().t("followedQuestsDisplay", Boolean.valueOf(true));

      dka.cSF().a(new aGs(this), 5000L, 1);

      ab.bl.aC();

      if ((byv.bFN().bFO().i(dKm.lXK)) || (paramdEE.dgp())) {
        ArrayList localArrayList = paramdEE.dgh();
        int i = 0; for (int j = localArrayList.size(); i < j; i++) {
          aiJ localaiJ = (aiJ)localArrayList.get(i);
          if (!localaiJ.Q())
          {
            if (localaiJ.avz())
            {
              cHT.iDr.xU(localaiJ.getId());
              break;
            }
          }
        }
      }
    }
    Object localObject = cHT.iDr.xQ(paramdEE.getId());
    ((ckJ)localObject).cmB();
  }

  private void g(dEE paramdEE) {
    int i = paramdEE.dgo() * 1000;
    if (i < 0) {
      return;
    }
    String str = "questActivatedDialog" + paramdEE.getId();
    dka.cSF().a(new aGv(this, str, paramdEE), i, 1);
  }

  private boolean dtc()
  {
    return (bSc.bYV().bZb()) || ((!bSc.bYV().a(ana.dqp)) && (!bSc.bYV().a(ana.dqq)));
  }

  private void a(String paramString, dEE paramdEE)
  {
    cBQ.cxL().a(paramString, VV.dJ("questActivatedDialog"), (short)10000);
    dLE.doY().a("displayedAchievement", cHT.iDr.xQ(paramdEE.getId()), paramString);
  }

  public void f(dEE paramdEE) {
    if (!paramdEE.a(byv.bFN().bFO())) {
      return;
    }

    aMT localaMT = cHT.iDr.xR(paramdEE.dgg().getId());
    localaMT.bdW();

    if (paramdEE.dgk()) {
      localObject = new aBD(paramdEE.getId());
      byv.bFN().aJK().d((cWG)localObject);
    }

    Object localObject = paramdEE.dgh();
    int i = 0; for (int j = ((ArrayList)localObject).size(); i < j; i++) {
      D localD = cHT.iDr.xP(((aiJ)((ArrayList)localObject).get(i)).getId());
      localD.V();
    }
  }

  public void a(dpg paramdpg) {
    cSi localcSi = byv.bFN().bFO().bGa().sl(paramdpg.getId());
    if (localcSi == null) {
      K.warn("On essaye de mettre à jour la variable " + paramdpg.getName() + " alors qu'elle n'est liée à aucun objectif");
      return;
    }

    int i = 0; for (int j = localcSi.size(); i < j; i++) {
      D localD = cHT.iDr.xP(localcSi.get(i));
      localD.V();
    }
  }

  public void C(int paramInt, boolean paramBoolean) {
    ab.bl.j(paramInt);
    if (paramBoolean) {
      bMK.bUv(); bMK.ts(paramInt);
    }
  }

  public void f(bCP parambCP)
  {
    cio.hHe.cleanUp();
    cHT.iDr.e(parambCP);
    dTG.mqC.start();
    ab.bl.init();

    for (dmn localdmn = parambCP.bLq(); localdmn.hasNext(); ) {
      localdmn.fl();
      dEE localdEE = (dEE)localdmn.value();
      if (i(localdEE)) {
        h(localdEE);
      }

      if ((cHT.iDr.xT(localdEE.getId())) && 
        (localdEE.isActive()) && (!localdEE.isComplete())) {
        ab.bl.k(localdEE.getId());
      }

    }

    ab.bl.aC();
  }

  private static void h(dEE paramdEE)
  {
    ckJ localckJ = cHT.iDr.xQ(paramdEE.getId());
    dTG.mqC.e(localckJ);
  }

  private static boolean i(dEE paramdEE) {
    boolean bool = byv.bFN().bFO().bGa().mc(paramdEE.getId());
    if (!bool) {
      return false;
    }

    int i = paramdEE.bnd() != null ? 1 : 0;
    int j = (!paramdEE.isComplete()) && (paramdEE.getStartTime() != 0L) ? 1 : 0;
    int k = paramdEE.LZ() != 0L ? 1 : 0;

    return (i != 0) || (j != 0) || (k != 0);
  }

  public void e(dEE paramdEE) {
    if (!paramdEE.a(byv.bFN().bFO())) {
      return;
    }

    ckJ localckJ = cHT.iDr.xQ(paramdEE.getId());

    lZ locallZ1 = new lZ();
    locallZ1.a(bU.fH().b(62, paramdEE.getId(), new Object[0]));
    locallZ1.a(" ");
    locallZ1.tI().am(bNa.gRz.bUV());
    locallZ1.a(bU.fH().getString("quest.result.fail"));
    locallZ1.tJ();
    String str1 = locallZ1.tP();

    az localaz = new az(str1, "", ana.dqq, -1, localckJ);
    cjO.clE().j(localaz);

    lZ locallZ2 = new lZ();
    locallZ2.tz().am(bNa.gRz.bUV()).a(bU.fH().b(62, paramdEE.getId(), new Object[0])).tA();
    String str2 = locallZ2.tP();
    String str3 = bU.fH().getString("quest.failedChatMessage", new Object[] { str2 });

    aEe localaEe = new aEe(str3);
    localaEe.mm(4);
    CM.LV().a(localaEe);

    ab.bl.aC();
    aiM.dgK.iK(paramdEE.getId());
  }

  public void a(dEE paramdEE, long paramLong) {
    cio.hHe.w(paramdEE.getId(), paramLong);
  }

  public void zU(int paramInt) {
    byv.bFN().aJK().d(new TC(paramInt));
  }

  private void DU(int paramInt)
  {
    dka.cSF().j(this.moO);
    dka.cSF().a(this.moO, paramInt, 1);
  }
}