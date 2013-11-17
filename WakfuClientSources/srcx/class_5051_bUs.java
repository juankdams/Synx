import java.util.Stack;

public class bUs
  implements aTK
{
  private uk W;
  private Stack X = new Stack();

  public void a(cpa paramcpa, uk paramuk, dOc paramdOc)
  {
    this.W = paramuk;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    dOc localdOc = paramdOc;
    Jg localJg = localdOc.getAppearance();
    localJg.setElementMap(localcpa);
    ((drf)localJg).setAnimName("AnimMiniMapLoading");
    ((drf)localJg).setDirection(0);
    ((drf)localJg).setFilePath("animMiniMapLoading.anm");
    ((drf)localJg).setOffsetX(-24.0F);
    ((drf)localJg).setOffsetY(-2.0F);
    ((drf)localJg).setScale(1.0F);
    paramdOc.bb(localJg);
    localJg.brn();
    localJg.rV();
  }
}