import java.util.Stack;

public class bwM
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
    localaAR1.setPosition(ajb.dhZ);
    localaAR1.setRotation(bOo.gTw);
    localaAR1.setX(574);
    localaAR1.setY(178);
    localaAR1.setWidth(35);
    localaAR1.setHeight(31);
    localaAR1.setTexture(this.W.aH("default_0.tga"));
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
    localaAR2.setPosition(ajb.dhZ);
    localaAR2.setRotation(bOo.gTw);
    localaAR2.setX(403);
    localaAR2.setY(178);
    localaAR2.setWidth(35);
    localaAR2.setHeight(31);
    localaAR2.setTexture(this.W.aH("default_0.tga"));
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
    localaAR3.setPosition(ajb.dhZ);
    localaAR3.setRotation(bOo.gTw);
    localaAR3.setX(613);
    localaAR3.setY(178);
    localaAR3.setWidth(35);
    localaAR3.setHeight(31);
    localaAR3.setTexture(this.W.aH("default_0.tga"));
    localJg3.bb(localaAR3);
    localaAR3.brn();
    localaAR3.rV();
    localJg3.rV();
    dOc localdOc4 = paramdOc;
    Jg localJg4 = localdOc4.getAppearance();
    localJg4.setElementMap(localcpa);
    localJg4.setState("disabled");
    paramdOc.bb(localJg4);
    localJg4.brn();
    aAR localaAR4 = aAR.checkOut();
    localaAR4.setElementMap(localcpa);
    localaAR4.setPosition(ajb.dhZ);
    localaAR4.setRotation(bOo.gTw);
    localaAR4.setX(897);
    localaAR4.setY(178);
    localaAR4.setWidth(35);
    localaAR4.setHeight(31);
    localaAR4.setTexture(this.W.aH("default_0.tga"));
    localJg4.bb(localaAR4);
    localaAR4.brn();
    localaAR4.rV();
    localJg4.rV();
    dOc localdOc5 = paramdOc;
    Jg localJg5 = localdOc5.getAppearance();
    localJg5.setElementMap(localcpa);
    localJg5.setState("selected");
    paramdOc.bb(localJg5);
    localJg5.brn();
    aAR localaAR5 = aAR.checkOut();
    localaAR5.setElementMap(localcpa);
    localaAR5.setPosition(ajb.dhZ);
    localaAR5.setRotation(bOo.gTw);
    localaAR5.setX(963);
    localaAR5.setY(178);
    localaAR5.setWidth(35);
    localaAR5.setHeight(31);
    localaAR5.setTexture(this.W.aH("default_0.tga"));
    localJg5.bb(localaAR5);
    localaAR5.brn();
    localaAR5.rV();
    localJg5.rV();
    dOc localdOc6 = paramdOc;
    Jg localJg6 = localdOc6.getAppearance();
    localJg6.setElementMap(localcpa);
    localJg6.setState("mouseHoverSelected");
    paramdOc.bb(localJg6);
    localJg6.brn();
    aAR localaAR6 = aAR.checkOut();
    localaAR6.setElementMap(localcpa);
    localaAR6.setPosition(ajb.dhZ);
    localaAR6.setRotation(bOo.gTw);
    localaAR6.setX(963);
    localaAR6.setY(178);
    localaAR6.setWidth(35);
    localaAR6.setHeight(31);
    localaAR6.setTexture(this.W.aH("default_0.tga"));
    localJg6.bb(localaAR6);
    localaAR6.brn();
    localaAR6.rV();
    localJg6.rV();
    dOc localdOc7 = paramdOc;
    Jg localJg7 = localdOc7.getAppearance();
    localJg7.setElementMap(localcpa);
    localJg7.setState("pressedSelected");
    paramdOc.bb(localJg7);
    localJg7.brn();
    aAR localaAR7 = aAR.checkOut();
    localaAR7.setElementMap(localcpa);
    localaAR7.setPosition(ajb.dhZ);
    localaAR7.setRotation(bOo.gTw);
    localaAR7.setX(963);
    localaAR7.setY(178);
    localaAR7.setWidth(35);
    localaAR7.setHeight(31);
    localaAR7.setTexture(this.W.aH("default_0.tga"));
    localJg7.bb(localaAR7);
    localaAR7.brn();
    localaAR7.rV();
    localJg7.rV();
    dOc localdOc8 = paramdOc;
    Jg localJg8 = localdOc8.getAppearance();
    localJg8.setElementMap(localcpa);
    localJg8.setState("disabledSelected");
    paramdOc.bb(localJg8);
    localJg8.brn();
    aAR localaAR8 = aAR.checkOut();
    localaAR8.setElementMap(localcpa);
    localaAR8.setPosition(ajb.dhZ);
    localaAR8.setRotation(bOo.gTw);
    localaAR8.setX(963);
    localaAR8.setY(178);
    localaAR8.setWidth(35);
    localaAR8.setHeight(31);
    localaAR8.setTexture(this.W.aH("default_0.tga"));
    localJg8.bb(localaAR8);
    localaAR8.brn();
    localaAR8.rV();
    localJg8.rV();
  }
}