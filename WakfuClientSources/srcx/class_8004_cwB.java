import java.util.Stack;

public class cwB
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
    ((bXR)localJg).setEndX(947);
    ((bXR)localJg).setEndY(465);
    ((bXR)localJg).setStartX(63);
    ((bXR)localJg).setStartY(37);
    paramdOc.bb(localJg);
    localJg.brn();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localaAR.setPosition(ajb.dhZ);
    localaAR.setX(2);
    localaAR.setY(464);
    localaAR.setWidth(1018);
    localaAR.setHeight(558);
    localaAR.setTexture(this.W.aH("map_0.tga"));
    localJg.bb(localaAR);
    localaAR.brn();
    localaAR.rV();
    localJg.rV();
  }
}