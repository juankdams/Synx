import java.util.Stack;

public class bCg
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
    ((drf)localJg).setAnimName("AnimLoading_Sablier");
    ((drf)localJg).setDirection(0);
    ((drf)localJg).setFilePath("AnimLoading.anm");
    paramdOc.bb(localJg);
    localJg.brn();
    localJg.rV();
  }
}