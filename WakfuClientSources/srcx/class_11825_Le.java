import java.util.Stack;

public class Le
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
    dOc localdOc3 = localdOc2.getWidgetByThemeElementName("horizontalButton", false);
    if (localdOc3 != null)
    {
      dOc localdOc4 = (dOc)localdOc3;
      Jg localJg2 = localdOc4.getAppearance();
      localJg2.setElementMap(localcpa);
      localJg2.setState("default");
      localdOc3.bb(localJg2);
      localJg2.brn();
      String str = "pmCurrentWakfuSlider";
      aAR localaAR = aAR.checkOut();
      localaAR.setElementMap(localcpa);
      if ((localcpa != null) && (str != null))
        localcpa.a(str, localaAR);
      localaAR.setPosition(ajb.dhZ);
      localaAR.setX(297);
      localaAR.setY(163);
      localaAR.setWidth(23);
      localaAR.setHeight(12);
      localaAR.setTexture(this.W.aH("default_1.tga"));
      localJg2.bb(localaAR);
      localaAR.brn();
      localaAR.rV();
      localJg2.rV();
    }
    localJg1.rV();
  }
}