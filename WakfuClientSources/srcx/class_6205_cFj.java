import java.util.Stack;

public class cFj
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
    ((cwJ)localJg).setAlign(aFG.ecj);
    localJg.setState("default");
    paramdOc.bb(localJg);
    localJg.brn();
    bJA localbJA = bJA.checkOut();
    localbJA.setRenderer(cBQ.cxL().bSM().aI("defaultBoldFont"));
    localbJA.setElementMap(localcpa);
    localJg.bb(localbJA);
    localbJA.brn();
    localbJA.rV();
    String str1 = "scrollFleshColor";
    cAf localcAf1 = cAf.checkOut();
    localcAf1.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localcAf1);
    localcAf1.setColor(new bNa(0.94F, 0.86F, 0.66F, 1.0F));
    localJg.bb(localcAf1);
    localcAf1.brn();
    localcAf1.rV();
    String str2 = "textEditorDarkBorder";
    Cx localCx = new Cx();
    localCx.aJ();
    localCx.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localCx);
    localJg.bb(localCx);
    localCx.brn();
    aAR localaAR1 = aAR.checkOut();
    localaAR1.setElementMap(localcpa);
    localaAR1.setPosition(ajb.dhR);
    localaAR1.setX(391);
    localaAR1.setY(14);
    localaAR1.setWidth(4);
    localaAR1.setHeight(4);
    localaAR1.setTexture(this.W.aH("default_0.tga"));
    localCx.bb(localaAR1);
    localaAR1.brn();
    localaAR1.rV();
    aAR localaAR2 = aAR.checkOut();
    localaAR2.setElementMap(localcpa);
    localaAR2.setPosition(ajb.dhT);
    localaAR2.setX(176);
    localaAR2.setY(133);
    localaAR2.setWidth(20);
    localaAR2.setHeight(4);
    localaAR2.setTexture(this.W.aH("default_1.tga"));
    localCx.bb(localaAR2);
    localaAR2.brn();
    localaAR2.rV();
    aAR localaAR3 = aAR.checkOut();
    localaAR3.setElementMap(localcpa);
    localaAR3.setPosition(ajb.dhV);
    localaAR3.setX(43);
    localaAR3.setY(316);
    localaAR3.setWidth(4);
    localaAR3.setHeight(4);
    localaAR3.setTexture(this.W.aH("default_0.tga"));
    localCx.bb(localaAR3);
    localaAR3.brn();
    localaAR3.rV();
    aAR localaAR4 = aAR.checkOut();
    localaAR4.setElementMap(localcpa);
    localaAR4.setPosition(ajb.dia);
    localaAR4.setX(396);
    localaAR4.setY(408);
    localaAR4.setWidth(4);
    localaAR4.setHeight(7);
    localaAR4.setTexture(this.W.aH("default_0.tga"));
    localCx.bb(localaAR4);
    localaAR4.brn();
    localaAR4.rV();
    aAR localaAR5 = aAR.checkOut();
    localaAR5.setElementMap(localcpa);
    localaAR5.setPosition(ajb.dih);
    localaAR5.setX(885);
    localaAR5.setY(215);
    localaAR5.setWidth(4);
    localaAR5.setHeight(3);
    localaAR5.setTexture(this.W.aH("default_1.tga"));
    localCx.bb(localaAR5);
    localaAR5.brn();
    localaAR5.rV();
    aAR localaAR6 = aAR.checkOut();
    localaAR6.setElementMap(localcpa);
    localaAR6.setPosition(ajb.dif);
    localaAR6.setX(435);
    localaAR6.setY(644);
    localaAR6.setWidth(20);
    localaAR6.setHeight(3);
    localaAR6.setTexture(this.W.aH("default_0.tga"));
    localCx.bb(localaAR6);
    localaAR6.brn();
    localaAR6.rV();
    aAR localaAR7 = aAR.checkOut();
    localaAR7.setElementMap(localcpa);
    localaAR7.setPosition(ajb.did);
    localaAR7.setX(198);
    localaAR7.setY(82);
    localaAR7.setWidth(4);
    localaAR7.setHeight(3);
    localaAR7.setTexture(this.W.aH("default_0.tga"));
    localCx.bb(localaAR7);
    localaAR7.brn();
    localaAR7.rV();
    aAR localaAR8 = aAR.checkOut();
    localaAR8.setElementMap(localcpa);
    localaAR8.setPosition(ajb.dhY);
    localaAR8.setX(929);
    localaAR8.setY(418);
    localaAR8.setWidth(4);
    localaAR8.setHeight(7);
    localaAR8.setTexture(this.W.aH("default_0.tga"));
    localCx.bb(localaAR8);
    localaAR8.brn();
    localaAR8.rV();
    localCx.rV();
    String str3 = "textEditorDarkBackground";
    aen localaen = aen.checkOut();
    localaen.setElementMap(localcpa);
    if ((localcpa != null) && (str3 != null))
      localcpa.a(str3, localaen);
    localaen.setScaled(true);
    localJg.bb(localaen);
    localaen.brn();
    aAR localaAR9 = aAR.checkOut();
    localaAR9.setElementMap(localcpa);
    localaAR9.setPosition(ajb.dhZ);
    localaAR9.setX(936);
    localaAR9.setY(212);
    localaAR9.setWidth(20);
    localaAR9.setHeight(7);
    localaAR9.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR9);
    localaAR9.brn();
    localaAR9.rV();
    localaen.rV();
    cAf localcAf2 = cAf.checkOut();
    localcAf2.setElementMap(localcpa);
    localcAf2.setColor(new bNa(0.9F, 0.9F, 0.9F, 1.0F));
    localcAf2.setName("selection");
    localJg.bb(localcAf2);
    localcAf2.brn();
    localcAf2.rV();
    cAf localcAf3 = cAf.checkOut();
    localcAf3.setElementMap(localcpa);
    localcAf3.setColor(new bNa(0.9F, 0.9F, 0.9F, 1.0F));
    localcAf3.setName("cursor");
    localJg.bb(localcAf3);
    localcAf3.brn();
    localcAf3.rV();
    localJg.rV();
  }
}