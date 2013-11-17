import java.util.Stack;

public class iQ
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
    ((cwJ)localJg).setAlign(aFG.eck);
    paramdOc.bb(localJg);
    localJg.brn();
    bJA localbJA = bJA.checkOut();
    localbJA.setRenderer(cBQ.cxL().bSM().aI("defaultBoldFont"));
    localbJA.setElementMap(localcpa);
    localJg.bb(localbJA);
    localbJA.brn();
    localbJA.rV();
    cAf localcAf = cAf.checkOut();
    localcAf.setElementMap(localcpa);
    localcAf.setColor(new bNa(0.29F, 0.17F, 0.07F, 0.75F));
    localJg.bb(localcAf);
    localcAf.brn();
    localcAf.rV();
    localJg.rV();
  }
}