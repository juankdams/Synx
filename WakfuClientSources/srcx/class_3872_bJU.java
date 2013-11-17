import java.util.Stack;

public class bJU
  implements cEa
{
  private Stack X = new Stack();
  private cDA Y;

  public bdj a(cDA paramcDA, cpa paramcpa)
  {
    this.Y = paramcDA;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    String str1 = "container1";
    dRq localdRq1 = dRq.checkOut();
    localdRq1.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localdRq1);
    localdRq1.brn();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setElementMap(localcpa);
    localcwP.setAlign(ajb.dhZ);
    localcwP.setYOffset(150);
    localdRq1.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    String str2 = "container2";
    dRq localdRq2 = dRq.checkOut();
    localdRq2.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localdRq2);
    localdRq1.bb(localdRq2);
    localdRq2.brn();
    String str3 = "text";
    cWk localcWk = new cWk();
    localcWk.aJ();
    localcWk.setElementMap(localcpa);
    if ((localcpa != null) && (str3 != null))
      localcpa.a(str3, localcWk);
    localcWk.setStyle("systemMessage");
    localcWk.setMinWidth(1);
    localcWk.setMaxWidth(700);
    localcWk.setNonBlocking(true);
    localdRq2.bb(localcWk);
    localcWk.brn();
    localcWk.rV();
    localdRq2.rV();
    localdRq1.rV();
    return localdRq1;
  }
}