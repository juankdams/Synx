import java.util.Stack;

public class bQy
  implements aTK
{
  private uk W;
  private Stack X = new Stack();

  public void a(cpa paramcpa, uk paramuk, dOc paramdOc)
  {
    this.W = paramuk;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    dOc localdOc1 = paramdOc;
    dOc localdOc2 = localdOc1.getWidgetByThemeElementName("list", false);
    if (localdOc2 != null)
    {
      dOc localdOc3 = (dOc)localdOc2;
      Jg localJg = localdOc3.getAppearance();
      localJg.setElementMap(localcpa);
      localdOc2.bb(localJg);
      localJg.brn();
      String str1 = "blueRadioDefaultBackground";
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
      localaAR1.setX(2);
      localaAR1.setY(476);
      localaAR1.setWidth(1);
      localaAR1.setHeight(7);
      localaAR1.setTexture(this.W.aH("default_0.tga"));
      localaen.bb(localaAR1);
      localaAR1.brn();
      localaAR1.rV();
      localaen.rV();
      String str2 = "blueRadioDefaultBorder";
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
      localaAR2.setX(751);
      localaAR2.setY(227);
      localaAR2.setWidth(5);
      localaAR2.setHeight(5);
      localaAR2.setTexture(this.W.aH("default_1.tga"));
      localCx.bb(localaAR2);
      localaAR2.brn();
      localaAR2.rV();
      aAR localaAR3 = aAR.checkOut();
      localaAR3.setElementMap(localcpa);
      localaAR3.setPosition(ajb.dhT);
      localaAR3.setX(107);
      localaAR3.setY(357);
      localaAR3.setWidth(1);
      localaAR3.setHeight(5);
      localaAR3.setTexture(this.W.aH("default_0.tga"));
      localCx.bb(localaAR3);
      localaAR3.brn();
      localaAR3.rV();
      aAR localaAR4 = aAR.checkOut();
      localaAR4.setElementMap(localcpa);
      localaAR4.setPosition(ajb.dhV);
      localaAR4.setX(928);
      localaAR4.setY(170);
      localaAR4.setWidth(5);
      localaAR4.setHeight(5);
      localaAR4.setTexture(this.W.aH("default_1.tga"));
      localCx.bb(localaAR4);
      localaAR4.brn();
      localaAR4.rV();
      aAR localaAR5 = aAR.checkOut();
      localaAR5.setElementMap(localcpa);
      localaAR5.setPosition(ajb.dia);
      localaAR5.setX(337);
      localaAR5.setY(279);
      localaAR5.setWidth(5);
      localaAR5.setHeight(8);
      localaAR5.setTexture(this.W.aH("default_0.tga"));
      localCx.bb(localaAR5);
      localaAR5.brn();
      localaAR5.rV();
      aAR localaAR6 = aAR.checkOut();
      localaAR6.setElementMap(localcpa);
      localaAR6.setPosition(ajb.dih);
      localaAR6.setX(360);
      localaAR6.setY(93);
      localaAR6.setWidth(5);
      localaAR6.setHeight(7);
      localaAR6.setTexture(this.W.aH("default_0.tga"));
      localCx.bb(localaAR6);
      localaAR6.brn();
      localaAR6.rV();
      aAR localaAR7 = aAR.checkOut();
      localaAR7.setElementMap(localcpa);
      localaAR7.setPosition(ajb.dif);
      localaAR7.setX(108);
      localaAR7.setY(443);
      localaAR7.setWidth(1);
      localaAR7.setHeight(7);
      localaAR7.setTexture(this.W.aH("default_0.tga"));
      localCx.bb(localaAR7);
      localaAR7.brn();
      localaAR7.rV();
      aAR localaAR8 = aAR.checkOut();
      localaAR8.setElementMap(localcpa);
      localaAR8.setPosition(ajb.did);
      localaAR8.setX(967);
      localaAR8.setY(103);
      localaAR8.setWidth(5);
      localaAR8.setHeight(7);
      localaAR8.setTexture(this.W.aH("default_0.tga"));
      localCx.bb(localaAR8);
      localaAR8.brn();
      localaAR8.rV();
      aAR localaAR9 = aAR.checkOut();
      localaAR9.setElementMap(localcpa);
      localaAR9.setPosition(ajb.dhY);
      localaAR9.setX(515);
      localaAR9.setY(267);
      localaAR9.setWidth(5);
      localaAR9.setHeight(8);
      localaAR9.setTexture(this.W.aH("default_0.tga"));
      localCx.bb(localaAR9);
      localaAR9.brn();
      localaAR9.rV();
      localCx.rV();
      String str3 = "mecanicBlueColor";
      cAf localcAf = cAf.checkOut();
      localcAf.setElementMap(localcpa);
      if ((localcpa != null) && (str3 != null))
        localcpa.a(str3, localcAf);
      localcAf.setColor(new bNa(0.32F, 0.39F, 0.42F, 1.0F));
      localJg.bb(localcAf);
      localcAf.brn();
      localcAf.rV();
      localJg.rV();
    }
  }
}