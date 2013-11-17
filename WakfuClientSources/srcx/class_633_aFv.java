import java.util.Stack;

public class aFv
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
    jO localjO = new jO();
    localjO.aJ();
    localjO.setElementMap(localcpa);
    localJg.bb(localjO);
    localjO.brn();
    cAf localcAf = cAf.checkOut();
    localcAf.setElementMap(localcpa);
    localcAf.setColor(new bNa(0.3F, 0.3F, 0.3F, 0.3F));
    localjO.bb(localcAf);
    localcAf.brn();
    localcAf.rV();
    localjO.rV();
    localJg.rV();
  }
}