import java.util.Stack;

public class cnN
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
    aen localaen1 = aen.checkOut();
    localaen1.setElementMap(localcpa);
    localaen1.setScaled(true);
    localJg1.bb(localaen1);
    localaen1.brn();
    String str1 = "fightBarButtonDefaultPixmap";
    aAR localaAR1 = aAR.checkOut();
    localaAR1.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localaAR1);
    localaAR1.setPosition(ajb.dhZ);
    localaAR1.setX(988);
    localaAR1.setY(454);
    localaAR1.setWidth(33);
    localaAR1.setHeight(35);
    localaAR1.setTexture(this.W.aH("default_0.tga"));
    localaen1.bb(localaAR1);
    localaAR1.brn();
    localaAR1.rV();
    localaen1.rV();
    localJg1.rV();
    dOc localdOc2 = paramdOc;
    Jg localJg2 = localdOc2.getAppearance();
    localJg2.setElementMap(localcpa);
    localJg2.setState("pressed");
    paramdOc.bb(localJg2);
    localJg2.brn();
    aen localaen2 = aen.checkOut();
    localaen2.setElementMap(localcpa);
    localaen2.setScaled(true);
    localJg2.bb(localaen2);
    localaen2.brn();
    String str2 = "fightBarButtonPressedPixmap";
    aAR localaAR2 = aAR.checkOut();
    localaAR2.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localaAR2);
    localaAR2.setPosition(ajb.dhZ);
    localaAR2.setX(171);
    localaAR2.setY(213);
    localaAR2.setWidth(33);
    localaAR2.setHeight(35);
    localaAR2.setTexture(this.W.aH("default_0.tga"));
    localaen2.bb(localaAR2);
    localaAR2.brn();
    localaAR2.rV();
    localaen2.rV();
    localJg2.rV();
    dOc localdOc3 = paramdOc;
    Jg localJg3 = localdOc3.getAppearance();
    localJg3.setElementMap(localcpa);
    localJg3.setState("mouseHover");
    paramdOc.bb(localJg3);
    localJg3.brn();
    aen localaen3 = aen.checkOut();
    localaen3.setElementMap(localcpa);
    localaen3.setScaled(true);
    localJg3.bb(localaen3);
    localaen3.brn();
    String str3 = "fightBarButtonOverPixmap";
    aAR localaAR3 = aAR.checkOut();
    localaAR3.setElementMap(localcpa);
    if ((localcpa != null) && (str3 != null))
      localcpa.a(str3, localaAR3);
    localaAR3.setPosition(ajb.dhZ);
    localaAR3.setX(443);
    localaAR3.setY(251);
    localaAR3.setWidth(33);
    localaAR3.setHeight(35);
    localaAR3.setTexture(this.W.aH("default_0.tga"));
    localaen3.bb(localaAR3);
    localaAR3.brn();
    localaAR3.rV();
    localaen3.rV();
    localJg3.rV();
    dOc localdOc4 = paramdOc;
    Jg localJg4 = localdOc4.getAppearance();
    localJg4.setElementMap(localcpa);
    localJg4.setState("disabled");
    paramdOc.bb(localJg4);
    localJg4.brn();
    aen localaen4 = aen.checkOut();
    localaen4.setElementMap(localcpa);
    localaen4.setScaled(true);
    localJg4.bb(localaen4);
    localaen4.brn();
    String str4 = "fightBarButtonDisabledPixmap";
    aAR localaAR4 = aAR.checkOut();
    localaAR4.setElementMap(localcpa);
    if ((localcpa != null) && (str4 != null))
      localcpa.a(str4, localaAR4);
    localaAR4.setPosition(ajb.dhZ);
    localaAR4.setX(760);
    localaAR4.setY(453);
    localaAR4.setWidth(33);
    localaAR4.setHeight(35);
    localaAR4.setTexture(this.W.aH("default_0.tga"));
    localaen4.bb(localaAR4);
    localaAR4.brn();
    localaAR4.rV();
    localaen4.rV();
    localJg4.rV();
    dOc localdOc5 = paramdOc;
    Jg localJg5 = localdOc5.getAppearance();
    localJg5.setElementMap(localcpa);
    localJg5.setState("selected");
    paramdOc.bb(localJg5);
    localJg5.brn();
    aen localaen5 = aen.checkOut();
    localaen5.setElementMap(localcpa);
    localaen5.setScaled(true);
    localJg5.bb(localaen5);
    localaen5.brn();
    String str5 = "fightBarButtonSelectedPixmap";
    aAR localaAR5 = aAR.checkOut();
    localaAR5.setElementMap(localcpa);
    if ((localcpa != null) && (str5 != null))
      localcpa.a(str5, localaAR5);
    localaAR5.setPosition(ajb.dhZ);
    localaAR5.setX(112);
    localaAR5.setY(213);
    localaAR5.setWidth(33);
    localaAR5.setHeight(35);
    localaAR5.setTexture(this.W.aH("default_0.tga"));
    localaen5.bb(localaAR5);
    localaAR5.brn();
    localaAR5.rV();
    localaen5.rV();
    localJg5.rV();
    dOc localdOc6 = paramdOc;
    Jg localJg6 = localdOc6.getAppearance();
    localJg6.setElementMap(localcpa);
    localJg6.setState("pressedSelected");
    paramdOc.bb(localJg6);
    localJg6.brn();
    aen localaen6 = aen.checkOut();
    localaen6.setElementMap(localcpa);
    localaen6.setScaled(true);
    localJg6.bb(localaen6);
    localaen6.brn();
    String str6 = "fightBarButtonSelectedPressedPixmap";
    aAR localaAR6 = aAR.checkOut();
    localaAR6.setElementMap(localcpa);
    if ((localcpa != null) && (str6 != null))
      localcpa.a(str6, localaAR6);
    localaAR6.setPosition(ajb.dhZ);
    localaAR6.setX(171);
    localaAR6.setY(213);
    localaAR6.setWidth(33);
    localaAR6.setHeight(35);
    localaAR6.setTexture(this.W.aH("default_0.tga"));
    localaen6.bb(localaAR6);
    localaAR6.brn();
    localaAR6.rV();
    localaen6.rV();
    localJg6.rV();
    dOc localdOc7 = paramdOc;
    Jg localJg7 = localdOc7.getAppearance();
    localJg7.setElementMap(localcpa);
    localJg7.setState("mouseHoverSelected");
    paramdOc.bb(localJg7);
    localJg7.brn();
    aen localaen7 = aen.checkOut();
    localaen7.setElementMap(localcpa);
    localaen7.setScaled(true);
    localJg7.bb(localaen7);
    localaen7.brn();
    String str7 = "fightBarButtonSelectedOverPixmap";
    aAR localaAR7 = aAR.checkOut();
    localaAR7.setElementMap(localcpa);
    if ((localcpa != null) && (str7 != null))
      localcpa.a(str7, localaAR7);
    localaAR7.setPosition(ajb.dhZ);
    localaAR7.setX(6);
    localaAR7.setY(250);
    localaAR7.setWidth(33);
    localaAR7.setHeight(35);
    localaAR7.setTexture(this.W.aH("default_0.tga"));
    localaen7.bb(localaAR7);
    localaAR7.brn();
    localaAR7.rV();
    localaen7.rV();
    localJg7.rV();
    dOc localdOc8 = paramdOc;
    Jg localJg8 = localdOc8.getAppearance();
    localJg8.setElementMap(localcpa);
    localJg8.setState("disabledSelected");
    paramdOc.bb(localJg8);
    localJg8.brn();
    aen localaen8 = aen.checkOut();
    localaen8.setElementMap(localcpa);
    localaen8.setScaled(true);
    localJg8.bb(localaen8);
    localaen8.brn();
    String str8 = "fightBarButtonSelectedDisabledPixmap";
    aAR localaAR8 = aAR.checkOut();
    localaAR8.setElementMap(localcpa);
    if ((localcpa != null) && (str8 != null))
      localcpa.a(str8, localaAR8);
    localaAR8.setPosition(ajb.dhZ);
    localaAR8.setX(523);
    localaAR8.setY(251);
    localaAR8.setWidth(33);
    localaAR8.setHeight(35);
    localaAR8.setTexture(this.W.aH("default_0.tga"));
    localaen8.bb(localaAR8);
    localaAR8.brn();
    localaAR8.rV();
    localaen8.rV();
    localJg8.rV();
  }
}