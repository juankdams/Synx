import java.util.Stack;

public class bks
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
    dOc localdOc2 = paramdOc;
    Jg localJg1 = localdOc2.getAppearance();
    localJg1.setElementMap(localcpa);
    localJg1.setModulationColor(new bNa(0.46F, 0.43F, 0.36F, 1.0F));
    localJg1.setState("default");
    paramdOc.bb(localJg1);
    localJg1.brn();
    bJA localbJA = bJA.checkOut();
    localbJA.setRenderer(cBQ.cxL().bSM().aI("defaultBoldFont"));
    localbJA.setElementMap(localcpa);
    localJg1.bb(localbJA);
    localbJA.brn();
    localbJA.rV();
    String str1 = "defaultLightColor";
    cAf localcAf = cAf.checkOut();
    localcAf.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localcAf);
    localcAf.setColor(new bNa(1.0F, 1.0F, 1.0F, 1.0F));
    localJg1.bb(localcAf);
    localcAf.brn();
    localcAf.rV();
    String str2 = "buttonFlatBackgroundDefault";
    aen localaen1 = aen.checkOut();
    localaen1.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localaen1);
    localaen1.setScaled(true);
    localJg1.bb(localaen1);
    localaen1.brn();
    aAR localaAR1 = aAR.checkOut();
    localaAR1.setElementMap(localcpa);
    localaAR1.setPosition(ajb.dhZ);
    localaAR1.setX(399);
    localaAR1.setY(533);
    localaAR1.setWidth(1);
    localaAR1.setHeight(7);
    localaAR1.setTexture(this.W.aH("default_0.tga"));
    localaen1.bb(localaAR1);
    localaAR1.brn();
    localaAR1.rV();
    localaen1.rV();
    String str3 = "buttonFlatBorderDefault";
    Cx localCx1 = new Cx();
    localCx1.aJ();
    localCx1.setElementMap(localcpa);
    if ((localcpa != null) && (str3 != null))
      localcpa.a(str3, localCx1);
    localJg1.bb(localCx1);
    localCx1.brn();
    aAR localaAR2 = aAR.checkOut();
    localaAR2.setElementMap(localcpa);
    localaAR2.setPosition(ajb.dhR);
    localaAR2.setX(247);
    localaAR2.setY(645);
    localaAR2.setWidth(3);
    localaAR2.setHeight(3);
    localaAR2.setTexture(this.W.aH("default_0.tga"));
    localCx1.bb(localaAR2);
    localaAR2.brn();
    localaAR2.rV();
    aAR localaAR3 = aAR.checkOut();
    localaAR3.setElementMap(localcpa);
    localaAR3.setPosition(ajb.dhT);
    localaAR3.setX(2);
    localaAR3.setY(303);
    localaAR3.setWidth(1);
    localaAR3.setHeight(3);
    localaAR3.setTexture(this.W.aH("default_0.tga"));
    localCx1.bb(localaAR3);
    localaAR3.brn();
    localaAR3.rV();
    aAR localaAR4 = aAR.checkOut();
    localaAR4.setElementMap(localcpa);
    localaAR4.setPosition(ajb.dhV);
    localaAR4.setX(745);
    localaAR4.setY(252);
    localaAR4.setWidth(3);
    localaAR4.setHeight(3);
    localaAR4.setTexture(this.W.aH("default_0.tga"));
    localCx1.bb(localaAR4);
    localaAR4.brn();
    localaAR4.rV();
    aAR localaAR5 = aAR.checkOut();
    localaAR5.setElementMap(localcpa);
    localaAR5.setPosition(ajb.dhY);
    localaAR5.setX(397);
    localaAR5.setY(490);
    localaAR5.setWidth(3);
    localaAR5.setHeight(7);
    localaAR5.setTexture(this.W.aH("default_0.tga"));
    localCx1.bb(localaAR5);
    localaAR5.brn();
    localaAR5.rV();
    aAR localaAR6 = aAR.checkOut();
    localaAR6.setElementMap(localcpa);
    localaAR6.setPosition(ajb.dia);
    localaAR6.setX(930);
    localaAR6.setY(487);
    localaAR6.setWidth(3);
    localaAR6.setHeight(7);
    localaAR6.setTexture(this.W.aH("default_0.tga"));
    localCx1.bb(localaAR6);
    localaAR6.brn();
    localaAR6.rV();
    aAR localaAR7 = aAR.checkOut();
    localaAR7.setElementMap(localcpa);
    localaAR7.setPosition(ajb.did);
    localaAR7.setX(745);
    localaAR7.setY(332);
    localaAR7.setWidth(3);
    localaAR7.setHeight(3);
    localaAR7.setTexture(this.W.aH("default_0.tga"));
    localCx1.bb(localaAR7);
    localaAR7.brn();
    localaAR7.rV();
    aAR localaAR8 = aAR.checkOut();
    localaAR8.setElementMap(localcpa);
    localaAR8.setPosition(ajb.dif);
    localaAR8.setX(2);
    localaAR8.setY(291);
    localaAR8.setWidth(1);
    localaAR8.setHeight(3);
    localaAR8.setTexture(this.W.aH("default_0.tga"));
    localCx1.bb(localaAR8);
    localaAR8.brn();
    localaAR8.rV();
    aAR localaAR9 = aAR.checkOut();
    localaAR9.setElementMap(localcpa);
    localaAR9.setPosition(ajb.dih);
    localaAR9.setX(397);
    localaAR9.setY(193);
    localaAR9.setWidth(3);
    localaAR9.setHeight(3);
    localaAR9.setTexture(this.W.aH("default_0.tga"));
    localCx1.bb(localaAR9);
    localaAR9.brn();
    localaAR9.rV();
    localCx1.rV();
    localJg1.rV();
    dOc localdOc3 = paramdOc;
    Jg localJg2 = localdOc3.getAppearance();
    localJg2.setElementMap(localcpa);
    localJg2.setState("mouseHover");
    paramdOc.bb(localJg2);
    localJg2.brn();
    String str4 = "buttonFlatBackgroundOver";
    aen localaen2 = aen.checkOut();
    localaen2.setElementMap(localcpa);
    if ((localcpa != null) && (str4 != null))
      localcpa.a(str4, localaen2);
    localaen2.setScaled(true);
    localJg2.bb(localaen2);
    localaen2.brn();
    aAR localaAR10 = aAR.checkOut();
    localaAR10.setElementMap(localcpa);
    localaAR10.setPosition(ajb.dhZ);
    localaAR10.setX(399);
    localaAR10.setY(533);
    localaAR10.setWidth(1);
    localaAR10.setHeight(7);
    localaAR10.setTexture(this.W.aH("default_0.tga"));
    localaen2.bb(localaAR10);
    localaAR10.brn();
    localaAR10.rV();
    localaen2.rV();
    String str5 = "buttonFlatBorderOver";
    Cx localCx2 = new Cx();
    localCx2.aJ();
    localCx2.setElementMap(localcpa);
    if ((localcpa != null) && (str5 != null))
      localcpa.a(str5, localCx2);
    localJg2.bb(localCx2);
    localCx2.brn();
    aAR localaAR11 = aAR.checkOut();
    localaAR11.setElementMap(localcpa);
    localaAR11.setPosition(ajb.dhR);
    localaAR11.setX(745);
    localaAR11.setY(270);
    localaAR11.setWidth(3);
    localaAR11.setHeight(3);
    localaAR11.setTexture(this.W.aH("default_0.tga"));
    localCx2.bb(localaAR11);
    localaAR11.brn();
    localaAR11.rV();
    aAR localaAR12 = aAR.checkOut();
    localaAR12.setElementMap(localcpa);
    localaAR12.setPosition(ajb.dhT);
    localaAR12.setX(2);
    localaAR12.setY(285);
    localaAR12.setWidth(1);
    localaAR12.setHeight(3);
    localaAR12.setTexture(this.W.aH("default_0.tga"));
    localCx2.bb(localaAR12);
    localaAR12.brn();
    localaAR12.rV();
    aAR localaAR13 = aAR.checkOut();
    localaAR13.setElementMap(localcpa);
    localaAR13.setPosition(ajb.dhV);
    localaAR13.setX(517);
    localaAR13.setY(215);
    localaAR13.setWidth(3);
    localaAR13.setHeight(3);
    localaAR13.setTexture(this.W.aH("default_0.tga"));
    localCx2.bb(localaAR13);
    localaAR13.brn();
    localaAR13.rV();
    aAR localaAR14 = aAR.checkOut();
    localaAR14.setElementMap(localcpa);
    localaAR14.setPosition(ajb.dhY);
    localaAR14.setX(930);
    localaAR14.setY(497);
    localaAR14.setWidth(3);
    localaAR14.setHeight(7);
    localaAR14.setTexture(this.W.aH("default_0.tga"));
    localCx2.bb(localaAR14);
    localaAR14.brn();
    localaAR14.rV();
    aAR localaAR15 = aAR.checkOut();
    localaAR15.setElementMap(localcpa);
    localaAR15.setPosition(ajb.dia);
    localaAR15.setX(930);
    localaAR15.setY(507);
    localaAR15.setWidth(3);
    localaAR15.setHeight(7);
    localaAR15.setTexture(this.W.aH("default_0.tga"));
    localCx2.bb(localaAR15);
    localaAR15.brn();
    localaAR15.rV();
    aAR localaAR16 = aAR.checkOut();
    localaAR16.setElementMap(localcpa);
    localaAR16.setPosition(ajb.did);
    localaAR16.setX(745);
    localaAR16.setY(264);
    localaAR16.setWidth(3);
    localaAR16.setHeight(3);
    localaAR16.setTexture(this.W.aH("default_0.tga"));
    localCx2.bb(localaAR16);
    localaAR16.brn();
    localaAR16.rV();
    aAR localaAR17 = aAR.checkOut();
    localaAR17.setElementMap(localcpa);
    localaAR17.setPosition(ajb.dif);
    localaAR17.setX(518);
    localaAR17.setY(332);
    localaAR17.setWidth(1);
    localaAR17.setHeight(3);
    localaAR17.setTexture(this.W.aH("default_0.tga"));
    localCx2.bb(localaAR17);
    localaAR17.brn();
    localaAR17.rV();
    aAR localaAR18 = aAR.checkOut();
    localaAR18.setElementMap(localcpa);
    localaAR18.setPosition(ajb.dih);
    localaAR18.setX(397);
    localaAR18.setY(205);
    localaAR18.setWidth(3);
    localaAR18.setHeight(3);
    localaAR18.setTexture(this.W.aH("default_0.tga"));
    localCx2.bb(localaAR18);
    localaAR18.brn();
    localaAR18.rV();
    localCx2.rV();
    localJg2.rV();
    dOc localdOc4 = paramdOc;
    Jg localJg3 = localdOc4.getAppearance();
    localJg3.setElementMap(localcpa);
    localJg3.setState("pressed");
    paramdOc.bb(localJg3);
    localJg3.brn();
    String str6 = "buttonFlatBackgroundPressed";
    aen localaen3 = aen.checkOut();
    localaen3.setElementMap(localcpa);
    if ((localcpa != null) && (str6 != null))
      localcpa.a(str6, localaen3);
    localaen3.setScaled(true);
    localJg3.bb(localaen3);
    localaen3.brn();
    aAR localaAR19 = aAR.checkOut();
    localaAR19.setElementMap(localcpa);
    localaAR19.setPosition(ajb.dhZ);
    localaAR19.setX(108);
    localaAR19.setY(453);
    localaAR19.setWidth(1);
    localaAR19.setHeight(7);
    localaAR19.setTexture(this.W.aH("default_0.tga"));
    localaen3.bb(localaAR19);
    localaAR19.brn();
    localaAR19.rV();
    localaen3.rV();
    String str7 = "buttonFlatBorderPressed";
    Cx localCx3 = new Cx();
    localCx3.aJ();
    localCx3.setElementMap(localcpa);
    if ((localcpa != null) && (str7 != null))
      localcpa.a(str7, localCx3);
    localJg3.bb(localCx3);
    localCx3.brn();
    aAR localaAR20 = aAR.checkOut();
    localaAR20.setElementMap(localcpa);
    localaAR20.setPosition(ajb.dhR);
    localaAR20.setX(745);
    localaAR20.setY(270);
    localaAR20.setWidth(3);
    localaAR20.setHeight(3);
    localaAR20.setTexture(this.W.aH("default_0.tga"));
    localCx3.bb(localaAR20);
    localaAR20.brn();
    localaAR20.rV();
    aAR localaAR21 = aAR.checkOut();
    localaAR21.setElementMap(localcpa);
    localaAR21.setPosition(ajb.dhT);
    localaAR21.setX(2);
    localaAR21.setY(267);
    localaAR21.setWidth(1);
    localaAR21.setHeight(3);
    localaAR21.setTexture(this.W.aH("default_0.tga"));
    localCx3.bb(localaAR21);
    localaAR21.brn();
    localaAR21.rV();
    aAR localaAR22 = aAR.checkOut();
    localaAR22.setElementMap(localcpa);
    localaAR22.setPosition(ajb.dhV);
    localaAR22.setX(517);
    localaAR22.setY(215);
    localaAR22.setWidth(3);
    localaAR22.setHeight(3);
    localaAR22.setTexture(this.W.aH("default_0.tga"));
    localCx3.bb(localaAR22);
    localaAR22.brn();
    localaAR22.rV();
    aAR localaAR23 = aAR.checkOut();
    localaAR23.setElementMap(localcpa);
    localaAR23.setPosition(ajb.dhY);
    localaAR23.setX(397);
    localaAR23.setY(480);
    localaAR23.setWidth(3);
    localaAR23.setHeight(7);
    localaAR23.setTexture(this.W.aH("default_0.tga"));
    localCx3.bb(localaAR23);
    localaAR23.brn();
    localaAR23.rV();
    aAR localaAR24 = aAR.checkOut();
    localaAR24.setElementMap(localcpa);
    localaAR24.setPosition(ajb.dia);
    localaAR24.setX(397);
    localaAR24.setY(500);
    localaAR24.setWidth(3);
    localaAR24.setHeight(7);
    localaAR24.setTexture(this.W.aH("default_0.tga"));
    localCx3.bb(localaAR24);
    localaAR24.brn();
    localaAR24.rV();
    aAR localaAR25 = aAR.checkOut();
    localaAR25.setElementMap(localcpa);
    localaAR25.setPosition(ajb.did);
    localaAR25.setX(745);
    localaAR25.setY(264);
    localaAR25.setWidth(3);
    localaAR25.setHeight(3);
    localaAR25.setTexture(this.W.aH("default_0.tga"));
    localCx3.bb(localaAR25);
    localaAR25.brn();
    localaAR25.rV();
    aAR localaAR26 = aAR.checkOut();
    localaAR26.setElementMap(localcpa);
    localaAR26.setPosition(ajb.dif);
    localaAR26.setX(2);
    localaAR26.setY(273);
    localaAR26.setWidth(1);
    localaAR26.setHeight(3);
    localaAR26.setTexture(this.W.aH("default_0.tga"));
    localCx3.bb(localaAR26);
    localaAR26.brn();
    localaAR26.rV();
    aAR localaAR27 = aAR.checkOut();
    localaAR27.setElementMap(localcpa);
    localaAR27.setPosition(ajb.dih);
    localaAR27.setX(397);
    localaAR27.setY(205);
    localaAR27.setWidth(3);
    localaAR27.setHeight(3);
    localaAR27.setTexture(this.W.aH("default_0.tga"));
    localCx3.bb(localaAR27);
    localaAR27.brn();
    localaAR27.rV();
    localCx3.rV();
    localJg3.rV();
    dOc localdOc5 = paramdOc;
    Jg localJg4 = localdOc5.getAppearance();
    localJg4.setElementMap(localcpa);
    localJg4.setState("disabled");
    paramdOc.bb(localJg4);
    localJg4.brn();
    String str8 = "buttonFlatBackgroundDisabled";
    aen localaen4 = aen.checkOut();
    localaen4.setElementMap(localcpa);
    if ((localcpa != null) && (str8 != null))
      localcpa.a(str8, localaen4);
    localaen4.setScaled(true);
    localJg4.bb(localaen4);
    localaen4.brn();
    aAR localaAR28 = aAR.checkOut();
    localaAR28.setElementMap(localcpa);
    localaAR28.setPosition(ajb.dhZ);
    localaAR28.setX(2);
    localaAR28.setY(466);
    localaAR28.setWidth(1);
    localaAR28.setHeight(7);
    localaAR28.setTexture(this.W.aH("default_0.tga"));
    localaen4.bb(localaAR28);
    localaAR28.brn();
    localaAR28.rV();
    localaen4.rV();
    String str9 = "buttonFlatBorderDisabled";
    Cx localCx4 = new Cx();
    localCx4.aJ();
    localCx4.setElementMap(localcpa);
    if ((localcpa != null) && (str9 != null))
      localcpa.a(str9, localCx4);
    localJg4.bb(localCx4);
    localCx4.brn();
    aAR localaAR29 = aAR.checkOut();
    localaAR29.setElementMap(localcpa);
    localaAR29.setPosition(ajb.dhR);
    localaAR29.setX(745);
    localaAR29.setY(258);
    localaAR29.setWidth(3);
    localaAR29.setHeight(3);
    localaAR29.setTexture(this.W.aH("default_0.tga"));
    localCx4.bb(localaAR29);
    localaAR29.brn();
    localaAR29.rV();
    aAR localaAR30 = aAR.checkOut();
    localaAR30.setElementMap(localcpa);
    localaAR30.setPosition(ajb.dhT);
    localaAR30.setX(2);
    localaAR30.setY(279);
    localaAR30.setWidth(1);
    localaAR30.setHeight(3);
    localaAR30.setTexture(this.W.aH("default_0.tga"));
    localCx4.bb(localaAR30);
    localaAR30.brn();
    localaAR30.rV();
    aAR localaAR31 = aAR.checkOut();
    localaAR31.setElementMap(localcpa);
    localaAR31.setPosition(ajb.dhV);
    localaAR31.setX(397);
    localaAR31.setY(199);
    localaAR31.setWidth(3);
    localaAR31.setHeight(3);
    localaAR31.setTexture(this.W.aH("default_0.tga"));
    localCx4.bb(localaAR31);
    localaAR31.brn();
    localaAR31.rV();
    aAR localaAR32 = aAR.checkOut();
    localaAR32.setElementMap(localcpa);
    localaAR32.setPosition(ajb.dhY);
    localaAR32.setX(397);
    localaAR32.setY(470);
    localaAR32.setWidth(3);
    localaAR32.setHeight(7);
    localaAR32.setTexture(this.W.aH("default_0.tga"));
    localCx4.bb(localaAR32);
    localaAR32.brn();
    localaAR32.rV();
    aAR localaAR33 = aAR.checkOut();
    localaAR33.setElementMap(localcpa);
    localaAR33.setPosition(ajb.dia);
    localaAR33.setX(930);
    localaAR33.setY(477);
    localaAR33.setWidth(3);
    localaAR33.setHeight(7);
    localaAR33.setTexture(this.W.aH("default_0.tga"));
    localCx4.bb(localaAR33);
    localaAR33.brn();
    localaAR33.rV();
    aAR localaAR34 = aAR.checkOut();
    localaAR34.setElementMap(localcpa);
    localaAR34.setPosition(ajb.did);
    localaAR34.setX(397);
    localaAR34.setY(181);
    localaAR34.setWidth(3);
    localaAR34.setHeight(3);
    localaAR34.setTexture(this.W.aH("default_0.tga"));
    localCx4.bb(localaAR34);
    localaAR34.brn();
    localaAR34.rV();
    aAR localaAR35 = aAR.checkOut();
    localaAR35.setElementMap(localcpa);
    localaAR35.setPosition(ajb.dif);
    localaAR35.setX(2);
    localaAR35.setY(297);
    localaAR35.setWidth(1);
    localaAR35.setHeight(3);
    localaAR35.setTexture(this.W.aH("default_0.tga"));
    localCx4.bb(localaAR35);
    localaAR35.brn();
    localaAR35.rV();
    a(localCx4);
    localCx4.rV();
    localJg4.rV();
  }

  public bdj a(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localaAR.setPosition(ajb.dih);
    localaAR.setX(397);
    localaAR.setY(187);
    localaAR.setWidth(3);
    localaAR.setHeight(3);
    localaAR.setTexture(this.W.aH("default_0.tga"));
    parambdj.bb(localaAR);
    localaAR.brn();
    localaAR.rV();
    return localaAR;
  }
}