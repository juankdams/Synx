import java.awt.Insets;
import java.util.Stack;

public class cJz
  implements cEa
{
  private Stack X = new Stack();
  private cDA Y;

  public bdj a(cDA paramcDA, cpa paramcpa)
  {
    this.Y = paramcDA;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    String str1 = "mainWindow";
    dRq localdRq1 = dRq.checkOut();
    localdRq1.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localdRq1);
    localdRq1.setNonBlocking(false);
    localdRq1.setStyle("backgroundPopup");
    localdRq1.brn();
    dRq localdRq2 = localdRq1;
    Jg localJg = localdRq2.getAppearance();
    localJg.setElementMap(localcpa);
    localdRq1.bb(localJg);
    localJg.brn();
    cuR localcuR = new cuR();
    localcuR.aJ();
    localcuR.setElementMap(localcpa);
    localcuR.setInsets(new Insets(7, 10, 9, 10));
    localJg.bb(localcuR);
    localcuR.brn();
    localcuR.rV();
    localJg.rV();
    cwP localcwP1 = new cwP();
    localcwP1.aJ();
    localcwP1.setElementMap(localcpa);
    localcwP1.setSize(new Or(100.0F, -2));
    localcwP1.setAlign(ajb.dhZ);
    localdRq1.bb(localcwP1);
    localcwP1.brn();
    localcwP1.rV();
    aId localaId = aId.checkOut();
    localaId.setHorizontal(false);
    localdRq1.bb(localaId);
    localaId.brn();
    localaId.rV();
    String str2 = "closeButton";
    biy localbiy = new biy();
    localbiy.aJ();
    localbiy.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localbiy);
    localbiy.setStyle("close");
    localbiy.setExpandable(false);
    csA localcsA = new csA();
    localcsA.hg("wakfu.fresco:closeDialog");
    localbiy.setOnClick(localcsA);
    localdRq1.bb(localbiy);
    localbiy.brn();
    dpm localdpm = new dpm();
    localdpm.aJ();
    localdpm.setElementMap(localcpa);
    localdpm.setAlign(aFG.ecl);
    localbiy.bb(localdpm);
    localdpm.brn();
    localdpm.rV();
    localbiy.rV();
    dRq localdRq3 = dRq.checkOut();
    localdRq3.setElementMap(localcpa);
    localdRq1.bb(localdRq3);
    localdRq3.brn();
    czO localczO = new czO();
    localczO.aJ();
    localczO.setAdaptToContentSize(true);
    localdRq3.bb(localczO);
    localczO.brn();
    localczO.rV();
    String str3 = "multipleImage";
    bhd localbhd = new bhd();
    localbhd.aJ();
    localbhd.setElementMap(localcpa);
    if ((localcpa != null) && (str3 != null))
      localcpa.a(str3, localbhd);
    localbhd.setManualInnerMove(true);
    localbhd.setShrinkToImageHeight(true);
    localdRq3.bb(localbhd);
    localbhd.brn();
    cwP localcwP2 = new cwP();
    localcwP2.aJ();
    localcwP2.setElementMap(localcpa);
    localcwP2.setSize(new Or(100.0F, 100.0F));
    localbhd.bb(localcwP2);
    localcwP2.brn();
    localcwP2.rV();
    String str4 = "internalPopup";
    dRq localdRq4 = dRq.checkOut();
    localdRq4.setElementMap(localcpa);
    if ((localcpa != null) && (str4 != null))
      localcpa.a(str4, localdRq4);
    localdRq4.setStyle("popup");
    localbhd.bb(localdRq4);
    localdRq4.brn();
    String str5 = "internalPopupTextView";
    cWk localcWk = new cWk();
    localcWk.aJ();
    localcWk.setElementMap(localcpa);
    if ((localcpa != null) && (str5 != null))
      localcpa.a(str5, localcWk);
    localcWk.setStyle("white");
    localcWk.setMinWidth(250);
    localdRq4.bb(localcWk);
    localcWk.brn();
    localcWk.rV();
    localdRq4.rV();
    localbhd.rV();
    String str6 = "leftArrowContainer";
    dRq localdRq5 = dRq.checkOut();
    localdRq5.setElementMap(localcpa);
    if ((localcpa != null) && (str6 != null))
      localcpa.a(str6, localdRq5);
    localdRq5.setStyle("leftArrowParticle");
    localdRq3.bb(localdRq5);
    localdRq5.brn();
    cwP localcwP3 = new cwP();
    localcwP3.aJ();
    localcwP3.setElementMap(localcpa);
    localcwP3.setSize(new Or(50, 50));
    localcwP3.setAlign(ajb.dhY);
    localdRq5.bb(localcwP3);
    localcwP3.brn();
    localcwP3.rV();
    localdRq5.rV();
    String str7 = "rightArrowContainer";
    dRq localdRq6 = dRq.checkOut();
    localdRq6.setElementMap(localcpa);
    if ((localcpa != null) && (str7 != null))
      localcpa.a(str7, localdRq6);
    localdRq6.setStyle("rightArrowParticle");
    localdRq3.bb(localdRq6);
    localdRq6.brn();
    cwP localcwP4 = new cwP();
    localcwP4.aJ();
    localcwP4.setElementMap(localcpa);
    localcwP4.setSize(new Or(50, 50));
    localcwP4.setAlign(ajb.dia);
    localdRq6.bb(localcwP4);
    localcwP4.brn();
    localcwP4.rV();
    localdRq6.rV();
    localdRq3.rV();
    localdRq1.rV();
    return localdRq1;
  }
}