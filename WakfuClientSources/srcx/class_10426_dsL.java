import java.util.Stack;

public class dsL
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
    String str1 = "smallDeleteButtonDefaultPixmap";
    aAR localaAR1 = aAR.checkOut();
    localaAR1.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localaAR1);
    localaAR1.setPosition(ajb.dhZ);
    localaAR1.setX(190);
    localaAR1.setY(129);
    localaAR1.setWidth(13);
    localaAR1.setHeight(13);
    localaAR1.setTexture(this.W.aH("default_0.tga"));
    localJg1.bb(localaAR1);
    localaAR1.brn();
    localaAR1.rV();
    localJg1.rV();
    dOc localdOc2 = paramdOc;
    Jg localJg2 = localdOc2.getAppearance();
    localJg2.setElementMap(localcpa);
    localJg2.setState("pressed");
    paramdOc.bb(localJg2);
    localJg2.brn();
    String str2 = "smallDeleteButtonPressedPixmap";
    aAR localaAR2 = aAR.checkOut();
    localaAR2.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localaAR2);
    localaAR2.setPosition(ajb.dhZ);
    localaAR2.setX(576);
    localaAR2.setY(162);
    localaAR2.setWidth(13);
    localaAR2.setHeight(13);
    localaAR2.setTexture(this.W.aH("default_1.tga"));
    localJg2.bb(localaAR2);
    localaAR2.brn();
    localaAR2.rV();
    localJg2.rV();
    dOc localdOc3 = paramdOc;
    Jg localJg3 = localdOc3.getAppearance();
    localJg3.setElementMap(localcpa);
    localJg3.setState("mouseHover");
    paramdOc.bb(localJg3);
    localJg3.brn();
    String str3 = "smallDeleteButtonOverPixmap";
    aAR localaAR3 = aAR.checkOut();
    localaAR3.setElementMap(localcpa);
    if ((localcpa != null) && (str3 != null))
      localcpa.a(str3, localaAR3);
    localaAR3.setPosition(ajb.dhZ);
    localaAR3.setX(576);
    localaAR3.setY(162);
    localaAR3.setWidth(13);
    localaAR3.setHeight(13);
    localaAR3.setTexture(this.W.aH("default_1.tga"));
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
    String str4 = "smallDeleteButtonDisabledPixmap";
    aAR localaAR4 = aAR.checkOut();
    localaAR4.setElementMap(localcpa);
    if ((localcpa != null) && (str4 != null))
      localcpa.a(str4, localaAR4);
    localaAR4.setPosition(ajb.dhZ);
    localaAR4.setX(190);
    localaAR4.setY(113);
    localaAR4.setWidth(13);
    localaAR4.setHeight(13);
    localaAR4.setTexture(this.W.aH("default_0.tga"));
    localJg4.bb(localaAR4);
    localaAR4.brn();
    localaAR4.rV();
    localJg4.rV();
  }
}