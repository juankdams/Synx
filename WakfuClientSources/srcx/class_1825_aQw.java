import org.apache.log4j.Logger;

public class aQw extends mp
{
  private static final boolean aRN = false;
  private static final Logger K = Logger.getLogger(aQw.class);

  private static final aQw eNg = new aQw();
  private boU eNh;
  private bnm N;
  private cuF aTV;
  private dFo eNi;

  public static aQw bhd()
  {
    return eNg;
  }

  public boolean a(cWG paramcWG) {
    switch (paramcWG.getId()) {
    case 19366:
      czW localczW = (czW)paramcWG;
      gA localgA = localczW.getItem();
      if (!O(localgA)) {
        return false;
      }
      this.eNh.R(localgA);
      v(this.aTV.EN(), localgA.ok());
      return false;
    case 19367:
      this.eNh.R(null);
      v(this.aTV.EN(), 0);
      return false;
    }

    return true;
  }

  private void v(long paramLong, int paramInt) {
    byz localbyz = byv.bFN().bFO();
    dKc localdKc = localbyz.bSe();
    if (!(localdKc instanceof bXu)) {
      return;
    }

    if (!e(localbyz)) {
      return;
    }

    bvK localbvK = new bvK();
    localbvK.a(new cL(paramLong, paramInt));

    byv.bFN().aJK().d(localbvK);
  }

  private boolean e(bKm parambKm) {
    if (this.aQq.aiJ().CD() != parambKm.CD()) {
      return false;
    }
    bMG localbMG = parambKm.bSt();
    aCl localaCl = localbMG.ay(parambKm.getId());
    if (localaCl == null) {
      return false;
    }
    if (!localbMG.az(localaCl.aOC()).a(cnm.hTn)) {
      return false;
    }
    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      if (this.eNh == null) {
        return;
      }

      this.N = new apT(this);

      cBQ.cxL().a(this.N);

      cBQ.cxL().j("wakfu.buildingPanel", dfq.class);

      cBQ.cxL().a("havenWorldBuildingPanelDialog", VV.dJ("havenWorldBuildingPanelDialog"), 1L, (short)10005);

      byv.bFN().bFO().aeL().a(this);
      dLE.doY().t("selectedBuilding", this.eNh);
    }

    super.a(paramaqv, paramBoolean);
  }

  public cuF ua() {
    return this.aTV;
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      this.eNi = null;
      this.eNh = null;
      cBQ.cxL().b(this.N);

      ckU.cmE().done();

      dLE.doY().removeProperty("selectedBuilding");

      cBQ.cxL().mW("havenWorldBuildingPanelDialog");
      cBQ.cxL().mW("buildingEvolutionDialog");
      cBQ.cxL().mN("wakfu.buildingPanel");

      byz localbyz = byv.bFN().bFO();
      if (localbyz != null) {
        localbyz.bSf();
        localbyz.aeL().b(this);
      }
    }
    super.b(paramaqv, paramBoolean);
  }

  public void a(dMM paramdMM, cuB paramcuB) {
    byv.bFN().b(this);
  }

  public void a(cKg paramcKg) {
    super.a(paramcKg);
    long l = this.eNi.gv();
    this.aTV = paramcKg.cI(l);
    if (this.aTV == null) {
      return;
    }

    this.eNh = dfX.laF.jG(l);
  }

  public boolean O(gA paramgA)
  {
    return this.aTV.adj().xO(paramgA.ok());
  }

  public void H(gA paramgA) {
    if (!byv.bFN().c(bhd())) {
      return;
    }
    cpa localcpa = cBQ.cxL().coO().nf("havenWorldBuildingPanelDialog");
    boolean bool = O(paramgA);
    dRq localdRq = (dRq)localcpa.fi("frontSlot");
    bNa localbNa = bool ? new bNa(clP.hPd.get()) : bNa.gRz;
    a(localdRq, localbNa);
  }

  private void a(dRq paramdRq, bNa parambNa) {
    Jg localJg = paramdRq.getAppearance();

    bNa localbNa = new bNa(bNa.gRx.get());

    localJg.J(gm.class);
    localJg.setModulationColor(localbNa);
    gm localgm = new gm(localbNa, parambNa, localJg, 0, 300, -1, ddp.kWG);
    localJg.a(localgm);
  }

  public void aRK() {
    if (!byv.bFN().c(bhd())) {
      return;
    }
    cpa localcpa = cBQ.cxL().coO().nf("havenWorldBuildingPanelDialog");
    dRq localdRq = (dRq)localcpa.fi("frontSlot");
    localdRq.getAppearance().J(gm.class);
  }

  public void a(dFo paramdFo) {
    this.eNi = paramdFo;
  }
}