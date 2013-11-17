import java.util.Stack;

public class bQx
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
    localdRq1.setNonBlocking(true);
    localdRq1.setStyle("popup");
    localdRq1.brn();
    dRq localdRq2 = localdRq1;
    Jg localJg1 = localdRq2.getAppearance();
    localJg1.setElementMap(localcpa);
    localJg1.setModulationColor(new bNa(1.0F, 1.0F, 1.0F, 0.6F));
    localdRq1.bb(localJg1);
    localJg1.brn();
    localJg1.rV();
    cwP localcwP1 = new cwP();
    localcwP1.aJ();
    localcwP1.setElementMap(localcpa);
    localcwP1.setAlign(ajb.dhV);
    localcwP1.setYOffset(-5);
    localcwP1.setXOffset(-50);
    localdRq1.bb(localcwP1);
    localcwP1.brn();
    localcwP1.rV();
    aId localaId = aId.checkOut();
    localaId.setHorizontal(false);
    localdRq1.bb(localaId);
    localaId.brn();
    localaId.rV();
    caF localcaF1 = new caF();
    localcaF1.aJ();
    localcaF1.setElementMap(localcpa);
    localcaF1.setStyle("popupInformation");
    String str1 = "%timedSession.remaining%";
    str1 = str1.replace("%timedSession.remaining%", cBQ.cxL().mL("timedSession.remaining"));
    localcaF1.setText(str1);
    localdRq1.bb(localcaF1);
    localcaF1.brn();
    localcaF1.rV();
    String str2 = "text";
    caF localcaF2 = new caF();
    localcaF2.aJ();
    localcaF2.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localcaF2);
    localcaF2.setNonBlocking(true);
    localcaF2.setStyle("whitebold");
    localdRq1.bb(localcaF2);
    localcaF2.brn();
    cwP localcwP2 = new cwP();
    localcwP2.aJ();
    localcwP2.setElementMap(localcpa);
    localcwP2.setAlign(ajb.dhZ);
    localcaF2.bb(localcwP2);
    localcwP2.brn();
    localcwP2.rV();
    caF localcaF3 = localcaF2;
    Jg localJg2 = localcaF3.getAppearance();
    localJg2.setElementMap(localcpa);
    ((cwJ)localJg2).setAlignment(aFG.eck);
    localcaF2.bb(localJg2);
    localJg2.brn();
    localJg2.rV();
    NK localNK = NK.checkOut();
    localNK.setElementMap(localcpa);
    localNK.setAttribute("text");
    localNK.setName("sessionTimer");
    localNK.setField("remainingTimeField");
    localcaF2.bb(localNK);
    localNK.brn();
    localNK.rV();
    localcaF2.rV();
    localdRq1.rV();
    return localdRq1;
  }
}