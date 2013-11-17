import org.apache.log4j.Logger;

public class oj
  implements cvW
{
  protected static final Logger K = Logger.getLogger(oj.class);

  private static final oj aTr = new oj();
  private bnm N;
  private caV aTs;

  public static oj vO()
  {
    return aTr;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      this.N = new bwT(this);

      cBQ.cxL().a(this.N);

      cBQ.cxL().a("equipableDummyDialog", VV.dJ("equipableDummyDialog"), 1L, (short)10000).getElementMap();

      aWc.blo().eO(600012L);

      if (this.aTs.ceS().getItem() == null) {
        vP();
      }

      cBQ.cxL().j("wakfu.equipableDummy", avl.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("equipableDummyDialog");

      dLE.doY().removeProperty("equipableDummy");

      aWc.blo().eO(600013L);

      cBQ.cxL().mN("wakfu.equipableDummy");
    }
  }

  private void vP()
  {
    cpa localcpa = cBQ.cxL().coO().nf("equipableDummyDialog");
    bMT.l((dOc)localcpa.fi("pennon"));
  }

  private void equipItem(gA paramgA)
  {
    ayY localayY;
    if (paramgA == null) {
      localayY = new ayY(-1L);
    } else {
      localObject1 = paramgA.oi();
      bZA localbZA = ((bBn)localObject1).a(Aq.bvS);
      if ((localbZA != null) && (!localbZA.i(null, null, null, null))) {
        localObject2 = bU.fH().getString("error.cannotEquipNonExchangeableItem");
        CM.LV().f((String)localObject2, 3);
        return;
      }

      if (paramgA.or()) {
        localObject2 = bU.fH().getString("error.cannotEquipRentItem");
        CM.LV().f((String)localObject2, 3);
        return;
      }

      Object localObject2 = ((bBn)localObject1).bKr();
      boolean bool = localObject2 instanceof wD;
      int i = ((bBn)localObject1).bKn().nc() == 646 ? 1 : 0;
      int j = ((bBn)localObject1).bKn().nc() == 647 ? 1 : 0;
      if ((!bool) && (i == 0) && (j == 0)) {
        return;
      }
      localayY = new ayY(paramgA.oj());
    }

    Object localObject1 = new aDp();
    ((aDp)localObject1).b(this.aTs.ceS().getId());
    ((aDp)localObject1).a(localayY);
    byv.bFN().aJK().d((cWG)localObject1);
  }

  public boolean a(cWG paramcWG)
  {
    czW localczW;
    switch (paramcWG.getId()) {
    case 19314:
      localczW = (czW)paramcWG;
      equipItem(localczW.getItem());
      return false;
    case 19315:
      localczW = (czW)paramcWG;

      gA localgA = this.aTs.ceS().getItem();
      if (localgA == null) {
        return false;
      }
      if (localgA.ok() == localczW.getIntValue()) {
        equipItem(null);
      }
      return false;
    }

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(rb paramrb) {
    this.aTs = new caV(paramrb);
    dLE.doY().t("equipableDummy", this.aTs);
    byv.bFN().a(this);

    if ((cBQ.cxL().mZ("equipableDummyDialog")) && (this.aTs.ceS().getItem() == null))
    {
      vP();
    }
  }
}