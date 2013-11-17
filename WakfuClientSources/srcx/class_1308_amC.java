import java.util.Stack;

public class amC
  implements cEa
{
  private Stack X = new Stack();
  private cDA Y;

  public bdj a(cDA paramcDA, cpa paramcpa)
  {
    this.Y = paramcDA;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    dRq localdRq = dRq.checkOut();
    localdRq.setElementMap(localcpa);
    localdRq.brn();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setElementMap(localcpa);
    localcwP.setSize(new Or(200, 200));
    localcwP.setAlign(ajb.dhZ);
    localdRq.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    aHr localaHr = new aHr();
    localaHr.aJ();
    localaHr.setElementMap(localcpa);
    localaHr.setProximity(0.5F);
    localaHr.setAngle(14.5F);
    localdRq.bb(localaHr);
    localaHr.brn();
    localaHr.rV();
    localdRq.rV();
    return localdRq;
  }
}