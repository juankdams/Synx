import java.util.Stack;

public class dqs
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
    Cx localCx = new Cx();
    localCx.aJ();
    localCx.setElementMap(localcpa);
    localJg.bb(localCx);
    localCx.brn();
    String str1 = "progressBarBackgroundNorthWest";
    aAR localaAR1 = aAR.checkOut();
    localaAR1.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localaAR1);
    localaAR1.setPosition(ajb.dhR);
    localaAR1.setX(21);
    localaAR1.setY(162);
    localaAR1.setWidth(13);
    localaAR1.setHeight(13);
    localaAR1.setTexture(this.W.aH("default_1.tga"));
    localCx.bb(localaAR1);
    localaAR1.brn();
    localaAR1.rV();
    String str2 = "progressBarBackgroundNorth";
    aAR localaAR2 = aAR.checkOut();
    localaAR2.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localaAR2);
    localaAR2.setPosition(ajb.dhT);
    localaAR2.setX(78);
    localaAR2.setY(739);
    localaAR2.setWidth(1);
    localaAR2.setHeight(13);
    localaAR2.setTexture(this.W.aH("default_0.tga"));
    localCx.bb(localaAR2);
    localaAR2.brn();
    localaAR2.rV();
    String str3 = "progressBarBackgroundNorthEast";
    aAR localaAR3 = aAR.checkOut();
    localaAR3.setElementMap(localcpa);
    if ((localcpa != null) && (str3 != null))
      localcpa.a(str3, localaAR3);
    localaAR3.setFlipHorizontaly(true);
    localaAR3.setPosition(ajb.dhV);
    localaAR3.setX(21);
    localaAR3.setY(162);
    localaAR3.setWidth(13);
    localaAR3.setHeight(13);
    localaAR3.setTexture(this.W.aH("default_1.tga"));
    localCx.bb(localaAR3);
    localaAR3.brn();
    localaAR3.rV();
    String str4 = "progressBarBackgroundWest";
    aAR localaAR4 = aAR.checkOut();
    localaAR4.setElementMap(localcpa);
    if ((localcpa != null) && (str4 != null))
      localcpa.a(str4, localaAR4);
    localaAR4.setPosition(ajb.dhY);
    localaAR4.setX(633);
    localaAR4.setY(135);
    localaAR4.setWidth(13);
    localaAR4.setHeight(1);
    localaAR4.setTexture(this.W.aH("default_1.tga"));
    localCx.bb(localaAR4);
    localaAR4.brn();
    localaAR4.rV();
    String str5 = "progressBarBackgroundEast";
    aAR localaAR5 = aAR.checkOut();
    localaAR5.setElementMap(localcpa);
    if ((localcpa != null) && (str5 != null))
      localcpa.a(str5, localaAR5);
    localaAR5.setFlipHorizontaly(true);
    localaAR5.setPosition(ajb.dia);
    localaAR5.setX(633);
    localaAR5.setY(135);
    localaAR5.setWidth(13);
    localaAR5.setHeight(1);
    localaAR5.setTexture(this.W.aH("default_1.tga"));
    localCx.bb(localaAR5);
    localaAR5.brn();
    localaAR5.rV();
    String str6 = "progressBarBackgroundSouthWest";
    aAR localaAR6 = aAR.checkOut();
    localaAR6.setElementMap(localcpa);
    if ((localcpa != null) && (str6 != null))
      localcpa.a(str6, localaAR6);
    localaAR6.setFlipVerticaly(true);
    localaAR6.setPosition(ajb.did);
    localaAR6.setX(21);
    localaAR6.setY(162);
    localaAR6.setWidth(13);
    localaAR6.setHeight(13);
    localaAR6.setTexture(this.W.aH("default_1.tga"));
    localCx.bb(localaAR6);
    localaAR6.brn();
    localaAR6.rV();
    String str7 = "progressBarBackgroundSouth";
    aAR localaAR7 = aAR.checkOut();
    localaAR7.setElementMap(localcpa);
    if ((localcpa != null) && (str7 != null))
      localcpa.a(str7, localaAR7);
    localaAR7.setFlipVerticaly(true);
    localaAR7.setPosition(ajb.dif);
    localaAR7.setX(78);
    localaAR7.setY(739);
    localaAR7.setWidth(1);
    localaAR7.setHeight(13);
    localaAR7.setTexture(this.W.aH("default_0.tga"));
    localCx.bb(localaAR7);
    localaAR7.brn();
    localaAR7.rV();
    String str8 = "progressBarBackgroundSouthEast";
    aAR localaAR8 = aAR.checkOut();
    localaAR8.setElementMap(localcpa);
    if ((localcpa != null) && (str8 != null))
      localcpa.a(str8, localaAR8);
    localaAR8.setFlipHorizontaly(true);
    localaAR8.setFlipVerticaly(true);
    localaAR8.setPosition(ajb.dih);
    localaAR8.setX(21);
    localaAR8.setY(162);
    localaAR8.setWidth(13);
    localaAR8.setHeight(13);
    localaAR8.setTexture(this.W.aH("default_1.tga"));
    localCx.bb(localaAR8);
    localaAR8.brn();
    localaAR8.rV();
    localCx.rV();
    aen localaen = aen.checkOut();
    localaen.setElementMap(localcpa);
    localaen.setScaled(true);
    localJg.bb(localaen);
    localaen.brn();
    String str9 = "progressBarBackgroundCenter";
    aAR localaAR9 = aAR.checkOut();
    localaAR9.setElementMap(localcpa);
    if ((localcpa != null) && (str9 != null))
      localcpa.a(str9, localaAR9);
    localaAR9.setPosition(ajb.dhZ);
    localaAR9.setX(2);
    localaAR9.setY(200);
    localaAR9.setWidth(1);
    localaAR9.setHeight(1);
    localaAR9.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR9);
    localaAR9.brn();
    localaAR9.rV();
    localaen.rV();
    localJg.rV();
  }
}