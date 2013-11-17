import org.apache.log4j.Logger;

public class aOy
  implements cvW
{
  protected static final Logger K = Logger.getLogger(aOy.class);

  private static aOy eve = new aOy();
  private anS evf;
  private bab evg;
  private int evh;
  private auP O;
  private bnm N;

  public static aOy bfr()
  {
    return eve;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject2;
    switch (paramcWG.getId()) {
    case 19363:
      localObject1 = bU.fH().getString("question.havenWorldResourcesCollectorConfirm", new Object[] { Integer.valueOf(this.evf.aAm()) });
      localObject2 = new NW(102, 0, (String)localObject1, null, Cn.et(8), 24L);

      cKX localcKX = cBQ.cxL().a((NW)localObject2);
      localcKX.a(new TA(this));

      return false;
    case 19365:
      this.evf.removeItem(((dGe)paramcWG).dhk());
      return false;
    case 19364:
      if (this.evf.size() >= this.evh) {
        localObject1 = bU.fH().getString("maxItemsCountReached");
        localObject2 = new aEe((String)localObject1);
        ((aEe)localObject2).mm(3);
        CM.LV().ez(3).a((aEe)localObject2);
        return false;
      }

      localObject1 = (czW)paramcWG;
      long l = ((czW)localObject1).ah();
      short s = ((czW)localObject1).nP();
      byz localbyz = byv.bFN().bFO();
      bMD localbMD = localbyz.bGP();

      gA localgA = ((czW)localObject1).getItem() == null ? localbMD.iS(l) : ((czW)localObject1).getItem();
      bBn localbBn = localgA.oi();

      if ((localgA.or()) || ((localbBn.a(Aq.bvR) != null) && (!localbBn.a(Aq.bvR).i(localbyz, Integer.valueOf(-1), localbBn, localbyz.bEY()))))
      {
        K.warn("Impossible d'ajouter l'item");
        String str = bU.fH().getString("storageBox.addItem.unauthorized");
        aEe localaEe = new aEe(str);
        localaEe.mm(3);
        CM.LV().ez(3).a(localaEe);
        return false;
      }

      this.evf.d(localgA, s);
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

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      if ((this.evg == null) || (this.evf == null)) {
        return;
      }
      dLE.doY().t("havenWorldResourcesCollector", this.evf);

      this.O = new Tz(this);

      bBq.bKG().a(this.O);

      this.N = new Ty(this);

      cBQ.cxL().a(this.N);

      cBQ.cxL().a("havenWorldResourcesCollectorDialog", VV.dJ("havenWorldResourcesCollectorDialog"), 1L, (short)10000);
      cpa localcpa = cBQ.cxL().coO().nf("havenWorldResourcesCollectorDialog");
      ccG localccG = (ccG)localcpa.fi("itemList");

      this.evh = (localccG.getIdealSizeMaxColumns() * localccG.getIdealSizeMaxRows());

      cBQ.cxL().j("wakfu.havenWorldResourcesCollector", lj.class);

      if (!byv.bFN().c(dGW.dhM()))
        dGW.dhM().dhN();
      else {
        byv.bFN().bFO().bGP().bUg();
      }
      byv.bFN().b(Rl.acN());
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      byv.bFN().a(Rl.acN());
      byv.bFN().b(this.evg.boW());
      dGW.dhM().dhP();

      dLE.doY().removeProperty("havenWorldResourcesCollector");

      cBQ.cxL().b(this.N);
      bBq.bKG().b(this.O);

      cBQ.cxL().mW("havenWorldResourcesCollectorDialog");

      cBQ.cxL().mN("wakfu.havenWorldResourcesCollector");
    }
  }

  public void a(bab parambab)
  {
    this.evg = parambab;
  }

  public anS bfs() {
    return this.evf;
  }

  public void a(anS paramanS) {
    this.evf = paramanS;
  }

  public boolean dR(long paramLong) {
    return this.evf.cV(paramLong);
  }

  public void bft() {
    dLE.doY().t("havenWorldResourcesCollector", this.evf);
  }
}