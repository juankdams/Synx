import java.util.Stack;

public class bVX
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
    ((drf)localJg).setAnimName("AnimStatique");
    ((drf)localJg).setDirection(3);
    ((drf)localJg).setFilePath("newCharacterAnim.anm");
    paramdOc.bb(localJg);
    localJg.brn();
    localJg.rV();
  }
}