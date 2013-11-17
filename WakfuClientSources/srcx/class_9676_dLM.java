import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dLM
  implements cvW
{
  protected static final Logger K = Logger.getLogger(dLM.class);

  public static dLM mbX = new dLM();
  private static final dGy mbY = new rR();

  public void a(aqv paramaqv, boolean paramBoolean)
  {
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    for (dmn localdmn = dsh.luB.cgk(); localdmn.hasNext(); ) {
      localdmn.fl();
      if (localdmn.value() != aYr.feh)
        localdmn.remove();
    }
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject2;
    Object localObject6;
    Object localObject5;
    Object localObject8;
    Object localObject11;
    String str2;
    Object localObject9;
    Object localObject3;
    Object localObject4;
    int m;
    Object localObject12;
    Object localObject13;
    Object localObject7;
    switch (paramcWG.getId()) {
    case 20000:
      localObject1 = (cdl)paramcWG;

      for (localObject2 = ((cdl)localObject1).cgk(); ((dmn)localObject2).hasNext(); ) {
        ((dmn)localObject2).fl();
        int k = ((dmn)localObject2).zY();
        localObject6 = (byte[])((dmn)localObject2).value();
        int n = 0;
        aYr localaYr = dsh.luB.BA(k);
        if (localaYr == null) {
          K.info("[NATION] Reception d'un message de synchro de nation demandant l'ajout d'une nouvelle nation : " + k);
          localaYr = aYr.oq(k);
          dsh.luB.s(localaYr);
          n = 1;
        }

        K.info("[NATION] Synchronisation de la nation " + localaYr + " (" + localObject6.length + ") bytes");
        localaYr.f((byte[])localObject6, aUk.eVd);

        if (n != 0) {
          localaYr.ir();
        }
      }

      bPE.bWu().updateUI();

      localObject2 = byv.bFN().bFO();
      if (localObject2 != null) {
        if (((byz)localObject2).cJf().UI() != aYr.feh) {
          localObject5 = (ctE)((byz)localObject2).cJf();
          if (localObject5 != null) {
            ((ctE)localObject5).bLG();
          }
        }
        ((byz)localObject2).adq();
      }

      return false;
    case 20004:
      localObject1 = (dlC)paramcWG;
      K.info("[NATION] Un vote a commencé pour ma nation, d'une durée de " + ((dlC)localObject1).aMV());
      localObject2 = byv.bFN().bFO();
      if (localObject2 == null) {
        return false;
      }

      if (bPE.bWu().bXe()) {
        localObject5 = bU.fH().getString("notification.preventiveElectionTitle");

        localObject6 = cda.createLink(bU.fH().getString("notification.preventiveElectionText"), ana.dqi, "0");

        localObject8 = new az((String)localObject5, (String)localObject6, ana.dqi, 600132);
        cjO.clE().j((cWG)localObject8);
      } else {
        localObject5 = bU.fH().getString("notification.newElectionTitle");

        localObject6 = cda.createLink(bU.fH().getString("notification.newElectionText"), ana.dqi, "0");

        localObject8 = new az((String)localObject5, (String)localObject6, ana.dqi, 600132);
        cjO.clE().j((cWG)localObject8);
      }

      localObject5 = (ctE)((byz)localObject2).cJf();
      localObject6 = ((ctE)localObject5).UI();
      ((aYr)localObject6).a(((dlC)localObject1).cTr(), ((dlC)localObject1).aMV(), true);

      if (((byz)localObject2).nU() >= 1)
        localObject8 = bU.fH().getString("nation.vote.start.can.be.candidate", new Object[] { Integer.valueOf(3000) });
      else if (((byz)localObject2).nU() >= 1)
        localObject8 = bU.fH().getString("nation.vote.start.can.vote", new Object[] { Short.valueOf(1) });
      else {
        localObject8 = bU.fH().getString("nation.vote.start.cant.do.anything", new Object[] { Short.valueOf(1) });
      }

      CM.LV().f((String)localObject8, 8);

      if (cBQ.cxL().mZ("nationDialog")) {
        bPE.bWu().bWK();
      }

      if (byv.bFN().c(aUy.bjB())) {
        byv.bFN().b(aUy.bjB());
      }
      return false;
    case 20006:
      localObject1 = (bCR)paramcWG;

      localObject2 = byv.bFN().bFO();
      if (localObject2 == null) {
        return false;
      }
      localObject5 = (ctE)((byz)localObject2).cJf();
      localObject6 = ((ctE)localObject5).UI();

      ((ctE)localObject5).hx(false);
      CA.Lv().f(mbY);

      localObject8 = ((bCR)localObject1).bLw();
      boolean bool3 = ((byz)localObject2).getName().equals(localObject8);
      localObject11 = ((bCR)localObject1).bLv();
      int i2 = localObject11 != null ? 1 : 0;
      boolean bool4 = ((bCR)localObject1).bLu();
      int i3 = (i2 != 0) && (((byz)localObject2).getName().equals(localObject11)) ? 1 : 0;
      boolean bool5 = ((ctE)localObject5).biG();

      ((aYr)localObject6).bnz().cKN();

      ((aYr)localObject6).a(((bCR)localObject1).bLs(), ((bCR)localObject1).bLt(), false);
      ((aYr)localObject6).bnH();

      ((ctE)localObject5).bLG();

      K.info("[NATION] Un vote commencé le " + ((bCR)localObject1).aMT() + "vient de se terminer pour ma nation." + " Gouverneur : " + (String)localObject11 + " Gouverneur élu démocratiquement : " + bool4);
      String str1;
      if (i2 != 0)
      {
        if (i3 != 0)
        {
          if (bool3)
          {
            if (bool4)
            {
              str1 = bU.fH().getString("nation.vote.end.result.reelected");
            }
            else {
              str1 = bU.fH().getString("nation.vote.end.result.reelectedByDefault");
            }
          }
          else {
            str1 = bU.fH().getString("nation.vote.end.result.elected");
          }
          str2 = bU.fH().getString("notification.governorEndElectionText");
        }
        else {
          if (bool3)
          {
            if (bool5)
            {
              str1 = bU.fH().getString("nation.vote.end.result.reelectionLost", new Object[] { localObject11 });
            }
            else {
              str1 = bU.fH().getString("nation.vote.end.result.noMoreGovernor", new Object[] { localObject11 });
            }

          }
          else if (bool5)
          {
            str1 = bU.fH().getString("nation.vote.end.result.electionLost", new Object[] { localObject11 });
          } else if (bool4)
          {
            str1 = bU.fH().getString("nation.vote.end.result.someoneElected", new Object[] { localObject11 });
          }
          else {
            str1 = bU.fH().getString("nation.vote.end.result.someoneReelected", new Object[] { localObject11 });
          }

          str2 = bU.fH().getString("notification.endElectionText", new Object[] { localObject11 });
        }
      }
      else
      {
        str1 = bU.fH().getString("nation.vote.end.result.noGovernor");
        str2 = bU.fH().getString("notification.noGovernorEndElectionText");
      }

      String str3 = bU.fH().getString("notification.endElectionTitle");
      String str4 = cda.createLink(str2, ana.dqi, "0");
      az localaz = new az(str3, str4, ana.dqi);
      cjO.clE().j(localaz);

      aWc.blo().b(600133L, 0.0F, 500, 2000, 6400);

      String str5 = bU.fH().getString("nation.vote.end") + "\n" + str1;

      CM.LV().f(str5, 8);

      if (cBQ.cxL().mZ("nationDialog"))
      {
        aMy localaMy = new aMy();
        byv.bFN().aJK().d(localaMy);
      }
      if (byv.bFN().c(aUy.bjB())) {
        byv.bFN().b(aUy.bjB());
      }
      return false;
    case 20010:
      localObject1 = (dLv)paramcWG;

      localObject6 = ((dLv)localObject1).rF();
      switch (rQ.aZT[localObject1.doR().ordinal()]) {
      case 1:
        localObject2 = bU.fH().getString("nation.vote.end.resultDelayed.voteLost", new Object[] { localObject6 });
        localObject5 = bU.fH().getString("notification.endElectionText", new Object[] { localObject6 });
        break;
      case 2:
        localObject2 = bU.fH().getString("nation.vote.end.resultDelayed.voteLostStatusLost", new Object[] { localObject6 });
        localObject5 = bU.fH().getString("notification.endElectionText", new Object[] { localObject6 });
        break;
      case 3:
        localObject2 = bU.fH().getString("nation.vote.end.resultDelayed.voteMissed", new Object[] { localObject6 });
        localObject5 = bU.fH().getString("notification.endElectionText", new Object[] { localObject6 });
        break;
      case 4:
        localObject2 = bU.fH().getString("nation.vote.end.resultDelayed.voteWon", new Object[] { localObject6 });
        localObject5 = bU.fH().getString("notification.governorEndElectionText");
        break;
      default:
        return false;
      }

      CM.LV().f((String)localObject2, 8);

      if (localObject5 != null) {
        localObject8 = bU.fH().getString("notification.endElectionTitle");

        localObject9 = cda.createLink((String)localObject5, ana.dqi, "0");
        localObject11 = new az((String)localObject8, (String)localObject9, ana.dqi, 600132);
        cjO.clE().j((cWG)localObject11);
      }

      return false;
    case 15120:
      localObject1 = (JN)paramcWG;
      boolean bool1 = ((JN)localObject1).IR();

      if (!bool1)
        localObject5 = bU.fH().getString("nation.vote.candidateRegistration.error");
      else
        localObject5 = bU.fH().getString("nation.vote.candidateRegistration.success");
      CM.LV().f((String)localObject5, 4);

      return false;
    case 15122:
      localObject1 = (cdL)paramcWG;
      localObject3 = ((cdL)localObject1).cgz();

      localObject5 = byv.bFN().bFO().cJf().UI();
      ((aYr)localObject5).a((Qy)localObject3);
      ((aYr)localObject5).bz(((cdL)localObject1).abA(), ((cdL)localObject1).abB());

      return false;
    case 20012:
      localObject1 = (PQ)paramcWG;
      localObject3 = ((PQ)localObject1).abz();

      localObject5 = byv.bFN().bFO().cJf().UI();
      if (((aYr)localObject5).aMX()) {
        ((aYr)localObject5).C((ArrayList)localObject3);
        ((aYr)localObject5).bz(((PQ)localObject1).abA(), ((PQ)localObject1).abB());
      } else {
        ((dDI)((aYr)localObject5).aNc()).b((ArrayList)localObject3, ((PQ)localObject1).abA(), ((PQ)localObject1).abB());
      }
      bPE.bWu().updateUI();

      return false;
    case 20008:
      localObject1 = (doF)paramcWG;
      if (((doF)localObject1).IR()) {
        long l1 = byv.bFN().bFO().getId();
        if (((doF)localObject1).cVY() == l1) {
          localObject6 = bU.fH().getString("nation.desist.result.sender", new Object[] { ((doF)localObject1).cWb(), Integer.valueOf(((doF)localObject1).cWc()) });
          CM.LV().f((String)localObject6, 4);
        } else if (((doF)localObject1).cWa() == l1) {
          localObject6 = bU.fH().getString("nation.desist.result.receiver", new Object[] { ((doF)localObject1).cVZ(), Integer.valueOf(((doF)localObject1).cWc()), Integer.valueOf(((doF)localObject1).cWd()) });
          CM.LV().f((String)localObject6, 4);
        } else {
          K.error("[NATION] On reçoit un résultat de désistement de " + ((doF)localObject1).cVY() + " pour " + ((doF)localObject1).cWa() + " alors qu'on est d'id " + l1 + ". Message pas arrivé au bon destinataire ???");
        }
      }
      else
      {
        K.error("[NATION] Résultat de la demande de désistement : erreur");
      }
      return false;
    case 15124:
      localObject1 = (bmu)paramcWG;
      localObject4 = ((bmu)localObject1).HK();
      localObject5 = bU.fH().b(57, (int)((Yp)localObject4).getId(), new Object[0]);
      localObject6 = cBQ.cxL().a(bU.fH().getString("nation.governmentNominationQuestion", new Object[] { localObject5 }), Cn.et(0), 25L, 102, 1);

      ((cKX)localObject6).a(new rT(this, (Yp)localObject4));

      return false;
    case 20024:
      localObject1 = (bsR)paramcWG;
      localObject4 = ((bsR)localObject1).aJm();
      localObject5 = ((bsR)localObject1).HK();
      m = ((bsR)localObject1).getResultCode();
      localObject8 = bU.fH().b(57, (int)((Yp)localObject5).getId(), new Object[0]);
      if (m == 0) {
        localObject9 = bU.fH().getString("nation.governmentNominationChatMessage", new Object[] { localObject4, localObject8 });
        CM.LV().f((String)localObject9, 8);

        aQL.a(8, abi.cPz);
        aQL.a(8, abi.cPA);

        localObject11 = bU.fH().getString("notification.governmentNominationTitle");

        localObject12 = cda.createLink(bU.fH().getString("notification.governmentNominationText", new Object[] { localObject4, localObject8 }), ana.dqi);

        localObject13 = new az((String)localObject11, (String)localObject12, ana.dqi, 600132);
        cjO.clE().j((cWG)localObject13);

        if (byv.bFN().c(bTX.cah()))
          byv.bFN().b(bTX.cah());
      } else {
        avW.aIb().a(m, 3, new Object[] { localObject4, localObject8 });
      }

      return false;
    case 20026:
      localObject1 = (aWh)paramcWG;
      localObject4 = ((aWh)localObject1).aJm();
      localObject5 = ((aWh)localObject1).HK();
      m = ((aWh)localObject1).getResultCode();
      localObject8 = bU.fH().b(57, (int)((Yp)localObject5).getId(), new Object[0]);
      if (m == 0) {
        localObject9 = bU.fH().getString("nation.governmentRevokeChatMessage", new Object[] { localObject4, localObject8 });
        CM.LV().f((String)localObject9, 8);

        localObject11 = bU.fH().getString("notification.governmentRevokeTitle");

        localObject12 = cda.createLink(bU.fH().getString("notification.governmentRevokeText", new Object[] { localObject4, localObject8 }), ana.dqi);

        localObject13 = new az((String)localObject11, (String)localObject12, ana.dqi, 600132);
        cjO.clE().j((cWG)localObject13);

        if (byv.bFN().c(bTX.cah())) {
          byv.bFN().b(bTX.cah());
        }
        if (byv.bFN().bFO().getName().equals(localObject4)) {
          aQL.nz(8);
        }
        Su localSu = CA.Lv().bt((String)localObject4);
        if ((localSu != null) && ((localSu instanceof bKm)))
          localSu.aek();
      } else {
        avW.aIb().a(m, 3, new Object[] { localObject4, localObject8 });
      }

      return false;
    case 15134:
      localObject1 = (aH)paramcWG;
      int i = ((aH)localObject1).bP();
      long l3 = ((aH)localObject1).bQ();
      localObject8 = byv.bFN().bFO().cJf();
      localObject9 = ((cvY)localObject8).UI().bnz();
      localObject11 = new lZ().tz().am("cc4444").a(bU.fH().b(97, (int)l3, new Object[0])).tA().tP();

      localObject13 = vC.Ew();
      if ((localObject13 != null) && (localObject13 != dqU.ltq)) {
        int i4 = ((cWY)localObject9).jk(l3);
        int i5 = ((cWY)localObject9).jl(l3);
        int i6 = ((cvY)localObject8).dJ(i);
        i4 += i6 * i5 / 100;
        str2 = new lZ().tz().am("cc4444").a((i4 > 0 ? "+" : "") + i4).tA().tP();

        localObject12 = bU.fH().getString("nation.chatLaw", new Object[] { str2, localObject11 });
        CM.LV().f((String)localObject12, 4);
      }

      return false;
    case 20034:
      localObject1 = (cUi)paramcWG;

      dmn localdmn = ((cUi)localObject1).cJx();
      aso localaso = ((cUi)localObject1).cJy();
      while ((localdmn.hasNext()) && (localaso.hasNext())) {
        localdmn.fl();
        localaso.fl();

        m = localdmn.zY();
        localObject8 = (byte[])localdmn.value();
        int i1 = localaso.value();

        localObject11 = dsh.luB.BA(m);
        bPE.bWu().de(m, i1);
        localObject12 = ((aYr)localObject11).a(bYR.hoS);
        ((hk)localObject12).c(ByteBuffer.wrap((byte[])localObject8), aUk.eVd);
        ((hk)localObject12).pj();
      }

      return false;
    case 20036:
      localObject1 = (avj)paramcWG;
      long l2 = ((avj)localObject1).aHo();
      localObject7 = bhc.bN((short)(int)(l2 / 1000L));
      localObject8 = avW.aIb().a(((avj)localObject1).aHn(), new Object[] { localObject7 });

      avW.aIb().a(((avj)localObject1).aHn(), 3, new Object[] { localObject7 });

      cBQ.cxL().a((String)localObject8, Cn.et(1), 1026L, 102, 1);

      bTX.cah().gG(true);

      return false;
    case 9303:
      localObject1 = (ub)paramcWG;
      int j = ((ub)localObject1).CB();
      boolean bool2 = ((ub)localObject1).CC();

      n.b(j, bool2);
      bPE.bWu().bWL();
      localObject7 = (bva)cSE.kEZ.yY(j).avb();
      localObject8 = null;
      if (bU.fH().ed(66, ((bva)localObject7).getId()))
        localObject8 = bU.fH().b(66, ((bva)localObject7).getId(), new Object[0]);
      Object localObject10;
      if (bool2) {
        localObject10 = (iB)aAA.dTq.aMA();
        ((iB)localObject10).a((bva)localObject7);
        biI.fzg.b((dCV)localObject10);

        if (byv.bFN().bFO().bHn() == localObject7) {
          KO.Vm().a(new bMo(cMS.ksh, bU.fH().getString("notification.chaosStartedTitle"), 500, 2500, "AnimChallenge1"));
          aWc.blo().eO(600144L);
        }

        localObject11 = new az(bU.fH().getString("notification.chaosStartedTitle"), bU.fH().getString("notification.chaosStartedText", new Object[] { localObject8 }), ana.dql);

        cjO.clE().j((cWG)localObject11);
      } else {
        localObject10 = (atB)aAA.dTr.aMA();
        ((atB)localObject10).a((bva)localObject7);
        biI.fzg.b((dCV)localObject10);

        localObject11 = new az(bU.fH().getString("notification.chaosStoppedTitle"), bU.fH().getString("notification.chaosStoppedText", new Object[] { localObject8 }), ana.dql);

        cjO.clE().j((cWG)localObject11);
      }

      return false;
    }

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }
}