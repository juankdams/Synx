import java.awt.Insets;
import java.util.Stack;

public class bga
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
    paramdOc.bb(localJg1);
    localJg1.brn();
    dOc localdOc3 = (dOc)localJg1.getParentOfType(dOc.class);
    dOc localdOc4 = localdOc3.getWidgetByThemeElementName("horizontalIncreaseButton", false);
    Object localObject4;
    Object localObject5;
    Object localObject6;
    Object localObject7;
    Object localObject8;
    Object localObject9;
    if (localdOc4 != null)
    {
      localObject1 = new cuR();
      ((cuR)localObject1).aJ();
      ((cuR)localObject1).setElementMap(localcpa);
      ((dKl)localObject1).setInsets(new Insets(1, 1, 1, 1));
      localdOc4.bb((bdj)localObject1);
      ((cuR)localObject1).brn();
      ((cuR)localObject1).rV();
      localdOc5 = (dOc)localdOc4;
      localObject2 = localdOc5.getAppearance();
      ((Jg)localObject2).setElementMap(localcpa);
      ((Jg)localObject2).setState("default");
      localdOc4.bb((bdj)localObject2);
      ((Jg)localObject2).brn();
      localObject3 = aAR.checkOut();
      ((aAR)localObject3).setElementMap(localcpa);
      ((aAR)localObject3).setPosition(ajb.dhZ);
      ((aAR)localObject3).setX(37);
      ((aAR)localObject3).setY(83);
      ((aAR)localObject3).setWidth(10);
      ((aAR)localObject3).setHeight(12);
      ((aAR)localObject3).setTexture(this.W.aH("default_0.tga"));
      ((Jg)localObject2).bb((bdj)localObject3);
      ((aAR)localObject3).brn();
      ((aAR)localObject3).rV();
      ((Jg)localObject2).rV();
      localObject4 = (dOc)localdOc4;
      localObject5 = ((dOc)localObject4).getAppearance();
      ((Jg)localObject5).setElementMap(localcpa);
      ((Jg)localObject5).setState("mouseHover");
      localdOc4.bb((bdj)localObject5);
      ((Jg)localObject5).brn();
      localObject6 = aAR.checkOut();
      ((aAR)localObject6).setElementMap(localcpa);
      ((aAR)localObject6).setPosition(ajb.dhZ);
      ((aAR)localObject6).setX(651);
      ((aAR)localObject6).setY(197);
      ((aAR)localObject6).setWidth(10);
      ((aAR)localObject6).setHeight(12);
      ((aAR)localObject6).setTexture(this.W.aH("default_0.tga"));
      ((Jg)localObject5).bb((bdj)localObject6);
      ((aAR)localObject6).brn();
      ((aAR)localObject6).rV();
      ((Jg)localObject5).rV();
      localObject7 = (dOc)localdOc4;
      localObject8 = ((dOc)localObject7).getAppearance();
      ((Jg)localObject8).setElementMap(localcpa);
      ((Jg)localObject8).setState("pressed");
      localdOc4.bb((bdj)localObject8);
      ((Jg)localObject8).brn();
      localObject9 = aAR.checkOut();
      ((aAR)localObject9).setElementMap(localcpa);
      ((aAR)localObject9).setPosition(ajb.dhZ);
      ((aAR)localObject9).setX(37);
      ((aAR)localObject9).setY(98);
      ((aAR)localObject9).setWidth(10);
      ((aAR)localObject9).setHeight(12);
      ((aAR)localObject9).setTexture(this.W.aH("default_0.tga"));
      ((Jg)localObject8).bb((bdj)localObject9);
      ((aAR)localObject9).brn();
      ((aAR)localObject9).rV();
      ((Jg)localObject8).rV();
    }
    Object localObject1 = (dOc)localJg1.getParentOfType(dOc.class);
    dOc localdOc5 = ((dOc)localObject1).getWidgetByThemeElementName("horizontalDecreaseButton", false);
    Object localObject10;
    aAR localaAR1;
    if (localdOc5 != null)
    {
      localObject2 = new cuR();
      ((cuR)localObject2).aJ();
      ((cuR)localObject2).setElementMap(localcpa);
      ((dKl)localObject2).setInsets(new Insets(1, 1, 1, 1));
      localdOc5.bb((bdj)localObject2);
      ((cuR)localObject2).brn();
      ((cuR)localObject2).rV();
      localObject3 = (dOc)localdOc5;
      localObject4 = ((dOc)localObject3).getAppearance();
      ((Jg)localObject4).setElementMap(localcpa);
      ((Jg)localObject4).setState("default");
      localdOc5.bb((bdj)localObject4);
      ((Jg)localObject4).brn();
      localObject5 = aAR.checkOut();
      ((aAR)localObject5).setElementMap(localcpa);
      ((aAR)localObject5).setPosition(ajb.dhZ);
      ((aAR)localObject5).setX(651);
      ((aAR)localObject5).setY(182);
      ((aAR)localObject5).setWidth(10);
      ((aAR)localObject5).setHeight(12);
      ((aAR)localObject5).setTexture(this.W.aH("default_0.tga"));
      ((Jg)localObject4).bb((bdj)localObject5);
      ((aAR)localObject5).brn();
      ((aAR)localObject5).rV();
      ((Jg)localObject4).rV();
      localObject6 = (dOc)localdOc5;
      localObject7 = ((dOc)localObject6).getAppearance();
      ((Jg)localObject7).setElementMap(localcpa);
      ((Jg)localObject7).setState("mouseHover");
      localdOc5.bb((bdj)localObject7);
      ((Jg)localObject7).brn();
      localObject8 = aAR.checkOut();
      ((aAR)localObject8).setElementMap(localcpa);
      ((aAR)localObject8).setPosition(ajb.dhZ);
      ((aAR)localObject8).setX(241);
      ((aAR)localObject8).setY(13);
      ((aAR)localObject8).setWidth(10);
      ((aAR)localObject8).setHeight(12);
      ((aAR)localObject8).setTexture(this.W.aH("default_0.tga"));
      ((Jg)localObject7).bb((bdj)localObject8);
      ((aAR)localObject8).brn();
      ((aAR)localObject8).rV();
      ((Jg)localObject7).rV();
      localObject9 = (dOc)localdOc5;
      localObject10 = ((dOc)localObject9).getAppearance();
      ((Jg)localObject10).setElementMap(localcpa);
      ((Jg)localObject10).setState("pressed");
      localdOc5.bb((bdj)localObject10);
      ((Jg)localObject10).brn();
      localaAR1 = aAR.checkOut();
      localaAR1.setElementMap(localcpa);
      localaAR1.setPosition(ajb.dhZ);
      localaAR1.setX(1010);
      localaAR1.setY(14);
      localaAR1.setWidth(10);
      localaAR1.setHeight(12);
      localaAR1.setTexture(this.W.aH("default_0.tga"));
      ((Jg)localObject10).bb(localaAR1);
      localaAR1.brn();
      localaAR1.rV();
      ((Jg)localObject10).rV();
    }
    Object localObject2 = (dOc)localJg1.getParentOfType(dOc.class);
    Object localObject3 = ((dOc)localObject2).getWidgetByThemeElementName("horizontalSlider", false);
    if (localObject3 != null)
    {
      localObject4 = (dOc)localObject3;
      localObject5 = ((dOc)localObject4).getAppearance();
      ((Jg)localObject5).setElementMap(localcpa);
      ((aNL)localObject3).bb((bdj)localObject5);
      ((Jg)localObject5).brn();
      localObject6 = (dOc)((Jg)localObject5).getParentOfType(dOc.class);
      localObject7 = ((dOc)localObject6).getWidgetByThemeElementName("horizontalButton", false);
      if (localObject7 != null)
      {
        localObject8 = (dOc)localObject7;
        localObject9 = ((dOc)localObject8).getAppearance();
        ((Jg)localObject9).setElementMap(localcpa);
        ((Jg)localObject9).setState("default");
        ((aNL)localObject7).bb((bdj)localObject9);
        ((Jg)localObject9).brn();
        localObject10 = new Cx();
        ((Cx)localObject10).aJ();
        ((Cx)localObject10).setElementMap(localcpa);
        ((Jg)localObject9).bb((bdj)localObject10);
        ((Cx)localObject10).brn();
        localaAR1 = aAR.checkOut();
        localaAR1.setElementMap(localcpa);
        localaAR1.setPosition(ajb.dhR);
        localaAR1.setX(338);
        localaAR1.setY(347);
        localaAR1.setWidth(4);
        localaAR1.setHeight(4);
        localaAR1.setTexture(this.W.aH("default_0.tga"));
        ((Cx)localObject10).bb(localaAR1);
        localaAR1.brn();
        localaAR1.rV();
        aAR localaAR2 = aAR.checkOut();
        localaAR2.setElementMap(localcpa);
        localaAR2.setPosition(ajb.dhT);
        localaAR2.setX(337);
        localaAR2.setY(378);
        localaAR2.setWidth(5);
        localaAR2.setHeight(4);
        localaAR2.setTexture(this.W.aH("default_0.tga"));
        ((Cx)localObject10).bb(localaAR2);
        localaAR2.brn();
        localaAR2.rV();
        aAR localaAR3 = aAR.checkOut();
        localaAR3.setElementMap(localcpa);
        localaAR3.setPosition(ajb.dhV);
        localaAR3.setX(715);
        localaAR3.setY(22);
        localaAR3.setWidth(4);
        localaAR3.setHeight(4);
        localaAR3.setTexture(this.W.aH("default_0.tga"));
        ((Cx)localObject10).bb(localaAR3);
        localaAR3.brn();
        localaAR3.rV();
        aAR localaAR4 = aAR.checkOut();
        localaAR4.setElementMap(localcpa);
        localaAR4.setPosition(ajb.dia);
        localaAR4.setX(701);
        localaAR4.setY(534);
        localaAR4.setWidth(4);
        localaAR4.setHeight(13);
        localaAR4.setTexture(this.W.aH("default_0.tga"));
        ((Cx)localObject10).bb(localaAR4);
        localaAR4.brn();
        localaAR4.rV();
        aAR localaAR5 = aAR.checkOut();
        localaAR5.setElementMap(localcpa);
        localaAR5.setPosition(ajb.dih);
        localaAR5.setX(929);
        localaAR5.setY(221);
        localaAR5.setWidth(4);
        localaAR5.setHeight(4);
        localaAR5.setTexture(this.W.aH("default_1.tga"));
        ((Cx)localObject10).bb(localaAR5);
        localaAR5.brn();
        localaAR5.rV();
        aAR localaAR6 = aAR.checkOut();
        localaAR6.setElementMap(localcpa);
        localaAR6.setPosition(ajb.dif);
        localaAR6.setX(479);
        localaAR6.setY(170);
        localaAR6.setWidth(5);
        localaAR6.setHeight(4);
        localaAR6.setTexture(this.W.aH("default_1.tga"));
        ((Cx)localObject10).bb(localaAR6);
        localaAR6.brn();
        localaAR6.rV();
        aAR localaAR7 = aAR.checkOut();
        localaAR7.setElementMap(localcpa);
        localaAR7.setPosition(ajb.did);
        localaAR7.setX(391);
        localaAR7.setY(7);
        localaAR7.setWidth(4);
        localaAR7.setHeight(4);
        localaAR7.setTexture(this.W.aH("default_0.tga"));
        ((Cx)localObject10).bb(localaAR7);
        localaAR7.brn();
        localaAR7.rV();
        aAR localaAR8 = aAR.checkOut();
        localaAR8.setElementMap(localcpa);
        localaAR8.setPosition(ajb.dhY);
        localaAR8.setX(164);
        localaAR8.setY(512);
        localaAR8.setWidth(4);
        localaAR8.setHeight(13);
        localaAR8.setTexture(this.W.aH("default_0.tga"));
        ((Cx)localObject10).bb(localaAR8);
        localaAR8.brn();
        localaAR8.rV();
        ((Cx)localObject10).rV();
        aen localaen1 = aen.checkOut();
        localaen1.setElementMap(localcpa);
        localaen1.setEnabled(true);
        localaen1.setScaled(true);
        ((Jg)localObject9).bb(localaen1);
        localaen1.brn();
        aAR localaAR9 = aAR.checkOut();
        localaAR9.setElementMap(localcpa);
        localaAR9.setPosition(ajb.dhZ);
        localaAR9.setX(338);
        localaAR9.setY(532);
        localaAR9.setWidth(4);
        localaAR9.setHeight(1);
        localaAR9.setTexture(this.W.aH("default_0.tga"));
        localaen1.bb(localaAR9);
        localaAR9.brn();
        localaAR9.rV();
        localaen1.rV();
        aAR localaAR10 = aAR.checkOut();
        localaAR10.setElementMap(localcpa);
        localaAR10.setPosition(ajb.dhZ);
        localaAR10.setRotation(bOo.gTv);
        localaAR10.setX(396);
        localaAR10.setY(390);
        localaAR10.setWidth(4);
        localaAR10.setHeight(6);
        localaAR10.setTexture(this.W.aH("default_0.tga"));
        ((Jg)localObject9).bb(localaAR10);
        localaAR10.brn();
        localaAR10.rV();
        ((Jg)localObject9).rV();
        dOc localdOc6 = (dOc)localObject7;
        Jg localJg2 = localdOc6.getAppearance();
        localJg2.setElementMap(localcpa);
        localJg2.setState("mouseHover");
        ((aNL)localObject7).bb(localJg2);
        localJg2.brn();
        Cx localCx1 = new Cx();
        localCx1.aJ();
        localCx1.setElementMap(localcpa);
        localJg2.bb(localCx1);
        localCx1.brn();
        aAR localaAR11 = aAR.checkOut();
        localaAR11.setElementMap(localcpa);
        localaAR11.setPosition(ajb.dhR);
        localaAR11.setX(797);
        localaAR11.setY(221);
        localaAR11.setWidth(4);
        localaAR11.setHeight(4);
        localaAR11.setTexture(this.W.aH("default_1.tga"));
        localCx1.bb(localaAR11);
        localaAR11.brn();
        localaAR11.rV();
        aAR localaAR12 = aAR.checkOut();
        localaAR12.setElementMap(localcpa);
        localaAR12.setPosition(ajb.dhT);
        localaAR12.setX(502);
        localaAR12.setY(170);
        localaAR12.setWidth(5);
        localaAR12.setHeight(4);
        localaAR12.setTexture(this.W.aH("default_1.tga"));
        localCx1.bb(localaAR12);
        localaAR12.brn();
        localaAR12.rV();
        aAR localaAR13 = aAR.checkOut();
        localaAR13.setElementMap(localcpa);
        localaAR13.setPosition(ajb.dhV);
        localaAR13.setX(436);
        localaAR13.setY(164);
        localaAR13.setWidth(4);
        localaAR13.setHeight(4);
        localaAR13.setTexture(this.W.aH("default_0.tga"));
        localCx1.bb(localaAR13);
        localaAR13.brn();
        localaAR13.rV();
        aAR localaAR14 = aAR.checkOut();
        localaAR14.setElementMap(localcpa);
        localaAR14.setPosition(ajb.dia);
        localaAR14.setX(164);
        localaAR14.setY(496);
        localaAR14.setWidth(4);
        localaAR14.setHeight(13);
        localaAR14.setTexture(this.W.aH("default_0.tga"));
        localCx1.bb(localaAR14);
        localaAR14.brn();
        localaAR14.rV();
        aAR localaAR15 = aAR.checkOut();
        localaAR15.setElementMap(localcpa);
        localaAR15.setPosition(ajb.dih);
        localaAR15.setX(396);
        localaAR15.setY(164);
        localaAR15.setWidth(4);
        localaAR15.setHeight(4);
        localaAR15.setTexture(this.W.aH("default_0.tga"));
        localCx1.bb(localaAR15);
        localaAR15.brn();
        localaAR15.rV();
        aAR localaAR16 = aAR.checkOut();
        localaAR16.setElementMap(localcpa);
        localaAR16.setPosition(ajb.dif);
        localaAR16.setX(625);
        localaAR16.setY(170);
        localaAR16.setWidth(5);
        localaAR16.setHeight(4);
        localaAR16.setTexture(this.W.aH("default_1.tga"));
        localCx1.bb(localaAR16);
        localaAR16.brn();
        localaAR16.rV();
        aAR localaAR17 = aAR.checkOut();
        localaAR17.setElementMap(localcpa);
        localaAR17.setPosition(ajb.did);
        localaAR17.setX(929);
        localaAR17.setY(228);
        localaAR17.setWidth(4);
        localaAR17.setHeight(4);
        localaAR17.setTexture(this.W.aH("default_1.tga"));
        localCx1.bb(localaAR17);
        localaAR17.brn();
        localaAR17.rV();
        aAR localaAR18 = aAR.checkOut();
        localaAR18.setElementMap(localcpa);
        localaAR18.setPosition(ajb.dhY);
        localaAR18.setX(164);
        localaAR18.setY(528);
        localaAR18.setWidth(4);
        localaAR18.setHeight(13);
        localaAR18.setTexture(this.W.aH("default_0.tga"));
        localCx1.bb(localaAR18);
        localaAR18.brn();
        localaAR18.rV();
        localCx1.rV();
        aen localaen2 = aen.checkOut();
        localaen2.setElementMap(localcpa);
        localaen2.setEnabled(true);
        localaen2.setScaled(true);
        localJg2.bb(localaen2);
        localaen2.brn();
        aAR localaAR19 = aAR.checkOut();
        localaAR19.setElementMap(localcpa);
        localaAR19.setPosition(ajb.dhZ);
        localaAR19.setX(701);
        localaAR19.setY(529);
        localaAR19.setWidth(4);
        localaAR19.setHeight(2);
        localaAR19.setTexture(this.W.aH("default_0.tga"));
        localaen2.bb(localaAR19);
        localaAR19.brn();
        localaAR19.rV();
        localaen2.rV();
        aAR localaAR20 = aAR.checkOut();
        localaAR20.setElementMap(localcpa);
        localaAR20.setPosition(ajb.dhZ);
        localaAR20.setRotation(bOo.gTv);
        localaAR20.setX(929);
        localaAR20.setY(389);
        localaAR20.setWidth(4);
        localaAR20.setHeight(6);
        localaAR20.setTexture(this.W.aH("default_0.tga"));
        localJg2.bb(localaAR20);
        localaAR20.brn();
        localaAR20.rV();
        localJg2.rV();
        dOc localdOc7 = (dOc)localObject7;
        Jg localJg3 = localdOc7.getAppearance();
        localJg3.setElementMap(localcpa);
        localJg3.setState("pressed");
        ((aNL)localObject7).bb(localJg3);
        localJg3.brn();
        Cx localCx2 = new Cx();
        localCx2.aJ();
        localCx2.setElementMap(localcpa);
        localJg3.bb(localCx2);
        localCx2.brn();
        aAR localaAR21 = aAR.checkOut();
        localaAR21.setElementMap(localcpa);
        localaAR21.setPosition(ajb.dhR);
        localaAR21.setX(797);
        localaAR21.setY(228);
        localaAR21.setWidth(4);
        localaAR21.setHeight(4);
        localaAR21.setTexture(this.W.aH("default_1.tga"));
        localCx2.bb(localaAR21);
        localaAR21.brn();
        localaAR21.rV();
        aAR localaAR22 = aAR.checkOut();
        localaAR22.setElementMap(localcpa);
        localaAR22.setPosition(ajb.dhT);
        localaAR22.setX(652);
        localaAR22.setY(212);
        localaAR22.setWidth(5);
        localaAR22.setHeight(4);
        localaAR22.setTexture(this.W.aH("default_0.tga"));
        localCx2.bb(localaAR22);
        localaAR22.brn();
        localaAR22.rV();
        aAR localaAR23 = aAR.checkOut();
        localaAR23.setElementMap(localcpa);
        localaAR23.setPosition(ajb.dhV);
        localaAR23.setX(885);
        localaAR23.setY(221);
        localaAR23.setWidth(4);
        localaAR23.setHeight(4);
        localaAR23.setTexture(this.W.aH("default_1.tga"));
        localCx2.bb(localaAR23);
        localaAR23.brn();
        localaAR23.rV();
        aAR localaAR24 = aAR.checkOut();
        localaAR24.setElementMap(localcpa);
        localaAR24.setPosition(ajb.dia);
        localaAR24.setX(163);
        localaAR24.setY(442);
        localaAR24.setWidth(4);
        localaAR24.setHeight(13);
        localaAR24.setTexture(this.W.aH("default_0.tga"));
        localCx2.bb(localaAR24);
        localaAR24.brn();
        localaAR24.rV();
        aAR localaAR25 = aAR.checkOut();
        localaAR25.setElementMap(localcpa);
        localaAR25.setPosition(ajb.dih);
        localaAR25.setX(436);
        localaAR25.setY(171);
        localaAR25.setWidth(4);
        localaAR25.setHeight(4);
        localaAR25.setTexture(this.W.aH("default_0.tga"));
        localCx2.bb(localaAR25);
        localaAR25.brn();
        localaAR25.rV();
        aAR localaAR26 = aAR.checkOut();
        localaAR26.setElementMap(localcpa);
        localaAR26.setPosition(ajb.dif);
        localaAR26.setX(456);
        localaAR26.setY(170);
        localaAR26.setWidth(5);
        localaAR26.setHeight(4);
        localaAR26.setTexture(this.W.aH("default_1.tga"));
        localCx2.bb(localaAR26);
        localaAR26.brn();
        localaAR26.rV();
        aAR localaAR27 = aAR.checkOut();
        localaAR27.setElementMap(localcpa);
        localaAR27.setPosition(ajb.did);
        localaAR27.setX(396);
        localaAR27.setY(157);
        localaAR27.setWidth(4);
        localaAR27.setHeight(4);
        localaAR27.setTexture(this.W.aH("default_0.tga"));
        localCx2.bb(localaAR27);
        localaAR27.brn();
        localaAR27.rV();
        a(localCx2);
        localCx2.rV();
        b(localJg3);
        d(localJg3);
        localJg3.rV();
      }
      e((bdj)localObject5);
      ((Jg)localObject5).rV();
    }
    localJg1.rV();
  }

  public bdj a(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localaAR.setPosition(ajb.dhY);
    localaAR.setX(164);
    localaAR.setY(480);
    localaAR.setWidth(4);
    localaAR.setHeight(13);
    localaAR.setTexture(this.W.aH("default_0.tga"));
    parambdj.bb(localaAR);
    localaAR.brn();
    localaAR.rV();
    return localaAR;
  }

  public bdj b(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    aen localaen = aen.checkOut();
    localaen.setElementMap(localcpa);
    localaen.setEnabled(true);
    localaen.setScaled(true);
    parambdj.bb(localaen);
    localaen.brn();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localaAR.setPosition(ajb.dhZ);
    localaAR.setX(865);
    localaAR.setY(428);
    localaAR.setWidth(4);
    localaAR.setHeight(2);
    localaAR.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR);
    localaAR.brn();
    localaAR.rV();
    localaen.rV();
    return localaen;
  }

  public bdj d(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localaAR.setPosition(ajb.dhZ);
    localaAR.setRotation(bOo.gTv);
    localaAR.setX(396);
    localaAR.setY(399);
    localaAR.setWidth(4);
    localaAR.setHeight(6);
    localaAR.setTexture(this.W.aH("default_0.tga"));
    parambdj.bb(localaAR);
    localaAR.brn();
    localaAR.rV();
    return localaAR;
  }

  public bdj e(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    aen localaen = aen.checkOut();
    localaen.setElementMap(localcpa);
    localaen.setEnabled(true);
    localaen.setScaled(true);
    parambdj.bb(localaen);
    localaen.brn();
    aAR localaAR1 = aAR.checkOut();
    localaAR1.setElementMap(localcpa);
    localaAR1.setPosition(ajb.dhR);
    localaAR1.setX(841);
    localaAR1.setY(215);
    localaAR1.setWidth(4);
    localaAR1.setHeight(3);
    localaAR1.setTexture(this.W.aH("default_1.tga"));
    localaen.bb(localaAR1);
    localaAR1.brn();
    localaAR1.rV();
    aAR localaAR2 = aAR.checkOut();
    localaAR2.setElementMap(localcpa);
    localaAR2.setPosition(ajb.dhT);
    localaAR2.setX(248);
    localaAR2.setY(766);
    localaAR2.setWidth(2);
    localaAR2.setHeight(3);
    localaAR2.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR2);
    localaAR2.brn();
    localaAR2.rV();
    aAR localaAR3 = aAR.checkOut();
    localaAR3.setElementMap(localcpa);
    localaAR3.setPosition(ajb.dhV);
    localaAR3.setX(164);
    localaAR3.setY(474);
    localaAR3.setWidth(4);
    localaAR3.setHeight(3);
    localaAR3.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR3);
    localaAR3.brn();
    localaAR3.rV();
    aAR localaAR4 = aAR.checkOut();
    localaAR4.setElementMap(localcpa);
    localaAR4.setPosition(ajb.dhY);
    localaAR4.setX(396);
    localaAR4.setY(146);
    localaAR4.setWidth(4);
    localaAR4.setHeight(1);
    localaAR4.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR4);
    localaAR4.brn();
    localaAR4.rV();
    aAR localaAR5 = aAR.checkOut();
    localaAR5.setElementMap(localcpa);
    localaAR5.setPosition(ajb.dhZ);
    localaAR5.setX(873);
    localaAR5.setY(802);
    localaAR5.setWidth(2);
    localaAR5.setHeight(1);
    localaAR5.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR5);
    localaAR5.brn();
    localaAR5.rV();
    aAR localaAR6 = aAR.checkOut();
    localaAR6.setElementMap(localcpa);
    localaAR6.setPosition(ajb.dia);
    localaAR6.setX(929);
    localaAR6.setY(377);
    localaAR6.setWidth(4);
    localaAR6.setHeight(1);
    localaAR6.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR6);
    localaAR6.brn();
    localaAR6.rV();
    aAR localaAR7 = aAR.checkOut();
    localaAR7.setElementMap(localcpa);
    localaAR7.setPosition(ajb.did);
    localaAR7.setX(1017);
    localaAR7.setY(54);
    localaAR7.setWidth(4);
    localaAR7.setHeight(3);
    localaAR7.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR7);
    localaAR7.brn();
    localaAR7.rV();
    aAR localaAR8 = aAR.checkOut();
    localaAR8.setElementMap(localcpa);
    localaAR8.setPosition(ajb.dif);
    localaAR8.setX(558);
    localaAR8.setY(701);
    localaAR8.setWidth(2);
    localaAR8.setHeight(3);
    localaAR8.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR8);
    localaAR8.brn();
    localaAR8.rV();
    aAR localaAR9 = aAR.checkOut();
    localaAR9.setElementMap(localcpa);
    localaAR9.setPosition(ajb.dih);
    localaAR9.setX(964);
    localaAR9.setY(54);
    localaAR9.setWidth(4);
    localaAR9.setHeight(3);
    localaAR9.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR9);
    localaAR9.brn();
    localaAR9.rV();
    localaen.rV();
    return localaen;
  }
}