import java.awt.Insets;
import java.util.Stack;

public class byS
  implements cEa
{
  private Stack X = new Stack();
  private cDA Y;

  public bdj a(cDA paramcDA, cpa paramcpa)
  {
    this.Y = paramcDA;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    String str1 = "test";
    dcY localdcY = new dcY();
    localdcY.aJ();
    localdcY.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localdcY);
    localdcY.setPack(true);
    localdcY.brn();
    cwP localcwP1 = new cwP();
    localcwP1.aJ();
    localcwP1.setElementMap(localcpa);
    localcwP1.setSize(new Or(-2, -2));
    localdcY.bb(localcwP1);
    localcwP1.brn();
    localcwP1.rV();
    czO localczO = new czO();
    localczO.aJ();
    localczO.setAdaptToContentSize(true);
    localdcY.bb(localczO);
    localczO.brn();
    localczO.rV();
    String str2 = "coloredContainer";
    dRq localdRq1 = dRq.checkOut();
    localdRq1.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localdRq1);
    localdRq1.setStyle("ChatBubbleBackground");
    localdRq1.setVisible(false);
    localdRq1.setPrefSize(new Or(0, 80));
    localdcY.bb(localdRq1);
    localdRq1.brn();
    cwP localcwP2 = new cwP();
    localcwP2.aJ();
    localcwP2.setElementMap(localcpa);
    localcwP2.setSize(new Or(100.0F, 100.0F));
    localdRq1.bb(localcwP2);
    localcwP2.brn();
    localcwP2.rV();
    dRq localdRq2 = localdRq1;
    Jg localJg1 = localdRq2.getAppearance();
    localJg1.setElementMap(localcpa);
    localdRq1.bb(localJg1);
    localJg1.brn();
    bmv localbmv1 = bmv.checkOut();
    localbmv1.setElementMap(localcpa);
    localbmv1.setInsets(new Insets(5, 10, 10, 10));
    localJg1.bb(localbmv1);
    localbmv1.brn();
    localbmv1.rV();
    cuR localcuR1 = new cuR();
    localcuR1.aJ();
    localcuR1.setElementMap(localcpa);
    localcuR1.setInsets(new Insets(5, 5, 5, 5));
    localJg1.bb(localcuR1);
    localcuR1.brn();
    localcuR1.rV();
    localJg1.rV();
    localdRq1.rV();
    String str3 = "container";
    dRq localdRq3 = dRq.checkOut();
    localdRq3.setElementMap(localcpa);
    if ((localcpa != null) && (str3 != null))
      localcpa.a(str3, localdRq3);
    localdRq3.setStyle("chatBubble");
    localdcY.bb(localdRq3);
    localdRq3.brn();
    cwP localcwP3 = new cwP();
    localcwP3.aJ();
    localcwP3.setElementMap(localcpa);
    localcwP3.setAlign(ajb.did);
    localdRq3.bb(localcwP3);
    localcwP3.brn();
    localcwP3.rV();
    dRq localdRq4 = localdRq3;
    Jg localJg2 = localdRq4.getAppearance();
    localJg2.setElementMap(localcpa);
    localdRq3.bb(localJg2);
    localJg2.brn();
    bmv localbmv2 = bmv.checkOut();
    localbmv2.setElementMap(localcpa);
    localbmv2.setInsets(new Insets(10, 15, 15, 15));
    localJg2.bb(localbmv2);
    localbmv2.brn();
    localbmv2.rV();
    cuR localcuR2 = new cuR();
    localcuR2.aJ();
    localcuR2.setElementMap(localcpa);
    localcuR2.setInsets(new Insets(10, 15, 10, 15));
    localJg2.bb(localcuR2);
    localcuR2.brn();
    localcuR2.rV();
    localJg2.rV();
    String str4 = "text";
    cWk localcWk = new cWk();
    localcWk.aJ();
    localcWk.setElementMap(localcpa);
    if ((localcpa != null) && (str4 != null))
      localcpa.a(str4, localcWk);
    localcWk.setMinWidth(10);
    localcWk.setMaxWidth(250);
    localcWk.setStyle("dark16");
    localcWk.setNonBlocking(true);
    localdRq3.bb(localcWk);
    localcWk.brn();
    dpm localdpm = new dpm();
    localdpm.aJ();
    localdpm.setElementMap(localcpa);
    localdpm.setAlign(aFG.eck);
    localcWk.bb(localdpm);
    localdpm.brn();
    localdpm.rV();
    localcWk.rV();
    localdRq3.rV();
    String str5 = "image";
    czv localczv = new czv();
    localczv.aJ();
    localczv.setElementMap(localcpa);
    if ((localcpa != null) && (str5 != null))
      localcpa.a(str5, localczv);
    localczv.setStyle("BubbleArrowLeft");
    localczv.setNonBlocking(true);
    localdcY.bb(localczv);
    localczv.brn();
    cwP localcwP4 = new cwP();
    localcwP4.aJ();
    localcwP4.setElementMap(localcpa);
    localcwP4.setAlign(ajb.did);
    localcwP4.setSize(new Or(-2, -2));
    localczv.bb(localcwP4);
    localcwP4.brn();
    localcwP4.rV();
    localczv.rV();
    localdcY.rV();
    return localdcY;
  }
}