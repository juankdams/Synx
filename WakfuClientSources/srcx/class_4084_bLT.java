import org.apache.log4j.Logger;

public class bLT extends pM
{
  private static final Logger K = Logger.getLogger(bLT.class);

  private static bLT gPr = new bLT();
  private dRY bag;
  private ccG bah;
  private XQ bIe = null;
  private bnm N;
  private short dhr;

  public static bLT bTA()
  {
    return gPr;
  }

  public void a(XQ paramXQ)
  {
    this.bIe = paramXQ;
  }

  protected void b(gA paramgA, short paramShort) {
    super.b(paramgA, paramShort);

    this.aWp.b(bAp.gpf);
  }

  public boolean a(cWG paramcWG)
  {
    switch (paramcWG.getId())
    {
    case 17300:
    case 17302:
    case 17304:
    case 17307:
    case 17309:
      i(paramcWG);
      return false;
    case 17305:
    case 17308:
      if (this.bIe.ajK()) {
        cKX localcKX = cBQ.cxL().a(bU.fH().getString("market.question.unregister"), Cn.et(0), 2073L, 102, 1);

        localcKX.a(new Xn(this, paramcWG));
      }
      else
      {
        i(paramcWG);
      }
      return false;
    case 17301:
    case 17303:
    case 17306:
    }return true;
  }

  private void aMH() {
    byz localbyz = byv.bFN().bFO();
    bhu localbhu = localbyz.bHb().dcb();

    gA localgA = null;
    int i = 1;

    dag localdag = (dag)localbhu.kK(this.bIe.aiQ());
    if (localdag == null) {
      K.error("Impossible de récupérer l'inventaire marchand uid=" + this.bIe.aiQ());
      return;
    }

    cRs localcRs1 = null;

    if ((this.aWp.nP() == -1) || (this.aWp.nP() == this.aUe.nP()))
    {
      if (this.dhr == -1) {
        if (localdag.ab(this.aUe) != null) {
          localcRs1 = localbyz.bGP().aq(this.aUe);
          this.dhr = localdag.il(this.aUe.oj());
        } else {
          K.error("L'objet n a pas pu etre ajouté dans le sac marchand");
          i = 0;
        }

      }
      else if (localdag.a(this.aUe, this.dhr, this.aWp.Hy().goO, this.aWp.Hv()) != null) {
        localcRs1 = localbyz.bGP().aq(this.aUe);
      } else {
        K.error("L'objet n a pas pu etre inseré dans le sac marchand");
        i = 0;
      }

      if ((localcRs1 == null) && (i != 0)) {
        localdag.cg(this.aUe.oj());
        i = 0;
      }
    }
    else {
      localgA = this.aUe.q(false);
      cRs localcRs2 = localbyz.bGP().iQ(this.aUe.oj());
      if (localcRs2 != null) {
        localgA.l(this.aWp.nP());

        if (this.dhr == -1) {
          if (localdag.ab(localgA) != null) {
            localcRs2.c(this.aUe.oj(), (short)-this.aWp.nP());
            this.dhr = localdag.il(localgA.oj());
          } else {
            K.error("L'objet n a pas pu etre ajouté dans le sac marchand");
            i = 0;
          }

        }
        else if (localdag.a(localgA, this.dhr, this.aWp.Hy().goO, this.aWp.Hv()) != null) {
          localcRs2.c(this.aUe.oj(), (short)-this.aWp.nP());
        } else {
          K.error("L'objet n a pas pu etre inseré dans le sac marchand");
          i = 0;
        }
      }
      else {
        K.error("L'objet ne se trouve dans aucun des inventaires : id : " + this.aUe.oj());
        i = 0;
      }
    }

    if (i != 0) {
      long l = localgA != null ? localgA.oj() : this.aUe.oj();
      aOm localaOm = (aOm)localdag.ci(l);
      if (localaOm != null) {
        localdag.a(localaOm, this.aWp.Hv());
        localdag.a(localaOm, this.aWp.Hy());

        aZe localaZe = new aZe();
        localaZe.eW(this.aUe.oj());
        localaZe.aH((byte)this.dhr);
        if (localgA != null) {
          localaZe.eX(localgA.oj());
        }
        localaZe.l(this.aWp.nP());
        localaZe.eY(localdag.EN());
        localaZe.bB(this.aWp.Hy().goO);
        localaZe.ed(this.aWp.Hv());
        byv.bFN().aJK().d(localaZe);
        bhD.btQ().d(new clu(bNY.gTa, this.aUe.ok(), this.aWp.nP(), 0));
      }
    }
    else {
      cBQ.cxL().mW("splitStackDialog");
    }
  }

