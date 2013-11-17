import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import org.apache.log4j.Logger;

public class EP
  implements cvW
{
  private static final boolean bKX = false;
  public static final Comparator bKY = new cTF();

  protected static final Logger K = Logger.getLogger(EP.class);

  private static final EP bKZ = new EP();

  public static EP Oe()
  {
    return bKZ;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    dwN localdwN;
    Object localObject6;
    switch (paramcWG.getId())
    {
    case 10018:
      K.info("[PERSONAL_SPACE_UPDATE_MESSAGE] : Mise à jour du sac dimensionnel du propriétaire");

      localObject1 = WakfuClientInstance.awy().awz().bFO();
      localObject2 = ((byz)localObject1).bHa();
      if (localObject2 != null) {
        ((dwN)localObject2).b(((dWC)paramcWG).aNJ());
      }

      return false;
    case 10036:
      localObject1 = (afs)paramcWG;

      localObject2 = WakfuClientInstance.awy().awz().bFO();
      localObject3 = ((byz)localObject2).bGP();
      localObject4 = ((bMD)localObject3).iQ(((afs)localObject1).aqY());

      if (localObject4 != null) {
        localObject5 = ((cRs)localObject4).je(((afs)localObject1).aqY());
        localdwN = ((byz)localObject2).bHb();
        localObject6 = localdwN.a(((afs)localObject1).aqZ(), (gA)localObject5, ((cRs)localObject4).EN(), ((afs)localObject1).ara(), true);
        if (localObject6 != bKk.gLV)
          K.error("DIMENSIONAL_BAG_INVENTORY_TO_ROOM_GEM_EXCHANGE failed!");
        else
          localdwN.fB(((afs)localObject1).aqZ());
      }
      else
      {
        K.error("Gemme introuvable dans l'inventaire du client : " + ((afs)localObject1).aqY());
      }

      return false;
    case 10038:
      localObject1 = (cQC)paramcWG;
      localObject2 = WakfuClientInstance.awy().awz().bFO();
      localObject3 = ((byz)localObject2).bHb();
      localObject4 = ((dwN)localObject3).a(((cQC)localObject1).cHo(), ((cQC)localObject1).cHp(), ((cQC)localObject1).cHq(), ((cQC)localObject1).ara(), true);
      if (localObject4 != bKk.gLV)
        K.error("DIMENSIONAL_BAG_ROOM_TO_INVENTORY_GEM_EXCHANGE failed!");
      else {
        ((dwN)localObject3).fB(((cQC)localObject1).cHo());
      }

      return false;
    case 10040:
      localObject1 = (aCj)paramcWG;
      localObject2 = WakfuClientInstance.awy().awz().bFO();
      localObject3 = ((byz)localObject2).bHb();
      localObject4 = ((dwN)localObject3).b(((aCj)localObject1).aOA(), ((aCj)localObject1).aOy(), ((aCj)localObject1).aOB(), ((aCj)localObject1).aOz(), true);
      if (localObject4 != bKk.gLV) {
        K.error("DIMENSIONAL_BAG_ROOMS_GEMS_EXCHANGE_RESULT failed!");
      } else {
        ((dwN)localObject3).fB(((aCj)localObject1).aOA());
        ((dwN)localObject3).fB(((aCj)localObject1).aOB());
      }

      return false;
    case 10042:
      localObject1 = (bMA)paramcWG;
      localObject2 = ((bMA)localObject1).bTZ();

      a((dnk)localObject2);

      return false;
    case 10044:
      localObject1 = (aco)paramcWG;
      long l = ((aco)localObject1).aoF();
      localObject4 = ((aco)localObject1).aoG();

      localObject5 = byv.bFN().bFO();
      localdwN = ((byz)localObject5).bHa();
      if ((localdwN != null) && (localdwN.sN() == l)) {
        localObject6 = new bIq();
        ((bIq)localObject6).h(ByteBuffer.wrap((byte[])localObject4));
        localdwN.h((bIq)localObject6);
      }

      return false;
    case 10016:
      localObject1 = (cAS)paramcWG;
      if (((cAS)localObject1).adh() == 0);
      return false;
    case 10034:
      localObject1 = (cWs)paramcWG;

      return false;
    case 10058:
      localObject1 = (bIl)paramcWG;

      return false;
    }

    return true;
  }

  private void a(dnk paramdnk) {
    Ej localEj = new Ej(bKY);
    for (int i = 0; i < paramdnk.lmy.size(); i++)
    {
      ayi localayi = (ayi)paramdnk.lmy.get(i);
      long l1 = localayi.dNQ;
      String str = localayi.dNS;
      long l2 = localayi.dNU;
      ArrayList localArrayList = localayi.dNT;

      cYq localcYq = cYq.jq(l1);
      localcYq.cLQ();

      Ll localLl = (Ll)localEj.getLast();
      if ((localLl == null) || (!localLl.VN().equals(localcYq))) {
        localEj.add(localLl = new Ll(localcYq));
      }

      dbA localdbA = new dbA(cYq.jq(l1), str, l2);

      for (int j = 0; j < localArrayList.size(); j++) {
        fP localfP = (fP)localArrayList.get(j);
        localdbA.g(localfP.aDe, localfP.aDf);
      }

      localLl.a(localdbA);
    }

    dMb localdMb = new dMb(localEj);
    cvC.ctw().a(localdMb);
    byv.bFN().a(cvC.ctw());
  }

  private void a(Ej paramEj) {
    int i = 200;
    int j = 10;
    int k = 0;

    dmn localdmn = Hh.QM().yF();

    for (int m = 0; m < 200; m++)
    {
      long l1 = bCO.C(0L, System.currentTimeMillis());
      String str = dlV.cTw().cTF();
      long l2 = bCO.C(0L, 9223372036854775807L);

      cYq localcYq = cYq.jq(l1);
      localcYq.cLQ();

      Ll localLl = (Ll)paramEj.getLast();
      if ((localLl == null) || (!localLl.VN().equals(localcYq))) {
        paramEj.add(localLl = new Ll(localcYq));
      }

      dbA localdbA = new dbA(cYq.jq(l1), str, l2);

      int n = 0; for (int i1 = bCO.sf(10); n < i1; n++)
      {
        if (!localdmn.hasNext()) {
          localdmn = Hh.QM().yF();
        }
        localdmn.fl();

        localdbA.g(localdmn.zY(), (short)bCO.sf(((bVw)localdmn.value()).nR()));
      }

      localLl.a(localdbA);
    }
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      byz localbyz = byv.bFN().bFO();
      if (localbyz != null)
        localbyz.b(null);
    }
  }
}