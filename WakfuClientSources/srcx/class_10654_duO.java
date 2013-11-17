import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class duO
  implements bwe, cTu, cvW
{
  protected static final Logger K = Logger.getLogger(duO.class);

  private static final duO lzD = new duO();
  private bnm N;
  private cSR lzE;
  private aIV bYb;
  private cpa buE;
  private int lzF;
  private alP cdb;
  private br gOJ;
  private boolean cPU = false;

  private final Runnable lzG = new dhH(this);

  public static duO dax()
  {
    return lzD;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      byv.bFN().b(Rl.acN());
      byv.bFN().b(bQs.bXv());

      this.N = new dhI(this);

      cBQ.cxL().a(this.N);

      byz localbyz = byv.bFN().bFO();
      localbyz.aTn().a(this);
      localbyz.aeL().a(this);
      String str = this.cPU ? "craftTableFreeDialog" : "craftTableDialog";

      this.buE = cBQ.cxL().a(str, VV.dJ(str), 1L, (short)10000).getElementMap();

      dLE.doY().a("craft", this.bYb, str);
      this.lzF = 0;
      dLE.doY().t("currentCraftNb", Integer.valueOf(this.lzF));

      dLE.doY().t("selectedRecipe", null);
      dLE.doY().t("craftRunning", Boolean.valueOf(false));
      dLE.doY().t("recipeIngredientStack", null);

      aWc.blo().eO(600012L);

      cBQ.cxL().j("wakfu.craftTable", eS.class);
      if (!byv.bFN().c(bcN.bqJ())) {
        cBQ.cxL().j("wakfu.crafts", Rn.class);
      }

      if (!cBQ.cxL().mM("wakfu.equipment"))
        cBQ.cxL().j("wakfu.equipment", byA.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      byz localbyz = byv.bFN().bFO();
      if ((dLE.doY().getBooleanProperty("craftRunning")) && (localbyz.bSe() != null)) {
        daF();
      }
      localbyz.q(false, true);
      localbyz.aTn().b(this);
      localbyz.aeL().b(this);
      day();
      this.lzE = null;
      this.buE = null;

      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("craftTableDialog");
      cBQ.cxL().mW("craftTableFreeDialog");
      cBQ.cxL().mW("splitStackDialog");

      dLE.doY().removeProperty("currentCraftNb");
      this.cdb = null;
      this.gOJ = null;
      dLE.doY().removeProperty("selectedRecipe");
      dLE.doY().removeProperty("craftRunning");
      dLE.doY().removeProperty("recipeIngredientStack");
      dLE.doY().removeProperty("craftTableName");

      aWc.blo().eO(600013L);

      cBQ.cxL().mN("wakfu.craftTable");
      if (!byv.bFN().c(bcN.bqJ())) {
        cBQ.cxL().mN("wakfu.crafts");
      }
      if (!byv.bFN().c(dGW.dhM())) {
        cBQ.cxL().mN("wakfu.equipment");
      }

      byv.bFN().a(Rl.acN());
    }
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject2;
    int j;
    Object localObject5;
    int i1;
    Object localObject4;
    switch (paramcWG.getId()) {
    case 19992:
      return false;
    case 16851:
      localObject1 = (afk)paramcWG;
      boolean bool = ((afk)localObject1).getBooleanValue();
      this.bYb.dv(bool);
      this.lzE.clear();
      daB();
      daz();
      for (dBv localdBv : byv.bFN().bFO().bGP().bUi()) {
        dLE.doY().a(localdBv, new String[] { "usedInCurrentRecipe", "movable", "deletable" });
      }
      return false;
    case 16846:
      localObject1 = (aRr)paramcWG;
      int i = ((aRr)localObject1).tc();
      ??? = (agi)this.lzE.get(i);
      if (??? != null) {
        this.lzE.remove(i);
        daB();
        daz();
        BM(i);
      }
      cS(true);
      return false;
    case 16845:
      if (dLE.doY().getBooleanProperty("craftRunning")) {
        return false;
      }
      localObject1 = (aoU)paramcWG;
      localObject2 = ((aoU)localObject1).aBn();
      j = ((agi)localObject2).Hu().getId();
      ??? = ((aoU)localObject1).ag();
      if ((??? == -1) || (((agi)localObject2).nP() == 1))
        this.lzE.remove(j);
      else {
        this.lzE.put(j, new agi((short)(((agi)localObject2).nP() - 1), ((agi)localObject2).Hu()));
      }
      daz();
      daB();

      BM(j);
      return false;
    case 16844:
      localObject1 = (czW)paramcWG;
      localObject2 = ((czW)localObject1).getItem();
      if ((!((gA)localObject2).oi().bKx()) || (dLE.doY().getBooleanProperty("craftRunning"))) {
        return false;
      }
      j = ((gA)localObject2).ok();
      localObject5 = (agi)this.lzE.get(j);
      ??? = ((czW)localObject1).nP();

      if (localObject5 != null) {
        if (??? != 1) {
          K.error("on a encore un item de même type dans la liste des ingrédients !");
          return false;
        }
        i1 = ((agi)localObject5).nP() + 1;
        if (byv.bFN().bFO().bGP().yi(j) < i1) {
          return false;
        }
        ??? = (short)i1;
      }
      this.lzE.put(j, new agi(??? == -1 ? ((gA)localObject2).nP() : ???, (bVw)((gA)localObject2).oi()));

      cS(false);
      daz();
      daB();
      BM(j);
      return false;
    case 16847:
      if (dLE.doY().getBooleanProperty("craftRunning")) {
        return false;
      }
      localObject1 = (aKh)paramcWG;
      localObject2 = ((aKh)localObject1).bbv();
      if (!((cfm)localObject2).cii().aQ(byv.bFN().bFO())) {
        return false;
      }
      ((cfm)localObject2).gT(byv.bFN().bFO().a(((cfm)localObject2).cii()));

      localObject4 = (cfm)dLE.doY().rv("selectedRecipe");
      day();

      for (localObject5 = ((cfm)localObject2).cih().iterator(); ((Iterator)localObject5).hasNext(); ) { agi localagi = (agi)((Iterator)localObject5).next();
        i1 = localagi.Hu().getId();
        this.lzE.put(i1, localagi);
        BM(i1);
      }
      daB();

      if (localObject2 == localObject4) {
        localObject2 = null;
      }

      dLE.doY().t("selectedRecipe", localObject2);
      this.lzF = 1;
      dLE.doY().t("currentCraftNb", Integer.valueOf(this.lzF));
      return false;
    case 16840:
      localObject1 = (bKY)paramcWG;

      if (dLE.doY().getBooleanProperty("craftRunning")) {
        return false;
      }

      if (!daE()) {
        ((bKY)localObject1).bTf().setSelected(false);
        localObject2 = bU.fH().getString("craft.error.inventoryFull");
        localObject4 = new NW(102, 0, (String)localObject2, 2L);
        cBQ.cxL().a((NW)localObject4);
      } else {
        this.cdb = ((bKY)localObject1).bTe();
        this.cdb.setValue(0.0F);
        this.gOJ = ((bKY)localObject1).bTf();

        daI();
      }

      return false;
    case 16850:
      if (!dLE.doY().getBooleanProperty("craftRunning")) {
        return false;
      }

      daF();
      return false;
    case 16848:
      dLE.doY().t("currentCraftNb", null);
      localObject1 = (afk)paramcWG;
      this.lzF = ((afk)localObject1).getIntValue();
      localObject2 = (cfm)dLE.doY().rv("selectedRecipe");
      if (localObject2 != null) {
        int k = byv.bFN().bFO().b(((cfm)localObject2).cii());
        if (this.lzF > k) {
          this.lzF = k;
        }
      }
      if (this.lzF == 0) {
        this.lzF = 1;
      }
      dLE.doY().t("currentCraftNb", Integer.valueOf(this.lzF));
      return false;
    case 16849:
      daA();
      return false;
    }

    return true;
  }

  private void day()
  {
    int[] arrayOfInt1 = this.lzE.qe();
    this.lzE.clear();

    for (int k : arrayOfInt1)
      BM(k);
  }

  private static void BM(int paramInt)
  {
    for (gA localgA : byv.bFN().bFO().bGP().hi(paramInt))
      dLE.doY().a(localgA, new String[] { "usedInCurrentRecipe", "movable", "deletable" });
  }

  private void daz()
  {
    dLE.doY().t("selectedRecipe", daC());
  }

  private void daA() {
    dLE.doY().t("currentCraftNb", null);
    Object localObject = dLE.doY().rv("selectedRecipe");
    byz localbyz = byv.bFN().bFO();
    bMD localbMD = localbyz.bGP();
    if (localObject != null) {
      cfm localcfm = (cfm)localObject;
      this.lzF = Math.max(1, localbyz.b(localcfm.cii()));
    }
    else if (this.lzE.isEmpty()) {
      this.lzF = 0;
    } else {
      int i = 2147483647;
      for (dmn localdmn = this.lzE.yF(); localdmn.hasNext(); ) {
        localdmn.fl();
        int j = localbMD.tj(localdmn.zY()) / ((agi)localdmn.value()).nP();
        if (j < i) {
          i = j;
        }
      }
      this.lzF = i;
    }

    dLE.doY().t("currentCraftNb", Integer.valueOf(this.lzF));
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(bNK parambNK, boolean paramBoolean) {
    dLE.doY().t("craftTableName", parambNK.getName());
    this.bYb = new aIV(parambNK.axX(), parambNK);
    this.bYb.a(new bse(this.bYb, 10));
    this.lzE = new cSR();
    daB();
    this.cPU = paramBoolean;
    byv.bFN().a(this);
  }

  private void daB() {
    dLE.doY().t("recipeIngredientStack", this.lzE.isEmpty() ? null : this.lzE.getValues());
  }

  public boolean BN(int paramInt)
  {
    return this.lzE.containsKey(paramInt);
  }

  public void cS(boolean paramBoolean) {
    cWq localcWq = (cWq)this.buE.fi("ingredientList");
    for (axU localaxU : localcWq.getRenderables()) {
      dOc localdOc = (dOc)localaxU.getInnerElementMap().fi("ingredientBackgroundContainer");
      localdOc.setStyle(paramBoolean ? "itemSelectedBackground" : "itemBackground");
    }
  }

  private cfm daC() {
    for (cfm localcfm : this.bYb.aUV()) {
      if (this.lzE.size() == localcfm.cih().size())
      {
        int i = 1;
        for (agi localagi1 : localcfm.cih()) {
          agi localagi2 = (agi)this.lzE.get(localagi1.Hu().getId());
          if ((localagi2 == null) || (localagi2.nP() != localagi1.nP())) {
            i = 0;
            break;
          }
        }
        if (i != 0)
          return localcfm;
      }
    }
    if (!this.lzE.isEmpty()) {
      dLE.doY().t("currentCraftNb", Integer.valueOf(1));
    }
    return null;
  }

  public void ko(long paramLong)
  {
    if (this.cdb != null) {
      this.cdb.setTweenDuration(paramLong);
      dka.cSF().a(this.lzG, 100L, 1);
    }

    this.bYb.aUX().x((short)2);
    this.bYb.aUX().sM();

    cfm localcfm = (cfm)dLE.doY().rv("selectedRecipe");
    if (localcfm != null) {
      byz localbyz = byv.bFN().bFO();
      azP localazP = localbyz.aTn();
      short s = localazP.getLevel(this.bYb.aER());
      long l1 = localazP.ll(this.bYb.aER());
      long l2 = localcfm.cii().a(s, localbyz);
      float f = (100 + localbyz.e(eu.azO) + localbyz.JL().a(bG.kH, this.bYb.aER())) / 100.0F;

      this.bYb.dY(l1 + Math.round((float)l2 * f));
    }
  }

  public void daD() {
    if (this.cdb != null) {
      this.cdb.setValue(0.0F);
    }

    Object localObject1 = (cfm)dLE.doY().rv("selectedRecipe");
    Object localObject2;
    int k;
    Object localObject3;
    if (localObject1 != null) {
      dLE.doY().a((dBv)localObject1, ((cfm)localObject1).getFields());

      cGx localcGx = ((cfm)localObject1).cii();
      localObject2 = this.bYb.aUV();
      int j = 0; for (k = ((ArrayList)localObject2).size(); j < k; j++) {
        localObject3 = (cfm)((ArrayList)localObject2).get(j);
        if (((cfm)localObject3).cii().getId() == localcGx.getId()) {
          localObject1 = localObject3;
          dLE.doY().t("selectedRecipe", localObject3);
        }
      }
    }

    this.bYb.aVc();

    this.lzF -= 1;

    int i = (this.lzF > 0) && (daE()) ? 1 : 0;

    if (i != 0) {
      if (localObject1 != null) {
        ((cfm)localObject1).gT(true);
      }
      daI();
    } else {
      dLE.doY().t("craftRunning", Boolean.valueOf(false));
      localObject2 = byv.bFN().bFO().bGP();
      ArrayList localArrayList = new ArrayList();
      k = 1;
      for (localObject3 = this.lzE.yF(); ((dmn)localObject3).hasNext(); ) {
        ((dmn)localObject3).fl();
        m = ((dmn)localObject3).zY();
        int n = ((agi)((dmn)localObject3).value()).nP();
        if (((bMD)localObject2).tj(m) - n < n) {
          localArrayList.add(Integer.valueOf(m));
          k = 0;
        }
      }
      int m;
      if (localObject1 != null) {
        ((cfm)localObject1).gT(k);
      }

      for (localObject3 = localArrayList.iterator(); ((Iterator)localObject3).hasNext(); ) { m = ((Integer)((Iterator)localObject3).next()).intValue();
        this.lzE.remove(m);
        BM(m);
      }
      daB();
      if ((k != 0) && (!this.lzE.isEmpty()))
        this.lzF = 1;
      else {
        this.lzF = 0;
      }
      this.bYb.aUX().x((short)1);
      this.bYb.aUX().sM();
    }
    dLE.doY().t("currentCraftNb", Integer.valueOf(this.lzF));
  }

  private boolean daE() {
    cfm localcfm = (cfm)dLE.doY().rv("selectedRecipe");
    Object localObject1 = localcfm != null ? localcfm.cii() : null;

    bMD localbMD = byv.bFN().bFO().bGP();

    int i = localbMD.cEj() == 0 ? 1 : 0;
    int j = 0;
    if (i != 0) {
      Object localObject2 = localObject1 != null ? localObject1.cBx() : null;
      if ((localObject2 == null) || (localObject2.length != 1)) {
        j = 0;
      } else {
        Object localObject3 = localObject2[0];
        bBn localbBn = Hh.QM().dh(localObject3.gw());
        if (localbBn == null) {
          j = 0;
        } else {
          gA localgA = new gA();
          localgA.b(localbBn);
          localgA.l(localObject3.nP());

          cRs localcRs = localbMD.ar(localgA);
          j = localcRs != null ? 1 : 0;
        }
      }
    }

    int k = (localObject1 != null) && (localObject1.c(yK.bsp)) ? 1 : 0;
    return (i == 0) || (j != 0) || (k != 0);
  }

  public void daF() {
    dKc localdKc = byv.bFN().bFO().bSe();
    if (localdKc != null)
      ((apq)localdKc).aBx();
    else {
      K.error("On tente d'annuler le craft alors que le joueur n'a pas d'occupation !");
    }
    daH();
  }

  public static void daG() {
    byv.bFN().bFO().q(false, false);
    dax().bYb.dY(-1L);
  }

  public void daH()
  {
    if (this.cdb != null) {
      this.cdb.setValue(0.0F);
    }
    dka.cSF().j(this.lzG);

    dLE.doY().t("craftRunning", Boolean.valueOf(false));
    this.bYb.aUX().x((short)1);
    this.bYb.aUX().sM();
  }

  private void daI() {
    cfm localcfm = (cfm)dLE.doY().rv("selectedRecipe");
    Object localObject;
    if (localcfm != null) {
      localObject = new bxI(this.bYb.aUX().getId(), localcfm.cii().getId());
      byv.bFN().aJK().d((cWG)localObject);
    } else {
      localObject = daJ();
      byte b;
      int i;
      if (localObject == null) {
        b = -1;
        i = 0;
      } else if (!this.bYb.aUX().tF(((cGx)localObject).getId())) {
        b = -2;
        i = ((cGx)localObject).getId();
      } else {
        b = 0;
        i = ((cGx)localObject).getId();
      }

      dEC localdEC = new dEC(this.bYb.aUX().getId(), i, b);
      dmn localdmn;
      if (b == -1) {
        for (localdmn = this.lzE.yF(); localdmn.hasNext(); ) {
          localdmn.fl();
          localdEC.I(localdmn.zY(), ((agi)localdmn.value()).nP());
        }
      }
      byv.bFN().aJK().d(localdEC);
    }
    dLE.doY().t("craftRunning", Boolean.valueOf(true));
  }

  public cGx daJ() {
    for (dmn localdmn = DA.bIr.eD(this.bYb.aER()).cPi(); localdmn.hasNext(); ) {
      localdmn.fl();
      cGx localcGx = (cGx)localdmn.value();
      if (localcGx.c(yK.bso))
      {
        int i = 1;
        for (BZ localBZ = localcGx.cBy(); localBZ.hasNext(); ) {
          localBZ.fl();
          agi localagi = (agi)this.lzE.get(localBZ.zY());
          if ((localagi == null) || (localagi.nP() != localBZ.Lb())) {
            i = 0;
            break;
          }

        }

        if (i != 0) {
          return localcGx;
        }
      }
    }
    return null;
  }

  public int daK() {
    for (dmn localdmn = DA.bIr.eD(this.bYb.aER()).cPi(); localdmn.hasNext(); ) {
      localdmn.fl();
      cGx localcGx = (cGx)localdmn.value();
      if (localcGx.c(yK.bso))
      {
        int i = 1;
        for (BZ localBZ = localcGx.cBy(); localBZ.hasNext(); ) {
          localBZ.fl();
          agi localagi = (agi)this.lzE.get(localBZ.zY());
          if ((localagi == null) || (localagi.nP() != localBZ.Lb())) {
            i = 0;
            break;
          }

        }

        if (i != 0)
          return localcGx.getId();
      }
    }
    return -1;
  }

  private void a(cfm paramcfm) {
    cWq localcWq = (cWq)this.buE.fi("recipeList");
    axU localaxU = (axU)localcWq.getRenderables().get(localcWq.getItemIndex(paramcfm));
    ccG localccG = (ccG)localaxU.getInnerElementMap().fi("ingredientList");
    for (Iterator localIterator = localccG.getItems().iterator(); localIterator.hasNext(); ) { Object localObject = localIterator.next();
      agi localagi = (agi)localObject;
      if (!localagi.arF()) {
        czv localczv = (czv)localccG.getRenderableByOffset(localccG.getItemIndex(localagi)).getInnerElementMap().fi("icon");
        bNa localbNa1 = new bNa(1.0F, 0.5F, 0.5F, 1.0F);

        bNa localbNa2 = localczv.getModulationColor();

        gm localgm = new gm(localbNa1, localbNa2, localczv, 0, 250, 3, ddp.kWG);

        localczv.a(localgm);
      }
    }
  }

  public void f(deT paramdeT)
  {
    throw new UnsupportedOperationException("aucune raison de notifier la crafttableFrame d'un métier appris");
  }

  public void b(int paramInt, long paramLong) {
    byz localbyz = byv.bFN().bFO();
    long l1 = localbyz.aTn().ll(paramInt);
    long l2 = l1 - paramLong;
    if (Et.bq(l1) != Et.bq(l2)) {
      localbyz.bGA();
      this.bYb.aVe();
    }
    dLE.doY().a(this.bYb, new String[] { "currentXpPercentage", "level", "levelText" });
  }

  public void cj(int paramInt1, int paramInt2) {
  }

  public void qq(String paramString) {
    if (this.gOJ == null) {
      return;
    }
    cag localcag = new cag();
    localcag.aJ();
    localcag.setAlignment(aFG.eck);
    localcag.setLevel(1);
    localcag.setFile(paramString);
    localcag.setUseParentScissor(true);
    localcag.setRemovable(false);
    this.gOJ.getAppearance().a(localcag);
  }

  public int axX() {
    return this.bYb.aER();
  }

  public void kE(boolean paramBoolean) {
    byv.bFN().bFO().aTn().li(lzD.axX());
    qq(paramBoolean ? "6001045.xps" : "6001038.xps");
    daD();
  }

  public void a(bNK parambNK) {
    if (parambNK == this.bYb.aUX())
      byv.bFN().b(this);
  }

  public void a(dMM paramdMM, cuB paramcuB)
  {
    byv.bFN().b(lzD);
  }
}