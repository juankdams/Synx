import java.util.Stack;

public class bYm
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
    String str1 = "shortcutBarButtonDefaultPixmap";
    aAR localaAR1 = aAR.checkOut();
    localaAR1.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localaAR1);
    localaAR1.setPosition(ajb.dhZ);
    localaAR1.setX(966);
    localaAR1.setY(847);
    localaAR1.setWidth(34);
    localaAR1.setHeight(18);
    localaAR1.setTexture(this.W.aH("default_0.tga"));
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
    String str2 = "shortcutBarButtonOverPixmap";
    aAR localaAR2 = aAR.checkOut();
    localaAR2.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localaAR2);
    localaAR2.setPosition(ajb.dhZ);
    localaAR2.setX(760);
    localaAR2.setY(214);
    localaAR2.setWidth(34);
    localaAR2.setHeight(18);
    localaAR2.setTexture(this.W.aH("default_1.tga"));
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
    String str3 = "shortcutBarButtonPressedPixmap";
    aAR localaAR3 = aAR.checkOut();
    localaAR3.setElementMap(localcpa);
    if ((localcpa != null) && (str3 != null))
      localcpa.a(str3, localaAR3);
    localaAR3.setPosition(ajb.dhZ);
    localaAR3.setX(2);
    localaAR3.setY(213);
    localaAR3.setWidth(34);
    localaAR3.setHeight(18);
    localaAR3.setTexture(this.W.aH("default_1.tga"));
    localJg3.bb(localaAR3);
    localaAR3.brn();
    localaAR3.rV();
    localJg3.rV();
    dOc localdOc4 = paramdOc;
    Jg localJg4 = localdOc4.getAppearance();
    localJg4.setElementMap(localcpa);
    ((cwJ)localJg4).setAlignment(aFG.eck);
    localJg4.setState("selected");
    paramdOc.bb(localJg4);
    localJg4.brn();
    String str4 = "shortcutBarButtonSelectedPixmap";
    aAR localaAR4 = aAR.checkOut();
    localaAR4.setElementMap(localcpa);
    if ((localcpa != null) && (str4 != null))
      localcpa.a(str4, localaAR4);
    localaAR4.setPosition(ajb.dhZ);
    localaAR4.setX(848);
    localaAR4.setY(214);
    localaAR4.setWidth(34);
    localaAR4.setHeight(18);
    localaAR4.setTexture(this.W.aH("default_1.tga"));
    localJg4.bb(localaAR4);
    localaAR4.brn();
    localaAR4.rV();
    localJg4.rV();
    dOc localdOc5 = paramdOc;
    Jg localJg5 = localdOc5.getAppearance();
    localJg5.setElementMap(localcpa);
    ((cwJ)localJg5).setAlignment(aFG.eck);
    localJg5.setState("mouseHoverSelected");
    paramdOc.bb(localJg5);
    localJg5.brn();
    String str5 = "shortcutBarButtonSelectedOverPixmap";
    aAR localaAR5 = aAR.checkOut();
    localaAR5.setElementMap(localcpa);
    if ((localcpa != null) && (str5 != null))
      localcpa.a(str5, localaAR5);
    localaAR5.setPosition(ajb.dhZ);
    localaAR5.setX(892);
    localaAR5.setY(214);
    localaAR5.setWidth(34);
    localaAR5.setHeight(18);
    localaAR5.setTexture(this.W.aH("default_1.tga"));
    localJg5.bb(localaAR5);
    localaAR5.brn();
    localaAR5.rV();
    localJg5.rV();
    dOc localdOc6 = paramdOc;
    Jg localJg6 = localdOc6.getAppearance();
    localJg6.setElementMap(localcpa);
    ((cwJ)localJg6).setAlignment(aFG.eck);
    localJg6.setState("pressedSelected");
    paramdOc.bb(localJg6);
    localJg6.brn();
    String str6 = "shortcutBarButtonSelectedPressedPixmap";
    aAR localaAR6 = aAR.checkOut();
    localaAR6.setElementMap(localcpa);
    if ((localcpa != null) && (str6 != null))
      localcpa.a(str6, localaAR6);
    localaAR6.setPosition(ajb.dhZ);
    localaAR6.setX(714);
    localaAR6.setY(214);
    localaAR6.setWidth(34);
    localaAR6.setHeight(18);
    localaAR6.setTexture(this.W.aH("default_1.tga"));
    localJg6.bb(localaAR6);
    localaAR6.brn();
    localaAR6.rV();
    localJg6.rV();
  }
}