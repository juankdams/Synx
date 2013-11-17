import java.util.Stack;

public class ctK
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
    dOc localdOc2 = (dOc)localJg1.getParentOfType(dOc.class);
    dOc localdOc3 = localdOc2.getWidgetByThemeElementName("decreaseButton", false);
    Object localObject2;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    Object localObject7;
    Object localObject8;
    if (localdOc3 != null)
    {
      localdOc4 = (dOc)localdOc3;
      localObject1 = localdOc4.getAppearance();
      ((Jg)localObject1).setElementMap(localcpa);
      ((cwJ)localObject1).setAlignment(aFG.eck);
      ((Jg)localObject1).setState("default");
      localdOc3.bb((bdj)localObject1);
      ((Jg)localObject1).brn();
      localObject2 = aAR.checkOut();
      ((aAR)localObject2).setElementMap(localcpa);
      ((aAR)localObject2).setPosition(ajb.dhZ);
      ((aAR)localObject2).setX(33);
      ((aAR)localObject2).setY(480);
      ((aAR)localObject2).setWidth(28);
      ((aAR)localObject2).setHeight(30);
      ((aAR)localObject2).setTexture(this.W.aH("mru_0.tga"));
      ((Jg)localObject1).bb((bdj)localObject2);
      ((aAR)localObject2).brn();
      ((aAR)localObject2).rV();
      ((Jg)localObject1).rV();
      localObject3 = (dOc)localdOc3;
      localObject4 = ((dOc)localObject3).getAppearance();
      ((Jg)localObject4).setElementMap(localcpa);
      ((cwJ)localObject4).setAlignment(aFG.eck);
      ((Jg)localObject4).setState("mouseHover");
      localdOc3.bb((bdj)localObject4);
      ((Jg)localObject4).brn();
      localObject5 = aAR.checkOut();
      ((aAR)localObject5).setElementMap(localcpa);
      ((aAR)localObject5).setPosition(ajb.dhZ);
      ((aAR)localObject5).setX(64);
      ((aAR)localObject5).setY(480);
      ((aAR)localObject5).setWidth(28);
      ((aAR)localObject5).setHeight(30);
      ((aAR)localObject5).setTexture(this.W.aH("mru_0.tga"));
      ((Jg)localObject4).bb((bdj)localObject5);
      ((aAR)localObject5).brn();
      ((aAR)localObject5).rV();
      ((Jg)localObject4).rV();
      localObject6 = (dOc)localdOc3;
      localObject7 = ((dOc)localObject6).getAppearance();
      ((Jg)localObject7).setElementMap(localcpa);
      ((cwJ)localObject7).setAlignment(aFG.eck);
      ((Jg)localObject7).setState("pressed");
      localdOc3.bb((bdj)localObject7);
      ((Jg)localObject7).brn();
      localObject8 = aAR.checkOut();
      ((aAR)localObject8).setElementMap(localcpa);
      ((aAR)localObject8).setPosition(ajb.dhZ);
      ((aAR)localObject8).setX(126);
      ((aAR)localObject8).setY(480);
      ((aAR)localObject8).setWidth(28);
      ((aAR)localObject8).setHeight(30);
      ((aAR)localObject8).setTexture(this.W.aH("mru_0.tga"));
      ((Jg)localObject7).bb((bdj)localObject8);
      ((aAR)localObject8).brn();
      ((aAR)localObject8).rV();
      ((Jg)localObject7).rV();
    }
    dOc localdOc4 = (dOc)localJg1.getParentOfType(dOc.class);
    Object localObject1 = localdOc4.getWidgetByThemeElementName("increaseButton", false);
    if (localObject1 != null)
    {
      localObject2 = (dOc)localObject1;
      localObject3 = ((dOc)localObject2).getAppearance();
      ((Jg)localObject3).setElementMap(localcpa);
      ((cwJ)localObject3).setAlignment(aFG.eck);
      ((Jg)localObject3).setState("default");
      ((aNL)localObject1).bb((bdj)localObject3);
      ((Jg)localObject3).brn();
      localObject4 = aAR.checkOut();
      ((aAR)localObject4).setElementMap(localcpa);
      ((aAR)localObject4).setPosition(ajb.dhZ);
      ((aAR)localObject4).setX(2);
      ((aAR)localObject4).setY(480);
      ((aAR)localObject4).setWidth(28);
      ((aAR)localObject4).setHeight(30);
      ((aAR)localObject4).setTexture(this.W.aH("mru_0.tga"));
      ((Jg)localObject3).bb((bdj)localObject4);
      ((aAR)localObject4).brn();
      ((aAR)localObject4).rV();
      ((Jg)localObject3).rV();
      localObject5 = (dOc)localObject1;
      localObject6 = ((dOc)localObject5).getAppearance();
      ((Jg)localObject6).setElementMap(localcpa);
      ((cwJ)localObject6).setAlignment(aFG.eck);
      ((Jg)localObject6).setState("mouseHover");
      ((aNL)localObject1).bb((bdj)localObject6);
      ((Jg)localObject6).brn();
      localObject7 = aAR.checkOut();
      ((aAR)localObject7).setElementMap(localcpa);
      ((aAR)localObject7).setPosition(ajb.dhZ);
      ((aAR)localObject7).setX(95);
      ((aAR)localObject7).setY(480);
      ((aAR)localObject7).setWidth(28);
      ((aAR)localObject7).setHeight(30);
      ((aAR)localObject7).setTexture(this.W.aH("mru_0.tga"));
      ((Jg)localObject6).bb((bdj)localObject7);
      ((aAR)localObject7).brn();
      ((aAR)localObject7).rV();
      ((Jg)localObject6).rV();
      localObject8 = (dOc)localObject1;
      Jg localJg2 = ((dOc)localObject8).getAppearance();
      localJg2.setElementMap(localcpa);
      ((cwJ)localJg2).setAlignment(aFG.eck);
      localJg2.setState("pressed");
      ((aNL)localObject1).bb(localJg2);
      localJg2.brn();
      aAR localaAR = aAR.checkOut();
      localaAR.setElementMap(localcpa);
      localaAR.setPosition(ajb.dhZ);
      localaAR.setX(157);
      localaAR.setY(480);
      localaAR.setWidth(28);
      localaAR.setHeight(30);
      localaAR.setTexture(this.W.aH("mru_0.tga"));
      localJg2.bb(localaAR);
      localaAR.brn();
      localaAR.rV();
      localJg2.rV();
    }
    localJg1.rV();
  }
}