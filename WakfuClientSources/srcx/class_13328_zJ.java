import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class zJ
  implements cvW
{
  protected static final Logger K = Logger.getLogger(zJ.class);

  private static final zJ buD = new zJ();
  private bnm N;
  private cpa buE;
  private bkx buF;
  private boolean buG;

  public static zJ IC()
  {
    return buD;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      if (this.buG) {
        byv.bFN().b(Rl.acN());
      }

      this.N = new ddd(this);

      cBQ.cxL().a(this.N);

      this.buE = cBQ.cxL().a("exchangeMachineDialog", VV.dJ("exchangeMachineDialog"), 1L, (short)10000).getElementMap();

      aWc.blo().eO(600012L);

      cBQ.cxL().j("wakfu.exchangeMachine", cey.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      this.buE = null;

      this.buF.bvs();
      this.buF = null;

      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("exchangeMachineDialog");

      dLE.doY().removeProperty("exchangeMachine");
      dLE.doY().removeProperty("selectedExchange");

      aWc.blo().eO(600013L);

      cBQ.cxL().mN("wakfu.exchangeMachine");

      if (this.buG)
        byv.bFN().a(Rl.acN());
    }
  }

  public boolean a(cWG paramcWG)
  {
    switch (paramcWG.getId()) {
    case 19992:
      if (this.buG) {
        return false;
      }
      return true;
    case 19341:
      QV localQV = (QV)paramcWG;
      long l = this.buF.bvt();
      int i = localQV.acC().aKQ().getId();
      dao localdao = new dao(l, i);
      byv.bFN().aJK().d(localdao);
      return false;
    }

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(ql paramql, String paramString) {
    a(0L, paramString, paramql, false, false);
  }

  public void a(cJR paramcJR) {
    a(paramcJR.getId(), paramcJR.getName(), paramcJR.cDK(), true, true);
  }

  private void a(long paramLong, String paramString, ql paramql, boolean paramBoolean1, boolean paramBoolean2) {
    this.buF = new bkx(paramLong, paramString, paramBoolean1, paramql);
    this.buF.bvr();
    this.buG = paramBoolean2;
    dLE.doY().t("exchangeMachine", this.buF);
    byv.bFN().a(this);
  }

  private void a(cfm paramcfm)
  {
    at localat = (at)this.buE.fi("recipeList");
    axU localaxU = (axU)localat.getRenderables().get(localat.getItemIndex(paramcfm));
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

  public void a(bNK parambNK)
  {
    if (parambNK.getId() == this.buF.bvt())
      byv.bFN().b(this);
  }

  public void a(dMM paramdMM, cuB paramcuB)
  {
    byv.bFN().b(duO.dax());
  }
}