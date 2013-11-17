import org.apache.log4j.Logger;

public class dhC
  implements bSX, bbk, cvW
{
  protected static final Logger K = Logger.getLogger(dhC.class);

  private static final dhC lcH = new dhC();
  private static final byte chc = 8;
  private static final String chd = "progressBar";
  private static final String che = "startButton";
  private bnm N;
  cMb chf;
  private bwe chg;
  private cpa buE;
  aoL lcI;

  private dhC()
  {
    this.chf = null;
    this.lcI = new aoL();
  }

  public void abg() {
    byz localbyz = byv.bFN().bFO();
    localbyz.ayJ().d(this);
    for (cHu localcHu = localbyz.bGP().cEg(); localcHu.hasNext(); ) {
      localcHu.fl();
      ((cRs)localcHu.value()).d(this);
    }
    abh();
  }

  public void clean() {
    byz localbyz = byv.bFN().bFO();
    localbyz.ayJ().c(this);
    for (cHu localcHu = localbyz.bGP().cEg(); localcHu.hasNext(); ) {
      localcHu.fl();
      ((cRs)localcHu.value()).c(this);
    }
    abh();
  }

  private void abh() {
    dLE.doY().removeProperty("recycleStack");
    this.lcI.clear();
  }

  public void cS(boolean paramBoolean) {
    cWq localcWq = (cWq)this.buE.fi("ingredientList");
    for (axU localaxU : localcWq.getRenderables()) {
      dOc localdOc = (dOc)localaxU.getInnerElementMap().fi("ingredientBackgroundContainer");
      localdOc.setStyle(paramBoolean ? "itemSelectedBackground" : "itemBackground");
    }
  }

  public boolean cV(long paramLong) {
    return this.lcI.containsKey(paramLong);
  }

  private long b(agi paramagi) {
    for (cHu localcHu = this.lcI.aBa(); localcHu.hasNext(); ) {
      localcHu.fl();
      if (((agi)localcHu.value()).Hu().getId() == paramagi.Hu().getId()) {
        return localcHu.bic();
      }
    }
    return -1L;
  }

  void cQl() {
    dLE.doY().t("recycleStackSize", Integer.valueOf(this.lcI.size()));
    dLE.doY().t("recycleStack", this.lcI.getValues());
  }

  public void a(cRs paramcRs) {
    paramcRs.d(this);
  }

  public void b(cRs paramcRs) {
    paramcRs.c(this);
  }

  public void a(bNz parambNz)
  {
    Object localObject1;
    Object localObject2;
    switch (kz.aOs[parambNz.bVg().ordinal()]) {
    case 1:
    case 2:
      localObject1 = (YS)parambNz;
      localObject2 = ((YS)localObject1).akr();
      this.lcI.remove(((dsj)localObject2).oj());
      cQl();
      break;
    case 3:
      localObject1 = (YS)parambNz;
      localObject2 = (gA)((YS)localObject1).akr();

      agi localagi = (agi)this.lcI.get(((gA)localObject2).oj());
      if ((localagi != null) && (((gA)localObject2).nP() < localagi.nP())) {
        this.lcI.put(((gA)localObject2).oj(), new agi(((gA)localObject2).nP(), (bVw)((gA)localObject2).oi()));
        cQl(); } break;
    case 4:
      for (localObject1 = this.lcI.aBa(); ((cHu)localObject1).hasNext(); ) {
        ((cHu)localObject1).fl();
        if (!bR(((cHu)localObject1).bic())) {
          ((cHu)localObject1).remove();
        }
      }

      cQl();
    }
  }

  public boolean a(cWG paramcWG)
  {
    if (PO.g(paramcWG)) {
      return false;
    }
    byz localbyz = byv.bFN().bFO();
    Object localObject1;
    Object localObject2;
    long l2;
    switch (paramcWG.getId())
    {
    case 16846:
      localObject1 = (afk)paramcWG;
      long l1 = ((afk)localObject1).ah();
      if (this.lcI.N(l1)) {
        this.lcI.remove(l1);
        cQl();
      }
      cS(true);
      return false;
    case 16845:
      if (dLE.doY().getBooleanProperty("recycleRunning")) {
        return false;
      }

      localObject1 = (aoU)paramcWG;
      localObject2 = ((aoU)localObject1).aBn();
      l2 = b((agi)localObject2);
      int i = ((aoU)localObject1).ag();

      gA localgA = localbyz.bGP().iS(l2);

      if ((i == -1) || (((agi)localObject2).nP() == 1))
        this.lcI.remove(l2);
      else {
        this.lcI.put(l2, new agi((short)(((agi)localObject2).nP() - 1), ((agi)localObject2).Hu()));
      }

      dLE.doY().a(localgA, new String[] { "usedInCurrentRecipe" });
      cQl();
      return false;
    case 16844:
      localObject1 = (czW)paramcWG;
      localObject2 = ((czW)localObject1).getItem();

      if (!((gA)localObject2).ol().nl()) {
        return false;
      }

      if (this.lcI.size() >= 8) {
        return false;
      }

      if (dLE.doY().getBooleanProperty("recycleRunning")) {
        return false;
      }

      l2 = ((gA)localObject2).oj();
      if (!bR(l2)) {
        return false;
      }

      agi localagi = (agi)this.lcI.get(l2);
      short s = ((czW)localObject1).nP();

      if (localagi != null) {
        if (s != 1) {
          K.error("on a encore un item de même type dans la liste des ingrédients !");
          return false;
        }
        int j = localagi.nP() + 1;
        if (((gA)localObject2).nP() < j) {
          return false;
        }
        s = (short)j;
      }
      this.lcI.put(l2, new agi(s == -1 ? ((gA)localObject2).nP() : s, (bVw)((gA)localObject2).oi()));

      dLE.doY().a((dBv)localObject2, new String[] { "usedInCurrentRecipe" });
      cS(false);
      cQl();

      return false;
    case 16840:
      localObject1 = (bKY)paramcWG;

      if (!this.lcI.isEmpty()) {
        localObject2 = cBQ.cxL().a(bU.fH().getString("question.confirmRecycle"), Cn.et(0), 2073L, 102, 1);

        ((cKX)localObject2).a(new kI(this, localbyz, (bKY)localObject1));
      }

      return false;
    case 16841:
    case 16842:
    case 16843:
    }return true;
  }

  private static boolean bR(long paramLong) {
    byz localbyz = byv.bFN().bFO();
    return (localbyz.ayJ().ch(paramLong)) || (localbyz.bGP().N(paramLong));
  }

  public void je(boolean paramBoolean)
  {
    cpa localcpa = cBQ.cxL().coO().nf("recycleDialog");
    alP localalP = (alP)localcpa.fi("progressBar");
    dOc localdOc = (dOc)localcpa.fi("progressBar");

    cag localcag = new cag();
    localcag.aJ();
    localcag.setAlignment(aFG.eck);
    localcag.setLevel(1);
    localcag.setFile(paramBoolean ? "6001038.xps" : "6001039.xps");
    localcag.setUseParentScissor(true);
    localcag.setRemovable(false);
    localdOc.getAppearance().a(localcag);

    localalP.setTweenDuration(0L);
    localalP.setValue(0.0F);

    this.lcI.clear();
    cQl();
    dLE.doY().t("recycleRunning", Boolean.valueOf(false));
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      byz localbyz = byv.bFN().bFO();

      this.chg = new kC(this);

      localbyz.aeL().a(this.chg);

      this.N = new kF(this, localbyz);

      cBQ.cxL().a(this.N);

      abg();

      aNL localaNL = cBQ.cxL().a("recycleDialog", VV.dJ("recycleDialog"), 32768L, (short)10000);

      if (localaNL != null) {
        this.buE = localaNL.getElementMap();
      }

      cBQ.cxL().j("wakfu.recycle", cnp.class);

      dLE.doY().t("recycleRunning", Boolean.valueOf(false));
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      byv.bFN().bFO().aeL().b(this.chg);
      this.chg = null;
      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("recycleDialog");

      cBQ.cxL().mN("wakfu.recycle");

      clean();

      if (this.chf != null) {
        this.chf.x((short)1);
        this.chf.sM();
      }
    }
  }

  public void a(cMb paramcMb) {
    this.chf = paramcMb;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public static dhC cQm() {
    return lcH;
  }
}