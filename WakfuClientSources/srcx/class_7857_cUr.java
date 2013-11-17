import java.awt.Insets;
import java.util.Stack;

public class cUr
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
    localcuR.setInsets(new Insets(1, 1, 1, 1));
    paramdOc.bb(localcuR);
    localcuR.brn();
    localcuR.rV();
    dOc localdOc2 = paramdOc;
    Jg localJg1 = localdOc2.getAppearance();
    localJg1.setElementMap(localcpa);
    localJg1.setState("default");
    paramdOc.bb(localJg1);
    localJg1.brn();
    aAR localaAR1 = aAR.checkOut();
    localaAR1.setElementMap(localcpa);
    localaAR1.setX(1010);
    localaAR1.setY(3);
    localaAR1.setWidth(10);
    localaAR1.setHeight(8);
    localaAR1.setTexture(this.W.aH("default_0.tga"));
    localJg1.bb(localaAR1);
    localaAR1.brn();
    localaAR1.rV();
    localJg1.rV();
    dOc localdOc3 = paramdOc;
    Jg localJg2 = localdOc3.getAppearance();
    localJg2.setElementMap(localcpa);
    localJg2.setState("mouseHover");
    paramdOc.bb(localJg2);
    localJg2.brn();
    aAR localaAR2 = aAR.checkOut();
    localaAR2.setElementMap(localcpa);
    localaAR2.setX(353);
    localaAR2.setY(3);
    localaAR2.setWidth(10);
    localaAR2.setHeight(8);
    localaAR2.setTexture(this.W.aH("default_0.tga"));
    localJg2.bb(localaAR2);
    localaAR2.brn();
    localaAR2.rV();
    localJg2.rV();
    dOc localdOc4 = paramdOc;
    Jg localJg3 = localdOc4.getAppearance();
    localJg3.setElementMap(localcpa);
    localJg3.setState("pressed");
    paramdOc.bb(localJg3);
    localJg3.brn();
    aAR localaAR3 = aAR.checkOut();
    localaAR3.setElementMap(localcpa);
    localaAR3.setX(1006);
    localaAR3.setY(82);
    localaAR3.setWidth(10);
    localaAR3.setHeight(8);
    localaAR3.setTexture(this.W.aH("default_0.tga"));
    localJg3.bb(localaAR3);
    localaAR3.brn();
    localaAR3.rV();
    localJg3.rV();
  }
}