import java.awt.Insets;
import java.util.Stack;

public class dGT
  implements cEa
{
  private Stack X = new Stack();
  private cDA Y;

  public bdj a(cDA paramcDA, cpa paramcpa)
  {
    this.Y = paramcDA;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    aQr localaQr = new aQr();
    localaQr.aJ();
    localaQr.setElementMap(localcpa);
    localaQr.setPack(true);
    csA localcsA = new csA();
    localcsA.hg("wakfu.petDialog:validOrSetNextMessage");
    localaQr.setOnClick(localcsA);
    localaQr.brn();
    cwP localcwP1 = new cwP();
    localcwP1.aJ();
    localcwP1.setElementMap(localcpa);
    localcwP1.setSize(new Or(-2, -2));
    localaQr.bb(localcwP1);
    localcwP1.brn();
    localcwP1.rV();
    czO localczO = new czO();
    localczO.aJ();
    localczO.setAdaptToContentSize(true);
    localaQr.bb(localczO);
    localczO.brn();
    localczO.rV();
    String str1 = "container";
    dRq localdRq1 = dRq.checkOut();
    localdRq1.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localdRq1);
    localdRq1.setStyle("petBubble");
    localaQr.bb(localdRq1);
    localdRq1.brn();
    cwP localcwP2 = new cwP();
    localcwP2.aJ();
    localcwP2.setElementMap(localcpa);
    localcwP2.setSize(new Or(100.0F, 100.0F));
    localdRq1.bb(localcwP2);
    localcwP2.brn();
    localcwP2.rV();
    dRq localdRq2 = localdRq1;
    Jg localJg = localdRq2.getAppearance();
    localJg.setElementMap(localcpa);
    localdRq1.bb(localJg);
    localJg.brn();
    bmv localbmv = bmv.checkOut();
    localbmv.setElementMap(localcpa);
    localbmv.setInsets(new Insets(23, 0, 20, 0));
    localJg.bb(localbmv);
    localbmv.brn();
    localbmv.rV();
    localJg.rV();
    String str2 = "text";
    cWk localcWk = new cWk();
    localcWk.aJ();
    localcWk.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localcWk);
    localcWk.setMinWidth(10);
    localcWk.setMaxWidth(250);
    localcWk.setStyle("DefaultBold14");
    localdRq1.bb(localcWk);
    localcWk.brn();
    localcWk.rV();
    localdRq1.rV();
    String str3 = "image";
    czv localczv = new czv();
    localczv.aJ();
    localczv.setElementMap(localcpa);
    if ((localcpa != null) && (str3 != null))
      localcpa.a(str3, localczv);
    localczv.setStyle("petBubble");
    localaQr.bb(localczv);
    localczv.brn();
    cwP localcwP3 = new cwP();
    localcwP3.aJ();
    localcwP3.setElementMap(localcpa);
    localcwP3.setAlign(ajb.dhR);
    localcwP3.setSize(new Or(-2, -2));
    localcwP3.setXOffset(20);
    localczv.bb(localcwP3);
    localcwP3.brn();
    localcwP3.rV();
    localczv.rV();
    localaQr.rV();
    return localaQr;
  }
}