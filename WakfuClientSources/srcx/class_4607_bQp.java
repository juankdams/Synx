import java.util.Stack;

public class bQp
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
    String str1 = "skillProgressBarBackground";
    aen localaen = aen.checkOut();
    localaen.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localaen);
    localaen.setScaled(true);
    localJg.bb(localaen);
    localaen.brn();
    aAR localaAR1 = aAR.checkOut();
    localaAR1.setElementMap(localcpa);
    localaAR1.setPosition(ajb.dhZ);
    localaAR1.setX(518);
    localaAR1.setY(179);
    localaAR1.setWidth(2);
    localaAR1.setHeight(2);
    localaAR1.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR1);
    localaAR1.brn();
    localaAR1.rV();
    localaen.rV();
    String str2 = "skillProgressBarBorder";
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
    localaAR2.setX(206);
    localaAR2.setY(5);
    localaAR2.setWidth(32);
    localaAR2.setHeight(20);
    localaAR2.setTexture(this.W.aH("default_0.tga"));
    localCx.bb(localaAR2);
    localaAR2.brn();
    localaAR2.rV();
    aAR localaAR3 = aAR.checkOut();
    localaAR3.setElementMap(localcpa);
    localaAR3.setPosition(ajb.dhT);
    localaAR3.setX(871);
    localaAR3.setY(837);
    localaAR3.setWidth(4);
    localaAR3.setHeight(20);
    localaAR3.setTexture(this.W.aH("default_0.tga"));
    localCx.bb(localaAR3);
    localaAR3.brn();
    localaAR3.rV();
    aAR localaAR4 = aAR.checkOut();
    localaAR4.setElementMap(localcpa);
    localaAR4.setPosition(ajb.dhV);
    localaAR4.setX(255);
    localaAR4.setY(5);
    localaAR4.setWidth(28);
    localaAR4.setHeight(20);
    localaAR4.setTexture(this.W.aH("default_0.tga"));
    localCx.bb(localaAR4);
    localaAR4.brn();
    localaAR4.rV();
    aAR localaAR5 = aAR.checkOut();
    localaAR5.setElementMap(localcpa);
    localaAR5.setPosition(ajb.dia);
    localaAR5.setX(524);
    localaAR5.setY(134);
    localaAR5.setWidth(28);
    localaAR5.setHeight(2);
    localaAR5.setTexture(this.W.aH("default_1.tga"));
    localCx.bb(localaAR5);
    localaAR5.brn();
    localaAR5.rV();
    aAR localaAR6 = aAR.checkOut();
    localaAR6.setElementMap(localcpa);
    localaAR6.setPosition(ajb.dih);
    localaAR6.setX(146);
    localaAR6.setY(5);
    localaAR6.setWidth(28);
    localaAR6.setHeight(20);
    localaAR6.setTexture(this.W.aH("default_0.tga"));
    localCx.bb(localaAR6);
    localaAR6.brn();
    localaAR6.rV();
    aAR localaAR7 = aAR.checkOut();
    localaAR7.setElementMap(localcpa);
    localaAR7.setPosition(ajb.dif);
    localaAR7.setX(474);
    localaAR7.setY(774);
    localaAR7.setWidth(4);
    localaAR7.setHeight(20);
    localaAR7.setTexture(this.W.aH("default_0.tga"));
    localCx.bb(localaAR7);
    localaAR7.brn();
    localaAR7.rV();
    aAR localaAR8 = aAR.checkOut();
    localaAR8.setElementMap(localcpa);
    localaAR8.setPosition(ajb.did);
    localaAR8.setX(975);
    localaAR8.setY(6);
    localaAR8.setWidth(32);
    localaAR8.setHeight(20);
    localaAR8.setTexture(this.W.aH("default_0.tga"));
    localCx.bb(localaAR8);
    localaAR8.brn();
    localaAR8.rV();
    aAR localaAR9 = aAR.checkOut();
    localaAR9.setElementMap(localcpa);
    localaAR9.setPosition(ajb.dhY);
    localaAR9.setX(2);
    localaAR9.setY(134);
    localaAR9.setWidth(32);
    localaAR9.setHeight(2);
    localaAR9.setTexture(this.W.aH("default_1.tga"));
    localCx.bb(localaAR9);
    localaAR9.brn();
    localaAR9.rV();
    localCx.rV();
    localJg.rV();
  }
}