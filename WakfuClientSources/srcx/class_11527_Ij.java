import java.util.Stack;

public class Ij
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
    String str = "itemInventoryBarContainer";
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
    localaAR1.setX(559);
    localaAR1.setY(221);
    localaAR1.setWidth(8);
    localaAR1.setHeight(13);
    localaAR1.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR1);
    localaAR1.brn();
    localaAR1.rV();
    aAR localaAR2 = aAR.checkOut();
    localaAR2.setElementMap(localcpa);
    localaAR2.setPosition(ajb.dhT);
    localaAR2.setX(163);
    localaAR2.setY(458);
    localaAR2.setWidth(5);
    localaAR2.setHeight(13);
    localaAR2.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR2);
    localaAR2.brn();
    localaAR2.rV();
    aAR localaAR3 = aAR.checkOut();
    localaAR3.setElementMap(localcpa);
    localaAR3.setPosition(ajb.dhV);
    localaAR3.setX(563);
    localaAR3.setY(705);
    localaAR3.setWidth(3);
    localaAR3.setHeight(13);
    localaAR3.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR3);
    localaAR3.brn();
    localaAR3.rV();
    aAR localaAR4 = aAR.checkOut();
    localaAR4.setElementMap(localcpa);
    localaAR4.setPosition(ajb.dhY);
    localaAR4.setX(99);
    localaAR4.setY(146);
    localaAR4.setWidth(8);
    localaAR4.setHeight(1);
    localaAR4.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR4);
    localaAR4.brn();
    localaAR4.rV();
    aAR localaAR5 = aAR.checkOut();
    localaAR5.setElementMap(localcpa);
    localaAR5.setPosition(ajb.dhZ);
    localaAR5.setX(272);
    localaAR5.setY(173);
    localaAR5.setWidth(5);
    localaAR5.setHeight(1);
    localaAR5.setTexture(this.W.aH("default_1.tga"));
    localaen.bb(localaAR5);
    localaAR5.brn();
    localaAR5.rV();
    aAR localaAR6 = aAR.checkOut();
    localaAR6.setElementMap(localcpa);
    localaAR6.setPosition(ajb.dia);
    localaAR6.setX(891);
    localaAR6.setY(105);
    localaAR6.setWidth(3);
    localaAR6.setHeight(1);
    localaAR6.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR6);
    localaAR6.brn();
    localaAR6.rV();
    aAR localaAR7 = aAR.checkOut();
    localaAR7.setElementMap(localcpa);
    localaAR7.setPosition(ajb.did);
    localaAR7.setX(867);
    localaAR7.setY(860);
    localaAR7.setWidth(8);
    localaAR7.setHeight(63);
    localaAR7.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR7);
    localaAR7.brn();
    localaAR7.rV();
    aAR localaAR8 = aAR.checkOut();
    localaAR8.setElementMap(localcpa);
    localaAR8.setPosition(ajb.dif);
    localaAR8.setX(769);
    localaAR8.setY(857);
    localaAR8.setWidth(5);
    localaAR8.setHeight(63);
    localaAR8.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR8);
    localaAR8.brn();
    localaAR8.rV();
    aAR localaAR9 = aAR.checkOut();
    localaAR9.setElementMap(localcpa);
    localaAR9.setPosition(ajb.dih);
    localaAR9.setX(653);
    localaAR9.setY(854);
    localaAR9.setWidth(3);
    localaAR9.setHeight(63);
    localaAR9.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR9);
    localaAR9.brn();
    localaAR9.rV();
    localaen.rV();
    localJg.rV();
  }
}