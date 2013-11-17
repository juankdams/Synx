import java.util.Stack;

public class bXi
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
    ((cwJ)localJg).setAlign(aFG.ecj);
    localJg.setState("default");
    paramdOc.bb(localJg);
    localJg.brn();
    bJA localbJA = bJA.checkOut();
    localbJA.setRenderer(cBQ.cxL().bSM().aI("defaultSmallBoldFont"));
    localbJA.setElementMap(localcpa);
    localJg.bb(localbJA);
    localbJA.brn();
    localbJA.rV();
    String str = "defaultDarkColor";
    cAf localcAf = cAf.checkOut();
    localcAf.setElementMap(localcpa);
    if ((localcpa != null) && (str != null))
      localcpa.a(str, localcAf);
    localcAf.setColor(new bNa(0.29F, 0.17F, 0.07F, 1.0F));
    localJg.bb(localcAf);
    localcAf.brn();
    localcAf.rV();
    jO localjO = new jO();
    localjO.aJ();
    localjO.setElementMap(localcpa);
    localjO.setColor(new bNa(0.0F, 0.0F, 0.0F, 0.0F));
    localJg.bb(localjO);
    localjO.brn();
    localjO.rV();
    localJg.rV();
  }
}