import java.awt.Insets;
import java.util.Stack;

public class cpK
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
    localcuR.setInsets(new Insets(2, 3, 2, 3));
    localJg.bb(localcuR);
    localcuR.brn();
    localcuR.rV();
    String str = "mainContainerBackgroundFull";
    aen localaen = aen.checkOut();
    localaen.setElementMap(localcpa);
    if ((localcpa != null) && (str != null))
      localcpa.a(str, localaen);
    localaen.setScaled(true);
    localJg.bb(localaen);
    localaen.brn();
    aAR localaAR1 = aAR.checkOut();
    localaAR1.setElementMap(localcpa);
    localaAR1.setPosition(ajb.dhR);
    localaAR1.setX(994);
    localaAR1.setY(162);
    localaAR1.setWidth(14);
    localaAR1.setHeight(13);
    localaAR1.setTexture(this.W.aH("default_1.tga"));
    localaen.bb(localaAR1);
    localaAR1.brn();
    localaAR1.rV();
    aAR localaAR2 = aAR.checkOut();
    localaAR2.setElementMap(localcpa);
    localaAR2.setPosition(ajb.dhT);
    localaAR2.setX(78);
    localaAR2.setY(707);
    localaAR2.setWidth(1);
    localaAR2.setHeight(13);
    localaAR2.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR2);
    localaAR2.brn();
    localaAR2.rV();
    aAR localaAR3 = aAR.checkOut();
    localaAR3.setElementMap(localcpa);
    localaAR3.setPosition(ajb.dhV);
    localaAR3.setX(87);
    localaAR3.setY(289);
    localaAR3.setWidth(14);
    localaAR3.setHeight(13);
    localaAR3.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR3);
    localaAR3.brn();
    localaAR3.rV();
    aAR localaAR4 = aAR.checkOut();
    localaAR4.setElementMap(localcpa);
    localaAR4.setPosition(ajb.dia);
    localaAR4.setX(859);
    localaAR4.setY(594);
    localaAR4.setWidth(14);
    localaAR4.setHeight(22);
    localaAR4.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR4);
    localaAR4.brn();
    localaAR4.rV();
    aAR localaAR5 = aAR.checkOut();
    localaAR5.setElementMap(localcpa);
    localaAR5.setPosition(ajb.dih);
    localaAR5.setX(190);
    localaAR5.setY(162);
    localaAR5.setWidth(14);
    localaAR5.setHeight(13);
    localaAR5.setTexture(this.W.aH("default_1.tga"));
    localaen.bb(localaAR5);
    localaAR5.brn();
    localaAR5.rV();
    aAR localaAR6 = aAR.checkOut();
    localaAR6.setElementMap(localcpa);
    localaAR6.setPosition(ajb.dif);
    localaAR6.setX(2);
    localaAR6.setY(706);
    localaAR6.setWidth(1);
    localaAR6.setHeight(13);
    localaAR6.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR6);
    localaAR6.brn();
    localaAR6.rV();
    aAR localaAR7 = aAR.checkOut();
    localaAR7.setElementMap(localcpa);
    localaAR7.setPosition(ajb.did);
    localaAR7.setX(230);
    localaAR7.setY(162);
    localaAR7.setWidth(14);
    localaAR7.setHeight(13);
    localaAR7.setTexture(this.W.aH("default_1.tga"));
    localaen.bb(localaAR7);
    localaAR7.brn();
    localaAR7.rV();
    aAR localaAR8 = aAR.checkOut();
    localaAR8.setElementMap(localcpa);
    localaAR8.setPosition(ajb.dhY);
    localaAR8.setX(1005);
    localaAR8.setY(352);
    localaAR8.setWidth(14);
    localaAR8.setHeight(22);
    localaAR8.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR8);
    localaAR8.brn();
    localaAR8.rV();
    aAR localaAR9 = aAR.checkOut();
    localaAR9.setElementMap(localcpa);
    localaAR9.setPosition(ajb.dhZ);
    localaAR9.setX(329);
    localaAR9.setY(837);
    localaAR9.setWidth(1);
    localaAR9.setHeight(22);
    localaAR9.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR9);
    localaAR9.brn();
    localaAR9.rV();
    localaen.rV();
    localJg.rV();
  }
}