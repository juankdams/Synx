import java.util.Stack;

public class mP
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
    ((cwJ)localJg1).setAlignment(aFG.eck);
    localJg1.setState("default");
    paramdOc.bb(localJg1);
    localJg1.brn();
    aAR localaAR1 = aAR.checkOut();
    localaAR1.setElementMap(localcpa);
    localaAR1.setPosition(ajb.dhZ);
    localaAR1.setX(157);
    localaAR1.setY(450);
    localaAR1.setWidth(27);
    localaAR1.setHeight(27);
    localaAR1.setTexture(this.W.aH("mru_0.tga"));
    localJg1.bb(localaAR1);
    localaAR1.brn();
    localaAR1.rV();
    localJg1.rV();
    dOc localdOc2 = paramdOc;
    Jg localJg2 = localdOc2.getAppearance();
    localJg2.setElementMap(localcpa);
    ((cwJ)localJg2).setAlignment(aFG.eck);
    localJg2.setState("mouseHover");
    paramdOc.bb(localJg2);
    localJg2.brn();
    aAR localaAR2 = aAR.checkOut();
    localaAR2.setElementMap(localcpa);
    localaAR2.setPosition(ajb.dhZ);
    localaAR2.setX(362);
    localaAR2.setY(303);
    localaAR2.setWidth(27);
    localaAR2.setHeight(27);
    localaAR2.setTexture(this.W.aH("mru_0.tga"));
    localJg2.bb(localaAR2);
    localaAR2.brn();
    localaAR2.rV();
    localJg2.rV();
    dOc localdOc3 = paramdOc;
    Jg localJg3 = localdOc3.getAppearance();
    localJg3.setElementMap(localcpa);
    ((cwJ)localJg3).setAlignment(aFG.eck);
    localJg3.setState("pressed");
    paramdOc.bb(localJg3);
    localJg3.brn();
    aAR localaAR3 = aAR.checkOut();
    localaAR3.setElementMap(localcpa);
    localaAR3.setPosition(ajb.dhZ);
    localaAR3.setX(157);
    localaAR3.setY(450);
    localaAR3.setWidth(27);
    localaAR3.setHeight(27);
    localaAR3.setTexture(this.W.aH("mru_0.tga"));
    localJg3.bb(localaAR3);
    localaAR3.brn();
    localaAR3.rV();
    localJg3.rV();
    dOc localdOc4 = paramdOc;
    Jg localJg4 = localdOc4.getAppearance();
    localJg4.setElementMap(localcpa);
    ((cwJ)localJg4).setAlignment(aFG.eck);
    localJg4.setState("disabled");
    paramdOc.bb(localJg4);
    localJg4.brn();
    aAR localaAR4 = aAR.checkOut();
    localaAR4.setElementMap(localcpa);
    localaAR4.setPosition(ajb.dhZ);
    localaAR4.setX(392);
    localaAR4.setY(393);
    localaAR4.setWidth(27);
    localaAR4.setHeight(27);
    localaAR4.setTexture(this.W.aH("mru_0.tga"));
    localJg4.bb(localaAR4);
    localaAR4.brn();
    localaAR4.rV();
    localJg4.rV();
  }
}