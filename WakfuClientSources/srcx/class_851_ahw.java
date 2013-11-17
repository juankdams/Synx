import java.awt.Insets;
import java.util.Stack;

public class ahw
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
    ((dUa)localJg).setInnerBorder(new Insets(2, 0, 0, 0));
    paramdOc.bb(localJg);
    localJg.brn();
    cAf localcAf1 = cAf.checkOut();
    localcAf1.setElementMap(localcpa);
    localcAf1.setColor(new bNa(0.0F, 0.0F, 0.0F, 1.0F));
    localcAf1.setName("progressBarBorder");
    localJg.bb(localcAf1);
    localcAf1.brn();
    localcAf1.rV();
    cAf localcAf2 = cAf.checkOut();
    localcAf2.setElementMap(localcpa);
    localcAf2.setColor(new bNa(1.0F, 1.0F, 1.0F, 1.0F));
    localcAf2.setName("progressBar");
    localJg.bb(localcAf2);
    localcAf2.brn();
    localcAf2.rV();
    localJg.rV();
  }
}