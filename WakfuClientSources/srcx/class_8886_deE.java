import java.util.Stack;

public class deE
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
    aen localaen = aen.checkOut();
    localaen.setElementMap(localcpa);
    localJg.bb(localaen);
    localaen.brn();
    aAR localaAR1 = aAR.checkOut();
    localaAR1.setElementMap(localcpa);
    localaAR1.setHeight(0);
    localaAR1.setPosition(ajb.dhR);
    localaAR1.setWidth(9);
    localaAR1.setX(415);
    localaAR1.setY(122);
    localaen.bb(localaAR1);
    localaAR1.brn();
    localaAR1.rV();
    aAR localaAR2 = aAR.checkOut();
    localaAR2.setElementMap(localcpa);
    localaAR2.setHeight(0);
    localaAR2.setPosition(ajb.dhT);
    localaAR2.setWidth(0);
    localaAR2.setX(415);
    localaAR2.setY(122);
    localaen.bb(localaAR2);
    localaAR2.brn();
    localaAR2.rV();
    aAR localaAR3 = aAR.checkOut();
    localaAR3.setElementMap(localcpa);
    localaAR3.setHeight(0);
    localaAR3.setPosition(ajb.dhV);
    localaAR3.setWidth(9);
    localaAR3.setX(415);
    localaAR3.setY(122);
    localaen.bb(localaAR3);
    localaAR3.brn();
    localaAR3.rV();
    aAR localaAR4 = aAR.checkOut();
    localaAR4.setElementMap(localcpa);
    localaAR4.setHeight(0);
    localaAR4.setPosition(ajb.dhY);
    localaAR4.setWidth(9);
    localaAR4.setX(415);
    localaAR4.setY(122);
    localaen.bb(localaAR4);
    localaAR4.brn();
    localaAR4.rV();
    aAR localaAR5 = aAR.checkOut();
    localaAR5.setElementMap(localcpa);
    localaAR5.setHeight(0);
    localaAR5.setPosition(ajb.dhZ);
    localaAR5.setWidth(0);
    localaAR5.setX(415);
    localaAR5.setY(122);
    localaen.bb(localaAR5);
    localaAR5.brn();
    localaAR5.rV();
    aAR localaAR6 = aAR.checkOut();
    localaAR6.setElementMap(localcpa);
    localaAR6.setHeight(0);
    localaAR6.setPosition(ajb.dia);
    localaAR6.setWidth(9);
    localaAR6.setX(415);
    localaAR6.setY(122);
    localaen.bb(localaAR6);
    localaAR6.brn();
    localaAR6.rV();
    aAR localaAR7 = aAR.checkOut();
    localaAR7.setElementMap(localcpa);
    localaAR7.setPosition(ajb.did);
    localaAR7.setX(555);
    localaAR7.setY(531);
    localaAR7.setWidth(9);
    localaAR7.setHeight(16);
    localaAR7.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR7);
    localaAR7.brn();
    localaAR7.rV();
    aAR localaAR8 = aAR.checkOut();
    localaAR8.setElementMap(localcpa);
    localaAR8.setFlipHorizontaly(true);
    localaAR8.setPosition(ajb.dif);
    localaAR8.setX(655);
    localaAR8.setY(789);
    localaAR8.setWidth(1);
    localaAR8.setHeight(16);
    localaAR8.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR8);
    localaAR8.brn();
    localaAR8.rV();
    aAR localaAR9 = aAR.checkOut();
    localaAR9.setElementMap(localcpa);
    localaAR9.setFlipHorizontaly(true);
    localaAR9.setPosition(ajb.dih);
    localaAR9.setX(555);
    localaAR9.setY(531);
    localaAR9.setWidth(9);
    localaAR9.setHeight(16);
    localaAR9.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR9);
    localaAR9.brn();
    localaAR9.rV();
    localaen.rV();
    localJg.rV();
  }
}