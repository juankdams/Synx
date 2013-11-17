import java.util.Stack;

public class aTt
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
    ((drf)localJg).setAnimName("AnimReady");
    ((drf)localJg).setDirection(0);
    ((drf)localJg).setFilePath("readyForFight.anm");
    ((drf)localJg).setScale(1.0F);
    paramdOc.bb(localJg);
    localJg.brn();
    localJg.rV();
  }
}