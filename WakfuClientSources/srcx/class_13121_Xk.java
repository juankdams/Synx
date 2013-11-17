import java.util.List;
import org.apache.log4j.Logger;

public class Xk
  implements cvW
{
  protected static final Logger K = Logger.getLogger(Xk.class);

  private static Xk cHt = new Xk();

  public static Xk ajn()
  {
    return cHt;
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
    Object localObject3;
    Object localObject4;
    Object localObject7;
    byte b2;
    Object localObject5;
    Object localObject6;
    switch (paramcWG.getId()) {
    case 10114:
      localObject1 = (auS)paramcWG;
      localObject2 = ((auS)localObject1).aGU();
      localObject3 = ((auS)localObject1).aGV();
      localObject4 = ((auS)localObject1).aGW();

      bhu localbhu = dKd.dji().dcb();
      localbhu.clear();
      for (int j = 0; j < ((List)localObject2).size(); j++) {
        localObject7 = localbhu.a((asj)((List)localObject2).get(j));
        byte b3 = ((bvv)localObject3).get(j);
        ((dag)localObject7).setSize(b3);
        int n = ((cSi)localObject4).get(j);
        bBn localbBn2 = Hh.QM().dh(n);
        ((dag)localObject7).oG(localbBn2 != null ? localbBn2.getName() : "<UNKNOWN>");
        ((dag)localObject7).iT(localbBn2.oc());
        dtN.cZR().a(((dag)localObject7).EN(), new Cs(Byte.valueOf(b3), localbBn2));
      }

      return false;
    case 10116:
      localObject1 = (aML)paramcWG;
      localObject2 = ((aML)localObject1).aUv();
      localObject3 = dKd.dji().dcb();
      dKd.dji().c(((bhu)localObject3).a((asj)localObject2));

      return false;
    case 5234:
      localObject1 = dKd.dji();

      localObject2 = (bRp)paramcWG;

      switch (((bRp)localObject2).bYF()) {
      case 0:
        localObject3 = new gA();
        if (!((gA)localObject3).b(((bRp)localObject2).bYH())) {
          K.error("On essaie d'acheter un item qui n'existe pas ?");
        }
        K.info("[FLEA_BUY_RESULT_MESSAGE] : container=" + ((bRp)localObject2).bYG() + ", item=" + ((gA)localObject3).getName());
        localObject4 = byv.bFN().bFO().bGP();
        try {
          ((bMD)localObject4).iO(((bRp)localObject2).bYG()).av((gA)localObject3);
        } catch (dI localdI) {
          K.error("Exception levée lors de l'ajout d'un item(" + ((gA)localObject3).getName() + ") dans un container(" + ((bRp)localObject2).bYG() + ") : ", localdI);
        }
        catch (dcF localdcF) {
          K.error("Exception levée lors de l'ajout d'un item(" + ((gA)localObject3).getName() + ") dans un container(" + ((bRp)localObject2).bYG() + ") : ", localdcF);
        }

      case 2:
        CM.LV().f(bU.fH().getString("error.flea.buy.inventoryfull"), 3);
        break;
      case 3:
        CM.LV().f(bU.fH().getString("error.flea.buy.inventoryLocked"), 3);
        break;
      case 1:
        CM.LV().f(bU.fH().getString("error.flea.buy"), 3);
      }

      localObject3 = ((dwN)localObject1).dch();
      if (localObject3 == null) {
        dtN.cZR().cZS();
        return false;
      }
      ((dag)localObject3).cMG();

      return false;
    case 10108:
      localObject1 = dKd.dji();

      localObject2 = (VT)paramcWG;
      K.info("[FLEA_LOCK_MESSAGE] merchantInventory=" + ((VT)localObject2).aiQ() + ", lock=" + ((VT)localObject2).isLocked());
      ((dwN)localObject1).s(((VT)localObject2).aiQ(), ((VT)localObject2).isLocked());

      return false;
    case 5236:
      localObject1 = dKd.dji();

      localObject2 = (and)paramcWG;

      localObject3 = (dag)((dwN)localObject1).dcb().kK(((and)localObject2).aiQ());
      b2 = (byte)(((dag)localObject3).getSize() - 1);
      ((dag)localObject3).setSize(b2);
      dLE.doY().a((dBv)localObject1, new String[] { "fleaList" });
      dag localdag2 = ((dwN)localObject1).dch();
      if (localdag2 != null) {
        long l3 = ((and)localObject2).azO();
        K.info("[MERCHANT_ITEM_REMOVE_MESSAGE] itemUid=" + l3);
        Cs localCs1 = ((dwN)localObject1).dcb().kM(l3);
        if (localCs1 == null) {
          K.error("Remove failed...");
          return false;
        }
        if (byv.bFN().c(dtN.cZR())) {
          dwN localdwN2 = dtN.dji();
          if ((localdag2.isEmpty()) && (localdag2.equals(localdwN2.dch()))) {
            localdwN2.dbT();
          }
          long l4 = ((dag)localObject3).EN();
          Cs localCs2 = dtN.cZR().kk(l4);
          localCs2 = new Cs(Byte.valueOf(b2), localCs2.Lp());
          dtN.cZR().a(l4, localCs2);
        }
        localdag2.cMG();
      }

      return false;
    case 5232:
      localObject1 = dKd.dji();

      localObject2 = (aBS)paramcWG;

      localObject3 = (dag)((dwN)localObject1).dcb().kK(((aBS)localObject2).aiQ());
      b2 = (byte)(((dag)localObject3).getSize() + 1);
      ((dag)localObject3).setSize(b2);
      if (byv.bFN().c(dtN.cZR())) {
        long l2 = ((dag)localObject3).EN();
        localObject7 = dtN.cZR().kk(l2);
        localObject7 = new Cs(Byte.valueOf(b2), ((Cs)localObject7).Lp());
        dtN.cZR().a(l2, (Cs)localObject7);
      }
      dLE.doY().a((dBv)localObject1, new String[] { "fleaList" });

      if (((dwN)localObject1).dch() == null) {
        return false;
      }

      localObject5 = (dag)((dwN)localObject1).dcb().kK(((aBS)localObject2).aiQ());
      if (localObject5 != null) {
        K.info("[MERCHANT_ITEM_ADD_MESSAGE] itemUid=" + ((aBS)localObject2).aOa().cpq.bPv);
        localObject6 = BG.KH();
        ((BG)localObject6).b(((aBS)localObject2).aOa());
        try {
          ((dag)localObject5).e((dsj)localObject6, ((aBS)localObject2).aks());
        } catch (Exception localException) {
          K.error("Exception levée lors de l'ajout de l'item marchand", localException);
        }
        ((dag)localObject5).cMG();
      } else {
        K.error("L'inventaire marchand uid=" + ((aBS)localObject2).aiQ() + " est introuvable");
      }

      return false;
    case 5238:
      localObject1 = dKd.dji();

      localObject2 = (cIC)paramcWG;

      K.info("[MERCHANT_ITEM_UPDATE_MESSAGE] itemUid=" + ((cIC)localObject2).oj());
      localObject3 = ((dwN)localObject1).dcb().kL(((cIC)localObject2).oj());
      if (localObject3 != null) {
        dag localdag1 = (dag)((Cs)localObject3).getFirst();
        localObject5 = (BG)((Cs)localObject3).Lp();
        localObject6 = ((cIC)localObject2).Hy();
        int k = ((cIC)localObject2).Hv();
        int m = ((cIC)localObject2).nP();
        if (((BG)localObject5).nP() != m) {
          localdag1.c(((BG)localObject5).oj(), (short)(m - ((BG)localObject5).nP()));
        }
        if (((BG)localObject5).Hv() != k) {
          localdag1.a((aOm)localObject5, k);
        }
        if (((BG)localObject5).Hy() != localObject6) {
          localdag1.a((aOm)localObject5, (bCe)localObject6);
        }
        localdag1.cMG();
      } else {
        K.error("L'item (ID=" + ((cIC)localObject2).oj() + ") n'existe pas/plus dans la brocante browsée.");
      }

      return false;
    case 10118:
      localObject1 = (dUu)paramcWG;
      localObject2 = ((dUu)localObject1).aUv();
      byte b1 = ((dUu)localObject1).duv();
      int i = ((dUu)localObject1).duw();
      localObject5 = dKd.dji();
      localObject6 = ((dwN)localObject5).dcb().a((asj)localObject2);
      ((dag)localObject6).setSize(b1);
      bBn localbBn1 = Hh.QM().dh(i);
      ((dag)localObject6).oG(localbBn1 != null ? localbBn1.getName() : "<UNKNOWN>");
      ((dag)localObject6).iT(localbBn1.oc());
      dtN.cZR().a(((dag)localObject6).EN(), new Cs(Byte.valueOf(b1), localbBn1));

      return false;
    case 10120:
      localObject1 = (anb)paramcWG;
      long l1 = ((anb)localObject1).aiQ();
      dwN localdwN1 = dKd.dji();
      localdwN1.dcb().kJ(l1);
      dtN.cZR().kj(l1);

      return false;
    }

    return true;
  }

  public long getId()
  {
    return 1L;
  }

  public void a(long paramLong)
  {
  }
}