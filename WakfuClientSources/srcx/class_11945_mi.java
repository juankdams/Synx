import java.util.Stack;

public class mi
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
    ((dil)localJg).setScaled(false);
    paramdOc.bb(localJg);
    localJg.brn();
    String str = "pmSmallBackStabRes";
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    if ((localcpa != null) && (str != null))
      localcpa.a(str, localaAR);
    localaAR.setPosition(ajb.dhZ);
    localaAR.setX(230);
    localaAR.setY(376);
    localaAR.setWidth(21);
    localaAR.setHeight(14);
    localaAR.setTexture(this.W.aH("default_0.tga"));
    localJg.bb(localaAR);
    localaAR.brn();
    localaAR.rV();
    localJg.rV();
  }
}