import java.awt.Insets;
import java.util.Stack;

public class dix
  implements cEa
{
  private Stack X = new Stack();
  private cDA Y;

  public bdj a(cDA paramcDA, cpa paramcpa)
  {
    this.Y = paramcDA;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    String str1 = "popup";
    anG localanG = new anG();
    localanG.aJ();
    localanG.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localanG);
    localanG.setAlign(aFG.eci);
    localanG.setHotSpotPosition(aFG.ecm);
    localanG.setHideOnClick(false);
    localanG.brn();
    cwP localcwP1 = new cwP();
    localcwP1.aJ();
    localcwP1.setElementMap(localcpa);
    localcwP1.setSize(new Or(-2, -2));
    localanG.bb(localcwP1);
    localcwP1.brn();
    localcwP1.rV();
    dRq localdRq1 = dRq.checkOut();
    localdRq1.setElementMap(localcpa);
    localanG.bb(localdRq1);
    localdRq1.brn();
    czO localczO = new czO();
    localczO.aJ();
    localczO.setAdaptToContentSize(true);
    localdRq1.bb(localczO);
    localczO.brn();
    localczO.rV();
    String str2 = "container";
    dRq localdRq2 = dRq.checkOut();
    localdRq2.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localdRq2);
    localdRq2.setStyle("chatBubble");
    localdRq1.bb(localdRq2);
    localdRq2.brn();
    cwP localcwP2 = new cwP();
    localcwP2.aJ();
    localcwP2.setElementMap(localcpa);
    localcwP2.setSize(new Or(100.0F, 100.0F));
    localdRq2.bb(localcwP2);
    localcwP2.brn();
    localcwP2.rV();
    dRq localdRq3 = localdRq2;
    Jg localJg = localdRq3.getAppearance();
    localJg.setElementMap(localcpa);
    localdRq2.bb(localJg);
    localJg.brn();
    bmv localbmv = bmv.checkOut();
    localbmv.setElementMap(localcpa);
    localbmv.setInsets(new Insets(0, 0, 15, 0));
    localJg.bb(localbmv);
    localbmv.brn();
    localbmv.rV();
    cuR localcuR = new cuR();
    localcuR.aJ();
    localcuR.setElementMap(localcpa);
    localcuR.setInsets(new Insets(10, 15, 10, 15));
    localJg.bb(localcuR);
    localcuR.brn();
    localcuR.rV();
    localJg.rV();
    cWk localcWk = new cWk();
    localcWk.aJ();
    localcWk.setElementMap(localcpa);
    localcWk.setStyle("smallboldMap");
    localdRq2.bb(localcWk);
    localcWk.brn();
    NK localNK = NK.checkOut();
    localNK.setElementMap(localcpa);
    localNK.setName("mapPopupDescription");
    localNK.setAttribute("text");
    localcWk.bb(localNK);
    localNK.brn();
    localNK.rV();
    localcWk.rV();
    localdRq2.rV();
    String str3 = "image";
    czv localczv = new czv();
    localczv.aJ();
    localczv.setElementMap(localcpa);
    if ((localcpa != null) && (str3 != null))
      localcpa.a(str3, localczv);
    localczv.setStyle("BubbleArrowLeft");
    localczv.setNonBlocking(true);
    localdRq1.bb(localczv);
    localczv.brn();
    cwP localcwP3 = new cwP();
    localcwP3.aJ();
    localcwP3.setElementMap(localcpa);
    localcwP3.setAlign(ajb.did);
    localcwP3.setSize(new Or(-2, -2));
    localczv.bb(localcwP3);
    localcwP3.brn();
    localcwP3.rV();
    localczv.rV();
    localdRq1.rV();
    localanG.rV();
    return localanG;
  }
}