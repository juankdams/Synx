import java.util.Stack;

public class dNS
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
    String str1 = "scrollStringBackground";
    aen localaen = aen.checkOut();
    localaen.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localaen);
    localaen.setScaled(true);
    localJg.bb(localaen);
    localaen.brn();
    aAR localaAR1 = aAR.checkOut();
    localaAR1.setElementMap(localcpa);
    localaAR1.setHeight(1);
    localaAR1.setPosition(ajb.dhZ);
    localaAR1.setWidth(0);
    localaAR1.setX(1183);
    localaAR1.setY(226);
    localaen.bb(localaAR1);
    localaAR1.brn();
    localaAR1.rV();
    localaen.rV();
    String str2 = "scrollStringBorder";
    Cx localCx = new Cx();
    localCx.aJ();
    localCx.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localCx);
    localJg.bb(localCx);
    localCx.brn();
    aAR localaAR2 = aAR.checkOut();
    localaAR2.setElementMap(localcpa);
    localaAR2.setPosition(ajb.dhR);
    localaAR2.setX(428);
    localaAR2.setY(150);
    localaAR2.setWidth(6);
    localaAR2.setHeight(12);
    localaAR2.setTexture(this.W.aH("scroll_0.tga"));
    localCx.bb(localaAR2);
    localaAR2.brn();
    localaAR2.rV();
    aAR localaAR3 = aAR.checkOut();
    localaAR3.setElementMap(localcpa);
    localaAR3.setHeight(12);
    localaAR3.setPosition(ajb.dhT);
    localaAR3.setWidth(0);
    localaAR3.setX(1183);
    localaAR3.setY(211);
    localCx.bb(localaAR3);
    localaAR3.brn();
    localaAR3.rV();
    aAR localaAR4 = aAR.checkOut();
    localaAR4.setElementMap(localcpa);
    localaAR4.setPosition(ajb.dhV);
    localaAR4.setX(437);
    localaAR4.setY(150);
    localaAR4.setWidth(4);
    localaAR4.setHeight(12);
    localaAR4.setTexture(this.W.aH("scroll_0.tga"));
    localCx.bb(localaAR4);
    localaAR4.brn();
    localaAR4.rV();
    aAR localaAR5 = aAR.checkOut();
    localaAR5.setElementMap(localcpa);
    localaAR5.setPosition(ajb.dia);
    localaAR5.setX(451);
    localaAR5.setY(161);
    localaAR5.setWidth(4);
    localaAR5.setHeight(1);
    localaAR5.setTexture(this.W.aH("scroll_0.tga"));
    localCx.bb(localaAR5);
    localaAR5.brn();
    localaAR5.rV();
    aAR localaAR6 = aAR.checkOut();
    localaAR6.setElementMap(localcpa);
    localaAR6.setPosition(ajb.dih);
    localaAR6.setX(444);
    localaAR6.setY(150);
    localaAR6.setWidth(4);
    localaAR6.setHeight(12);
    localaAR6.setTexture(this.W.aH("scroll_0.tga"));
    localCx.bb(localaAR6);
    localaAR6.brn();
    localaAR6.rV();
    aAR localaAR7 = aAR.checkOut();
    localaAR7.setElementMap(localcpa);
    localaAR7.setHeight(12);
    localaAR7.setPosition(ajb.dif);
    localaAR7.setWidth(0);
    localaAR7.setX(1183);
    localaAR7.setY(231);
    localCx.bb(localaAR7);
    localaAR7.brn();
    localaAR7.rV();
    aAR localaAR8 = aAR.checkOut();
    localaAR8.setElementMap(localcpa);
    localaAR8.setPosition(ajb.did);
    localaAR8.setX(419);
    localaAR8.setY(150);
    localaAR8.setWidth(6);
    localaAR8.setHeight(12);
    localaAR8.setTexture(this.W.aH("scroll_0.tga"));
    localCx.bb(localaAR8);
    localaAR8.brn();
    localaAR8.rV();
    aAR localaAR9 = aAR.checkOut();
    localaAR9.setElementMap(localcpa);
    localaAR9.setPosition(ajb.dhY);
    localaAR9.setX(208);
    localaAR9.setY(155);
    localaAR9.setWidth(6);
    localaAR9.setHeight(1);
    localaAR9.setTexture(this.W.aH("scroll_0.tga"));
    localCx.bb(localaAR9);
    localaAR9.brn();
    localaAR9.rV();
    localCx.rV();
    localJg.rV();
  }
}