import java.awt.Insets;
import java.util.Stack;

public class bJX
  implements aTK
{
  private uk W;
  private Stack X = new Stack();

  public void a(cpa paramcpa, uk paramuk, dOc paramdOc)
  {
    this.W = paramuk;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    dOc localdOc1 = paramdOc;
    dOc localdOc2 = paramdOc;
    Jg localJg = localdOc2.getAppearance();
    localJg.setElementMap(localcpa);
    paramdOc.bb(localJg);
    localJg.brn();
    jO localjO = new jO();
    localjO.aJ();
    localjO.setElementMap(localcpa);
    localJg.bb(localjO);
    localjO.brn();
    cAf localcAf1 = cAf.checkOut();
    localcAf1.setElementMap(localcpa);
    localcAf1.setColor(new bNa(1.0F, 1.0F, 1.0F, 1.0F));
    localjO.bb(localcAf1);
    localcAf1.brn();
    localcAf1.rV();
    localjO.rV();
    ams localams = new ams();
    localams.aJ();
    localams.setElementMap(localcpa);
    localams.setInsets(new Insets(0, 0, 0, 2));
    localJg.bb(localams);
    localams.brn();
    cAf localcAf2 = cAf.checkOut();
    localcAf2.setElementMap(localcpa);
    localcAf2.setColor(new bNa(0.0F, 0.0F, 0.0F, 1.0F));
    localams.bb(localcAf2);
    localcAf2.brn();
    localcAf2.rV();
    localams.rV();
    localJg.rV();
  }
}