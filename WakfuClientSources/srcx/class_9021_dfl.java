import java.util.Stack;

public class dfl
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
    String str = "defaultLightColor";
    cAf localcAf = cAf.checkOut();
    localcAf.setElementMap(localcpa);
    if ((localcpa != null) && (str != null))
      localcpa.a(str, localcAf);
    localcAf.setColor(new bNa(1.0F, 1.0F, 1.0F, 1.0F));
    localJg.bb(localcAf);
    localcAf.brn();
    localcAf.rV();
    bJA localbJA = bJA.checkOut();
    localbJA.setRenderer(cBQ.cxL().bSM().aI("defaultBorderedFont"));
    localbJA.setElementMap(localcpa);
    localJg.bb(localbJA);
    localbJA.brn();
    localbJA.rV();
    localJg.rV();
  }
}