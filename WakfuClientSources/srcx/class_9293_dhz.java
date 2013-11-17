import java.util.Stack;

public class dhz
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
    aen localaen = aen.checkOut();
    localaen.setElementMap(localcpa);
    localaen.setScaled(true);
    localJg.bb(localaen);
    localaen.brn();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localaAR.setPosition(ajb.dhZ);
    localaAR.setX(51);
    localaAR.setY(154);
    localaAR.setWidth(62);
    localaAR.setHeight(43);
    localaAR.setTexture(this.W.aH("scroll_0.tga"));
    localaen.bb(localaAR);
    localaAR.brn();
    localaAR.rV();
    localaen.rV();
    localJg.rV();
  }
}