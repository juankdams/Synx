import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class agF
  implements cvW
{
  private static agF dat = new agF();
  private static final Logger K = Logger.getLogger(agF.class);

  public static agF asc()
  {
    return dat;
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject2;
    Object localObject4;
    Object localObject6;
    Object localObject7;
    int k;
    Object localObject9;
    Object localObject8;
    Object localObject5;
    Object localObject3;
    switch (paramcWG.getId()) {
    case 5200:
      localObject1 = (dUY)paramcWG;

      localObject2 = ((dUY)localObject1).dvk();

      localObject4 = byv.bFN().bFO();
      ((byz)localObject4).bHc();
      ((byz)localObject4).bHd();
      ((byz)localObject4).q((byte[])localObject2);

      dLE.doY().a((dBv)localObject4, ((byz)localObject4).getFields());
      dLE.doY().a(((byz)localObject4).bGP(), ((byz)localObject4).bGP().getFields());
      byv.bFN().aJK().d(new cMO());

      return false;
    case 5300:
      localObject1 = (bZz)paramcWG;

      if (((bZz)localObject1).cee()) {
        dwF.dbS().removeAll();
      }

      localObject2 = ((bZz)localObject1).cef();
      for (localObject4 = ((ArrayList)localObject2).iterator(); ((Iterator)localObject4).hasNext(); ) { long l2 = ((Long)((Iterator)localObject4).next()).longValue();
        dwF.dbS().kr(l2);
      }

      return false;
    case 5208:
      localObject1 = (aQK)paramcWG;

      localObject2 = ((aQK)localObject1).bhj();
      localObject4 = ((aQK)localObject1).bhk();
      localObject6 = ((aQK)localObject1).bhl();
      localObject7 = new ArrayList();

      for (k = 0; k < ((ArrayList)localObject2).size(); k++) {
        localObject9 = dLf.djM().kG(((Long)((ArrayList)localObject2).get(k)).longValue());
        if ((localObject9 != null) && (((bls)localObject9).getItem() != null)) {
          gA localgA2 = ((bls)localObject9).getItem();
          Object localObject10;
          if ((((bvv)localObject4).get(k) != 1) || (((Long)((ArrayList)localObject6).get(k)).longValue() == -1L)) {
            localObject10 = new aEe(bU.fH().getString("item.lootImpossible.inventoryFull", new Object[] { Short.valueOf(localgA2.nP()), localgA2.getName() }));
            ((aEe)localObject10).mm(3);
            CM.LV().a((aEe)localObject10);
          } else {
            ((ArrayList)localObject7).add(localgA2);
            try {
              localObject10 = byv.bFN().bFO().bGP();
              cRs localcRs2 = ((bMD)localObject10).iO(((Long)((ArrayList)localObject6).get(k)).longValue());
              localcRs2.av(localgA2);
            } catch (Exception localException) {
              K.error("ceci ne devrait pas arriver puisque c est le server qui nous envoie la destination : " + localException);
            }
          }
        }
      }
      if (!((ArrayList)localObject7).isEmpty()) {
        dtY.ah((ArrayList)localObject7);
      }
      return false;
    case 5212:
      localObject1 = (bnv)paramcWG;
      localObject2 = byv.bFN().bFO();
      localObject4 = ((byz)localObject2).bGP().iS(((bnv)localObject1).anE());
      if (localObject4 != null) {
        if (((gA)localObject4).nP() > -((bnv)localObject1).nP()) {
          ((gA)localObject4).a(((bnv)localObject1).nP());
        } else {
          ((byz)localObject2).bGP().iR(((gA)localObject4).oj());
          ((byz)localObject2).bGD().p(((gA)localObject4).oj(), true);
        }
      }
      return false;
    case 5210:
      localObject1 = (crr)paramcWG;

      localObject2 = Hh.QM().dh(((crr)localObject1).aFY());

      localObject4 = byv.bFN().bFO();

      localObject6 = ((byz)localObject4).bGP().iO(((crr)localObject1).clk());

      localObject7 = new gA(((crr)localObject1).anE());
      ((gA)localObject7).b((bBn)localObject2);
      ((gA)localObject7).l(((crr)localObject1).nP());
      try
      {
        k = ((crr)localObject1).cdB();
        if (k != -1) {
          if (((cRs)localObject6).h((gA)localObject7, k)) {
            ((cRs)localObject6).i((gA)localObject7, k);
            dtY.aT((gA)localObject7);
          } else {
            K.error("Erreur : impossible d'ajouter l'item à l'endroit désiré par le serveur");
          }
        }
        else if (((cRs)localObject6).au((gA)localObject7)) {
          ((cRs)localObject6).av((gA)localObject7);
          dtY.aT((gA)localObject7);
        } else {
          K.error("Erreur : impossible d'ajouter l'item à l'endroit désiré par le serveur");
        }
      }
      catch (dI localdI4) {
        K.warn(localdI4.getMessage());
      } catch (dcF localdcF4) {
        K.warn(localdcF4.getMessage());
      } catch (bQT localbQT4) {
        K.warn(localbQT4.getMessage());
      }

      return false;
    case 11118:
      localObject1 = (bSV)paramcWG;
      try
      {
        Fg.d(((bSV)localObject1).wO());
      } catch (dI localdI1) {
        K.error("DéSynchro d'inventaire : Trop d'item", localdI1);
      } catch (dcF localdcF1) {
        K.error("DéSynchro d'inventaire : Duplication", localdcF1);
      } catch (bQT localbQT1) {
        K.error("DéSynchro d'inventaire : Mauvaise position", localbQT1);
      }

      return false;
    case 11120:
      localObject1 = (ps)paramcWG;

      gA localgA1 = ((ps)localObject1).wN();
      int j = ((ps)localObject1).wM();
      localObject6 = byv.bFN().bFO();
      localObject7 = ((byz)localObject6).ayJ();

      ((byz)localObject6).aei();
      ((byz)localObject6).cRl();

      localObject8 = (gA)((bZH)localObject7).dB((short)j);
      if ((localObject8 != null) && (!((gA)localObject8).isActive())) {
        localObject8 = ((uu)localObject8).Dp();
      }

      if (localObject8 != null) {
        localObject9 = ((gA)localObject8).oi().bKn().nj();
        ((bZH)localObject7).d((dsj)localObject8);
        for (n = 0; n < localObject9.length; n++) {
          ((bZH)localObject7).dz((short)localObject9[n].hV);
        }

      }

      localObject9 = localgA1.oi().bKn().nj();
      ((bZH)localObject7).dz((short)j);
      for (int n = 0; n < localObject9.length; n++) {
        ((bZH)localObject7).dz((short)localObject9[n].hV);
      }

      try
      {
        ((bZH)localObject7).b(localgA1, (short)j);
        for (n = 0; n < localObject9.length; n++) {
          ((bZH)localObject7).b(localgA1.nG(), (short)localObject9[n].hV);
        }
        Fg.d(((ps)localObject1).wO());
        ((byz)localObject6).bGH();
      } catch (dI localdI6) {
        K.error("DéSynchro d'inventaire : Trop d'item", localdI6);
      } catch (dcF localdcF6) {
        K.error("DéSynchro d'inventaire : Duplication", localdcF6);
      } catch (bQT localbQT6) {
        K.error("DéSynchro d'inventaire : Mauvaise position", localbQT6);
      }
      ((byz)localObject6).cRm();
      ((byz)localObject6).aej();
      return false;
    case 11122:
      localObject1 = (dkq)paramcWG;

      int i = ((dkq)localObject1).wM();
      byz localbyz = byv.bFN().bFO();
      localObject6 = localbyz.ayJ();

      localObject7 = (gA)((bZH)localObject6).dB((short)i);
      localObject8 = ((gA)localObject7).oi().bKn().nj();

      localbyz.aei();
      localbyz.cRl();

      ((bZH)localObject6).dz((short)i);
      for (int m = 0; m < localObject8.length; m++) {
        ((bZH)localObject6).dz((short)localObject8[m].hV);
      }
      try
      {
        Fg.d(((dkq)localObject1).wO());
        localbyz.bGH();
      } catch (dI localdI5) {
        K.error("DéSynchro d'inventaire : Trop d'item", localdI5);
      } catch (dcF localdcF5) {
        K.error("DéSynchro d'inventaire : Duplication", localdcF5);
      } catch (bQT localbQT5) {
        K.error("DéSynchro d'inventaire : Mauvaise position", localbQT5);
      }
      localbyz.cRm();
      localbyz.aej();
      return false;
    case 5222:
      localObject1 = (cLt)paramcWG;
      btn localbtn = ((cLt)localObject1).cEH();
      try {
        Fg.d(((cLt)localObject1).wO());
      } catch (dI localdI2) {
        K.error("DéSynchro d'inventaire : Trop d'item", localdI2);
      } catch (dcF localdcF2) {
        K.error("DéSynchro d'inventaire : Duplication", localdcF2);
      } catch (bQT localbQT2) {
        K.error("DéSynchro d'inventaire : Mauvaise position", localbQT2);
      }

      localObject5 = byv.bFN().bFO().bGP();
      localObject6 = new bCJ(0L, 0, gv.aEB, (short)0, (bMD)localObject5);

      if (!((bCJ)localObject6).b(localbtn)) {
        K.error("Erreur lors de la récupération du bag uniqueId=" + localbtn.bPv + ", on ignore les bags restants");
        return false;
      }
      ((bMD)localObject5).d((cRs)localObject6);

      ((bCJ)localObject6).d(akr.dlo);

      byv.bFN().bFO().ayD();
      dGW.dhM().kA(((bCJ)localObject6).EN());

      return false;
    case 5224:
      localObject1 = (OJ)paramcWG;
      long l1 = ((OJ)localObject1).aaK();
      try {
        Fg.d(((OJ)localObject1).wO());
      } catch (dI localdI3) {
        K.error("DéSynchro d'inventaire : Trop d'item", localdI3);
      } catch (dcF localdcF3) {
        K.error("DéSynchro d'inventaire : Duplication", localdcF3);
      } catch (bQT localbQT3) {
        K.error("DéSynchro d'inventaire : Mauvaise position", localbQT3);
      }
      byv.bFN().bFO().bGP().iT(l1);

      byv.bFN().bFO().ayD();
      dGW.dhM().kA(l1);

      return false;
    case 5228:
      localObject1 = (dFL)paramcWG;
      localObject3 = byv.bFN().bFO().bGP();
      localObject5 = ((bMD)localObject3).iP(((dFL)localObject1).dha());
      if (localObject5 == null) {
        K.error("Le sac " + ((dFL)localObject1).dha() + " n'existe pas");
        return false;
      }
      ((cRs)localObject5).aH(((dFL)localObject1).dhb());
      dGW.dhM().kA(((cRs)localObject5).EN());

      if (((dFL)localObject1).dhc()) {
        cRs localcRs1 = ((bMD)localObject3).iP(((dFL)localObject1).dhd());
        if (localcRs1 == null) {
          K.error("Le sac " + ((dFL)localObject1).dhd() + " n'existe pas");
          return false;
        }
        localcRs1.aH(((dFL)localObject1).dhe());
        dGW.dhM().kA(localcRs1.EN());
      }

      return false;
    case 5226:
      localObject1 = (cMU)paramcWG;
      localObject3 = ((cMU)localObject1).cFF();
      boolean bool = ((cMU)localObject1).isLocked();
      byv.bFN().bFO().ayJ().a((azO)localObject3, bool);
      return false;
    case 4186:
      localObject1 = (Va)paramcWG;
      a((Va)localObject1);
      return false;
    case 4188:
      localObject1 = (aFW)paramcWG;
      a((aFW)localObject1);
      return false;
    }

    return true;
  }

  private void a(aFW paramaFW) {
    int i = paramaFW.ok();
    if (byv.bFN().c(abS.aob()))
      abS.aob().hD(i);
  }

  private void a(Va paramVa)
  {
    int i = paramVa.ail();
    int j = paramVa.aim();

    if (byv.bFN().c(dhC.cQm())) {
      dhC.cQm().je(i > 0);
    }

    CM.LV().f(bU.fH().getString("recycle.resultMessage", new Object[] { Integer.valueOf(i), Integer.valueOf(j) }), 4);
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }
}