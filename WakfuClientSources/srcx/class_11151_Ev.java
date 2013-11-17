import java.awt.Insets;
import java.util.Stack;

public class Ev
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
    localdRq1.setStyle("popup");
    localdRq1.brn();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setElementMap(localcpa);
    localcwP.setAlign(ajb.dhZ);
    localcwP.setYOffset(200);
    localdRq1.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    dRq localdRq2 = localdRq1;
    Jg localJg = localdRq2.getAppearance();
    localJg.setElementMap(localcpa);
    localdRq1.bb(localJg);
    localJg.brn();
    bmv localbmv = bmv.checkOut();
    localbmv.setElementMap(localcpa);
    localbmv.setInsets(new Insets(0, 0, 0, 0));
    localJg.bb(localbmv);
    localbmv.brn();
    localbmv.rV();
    localJg.rV();
    dRq localdRq3 = dRq.checkOut();
    localdRq3.setElementMap(localcpa);
    localdRq3.setExpandable(false);
    localdRq1.bb(localdRq3);
    localdRq3.brn();
    String str2 = "image1";
    czv localczv1 = new czv();
    localczv1.aJ();
    localczv1.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localczv1);
    localczv1.setStyle("leftLeafDecorator");
    localdRq3.bb(localczv1);
    localczv1.brn();
    localczv1.rV();
    String str3 = "container2";
    dRq localdRq4 = dRq.checkOut();
    localdRq4.setElementMap(localcpa);
    if ((localcpa != null) && (str3 != null))
      localcpa.a(str3, localdRq4);
    localdRq4.setStyle("leafDecorator");
    localdRq3.bb(localdRq4);
    localdRq4.brn();
    String str4 = "text";
    caF localcaF = new caF();
    localcaF.aJ();
    localcaF.setElementMap(localcpa);
    if ((localcpa != null) && (str4 != null))
      localcpa.a(str4, localcaF);
    localcaF.setStyle("systemMessage");
    localdRq4.bb(localcaF);
    localcaF.brn();
    localcaF.rV();
    localdRq4.rV();
    String str5 = "image2";
    czv localczv2 = new czv();
    localczv2.aJ();
    localczv2.setElementMap(localcpa);
    if ((localcpa != null) && (str5 != null))
      localcpa.a(str5, localczv2);
    localczv2.setStyle("rightLeafDecorator");
    localdRq3.bb(localczv2);
    localczv2.brn();
    localczv2.rV();
    localdRq3.rV();
    localdRq1.rV();
    return localdRq1;
  }
}