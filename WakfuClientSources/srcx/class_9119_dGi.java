import java.util.Stack;

public class dGi
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
    aVT localaVT = aVT.checkOut();
    localaVT.setElementMap(localcpa);
    localJg.bb(localaVT);
    localaVT.brn();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localaAR.setPosition(ajb.dhZ);
    localaAR.setX(443);
    localaAR.setY(82);
    localaAR.setWidth(399);
    localaAR.setHeight(27);
    localaAR.setTexture(this.W.aH("default_0.tga"));
    localaVT.bb(localaAR);
    localaAR.brn();
    localaAR.rV();
    localaVT.rV();
    localJg.rV();
  }
}