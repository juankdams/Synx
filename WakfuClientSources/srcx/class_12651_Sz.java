import java.util.Stack;

public class Sz
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
    localcwP.setAlign(ajb.dhZ);
    localcwP.setSize(new Or(90.0F, 90.0F));
    localdRq.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    String str = "text";
    cWk localcWk = new cWk();
    localcWk.aJ();
    localcWk.setElementMap(localcpa);
    if ((localcpa != null) && (str != null))
      localcpa.a(str, localcWk);
    localcWk.setNonBlocking(true);
    localcWk.setMultiline(true);
    localcWk.setStyle("systemMessage");
    localdRq.bb(localcWk);
    localcWk.brn();
    localcWk.rV();
    localdRq.rV();
    return localdRq;
  }
}