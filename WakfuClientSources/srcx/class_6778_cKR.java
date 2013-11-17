import java.awt.Insets;
import java.util.Stack;

public class cKR
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
    cwP localcwP1 = new cwP();
    localcwP1.aJ();
    localcwP1.setElementMap(localcpa);
    localcwP1.setAlign(ajb.dhZ);
    localdRq.bb(localcwP1);
    localcwP1.brn();
    localcwP1.rV();
    czO localczO = new czO();
    localczO.aJ();
    localczO.setAdaptToContentSize(true);
    localdRq.bb(localczO);
    localczO.brn();
    localczO.rV();
    String str = "closeButton";
    biy localbiy1 = new biy();
    localbiy1.aJ();
    localbiy1.setElementMap(localcpa);
    if ((localcpa != null) && (str != null))
      localcpa.a(str, localbiy1);
    localbiy1.setStyle("backgroundDisplayClose");
    csA localcsA = new csA();
    localcsA.hg("unloadDialog");
    localbiy1.setOnClick(localcsA);
    localdRq.bb(localbiy1);
    localbiy1.brn();
    cwP localcwP2 = new cwP();
    localcwP2.aJ();
    localcwP2.setElementMap(localcpa);
    localcwP2.setAlign(ajb.dhV);
    localbiy1.bb(localcwP2);
    localcwP2.brn();
    localcwP2.rV();
    biy localbiy2 = localbiy1;
    Jg localJg = localbiy2.getAppearance();
    localJg.setElementMap(localcpa);
    localbiy1.bb(localJg);
    localJg.brn();
    bmv localbmv = bmv.checkOut();
    localbmv.setElementMap(localcpa);
    localbmv.setInsets(new Insets(10, 0, 0, 20));
    localJg.bb(localbmv);
    localbmv.brn();
    localbmv.rV();
    localJg.rV();
    localbiy1.rV();
    localdRq.rV();
    return localdRq;
  }
}