import java.util.ArrayList;

public class bJI
  implements bnm, cvW
{
  private static bJI gLx = new bJI();
  private bnm N;
  private final ArrayList gLy = new ArrayList();
  private aSP gLz;
  public static final int gLA = 787;

  public static bJI bRn()
  {
    return gLx;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    bzu localbzu;
    Object localObject2;
    Object localObject3;
    switch (paramcWG.getId())
    {
    case 16814:
      localObject1 = byv.bFN().bFO();
      localbzu = (bzu)paramcWG;
      byte b2 = localbzu.af();
      localObject2 = ((byz)localObject1).bGo();
      if (localObject2 != null) {
        if (b2 != ((QT)localObject2).aae())
        {
          ((QT)localObject2).ak(b2);

          localObject3 = new bFC();
          ((bFC)localObject3).dn(b2);

          byv.bFN().aJK().d((cWG)localObject3);
        }

        if ((((byz)localObject1).aeQ() != null) && (this.gLz != null) && (!byv.bFN().c(dFM.dhf())))
        {
          cjO.clE().j(this.gLz);
          ((byz)localObject1).bGI();
        }
      }
      return false;
    case 16815:
      localObject1 = byv.bFN().bFO().bGo();
      localbzu = (bzu)paramcWG;
      if ((localObject1 != null) && (((QT)localObject1).aad() > 1));
      return false;
    case 16816:
      localbzu = (bzu)paramcWG;
      byte b1 = localbzu.af();

      if (byv.bFN().bFO().bGK())
        return false;
      byz localbyz2 = byv.bFN().bFO();
      if (localbyz2.bGo() != null) {
        localObject2 = (aMp)localbyz2.bGo().aj(b1);
        if (localbyz2.bGo().an(b1)) {
          localObject3 = cBQ.cxL().a(bU.fH().getString("question.osaFreeCreature", new Object[] { ((aMp)localObject2).getShortDescription() }), Cn.et(0), 2073L, 102, 1);

          ((cKX)localObject3).a(new hP(this, (aMp)localObject2, localbyz2, b1));
        }

      }

      return false;
    case 16817:
      byz localbyz1 = byv.bFN().bFO();
      localbzu = (bzu)paramcWG;

      byte b3 = localbzu.af();
      if (localbyz1.bGo() != null) {
        localObject2 = localbyz1.bGo().aj(b3);
        if ((localObject2 != null) && (((aMp)localObject2).bdE())) {
          if ((aYD.avC().eA(localbzu.getStringValue())) && (localbzu.getStringValue().length() > 0)) {
            ((csi)localObject2).setName(localbzu.getStringValue());

            localObject3 = new alc();
            ((alc)localObject3).bc(b3);
            ((alc)localObject3).eK(localbzu.getStringValue());

            byv.bFN().aJK().d((cWG)localObject3);
          }
          else {
            localObject3 = bU.fH().getString("error.chat.operationNotPermited");
            aEe localaEe = new aEe((String)localObject3);
            localaEe.mm(3);
            CM.LV().a(localaEe);
          }
        }
      }

      return false;
    }

    return true;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      aSP localaSP = new aSP();
      localaSP.b((apX)byv.bFN().bFO().auK().hh(787));
      localaSP.d(18002);
      this.gLz = localaSP;

      this.N = new hO(this);

      cBQ.cxL().a(this.N);

      ceR.chM().a(byv.bFN().bFO().bGo());
      dLE.doY().t("osamodasSymbiot", ceR.chM());

      cBQ.cxL().a("osamodasSymbiotDialog", VV.dJ("osamodasSymbiotDialog"), 32769L, (short)10000);

      cBQ.cxL().j("wakfu.osamodasSymbiot", sE.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      cBQ.cxL().b(this.N);

      for (String str : (ArrayList)this.gLy.clone()) {
        if (cBQ.cxL().mZ(str))
          cBQ.cxL().mW(str);
      }
      this.gLy.clear();

      cBQ.cxL().mW("osamodasSymbiotDialog");

      dLE.doY().removeProperty("osamodasSymbiot");
      dLE.doY().removeProperty("osamodasSymbiot.describedCreature");

      cBQ.cxL().mN("wakfu.osamodasSymbiot");

      this.gLz = null;
    }
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aSP paramaSP) {
    this.gLz = paramaSP;
    if (byv.bFN().bFO().bGo().aae() != -1)
      cjO.clE().j(this.gLz);
  }

  public void bRo()
  {
    cpa localcpa = cBQ.cxL().coO().nf("osamodasSymbiotDialog");
    if (localcpa == null)
      return;
    dRq localdRq = (dRq)localcpa.fi("mainContainer");
    if (localdRq == null)
      return;
    bNa localbNa1 = new bNa(0.531F, 0.812F, 0.835F, 1.0F);

    bNa localbNa2 = new bNa(bNa.gRx.get());
    localdRq.J(gm.class);
    gm localgm = new gm(localbNa1, localbNa2, localdRq.getAppearance(), 0, 500, 5, ddp.kWG);

    localdRq.getAppearance().a(localgm);
  }

  public void a(aMp paramaMp) {
    String str = "monsterDetailDialog" + byv.bFN().bFO().bGo().a(paramaMp);

    if (cBQ.cxL().mZ(str)) {
      cBQ.cxL().mW(str);
      this.gLy.remove(str);
    } else {
      this.gLy.add(str);

      cBQ.cxL().a(str, VV.dJ("monsterDetailDialog"), 1L, (short)10000);

      dLE.doY().a("monsterDetail", paramaMp, str);
    }
  }

  public void i(String paramString) {
    this.gLy.remove(paramString);
  }
}