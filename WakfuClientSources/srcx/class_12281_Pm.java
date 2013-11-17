import java.util.Collections;
import org.apache.log4j.Logger;

public class Pm
  implements bSX, bbk, cvW
{
  protected static final Logger K = Logger.getLogger(Pm.class);

  private static final Pm cha = new Pm();
  static final int chb = 250;
  private static final byte chc = 1;
  private static final String chd = "progressBar";
  private static final String che = "startButton";
  private bnm N;
  cMb chf;
  private bwe chg;
  private cpa buE;
  gA chh;
  gA chi;

  private Pm()
  {
    this.chf = null;
  }

  public void abg() {
    byz localbyz = byv.bFN().bFO();
    localbyz.ayJ().d(this);
    for (cHu localcHu = localbyz.bGP().cEg(); localcHu.hasNext(); ) {
      localcHu.fl();
      ((cRs)localcHu.value()).d(this);
    }
    abh();

    l(null);
    k(null);
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
    dLE.doY().removeProperty("removeGem.item");
    dLE.doY().removeProperty("removeGem.destroyedItem");
    dLE.doY().removeProperty("removeGem.destroyableItems");

    this.chh = null;
    this.chi = null;
  }

  public void i(boolean paramBoolean1, boolean paramBoolean2) {
    String str = paramBoolean1 ? "gemmedItem" : "destroyedItem";
    axU localaxU = (axU)this.buE.fi(str);
    dOc localdOc = (dOc)localaxU.getInnerElementMap().fi("ingredientBackgroundContainer");
    localdOc.setStyle(paramBoolean2 ? "itemSelectedBackground" : "itemBackground");
  }

  private void abi()
  {
    Object localObject;
    if (this.chh == null) {
      localObject = Collections.emptyList();
    } else {
      bMD localbMD = byv.bFN().bFO().bGP();
      localObject = localbMD.b(this.chh.ok(), new daH(this.chh.oj(), true));
    }

    dLE.doY().t("removeGem.destroyableItems", localObject);
  }

  private void k(gA paramgA) {
    this.chi = paramgA;
    dLE.doY().t("removeGem.destroyedItem", paramgA);
  }

  private void l(gA paramgA) {
    this.chh = paramgA;
    dLE.doY().t("removeGem.item", this.chh);

    abi();
    k(null);
  }

  public void a(cRs paramcRs) {
    paramcRs.d(this);
  }

  public void b(cRs paramcRs) {
    paramcRs.c(this);
  }

  public void a(bNz parambNz) {
    switch (Hf.aOs[parambNz.bVg().ordinal()]) {
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
      bMD localbMD = byv.bFN().bFO().bGP();
      if ((this.chh != null) && (!localbMD.N(this.chh.oj()))) {
        l(null);
      }

      if ((this.chi != null) && (!localbMD.N(this.chi.oj())))
        k(null); break;
    }
  }

  public boolean a(cWG paramcWG)
  {
    if (PO.g(paramcWG))
      return false;
    Object localObject1;
    Object localObject2;
    boolean bool1;
    switch (paramcWG.getId())
    {
    case 16846:
      localObject1 = (afk)paramcWG;
      long l1 = ((afk)localObject1).ah();
      boolean bool2 = ((afk)localObject1).getBooleanValue();

      if (bool2) {
        if ((this.chh != null) && (this.chh.oj() == l1)) {
          l(null);
        }
      }
      else if ((this.chi != null) && (this.chi.oj() == l1)) {
        k(null);
      }

      i(bool2, true);
      return false;
    case 16845:
      if (dLE.doY().getBooleanProperty("removeGem.running")) {
        return false;
      }

      localObject1 = (czW)paramcWG;
      localObject2 = ((czW)localObject1).getItem();
      bool1 = ((czW)localObject1).getBooleanValue();

      if (bool1) {
        if (localObject2 != this.chh) {
          return false;
        }
        l(null);
      } else {
        if (localObject2 != this.chi) {
          return false;
        }
        k(null);
      }

      dLE.doY().a((dBv)localObject2, new String[] { "usedInCurrentRecipe" });

      return false;
    case 16844:
      localObject1 = (czW)paramcWG;
      localObject2 = ((czW)localObject1).getItem();
      bool1 = ((czW)localObject1).getBooleanValue();

      if (dLE.doY().getBooleanProperty("removeGem.running")) {
        return false;
      }

      long l2 = ((gA)localObject2).oj();
      if (!bR(l2)) {
        return false;
      }

      if (bool1) {
        if (!((gA)localObject2).nN()) {
          return false;
        }
        l((gA)localObject2);
      } else {
        if (((gA)localObject2).ok() != this.chh.ok()) {
          return false;
        }
        if (localObject2 == this.chh) {
          return false;
        }
        k((gA)localObject2);
      }

      dLE.doY().a((dBv)localObject2, new String[] { "usedInCurrentRecipe" });
      i(bool1, false);

      return false;
    case 16840:
      localObject1 = (bKY)paramcWG;

      if ((this.chh != null) && (this.chi != null)) {
        localObject2 = cBQ.cxL().a(bU.fH().getString("question.confirmRemoveGem"), Cn.et(0), 2073L, 102, 1);

        ((cKX)localObject2).a(new Hk(this, (bKY)localObject1));
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

  public void abj()
  {
    cpa localcpa = cBQ.cxL().coO().nf("removeGemDialog");
    if (localcpa != null) {
      alP localalP = (alP)localcpa.fi("progressBar");
      br localbr = (br)localcpa.fi("startButton");

      cag localcag = new cag();
      localcag.aJ();
      localcag.setAlignment(aFG.eck);
      localcag.setLevel(1);
      localcag.setFile("6001038.xps");
      localcag.setUseParentScissor(true);
      localcag.setRemovable(false);
      localbr.getAppearance().a(localcag);

      localalP.setTweenDuration(0L);
      localalP.setValue(0.0F);
    }

    if ((this.chh != null) && (!this.chh.nN())) {
      l(null);
    }
    dLE.doY().t("removeGem.running", Boolean.valueOf(false));
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      byz localbyz = byv.bFN().bFO();

      this.chg = new Hg(this);

      localbyz.aeL().a(this.chg);

      this.N = new Hi(this);

      cBQ.cxL().a(this.N);

      abg();

      aNL localaNL = cBQ.cxL().a("removeGemDialog", VV.dJ("removeGemDialog"), 32768L, (short)10000);

      if (localaNL != null) {
        this.buE = localaNL.getElementMap();
      }

      cBQ.cxL().j("wakfu.removeGem", aQs.class);

      dLE.doY().t("removeGem.running", Boolean.valueOf(false));
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      byv.bFN().bFO().aeL().b(this.chg);
      this.chg = null;
      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("removeGemDialog");

      cBQ.cxL().mN("wakfu.removeGem");

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

  public static Pm abk() {
    return cha;
  }
}