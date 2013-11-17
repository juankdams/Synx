import java.awt.Insets;
import java.util.Stack;

public class cWW
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
    dRq localdRq2 = localdRq1;
    Jg localJg1 = localdRq2.getAppearance();
    localJg1.setElementMap(localcpa);
    localdRq1.bb(localJg1);
    localJg1.brn();
    ams localams = new ams();
    localams.aJ();
    localams.setElementMap(localcpa);
    localams.setInsets(new Insets(1, 1, 1, 1));
    localams.setColor(new bNa(0.0F, 0.0F, 0.0F, 1.0F));
    localJg1.bb(localams);
    localams.brn();
    localams.rV();
    localJg1.rV();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setElementMap(localcpa);
    localcwP.setAlign(ajb.dhZ);
    localcwP.setSize(new Or(-2, -2));
    localdRq1.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    String str = "graph";
    abM localabM1 = new abM();
    localabM1.aJ();
    localabM1.setElementMap(localcpa);
    if ((localcpa != null) && (str != null))
      localcpa.a(str, localabM1);
    localabM1.setExpandable(false);
    localabM1.setCellSize(new Or(75, 250));
    localdRq1.bb(localabM1);
    localabM1.brn();
    abM localabM2 = localabM1;
    Jg localJg2 = localabM2.getAppearance();
    localJg2.setElementMap(localcpa);
    localabM1.bb(localJg2);
    localJg2.brn();
    jO localjO = new jO();
    localjO.aJ();
    localjO.setElementMap(localcpa);
    localjO.setColor(new bNa(1.0F, 1.0F, 1.0F, 1.0F));
    localJg2.bb(localjO);
    localjO.brn();
    localjO.rV();
    localJg2.rV();
    localabM1.rV();
    localdRq1.rV();
    return localdRq1;
  }
}