import java.util.Stack;

public class aCz
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
    ((cwJ)localJg).setAlignment(aFG.eck);
    localJg.setState("default");
    paramdOc.bb(localJg);
    localJg.brn();
    bJA localbJA = bJA.checkOut();
    localbJA.setRenderer(cBQ.cxL().bSM().aI("defaultFont"));
    localbJA.setElementMap(localcpa);
    localJg.bb(localbJA);
    localbJA.brn();
    localbJA.rV();
    String str1 = "defaultDarkColor";
    cAf localcAf = cAf.checkOut();
    localcAf.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localcAf);
    localcAf.setColor(new bNa(0.29F, 0.17F, 0.07F, 1.0F));
    localJg.bb(localcAf);
    localcAf.brn();
    localcAf.rV();
    String str2 = "windowsLabelBackground";
    aen localaen = aen.checkOut();
    localaen.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localaen);
    localaen.setScaled(true);
    localJg.bb(localaen);
    localaen.brn();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localaAR.setPosition(ajb.dhZ);
    localaAR.setX(176);
    localaAR.setY(140);
    localaAR.setWidth(20);
    localaAR.setHeight(5);
    localaAR.setTexture(this.W.aH("default_1.tga"));
    localaen.bb(localaAR);
    localaAR.brn();
    localaAR.rV();
    localaen.rV();
    localJg.rV();
  }
}