  private void i(cWG paramcWG) {
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      K.error("Pas de local player");
      return;
    }
    bhu localbhu = localbyz.bHb().dcb();
    cHE localcHE;
    dag localdag;
    Object localObject1;
    Object localObject3;
    switch (paramcWG.getId())
    {
    case 17308:
      dKd.dji().dch().iV(false);

      if (wZ()) {
        aMH();
      }

      cBQ.cxL().mW("merchantTaxDialog");

      return;
    case 17309:
      cBQ.cxL().mW("merchantTaxDialog");

      return;
    case 17304:
      localcHE = (cHE)paramcWG;

      localdag = (dag)localbhu.kK(this.bIe.aiQ());
      if (localdag == null) {
        K.error("Impossible de récupérer l'inventaire marchand uid=" + this.bIe.aiQ());
        return;
      }

      if (localdag.isFull()) {
        cBQ.cxL().a(bU.fH().getString("error.flea.full"), Cn.et(1), 1027L, 102, 1);

        return;
      }

      localObject1 = localcHE.getItem();
      if ((((gA)localObject1).or()) || ((((gA)localObject1).oi().a(Aq.bvS) != null) && (!((gA)localObject1).oi().a(Aq.bvS).i(byv.bFN().bFO(), byv.bFN().bFO().ML(), localObject1, byv.bFN().bFO().bEY()))))
      {
        K.warn("L'objet " + ((gA)localObject1).ok() + " n'a pas le droit d'être mis en vente");
        String str = bU.fH().getString("flea.addItem.unauthorized");
        localObject3 = new aEe(str);
        ((aEe)localObject3).mm(3);
        CM.LV().ez(3).a((aEe)localObject3);
        return;
      }

      this.aUe = ((gA)localObject1);
      b(((gA)localObject1).q(false), localcHE.nP() == -1 ? ((gA)localObject1).nP() : localcHE.nP());
      cBQ.cxL().a("merchantTaxDialog", VV.dJ("merchantTaxDialog"), 33025L, (short)30000);

      this.dhr = localcHE.cdB();

      return;
    case 17307:
      localcHE = (cHE)paramcWG;
      localdag = (dag)localbhu.kK(this.bIe.aiQ());
      if (localdag == null) {
        K.error("Impossible de récupérer l'inventaire marchand uid=" + this.bIe.aiQ());
        return;
      }

      localObject1 = localcHE.getMerchantItem();
      try {
        localdag.cg(((BG)localObject1).oj());
        if (!localdag.e((dsj)localObject1, localcHE.cdB())) {
          localdag.cg(((BG)localObject1).oj());
          K.error("L'objet n a pas pu etre inseré dans le sac marchand");
        }
      } catch (dI localdI) {
        K.error("Exception", localdI);
      } catch (dcF localdcF) {
        K.error("Exception", localdcF);
      } catch (cn localcn) {
        K.error("Exception", localcn);
      } catch (bQT localbQT) {
        K.error("Exception", localbQT);
      }

      return;
    case 17305:
      localcHE = (cHE)paramcWG;

      localdag = (dag)localbhu.kK(this.bIe.aiQ());
      if (localdag == null) {
        K.error("Impossible de récupérer l'inventaire marchand uid=" + this.bIe.aiQ());
        return;
      }

      dKd.dji().dch().iV(false);

      int i = 0;
      Object localObject2 = null;
      localObject3 = null;

      BG localBG = localcHE.getMerchantItem();
      Object localObject4;
      if ((localcHE.nP() == -1) || (localcHE.nP() == localBG.nP()))
      {
        if (localcHE.cBT() != -1L) {
          localObject4 = localbyz.bGP().iO(localcHE.cBT());
          if (localObject4 != null)
            try
            {
              if (((cRs)localObject4).h(localBG.getItem(), localcHE.cdB()))
                if (((cRs)localObject4).i(localBG.getItem(), localcHE.cdB())) {
                  if (!((cRs)localObject4).j(localBG.getItem())) {
                    localBG.getItem().release();
                  }
                  localObject2 = localObject4;
                } else {
                  i = 1;
                }
            }
            catch (Exception localException1) {
              K.error("Impossible d'ajouter l'item a la position : position : " + localcHE.cdB(), localException1);
              i = 1;
            }
        }
        else
        {
          localObject2 = localbyz.bGP().ap(localBG.getItem());
        }
        if ((localObject2 != null) && 
          (!localdag.d(localBG))) {
          if (localbyz.bGP().aq(localBG.getItem()) == null) {
            K.error("On vient d'ajouter un item aux inventaire, mais une erreur et survenu lors de la transaction et on arrive pas a le retirer");
          }
          i = 1;
        }
      }
      else
      {
        localObject3 = localBG.getItem().q(false);
        ((gA)localObject3).l(localcHE.nP());
        if (localcHE.cBT() != -1L) {
          localObject4 = localbyz.bGP().iO(localcHE.cBT());
          if (localObject4 != null)
            try {
              if (((cRs)localObject4).h((gA)localObject3, localcHE.cdB()))
                if (((cRs)localObject4).i((gA)localObject3, localcHE.cdB())) {
                  if (!((cRs)localObject4).j((gA)localObject3)) {
                    ((gA)localObject3).release();
                  }
                  localObject2 = localObject4;
                } else {
                  i = 1;
                }
            }
            catch (Exception localException2) {
              K.error("Impossible d'ajouter l'item a la position : position : " + localcHE.cdB(), localException2);
              i = 1;
            }
        }
        else
        {
          localObject2 = localbyz.bGP().ap((gA)localObject3);
        }
        if (localObject2 != null) {
          localdag.c(localBG.oj(), (short)-localcHE.nP());
        }

      }

      if ((i == 0) && (localObject2 != null)) {
        localObject4 = new aiS();
        ((aiS)localObject4).cR(localdag.EN());
        ((aiS)localObject4).aW(localBG.getItem().oj());
        ((aiS)localObject4).cP(((cRs)localObject2).EN());
        if (localObject3 != null) {
          ((aiS)localObject4).l(localcHE.nP());
          ((aiS)localObject4).cQ(((gA)localObject3).oj());
          ((aiS)localObject4).aC(((cRs)localObject2).il(((gA)localObject3).oj()));
        } else {
          ((aiS)localObject4).aC(localcHE.cdB());
        }
        byv.bFN().aJK().d((cWG)localObject4);
        bhD.btQ().d(new clu(bNY.gTb, localBG.getItem().ok(), localcHE.nP(), 0));
      }

      return;
    case 17306:
    }super.a(paramcWG);
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      bIE.bPR();

