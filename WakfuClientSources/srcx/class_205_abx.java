import java.awt.Insets;
import java.util.Stack;

public class abx
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
    Jg localJg1 = localdOc1.getAppearance();
    localJg1.setElementMap(localcpa);
    paramdOc.bb(localJg1);
    localJg1.brn();
    cAf localcAf1 = cAf.checkOut();
    localcAf1.setElementMap(localcpa);
    localcAf1.setColor(new bNa(1.0F, 1.0F, 1.0F, 0.5F));
    localcAf1.setName("mouseOverCell");
    localJg1.bb(localcAf1);
    localcAf1.brn();
    localcAf1.rV();
    cAf localcAf2 = cAf.checkOut();
    localcAf2.setElementMap(localcpa);
    localcAf2.setColor(new bNa(0.64F, 0.7F, 0.7F, 1.0F));
    localcAf2.setName("selected");
    localJg1.bb(localcAf2);
    localcAf2.brn();
    localcAf2.rV();
    cAf localcAf3 = cAf.checkOut();
    localcAf3.setElementMap(localcpa);
    localcAf3.setColor(new bNa(0.37F, 0.44F, 0.43F, 1.0F));
    localcAf3.setName("evenCell");
    localJg1.bb(localcAf3);
    localcAf3.brn();
    localcAf3.rV();
    cAf localcAf4 = cAf.checkOut();
    localcAf4.setElementMap(localcpa);
    localcAf4.setColor(new bNa(0.45F, 0.52F, 0.51F, 1.0F));
    localcAf4.setName("oddCell");
    localJg1.bb(localcAf4);
    localcAf4.brn();
    localcAf4.rV();
    dOc localdOc2 = (dOc)localJg1.getParentOfType(dOc.class);
    dOc localdOc3 = localdOc2.getWidgetByThemeElementName("scrollBar", false);
    if (localdOc3 != null)
    {
      dOc localdOc4 = (dOc)localdOc3;
      Jg localJg2 = localdOc4.getAppearance();
      localJg2.setElementMap(localcpa);
      localdOc3.bb(localJg2);
      localJg2.brn();
      dOc localdOc5 = (dOc)localJg2.getParentOfType(dOc.class);
      dOc localdOc6 = localdOc5.getWidgetByThemeElementName("verticalIncreaseButton", false);
      Object localObject4;
      Object localObject5;
      Object localObject6;
      Object localObject7;
      Object localObject8;
      Object localObject9;
      if (localdOc6 != null)
      {
        localObject1 = new cuR();
        ((cuR)localObject1).aJ();
        ((cuR)localObject1).setElementMap(localcpa);
        ((dKl)localObject1).setInsets(new Insets(3, 0, 3, 0));
        localdOc6.bb((bdj)localObject1);
        ((cuR)localObject1).brn();
        ((cuR)localObject1).rV();
        localdOc7 = (dOc)localdOc6;
        localObject2 = localdOc7.getAppearance();
        ((Jg)localObject2).setElementMap(localcpa);
        ((cwJ)localObject2).setAlignment(aFG.eck);
        ((Jg)localObject2).setState("default");
        localdOc6.bb((bdj)localObject2);
        ((Jg)localObject2).brn();
        localObject3 = aAR.checkOut();
        ((aAR)localObject3).setElementMap(localcpa);
        ((aAR)localObject3).setPosition(ajb.dhZ);
        ((aAR)localObject3).setRotation(bOo.gTv);
        ((aAR)localObject3).setX(842);
        ((aAR)localObject3).setY(34);
        ((aAR)localObject3).setWidth(16);
        ((aAR)localObject3).setHeight(18);
        ((aAR)localObject3).setTexture(this.W.aH("default_0.tga"));
        ((Jg)localObject2).bb((bdj)localObject3);
        ((aAR)localObject3).brn();
        ((aAR)localObject3).rV();
        ((Jg)localObject2).rV();
        localObject4 = (dOc)localdOc6;
        localObject5 = ((dOc)localObject4).getAppearance();
        ((Jg)localObject5).setElementMap(localcpa);
        ((cwJ)localObject5).setAlignment(aFG.eck);
        ((Jg)localObject5).setState("mouseHover");
        localdOc6.bb((bdj)localObject5);
        ((Jg)localObject5).brn();
        localObject6 = aAR.checkOut();
        ((aAR)localObject6).setElementMap(localcpa);
        ((aAR)localObject6).setPosition(ajb.dhZ);
        ((aAR)localObject6).setRotation(bOo.gTv);
        ((aAR)localObject6).setX(30);
        ((aAR)localObject6).setY(31);
        ((aAR)localObject6).setWidth(16);
        ((aAR)localObject6).setHeight(18);
        ((aAR)localObject6).setTexture(this.W.aH("default_0.tga"));
        ((Jg)localObject5).bb((bdj)localObject6);
        ((aAR)localObject6).brn();
        ((aAR)localObject6).rV();
        ((Jg)localObject5).rV();
        localObject7 = (dOc)localdOc6;
        localObject8 = ((dOc)localObject7).getAppearance();
        ((Jg)localObject8).setElementMap(localcpa);
        ((cwJ)localObject8).setAlignment(aFG.eck);
        ((Jg)localObject8).setState("pressed");
        localdOc6.bb((bdj)localObject8);
        ((Jg)localObject8).brn();
        localObject9 = aAR.checkOut();
        ((aAR)localObject9).setElementMap(localcpa);
        ((aAR)localObject9).setPosition(ajb.dhZ);
        ((aAR)localObject9).setRotation(bOo.gTv);
        ((aAR)localObject9).setX(349);
        ((aAR)localObject9).setY(213);
        ((aAR)localObject9).setWidth(16);
        ((aAR)localObject9).setHeight(18);
        ((aAR)localObject9).setTexture(this.W.aH("default_1.tga"));
        ((Jg)localObject8).bb((bdj)localObject9);
        ((aAR)localObject9).brn();
        ((aAR)localObject9).rV();
        ((Jg)localObject8).rV();
      }
      Object localObject1 = (dOc)localJg2.getParentOfType(dOc.class);
      dOc localdOc7 = ((dOc)localObject1).getWidgetByThemeElementName("verticalDecreaseButton", false);
      Jg localJg3;
      Object localObject10;
      if (localdOc7 != null)
      {
        localObject2 = new cuR();
        ((cuR)localObject2).aJ();
        ((cuR)localObject2).setElementMap(localcpa);
        ((dKl)localObject2).setInsets(new Insets(3, 0, 3, 0));
        localdOc7.bb((bdj)localObject2);
        ((cuR)localObject2).brn();
        ((cuR)localObject2).rV();
        localObject3 = (dOc)localdOc7;
        localObject4 = ((dOc)localObject3).getAppearance();
        ((Jg)localObject4).setElementMap(localcpa);
        ((cwJ)localObject4).setAlignment(aFG.eck);
        ((Jg)localObject4).setState("default");
        localdOc7.bb((bdj)localObject4);
        ((Jg)localObject4).brn();
        localObject5 = aAR.checkOut();
        ((aAR)localObject5).setElementMap(localcpa);
        ((aAR)localObject5).setPosition(ajb.dhZ);
        ((aAR)localObject5).setRotation(bOo.gTx);
        ((aAR)localObject5).setX(842);
        ((aAR)localObject5).setY(34);
        ((aAR)localObject5).setWidth(16);
        ((aAR)localObject5).setHeight(18);
        ((aAR)localObject5).setTexture(this.W.aH("default_0.tga"));
        ((Jg)localObject4).bb((bdj)localObject5);
        ((aAR)localObject5).brn();
        ((aAR)localObject5).rV();
        ((Jg)localObject4).rV();
        localObject6 = (dOc)localdOc7;
        localObject7 = ((dOc)localObject6).getAppearance();
        ((Jg)localObject7).setElementMap(localcpa);
        ((cwJ)localObject7).setAlignment(aFG.eck);
        ((Jg)localObject7).setState("mouseHover");
        localdOc7.bb((bdj)localObject7);
        ((Jg)localObject7).brn();
        localObject8 = aAR.checkOut();
        ((aAR)localObject8).setElementMap(localcpa);
        ((aAR)localObject8).setPosition(ajb.dhZ);
        ((aAR)localObject8).setRotation(bOo.gTx);
        ((aAR)localObject8).setX(30);
        ((aAR)localObject8).setY(31);
        ((aAR)localObject8).setWidth(16);
        ((aAR)localObject8).setHeight(18);
        ((aAR)localObject8).setTexture(this.W.aH("default_0.tga"));
        ((Jg)localObject7).bb((bdj)localObject8);
        ((aAR)localObject8).brn();
        ((aAR)localObject8).rV();
        ((Jg)localObject7).rV();
        localObject9 = (dOc)localdOc7;
        localJg3 = ((dOc)localObject9).getAppearance();
        localJg3.setElementMap(localcpa);
        ((cwJ)localJg3).setAlignment(aFG.eck);
        localJg3.setState("pressed");
        localdOc7.bb(localJg3);
        localJg3.brn();
        localObject10 = aAR.checkOut();
        ((aAR)localObject10).setElementMap(localcpa);
        ((aAR)localObject10).setPosition(ajb.dhZ);
        ((aAR)localObject10).setRotation(bOo.gTx);
        ((aAR)localObject10).setX(349);
        ((aAR)localObject10).setY(213);
        ((aAR)localObject10).setWidth(16);
        ((aAR)localObject10).setHeight(18);
        ((aAR)localObject10).setTexture(this.W.aH("default_1.tga"));
        localJg3.bb((bdj)localObject10);
        ((aAR)localObject10).brn();
        ((aAR)localObject10).rV();
        localJg3.rV();
      }
      Object localObject2 = (dOc)localJg2.getParentOfType(dOc.class);
      Object localObject3 = ((dOc)localObject2).getWidgetByThemeElementName("verticalSlider", false);
      if (localObject3 != null)
      {
        localObject4 = (dOc)localObject3;
        localObject5 = ((dOc)localObject4).getAppearance();
        ((Jg)localObject5).setElementMap(localcpa);
        ((aNL)localObject3).bb((bdj)localObject5);
        ((Jg)localObject5).brn();
        localObject6 = new cuR();
        ((cuR)localObject6).aJ();
        ((cuR)localObject6).setElementMap(localcpa);
        ((dKl)localObject6).setInsets(new Insets(0, 4, 0, 4));
        ((Jg)localObject5).bb((bdj)localObject6);
        ((cuR)localObject6).brn();
        ((cuR)localObject6).rV();
        localObject7 = (dOc)((Jg)localObject5).getParentOfType(dOc.class);
        localObject8 = ((dOc)localObject7).getWidgetByThemeElementName("verticalButton", false);
        if (localObject8 != null)
        {
          localObject9 = (dOc)localObject8;
          localJg3 = ((dOc)localObject9).getAppearance();
          localJg3.setElementMap(localcpa);
          localJg3.setState("default");
          ((aNL)localObject8).bb(localJg3);
          localJg3.brn();
          localObject10 = new Cx();
          ((Cx)localObject10).aJ();
          ((Cx)localObject10).setElementMap(localcpa);
          localJg3.bb((bdj)localObject10);
          ((Cx)localObject10).brn();
          aAR localaAR1 = aAR.checkOut();
          localaAR1.setElementMap(localcpa);
          localaAR1.setPosition(ajb.dhR);
          localaAR1.setX(477);
          localaAR1.setY(336);
          localaAR1.setWidth(1);
          localaAR1.setHeight(4);
          localaAR1.setTexture(this.W.aH("default_0.tga"));
          ((Cx)localObject10).bb(localaAR1);
          localaAR1.brn();
          localaAR1.rV();
          aAR localaAR2 = aAR.checkOut();
          localaAR2.setElementMap(localcpa);
          localaAR2.setPosition(ajb.dhT);
          localaAR2.setX(556);
          localaAR2.setY(132);
          localaAR2.setWidth(11);
          localaAR2.setHeight(4);
          localaAR2.setTexture(this.W.aH("default_1.tga"));
          ((Cx)localObject10).bb(localaAR2);
          localaAR2.brn();
          localaAR2.rV();
          aAR localaAR3 = aAR.checkOut();
          localaAR3.setElementMap(localcpa);
          localaAR3.setPosition(ajb.dhV);
          localaAR3.setX(2);
          localaAR3.setY(309);
          localaAR3.setWidth(1);
          localaAR3.setHeight(4);
          localaAR3.setTexture(this.W.aH("default_0.tga"));
          ((Cx)localObject10).bb(localaAR3);
          localaAR3.brn();
          localaAR3.rV();
          aAR localaAR4 = aAR.checkOut();
          localaAR4.setElementMap(localcpa);
          localaAR4.setPosition(ajb.dia);
          localaAR4.setX(2);
          localaAR4.setY(674);
          localaAR4.setWidth(1);
          localaAR4.setHeight(13);
          localaAR4.setTexture(this.W.aH("default_0.tga"));
          ((Cx)localObject10).bb(localaAR4);
          localaAR4.brn();
          localaAR4.rV();
          aAR localaAR5 = aAR.checkOut();
          localaAR5.setElementMap(localcpa);
          localaAR5.setPosition(ajb.dih);
          localaAR5.setX(2);
          localaAR5.setY(330);
          localaAR5.setWidth(1);
          localaAR5.setHeight(4);
          localaAR5.setTexture(this.W.aH("default_0.tga"));
          ((Cx)localObject10).bb(localaAR5);
          localaAR5.brn();
          localaAR5.rV();
          aAR localaAR6 = aAR.checkOut();
          localaAR6.setElementMap(localcpa);
          localaAR6.setPosition(ajb.dif);
          localaAR6.setX(199);
          localaAR6.setY(133);
          localaAR6.setWidth(11);
          localaAR6.setHeight(4);
          localaAR6.setTexture(this.W.aH("default_1.tga"));
          ((Cx)localObject10).bb(localaAR6);
          localaAR6.brn();
          localaAR6.rV();
          aAR localaAR7 = aAR.checkOut();
          localaAR7.setElementMap(localcpa);
          localaAR7.setPosition(ajb.did);
          localaAR7.setX(2);
          localaAR7.setY(309);
          localaAR7.setWidth(1);
          localaAR7.setHeight(4);
          localaAR7.setTexture(this.W.aH("default_0.tga"));
          ((Cx)localObject10).bb(localaAR7);
          localaAR7.brn();
          localaAR7.rV();
          aAR localaAR8 = aAR.checkOut();
          localaAR8.setElementMap(localcpa);
          localaAR8.setPosition(ajb.dhY);
          localaAR8.setX(2);
          localaAR8.setY(674);
          localaAR8.setWidth(1);
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
          localJg3.bb(localaen1);
          localaen1.brn();
          aAR localaAR9 = aAR.checkOut();
          localaAR9.setElementMap(localcpa);
          localaAR9.setPosition(ajb.dhZ);
          localaAR9.setX(701);
          localaAR9.setY(29);
          localaAR9.setWidth(11);
          localaAR9.setHeight(2);
          localaAR9.setTexture(this.W.aH("default_0.tga"));
          localaen1.bb(localaAR9);
          localaAR9.brn();
          localaAR9.rV();
          localaen1.rV();
          aAR localaAR10 = aAR.checkOut();
          localaAR10.setElementMap(localcpa);
          localaAR10.setPosition(ajb.dhZ);
          localaAR10.setX(286);
          localaAR10.setY(3);
          localaAR10.setWidth(11);
          localaAR10.setHeight(5);
          localaAR10.setTexture(this.W.aH("default_0.tga"));
          localJg3.bb(localaAR10);
          localaAR10.brn();
          localaAR10.rV();
          localJg3.rV();
          dOc localdOc8 = (dOc)localObject8;
          Jg localJg4 = localdOc8.getAppearance();
          localJg4.setElementMap(localcpa);
          localJg4.setState("mouseHover");
          ((aNL)localObject8).bb(localJg4);
          localJg4.brn();
          Cx localCx1 = new Cx();
          localCx1.aJ();
          localCx1.setElementMap(localcpa);
          localCx1.setEnabled(false);
          localJg4.bb(localCx1);
          localCx1.brn();
          aAR localaAR11 = aAR.checkOut();
          localaAR11.setElementMap(localcpa);
          localaAR11.setPosition(ajb.dhR);
          localaAR11.setX(477);
          localaAR11.setY(343);
          localaAR11.setWidth(1);
          localaAR11.setHeight(4);
          localaAR11.setTexture(this.W.aH("default_0.tga"));
          localCx1.bb(localaAR11);
          localaAR11.brn();
          localaAR11.rV();
          aAR localaAR12 = aAR.checkOut();
          localaAR12.setElementMap(localcpa);
          localaAR12.setPosition(ajb.dhT);
          localaAR12.setX(510);
          localaAR12.setY(132);
          localaAR12.setWidth(11);
          localaAR12.setHeight(4);
          localaAR12.setTexture(this.W.aH("default_1.tga"));
          localCx1.bb(localaAR12);
          localaAR12.brn();
          localaAR12.rV();
          aAR localaAR13 = aAR.checkOut();
          localaAR13.setElementMap(localcpa);
          localaAR13.setPosition(ajb.dhV);
          localaAR13.setX(2);
          localaAR13.setY(309);
          localaAR13.setWidth(1);
          localaAR13.setHeight(4);
          localaAR13.setTexture(this.W.aH("default_0.tga"));
          localCx1.bb(localaAR13);
          localaAR13.brn();
          localaAR13.rV();
          aAR localaAR14 = aAR.checkOut();
          localaAR14.setElementMap(localcpa);
          localaAR14.setPosition(ajb.dia);
          localaAR14.setX(2);
          localaAR14.setY(690);
          localaAR14.setWidth(1);
          localaAR14.setHeight(13);
          localaAR14.setTexture(this.W.aH("default_0.tga"));
          localCx1.bb(localaAR14);
          localaAR14.brn();
          localaAR14.rV();
          aAR localaAR15 = aAR.checkOut();
          localaAR15.setElementMap(localcpa);
          localaAR15.setPosition(ajb.dih);
          localaAR15.setX(107);
          localaAR15.setY(335);
          localaAR15.setWidth(1);
          localaAR15.setHeight(4);
          localaAR15.setTexture(this.W.aH("default_0.tga"));
          localCx1.bb(localaAR15);
          localaAR15.brn();
          localaAR15.rV();
          aAR localaAR16 = aAR.checkOut();
          localaAR16.setElementMap(localcpa);
          localaAR16.setPosition(ajb.dif);
          localaAR16.setX(614);
          localaAR16.setY(133);
          localaAR16.setWidth(11);
          localaAR16.setHeight(4);
          localaAR16.setTexture(this.W.aH("default_1.tga"));
          localCx1.bb(localaAR16);
          localaAR16.brn();
          localaAR16.rV();
          aAR localaAR17 = aAR.checkOut();
          localaAR17.setElementMap(localcpa);
          localaAR17.setPosition(ajb.did);
          localaAR17.setX(2);
          localaAR17.setY(309);
          localaAR17.setWidth(1);
          localaAR17.setHeight(4);
          localaAR17.setTexture(this.W.aH("default_0.tga"));
          localCx1.bb(localaAR17);
          localaAR17.brn();
          localaAR17.rV();
          aAR localaAR18 = aAR.checkOut();
          localaAR18.setElementMap(localcpa);
          localaAR18.setPosition(ajb.dhY);
          localaAR18.setX(2);
          localaAR18.setY(690);
          localaAR18.setWidth(1);
          localaAR18.setHeight(13);
          localaAR18.setTexture(this.W.aH("default_0.tga"));
          localCx1.bb(localaAR18);
          localaAR18.brn();
          localaAR18.rV();
          localCx1.rV();
          aen localaen2 = aen.checkOut();
          localaen2.setElementMap(localcpa);
          localaen2.setEnabled(false);
          localaen2.setScaled(true);
          localJg4.bb(localaen2);
          localaen2.brn();
          aAR localaAR19 = aAR.checkOut();
          localaAR19.setElementMap(localcpa);
          localaAR19.setPosition(ajb.dhZ);
          localaAR19.setX(648);
          localaAR19.setY(29);
          localaAR19.setWidth(11);
          localaAR19.setHeight(2);
          localaAR19.setTexture(this.W.aH("default_0.tga"));
          localaen2.bb(localaAR19);
          localaAR19.brn();
          localaAR19.rV();
          localaen2.rV();
          aAR localaAR20 = aAR.checkOut();
          localaAR20.setElementMap(localcpa);
          localaAR20.setPosition(ajb.dhZ);
          localaAR20.setX(559);
          localaAR20.setY(213);
          localaAR20.setWidth(11);
          localaAR20.setHeight(5);
          localaAR20.setTexture(this.W.aH("default_0.tga"));
          localJg4.bb(localaAR20);
          localaAR20.brn();
          localaAR20.rV();
          localJg4.rV();
          dOc localdOc9 = (dOc)localObject8;
          Jg localJg5 = localdOc9.getAppearance();
          localJg5.setElementMap(localcpa);
          localJg5.setState("pressed");
          ((aNL)localObject8).bb(localJg5);
          localJg5.brn();
          Cx localCx2 = new Cx();
          localCx2.aJ();
          localCx2.setElementMap(localcpa);
          localCx2.setEnabled(false);
          localJg5.bb(localCx2);
          localCx2.brn();
          aAR localaAR21 = aAR.checkOut();
          localaAR21.setElementMap(localcpa);
          localaAR21.setPosition(ajb.dhR);
          localaAR21.setX(2);
          localaAR21.setY(344);
          localaAR21.setWidth(1);
          localaAR21.setHeight(4);
          localaAR21.setTexture(this.W.aH("default_0.tga"));
          localCx2.bb(localaAR21);
          localaAR21.brn();
          localaAR21.rV();
          aAR localaAR22 = aAR.checkOut();
          localaAR22.setElementMap(localcpa);
          localaAR22.setPosition(ajb.dhT);
          localaAR22.setX(464);
          localaAR22.setY(132);
          localaAR22.setWidth(11);
          localaAR22.setHeight(4);
          localaAR22.setTexture(this.W.aH("default_1.tga"));
          localCx2.bb(localaAR22);
          localaAR22.brn();
          localaAR22.rV();
          aAR localaAR23 = aAR.checkOut();
          localaAR23.setElementMap(localcpa);
          localaAR23.setPosition(ajb.dhV);
          localaAR23.setX(2);
          localaAR23.setY(309);
          localaAR23.setWidth(1);
          localaAR23.setHeight(4);
          localaAR23.setTexture(this.W.aH("default_0.tga"));
          localCx2.bb(localaAR23);
          localaAR23.brn();
          localaAR23.rV();
          a(localCx2);
          b(localCx2);
          d(localCx2);
          e(localCx2);
          f(localCx2);
          localCx2.rV();
          g(localJg5);
          h(localJg5);
          localJg5.rV();
        }
        ((Jg)localObject5).rV();
      }
      localJg2.rV();
    }
    localJg1.rV();
  }

  public bdj a(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localaAR.setPosition(ajb.dia);
    localaAR.setX(2);
    localaAR.setY(738);
    localaAR.setWidth(1);
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
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localaAR.setPosition(ajb.dih);
    localaAR.setX(2);
    localaAR.setY(323);
    localaAR.setWidth(1);
    localaAR.setHeight(4);
    localaAR.setTexture(this.W.aH("default_0.tga"));
    parambdj.bb(localaAR);
    localaAR.brn();
    localaAR.rV();
    return localaAR;
  }

  public bdj d(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localaAR.setPosition(ajb.dif);
    localaAR.setX(1008);
    localaAR.setY(133);
    localaAR.setWidth(11);
    localaAR.setHeight(4);
    localaAR.setTexture(this.W.aH("default_1.tga"));
    parambdj.bb(localaAR);
    localaAR.brn();
    localaAR.rV();
    return localaAR;
  }

  public bdj e(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localaAR.setPosition(ajb.did);
    localaAR.setX(2);
    localaAR.setY(309);
    localaAR.setWidth(1);
    localaAR.setHeight(4);
    localaAR.setTexture(this.W.aH("default_0.tga"));
    parambdj.bb(localaAR);
    localaAR.brn();
    localaAR.rV();
    return localaAR;
  }

  public bdj f(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localaAR.setPosition(ajb.dhY);
    localaAR.setX(2);
    localaAR.setY(738);
    localaAR.setWidth(1);
    localaAR.setHeight(13);
    localaAR.setTexture(this.W.aH("default_0.tga"));
    parambdj.bb(localaAR);
    localaAR.brn();
    localaAR.rV();
    return localaAR;
  }

  public bdj g(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    aen localaen = aen.checkOut();
    localaen.setElementMap(localcpa);
    localaen.setEnabled(false);
    localaen.setScaled(true);
    parambdj.bb(localaen);
    localaen.brn();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localaAR.setPosition(ajb.dhZ);
    localaAR.setX(755);
    localaAR.setY(29);
    localaAR.setWidth(11);
    localaAR.setHeight(2);
    localaAR.setTexture(this.W.aH("default_0.tga"));
    localaen.bb(localaAR);
    localaAR.brn();
    localaAR.rV();
    localaen.rV();
    return localaen;
  }

  public bdj h(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localaAR.setPosition(ajb.dhZ);
    localaAR.setX(310);
    localaAR.setY(141);
    localaAR.setWidth(11);
    localaAR.setHeight(5);
    localaAR.setTexture(this.W.aH("default_1.tga"));
    parambdj.bb(localaAR);
    localaAR.brn();
    localaAR.rV();
    return localaAR;
  }
}