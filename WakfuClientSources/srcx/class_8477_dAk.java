import java.util.Stack;

public class dAk
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
    localaAR.setX(403);
    localaAR.setY(429);
    localaAR.setWidth(49);
    localaAR.setHeight(49);
    localaAR.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR);
    localaAR.brn();
    localaAR.rV();
    localaen.rV();
    localJg.rV();
  }
}