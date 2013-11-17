import java.util.Stack;

public class kj
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
    paramdOc.bb(localJg);
    localJg.brn();
    String str1 = "windowBackground3";
    aen localaen = aen.checkOut();
    localaen.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localaen);
    localaen.setScaled(true);
    localJg.bb(localaen);
    localaen.brn();
    String str2 = "windowBackgroundNorthWest";
    aAR localaAR1 = aAR.checkOut();
    localaAR1.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localaAR1);
    localaAR1.setPosition(ajb.dhR);
    localaAR1.setX(691);
    localaAR1.setY(235);
    localaAR1.setWidth(20);
    localaAR1.setHeight(19);
    localaAR1.setTexture(this.W.aH("default_1.tga"));
    localaen.bb(localaAR1);
    localaAR1.brn();
    localaAR1.rV();
    String str3 = "windowBackgroundNorth";
    aAR localaAR2 = aAR.checkOut();
    localaAR2.setElementMap(localcpa);
    if ((localcpa != null) && (str3 != null))
      localcpa.a(str3, localaAR2);
    localaAR2.setPosition(ajb.dhT);
    localaAR2.setX(477);
    localaAR2.setY(810);
    localaAR2.setWidth(1);
    localaAR2.setHeight(19);
    localaAR2.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR2);
    localaAR2.brn();
    localaAR2.rV();
    String str4 = "windowBackgroundNorthEast";
    aAR localaAR3 = aAR.checkOut();
    localaAR3.setElementMap(localcpa);
    if ((localcpa != null) && (str4 != null))
      localcpa.a(str4, localaAR3);
    localaAR3.setFlipHorizontaly(true);
    localaAR3.setPosition(ajb.dhV);
    localaAR3.setX(691);
    localaAR3.setY(235);
    localaAR3.setWidth(20);
    localaAR3.setHeight(19);
    localaAR3.setTexture(this.W.aH("default_1.tga"));
    localaen.bb(localaAR3);
    localaAR3.brn();
    localaAR3.rV();
    String str5 = "windowBackgroundWest";
    aAR localaAR4 = aAR.checkOut();
    localaAR4.setElementMap(localcpa);
    if ((localcpa != null) && (str5 != null))
      localcpa.a(str5, localaAR4);
    localaAR4.setPosition(ajb.dhY);
    localaAR4.setX(588);
    localaAR4.setY(129);
    localaAR4.setWidth(20);
    localaAR4.setHeight(1);
    localaAR4.setTexture(this.W.aH("default_1.tga"));
    localaen.bb(localaAR4);
    localaAR4.brn();
    localaAR4.rV();
    String str6 = "windowBackgroundCenter";
    aAR localaAR5 = aAR.checkOut();
    localaAR5.setElementMap(localcpa);
    if ((localcpa != null) && (str6 != null))
      localcpa.a(str6, localaAR5);
    localaAR5.setPosition(ajb.dhZ);
    localaAR5.setX(107);
    localaAR5.setY(331);
    localaAR5.setWidth(1);
    localaAR5.setHeight(1);
    localaAR5.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR5);
    localaAR5.brn();
    localaAR5.rV();
    String str7 = "windowBackgroundEast";
    aAR localaAR6 = aAR.checkOut();
    localaAR6.setElementMap(localcpa);
    if ((localcpa != null) && (str7 != null))
      localcpa.a(str7, localaAR6);
    localaAR6.setFlipHorizontaly(true);
    localaAR6.setPosition(ajb.dia);
    localaAR6.setX(588);
    localaAR6.setY(129);
    localaAR6.setWidth(20);
    localaAR6.setHeight(1);
    localaAR6.setTexture(this.W.aH("default_1.tga"));
    localaen.bb(localaAR6);
    localaAR6.brn();
    localaAR6.rV();
    String str8 = "windowBackgroundSouthWest";
    aAR localaAR7 = aAR.checkOut();
    localaAR7.setElementMap(localcpa);
    if ((localcpa != null) && (str8 != null))
      localcpa.a(str8, localaAR7);
    localaAR7.setFlipVerticaly(true);
    localaAR7.setPosition(ajb.did);
    localaAR7.setX(691);
    localaAR7.setY(235);
    localaAR7.setWidth(20);
    localaAR7.setHeight(19);
    localaAR7.setTexture(this.W.aH("default_1.tga"));
    localaen.bb(localaAR7);
    localaAR7.brn();
    localaAR7.rV();
    String str9 = "windowBackgroundSouth";
    aAR localaAR8 = aAR.checkOut();
    localaAR8.setElementMap(localcpa);
    if ((localcpa != null) && (str9 != null))
      localcpa.a(str9, localaAR8);
    localaAR8.setFlipVerticaly(true);
    localaAR8.setPosition(ajb.dif);
    localaAR8.setX(477);
    localaAR8.setY(810);
    localaAR8.setWidth(1);
    localaAR8.setHeight(19);
    localaAR8.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR8);
    localaAR8.brn();
    localaAR8.rV();
    String str10 = "windowBackgroundSouthEast";
    aAR localaAR9 = aAR.checkOut();
    localaAR9.setElementMap(localcpa);
    if ((localcpa != null) && (str10 != null))
      localcpa.a(str10, localaAR9);
    localaAR9.setFlipHorizontaly(true);
    localaAR9.setFlipVerticaly(true);
    localaAR9.setPosition(ajb.dih);
    localaAR9.setX(691);
    localaAR9.setY(235);
    localaAR9.setWidth(20);
    localaAR9.setHeight(19);
    localaAR9.setTexture(this.W.aH("default_1.tga"));
    localaen.bb(localaAR9);
    localaAR9.brn();
    localaAR9.rV();
    localaen.rV();
    localJg.rV();
  }
}