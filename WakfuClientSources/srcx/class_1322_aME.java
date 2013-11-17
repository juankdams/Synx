import java.util.Stack;

public class aME
  implements cEa
{
  private Stack X = new Stack();
  private cDA Y;

  public bdj a(cDA paramcDA, cpa paramcpa)
  {
    this.Y = paramcDA;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    String str1 = "mainContainer";
    dRq localdRq = dRq.checkOut();
    localdRq.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localdRq);
    localdRq.setStyle("genericSplash");
    localdRq.setNonBlocking(true);
    localdRq.brn();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setElementMap(localcpa);
    localcwP.setAlign(ajb.dhZ);
    localcwP.setYOffset(160);
    localdRq.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    aId localaId = aId.checkOut();
    localaId.setHorizontal(false);
    localaId.setAlign(aFG.ecn);
    localdRq.bb(localaId);
    localaId.brn();
    localaId.rV();
    String str2 = "text";
    cWk localcWk = new cWk();
    localcWk.aJ();
    localcWk.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localcWk);
    localcWk.setStyle("BigBordered");
    localcWk.setNonBlocking(true);
    localcWk.setMinWidth(1);
    localcWk.setMaxWidth(350);
    localdRq.bb(localcWk);
    localcWk.brn();
    NK localNK = NK.checkOut();
    localNK.setElementMap(localcpa);
    localNK.setAttribute("text");
    localNK.setName("splashText");
    localcWk.bb(localNK);
    localNK.brn();
    localNK.rV();
    localcWk.rV();
    localdRq.rV();
    return localdRq;
  }
}