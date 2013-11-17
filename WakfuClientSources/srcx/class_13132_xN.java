import java.util.Stack;

public class xN
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
    Jg localJg = localdOc2.getAppearance();
    localJg.setElementMap(localcpa);
    localJg.setState("default");
    paramdOc.bb(localJg);
    localJg.brn();
    String str = "pmEcosystemMdcWillBoundary";
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    if ((localcpa != null) && (str != null))
      localcpa.a(str, localaAR);
    localaAR.setPosition(ajb.dhZ);
    localaAR.setX(924);
    localaAR.setY(127);
    localaAR.setWidth(80);
    localaAR.setHeight(3);
    localaAR.setTexture(this.W.aH("default_1.tga"));
    localJg.bb(localaAR);
    localaAR.brn();
    localaAR.rV();
    localJg.rV();
  }
}