      this.aWs = cVE.kHZ;

      dwN localdwN = dKd.dji();
      localdwN.dcb().clear();

      dLE.doY().t("fleaDimensionalBag", localdwN);

      this.N = new Xr(this);

      cBQ.cxL().a(this.N);

      dGW.dhM().dhN();

      bpn localbpn1 = (bpn)cBQ.cxL().a("fleaDialog", VV.dJ("fleaDialog"), 32769L, (short)10000);

      this.bah = ((ccG)localbpn1.getElementMap().fi("fleaList"));
      bpn localbpn2 = (bpn)localbpn1.getElementMap().fi("dimensionalBagWindow");
      this.bag = new Xq(this, localbpn2);

      this.bah.a(this.bag);

      dGW.dhM().j(localbpn1);

      dLE.doY().t("editableDimensionalBag", localdwN);

      byv.bFN().b(Rl.acN());
      byv.bFN().aJK().a(cBM.cxH());

      cBQ.cxL().j("wakfu.dimensionalBagFlea", dfS.class);

      super.a(paramaqv, paramBoolean);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      byv.bFN().bFO().q(false, true);

      this.bah.b(this.bag);
      this.bah = null;
      this.bag = null;

      if (byv.bFN().c(dGW.dhM())) {
        dGW.dhM().dhP();
      }

      dLE.doY().removeProperty("fleaDimensionalBag");

      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("fleaDialog");
      cBQ.cxL().mW("setPriceDialog");
      cBQ.cxL().mW("splitStackDialog");

      cBQ.cxL().mN("wakfu.dimensionalBagFlea");

      byv.bFN().a(Rl.acN());
      byv.bFN().aJK().b(cBM.cxH());

      this.bIe = null;

      super.b(paramaqv, paramBoolean);
    }
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }
}