import java.util.Stack;

public class bWf
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
    ((dil)localJg).setScaled(true);
    paramdOc.bb(localJg);
    localJg.brn();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localaAR.setPosition(ajb.dhZ);
    localaAR.setX(794);
    localaAR.setY(478);
    localaAR.setWidth(179);
    localaAR.setHeight(32);
    localaAR.setTexture(this.W.aH("dungeonLadder_0.tga"));
    localJg.bb(localaAR);
    localaAR.brn();
    localaAR.rV();
    localJg.rV();
  }
}