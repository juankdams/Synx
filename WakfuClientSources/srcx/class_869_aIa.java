import java.util.Stack;

public class aIa
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
    String str1 = "logonFrameContainerBorder";
    Cx localCx = new Cx();
    localCx.aJ();
    localCx.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localCx);
    localJg.bb(localCx);
    localCx.brn();
    aAR localaAR1 = aAR.checkOut();
    localaAR1.setElementMap(localcpa);
    localaAR1.setFlipHorizontaly(true);
    localaAR1.setPosition(ajb.dhR);
    localaAR1.setX(983);
    localaAR1.setY(951);
    localaAR1.setWidth(18);
    localaAR1.setHeight(71);
    localaAR1.setTexture(this.W.aH("preWorld_0.tga"));
    localCx.bb(localaAR1);
    localaAR1.brn();
    localaAR1.rV();
    aAR localaAR2 = aAR.checkOut();
    localaAR2.setElementMap(localcpa);
    localaAR2.setPosition(ajb.dhT);
    localaAR2.setX(1004);
    localaAR2.setY(951);
    localaAR2.setWidth(1);
    localaAR2.setHeight(71);
    localaAR2.setTexture(this.W.aH("preWorld_0.tga"));
    localCx.bb(localaAR2);
    localaAR2.brn();
    localaAR2.rV();
    aAR localaAR3 = aAR.checkOut();
    localaAR3.setElementMap(localcpa);
    localaAR3.setPosition(ajb.dhV);
    localaAR3.setX(983);
    localaAR3.setY(951);
    localaAR3.setWidth(18);
    localaAR3.setHeight(71);
    localaAR3.setTexture(this.W.aH("preWorld_0.tga"));
    localCx.bb(localaAR3);
    localaAR3.brn();
    localaAR3.rV();
    aAR localaAR4 = aAR.checkOut();
    localaAR4.setElementMap(localcpa);
    localaAR4.setPosition(ajb.dia);
    localaAR4.setX(924);
    localaAR4.setY(232);
    localaAR4.setWidth(18);
    localaAR4.setHeight(1);
    localaAR4.setTexture(this.W.aH("preWorld_0.tga"));
    localCx.bb(localaAR4);
    localaAR4.brn();
    localaAR4.rV();
    aAR localaAR5 = aAR.checkOut();
    localaAR5.setElementMap(localcpa);
    localaAR5.setFlipVerticaly(true);
    localaAR5.setPosition(ajb.dih);
    localaAR5.setX(983);
    localaAR5.setY(951);
    localaAR5.setWidth(18);
    localaAR5.setHeight(71);
    localaAR5.setTexture(this.W.aH("preWorld_0.tga"));
    localCx.bb(localaAR5);
    localaAR5.brn();
    localaAR5.rV();
    aAR localaAR6 = aAR.checkOut();
    localaAR6.setElementMap(localcpa);
    localaAR6.setFlipVerticaly(true);
    localaAR6.setPosition(ajb.dif);
    localaAR6.setX(1004);
    localaAR6.setY(951);
    localaAR6.setWidth(1);
    localaAR6.setHeight(71);
    localaAR6.setTexture(this.W.aH("preWorld_0.tga"));
    localCx.bb(localaAR6);
    localaAR6.brn();
    localaAR6.rV();
    aAR localaAR7 = aAR.checkOut();
    localaAR7.setElementMap(localcpa);
    localaAR7.setFlipHorizontaly(true);
    localaAR7.setFlipVerticaly(true);
    localaAR7.setPosition(ajb.did);
    localaAR7.setX(983);
    localaAR7.setY(951);
    localaAR7.setWidth(18);
    localaAR7.setHeight(71);
    localaAR7.setTexture(this.W.aH("preWorld_0.tga"));
    localCx.bb(localaAR7);
    localaAR7.brn();
    localaAR7.rV();
    aAR localaAR8 = aAR.checkOut();
    localaAR8.setElementMap(localcpa);
    localaAR8.setFlipHorizontaly(true);
    localaAR8.setPosition(ajb.dhY);
    localaAR8.setX(924);
    localaAR8.setY(232);
    localaAR8.setWidth(18);
    localaAR8.setHeight(1);
    localaAR8.setTexture(this.W.aH("preWorld_0.tga"));
    localCx.bb(localaAR8);
    localaAR8.brn();
    localaAR8.rV();
    localCx.rV();
    String str2 = "logonFrameContainerBackground";
    aen localaen = aen.checkOut();
    localaen.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localaen);
    localaen.setScaled(true);
    localJg.bb(localaen);
    localaen.brn();
    aAR localaAR9 = aAR.checkOut();
    localaAR9.setElementMap(localcpa);
    localaAR9.setPosition(ajb.dhZ);
    localaAR9.setX(1008);
    localaAR9.setY(960);
    localaAR9.setWidth(1);
    localaAR9.setHeight(1);
    localaAR9.setTexture(this.W.aH("preWorld_0.tga"));
    localaen.bb(localaAR9);
    localaAR9.brn();
    localaAR9.rV();
    localaen.rV();
    localJg.rV();
  }
}