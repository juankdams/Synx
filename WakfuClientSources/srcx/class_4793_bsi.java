import java.awt.Insets;
import java.util.Stack;

public class bsi
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
    cuR localcuR = new cuR();
    localcuR.aJ();
    localcuR.setElementMap(localcpa);
    localcuR.setInsets(new Insets(2, 3, 3, 3));
    localJg.bb(localcuR);
    localcuR.brn();
    localcuR.rV();
    String str1 = "titleBarBackground";
    aen localaen = aen.checkOut();
    localaen.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localaen);
    localaen.setScaled(true);
    localJg.bb(localaen);
    localaen.brn();
    String str2 = "titleBarNorthWest";
    aAR localaAR1 = aAR.checkOut();
    localaAR1.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localaAR1);
    localaAR1.setPosition(ajb.dhR);
    localaAR1.setX(698);
    localaAR1.setY(415);
    localaAR1.setWidth(7);
    localaAR1.setHeight(10);
    localaAR1.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR1);
    localaAR1.brn();
    localaAR1.rV();
    String str3 = "titleBarNorth";
    aAR localaAR2 = aAR.checkOut();
    localaAR2.setElementMap(localcpa);
    if ((localcpa != null) && (str3 != null))
      localcpa.a(str3, localaAR2);
    localaAR2.setPosition(ajb.dhT);
    localaAR2.setX(78);
    localaAR2.setY(694);
    localaAR2.setWidth(1);
    localaAR2.setHeight(10);
    localaAR2.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR2);
    localaAR2.brn();
    localaAR2.rV();
    String str4 = "titleBarNorthEast";
    aAR localaAR3 = aAR.checkOut();
    localaAR3.setElementMap(localcpa);
    if ((localcpa != null) && (str4 != null))
      localcpa.a(str4, localaAR3);
    localaAR3.setFlipHorizontaly(true);
    localaAR3.setPosition(ajb.dhV);
    localaAR3.setX(698);
    localaAR3.setY(415);
    localaAR3.setWidth(7);
    localaAR3.setHeight(10);
    localaAR3.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR3);
    localaAR3.brn();
    localaAR3.rV();
    String str5 = "titleBarWest";
    aAR localaAR4 = aAR.checkOut();
    localaAR4.setElementMap(localcpa);
    if ((localcpa != null) && (str5 != null))
      localcpa.a(str5, localaAR4);
    localaAR4.setPosition(ajb.dhY);
    localaAR4.setX(199);
    localaAR4.setY(216);
    localaAR4.setWidth(7);
    localaAR4.setHeight(1);
    localaAR4.setTexture(this.W.aH("default_1.tga"));
    localaen.bb(localaAR4);
    localaAR4.brn();
    localaAR4.rV();
    String str6 = "titleBarCenter";
    aAR localaAR5 = aAR.checkOut();
    localaAR5.setElementMap(localcpa);
    if ((localcpa != null) && (str6 != null))
      localcpa.a(str6, localaAR5);
    localaAR5.setPosition(ajb.dhZ);
    localaAR5.setX(2);
    localaAR5.setY(184);
    localaAR5.setWidth(1);
    localaAR5.setHeight(1);
    localaAR5.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR5);
    localaAR5.brn();
    localaAR5.rV();
    String str7 = "titleBarEast";
    aAR localaAR6 = aAR.checkOut();
    localaAR6.setElementMap(localcpa);
    if ((localcpa != null) && (str7 != null))
      localcpa.a(str7, localaAR6);
    localaAR6.setFlipHorizontaly(true);
    localaAR6.setPosition(ajb.dia);
    localaAR6.setX(199);
    localaAR6.setY(216);
    localaAR6.setWidth(7);
    localaAR6.setHeight(1);
    localaAR6.setTexture(this.W.aH("default_1.tga"));
    localaen.bb(localaAR6);
    localaAR6.brn();
    localaAR6.rV();
    String str8 = "titleBarSouthWest";
    aAR localaAR7 = aAR.checkOut();
    localaAR7.setElementMap(localcpa);
    if ((localcpa != null) && (str8 != null))
      localcpa.a(str8, localaAR7);
    localaAR7.setPosition(ajb.did);
    localaAR7.setX(786);
    localaAR7.setY(583);
    localaAR7.setWidth(7);
    localaAR7.setHeight(12);
    localaAR7.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR7);
    localaAR7.brn();
    localaAR7.rV();
    String str9 = "titleBarSouth";
    aAR localaAR8 = aAR.checkOut();
    localaAR8.setElementMap(localcpa);
    if ((localcpa != null) && (str9 != null))
      localcpa.a(str9, localaAR8);
    localaAR8.setPosition(ajb.dif);
    localaAR8.setX(565);
    localaAR8.setY(738);
    localaAR8.setWidth(1);
    localaAR8.setHeight(12);
    localaAR8.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR8);
    localaAR8.brn();
    localaAR8.rV();
    String str10 = "titleBarSouthEast";
    aAR localaAR9 = aAR.checkOut();
    localaAR9.setElementMap(localcpa);
    if ((localcpa != null) && (str10 != null))
      localcpa.a(str10, localaAR9);
    localaAR9.setFlipHorizontaly(true);
    localaAR9.setPosition(ajb.dih);
    localaAR9.setX(786);
    localaAR9.setY(583);
    localaAR9.setWidth(7);
    localaAR9.setHeight(12);
    localaAR9.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR9);
    localaAR9.brn();
    localaAR9.rV();
    localaen.rV();
    localJg.rV();
  }
}