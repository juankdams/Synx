import java.util.Stack;

public class bed
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
    localaAR.setPosition(ajb.dhZ);
    localaAR.setRotation(bOo.gTv);
    localaAR.setX(379);
    localaAR.setY(140);
    localaAR.setWidth(13);
    localaAR.setHeight(6);
    localaAR.setTexture(this.W.aH("default_1.tga"));
    localJg2.bb(localaAR);
    localaAR.brn();
    localaAR.rV();
    localJg2.rV();
    localJg1.rV();
  }
}