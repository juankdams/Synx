import java.util.Stack;

public class aFY
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
    localJg1.setState("default");
    paramdOc.bb(localJg1);
    localJg1.brn();
    bJA localbJA = bJA.checkOut();
    localbJA.setRenderer(cBQ.cxL().bSM().aI("styleBoldSmallTitleFont"));
    localbJA.setElementMap(localcpa);
    localJg1.bb(localbJA);
    localbJA.brn();
    localbJA.rV();
    String str1 = "blackColor";
    cAf localcAf = cAf.checkOut();
    localcAf.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localcAf);
    localcAf.setColor(new bNa(0.0F, 0.0F, 0.0F, 1.0F));
    localJg1.bb(localcAf);
    localcAf.brn();
    localcAf.rV();
    String str2 = "buttonWoodenBackgroundDefault";
    aen localaen1 = aen.checkOut();
    localaen1.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localaen1);
    localJg1.bb(localaen1);
    localaen1.brn();
    aAR localaAR1 = aAR.checkOut();
    localaAR1.setElementMap(localcpa);
    localaAR1.setPosition(ajb.dhR);
    localaAR1.setX(240);
    localaAR1.setY(146);
    localaAR1.setWidth(12);
    localaAR1.setHeight(7);
    localaAR1.setTexture(this.W.aH("default_0.tga"));
    localaen1.bb(localaAR1);
    localaAR1.brn();
    localaAR1.rV();
    aAR localaAR2 = aAR.checkOut();
    localaAR2.setElementMap(localcpa);
    localaAR2.setPosition(ajb.dhT);
    localaAR2.setX(2);
    localaAR2.setY(546);
    localaAR2.setWidth(1);
    localaAR2.setHeight(7);
    localaAR2.setTexture(this.W.aH("default_0.tga"));
    localaen1.bb(localaAR2);
    localaAR2.brn();
    localaAR2.rV();
    aAR localaAR3 = aAR.checkOut();
    localaAR3.setElementMap(localcpa);
    localaAR3.setFlipHorizontaly(true);
    localaAR3.setPosition(ajb.dhV);
    localaAR3.setX(240);
    localaAR3.setY(146);
    localaAR3.setWidth(12);
    localaAR3.setHeight(7);
    localaAR3.setTexture(this.W.aH("default_0.tga"));
    localaen1.bb(localaAR3);
    localaAR3.brn();
    localaAR3.rV();
    aAR localaAR4 = aAR.checkOut();
    localaAR4.setElementMap(localcpa);
    localaAR4.setPosition(ajb.dhY);
    localaAR4.setX(996);
    localaAR4.setY(145);
    localaAR4.setWidth(12);
    localaAR4.setHeight(2);
    localaAR4.setTexture(this.W.aH("default_0.tga"));
    localaen1.bb(localaAR4);
    localaAR4.brn();
    localaAR4.rV();
    aAR localaAR5 = aAR.checkOut();
    localaAR5.setElementMap(localcpa);
    localaAR5.setFlipHorizontaly(true);
    localaAR5.setPosition(ajb.dia);
    localaAR5.setX(996);
    localaAR5.setY(145);
    localaAR5.setWidth(12);
    localaAR5.setHeight(2);
    localaAR5.setTexture(this.W.aH("default_0.tga"));
    localaen1.bb(localaAR5);
    localaAR5.brn();
    localaAR5.rV();
    aAR localaAR6 = aAR.checkOut();
    localaAR6.setElementMap(localcpa);
    localaAR6.setPosition(ajb.did);
    localaAR6.setX(156);
    localaAR6.setY(333);
    localaAR6.setWidth(12);
    localaAR6.setHeight(16);
    localaAR6.setTexture(this.W.aH("default_0.tga"));
    localaen1.bb(localaAR6);
    localaAR6.brn();
    localaAR6.rV();
    aAR localaAR7 = aAR.checkOut();
    localaAR7.setElementMap(localcpa);
    localaAR7.setPosition(ajb.dif);
    localaAR7.setX(655);
    localaAR7.setY(770);
    localaAR7.setWidth(1);
    localaAR7.setHeight(16);
    localaAR7.setTexture(this.W.aH("default_0.tga"));
    localaen1.bb(localaAR7);
    localaAR7.brn();
    localaAR7.rV();
    aAR localaAR8 = aAR.checkOut();
    localaAR8.setElementMap(localcpa);
    localaAR8.setFlipHorizontaly(true);
    localaAR8.setPosition(ajb.dih);
    localaAR8.setX(156);
    localaAR8.setY(333);
    localaAR8.setWidth(12);
    localaAR8.setHeight(16);
    localaAR8.setTexture(this.W.aH("default_0.tga"));
    localaen1.bb(localaAR8);
    localaAR8.brn();
    localaAR8.rV();
    aAR localaAR9 = aAR.checkOut();
    localaAR9.setElementMap(localcpa);
    localaAR9.setPosition(ajb.dhZ);
    localaAR9.setX(2);
    localaAR9.setY(247);
    localaAR9.setWidth(1);
    localaAR9.setHeight(2);
    localaAR9.setTexture(this.W.aH("default_0.tga"));
    localaen1.bb(localaAR9);
    localaAR9.brn();
    localaAR9.rV();
    localaen1.rV();
    localJg1.rV();
    dOc localdOc3 = paramdOc;
    Jg localJg2 = localdOc3.getAppearance();
    localJg2.setElementMap(localcpa);
    localJg2.setState("mouseHover");
    paramdOc.bb(localJg2);
    localJg2.brn();
    String str3 = "buttonWoodenBackgroundOver";
    aen localaen2 = aen.checkOut();
    localaen2.setElementMap(localcpa);
    if ((localcpa != null) && (str3 != null))
      localcpa.a(str3, localaen2);
    localJg2.bb(localaen2);
    localaen2.brn();
    aAR localaAR10 = aAR.checkOut();
    localaAR10.setElementMap(localcpa);
    localaAR10.setPosition(ajb.dhR);
    localaAR10.setX(207);
    localaAR10.setY(213);
    localaAR10.setWidth(12);
    localaAR10.setHeight(7);
    localaAR10.setTexture(this.W.aH("default_0.tga"));
    localaen2.bb(localaAR10);
    localaAR10.brn();
    localaAR10.rV();
    aAR localaAR11 = aAR.checkOut();
    localaAR11.setElementMap(localcpa);
    localaAR11.setPosition(ajb.dhT);
    localaAR11.setX(930);
    localaAR11.setY(457);
    localaAR11.setWidth(1);
    localaAR11.setHeight(7);
    localaAR11.setTexture(this.W.aH("default_0.tga"));
    localaen2.bb(localaAR11);
    localaAR11.brn();
    localaAR11.rV();
    aAR localaAR12 = aAR.checkOut();
    localaAR12.setElementMap(localcpa);
    localaAR12.setFlipHorizontaly(true);
    localaAR12.setPosition(ajb.dhV);
    localaAR12.setX(207);
    localaAR12.setY(213);
    localaAR12.setWidth(12);
    localaAR12.setHeight(7);
    localaAR12.setTexture(this.W.aH("default_0.tga"));
    localaen2.bb(localaAR12);
    localaAR12.brn();
    localaAR12.rV();
    aAR localaAR13 = aAR.checkOut();
    localaAR13.setElementMap(localcpa);
    localaAR13.setPosition(ajb.dhY);
    localaAR13.setX(84);
    localaAR13.setY(145);
    localaAR13.setWidth(12);
    localaAR13.setHeight(2);
    localaAR13.setTexture(this.W.aH("default_0.tga"));
    localaen2.bb(localaAR13);
    localaAR13.brn();
    localaAR13.rV();
    aAR localaAR14 = aAR.checkOut();
    localaAR14.setElementMap(localcpa);
    localaAR14.setFlipHorizontaly(true);
    localaAR14.setPosition(ajb.dia);
    localaAR14.setX(84);
    localaAR14.setY(145);
    localaAR14.setWidth(12);
    localaAR14.setHeight(2);
    localaAR14.setTexture(this.W.aH("default_0.tga"));
    localaen2.bb(localaAR14);
    localaAR14.brn();
    localaAR14.rV();
    aAR localaAR15 = aAR.checkOut();
    localaAR15.setElementMap(localcpa);
    localaAR15.setPosition(ajb.did);
    localaAR15.setX(330);
    localaAR15.setY(291);
    localaAR15.setWidth(12);
    localaAR15.setHeight(16);
    localaAR15.setTexture(this.W.aH("default_0.tga"));
    localaen2.bb(localaAR15);
    localaAR15.brn();
    localaAR15.rV();
    aAR localaAR16 = aAR.checkOut();
    localaAR16.setElementMap(localcpa);
    localaAR16.setPosition(ajb.dif);
    localaAR16.setX(565);
    localaAR16.setY(753);
    localaAR16.setWidth(1);
    localaAR16.setHeight(16);
    localaAR16.setTexture(this.W.aH("default_0.tga"));
    localaen2.bb(localaAR16);
    localaAR16.brn();
    localaAR16.rV();
    aAR localaAR17 = aAR.checkOut();
    localaAR17.setElementMap(localcpa);
    localaAR17.setFlipHorizontaly(true);
    localaAR17.setPosition(ajb.dih);
    localaAR17.setX(330);
    localaAR17.setY(291);
    localaAR17.setWidth(12);
    localaAR17.setHeight(16);
    localaAR17.setTexture(this.W.aH("default_0.tga"));
    localaen2.bb(localaAR17);
    localaAR17.brn();
    localaAR17.rV();
    aAR localaAR18 = aAR.checkOut();
    localaAR18.setElementMap(localcpa);
    localaAR18.setPosition(ajb.dhZ);
    localaAR18.setX(2);
    localaAR18.setY(232);
    localaAR18.setWidth(1);
    localaAR18.setHeight(2);
    localaAR18.setTexture(this.W.aH("default_0.tga"));
    localaen2.bb(localaAR18);
    localaAR18.brn();
    localaAR18.rV();
    localaen2.rV();
    localJg2.rV();
    dOc localdOc4 = paramdOc;
    Jg localJg3 = localdOc4.getAppearance();
    localJg3.setElementMap(localcpa);
    localJg3.setState("pressed");
    paramdOc.bb(localJg3);
    localJg3.brn();
    String str4 = "buttonWoodenBackgroundPressed";
    aen localaen3 = aen.checkOut();
    localaen3.setElementMap(localcpa);
    if ((localcpa != null) && (str4 != null))
      localcpa.a(str4, localaen3);
    localJg3.bb(localaen3);
    localaen3.brn();
    aAR localaAR19 = aAR.checkOut();
    localaAR19.setElementMap(localcpa);
    localaAR19.setPosition(ajb.dhR);
    localaAR19.setX(326);
    localaAR19.setY(140);
    localaAR19.setWidth(12);
    localaAR19.setHeight(7);
    localaAR19.setTexture(this.W.aH("default_1.tga"));
    localaen3.bb(localaAR19);
    localaAR19.brn();
    localaAR19.rV();
    aAR localaAR20 = aAR.checkOut();
    localaAR20.setElementMap(localcpa);
    localaAR20.setPosition(ajb.dhT);
    localaAR20.setX(108);
    localaAR20.setY(463);
    localaAR20.setWidth(1);
    localaAR20.setHeight(7);
    localaAR20.setTexture(this.W.aH("default_0.tga"));
    localaen3.bb(localaAR20);
    localaAR20.brn();
    localaAR20.rV();
    aAR localaAR21 = aAR.checkOut();
    localaAR21.setElementMap(localcpa);
    localaAR21.setFlipHorizontaly(true);
    localaAR21.setPosition(ajb.dhV);
    localaAR21.setX(326);
    localaAR21.setY(140);
    localaAR21.setWidth(12);
    localaAR21.setHeight(7);
    localaAR21.setTexture(this.W.aH("default_1.tga"));
    localaen3.bb(localaAR21);
    localaAR21.brn();
    localaAR21.rV();
    aAR localaAR22 = aAR.checkOut();
    localaAR22.setElementMap(localcpa);
    localaAR22.setPosition(ajb.dhY);
    localaAR22.setX(449);
    localaAR22.setY(135);
    localaAR22.setWidth(12);
    localaAR22.setHeight(1);
    localaAR22.setTexture(this.W.aH("default_1.tga"));
    localaen3.bb(localaAR22);
    localaAR22.brn();
    localaAR22.rV();
    aAR localaAR23 = aAR.checkOut();
    localaAR23.setElementMap(localcpa);
    localaAR23.setFlipHorizontaly(true);
    localaAR23.setPosition(ajb.dia);
    localaAR23.setX(449);
    localaAR23.setY(135);
    localaAR23.setWidth(12);
    localaAR23.setHeight(1);
    localaAR23.setTexture(this.W.aH("default_1.tga"));
    localaen3.bb(localaAR23);
    localaAR23.brn();
    localaAR23.rV();
    aAR localaAR24 = aAR.checkOut();
    localaAR24.setElementMap(localcpa);
    localaAR24.setPosition(ajb.did);
    localaAR24.setX(559);
    localaAR24.setY(270);
    localaAR24.setWidth(12);
    localaAR24.setHeight(16);
    localaAR24.setTexture(this.W.aH("default_0.tga"));
    localaen3.bb(localaAR24);
    localaAR24.brn();
    localaAR24.rV();
    aAR localaAR25 = aAR.checkOut();
    localaAR25.setElementMap(localcpa);
    localaAR25.setPosition(ajb.dif);
    localaAR25.setX(425);
    localaAR25.setY(776);
    localaAR25.setWidth(1);
    localaAR25.setHeight(16);
    localaAR25.setTexture(this.W.aH("default_0.tga"));
    localaen3.bb(localaAR25);
    localaAR25.brn();
    localaAR25.rV();
    aAR localaAR26 = aAR.checkOut();
    localaAR26.setElementMap(localcpa);
    localaAR26.setFlipHorizontaly(true);
    localaAR26.setPosition(ajb.dih);
    localaAR26.setX(559);
    localaAR26.setY(270);
    localaAR26.setWidth(12);
    localaAR26.setHeight(16);
    localaAR26.setTexture(this.W.aH("default_0.tga"));
    localaen3.bb(localaAR26);
    localaAR26.brn();
    localaAR26.rV();
    aAR localaAR27 = aAR.checkOut();
    localaAR27.setElementMap(localcpa);
    localaAR27.setPosition(ajb.dhZ);
    localaAR27.setX(255);
    localaAR27.setY(152);
    localaAR27.setWidth(1);
    localaAR27.setHeight(1);
    localaAR27.setTexture(this.W.aH("default_0.tga"));
    localaen3.bb(localaAR27);
    localaAR27.brn();
    localaAR27.rV();
    localaen3.rV();
    localJg3.rV();
    dOc localdOc5 = paramdOc;
    Jg localJg4 = localdOc5.getAppearance();
    localJg4.setElementMap(localcpa);
    localJg4.setState("disabled");
    paramdOc.bb(localJg4);
    localJg4.brn();
    String str5 = "buttonWoodenBackgroundDisabled";
    aen localaen4 = aen.checkOut();
    localaen4.setElementMap(localcpa);
    if ((localcpa != null) && (str5 != null))
      localcpa.a(str5, localaen4);
    localJg4.bb(localaen4);
    localaen4.brn();
    aAR localaAR28 = aAR.checkOut();
    localaAR28.setElementMap(localcpa);
    localaAR28.setPosition(ajb.dhR);
    localaAR28.setX(240);
    localaAR28.setY(146);
    localaAR28.setWidth(12);
    localaAR28.setHeight(7);
    localaAR28.setTexture(this.W.aH("default_0.tga"));
    localaen4.bb(localaAR28);
    localaAR28.brn();
    localaAR28.rV();
    aAR localaAR29 = aAR.checkOut();
    localaAR29.setElementMap(localcpa);
    localaAR29.setPosition(ajb.dhT);
    localaAR29.setX(2);
    localaAR29.setY(546);
    localaAR29.setWidth(1);
    localaAR29.setHeight(7);
    localaAR29.setTexture(this.W.aH("default_0.tga"));
    localaen4.bb(localaAR29);
    localaAR29.brn();
    localaAR29.rV();
    aAR localaAR30 = aAR.checkOut();
    localaAR30.setElementMap(localcpa);
    localaAR30.setFlipHorizontaly(true);
    localaAR30.setPosition(ajb.dhV);
    localaAR30.setX(240);
    localaAR30.setY(146);
    localaAR30.setWidth(12);
    localaAR30.setHeight(7);
    localaAR30.setTexture(this.W.aH("default_0.tga"));
    localaen4.bb(localaAR30);
    localaAR30.brn();
    localaAR30.rV();
    aAR localaAR31 = aAR.checkOut();
    localaAR31.setElementMap(localcpa);
    localaAR31.setPosition(ajb.dhY);
    localaAR31.setX(587);
    localaAR31.setY(195);
    localaAR31.setWidth(12);
    localaAR31.setHeight(1);
    localaAR31.setTexture(this.W.aH("default_1.tga"));
    localaen4.bb(localaAR31);
    localaAR31.brn();
    localaAR31.rV();
    aAR localaAR32 = aAR.checkOut();
    localaAR32.setElementMap(localcpa);
    localaAR32.setFlipHorizontaly(true);
    localaAR32.setPosition(ajb.dia);
    localaAR32.setX(587);
    localaAR32.setY(195);
    localaAR32.setWidth(12);
    localaAR32.setHeight(1);
    localaAR32.setTexture(this.W.aH("default_1.tga"));
    localaen4.bb(localaAR32);
    localaAR32.brn();
    localaAR32.rV();
    aAR localaAR33 = aAR.checkOut();
    localaAR33.setElementMap(localcpa);
    localaAR33.setPosition(ajb.did);
    localaAR33.setX(156);
    localaAR33.setY(333);
    localaAR33.setWidth(12);
    localaAR33.setHeight(16);
    localaAR33.setTexture(this.W.aH("default_0.tga"));
    localaen4.bb(localaAR33);
    localaAR33.brn();
    localaAR33.rV();
    aAR localaAR34 = aAR.checkOut();
    localaAR34.setElementMap(localcpa);
    localaAR34.setPosition(ajb.dif);
    localaAR34.setX(655);
    localaAR34.setY(770);
    localaAR34.setWidth(1);
    localaAR34.setHeight(16);
    localaAR34.setTexture(this.W.aH("default_0.tga"));
    localaen4.bb(localaAR34);
    localaAR34.brn();
    localaAR34.rV();
    aAR localaAR35 = aAR.checkOut();
    localaAR35.setElementMap(localcpa);
    localaAR35.setFlipHorizontaly(true);
    localaAR35.setPosition(ajb.dih);
    localaAR35.setX(156);
    localaAR35.setY(333);
    localaAR35.setWidth(12);
    localaAR35.setHeight(16);
    localaAR35.setTexture(this.W.aH("default_0.tga"));
    localaen4.bb(localaAR35);
    localaAR35.brn();
    localaAR35.rV();
    aAR localaAR36 = aAR.checkOut();
    localaAR36.setElementMap(localcpa);
    localaAR36.setPosition(ajb.dhZ);
    localaAR36.setX(2);
    localaAR36.setY(204);
    localaAR36.setWidth(1);
    localaAR36.setHeight(1);
    localaAR36.setTexture(this.W.aH("default_0.tga"));
    localaen4.bb(localaAR36);
    localaAR36.brn();
    localaAR36.rV();
    localaen4.rV();
    localJg4.rV();
  }
}