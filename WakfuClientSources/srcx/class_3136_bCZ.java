import java.awt.Insets;
import java.util.Stack;

public class bCZ
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
    cuR localcuR = new cuR();
    localcuR.aJ();
    localcuR.setElementMap(localcpa);
    localcuR.setInsets(new Insets(0, 0, 3, 0));
    paramdOc.bb(localcuR);
    localcuR.brn();
    localcuR.rV();
    dOc localdOc2 = paramdOc;
    Jg localJg = localdOc2.getAppearance();
    localJg.setElementMap(localcpa);
    ((cwJ)localJg).setAlignment(aFG.eck);
    localJg.setState("default");
    paramdOc.bb(localJg);
    localJg.brn();
    bJA localbJA = bJA.checkOut();
    localbJA.setRenderer(cBQ.cxL().bSM().aI("styleBoldTitleFont"));
    localbJA.setElementMap(localcpa);
    localJg.bb(localbJA);
    localbJA.brn();
    localbJA.rV();
    String str = "whiteColor";
    cAf localcAf = cAf.checkOut();
    localcAf.setElementMap(localcpa);
    if ((localcpa != null) && (str != null))
      localcpa.a(str, localcAf);
    localcAf.setColor(new bNa(1.0F, 1.0F, 1.0F, 1.0F));
    localJg.bb(localcAf);
    localcAf.brn();
    localcAf.rV();
    localJg.rV();
  }
}