import java.util.Stack;

public class awx
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
    cwP localcwP1 = new cwP();
    localcwP1.aJ();
    localcwP1.setElementMap(localcpa);
    localcwP1.setSize(new Or(-2, -2));
    localdRq.bb(localcwP1);
    localcwP1.brn();
    localcwP1.rV();
    czO localczO = new czO();
    localczO.aJ();
    localczO.setAdaptToContentSize(true);
    localdRq.bb(localczO);
    localczO.brn();
    localczO.rV();
    String str = "image";
    czv localczv = new czv();
    localczv.aJ();
    localczv.setElementMap(localcpa);
    if ((localcpa != null) && (str != null))
      localcpa.a(str, localczv);
    localczv.setNonBlocking(true);
    localdRq.bb(localczv);
    localczv.brn();
    cwP localcwP2 = new cwP();
    localcwP2.aJ();
    localcwP2.setElementMap(localcpa);
    localcwP2.setSize(new Or(100.0F, 100.0F));
    localczv.bb(localcwP2);
    localcwP2.brn();
    localcwP2.rV();
    localczv.rV();
    localdRq.rV();
    return localdRq;
  }
}