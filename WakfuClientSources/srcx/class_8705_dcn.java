import java.util.Stack;

public class dcn
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
    localdRq1.brn();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setElementMap(localcpa);
    localcwP.setSize(new Or(500, -2));
    localcwP.setAlign(ajb.dhZ);
    localdRq1.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    dRq localdRq2 = localdRq1;
    Jg localJg1 = localdRq2.getAppearance();
    localJg1.setElementMap(localcpa);
    localdRq1.bb(localJg1);
    localJg1.brn();
    jO localjO = new jO();
    localjO.aJ();
    localjO.setElementMap(localcpa);
    localjO.setColor(new bNa(1.0F, 1.0F, 1.0F, 1.0F));
    localJg1.bb(localjO);
    localjO.brn();
    localjO.rV();
    localJg1.rV();
    cXs localcXs = new cXs();
    localcXs.aJ();
    localcXs.setColumns(3);
    localcXs.setRows(2);
    localdRq1.bb(localcXs);
    localcXs.brn();
    localcXs.rV();
    caF localcaF1 = new caF();
    localcaF1.aJ();
    localcaF1.setElementMap(localcpa);
    localcaF1.setText("text court");
    localcaF1.setExpandable(false);
    localdRq1.bb(localcaF1);
    localcaF1.brn();
    bHe localbHe1 = new bHe();
    localbHe1.aJ();
    localbHe1.setElementMap(localcpa);
    localbHe1.setRow(0);
    localbHe1.setColumn(0);
    localbHe1.setHorizontalAlign(aFG.ecj);
    localcaF1.bb(localbHe1);
    localbHe1.brn();
    localbHe1.rV();
    localcaF1.rV();
    caF localcaF2 = new caF();
    localcaF2.aJ();
    localcaF2.setElementMap(localcpa);
    localcaF2.setPrefSize(new Or(50, 0));
    localcaF2.setText("1");
    localdRq1.bb(localcaF2);
    localcaF2.brn();
    caF localcaF3 = localcaF2;
    Jg localJg2 = localcaF3.getAppearance();
    localJg2.setElementMap(localcpa);
    ((cwJ)localJg2).setAlign(aFG.ecl);
    localcaF2.bb(localJg2);
    localJg2.brn();
    localJg2.rV();
    bHe localbHe2 = new bHe();
    localbHe2.aJ();
    localbHe2.setElementMap(localcpa);
    localbHe2.setRow(0);
    localbHe2.setColumn(1);
    localbHe2.setHorizontalAlign(aFG.ecl);
    localcaF2.bb(localbHe2);
    localbHe2.brn();
    localbHe2.rV();
    localcaF2.rV();
    caF localcaF4 = new caF();
    localcaF4.aJ();
    localcaF4.setElementMap(localcpa);
    localcaF4.setText("Longue Description de ouf ! Et même plus !");
    localdRq1.bb(localcaF4);
    localcaF4.brn();
    bHe localbHe3 = new bHe();
    localbHe3.aJ();
    localbHe3.setElementMap(localcpa);
    localbHe3.setRow(0);
    localbHe3.setColumn(2);
    localcaF4.bb(localbHe3);
    localbHe3.brn();
    localbHe3.rV();
    localcaF4.rV();
    caF localcaF5 = new caF();
    localcaF5.aJ();
    localcaF5.setElementMap(localcpa);
    localcaF5.setText("Beaucoup plus long !");
    localcaF5.setExpandable(false);
    localdRq1.bb(localcaF5);
    localcaF5.brn();
    bHe localbHe4 = new bHe();
    localbHe4.aJ();
    localbHe4.setElementMap(localcpa);
    localbHe4.setRow(1);
    localbHe4.setColumn(0);
    localbHe4.setVerticalAlign(aFG.eck);
    localcaF5.bb(localbHe4);
    localbHe4.brn();
    localbHe4.rV();
    localcaF5.rV();
    caF localcaF6 = new caF();
    localcaF6.aJ();
    localcaF6.setElementMap(localcpa);
    localcaF6.setText("2");
    localdRq1.bb(localcaF6);
    localcaF6.brn();
    bHe localbHe5 = new bHe();
    localbHe5.aJ();
    localbHe5.setElementMap(localcpa);
    localbHe5.setRow(1);
    localbHe5.setColumn(1);
    localbHe5.setHorizontalAlign(aFG.ecl);
    localcaF6.bb(localbHe5);
    localbHe5.brn();
    localbHe5.rV();
    localcaF6.rV();
    caF localcaF7 = new caF();
    localcaF7.aJ();
    localcaF7.setElementMap(localcpa);
    localcaF7.setText("Description courte");
    localdRq1.bb(localcaF7);
    localcaF7.brn();
    bHe localbHe6 = new bHe();
    localbHe6.aJ();
    localbHe6.setElementMap(localcpa);
    localbHe6.setRow(1);
    localbHe6.setColumn(2);
    localcaF7.bb(localbHe6);
    localbHe6.brn();
    localbHe6.rV();
    localcaF7.rV();
    localdRq1.rV();
    return localdRq1;
  }
}