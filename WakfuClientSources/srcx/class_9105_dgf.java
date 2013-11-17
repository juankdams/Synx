import java.util.Stack;

public class dgf
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
    String str1 = "worldBarButtonDefaultPixmap";
    aAR localaAR1 = aAR.checkOut();
    localaAR1.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localaAR1);
    localaAR1.setPosition(ajb.dhZ);
    localaAR1.setX(50);
    localaAR1.setY(213);
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
    String str2 = "worldBarButtonPressedPixmap";
    aAR localaAR2 = aAR.checkOut();
    localaAR2.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localaAR2);
    localaAR2.setPosition(ajb.dhZ);
    localaAR2.setX(50);
    localaAR2.setY(251);
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
    String str3 = "worldBarButtonOverPixmap";
    aAR localaAR3 = aAR.checkOut();
    localaAR3.setElementMap(localcpa);
    if ((localcpa != null) && (str3 != null))
      localcpa.a(str3, localaAR3);
    localaAR3.setPosition(ajb.dhZ);
    localaAR3.setX(533);
    localaAR3.setY(452);
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
    String str4 = "worldBarButtonDisabledPixmap";
    aAR localaAR4 = aAR.checkOut();
    localaAR4.setElementMap(localcpa);
    if ((localcpa != null) && (str4 != null))
      localcpa.a(str4, localaAR4);
    localaAR4.setPosition(ajb.dhZ);
    localaAR4.setX(523);
    localaAR4.setY(213);
    localaAR4.setWidth(33);
    localaAR4.setHeight(35);
    localaAR4.setTexture(this.W.aH("default_0.tga"));
    localaen4.bb(localaAR4);
    localaAR4.brn();
    localaAR4.rV();
    localaen4.rV();
    localJg4.rV();
  }
}