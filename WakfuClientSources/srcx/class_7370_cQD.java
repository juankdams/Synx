import java.util.Stack;

public class cQD
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
      String str1 = "buttonFlatBorderDefault";
      Cx localCx = new Cx();
      localCx.aJ();
      localCx.setElementMap(localcpa);
      if ((localcpa != null) && (str1 != null))
        localcpa.a(str1, localCx);
      localJg.bb(localCx);
      localCx.brn();
      aAR localaAR1 = aAR.checkOut();
      localaAR1.setElementMap(localcpa);
      localaAR1.setPosition(ajb.dhR);
      localaAR1.setX(247);
      localaAR1.setY(645);
      localaAR1.setWidth(3);
      localaAR1.setHeight(3);
      localaAR1.setTexture(this.W.aH("default_0.tga"));
      localCx.bb(localaAR1);
      localaAR1.brn();
      localaAR1.rV();
      aAR localaAR2 = aAR.checkOut();
      localaAR2.setElementMap(localcpa);
      localaAR2.setPosition(ajb.dhT);
      localaAR2.setX(2);
      localaAR2.setY(303);
      localaAR2.setWidth(1);
      localaAR2.setHeight(3);
      localaAR2.setTexture(this.W.aH("default_0.tga"));
      localCx.bb(localaAR2);
      localaAR2.brn();
      localaAR2.rV();
      aAR localaAR3 = aAR.checkOut();
      localaAR3.setElementMap(localcpa);
      localaAR3.setPosition(ajb.dhV);
      localaAR3.setX(745);
      localaAR3.setY(252);
      localaAR3.setWidth(3);
      localaAR3.setHeight(3);
      localaAR3.setTexture(this.W.aH("default_0.tga"));
      localCx.bb(localaAR3);
      localaAR3.brn();
      localaAR3.rV();
      aAR localaAR4 = aAR.checkOut();
      localaAR4.setElementMap(localcpa);
      localaAR4.setPosition(ajb.dhY);
      localaAR4.setX(397);
      localaAR4.setY(490);
      localaAR4.setWidth(3);
      localaAR4.setHeight(7);
      localaAR4.setTexture(this.W.aH("default_0.tga"));
      localCx.bb(localaAR4);
      localaAR4.brn();
      localaAR4.rV();
      aAR localaAR5 = aAR.checkOut();
      localaAR5.setElementMap(localcpa);
      localaAR5.setPosition(ajb.dia);
      localaAR5.setX(930);
      localaAR5.setY(487);
      localaAR5.setWidth(3);
      localaAR5.setHeight(7);
      localaAR5.setTexture(this.W.aH("default_0.tga"));
      localCx.bb(localaAR5);
      localaAR5.brn();
      localaAR5.rV();
      aAR localaAR6 = aAR.checkOut();
      localaAR6.setElementMap(localcpa);
      localaAR6.setPosition(ajb.did);
      localaAR6.setX(745);
      localaAR6.setY(332);
      localaAR6.setWidth(3);
      localaAR6.setHeight(3);
      localaAR6.setTexture(this.W.aH("default_0.tga"));
      localCx.bb(localaAR6);
      localaAR6.brn();
      localaAR6.rV();
      aAR localaAR7 = aAR.checkOut();
      localaAR7.setElementMap(localcpa);
      localaAR7.setPosition(ajb.dif);
      localaAR7.setX(2);
      localaAR7.setY(291);
      localaAR7.setWidth(1);
      localaAR7.setHeight(3);
      localaAR7.setTexture(this.W.aH("default_0.tga"));
      localCx.bb(localaAR7);
      localaAR7.brn();
      localaAR7.rV();
      aAR localaAR8 = aAR.checkOut();
      localaAR8.setElementMap(localcpa);
      localaAR8.setPosition(ajb.dih);
      localaAR8.setX(397);
      localaAR8.setY(193);
      localaAR8.setWidth(3);
      localaAR8.setHeight(3);
      localaAR8.setTexture(this.W.aH("default_0.tga"));
      localCx.bb(localaAR8);
      localaAR8.brn();
      localaAR8.rV();
      localCx.rV();
      String str2 = "buttonFlatBackgroundDefault";
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
      localaAR9.setX(399);
      localaAR9.setY(533);
      localaAR9.setWidth(1);
      localaAR9.setHeight(7);
      localaAR9.setTexture(this.W.aH("default_0.tga"));
      localaen.bb(localaAR9);
      localaAR9.brn();
      localaAR9.rV();
      localaen.rV();
      String str3 = "pressedLightColor";
      cAf localcAf = cAf.checkOut();
      localcAf.setElementMap(localcpa);
      if ((localcpa != null) && (str3 != null))
        localcpa.a(str3, localcAf);
      localcAf.setColor(new bNa(0.7F, 0.7F, 0.6F, 1.0F));
      localJg.bb(localcAf);
      localcAf.brn();
      localcAf.rV();
      localJg.rV();
    }
  }
}