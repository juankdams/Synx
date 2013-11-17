import java.util.Stack;

public class aWf
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
    localJg.bb(localaen);
    localaen.brn();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localaAR.setPosition(ajb.dhZ);
    localaAR.setX(404);
    localaAR.setY(296);
    localaAR.setWidth(575);
    localaAR.setHeight(94);
    localaAR.setTexture(this.W.aH("dungeonLadder_0.tga"));
    localaen.bb(localaAR);
    localaAR.brn();
    localaAR.rV();
    localaen.rV();
    localJg.rV();
  }
}