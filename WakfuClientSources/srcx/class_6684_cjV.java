import java.util.Stack;

public class cjV
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
    Jg localJg1 = localdOc1.getAppearance();
    localJg1.setElementMap(localcpa);
    paramdOc.bb(localJg1);
    localJg1.brn();
    dOc localdOc2 = (dOc)localJg1.getParentOfType(dOc.class);
    Jg localJg2 = localdOc2.getAppearance();
    localJg2.setElementMap(localcpa);
    ((dil)localJg2).setScaled(true);
    localJg2.brn();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localaAR.setFlipVerticaly(true);
    localaAR.setPosition(ajb.dhZ);
    localaAR.setX(664);
    localaAR.setY(211);
    localaAR.setWidth(230);
    localaAR.setHeight(35);
    localaAR.setTexture(this.W.aH("default_0.tga"));
    localJg2.bb(localaAR);
    localaAR.brn();
    localaAR.rV();
    localJg2.rV();
    localJg1.rV();
  }
}