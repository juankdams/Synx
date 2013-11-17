import org.apache.log4j.Logger;

public class cPO extends cQo
{
  private static final Logger K = Logger.getLogger(cPO.class);
  private final bKm gRm;
  private cqH kyY;
  private aek kyZ;

  public cPO(bKm parambKm)
  {
    this.gRm = parambKm;
  }

  public bKm bUC() {
    return this.gRm;
  }

  public boolean aeI() {
    return this.gRm.aeI();
  }

  public long getId() {
    return this.gRm.getId();
  }

  public String getName() {
    return this.gRm.getName();
  }

  public cqH cGJ() {
    return this.kyY;
  }

  public void a(cqH paramcqH) {
    this.kyY = paramcqH;
    this.gRm.a(paramcqH);
  }

  public void b(bQf parambQf) {
    if (!aeI())
      return;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject8;
    Object localObject10;
    Object localObject5;
    Object localObject6;
    switch (bHq.gFT[parambQf.bXt().ordinal()])
    {
    case 1:
      localObject1 = (bGt)parambQf;

      dLE.doY().removeProperty("exchange.itemTrade");
      dLE.doY().removeProperty("exchange.remotePlayer");

      if (parambQf.bXu().bPg() != dTl.mpK)
      {
        if (cBQ.cxL().mZ("splitExchangeAmountOfCashDialog")) {
          cBQ.cxL().mW("splitExchangeAmountOfCashDialog");
        }
        if (cBQ.cxL().mZ("splitStackDialog")) {
          cBQ.cxL().mW("splitStackDialog");
        }
        aYP.feK.b(null);
      }

      switch (bHq.gFR[localObject1.bOp().ordinal()]) {
      case 1:
        localObject2 = (aqa)parambQf.bXu();

        localObject3 = new jy();
        ((jy)localObject3).setExchangeId(((bHF)localObject2).getId());
        ((jy)localObject3).s((byte)4);
        byv.bFN().aJK().d((cWG)localObject3);
        break;
      case 2:
        localObject2 = (aqa)parambQf.bXu();
        localObject3 = ((aqa)localObject2).aBW();
        if (localObject3 != null)
          cBQ.cxL().mW(((cKX)localObject3).cEk()); break;
      case 3:
        localObject2 = (aqa)parambQf.bXu();
        localObject3 = ((aqa)localObject2).aBW();
        if (localObject3 != null) {
          cBQ.cxL().mW(((cKX)localObject3).cEk());
        }

        long l = parambQf.aFL();
        localObject8 = (cPO)((aqa)localObject2).gI(l);
        if (localObject8 == ((aqa)localObject2).bPc()) {
          localObject10 = bU.fH().getString("exchange.declinedBy", new Object[] { ((cPO)localObject8).getName() });
          aEe localaEe = new aEe((String)localObject10);
          localaEe.mm(4);
          CM.LV().ez(4).a(localaEe);
          byv.bFN().b(bQs.bXv());
          byv.bFN().b(cYi.cLH());
        }break;
      case 4:
        localObject2 = (aqa)parambQf.bXu();
        localObject3 = ((aqa)localObject2).aBW();
        if (localObject3 != null)
          cBQ.cxL().mW(((cKX)localObject3).cEk()); break;
      case 5:
        c(parambQf);

        localObject2 = bU.fH().getString("exchange.locallyCanceled");
        localObject3 = new aEe((String)localObject2);
        ((aEe)localObject3).mm(4);
        CM.LV().ez(4).a((aEe)localObject3);

        break;
      case 6:
        c(parambQf);

        localObject2 = (aqa)parambQf.bXu();
        localObject3 = (cPO)((aqa)localObject2).d(this);

        localObject5 = bU.fH().getString("exchange.canceledBy", new Object[] { ((cPO)localObject3).getName() });
        localObject6 = new aEe((String)localObject5);
        ((aEe)localObject6).mm(4);
        CM.LV().ez(4).a((aEe)localObject6);
        break;
      case 7:
        localObject2 = bU.fH().getString("exchange.done");
        localObject3 = new aEe((String)localObject2);
        ((aEe)localObject3).mm(4);
        CM.LV().ez(4).a((aEe)localObject3);
        byv.bFN().b(bQs.bXv());
        byv.bFN().b(cYi.cLH());
        break;
      case 8:
        c(parambQf);

        localObject2 = bU.fH().getString("exchange.failed");
        localObject3 = new aEe((String)localObject2);
        ((aEe)localObject3).mm(3);
        CM.LV().ez(3).a((aEe)localObject3);
      }

      break;
    case 2:
      localObject1 = (aqa)parambQf.bXu();

      ((aqa)localObject1).aBW().cEo();

      byv.bFN().b(dxP.dcE());

      dLE.doY().t("exchange.itemTrade", localObject1);

      localObject2 = (cPO)((aqa)localObject1).d(this);
      dLE.doY().t("exchange.remotePlayer", ((cPO)localObject2).gRm);

      this.kyZ = new aek((aqa)localObject1);

      if (!byv.bFN().c(bQs.bXv())) {
        byv.bFN().a(bQs.bXv());
      }

      byv.bFN().a(bQs.bXv());
      byv.bFN().a(cYi.cLH());

      bOU.gUc.b(new ahO());
      K.info("Le joueur d?marre un ?change");
      break;
    case 3:
      byv.bFN().a(dxP.dcE());

      localObject1 = (aqa)parambQf.bXu();
      localObject2 = bU.fH().getString("exchangeInvitation.messageIn", new Object[] { ((cPO)((aqa)localObject1).bPc()).getName() });

      localObject3 = cBQ.cxL().a((String)localObject2, Cn.et(2), 18437L, 102, 2);

      if (localObject3 != null) {
        ((aqa)localObject1).c((cKX)localObject3);
        ((cKX)localObject3).a(new bHo(this, (aqa)localObject1));
      }
      else
      {
        localObject5 = cbZ.cfA();
        ((cbZ)localObject5).bK(((aqa)localObject1).getId());
        cjO.clE().j((cWG)localObject5);
      }
      break;
    case 4:
      byv.bFN().a(dxP.dcE());

      localObject1 = (aqa)parambQf.bXu();
      localObject2 = (cPO)((aqa)localObject1).bPb();
      localObject3 = CA.Lv().bj(((cPO)localObject2).getId());
      localObject5 = bU.fH().getString("exchangeInvitation.messageOut", new Object[] { ((cPO)localObject2).getName() });

      localObject6 = new auK();
      ((csx)localObject6).Q(localObject3);
      localObject8 = ((csx)localObject6).Eu();
      if (localObject8 != null) {
        localObject5 = (String)localObject5 + '\n' + (String)localObject8;
      }
      localObject6 = null;

      localObject10 = cBQ.cxL().a((String)localObject5, Cn.et(2), 2073L, 102, 1);

      ((aqa)localObject1).c((cKX)localObject10);
      ((cKX)localObject10).a(new bHp(this, (aqa)localObject1));

      break;
    case 5:
      localObject1 = (dwm)parambQf;

      localObject2 = (aqa)((dwm)localObject1).bXu();
      Object localObject9;
      if (((dwm)localObject1).aFL() == getId())
      {
        switch (bHq.gFS[localObject1.dbo().ordinal()]) {
        case 1:
          if ((dLE.doY().getProperty("exchange.sourceBag") == null) || (dLE.doY().getProperty("exchange.sourcePosition") == null))
          {
            K.error("Impossible d'ajouter l'objet : le bag / position de la source n'ont pas été spécifiés");
            return;
          }

          localObject5 = (byz)this.gRm;

          localObject6 = dLE.doY().getProperty("exchange.sourceBag").getValue();

          if ((localObject6 instanceof bCJ)) {
            short s1 = (short)-((dwm)localObject1).dbq();
            ((byz)localObject5).bGP().c(((dwm)localObject1).dbp().oj(), s1);

            short s3 = dLE.doY().getProperty("exchange.sourcePosition").getShort();
            this.kyZ.a(((dwm)localObject1).dbp(), localObject6, s3);
          }
          if ((localObject6 instanceof bZH)) {
            localObject9 = ((byz)localObject5).ayJ();

            if (((dwm)localObject1).dbq() != 1) {
              K.error("Impossible d'ajouter plusieurs items depuis l'équipement");
            } else {
              localObject10 = (gA)((bZH)localObject9).ci(((dwm)localObject1).dbp().oj());
              short s4 = dLE.doY().getProperty("exchange.sourcePosition").getShort();
              if (!((bZH)localObject9).d((dsj)localObject10)) {
                K.error("Impossible de retirer l'item de l'?quipement du joueur");
              }

              if (((gA)localObject10).oi().bKn().nj() != null) {
                for (azO localazO : ((gA)localObject10).oi().bKn().nj()) {
                  gA localgA = (gA)((bZH)localObject9).dz((short)localazO.hV);
                  if (localgA != null) {
                    localgA.release();
                  }
                }
              }

              this.kyZ.a(((dwm)localObject1).dbp(), localObject6, s4);
            }

            ((byz)localObject5).bGH();
          }

          ((aqa)localObject2).aCd();

          dLE.doY().removeProperty("exchange.sourceBag");
          dLE.doY().removeProperty("exchange.sourcePosition");

          break;
        case 2:
          localObject5 = this.kyZ.c((gA)((dwm)localObject1).dbp(), ((dwm)localObject1).dbq());
          if ((localObject5 instanceof bZH)) {
            localObject6 = (byz)this.gRm;
            ((byz)localObject6).bGH();
          }

          ((aqa)localObject2).aCd();
          break;
        case 3:
          if ((localObject1 instanceof bvI)) {
            localObject5 = (byz)this.gRm;
            int i = ((bvI)localObject1).bDx();
            if (i >= 0) {
              if (!((byz)localObject5).bHb().fO().Bj(i)) {
                K.error("Erreur lors de la mise a jour du portefeuille");
              }
            }
            else if (!((byz)localObject5).bHb().fO().BD(-i)) {
              K.error("Erreur lors de la mise a jour du portefeuille");
            }

            ((aqa)localObject2).aCf();

            localObject9 = (dOc)cBQ.cxL().coO().nf("exchangeDialog").fi("localMoney");

            localObject10 = new bNa(0.1F, 0.8F, 0.98F, 0.55F);

            bNa localbNa = new bNa(bNa.gRx.get());

            ((dOc)localObject9).getAppearance().a(new gm(localbNa, (bNa)localObject10, ((dOc)localObject9).getAppearance(), 0, 100, 11, ddp.kWG));
          }
          else {
            K.error("Impossible de mettre a jour le portefeuille du client : l'?v?nement re?u n'est pas de la classe WakfuItemExchangerModifiedEvent");
          }
          break;
        }
      }
      else
      {
        Object localObject4;
        Object localObject7;
        switch (bHq.gFS[localObject1.dbo().ordinal()]) {
        case 3:
          ((aqa)localObject2).aCg();

          localObject4 = (dOc)cBQ.cxL().coO().nf("exchangeDialog").fi("remoteMoney");

          localObject5 = new bNa(0.1F, 0.8F, 0.98F, 0.55F);

          localObject7 = new bNa(bNa.gRx.get());

          ((dOc)localObject4).getAppearance().a(new gm((bNa)localObject7, (bNa)localObject5, ((dOc)localObject4).getAppearance(), 0, 50, 11, ddp.kWG));

          if ((localObject1 instanceof bvI)) {
            localObject9 = (bvI)localObject1;
            ou(bU.fH().getString("exchange.cashChanged", new Object[] { this.kyY.cpK().aCl().getName(), Integer.valueOf(((bvI)localObject9).bDx()) }));
          }break;
        case 1:
        case 2:
          ((aqa)localObject2).aCe();

          localObject4 = (gA)((dwm)localObject1).dbp();
          short s2 = ((dwm)localObject1).dbq();
          localObject7 = ((dwm)localObject1).dbo() == dxK.lEC ? "exchange.itemAdded" : "exchange.itemRemoved";

          localObject9 = bU.fH().b(15, ((gA)localObject4).ok(), new Object[0]);

          ou(bU.fH().getString((String)localObject7, new Object[] { this.kyY.cpK().aCl().getName(), Short.valueOf(s2), localObject9 }));
          break;
        }

      }

      ((aqa)localObject2).aCi();
      ((aqa)localObject2).aCh();
      break;
    }
  }

  private void ou(String paramString)
  {
    lZ locallZ = new lZ();
    locallZ.a(paramString).tH();
    ahB localahB = (ahB)dLE.doY().br("chat", "exchangeDialog");
    localahB.auy().c("history", locallZ.tP());
    dWe.dvA().a(localahB.auy(), new String[] { "history" });
  }

  private void c(bQf parambQf)
  {
    aqa localaqa = (aqa)parambQf.bXu();
    this.kyZ.a(localaqa);

    if (cHk() != 0) {
      byz localbyz = (byz)this.gRm;
      localbyz.bHb().fO().Bj(cHk());
    }

    byv.bFN().b(bQs.bXv());
    byv.bFN().b(cYi.cLH());
  }

  public boolean cGK() {
    return false;
  }

  public void cGL() {
    if ((this.kyY != null) && (this.gRm.bSe() == this.kyY)) {
      this.gRm.bSf();
    }
    this.kyY = null;
  }

  public void clear() {
    super.clear();
    cGL();
  }
}