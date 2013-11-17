import java.util.Stack;

public class baS
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
    Jg localJg = localdOc1.getAppearance();
    localJg.setElementMap(localcpa);
    paramdOc.bb(localJg);
    localJg.brn();
    dOc localdOc2 = (dOc)localJg.getParentOfType(dOc.class);
    dOc localdOc3 = localdOc2.getWidgetByThemeElementName("progressBar", false);
    Object localObject2;
    Object localObject3;
    aAR localaAR1;
    if (localdOc3 != null)
    {
      localdOc4 = (dOc)localdOc3;
      localObject1 = localdOc4.getAppearance();
      ((Jg)localObject1).setElementMap(localcpa);
      localdOc3.bb((bdj)localObject1);
      ((Jg)localObject1).brn();
      localObject2 = aAR.checkOut();
      ((aAR)localObject2).setElementMap(localcpa);
      ((aAR)localObject2).setPosition(ajb.dhR);
      ((aAR)localObject2).setX(6);
      ((aAR)localObject2).setY(178);
      ((aAR)localObject2).setWidth(32);
      ((aAR)localObject2).setHeight(32);
      ((aAR)localObject2).setTexture(this.W.aH("default_0.tga"));
      ((Jg)localObject1).bb((bdj)localObject2);
      ((aAR)localObject2).brn();
      ((aAR)localObject2).rV();
      localObject3 = aAR.checkOut();
      ((aAR)localObject3).setElementMap(localcpa);
      ((aAR)localObject3).setPosition(ajb.dhT);
      ((aAR)localObject3).setX(6);
      ((aAR)localObject3).setY(178);
      ((aAR)localObject3).setWidth(32);
      ((aAR)localObject3).setHeight(32);
      ((aAR)localObject3).setTexture(this.W.aH("default_0.tga"));
      ((Jg)localObject1).bb((bdj)localObject3);
      ((aAR)localObject3).brn();
      ((aAR)localObject3).rV();
      localaAR1 = aAR.checkOut();
      localaAR1.setElementMap(localcpa);
      localaAR1.setPosition(ajb.dhV);
      localaAR1.setX(6);
      localaAR1.setY(178);
      localaAR1.setWidth(32);
      localaAR1.setHeight(32);
      localaAR1.setTexture(this.W.aH("default_0.tga"));
      ((Jg)localObject1).bb(localaAR1);
      localaAR1.brn();
      localaAR1.rV();
      aAR localaAR2 = aAR.checkOut();
      localaAR2.setElementMap(localcpa);
      localaAR2.setPosition(ajb.dhY);
      localaAR2.setX(6);
      localaAR2.setY(178);
      localaAR2.setWidth(32);
      localaAR2.setHeight(32);
      localaAR2.setTexture(this.W.aH("default_0.tga"));
      ((Jg)localObject1).bb(localaAR2);
      localaAR2.brn();
      localaAR2.rV();
      aAR localaAR3 = aAR.checkOut();
      localaAR3.setElementMap(localcpa);
      localaAR3.setPosition(ajb.dhZ);
      localaAR3.setX(6);
      localaAR3.setY(178);
      localaAR3.setWidth(32);
      localaAR3.setHeight(32);
      localaAR3.setTexture(this.W.aH("default_0.tga"));
      ((Jg)localObject1).bb(localaAR3);
      localaAR3.brn();
      localaAR3.rV();
      aAR localaAR4 = aAR.checkOut();
      localaAR4.setElementMap(localcpa);
      localaAR4.setPosition(ajb.dia);
      localaAR4.setX(6);
      localaAR4.setY(178);
      localaAR4.setWidth(32);
      localaAR4.setHeight(32);
      localaAR4.setTexture(this.W.aH("default_0.tga"));
      ((Jg)localObject1).bb(localaAR4);
      localaAR4.brn();
      localaAR4.rV();
      aAR localaAR5 = aAR.checkOut();
      localaAR5.setElementMap(localcpa);
      localaAR5.setPosition(ajb.did);
      localaAR5.setX(6);
      localaAR5.setY(178);
      localaAR5.setWidth(32);
      localaAR5.setHeight(32);
      localaAR5.setTexture(this.W.aH("default_0.tga"));
      ((Jg)localObject1).bb(localaAR5);
      localaAR5.brn();
      localaAR5.rV();
      aAR localaAR6 = aAR.checkOut();
      localaAR6.setElementMap(localcpa);
      localaAR6.setPosition(ajb.dif);
      localaAR6.setX(6);
      localaAR6.setY(178);
      localaAR6.setWidth(32);
      localaAR6.setHeight(32);
      localaAR6.setTexture(this.W.aH("default_0.tga"));
      ((Jg)localObject1).bb(localaAR6);
      localaAR6.brn();
      localaAR6.rV();
      aAR localaAR7 = aAR.checkOut();
      localaAR7.setElementMap(localcpa);
      localaAR7.setPosition(ajb.dih);
      localaAR7.setX(6);
      localaAR7.setY(178);
      localaAR7.setWidth(32);
      localaAR7.setHeight(32);
      localaAR7.setTexture(this.W.aH("default_0.tga"));
      ((Jg)localObject1).bb(localaAR7);
      localaAR7.brn();
      localaAR7.rV();
      ((Jg)localObject1).rV();
    }
    dOc localdOc4 = (dOc)localJg.getParentOfType(dOc.class);
    Object localObject1 = localdOc4.getWidgetByThemeElementName("compassOrientation", false);
    if (localObject1 != null)
    {
      localObject2 = (dOc)localObject1;
      localObject3 = ((dOc)localObject2).getAppearance();
      ((Jg)localObject3).setElementMap(localcpa);
      ((dil)localObject3).setScaled(false);
      ((aNL)localObject1).bb((bdj)localObject3);
      ((Jg)localObject3).brn();
      localaAR1 = aAR.checkOut();
      localaAR1.setElementMap(localcpa);
      localaAR1.setPosition(ajb.dhZ);
      localaAR1.setX(345);
      localaAR1.setY(377);
      localaAR1.setWidth(48);
      localaAR1.setHeight(48);
      localaAR1.setTexture(this.W.aH("default_0.tga"));
      ((Jg)localObject3).bb(localaAR1);
      localaAR1.brn();
      localaAR1.rV();
      ((Jg)localObject3).rV();
    }
    localJg.rV();
  }
}