import java.util.Stack;

public class cJG
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
    paramdOc.bb(localJg);
    localJg.brn();
    cag localcag = new cag();
    localcag.aJ();
    localcag.setElementMap(localcpa);
    localcag.setAlignment(aFG.eck);
    localcag.setFile("6001044.xps");
    localcag.setLevel(100);
    localJg.bb(localcag);
    localcag.brn();
    localcag.rV();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localaAR.setPosition(ajb.dhZ);
    localaAR.setX(326);
    localaAR.setY(213);
    localaAR.setWidth(18);
    localaAR.setHeight(18);
    localaAR.setTexture(this.W.aH("default_1.tga"));
    localJg.bb(localaAR);
    localaAR.brn();
    localaAR.rV();
    localJg.rV();
  }
}