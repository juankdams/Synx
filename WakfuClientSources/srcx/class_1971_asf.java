import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import org.apache.log4j.Logger;

public class asf
  implements cvW
{
  protected static final Logger K = Logger.getLogger(asf.class);

  private static final asf dBW = new asf();
  public static final boolean dBX = false;

  public static asf aED()
  {
    return dBW;
  }

  private void c(dWu paramdWu)
  {
    byz localbyz = WakfuClientInstance.awy().awz().bFO();

    dwN localdwN = localbyz.bHa();
    if ((localdwN != null) && ((paramdWu instanceof cVo)))
      localdwN.c((cVo)paramdWu);
  }

  private void d(dWu paramdWu)
  {
    byz localbyz = WakfuClientInstance.awy().awz().bFO();

    dwN localdwN = localbyz.bHa();
    if ((localdwN != null) && ((paramdWu instanceof cVo)))
      localdwN.d((cVo)paramdWu);
  }

  public boolean a(cWG paramcWG)
  {
    byz localbyz = byv.bFN().bFO();
    Object localObject1;
    Object localObject2;
    long l6;
    Object localObject27;
    Object localObject29;
    Object localObject32;
    Object localObject36;
    Object localObject18;
    Object localObject33;
    Object localObject3;
    Object localObject9;
    Object localObject14;
    Object localObject19;
    Object localObject25;
    int i33;
    Object localObject4;
    Object localObject30;
    Object localObject10;
    Object localObject15;
    Su localSu;
    int m;
    Object localObject21;
    Object localObject35;
    Object localObject37;
    Object localObject5;
    int i14;
    int i18;
    Object localObject28;
    Object localObject11;
    int i1;
    Object localObject6;
    long l3;
    long l10;
    Object localObject34;
    byo localbyo1;
    Object localObject22;
    long l5;
    String str;
    int i16;
    Object localObject26;
    Object localObject23;
    Object localObject31;
    Object localObject7;
    Object localObject12;
    int i2;
    Object localObject16;
    int i3;
    Object localObject24;
    Object localObject13;
    Object localObject8;
    Object localObject17;
    int i4;
    switch (paramcWG.getId())
    {
    case 204:
      localObject1 = (bWk)paramcWG;

      localObject2 = ((bWk)localObject1).bSI().aBa();
      while (((cHu)localObject2).hasNext()) {
        ((cHu)localObject2).fl();
        l6 = ((cHu)localObject2).bic();
        long l12 = ((Long)((cFc)((cHu)localObject2).value()).getFirst()).longValue();
        localObject27 = (byte[])((cFc)((cHu)localObject2).value()).Lp();
        localObject29 = (Long)((cFc)((cHu)localObject2).value()).cAE();

        localObject32 = acs.aoN().cB(l12);
        if (localObject32 != null) {
          cYk localcYk = aUG.eF(((Long)localObject29).longValue());
          ((cMb)localObject32).n(localcYk);
          ((cMb)localObject32).q((byte[])localObject27);
          ((cMb)localObject32).boP();
          ((cMb)localObject32).a(l6);
          for (localObject36 = ((cMb)localObject32).sL().iterator(); ((Iterator)localObject36).hasNext(); ) { abc localabc = (abc)((Iterator)localObject36).next();
            if ((localabc instanceof ob)) {
              ob localob = (ob)localabc;
              bVl.caZ().b(localob);
              localob.atf();
              bdB.b(localob);
            }
          }
          ((cMb)localObject32).sM();

          c((dWu)localObject32);
          ayg.aJQ().b((cMb)localObject32);
        } else {
          K.error("Impossible de spawner l'élément interactif instanceId=" + l6);
        }
      }

      return false;
    case 200:
      localObject1 = (bKy)paramcWG;

      localObject2 = ((bKy)localObject1).bSI().aBa();
      while (((cHu)localObject2).hasNext()) {
        ((cHu)localObject2).fl();
        try {
          l6 = ((cHu)localObject2).bic();
          byte[] arrayOfByte2 = (byte[])((cHu)localObject2).value();

          K.trace("[INTERACTIVE_ELEMENT_SPAWN_MESSAGE] Element id=" + l6 + ", data.length=" + arrayOfByte2.length + " byte(s)");

          cMb localcMb = cMb.a(l6, arrayOfByte2);
          if (localcMb != null)
            ayg.aJQ().b(localcMb);
          else
            K.error("spawn d'un element interactif inconnu id=" + l6);
        }
        catch (Exception localException1) {
          K.error("", localException1);
        }
      }

      return false;
    case 206:
      localObject1 = (dNr)paramcWG;

      localObject2 = ((dNr)localObject1).dpV();
      int i5 = 0; for (int i11 = ((cbQ)localObject2).size(); i5 < i11; i5++) {
        long l13 = ((cbQ)localObject2).uD(i5);
        localObject27 = (cMb)ayg.aJQ().dw(l13);
        if (localObject27 != null) {
          if (((cMb)localObject27).cFc()) {
            ((cMb)localObject27).aau();
            for (localObject29 = ((cMb)localObject27).sL().iterator(); ((Iterator)localObject29).hasNext(); ) { localObject32 = (abc)((Iterator)localObject29).next();
              if ((localObject32 instanceof ahm)) {
                ((ahm)localObject32).a(new UE(this, l13));
              }

            }

          }
          else
          {
            d((dWu)localObject27);
            ayg.aJQ().e((dWu)localObject27);
          }
        }
        else K.warn("Impossible de retirer un élément interactif ID=" + l13 + ", il n'est référencé dans aucune partition.");

      }

      return false;
    case 202:
      localObject1 = (Fd)paramcWG;
      long l1 = ((Fd)localObject1).m();
      byte[] arrayOfByte1 = ((Fd)localObject1).OF();

      K.trace("[INTERACTIVE_ELEMENT_UPDATE_MESSAGE] elementId=" + l1);

      if (arrayOfByte1 != null) {
        localObject18 = (cMb)ayg.aJQ().dw(l1);
        if (localObject18 != null) {
          ((cMb)localObject18).q(arrayOfByte1);
          ((cMb)localObject18).sM();
        } else {
          K.error("L'élément interactif à mettre à jour n'est pas dans les partitions gérées par le client.");
        }
      } else {
        K.warn("Message de mise à jour d'élément interactif reçu sans aucune donnée à mettre à jour.");
      }

      return false;
    case 4102:
      localObject1 = (ddf)paramcWG;

      for (int i = 0; i < ((ddf)localObject1).cOr().size(); i++)
      {
        long l7 = ((ddf)localObject1).cOs().get(i);

        if ((localbyz == null) || (l7 != localbyz.getId()))
        {
          try
          {
            localObject18 = CA.Lv().bj(l7);
            if (localObject18 != null) {
              if (((Su)localObject18).afj()) {
                ((Su)localObject18).aeL().atv();
                CA.Lv().r((Su)localObject18); } else {
                if (((ddf)localObject1).cOq()) {
                  if (!((Su)localObject18).adt()) {
                    ((Su)localObject18).bo(true);
                  }

                  continue;
                }
                if (!((Su)localObject18).ads());
                CA.Lv().r((Su)localObject18);
              }

            }

            int i23 = ((ddf)localObject1).cOr().get(i);
            localObject27 = null;
            switch (i23) {
            case 0:
              localObject27 = new bKm();
              break;
            case 1:
              localObject27 = byo.bFu();
              break;
            case 4:
              localObject27 = new dhx();
            case 2:
            case 3:
            }
            if (localObject27 == null) {
              K.error("Spawn d'acteur de type inconnu : " + i23);
            }
            else
            {
              int i29 = 0;
              ((Su)localObject27).q((byte[])((ddf)localObject1).cOt().get(i));
              ((Su)localObject27).initialize();
              if (((ddf)localObject1).cOq())
                ((Su)localObject27).bo(true);
              else {
                ((Su)localObject27).bn(true);
              }
              if (CA.Lv().p((Su)localObject27)) {
                ((Su)localObject27).aeV();

                if (((Su)localObject27).aeR() != -1) {
                  i29 = 1;
                }

                int i31 = asc.jT(((Su)localObject27).aKb().getX());
                int i32 = asc.jU(((Su)localObject27).aKb().getY());
              }
              else
              {
                ((Su)localObject27).release();
                continue;
              }

              if ((localObject27 instanceof bKm)) {
                localObject33 = (bKm)localObject27;

                if ((localbyz.bHj().Td()) && (localbyz.bHj().Ta().N(l7))) {
                  bED.bMP().gx(l7);
                }

                ((bKm)localObject33).adq();
              }

              localObject33 = ((Su)localObject27).aeL();
              if (i29 != 0) {
                b((Su)localObject27, (cew)localObject33);
              }

              if (((Su)localObject27).afk())
                ((Su)localObject27).h(cfY.hBf);
              else {
                ((cew)localObject33).atf();
              }

              if (((localObject27 instanceof byo)) && (((Su)localObject27).isDead())) {
                ((byo)localObject27).bFy();
              }

              bdB.b((aVn)localObject33);
            }
          } catch (Exception localException2) { K.error("Exception lors du spawn de l'actor " + l7, localException2); }

        }
      }
      return false;
    case 4104:
      localObject1 = (awe)paramcWG;

      for (localObject3 = ((awe)localObject1).aIe().iterator(); ((Iterator)localObject3).hasNext(); ) { Cs localCs = (Cs)((Iterator)localObject3).next();
        a(((Long)localCs.Lp()).longValue(), ((Byte)localCs.getFirst()).byteValue(), false, ((awe)localObject1).aIf());
      }
      return false;
    case 15720:
      localObject1 = (aor)paramcWG;
      localObject3 = CA.Lv().bj(((aor)localObject1).eq());

      int i6 = ((aor)localObject1).gC();
      int i12 = ((aor)localObject1).aAI();
      boolean bool = ((aor)localObject1).aAJ();
      ((Su)localObject3).aeL().v(i6, bool);

      return false;
    case 15722:
      localObject1 = (aID)paramcWG;
      int j = ((aID)localObject1).aSv();

      localObject9 = localbyz.bGE();
      ((bRM)localObject9).cB(j);
      localObject14 = new aEe(bU.fH().getString("emote.learnt", new Object[] { bU.fH().b(80, j, new Object[0]) }));
      ((aEe)localObject14).mm(4);
      CM.LV().a((aEe)localObject14);

      dLE.doY().a((dBv)localObject9, ((bRM)localObject9).getFields());

      byv.bFN().bFO().bGD().d(aFy.ebG);

      localObject19 = new cMa();
      ((cMa)localObject19).setItem(((bRM)localObject9).tS(j));
      ((cMa)localObject19).yx(-1);
      ((cMa)localObject19).setPosition(-1);
      ((cMa)localObject19).c(false);
      ((cMa)localObject19).iw(true);
      ((cMa)localObject19).d(16700);
      cjO.clE().j((cWG)localObject19);
      return false;
    case 4116:
      localObject1 = (bnK)paramcWG;
      long l2 = ((bnK)localObject1).bix();
      localObject14 = CA.Lv().bj(l2);

      if (localObject14 != null) {
        localObject19 = ((Su)localObject14).aeL();

        if (((cew)localObject19).dpz() != null) {
          if (!((bnK)localObject1).bxG()) {
            localObject25 = new Gc((Su)localObject14, ((bnK)localObject1).eo(), ((bnK)localObject1).bxE(), ((bnK)localObject1).bxF());
            ((Su)localObject14).a((Gc)localObject25);
          }
        }
        else {
          localObject25 = clR.cni().vL(((bnK)localObject1).eo());
          if (localObject25 != null) {
            localObject27 = acL.apd().aP(((bnK)localObject1).bxE(), ((bnK)localObject1).bxF());
            dWu localdWu = null;
            if (localObject27 == null) {
              localdWu = ayg.aJQ().dw(((bnK)localObject1).m());
            }
            ((Su)localObject14).b((dCb)localObject27);
            localObject33 = ((cew)localObject19).ata();
            String[] arrayOfString = (localdWu != null ? "AnimCraft-Debut" : localObject27 != null ? ((aCH)localObject25).aOQ() : "").split("-");

            if (((bnK)localObject1).bxG()) {
              localObject36 = arrayOfString[0] + "-Fin";

              ((cew)localObject19).eq((String)localObject36);
              ((cew)localObject19).bHi().cvZ();
            } else if (!((String)localObject33).equals(arrayOfString[0])) {
              if ((localObject27 != null) && (localdWu != null))
              {
                int i34;
                short s3;
                if (localObject27 != null) {
                  i33 = ((azX)localObject27).fa();
                  i34 = ((azX)localObject27).fb();
                  s3 = ((azX)localObject27).fc();
                } else {
                  i33 = localdWu.fa();
                  i34 = localdWu.fb();
                  s3 = localdWu.fc();
                }
                CG localCG = ((Su)localObject14).aKb().aa(i33, i34, s3);
                if (localCG == null) {
                  localCG = ((Su)localObject14).aKb().Z(new cYk(((bnK)localObject1).bxE(), ((bnK)localObject1).bxF(), (short)0));
                }
                if (localCG != null) {
                  ((cew)localObject19).c(localCG);
                }
              }
              if (localdWu == null)
                dgM.a((dMM)localObject19, (aCH)localObject25);
              else {
                ((cew)localObject19).eq("AnimCraft-Debut");
              }
            }
          }
        }
      }

      return false;
    case 4115:
      localObject1 = (bbB)paramcWG;

      localObject4 = CA.Lv().bj(((bbB)localObject1).bix());
      if (localObject4 != null)
      {
        localObject9 = ((Su)localObject4).aeL();
        ((cew)localObject9).bIS();
        if (!((cew)localObject9).b(new cYk(((bbB)localObject1).getX(), ((bbB)localObject1).getY(), ((bbB)localObject1).IB()), false, false))
          ((cew)localObject9).k(((bbB)localObject1).getX(), ((bbB)localObject1).getY(), ((bbB)localObject1).IB());
      }
      else {
        K.error("[ACTOR_STOP_MOVEMENT_MESSAGE] Unknow mobile");
      }

      return false;
    case 4118:
      localObject1 = (dOn)paramcWG;

      localObject4 = CA.Lv().bj(((dOn)localObject1).eW());
      if (localObject4 != null) {
        localObject9 = ((Su)localObject4).aeL();
        if ((((cew)localObject9).dpz() == null) || (((cew)localObject9).dpz().csW() == 0)) {
          ((cew)localObject9).c(((dOn)localObject1).E());
          ((Su)localObject4).aeJ();
        } else {
          localObject14 = ((dOn)localObject1).E();
          ((cew)localObject9).b(new UC(this, (CG)localObject14));
        }

      }
      else
      {
        K.error("[ACTOR_DIRECTION_CHANGE_MESSAGE] Unknow mobile");
      }

      return false;
    case 4126:
      localObject1 = (aTf)paramcWG;

      localObject4 = CA.Lv().bj(((aTf)localObject1).bix());
      if (localObject4 != null) {
        if (((Su)localObject4).adF()) {
          K.error("on ne catche pas un teleport dans les frames de fight ?");
          return true;
        }
        int i7 = ((aTf)localObject1).getX();
        int i13 = ((aTf)localObject1).getY();
        short s2 = ((aTf)localObject1).biy();
        K.trace("Téléportation de l'acteur ID=" + ((aTf)localObject1).bix() + " vers [" + i7 + ":" + i13 + ":" + ((aTf)localObject1).biy() + "]");

        localObject25 = WakfuClientInstance.awy().Dg();
        if ((localObject4 == localbyz) && (!((aTf)localObject1).biz())) {
          localObject27 = ((cXf)localObject25).cKV();
          double d1 = ((aWe)localObject27).xV();
          double d2 = ((aWe)localObject27).xW();
          double d3 = (d1 - i7) * (d1 - i7) + (d2 - i13) * (d2 - i13);
          if ((d3 > 400.0D) || (((aTf)localObject1).biA())) {
            int i35 = bOh.D();
            aRs.bhJ().nL(i35);
            bOh.a((cXf)localObject25, i7, i13, s2);
          }
        }
        if (localObject4 == localbyz) {
          localObject27 = localbyz.aeL();
          localObject30 = new UA(this, (Su)localObject4, i7, i13, (aTf)localObject1);

          ((cew)localObject27).b(ayg.aJQ());

          a((Su)localObject4, i7, i13, s2, ((aTf)localObject1).biz());
          ((cew)localObject27).a(ayg.aJQ());

          if (IH.Sd().Se())
            IH.Sd().a((dnV)localObject30);
          else
            ((dnV)localObject30).Hi();
        }
        else {
          a((Su)localObject4, i7, i13, s2, ((aTf)localObject1).biz());
        }
      } else {
        K.error("Impossible de trouver l'acteur ID=" + ((aTf)localObject1).bix() + " pour le téléporter.");
      }
      return false;
    case 4114:
      localObject1 = (dOY)paramcWG;

      localObject4 = CA.Lv().bj(((dOY)localObject1).bix());
      if (localObject4 != null) {
        localObject10 = ((Su)localObject4).aeL();
        localObject15 = ((dOY)localObject1).cPV();
        ((cew)localObject10).a((dtq)localObject15);
        if ((localObject4 instanceof bKm))
          K.trace("Update de chemin reçue pour le personnage " + ((Su)localObject4).getName() + "(" + ((Su)localObject4).getId() + ") : currentPos=[" + ((cew)localObject10).dpB() + ":" + ((cew)localObject10).dpC() + "] newPath=" + localObject15);
      }
      else
      {
        K.error("Impossible de déplacer le personnage " + ((dOY)localObject1).bix() + " car il n'existe pas !");
      }

      return false;
    case 4127:
      localObject1 = (bOs)paramcWG;
      localObject4 = CA.Lv().bj(((bOs)localObject1).bix());
      if (localObject4 == null) {
        return false;
      }
      a((bOs)localObject1, (Su)localObject4);

      return false;
    case 4210:
      localObject1 = (bZn)paramcWG;

      localObject4 = CA.Lv().bj(((bZn)localObject1).bix());
      if (localObject4 != null) {
        ((Su)localObject4).a(((bZn)localObject1).Uq(), ((bZn)localObject1).cdP(), ((bZn)localObject1).cdQ());
      }

      if (cBQ.cxL().mZ("spellsDialog")) {
        localObject10 = dPm.dqv();
        ((dPm)localObject10).acB();
      }

      return false;
    case 8036:
      localObject1 = (dgY)paramcWG;
      localObject4 = ((dgY)localObject1).cPW();
      while (((Iterator)localObject4).hasNext()) {
        localObject10 = (Map.Entry)((Iterator)localObject4).next();
        localObject15 = CA.Lv().bj(((Long)((Map.Entry)localObject10).getKey()).longValue());
        if (((Byte)((Map.Entry)localObject10).getValue()).byteValue() == 1) {
          if ((localObject15 != null) && (localbyz != null)) {
            ((Su)localObject15).c(cEi.m(localbyz.fa() - ((Su)localObject15).fa(), localbyz.fb() - ((Su)localObject15).fb()));

            ((Su)localObject15).aeL().dK((byte)-1);
          }
        }
        else if (localObject15 != null) {
          ((Su)localObject15).aeL().chl();
        }

      }

      return false;
    case 4216:
      localObject1 = (aTW)paramcWG;

      localObject4 = ((aTW)localObject1).bjn();
      localObject10 = ((aoL)localObject4).aBa();
      while (((cHu)localObject10).hasNext()) {
        ((cHu)localObject10).fl();

        localObject15 = CA.Lv().bj(((cHu)localObject10).bic());
        if (localObject15 != null) {
          ((Su)localObject15).q((byte[])((cHu)localObject10).value());
        }
      }
      return false;
    case 8402:
      localObject1 = (cwW)paramcWG;

      K.trace("[SPELL] reception d'un message d'apprentissage de nouveaux sorts");

      localObject4 = ((cwW)localObject1).cuw();

      for (localObject10 = ((ArrayList)localObject4).iterator(); ((Iterator)localObject10).hasNext(); ) { localObject15 = (cFc)((Iterator)localObject10).next();
        try
        {
          if (((Integer)((cFc)localObject15).getFirst()).intValue() != 539)
            localObject20 = new apX(Be.Kj().ea(((Integer)((cFc)localObject15).getFirst()).intValue()), ((Short)((cFc)localObject15).cAE()).shortValue(), ((Long)((cFc)localObject15).Lp()).longValue());
          else {
            localObject20 = new amm(localbyz, Be.Kj().ea(((Integer)((cFc)localObject15).getFirst()).intValue()), ((Long)((cFc)localObject15).Lp()).longValue(), localbyz.bGn().a(bcR.fmZ));
          }
          localbyz.auK().c((dsj)localObject20);
          localbyz.aet().a((dSR)((apX)localObject20).bsL(), (apX)localObject20);

          bOU.gUc.b(new dfu(((dSR)((apX)localObject20).bsL()).getId()));
          CM.LV().f(bU.fH().getString("spell.newSpellLearn", new Object[] { cPU.kAC, Be.Kj().ea(((Integer)((cFc)localObject15).getFirst()).intValue()).getName() }), 4);
          Bf.Kk().Ko();
          if (((dSR)((apX)localObject20).bsL()).bHY())
            for (localObject25 = ((apX)localObject20).iterator(); ((Iterator)localObject25).hasNext(); ) { localObject27 = (dpI)((Iterator)localObject25).next();

              if (((dpI)localObject27).aMG() == 0)
              {
                ((dpI)localObject27).a((Ce)localObject20, localbyz, localbyz.bGq(), bsj.bAv(), localbyz.fa(), localbyz.fb(), localbyz.fc(), localbyz, null);
              }
            }
        }
        catch (dI localdI)
        {
          Object localObject20;
          K.error("[SPELL] Plus de place dans l'inventaire des sort pour en apprendre un nouveau");
        } catch (dcF localdcF) {
          K.error("[SPELL] Sort déjà appri et présent dans l'inventaire");
        }

      }

      if (cBQ.cxL().mZ("spellsDialog")) {
        dLE.doY().a(localbyz.aet(), localbyz.aet().getFields());
      }
      return false;
    case 4000:
      localObject1 = (doP)paramcWG;

      K.trace("[ERROR] reception d'une erreur");

      int k = ((doP)localObject1).cWl();
      avW.aIb().a(k, 3, new Object[0]);

      if (bow.qv(k)) {
        bOU.gUc.b(new bow(k));
      }

      return false;
    case 4124:
      localObject1 = (Aj)paramcWG;
      localbyz.bRI().bc(((Aj)localObject1).getValue(), ((Aj)localObject1).Jt());
      return false;
    case 5402:
      localObject1 = (aNz)paramcWG;
      localSu = CA.Lv().bj(((aNz)localObject1).eq());
      if ((localSu != null) && ((localSu instanceof byz))) {
        localObject10 = ((byz)localSu).bGo();
        if (localObject10 != null) {
          dLE.doY().a(ceR.chM(), ceR.bF);
        }
      }
      return false;
    case 4130:
      localObject1 = (cFi)paramcWG;

      localSu = CA.Lv().bj(((cFi)localObject1).eq());
      if (localSu != null)
        localSu.q(((cFi)localObject1).cAG());
      else {
        K.error("[CHARACTER_UPDATE_MESSAGE] Impossible de trouver le CharacterInfo ID=" + ((cFi)localObject1).eq());
      }
      return false;
    case 15132:
      localObject1 = (bJD)paramcWG;
      m = ((bJD)localObject1).bP();

      localbyz.cJf().dN(m);

      return false;
    case 15133:
      ((ctE)localbyz.cJf()).HU();
      return false;
    case 4204:
      localObject1 = (Rh)paramcWG;
      m = ((Rh)localObject1).acF();
      if (m == 7) {
        return false;
      }

      if (m == 4) {
        CM.LV().f(bU.fH().getString("collect.error.resourceOccupied"), 4);
        return false;
      }

      if (!localbyz.aTn().contains(((Rh)localObject1).acH())) {
        K.error("le joueur ne possède pas ce skill " + ((Rh)localObject1).acH());
        return false;
      }

      if (m == 5)
      {
        localObject10 = ((Rh)localObject1).getItems();
        for (localObject15 = ((ArrayList)localObject10).iterator(); ((Iterator)localObject15).hasNext(); ) { localObject21 = (Cs)((Iterator)localObject15).next();

          localObject25 = (gA)((Cs)localObject21).Lp();
          int i27 = ((gA)localObject25).nP();
          localObject30 = localbyz.bGP().iO(((Long)((Cs)localObject21).getFirst()).longValue());
          if ((localObject30 != null) && (((cRs)localObject30).ajz() != null) && (((cRs)localObject30).ajz().b(((cRs)localObject30).cHT(), (dsj)localObject25) == 0)) {
            try
            {
              ((cRs)localObject30).av((gA)localObject25);
              dtY.a((gA)localObject25, 4);

              if (WakfuClientInstance.awy().awB().a(bmz.fFa)) {
                localObject33 = ((gA)localObject25).oi();
                localObject35 = byv.bFN().bFO().bGD().kb(false);
                i33 = 0;
                for (localObject37 = ((ArrayList)localObject35).iterator(); ((Iterator)localObject37).hasNext(); ) { localObject38 = (bJz)((Iterator)localObject37).next();
                  ArrayList localArrayList = ((bJz)localObject38).hi(((bBn)localObject33).getId());
                  for (dKD localdKD : localArrayList) {
                    if (localdKD.asL() == bKq.gNf) {
                      i33 = 1;
                      break;
                    }
                  }
                  if (i33 != 0)
                    break;
                }
                Object localObject38;
                if (i33 == 0) {
                  localObject37 = ((bBn)localObject33).bKr();
                  if ((localObject37 instanceof alo)) {
                    localObject38 = new cMa();

                    ((cMa)localObject38).setItem(((cRs)localObject30).yT(((bBn)localObject33).getId()));
                    ((cMa)localObject38).yx(-1);
                    ((cMa)localObject38).setPosition(-1);
                    ((cMa)localObject38).c(false);
                    ((cMa)localObject38).iw(true);
                    ((cMa)localObject38).d(16700);
                    cjO.clE().j((cWG)localObject38);
                  }
                }
              }
            } catch (Exception localException3) {
              K.error("Exception", localException3);
            }
          }

        }

        if ((localbyz.bSe() != null) && (localbyz.bSe().fU() == 3)) {
          localbyz.bSf();
        }
        return false;
      }

    case 4200:
      localObject1 = (Ic)paramcWG;
      if (acL.apd().aQ(((Ic)localObject1).getX(), ((Ic)localObject1).getY())) {
        K.error("La resource " + ((Ic)localObject1).Rw() + " en " + ((Ic)localObject1).getX() + ":" + ((Ic)localObject1).getY() + ":" + ((Ic)localObject1).IB() + " existe déjà sur le client");
      }
      else {
        localObject5 = (dxy)fj.mh().hH(((Ic)localObject1).Rw());

        if ((localObject5 instanceof ceV))
          localObject10 = cTi.a(((Ic)localObject1).getX(), ((Ic)localObject1).getY(), ((Ic)localObject1).IB(), ((Ic)localObject1).Rw(), ((Ic)localObject1).Rx(), ((Ic)localObject1).Rz(), ((Ic)localObject1).Ry());
        else {
          localObject10 = azX.a(((Ic)localObject1).getX(), ((Ic)localObject1).getY(), ((Ic)localObject1).IB(), ((Ic)localObject1).Rw(), ((Ic)localObject1).Rx(), ((Ic)localObject1).Rz(), ((Ic)localObject1).Ry());
        }
        if (localObject10 != null) {
          acL.apd().g((azX)localObject10);
          ((azX)localObject10).atf();
        }
      }

      return false;
    case 4202:
      localObject1 = (aZk)paramcWG;

      for (localObject5 = ((aZk)localObject1).KA().iterator(); ((Iterator)localObject5).hasNext(); ) { localObject10 = (dIE)((Iterator)localObject5).next();
        if (acL.apd().aQ(((dIE)localObject10).div(), ((dIE)localObject10).diw())) {
          K.error("La resource " + ((dIE)localObject10).diu() + " en " + ((dIE)localObject10).div() + ":" + ((dIE)localObject10).diw() + ":" + ((dIE)localObject10).dix() + " existe déjà sur le client");
        }
        else
        {
          localObject15 = (dxy)fj.mh().hH(((dIE)localObject10).diu());

          if ((localObject15 instanceof ceV))
            localObject21 = cTi.a(((dIE)localObject10).div(), ((dIE)localObject10).diw(), ((dIE)localObject10).dix(), ((dIE)localObject10).diu(), ((dIE)localObject10).aLR(), ((dIE)localObject10).diy(), ((dIE)localObject10).Ry());
          else {
            localObject21 = azX.a(((dIE)localObject10).div(), ((dIE)localObject10).diw(), ((dIE)localObject10).dix(), ((dIE)localObject10).diu(), ((dIE)localObject10).aLR(), ((dIE)localObject10).diy(), ((dIE)localObject10).Ry());
          }
          if (localObject21 != null) {
            acL.apd().g((azX)localObject21);
            ((azX)localObject21).atf();
          }
        }
      }

      return false;
    case 4201:
      localObject1 = (dAA)paramcWG;
      int n = ((dAA)localObject1).getX();
      int i8 = ((dAA)localObject1).getY();
      i14 = ((dAA)localObject1).pl();
      i18 = ((dAA)localObject1).LI();
      localObject25 = acL.apd().aP(n, i8);
      if (localObject25 != null) {
        ((azX)localObject25).i((byte)i14, true);
        if (i18 > 0) {
          localObject28 = cof.cop().vY(i18);
          ((FreeParticleSystem)localObject28).f(((azX)localObject25).fa(), ((azX)localObject25).fb(), ((azX)localObject25).fc());
          cWS.cKD().b((IsoParticleSystem)localObject28);
        }
      }

      return false;
    case 4142:
      localObject1 = (bDo)paramcWG;

      if (!((bDo)localObject1).IR()) {
        if (!aDI.aPQ().wd())
          avW.aIb().a(13, 4, new Object[0]);
      }
      else if (byv.bFN().c(aDI.aPQ())) {
        aDI.aPQ().wf();
      }
      aDI.aPQ().wi();

      dtY.l(aDI.aPQ().getItem(), (short)1);

      return false;
    case 4180:
      localObject1 = (cEY)paramcWG;

      if (!((cEY)localObject1).IR()) {
        if (!daM.kSz.wd())
          avW.aIb().a(38, 3, new Object[0]);
      }
      else if (byv.bFN().c(daM.kSz)) {
        daM.kSz.wf();
        CM.LV().f(bU.fH().getString("searchTreasureSuccess"), 4);
      }

      gA localgA = daM.kSz.getItem();
      if (localgA == null) {
        K.error("[SEARCH_TREASURE] On creuse sans item !?");
      } else {
        localObject11 = localgA.oi().bKr();
        if ((localObject11 != null) && (((adx)localObject11).apv())) {
          dtY.l(localgA, (short)1);
        }
      }
      daM.kSz.wi();

      return false;
    case 9508:
      localObject1 = (dnv)paramcWG;
      i1 = ((dnv)localObject1).aof();
      avW.aIb().a(i1, 3, new Object[0]);
      if (bow.qv(i1)) {
        bOU.gUc.b(new bow(i1));
      }
      daM.kSz.bU(i1);

      return false;
    case 9506:
      localObject1 = (abU)paramcWG;
      i1 = ((abU)localObject1).aof();
      avW.aIb().a(i1, 3, new Object[0]);
      if (bow.qv(i1)) {
        bOU.gUc.b(new bow(i1));
      }
      aDI.aPQ().bU(i1);

      return false;
    case 5206:
      localObject1 = (bJd)paramcWG;
      localObject6 = CA.Lv().bj(((bJd)localObject1).bix());
      if (localObject6 == null) {
        return false;
      }

      localObject11 = ((bJd)localObject1).bQu().yv();
      for (i14 = 0; i14 < localObject11.length; i14 = (byte)(i14 + 1)) {
        i18 = localObject11[i14];
        if (((bJd)localObject1).bQu().ap(i18) == -1) {
          ((Su)localObject6).aeu().aq(i18);
        } else {
          int i24 = ((bJd)localObject1).bQu().ap(i18);
          ((Su)localObject6).aeu().c(i18, i24);
        }
      }

      ((Su)localObject6).ayD();
      ((Su)localObject6).aek();

      return false;
    case 11106:
      localObject1 = (Sy)paramcWG;
      localObject6 = bQK.bXG().gY(((Sy)localObject1).eW());
      if ((localObject6 instanceof cew)) {
        for (int i9 = 0; i9 < ((Sy)localObject1).afy().size(); i9++) {
          i14 = ((Sy)localObject1).afy().get(i9);
          ((cew)localObject6).cg(i14);
        }
      }

      return false;
    case 4176:
      localObject1 = (cTk)paramcWG;

      localObject6 = new gA();
      ((gA)localObject6).b(((cTk)localObject1).cIV());

      localbyz.bGP().ap((gA)localObject6);

      cYb.cLu().cLv();

      dtY.a((gA)localObject6, 4);

      return false;
    case 10002:
      localObject1 = (blD)paramcWG;
      bjH.buV().fD(((blD)localObject1).sN());

      return false;
    case 4125:
      localObject1 = (cBe)paramcWG;

      ayg.aJQ().bt(((cBe)localObject1).ajM(), ((cBe)localObject1).ajN());

      return false;
    case 4108:
      localObject1 = (cY)paramcWG;

      l3 = ((cY)localObject1).eq();
      l10 = ((cY)localObject1).gA();
      Js localJs = dRx.dsw().DN(((cY)localObject1).gz());

      if (localJs != null) {
        localObject28 = (byo)CA.Lv().bj(l3);
        localObject30 = CA.Lv().bj(l10);

        if (localObject30 != null)
          localObject34 = new aIA(dqt.cXz(), 0, 0, localJs.uN(), (byo)localObject28, (Su)localObject30);
        else {
          localObject34 = new aIA(dqt.cXz(), 0, 0, localJs.uN(), (byo)localObject28, l10);
        }

        if (localObject28 != null) {
          if (((byo)localObject28).bFA() != null) {
            ((byo)localObject28).bFA().aUu();
          }

          ((byo)localObject28).a((aIA)localObject34);

          localObject35 = ((byo)localObject28).aeL();

          if ((((cew)localObject35).dpz() != null) && (localJs.TA())) {
            ((cew)localObject35).b(new Uz(this, (aIA)localObject34));
          }
          else
          {
            ast.dCm.d((bSR)localObject34);
            ast.dCm.RF();
          }
        }
      } else {
        K.error("Réception d'un MonsterBehaviour inconnu id=" + ((cY)localObject1).gz());
      }

      return false;
    case 4530:
      localObject1 = (afg)paramcWG;
      l3 = ((afg)localObject1).aqN();
      l10 = ((afg)localObject1).eW();
      long l14 = ((afg)localObject1).aqO();
      localObject30 = (byo)CA.Lv().bj(l3);
      if (localObject30 == null) {
        K.warn("Reception d'un messsage d'action pour le monstre " + l3 + " alors qu'on ne le connait pas");
        return false;
      }

      localObject34 = (bKm)CA.Lv().bj(l10);
      if (localObject34 == null) {
        K.warn("Reception d'un messsage d'action pour le monstre " + l3 + "\tinitié par le joueur " + l10 + " alors qu'on ne le connait pas");

        return false;
      }

      localObject35 = ((byo)localObject30).bFD().fe(l14);
      if (localObject35 == null) {
        K.error("Reception d'un messsage d'action " + l14 + " inconnu pour le monstre " + l3);
        return false;
      }

      aCH localaCH = ((VI)localObject35).te();
      dgM.a(((bKm)localObject34).aeL(), localaCH);

      localObject37 = new bMV(dqt.cXz(), 0, 0, ((VI)localObject35).uN(), (byo)localObject30, (bKm)localObject34);
      ast.dCm.d((bSR)localObject37);
      ast.dCm.RF();

      return false;
    case 4110:
      localObject1 = (dqP)paramcWG;

      localbyo1 = (byo)CA.Lv().bj(((dqP)localObject1).eq());
      dxi localdxi = aqT.aDc().jC(((dqP)localObject1).cXY());

      clD localclD = cqu.cpE().cpF();
      if (localclD != null) {
        int i19 = 0; for (int i25 = localclD.cmZ(); i19 < i25; i19++) {
          localObject28 = localclD.vK(i19);
          if (((localObject28 instanceof byo)) && (((byo)localObject28).getId() == localbyo1.getId())) {
            cqu.cpE().alK();
            break;
          }
        }
      }
      localObject22 = new cBN(dqt.cXz(), 0, 0, localdxi.uN(), ((dqP)localObject1).eq(), localdxi.cxI(), ((dqP)localObject1).cXZ());

      ast.dCm.d((bSR)localObject22);
      ast.dCm.RF();

      return false;
    case 4526:
      localObject1 = (dgZ)paramcWG;

      localbyo1 = (byo)CA.Lv().bj(((dgZ)localObject1).eq());

      if (localbyo1 != null) {
        localbyo1.s(((dgZ)localObject1).eo(), ((dgZ)localObject1).cPX());
      }

      return false;
    case 4134:
      localObject1 = (cUB)paramcWG;

      long l4 = ((cUB)localObject1).cJN();
      long l11 = ((cUB)localObject1).cJM();

      byo localbyo3 = (byo)CA.Lv().bj(l11);
      if (localbyo3 != null) {
        cWz.cKu().a(localbyo3, true);
        localbyo3.aS(l4);

        cWz.cKu().b(localbyo3, Collections.EMPTY_LIST);
      }

      return false;
    case 4112:
      localObject1 = (bXg)paramcWG;

      byo localbyo2 = (byo)CA.Lv().bj(((bXg)localObject1).eq());
      if (localbyo2 == null) {
        K.error("Tentative de modification des états d'un NPC qui n'existe pas");
        return false;
      }

      int i10 = ((bXg)localObject1).ccC();
      int i15 = i10 < 0 ? 1 : 0;
      if (i15 != 0) {
        i10 = (byte)Math.abs(i10);
      }
      localObject22 = dKm.CM(i10);
      try
      {
        if (i15 != 0) {
          chA.cjx().b(localbyo2, (dKm)localObject22);
        }
        else {
          if ((localObject22 == dKm.lWV) && (!localbyo2.isDead()) && (!localbyo2.adF())) {
            localbyo2.bFy();
          }
          chA.cjx().a(localbyo2, (dKm)localObject22);
        }
      }
      catch (NullPointerException localNullPointerException)
      {
      }

      return false;
    case 9200:
      localObject1 = (bZE)paramcWG;

      l5 = ((bZE)localObject1).eq();
      str = ((bZE)localObject1).acb();

      localObject22 = CA.Lv().bj(l5);
      if ((localObject22 != null) && (str != null)) {
        ((Su)localObject22).aeL().eq(str);
      }

      return false;
    case 9202:
      localObject1 = (Qn)paramcWG;

      l5 = ((Qn)localObject1).eq();
      str = ((Qn)localObject1).acb();

      localObject22 = CA.Lv().bj(l5);
      if ((localObject22 != null) && (str != null)) {
        ((Su)localObject22).aeL().es(str);
      }

      return false;
    case 9201:
      localObject1 = (CD)paramcWG;

      l5 = ((CD)localObject1).eq();
      i16 = ((CD)localObject1).LI();
      int i20 = ((CD)localObject1).LJ();

      localObject26 = CA.Lv().bj(l5);
      if ((localObject26 != null) && (i16 != 0) && (i20 != 0))
      {
        localObject28 = cof.cop().vY(i16);
        int i30 = ((FreeParticleSystem)localObject28).getId();

        if (((CD)localObject1).LK()) {
          localObject34 = ((Su)localObject26).aeL();
          if (localObject34 != null)
            ((FreeParticleSystem)localObject28).b((bSl)localObject34);
        }
        else {
          ((FreeParticleSystem)localObject28).k(((Su)localObject26).fa(), ((Su)localObject26).fb(), ((Su)localObject26).fc());
        }

        cWS.cKD().b((IsoParticleSystem)localObject28);
        dka.cSF().a(new Uy(this, i30), i20 * 1000, 1);
      }

      return false;
    case 15402:
      localObject1 = (aGq)paramcWG;

      l5 = ((aGq)localObject1).eq();
      i16 = ((aGq)localObject1).aSv();
      localObject23 = ((aGq)localObject1).aSw();

      localObject26 = CA.Lv().bj(l5);
      if ((localObject26 != null) && (i16 != 0)) {
        ((Su)localObject26).a(i16, (HashMap)localObject23, true);
      }

      return false;
    case 5504:
      localObject1 = (cug)paramcWG;
      bKm localbKm = (bKm)CA.Lv().bj(((cug)localObject1).eW());
      if (localbKm != null) {
        localbKm.bA(((cug)localObject1).bSl());
      }

      return false;
    case 5506:
      localObject1 = (aBP)paramcWG;
      byv.bFN().bFO().m(((aBP)localObject1).aNR());
    case 5302:
      throw new UnsupportedOperationException("On ne devrait plus passer par là mais par la GameActionPlayScript");
    case 5304:
      K.info("[RIDE] C'est parti pour une balade en monture");
      localObject1 = (afl)paramcWG;
      short s1 = (short)((afl)localObject1).aqS();

      long l8 = ((afl)localObject1).aqR();
      localObject23 = l8 == localbyz.getId() ? localbyz : (bKm)CA.Lv().bj(l8);

      localObject26 = cMn.cFp().dP(s1);
      if (localObject26 == null) {
        K.error("[RIDE] On tente de monter sur une monture d'un breed que l'on ne connait pas");
        return false;
      }

      localObject28 = ((bKm)localObject23).bSo();
      if (localObject28 != null) {
        if (((byo)localObject28).bFD().uO() != s1) {
          K.info("[RIDE] le joueur " + ((bKm)localObject23).adv() + " essaye de monter sur une monture alors qu'il est déjà sur une autre");
          return false;
        }

        ((bKm)localObject23).bHm();
      }
      else
      {
        localObject31 = byo.bFu();
        ((byo)localObject31).aQ((short)1);
        ((byo)localObject31).c((bhh)localObject26);
        ((bKm)localObject23).m((byo)localObject31);
      }
      return false;
    case 15206:
      localObject1 = (aXr)paramcWG;
      K.info("[TRANSPORT] Message d'evenement de transport : " + ((aXr)localObject1).bmF());

      localObject7 = (brT)ayg.aJQ().dw(((aXr)localObject1).bmG());

      switch (csV.icK[localObject1.bmF().ordinal()]) {
      case 1:
        ((brT)localObject7).setLocked(false);
        break;
      case 2:
        ((brT)localObject7).setLocked(true);
        break;
      case 3:
        CM.LV().f(bU.fH().getString("boat.startTravel"), 4);

        return false;
      case 4:
        CM.LV().f(bU.fH().getString("boat.cantTravel"), 3);

        return false;
      case 5:
        CM.LV().f(bU.fH().getString("boat.full"), 3);

        return false;
      }

      localObject12 = ayg.aJQ().aJS();

      i16 = 0; for (int i21 = ((ArrayList)localObject12).size(); i16 < i21; i16++) {
        localObject26 = (dWu)((ArrayList)localObject12).get(i16);
        if ((localObject26 instanceof aTU)) {
          localObject28 = (aTU)localObject26;
          if (((aTU)localObject28).bjc() == ((aXr)localObject1).bmG()) {
            switch (csV.icK[localObject1.bmF().ordinal()]) {
            case 1:
              ((aTU)localObject28).i(((brT)localObject7).bAn());
              ((aTU)localObject28).eb(true);
              break;
            case 2:
              ((aTU)localObject28).j(((brT)localObject7).bAn());
              ((aTU)localObject28).eb(false);
            }
          }
        }
      }

      return false;
    case 15200:
      localObject1 = (dxH)paramcWG;
      localObject7 = dOX.dqt().Dg(((dxH)localObject1).acm());
      if (localObject7 != null) {
        K.info("Buff de zone id=" + ((dxH)localObject1).acm() + " appliqué pour " + ((dxH)localObject1).dcA() + " ms");
        localbyz.bHl().a(new bjU((SH)localObject7, ((dxH)localObject1).dcA()));
        localbyz.cQQ();
      } else {
        K.error("Buff de zone id=" + ((dxH)localObject1).acm() + " inconnu");
      }

      return false;
    case 15202:
      localObject1 = (dga)paramcWG;
      i2 = 0;
      for (localObject12 = localbyz.bHk().iterator(); ((Iterator)localObject12).hasNext(); ) { localObject16 = (bjU)((Iterator)localObject12).next();
        if (((bjU)localObject16).acm() == ((dga)localObject1).acm()) {
          K.info("Buff de zone id=" + ((dga)localObject1).acm() + " retiré");
          localbyz.bHl().b((bjU)localObject16);
          localbyz.cQQ();
          i2 = 1;
          break;
        }
      }
      if (i2 == 0) {
        K.error("Buff de zone id=" + ((dga)localObject1).acm() + " inconnu");
      }

      return false;
    case 15204:
      localObject1 = (ccZ)paramcWG;
      localbyz.bHl().Of();
      for (i2 = 0; i2 < ((ccZ)localObject1).cfW(); i2++) {
        localObject12 = dOX.dqt().Dg(((ccZ)localObject1).uI(i2));
        if (localObject12 != null) {
          K.info("Buff de zone id=" + ((ccZ)localObject1).uI(i2) + " appliqué pour " + ((ccZ)localObject1).uJ(i2) + " ms");
          localbyz.bHl().a(new bjU((SH)localObject12, ((ccZ)localObject1).uJ(i2)));
        } else {
          K.error("Buff de zone id=" + ((ccZ)localObject1).uI(i2) + " inconnu");
        }
      }
      localbyz.cQQ();

      return false;
    case 4184:
      localObject1 = (aVY)paramcWG;
      float f = ((aVY)localObject1).bll();
      localObject12 = ((aVY)localObject1).blm();
      localObject16 = ((aVY)localObject1).bln();
      bBn localbBn = Hh.QM().dh(4620);
      ((dli)localObject12).a(new Ux(this, localbyz));

      ((aoL)localObject16).b(new Uw(this, localbyz, localbBn));

      byv.bFN().b(dhC.cQm());

      return false;
    case 12602:
      h(paramcWG);

      return false;
    case 8408:
      localObject1 = (Ip)paramcWG;
      agT localagT = ((Ip)localObject1).RK();
      localObject12 = localagT.ast();
      while (((auO)localObject12).hasNext()) {
        ((auO)localObject12).fl();
        int i17 = 0; for (int i22 = ((auO)localObject12).Lb(); i17 < i22; i17++) {
          byv.bFN().bFO().h(((auO)localObject12).fm(), ((Ip)localObject1).RL());
        }
      }

      return false;
    case 15602:
      localObject1 = (Rw)paramcWG;
      i3 = ((Rw)localObject1).sY();
      long l9 = ((Rw)localObject1).acT();
      localObject24 = localbyz.bGv();
      if (localObject24 != null) {
        bnc.bxw().a(localbyz.bGw(), new cWx(i3, l9));
        bnc.bxw().d((ckT)localObject24);
      } else {
        c(i3, l9);
      }

      return false;
    case 15600:
      localObject1 = (aHc)paramcWG;
      i3 = ((aHc)localObject1).aSY();
      localObject13 = localbyz.bGv();
      if (localbyz.bGv() != null) {
        bnc.bxw().a((arl)localObject13, new agZ(i3));
        bnc.bxw().d((ckT)localObject13);
      } else {
        jX(i3);
      }

      return false;
    case 15604:
      localObject1 = (Fq)paramcWG;
      localObject8 = localbyz.bGa();
      if (localObject8 != null) {
        ((bCP)localObject8).k(((Fq)localObject1).OS(), ((Fq)localObject1).OT());
      }

      return false;
    case 15606:
      localObject1 = (bjw)paramcWG;
      localObject8 = localbyz.bGv();
      if (localbyz.bGv() != null) {
        bnc.bxw().a((arl)localObject8, new bgt(((bjw)localObject1).sY()));
        bnc.bxw().d((ckT)localObject8);
      } else {
        jW(((bjw)localObject1).sY());
      }

      return false;
    case 15608:
      localObject1 = (aGk)paramcWG;
      localObject8 = localbyz.bGv();
      if (localbyz.bGv() != null) {
        bnc.bxw().a((arl)localObject8, new dtj(((aGk)localObject1).sY(), ((aGk)localObject1).anv()));
        bnc.bxw().d((ckT)localObject8);
      } else {
        m(((aGk)localObject1).sY(), ((aGk)localObject1).anv());
      }

      return false;
    case 15612:
      localObject1 = (bsZ)paramcWG;
      localObject8 = localbyz.bGa();
      if (localObject8 != null) {
        ((bCP)localObject8).l(((bsZ)localObject1).sY(), ((bsZ)localObject1).bBa());
      }

      return false;
    case 15614:
      localObject1 = (aIv)paramcWG;
      localObject8 = localbyz.bGa();
      if (localObject8 != null) {
        ((bCP)localObject8).sn(((aIv)localObject1).sY());
      }

      return false;
    case 15618:
      localObject1 = (dSh)paramcWG;

      localObject8 = localbyz.bHj().Ta();
      localObject13 = (aay)((Fs)localObject8).kp(((dSh)localObject1).eW());
      if (localObject13 == null) {
        return false;
      }

      localObject17 = bU.fH().b(62, ((dSh)localObject1).sY(), new Object[0]);

      if (((dSh)localObject1).dsQ())
        localObject24 = bU.fH().getString("chat.notify.questShareAccepted", new Object[] { ((aay)localObject13).getName(), localObject17 });
      else {
        localObject24 = bU.fH().getString("chat.notify.questShareRefused", new Object[] { ((aay)localObject13).getName(), localObject17 });
      }

      CM.LV().f((String)localObject24, 4);

      return false;
    case 15616:
      localObject1 = (GC)paramcWG;
      localObject8 = ((GC)localObject1).QA();

      if (((cbQ)localObject8).isEmpty()) {
        localObject13 = bU.fH().getString("chat.notify.questSharedWithNobody");
      } else {
        localObject17 = new lZ();
        localObject24 = localbyz.bHj().Ta();
        int i26 = 0; for (int i28 = ((cbQ)localObject8).size(); i26 < i28; i26++) {
          if (i26 != 0) {
            ((lZ)localObject17).a(", ");
          }
          localObject31 = (aay)((Fs)localObject24).kp(((cbQ)localObject8).get(i26));
          ((lZ)localObject17).a(((aay)localObject31).getName());
        }
        localObject13 = bU.fH().getString("chat.notify.questSharedWith", new Object[] { ((lZ)localObject17).tP() });
      }

      CM.LV().f((String)localObject13, 4);

      return false;
    case 15610:
      localObject1 = (lC)paramcWG;
      localObject8 = localbyz.bGa();
      if (localObject8 != null) {
        ((bCP)localObject8).reset(((lC)localObject1).sY());
      }

      return false;
    case 5502:
      localObject1 = (sv)paramcWG;
      i4 = ((sv)localObject1).zU();
      if (localbyz.rz(i4)) {
        localObject13 = bU.fH().b(34, i4, new Object[0]);
        localObject17 = bU.fH().getString("chat.notify.titleUnlocked", new Object[] { localObject13 });
        CM.LV().f((String)localObject17, 4);
        bOU.gUc.b(new bQt(i4));
      } else {
        K.error("Réception d'un déblocage de titre id=" + i4 + " qui n'a pas pu être traité correctement dans le client");
      }

      return false;
    case 15726:
      localObject1 = (LX)paramcWG;
      i4 = ((LX)localObject1).Wz();
      if (localbyz.bHq().ui(i4)) {
        localObject13 = bU.fH().getString("chat.notify.dimensionalBagViewUnlocked");
        CM.LV().f((String)localObject13, 4);
      }

      return false;
    case 8414:
      localObject1 = (Ad)paramcWG;
      a((Ad)localObject1);

      return false;
    case 14011:
      localObject1 = (aTR)paramcWG;
      azM.dRs.B(((aTR)localObject1).biX());

      return false;
    case 14013:
      localObject1 = (bKH)paramcWG;
      if (((bKH)localObject1).Gk()) {
        azM.dRs.a(((bKH)localObject1).Gl());
      }

      return false;
    case 14015:
      localObject1 = (xi)paramcWG;
      if (((xi)localObject1).Gk()) {
        azM.dRs.b(((xi)localObject1).Gl());
      }

      return false;
    case 15500:
      localObject1 = (cPF)paramcWG;
      byv.bFN().bFO().bFZ().d(((cPF)localObject1).coC(), ((cPF)localObject1).aIl());
    case 15502:
      localObject1 = (ddq)paramcWG;
      byv.bFN().bFO().bFZ().H(((ddq)localObject1).coC(), ((ddq)localObject1).aIn());

      return false;
    }

    return true;
  }

  private void a(Su paramSu, int paramInt1, int paramInt2, short paramShort, boolean paramBoolean) {
    K.info("tp " + paramSu.getId() + " to " + paramInt1 + ", " + paramInt2);
    if (paramBoolean)
      paramSu.aeL().a(paramInt1, paramInt2, paramShort, false, false);
    else
      paramSu.b(paramInt1, paramInt2, paramShort, paramBoolean);
  }

  public static void jW(int paramInt)
  {
    bCP localbCP = byv.bFN().bFO().bGa();
    if (localbCP != null)
      localbCP.sp(paramInt);
  }

  public static void m(int paramInt, boolean paramBoolean)
  {
    bCP localbCP = byv.bFN().bFO().bGa();
    if (localbCP != null)
      localbCP.o(paramInt, paramBoolean);
  }

  public static void jX(int paramInt)
  {
    bCP localbCP = byv.bFN().bFO().bGa();
    if (localbCP != null) {
      localbCP.so(paramInt);
      aiJ localaiJ = dHn.lSk.CI(paramInt);
      bOU.gUc.b(new aLZ(paramInt, localaiJ.aoq().getId()));
    }
  }

  public static void c(int paramInt, long paramLong) {
    bCP localbCP = byv.bFN().bFO().bGa();
    if (localbCP != null) {
      localbCP.m(paramInt, paramLong);
      bOU.gUc.b(new bwv(paramInt));
    }
  }

  private void a(Ad paramAd) {
    byte b = paramAd.Jk();
    int i = paramAd.Jl();

    qE localqE = qE.z(b);
    byz localbyz = byv.bFN().bFO();

    localbyz.bGQ().a(localqE, localbyz.bGQ().d(localqE) + i);
    localbyz.bGQ().b(localqE, localbyz.bGQ().e(localqE) + i);

    dLE.doY().a(localbyz, new String[] { "availableCommonPoints", "availableAptitudePoints", "aptitudeMenuText" });
  }

  public void b(Su paramSu, cew paramcew)
  {
    ckT localckT = cjS.clP().vz(paramSu.aeR());
    if ((localckT == null) || (!(localckT instanceof czN))) {
      return;
    }

    czN localczN = (czN)localckT;
    localczN.aU(paramSu);
    bOJ.aF(paramSu);

    if (((paramSu instanceof byo)) && ((localckT.aEu() == dzm.lFJ) || (localckT.aEu() == dzm.lFL)))
    {
      paramcew.dK((byte)-1);
    }
    diX localdiX;
    if (paramSu.atL()) {
      localdiX = new diX(dqt.cXz(), dPD.mhi.bJ(), 0, (byte)0, localckT.getId(), false);
      localdiX.O(paramSu.getId());
      bnc.bxw().a(localckT.getId(), localdiX);
      bnc.bxw().d(localckT);
    }

    if (paramSu.cly()) {
      localdiX = new diX(dqt.cXz(), dPD.mhi.bJ(), 0, (byte)2, localckT.getId(), false);
      localdiX.O(paramSu.getId());
      bnc.bxw().a(localckT.getId(), localdiX);
      bnc.bxw().d(localckT);
    }
  }

  private void h(cWG paramcWG)
  {
    byz localbyz = byv.bFN().bFO();

    amO localamO = (amO)paramcWG;
    long l = localamO.eW();
    int i = localamO.azn();

    bKm localbKm = (bKm)CA.Lv().bj(l);
    if (localbKm == null) {
      K.error("Réception d'un update de jauge wakfu pour un joueur inconnu id=" + l);
      return;
    }

    if (localbKm.aeQ() != null) {
      bnc.bxw().a(localbKm.aeR(), new Uv(this, dqt.cXz(), dPD.mis.bJ(), 0, localbKm, i, l, localbyz));
    }
    else
    {
      localbKm.rA(i);
      if (l == localbyz.getId())
        bOU.gUc.b(new bzW());
    }
  }

  private void a(bOs parambOs, Su paramSu)
  {
    a(paramSu, new cYk(parambOs.getX(), parambOs.getY(), parambOs.IB()), CG.eu(parambOs.FW()));
  }

  public void a(Su paramSu, cYk paramcYk, CG paramCG)
  {
    cew localcew = paramSu.aeL();

    if (!localcew.b(paramcYk, false, localcew.cgR() == 8))
    {
      localcew.a(paramcYk, true, false, localcew.cgR() == 8);
      localcew.c(paramCG);
    }

    localcew.b(new csY(this, paramCG));

    if ((K.isTraceEnabled()) && ((paramSu instanceof bKm)))
      K.trace(String.format("Update de chemin reçue pour le personnage %s(%d) : currentPos=[%d:%d] to=%s", new Object[] { paramSu.getName(), Long.valueOf(paramSu.getId()), Integer.valueOf(localcew.dpB()), Integer.valueOf(localcew.dpC()), paramcYk }));
  }

  public void a(long paramLong, byte paramByte, boolean paramBoolean1, boolean paramBoolean2)
  {
    byz localbyz = byv.bFN().bFO();

    if ((localbyz != null) && (paramLong == localbyz.getId()))
    {
      return;
    }
    try
    {
      Object localObject;
      switch (paramByte)
      {
      case 0:
        bKm localbKm = (bKm)CA.Lv().bj(paramLong);
        if (localbKm != null)
        {
          localObject = localbKm.cJf();
          if (localObject != null) {
            ((cvY)localObject).UI().eV(localbKm.getId());
          }
        }
      case 1:
      case 4:
        localObject = CA.Lv().bj(paramLong);
        if (localObject == null) {
          return;
        }
        if (paramBoolean1) {
          if (((Su)localObject).adt())
            ((Su)localObject).bo(false);
          else {
            K.info("Despawn de " + paramLong + " de myFight alors qu'il ne l'était pas => ignoré");
          }

        }
        else if (((Su)localObject).ads()) {
          ((Su)localObject).bn(false);

          clD localclD = cqu.cpE().cpF();
          if (localclD != null) {
            int i = 0; for (int j = localclD.cmZ(); i < j; i++) {
              if (localclD.vK(i) == localObject) {
                cqu.cpE().alK();
                break;
              }
            }
          }

          if ((localbyz.bSe() != null) && (localbyz.aeS() == ((Su)localObject).aeL()))
            localbyz.bSe().a(false, true);
        }
        else {
          K.info("Despawn de " + paramLong + " de world alors qu'il ne l'était pas => ignoré");
          return;
        }

        if ((((Su)localObject).ads()) || (((Su)localObject).adt())) return;
        if (((Su)localObject).aeQ() != null)
          ((Su)localObject).aeQ().S((Su)localObject);
        else
          a(paramBoolean2, (Su)localObject); break;
      case 2:
      case 3:
      }

      K.error("Unknown Actor Type " + paramByte + " for actor " + paramLong);
    }
    catch (Exception localException) {
      K.error("Exception lors du despawn de l'acteur " + paramLong, localException);
    }
  }

  public void a(boolean paramBoolean, Su paramSu)
  {
    c(paramSu, paramBoolean);

    if (paramSu.aeL().bIY()) {
      paramSu.bs(true);
      paramSu.aeL().a(new csW(this));
    }
    else
    {
      CA.Lv().r(paramSu);
    }
  }

  private void c(Su paramSu, boolean paramBoolean) {
    ad(paramSu);
    d(paramSu, paramBoolean);
  }

  private void ad(Su paramSu) {
    if (paramSu.aeR() == -1) {
      return;
    }

    ckT localckT = cjS.clP().vz(paramSu.aeR());
    if (localckT == null) {
      return;
    }
    if ((localckT instanceof czN))
      ((czN)localckT).c(paramSu);
  }

  private void d(Su paramSu, boolean paramBoolean)
  {
    if (paramBoolean) {
      FreeParticleSystem localFreeParticleSystem = cof.cop().vY(800030);
      localFreeParticleSystem.b(paramSu.aeL());
      cWS.cKD().b(localFreeParticleSystem);
    } else {
      cWS.cKD().f(paramSu.aeL());
    }
  }

  public long getId() {
    return 0L;
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
}