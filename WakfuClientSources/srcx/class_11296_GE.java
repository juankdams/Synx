import java.util.Stack;

public class GE
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
    ((drf)localJg).setAnimName("AnimLoginRight");
    ((drf)localJg).setDirection(0);
    ((drf)localJg).setFilePath("loginAnim.anm");
    ((drf)localJg).setFlipVertical(true);
    ((drf)localJg).setOffsetX(0.0F);
    ((drf)localJg).setOffsetY(0.0F);
    ((drf)localJg).setScale(0.75F);
    paramdOc.bb(localJg);
    localJg.brn();
    localJg.rV();
  }
}