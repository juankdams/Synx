import java.util.Stack;

public class cny
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
    ((dil)localJg).setScaled(true);
    paramdOc.bb(localJg);
    localJg.brn();
    String str = "pmIconRelic";
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    if ((localcpa != null) && (str != null))
      localcpa.a(str, localaAR);
    localaAR.setPosition(ajb.dhZ);
    localaAR.setX(1004);
    localaAR.setY(267);
    localaAR.setWidth(16);
    localaAR.setHeight(20);
    localaAR.setTexture(this.W.aH("default_0.tga"));
    localJg.bb(localaAR);
    localaAR.brn();
    localaAR.rV();
    localJg.rV();
  }
}