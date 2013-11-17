import java.util.Stack;

public class dbc
  implements cEa
{
  private Stack X = new Stack();
  private cDA Y;

  public bdj a(cDA paramcDA, cpa paramcpa)
  {
    this.Y = paramcDA;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    String str1 = "mru";
    dBz localdBz = new dBz();
    localdBz.aJ();
    localdBz.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localdBz);
    localdBz.brn();
    String str2 = "popup";
    anG localanG = new anG();
    localanG.aJ();
    localanG.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localanG);
    localanG.setAlign(aFG.ech);
    localanG.setHotSpotPosition(aFG.ecn);
    localdBz.bb(localanG);
    localanG.brn();
    dRq localdRq = dRq.checkOut();
    localdRq.setElementMap(localcpa);
    localdRq.setStyle("popup");
    localanG.bb(localdRq);
    localdRq.brn();
    String str3 = "popupText";
    cWk localcWk = new cWk();
    localcWk.aJ();
    localcWk.setElementMap(localcpa);
    if ((localcpa != null) && (str3 != null))
      localcpa.a(str3, localcWk);
    localcWk.setStyle("white");
    localdRq.bb(localcWk);
    localcWk.brn();
    localcWk.rV();
    localdRq.rV();
    localanG.rV();
    biy localbiy = new biy();
    localbiy.aJ();
    localbiy.setElementMap(localcpa);
    localdBz.bb(localbiy);
    localbiy.brn();
    localbiy.rV();
    localdBz.rV();
    return localdBz;
  }
}