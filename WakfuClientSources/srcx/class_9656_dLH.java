import java.util.Stack;

public class dLH
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
    paramdOc.bb(localJg);
    localJg.brn();
    cAf localcAf = cAf.checkOut();
    localcAf.setElementMap(localcpa);
    localcAf.setColor(new bNa(0.9F, 0.9F, 0.9F, 1.0F));
    localcAf.setName("progressBar");
    localJg.bb(localcAf);
    localcAf.brn();
    localcAf.rV();
    localJg.rV();
  }
}