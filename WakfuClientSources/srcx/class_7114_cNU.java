import java.util.ArrayList;
import java.util.Map;
import org.apache.log4j.Logger;

public class cNU
  implements cvW
{
  public static final boolean ktL = false;
  private static final cNU ktM = new cNU();

  protected static final Logger K = Logger.getLogger(cNU.class);

  public static cNU cFY() {
    return ktM;
  }

  public boolean a(cWG paramcWG) {
    byz localbyz = byv.bFN().bFO();
    Object localObject1;
    Object localObject2;
    int m;
    long l1;
    Object localObject6;
    int i3;
    int i5;
    Object localObject3;
    Object localObject5;
    int k;
    amY localamY1;
    amY localamY3;
    Object localObject4;
    switch (paramcWG.getId())
    {
    case 11100:
      localObject1 = (ddx)paramcWG;

      alm.axU().a(((ddx)localObject1).se(), ((ddx)localObject1).wx(), ((ddx)localObject1).cOE(), ((ddx)localObject1).cOF());

      return false;
    case 11202:
      localObject1 = (kp)paramcWG;
      qn.xw().a(((kp)localObject1).sf(), ((kp)localObject1).se());
      localObject2 = ((kp)localObject1).sg();
      if (localObject2 != null) {
        m = 0; for (int n = ((bML)localObject2).size(); m < n; m++) {
          qn.xw().a((byte)((bML)localObject2).uM(m), ((bML)localObject2).qU(m), ((kp)localObject1).se());
        }
      }

      return false;
    case 11210:
      localObject1 = (AP)paramcWG;
      qn.xw().cp(((AP)localObject1).se());

      localObject2 = (cWv)aAA.dTn.aMA();
      ((cWv)localObject2).zi(((AP)localObject1).se());
      c((cWT)localObject2);

      bOU.gUc.b(new Im());

      return false;
    case 11206:
      localObject1 = (aBp)paramcWG;
      qn.xw().F(((aBp)localObject1).se(), ((aBp)localObject1).eo());

      return false;
    case 11204:
      localObject1 = (afD)paramcWG;
      qn.xw().a(((afD)localObject1).arc(), ((afD)localObject1).ard(), ((afD)localObject1).se());

      return false;
    case 11208:
      localObject1 = (Xl)paramcWG;
      K.info("reception d'un message de Reward pour le challenge " + ((Xl)localObject1).se());

      er(((Xl)localObject1).se(), ((Xl)localObject1).ajo());

      return false;
    case 11102:
      localObject1 = (WW)paramcWG;
      l1 = ((WW)localObject1).EN();
      bBn localbBn = Hh.QM().dh(((WW)localObject1).ok());
      if (localbBn != null) {
        gA localgA2 = new gA(l1);
        localgA2.b(localbBn);
        localgA2.l(((WW)localObject1).nP());
        if (localbyz.bGP().ap(localgA2) == null) {
          K.error("[Add_item_inventory] : L'ajout d'un item en provenance d'un scénario a échoué. Problème de synchro client/serveur ? Item : " + localbBn.getId());
        }
        else if ((((WW)localObject1).ajl()) && (localbBn.bKv())) {
          if (!byv.bFN().c(dQY.drX())) {
            byv.bFN().a(dQY.drX());
          }
          dQY.drX().m(localbBn.getId(), ((WW)localObject1).nP());
        } else {
          dtY.aT(localgA2);
        }
      } else {
        K.error("[ADD_ITEM_INVENTORY] : Impossible de trouver de référenceItem d'id " + ((WW)localObject1).ok());
      }

      return false;
    case 11110:
      localObject1 = (ayU)paramcWG;
      l1 = ((ayU)localObject1).EN();
      if (localbyz.bGP().iR(l1) != null) {
        return false;
      }
      if (localbyz.ayJ().cg(l1) != null) {
        return false;
      }

      return false;
    case 11112:
      localObject1 = (bJB)paramcWG;
      int i = ((bJB)localObject1).ok();
      m = ((bJB)localObject1).getCount();
      int i1;
      if (m == -1) {
        i1 = localbyz.bGP().yd(i);
      } else {
        i1 = localbyz.bGP().en(i, m);
        m -= i1;
      }

      if (i1 != 0) {
        dtY.H(i, (short)i1);
      }

      if (m == -1) {
        localbyz.ayJ().xy(i);
        localbyz.bGD().a(i, bKq.gNg, true);
      }
      if (m > 0) {
        localbyz.ayJ().ee(i, m);
        localbyz.bGD().a(i, bKq.gNg, true);
      }

      return false;
    case 11108:
      localObject1 = (dVS)paramcWG;

      long l2 = ((dVS)localObject1).EN();
      gA localgA1 = (gA)localbyz.ayJ().ci(l2);
      try {
        fN.mS().a(localbyz.ayJ(), localbyz.bGP().iO(((dVS)localObject1).cBT()).cHT(), (short)((dVS)localObject1).dvy(), localgA1, localbyz, localbyz.bEY());
      }
      catch (dI localdI)
      {
        K.warn("Ne devrait pas arriver : Impossible de déséquiper cet objet car la capacité maximum du sac a été atteinte");
      } catch (dcF localdcF) {
        K.warn("Ne devrait pas arriver : Impossible d'équiper cet objet car l'objet est déjà présent");
      }
      localbyz.bGH();

      return false;
    case 11214:
      localObject1 = (dtg)paramcWG;
      int j = ((dtg)localObject1).cZm();
      m = ((dtg)localObject1).cZn();
      int i2 = ((dtg)localObject1).cZo();
      localObject6 = ((dtg)localObject1).EQ();
      i3 = ((dtg)localObject1).CB();
      i5 = ((dtg)localObject1).azu();
      boolean bool3 = ((dtg)localObject1).cZp();
      cSi localcSi = ((dtg)localObject1).cZl();
      int i6 = ((dtg)localObject1).azM();
      ack localack;
      if (i5 != -1)
        localack = ack.values()[i5];
      else {
        localack = null;
      }
      K.info("Challenge courant : " + j + " (dans " + m + "s)");

      bUH localbUH = bUH.caG();

      amY localamY4 = localbUH.caF();
      boolean bool4 = false;

      if (localamY4 != null) {
        bool4 = localamY4.azC();
      }

      if ((!bool4) && (localack == ack.cRf) && (!bool3) && ((localbUH.caF() == null) || (localbUH.caF().getId() != j)))
      {
        localObject7 = new az(bU.fH().getString("notification.challengeProposalTitle"), bU.fH().getString("notification.challengeProposalText"), ana.dql);

        cjO.clE().j((cWG)localObject7);
      }

      localbUH.caL();

      Object localObject7 = localbUH.caF();
      if ((!bool3) && (localObject7 != null)) {
        localbUH.caH();
      }

      int i7 = 0;
      if (localbUH.caD() != localack) {
        localbUH.a(localack, i2);
        i7 = 1;
      }

      localbUH.uf(i3);

      if ((!bool3) || (j == -1)) {
        localbUH.a(-1, i2, (dxL)localObject6, localcSi, false, i3);
        K.info("Pas de challenge dans cette zone, on s'arrête là");
        return false;
      }

      localbUH.a(j, i2, (dxL)localObject6, localcSi, bool3, i3);
      localbUH.caF().jk(i6);

      if ((bool3) && (i7 != 0)) {
        localbUH.caK();
      }

      ayn localayn = (ayn)cSE.kEZ.xz(i3);
      if (localayn != null) {
        DF localDF = (DF)aAA.dTn.aMA();
        localDF.o(localayn);
        localDF.zi(j);
        dDU localdDU = qn.xw().cl(j);
        if (localdDU != null) {
          localDF.setTitle(localdDU.dfQ());
          ArrayList localArrayList = localdDU.cfd();
          if (!localArrayList.isEmpty()) {
            gA localgA3 = Hh.QM().eO(((Aa)localArrayList.get(0)).gw());
            if (localgA3 != null) {
              localDF.bz(ceb.ag(localgA3));
            }
          }
        }
        c(localDF);
      }
      else {
        K.error("Réception d'un évenement de challenge pour un protecteur qu'on ne connait pas id=" + i3 + " eventType=CHALLENGE_INFORMATION");
      }

      return false;
    case 11220:
      localObject1 = (auv)paramcWG;
      localObject3 = ack.values()[localObject1.aGC()];
      bUH.caG().a((ack)localObject3, ((auv)localObject1).aGE());
      bUH.caG().caK();

      amY localamY2 = bUH.caG().caF();
      if ((localObject3 == ack.cRg) && (bUH.caG().caF() == localamY2) && (!localamY2.azC()))
      {
        KO.Vm().a(new bMo(cMS.ksh, localamY2.getTitle(), 500, 2500, "AnimChallenge1"));
        aWc.blo().eO(600144L);

        localObject5 = new az(bU.fH().getString("notification.challengeStartTitle"), bU.fH().getString("notification.challengeStartText"), ana.dql);

        cjO.clE().j((cWG)localObject5);
      }

      return false;
    case 4000:
      localObject1 = (doP)paramcWG;

      switch (((doP)localObject1).cWl()) {
      case 202:
        localObject3 = bUH.caG().caF();
        if (localObject3 != null) {
          ((amY)localObject3).cy(false);
        }
        break;
      }

      k = ((doP)localObject1).cWl() == 0 ? 4 : 3;
      avW.aIb().a(((doP)localObject1).cWl(), k, new Object[0]);

      return false;
    case 11216:
      localObject1 = (dHv)paramcWG;
      cBQ.cxL().a("challengeInputDialog", VV.dJ("challengeInputDialog"), 40961L, (short)10000);

      k = ((dHv)localObject1).se();
      byte b = ((dHv)localObject1).arc();

      dLE.doY().t("waitingForInputChallenge", new bkC(k, b));

      return false;
    case 11218:
      localObject1 = (css)paramcWG;
      localamY1 = qn.xw().ck(((css)localObject1).yC());
      localamY1.r(((css)localObject1).ML());

      return false;
    case 11226:
      localObject1 = (bhS)paramcWG;
      localamY1 = bUH.caG().caF();
      if (localamY1 != null) {
        localamY1.jk(((bhS)localObject1).azM());
      }

      return false;
    case 11224:
      localObject1 = (ayF)paramcWG;

      er(((ayF)localObject1).se(), ((ayF)localObject1).aKD());

      boolean bool1 = bUH.caG().caN();

      localamY3 = qn.xw().ck(((ayF)localObject1).se());
      localObject5 = ((ayF)localObject1).abD();
      if (bool1) {
        localamY3.aF((short)(((ayF)localObject1).aKC() + 1));
        localamY3.jh(((ayF)localObject1).aKD());
        localamY3.eO((String)localObject5);
        localamY3.ji(((ayF)localObject1).abE());

        coP.coG().d(localamY3);
        if (!byv.bFN().c(coP.coG())) {
          byv.bFN().a(coP.coG());
        }

        aWc.blo().eO(600130L);
      }

      if (localamY3.EE().azC()) {
        localObject6 = bU.fH().getString("chat.challenge.chaosEnded");
        i3 = 4;
        CM.LV().f((String)localObject6, 4);
      }
      else if (bool1) {
        localObject6 = byv.bFN().bFO().getName();
        String str;
        if ((localObject5 != null) && (((String)localObject5).length() > 0))
        {
          i5 = 4;
          if (!((String)localObject6).equals(localObject5)) {
            str = bU.fH().getString("chat.challenge.won", new Object[] { localObject5, localamY3.getTitle() });
            CM.LV().f(str, 4);
          } else {
            str = bU.fH().getString("chat.challenge.selfComplete", new Object[] { localamY3.getTitle() });
            CM.LV().f(str, 4);
          }
        } else {
          str = bU.fH().getString("chat.challenge.self.won", new Object[] { localamY3.getTitle() });
          i5 = 4;
          CM.LV().f(str, 4);
        }

      }

      bUH.caG().a(ack.cRh);
      bUH.caG().caK();

      aiM.dgK.iK(((ayF)localObject1).se());

      return false;
    case 11222:
      localObject1 = (PS)paramcWG;
      localObject4 = alm.axU().l(((PS)localObject1).se(), false);
      bUH.caG().ug(((PS)localObject1).se());
      if (localObject4 != null) {
        ((bXf)localObject4).ccB();
      }

      aiM.dgK.iK(((PS)localObject1).se());

      return false;
    case 11200:
      localObject1 = (Ho)paramcWG;
      localObject4 = alm.axU().l(((Ho)localObject1).se(), false);
      localamY3 = qn.xw().ck(((Ho)localObject1).se());

      boolean bool2 = bUH.caG().caN();

      if (localamY3 != null) {
        if ((bool2) && (!localamY3.EE().azC())) {
          localObject6 = bU.fH().getString("chat.challenge.failed", new Object[] { localamY3.getTitle() });
          int i4 = 4;
          CM.LV().f((String)localObject6, 4);

          localamY3.aF((short)-2);
          localamY3.jh(-1);
          localamY3.eO(null);
          localamY3.ji(0);
          localamY3.jj(((Ho)localObject1).getReason());
        }

        aiM.dgK.iK(localamY3.getId());
      }

      if (localObject4 != null) {
        ((bXf)localObject4).ccB();
      }

      return false;
    case 11228:
      localObject1 = (bGG)paramcWG;
      localObject4 = bUH.caG().caF();
      if (localObject4 != null) {
        ((amY)localObject4).aF(((bGG)localObject1).azJ());
      }
      return false;
    case 15800:
      localObject1 = (duT)paramcWG;
      a(((duT)localObject1).daN(), ((duT)localObject1).eo(), ((duT)localObject1).aSw());

      return false;
    }

    return true;
  }

  private void er(int paramInt1, int paramInt2)
  {
    qn.xw().a(paramInt1, new cSi(new int[] { paramInt2 }));
    bUH.caG().caM();
  }

  public void c(cWT paramcWT) {
    int i = bUH.caG().caE();
    ayn localayn = (ayn)cSE.kEZ.xz(i);
    if (localayn != null) {
      paramcWT.o(localayn);
      biI.fzg.b(paramcWT);
    } else {
      K.error("Réception d'un évenement de challenge pour un protecteur qu'on ne connait pas id=" + i + " eventType=" + paramcWT.getClass().getSimpleName());
    }
  }

  public long getId()
  {
    return 6L;
  }

  public void a(long paramLong)
  {
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
  }

  public static bXf a(Gj paramGj, int paramInt, Map paramMap)
  {
    String str1;
    if (paramGj == Gj.bOy)
      str1 = "genericIEActions/%d.lua";
    else {
      str1 = "actions/%d.lua";
    }

    String str2 = String.format(str1, new Object[] { Integer.valueOf(paramInt) });

    return dlD.cTt().a(str2, null, paramMap, new Tj(str2), false);
  }
}