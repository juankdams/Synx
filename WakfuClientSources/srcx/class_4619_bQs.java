import org.apache.log4j.Logger;

public class bQs
  implements cvW
{
  private static bQs gYy = new bQs();

  private static Logger K = Logger.getLogger(bQs.class);
  private bnm N;
  private boolean gYz;

  public static bQs bXv()
  {
    return gYy;
  }

  public boolean a(cWG paramcWG)
  {
    if ((paramcWG instanceof dKQ)) {
      dLE.doY().t("exchange.valid", Boolean.valueOf(true));
      cAo.cxf().b(this);
      return false;
    }
    Object localObject1;
    Object localObject2;
    Object localObject3;
    switch (paramcWG.getId())
    {
    case 16807:
      localObject1 = (QH)paramcWG;

      localObject2 = new bLE();
      ((bLE)localObject2).setExchangeId(((QH)localObject1).acp());

      byv.bFN().aJK().d((cWG)localObject2);

      dLE.doY().a(byv.bFN().bFO(), new String[] { "states" });

      return false;
    case 16810:
      if ((dLE.doY().getProperty("exchange.sourceBag") == null) || (dLE.doY().getProperty("exchange.sourcePosition") == null))
      {
        K.error("Impossible d'ajouter l'objet : le bag / position de la source n'ont pas été spécifiés");
        return false;
      }

      if (cBQ.cxL().mZ("splitStackDialog")) {
        cBQ.cxL().mW("splitStackDialog");
      }
      if (cBQ.cxL().mZ("splitExchangeAmountOfCashDialog")) {
        cBQ.cxL().mW("splitExchangeAmountOfCashDialog");
      }

      localObject1 = (bVD)paramcWG;
      localObject2 = ((bVD)localObject1).getItem();
      if (!ad((gA)localObject2)) {
        localObject3 = bU.fH().getString("exchange.itemUnexchangeable");
        aEe localaEe = new aEe((String)localObject3);
        localaEe.mm(3);
        CM.LV().ez(3).a(localaEe);
        return false;
      }

      localObject3 = new brl();
      ((brl)localObject3).setExchangeId(((bVD)localObject1).acp());
      ((brl)localObject3).bP(((gA)localObject2).oj());
      ((brl)localObject3).bU((short)((bVD)localObject1).ayO());
      byv.bFN().aJK().d((cWG)localObject3);

      bXw();

      return false;
    case 16811:
      if (cBQ.cxL().mZ("splitStackDialog")) {
        cBQ.cxL().mW("splitStackDialog");
      }
      if (cBQ.cxL().mZ("splitExchangeAmountOfCashDialog")) {
        cBQ.cxL().mW("splitExchangeAmountOfCashDialog");
      }

      localObject1 = (bVD)paramcWG;

      localObject2 = new bOV();
      ((bOV)localObject2).setExchangeId(((bVD)localObject1).acp());
      ((bOV)localObject2).bP(((bVD)localObject1).getItem().oj());
      ((bOV)localObject2).bU((short)((bVD)localObject1).ayO());
      byv.bFN().aJK().d((cWG)localObject2);
      bXw();
      return false;
    case 16823:
      localObject1 = (bfC)paramcWG;

      localObject2 = byv.bFN().bFO();
      localObject3 = aYP.feK.bnR();
      int i = ((bfC)localObject1).bsK();
      int j = ((cPO)((aqa)localObject3).gI(((byz)localObject2).getId())).cHk();
      if (j == i) {
        return false;
      }
      int k = ((byz)localObject2).JE() + j;
      if (k < i) {
        i = k;
      }

      cGh localcGh = new cGh();
      localcGh.xJ(i);
      localcGh.setExchangeId(((bfC)localObject1).acp());
      byv.bFN().aJK().d(localcGh);
      bXw();
      return false;
    case 16812:
      bzu localbzu = (bzu)paramcWG;
      long l = localbzu.ah();

      localObject3 = new aLc();
      ((aLc)localObject3).setExchangeId(l);
      byv.bFN().aJK().d((cWG)localObject3);
      return false;
    }

    return true;
  }

  public boolean ad(gA paramgA)
  {
    return (!paramgA.or()) && ((paramgA.oi().a(Aq.bvS) == null) || (paramgA.oi().a(Aq.bvS).i(byv.bFN().bFO(), byv.bFN().bFO().ML(), paramgA, byv.bFN().bFO().bEY())));
  }

  public void bXw()
  {
    if (!byv.bFN().c(this)) {
      return;
    }
    dLE.doY().t("exchange.valid", Boolean.valueOf(false));

    cAo.cxf().b(this);
    cAo.cxf().a(this, 5000L, 0);
  }

  public long getId() {
    return 1L;
  }

  public void a(long paramLong) {
  }

  private void bXx() {
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      K.error("on tente d'annuler l'échange mais le joueur n'existe déjà plus");
      return;
    }
    aqa localaqa = aYP.feK.bnR();

    if (localaqa != null)
    {
      aLc localaLc = new aLc();
      localaLc.setExchangeId(localaqa.getId());
      byv.bFN().aJK().d(localaLc);
    }
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      dLE.doY().t("exchange.valid", Boolean.valueOf(true));

      this.N = new aa(this);

      cBQ.cxL().a(this.N);

      bpn localbpn = (bpn)cBQ.cxL().a("exchangeDialog", VV.dJ("exchangeDialog"), 32785L, (short)10000);

      if (localbpn == null)
        K.error("Impossible de récupérer la fenêtre d'échange !!! loaded=" + cBQ.cxL().mZ("exchangeDialog"));
      else {
        dGW.dhM().j(localbpn);
      }

      if (!cBQ.cxL().mZ("equipmentDialog")) {
        dGW.dhM().dhN();
        this.gYz = true;
      }

      byv.bFN().b(Rl.acN());

      byv.bFN().b(duO.dax());

      cqu.cpE().alK();

      cBQ.cxL().j("wakfu.exchange", aSj.class);

      aqa localaqa = aYP.feK.bnR();

      bzu localbzu = new bzu();
      localbzu.d(19065);
      localbzu.a(localaqa.aCl().getName());
      cjO.clE().j(localbzu);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      drC.cYq();

      if (cBQ.cxL().mZ("splitStackDialog")) {
        cBQ.cxL().mW("splitStackDialog");
      }

      cAo.cxf().b(this);

      cBQ.cxL().mW("exchangeDialog");
      if (this.gYz) {
        dGW.dhM().dhP();
      }
      this.gYz = false;

      cBQ.cxL().mN("wakfu.exchange");

      if (byv.bFN().bFO() == null) {
        return;
      }

      byv.bFN().a(Rl.acN());
    }
  }
}