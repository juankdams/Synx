import java.util.Stack;

public class dmZ
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
    ((cwJ)localJg).setAlignment(aFG.ecj);
    paramdOc.bb(localJg);
    localJg.brn();
    bJA localbJA = bJA.checkOut();
    localbJA.setRenderer(cBQ.cxL().bSM().aI("defaultFont11"));
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
    localJg.rV();
  }
}