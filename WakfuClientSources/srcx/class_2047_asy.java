import java.awt.Insets;
import java.util.Stack;

public class asy
  implements cEa
{
  private Stack X = new Stack();
  private cDA Y;

  public bdj a(cDA paramcDA, cpa paramcpa)
  {
    this.Y = paramcDA;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    dRq localdRq1 = dRq.checkOut();
    localdRq1.setElementMap(localcpa);
    localdRq1.setPrefSize(new Or(230, 0));
    localdRq1.setStyle("popup");
    localdRq1.brn();
    cba localcba = cba.checkOut();
    localcba.setElementMap(localcpa);
    localcba.setData(cFu.izR);
    localdRq1.bb(localcba);
    localcba.brn();
    localcba.rV();
    aId localaId = aId.checkOut();
    localaId.setHorizontal(false);
    localaId.setAlign(aFG.ech);
    localdRq1.bb(localaId);
    localaId.brn();
    localaId.rV();
    caF localcaF1 = new caF();
    localcaF1.aJ();
    localcaF1.setElementMap(localcpa);
    localcaF1.setStyle("whiteBold");
    String str = "%bonusPenalties.total%";
    str = str.replace("%bonusPenalties.total%", cBQ.cxL().mL("bonusPenalties.total"));
    localcaF1.setText(str);
    localdRq1.bb(localcaF1);
    localcaF1.brn();
    caF localcaF2 = localcaF1;
    Jg localJg1 = localcaF2.getAppearance();
    localJg1.setElementMap(localcpa);
    ((cwJ)localJg1).setAlignment(aFG.eck);
    localcaF1.bb(localJg1);
    localJg1.brn();
    localJg1.rV();
    localcaF1.rV();
    dRq localdRq2 = dRq.checkOut();
    localdRq2.setElementMap(localcpa);
    localdRq2.setStyle("lineSeparator2");
    localdRq2.setPrefSize(new Or(0, 1));
    localdRq1.bb(localdRq2);
    localdRq2.brn();
    dRq localdRq3 = localdRq2;
    Jg localJg2 = localdRq3.getAppearance();
    localJg2.setElementMap(localcpa);
    localdRq2.bb(localJg2);
    localJg2.brn();
    bmv localbmv1 = bmv.checkOut();
    localbmv1.setElementMap(localcpa);
    localbmv1.setInsets(new Insets(5, 0, 0, 0));
    localJg2.bb(localbmv1);
    localbmv1.brn();
    localbmv1.rV();
    localJg2.rV();
    localdRq2.rV();
    cWk localcWk1 = new cWk();
    localcWk1.aJ();
    localcWk1.setElementMap(localcpa);
    localcWk1.setStyle("white");
    localcWk1.setMinWidth(180);
    localdRq1.bb(localcWk1);
    localcWk1.brn();
    cWk localcWk2 = localcWk1;
    Jg localJg3 = localcWk2.getAppearance();
    localJg3.setElementMap(localcpa);
    ((cwJ)localJg3).setAlign(aFG.ecj);
    localcWk1.bb(localJg3);
    localJg3.brn();
    bmv localbmv2 = bmv.checkOut();
    localbmv2.setElementMap(localcpa);
    localbmv2.setInsets(new Insets(10, 0, 0, 0));
    localJg3.bb(localbmv2);
    localbmv2.brn();
    localbmv2.rV();
    localJg3.rV();
    localcWk1.rV();
    localdRq1.rV();
    return localdRq1;
  }
}