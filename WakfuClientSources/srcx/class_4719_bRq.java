import java.util.Stack;

public class bRq
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
    localaVT.setHorizontal(false);
    localJg.bb(localaVT);
    localaVT.brn();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localaAR.setPosition(ajb.dhZ);
    localaAR.setX(2);
    localaAR.setY(200);
    localaAR.setWidth(450);
    localaAR.setHeight(310);
    localaAR.setTexture(this.W.aH("scroll_0.tga"));
    localaVT.bb(localaAR);
    localaAR.brn();
    localaAR.rV();
    localaVT.rV();
    localJg.rV();
  }
}