import java.awt.Insets;
import java.util.Stack;

public class bTU
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
    localcWk.setMinWidth(1);
    localcWk.setMaxWidth(200);
    localdRq2.bb(localcWk);
    localcWk.brn();
    NK localNK1 = NK.checkOut();
    localNK1.setElementMap(localcpa);
    localNK1.setName("mapPopupDescription");
    localNK1.setAttribute("text");
    localcWk.bb(localNK1);
    localNK1.brn();
    localNK1.rV();
    NK localNK2 = NK.checkOut();
    localNK2.setElementMap(localcpa);
    localNK2.setName("mapPopupIsEditing");
    localNK2.setAttribute("visible");
    localcWk.bb(localNK2);
    localNK2.brn();
    anQ localanQ = new anQ();
    localanQ.aJ();
    localanQ.setElementMap(localcpa);
    localNK2.bb(localanQ);
    localanQ.brn();
    bqW localbqW = new bqW();
    localbqW.aJ();
    localbqW.setElementMap(localcpa);
    localanQ.bb(localbqW);
    localbqW.brn();
    localbqW.rV();
    localanQ.rV();
    localNK2.rV();
    localcWk.rV();
    String str3 = "textEditor";
    aTp localaTp = new aTp();
    localaTp.aJ();
    localaTp.setElementMap(localcpa);
    if ((localcpa != null) && (str3 != null))
      localcpa.a(str3, localaTp);
    localaTp.setStyle("withoutBorder");
    localaTp.setMaxChars(200);
    localaTp.setMinWidth(200);
    localaTp.setMaxWidth(200);
    dbp localdbp = new dbp();
    localdbp.hg("wakfu.map:onTextEditorChange");
    localaTp.setOnKeyType(localdbp);
    aOn localaOn = new aOn();
    localaOn.hg("wakfu.map:onTextEditorKeyPress");
    localaTp.setOnKeyPress(localaOn);
    localaTp.setFocusable(true);
    localaTp.setSelectOnFocus(true);
    localdRq2.bb(localaTp);
    localaTp.brn();
    NK localNK3 = NK.checkOut();
    localNK3.setElementMap(localcpa);
    localNK3.setName("mapPopupDescription");
    localNK3.setAttribute("text");
    localaTp.bb(localNK3);
    localNK3.brn();
    localNK3.rV();
    NK localNK4 = NK.checkOut();
    localNK4.setElementMap(localcpa);
    localNK4.setName("mapPopupIsEditing");
    localNK4.setAttribute("visible");
    localaTp.bb(localNK4);
    localNK4.brn();
    localNK4.rV();
    NK localNK5 = NK.checkOut();
    localNK5.setElementMap(localcpa);
    localNK5.setName("mapPopupIsEditing");
    localNK5.setAttribute("focused");
    localaTp.bb(localNK5);
    localNK5.brn();
    localNK5.rV();
    localaTp.rV();
    String str4 = "valid";
    biy localbiy = new biy();
    localbiy.aJ();
    localbiy.setElementMap(localcpa);
    if ((localcpa != null) && (str4 != null))
      localcpa.a(str4, localbiy);
    localbiy.setStyle("smallValid");
    csA localcsA = new csA();
    localcsA.hg("wakfu.map:applyNote");
    localbiy.setOnClick(localcsA);
    localdRq2.bb(localbiy);
    localbiy.brn();
    NK localNK6 = NK.checkOut();
    localNK6.setElementMap(localcpa);
    localNK6.setName("mapPopupIsEditing");
    localNK6.setAttribute("visible");
    localbiy.bb(localNK6);
    localNK6.brn();
    localNK6.rV();
    localbiy.rV();
    localdRq2.rV();
    String str5 = "image";
    czv localczv = new czv();
    localczv.aJ();
    localczv.setElementMap(localcpa);
    if ((localcpa != null) && (str5 != null))
      localcpa.a(str5, localczv);
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