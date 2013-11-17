import java.util.Stack;

public class bXv
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
    cAf localcAf1 = cAf.checkOut();
    localcAf1.setElementMap(localcpa);
    localcAf1.setColor(new bNa(0.29F, 0.17F, 0.07F, 0.75F));
    localJg.bb(localcAf1);
    localcAf1.brn();
    localcAf1.rV();
    cAf localcAf2 = cAf.checkOut();
    localcAf2.setElementMap(localcpa);
    localcAf2.setColor(new bNa(0.95F, 0.64F, 0.25F, 0.4F));
    localcAf2.setName("selection");
    localJg.bb(localcAf2);
    localcAf2.brn();
    localcAf2.rV();
    localJg.rV();
  }
}