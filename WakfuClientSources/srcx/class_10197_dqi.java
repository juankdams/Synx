import java.util.Stack;

public class dqi
  implements cEa
{
  private Stack X = new Stack();
  private cDA Y;

  public bdj a(cDA paramcDA, cpa paramcpa)
  {
    this.Y = paramcDA;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    String str = "popup";
    anG localanG = new anG();
    localanG.aJ();
    localanG.setElementMap(localcpa);
    if ((localcpa != null) && (str != null))
      localcpa.a(str, localanG);
    localanG.setAlign(aFG.ech);
    localanG.setHotSpotPosition(aFG.ecn);
    localanG.setHideOnClick(false);
    localanG.brn();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setElementMap(localcpa);
    localcwP.setSize(new Or(-2, -2));
    localanG.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    dRq localdRq = dRq.checkOut();
    localdRq.setElementMap(localcpa);
    localdRq.setStyle("popup");
    localanG.bb(localdRq);
    localdRq.brn();
    cWk localcWk = new cWk();
    localcWk.aJ();
    localcWk.setElementMap(localcpa);
    localcWk.setStyle("white");
    localcWk.setMinWidth(1);
    localcWk.setMaxWidth(200);
    localdRq.bb(localcWk);
    localcWk.brn();
    NK localNK = NK.checkOut();
    localNK.setElementMap(localcpa);
    localNK.setName("minimapPopupDescription");
    localNK.setAttribute("text");
    localcWk.bb(localNK);
    localNK.brn();
    localNK.rV();
    localcWk.rV();
    localdRq.rV();
    localanG.rV();
    return localanG;
  }
}