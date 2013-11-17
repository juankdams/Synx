import org.apache.log4j.Logger;

public class cBM
  implements cvW
{
  protected static final Logger K = Logger.getLogger(cBM.class);

  private static cBM isL = new cBM();

  public static cBM cxH()
  {
    return isL;
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
  }

  public boolean a(cWG paramcWG)
  {
    dwN localdwN = dKd.dji();
    Object localObject1;
    Object localObject2;
    Object localObject3;
    switch (paramcWG.getId())
    {
    case 10106:
      localObject1 = (aIC)paramcWG;
      K.info("[DIMENSIONAL_BAG_FLEA_CONTENT_MESSAGE] ownerId=" + ((aIC)localObject1).aoF());
      localdwN.dcb().bf(((aIC)localObject1).aUw());
      localdwN.dcb().be(((aIC)localObject1).aUx());
      localdwN.c(localdwN.dcb().a(((aIC)localObject1).aUv()));

      return false;
    case 5234:
      localObject1 = (bRp)paramcWG;

      switch (((bRp)localObject1).bYF()) {
      case 0:
        localObject2 = new gA();
        if (!((gA)localObject2).b(((bRp)localObject1).bYH())) {
          K.error("On essaie d'acheter un item qui n'existe pas ?");
        }
        K.info("[FLEA_BUY_RESULT_MESSAGE] : container=" + ((bRp)localObject1).bYG() + ", item=" + ((gA)localObject2).getName());
        localObject3 = byv.bFN().bFO().bGP();
        try {
          ((bMD)localObject3).iO(((bRp)localObject1).bYG()).av((gA)localObject2);
        } catch (dI localdI) {
          K.error("Exception levée lors de l'ajout d'un item(" + ((gA)localObject2).getName() + ") dans un container(" + ((bRp)localObject1).bYG() + ") : ", localdI);
        }
        catch (dcF localdcF) {
          K.error("Exception levée lors de l'ajout d'un item(" + ((gA)localObject2).getName() + ") dans un container(" + ((bRp)localObject1).bYG() + ") : ", localdcF);
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

      localdwN.dch().cMG();

      return false;
    case 10108:
      localObject1 = (VT)paramcWG;
      K.info("[FLEA_LOCK_MESSAGE] merchantInventory=" + ((VT)localObject1).aiQ() + ", lock=" + ((VT)localObject1).isLocked());
      localdwN.s(((VT)localObject1).aiQ(), ((VT)localObject1).isLocked());

      return false;
    case 5236:
      localObject1 = (and)paramcWG;
      K.info("[MERCHANT_ITEM_REMOVE_MESSAGE] itemUid=" + ((and)localObject1).azO());
      localObject2 = localdwN.dcb().kM(((and)localObject1).azO());
      if (localObject2 == null) {
        K.error("Remove failed...");
      }
      localdwN.dch().cMG();

      return false;
    case 5232:
      localObject1 = (aBS)paramcWG;
      K.info("[MERCHANT_ITEM_ADD_MESSAGE] itemUid=" + ((aBS)localObject1).aOa().cpq.bPv);
      localObject2 = (dag)localdwN.dcb().kK(((aBS)localObject1).aiQ());
      if (localObject2 != null) {
        localObject3 = BG.KH();
        ((BG)localObject3).b(((aBS)localObject1).aOa());
        try {
          ((dag)localObject2).e((dsj)localObject3, ((aBS)localObject1).aks());
        } catch (Exception localException) {
          K.error("Exception levée lors de l'ajout de l'item marchand", localException);
        }
        ((dag)localObject2).cMG();
      } else {
        K.error("L'inventaire marchand uid=" + ((aBS)localObject1).aiQ() + " est introuvable");
      }

      return false;
    case 5238:
      localObject1 = (cIC)paramcWG;

      K.info("[MERCHANT_ITEM_UPDATE_MESSAGE] itemUid=" + ((cIC)localObject1).oj());
      localObject2 = localdwN.dcb().kL(((cIC)localObject1).oj());
      if (localObject2 != null) {
        localObject3 = (dag)((Cs)localObject2).getFirst();
        BG localBG = (BG)((Cs)localObject2).Lp();
        bCe localbCe = ((cIC)localObject1).Hy();
        int i = ((cIC)localObject1).Hv();
        int j = ((cIC)localObject1).nP();
        if (localBG.nP() != j) {
          ((dag)localObject3).c(localBG.oj(), (short)(j - localBG.nP()));
        }
        if (localBG.Hv() != i) {
          ((dag)localObject3).a(localBG, i);
        }
        if (localBG.Hy() != localbCe) {
          ((dag)localObject3).a(localBG, localbCe);
        }
        ((dag)localObject3).cMG();
      } else {
        K.error("L'item (ID=" + ((cIC)localObject1).oj() + ") n'existe pas/plus dans la brocante browsée.");
      }

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