import java.util.ArrayList;

class cPW
  implements cjM
{
  private static final String kAY = "gemsList";
  private static final String kAZ = "slotImage";
  private static final String kBa = "gemImage";
  private static final int kBb = 500;

  public void al(gA paramgA)
  {
    if (paramgA == null) {
      return;
    }
    c(paramgA.oi().bKB());
  }

  public void clD() {
    cHb();
  }

  private static void cHb() {
    cpa localcpa = cBQ.cxL().coO().nf("gemItemDialog");
    if (localcpa == null) {
      return;
    }
    ccG localccG = (ccG)localcpa.fi("gemsList");
    ArrayList localArrayList = localccG.getItems();

    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      dOc localdOc1 = (dOc)localccG.getRenderableByOffset(i).getInnerElementMap().fi("slotImage");
      dOc localdOc2 = (dOc)localccG.getRenderableByOffset(i).getInnerElementMap().fi("gemImage");
      a(localdOc1, localdOc2, false);
    }
  }

  private static void c(aly paramaly) {
    cpa localcpa = cBQ.cxL().coO().nf("gemItemDialog");
    if (localcpa == null) {
      return;
    }
    ccG localccG = (ccG)localcpa.fi("gemsList");
    ArrayList localArrayList = localccG.getItems();

    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      bfk localbfk = (bfk)localArrayList.get(i);
      dOc localdOc1 = (dOc)localccG.getRenderableByOffset(i).getInnerElementMap().fi("slotImage");
      dOc localdOc2 = (dOc)localccG.getRenderableByOffset(i).getInnerElementMap().fi("gemImage");
      a(localdOc1, localdOc2, true);
    }
  }

  private static void a(dOc paramdOc1, dOc paramdOc2, boolean paramBoolean) {
    Jg localJg = paramdOc1.getAppearance();
    localJg.J(gm.class);

    if (paramBoolean) {
      localObject = new gm(bNa.gRx, bNa.gRE, localJg, 0, 500, -1, true, ddp.kWG);
      localJg.a((cKq)localObject);
    }

    Object localObject = paramdOc2.getAppearance();
    ((Jg)localObject).J(gm.class);

    if (paramBoolean) {
      gm localgm = new gm(bNa.gRx, bNa.gRu, localJg, 0, 500, -1, true, ddp.kWG);
      ((Jg)localObject).a(localgm);
    }
  }
}