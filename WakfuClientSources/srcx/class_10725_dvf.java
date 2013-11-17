import java.util.Stack;

public class dvf
  implements cEa
{
  private Stack X = new Stack();
  private cDA Y;

  public bdj a(cDA paramcDA, cpa paramcpa)
  {
    this.Y = paramcDA;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    String str = "popupMenu";
    cxO localcxO = new cxO();
    localcxO.aJ();
    localcxO.setElementMap(localcpa);
    if ((localcpa != null) && (str != null))
      localcpa.a(str, localcxO);
    localcxO.setHotSpotPosition(aFG.ech);
    localcxO.brn();
    biy localbiy = new biy();
    localbiy.aJ();
    localbiy.setElementMap(localcpa);
    localbiy.setStyle("popupMenu");
    localcxO.bb(localbiy);
    localbiy.brn();
    localbiy.rV();
    caF localcaF = new caF();
    localcaF.aJ();
    localcaF.setElementMap(localcpa);
    localcaF.setStyle("popupMenu");
    localcaF.setMaxWidth(250);
    localcxO.bb(localcaF);
    localcaF.brn();
    localcaF.rV();
    oc localoc = new oc();
    localoc.aJ();
    localoc.setElementMap(localcpa);
    localoc.setStyle("popupMenu");
    localcxO.bb(localoc);
    localoc.brn();
    localoc.rV();
    localcxO.rV();
    return localcxO;
  }
}