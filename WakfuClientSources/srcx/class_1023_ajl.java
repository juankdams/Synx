import java.util.Stack;

public class ajl
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
    localJg1.setState("default");
    paramdOc.bb(localJg1);
    localJg1.brn();
    aAR localaAR1 = aAR.checkOut();
    localaAR1.setElementMap(localcpa);
    localaAR1.setFlipHorizontaly(true);
    localaAR1.setPosition(ajb.dhZ);
    localaAR1.setX(743);
    localaAR1.setY(261);
    localaAR1.setWidth(33);
    localaAR1.setHeight(26);
    localaAR1.setTexture(this.W.aH("map_0.tga"));
    localJg1.bb(localaAR1);
    localaAR1.brn();
    localaAR1.rV();
    localJg1.rV();
    dOc localdOc2 = paramdOc;
    Jg localJg2 = localdOc2.getAppearance();
    localJg2.setElementMap(localcpa);
    localJg2.setState("mouseHover");
    paramdOc.bb(localJg2);
    localJg2.brn();
    aAR localaAR2 = aAR.checkOut();
    localaAR2.setElementMap(localcpa);
    localaAR2.setFlipHorizontaly(true);
    localaAR2.setPosition(ajb.dhZ);
    localaAR2.setX(779);
    localaAR2.setY(261);
    localaAR2.setWidth(33);
    localaAR2.setHeight(26);
    localaAR2.setTexture(this.W.aH("map_0.tga"));
    localJg2.bb(localaAR2);
    localaAR2.brn();
    localaAR2.rV();
    localJg2.rV();
    dOc localdOc3 = paramdOc;
    Jg localJg3 = localdOc3.getAppearance();
    localJg3.setElementMap(localcpa);
    localJg3.setState("pressed");
    paramdOc.bb(localJg3);
    localJg3.brn();
    aAR localaAR3 = aAR.checkOut();
    localaAR3.setElementMap(localcpa);
    localaAR3.setFlipHorizontaly(true);
    localaAR3.setPosition(ajb.dhZ);
    localaAR3.setX(531);
    localaAR3.setY(247);
    localaAR3.setWidth(33);
    localaAR3.setHeight(26);
    localaAR3.setTexture(this.W.aH("map_0.tga"));
    localJg3.bb(localaAR3);
    localaAR3.brn();
    localaAR3.rV();
    localJg3.rV();
  }
}