import java.util.Iterator;
import java.util.LinkedList;
import org.apache.log4j.Logger;

public class cLQ
  implements cvW
{
  private static final boolean aRN = false;
  private static final Logger K = Logger.getLogger(cLQ.class);

  private static final cLQ iLs = new cLQ();

  public static cLQ cEP()
  {
    return iLs;
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
    byz localbyz;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    Object localObject7;
    Object localObject2;
    switch (paramcWG.getId())
    {
    case 500:
      localObject1 = (deb)paramcWG;

      localbyz = byv.bFN().bFO();
      localObject3 = localbyz.bHj();

      localObject4 = go.E(((deb)localObject1).hf());
      switch (Wp.cGn[localObject4.ordinal()])
      {
      case 1:
        boolean bool = ((Jl)localObject3).Td();
        localObject5 = null;
        if (bool) {
          localObject5 = new cbQ(((Jl)localObject3).Ta().dbD());
          cHu localcHu = ((Jl)localObject3).Ta().dbH().aBa();
          while (localcHu.hasNext()) {
            localcHu.fl();
            ((cbQ)localObject5).add(((aay)localcHu.value()).eq());
          }
        }

        int i = 0;
        if ((!bool) || (((Jl)localObject3).Tb() != ((deb)localObject1).hf()))
        {
          localObject6 = new Fs(((deb)localObject1).hf());
          ((Jl)localObject3).a((Fs)localObject6);
          i = 1;
          bOU.gUc.b(new bTO());
        }

        Object localObject6 = ((deb)localObject1).cOT();
        if (localObject6 != null) {
          ((Jl)localObject3).Ta().aH((byte[])localObject6);
          i = 1;
        }

        for (localObject7 = ((deb)localObject1).abX().iterator(); ((Iterator)localObject7).hasNext(); ) { localCs = (Cs)((Iterator)localObject7).next();
          l3 = ((Long)localCs.getFirst()).longValue();
          arrayOfByte = (byte[])localCs.Lp();

          localaay = (aay)((Jl)localObject3).Ta().kp(l3);

          if (localaay == null)
          {
            bgo localbgo = new bgo();
            aeE localaeE = new aeE();
            localaay = new aay(localbgo, localaeE);
            localbgo.a(localaay);
            localaay.aM(arrayOfByte);
            ((Jl)localObject3).Ta().a(localaay);
            String str = bU.fH().getString("group.party.invitationAccepted", new Object[] { localaay.getName() });
            CM.LV().f(str, 4);
          } else {
            localaay.aM(arrayOfByte);
          }

          i = 1;
        }
        Cs localCs;
        long l3;
        byte[] arrayOfByte;
        aay localaay;
        for (localObject7 = ((deb)localObject1).abY().iterator(); ((Iterator)localObject7).hasNext(); ) { localCs = (Cs)((Iterator)localObject7).next();
          l3 = ((Long)localCs.getFirst()).longValue();
          arrayOfByte = (byte[])localCs.Lp();

          localaay = (aay)((Jl)localObject3).Ta().kp(l3);

          if (localaay != null)
          {
            localaay.aN(arrayOfByte);
            i = 1;
          }
          else {
            K.error("On a reçu des données de membres pour le groupe avant de recevoir les données du character.");
          }
        }
        if ((!bool) && (((Jl)localObject3).Td()) && (!byv.bFN().c(bED.bMP())))
          byv.bFN().a(bED.bMP());
        else if ((byv.bFN().c(bED.bMP())) && (i != 0)) {
          bED.bMP().mY();
        }

        ((Jl)localObject3).Ta().Pi();

        if (i != 0)
          ((Jl)localObject3).Ta().d((cbQ)localObject5); break;
      }

      return false;
    case 514:
      localObject1 = (Qf)paramcWG;

      localbyz = byv.bFN().bFO();

      return false;
    case 502:
      localObject1 = (cwF)paramcWG;
      localbyz = byv.bFN().bFO();

      localObject3 = new dk();
      localObject4 = ((cwF)localObject1).he();

      if ((localbyz.c(dKm.lXB)) || (dmY.cUs().cUv().ky(((cwF)localObject1).bBa()) != null))
      {
        dgw localdgw = new dgw();
        localdgw.jc(false);
        localdgw.E(((cwF)localObject1).he());
        localdgw.cF(((cwF)localObject1).aHs());
        byv.bFN().aJK().d(localdgw);
        return false;
      }

      ((dk)localObject3).a(go.g(((cwF)localObject1).aHs()));
      ((dk)localObject3).E((String)localObject4);
      cjO.clE().j((cWG)localObject3);

      return false;
    case 504:
      localObject1 = (avn)paramcWG;
      avW.aIb().a(((avn)localObject1).getResult(), 3, new Object[0]);

      return false;
    case 506:
      localObject1 = (bTa)paramcWG;

      localbyz = byv.bFN().bFO();
      localObject3 = localbyz.bHj();

      long l2 = ((bTa)localObject1).hf();
      localObject5 = go.E(l2);
      cbQ localcbQ = ((bTa)localObject1).bZH();

      switch (Wp.cGn[localObject5.ordinal()]) {
      case 1:
        for (int j = 0; j < localcbQ.size(); j++)
        {
          if (((Jl)localObject3).Td())
            ((Jl)localObject3).Ta().bx(localcbQ.get(j));
          else {
            K.error("Message de retrait d'un character du groupe reçu alors qu'on ne fait partie d'aucun groupe");
          }

          if (localbyz.getId() == localcbQ.uD(j)) {
            if (byv.bFN().c(bED.bMP())) {
              byv.bFN().b(bED.bMP());
            }
            localbyz.bHj().Ta().Pl();
            localbyz.bHj().a(null);

            localObject7 = bU.fH().getString("group.party.leave");
            CM.LV().f((String)localObject7, 4);
          }
          else if (byv.bFN().c(bED.bMP())) {
            bED.bMP().mY();
          }
        }

      }

      return false;
    case 516:
      localObject1 = (bqz)paramcWG;

      long l1 = ((bqz)localObject1).hf();
      go localgo = go.E(l1);

      return false;
    case 508:
      localObject1 = (dm)paramcWG;

      localObject2 = new aEe(((dm)localObject1).hg(), ((dm)localObject1).hh(), ((dm)localObject1).getMessage());
      ((aEe)localObject2).mm(5);
      aYD.g((aEe)localObject2);
      CM.LV().a((aEe)localObject2);

      return false;
    case 528:
      localObject1 = (cMp)paramcWG;
      localObject2 = ((cMp)localObject1).hg();

      if (dmY.cUs().cUv().ky(((cMp)localObject1).hh()) != null) {
        return false;
      }

      localObject3 = new aEe((String)localObject2, ((cMp)localObject1).hh(), ((cMp)localObject1).getMessage());
      ((aEe)localObject3).mm(6);
      aYD.g((aEe)localObject3);
      CM.LV().a((aEe)localObject3);

      return false;
    case 20054:
      localObject1 = (aVh)paramcWG;
      if (((aVh)localObject1).getErrorCode() == 0) {
        if (byv.bFN().c(dKb.djg())) {
          byv.bFN().b(dKb.djg());
        }
        return false;
      }
      cBQ.cxL().a(avW.aIb().a(((aVh)localObject1).getErrorCode(), new Object[0]), Cn.et(1), 2L, 102, 3);

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