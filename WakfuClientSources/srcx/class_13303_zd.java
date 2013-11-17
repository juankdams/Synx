import java.util.Stack;

public class zd
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
    localcwP1.setSize(new Or(-2, -2));
    localcwP1.setAlign(ajb.dhV);
    localcwP1.setXOffset(-30);
    localcwP1.setYOffset(-90);
    localdRq.bb(localcwP1);
    localcwP1.brn();
    localcwP1.rV();
    czO localczO = new czO();
    localczO.aJ();
    localczO.setAdaptToContentSize(true);
    localdRq.bb(localczO);
    localczO.brn();
    localczO.rV();
    czv localczv = new czv();
    localczv.aJ();
    localczv.setElementMap(localcpa);
    localczv.setStyle("controlCenterTimer");
    localczv.setNonBlocking(true);
    localdRq.bb(localczv);
    localczv.brn();
    cwP localcwP2 = new cwP();
    localcwP2.aJ();
    localcwP2.setElementMap(localcpa);
    localcwP2.setSize(new Or(100.0F, 100.0F));
    localczv.bb(localcwP2);
    localcwP2.brn();
    localcwP2.rV();
    localczv.rV();
    caF localcaF1 = new caF();
    localcaF1.aJ();
    localcaF1.setElementMap(localcpa);
    localcaF1.setNonBlocking(true);
    localcaF1.setPrefSize(new Or(20, 0));
    localcaF1.setStyle("BigTitle");
    localdRq.bb(localcaF1);
    localcaF1.brn();
    cwP localcwP3 = new cwP();
    localcwP3.aJ();
    localcwP3.setElementMap(localcpa);
    localcwP3.setAlign(ajb.dhZ);
    localcaF1.bb(localcwP3);
    localcwP3.brn();
    localcwP3.rV();
    caF localcaF2 = localcaF1;
    Jg localJg = localcaF2.getAppearance();
    localJg.setElementMap(localcpa);
    ((cwJ)localJg).setAlignment(aFG.eck);
    localcaF1.bb(localJg);
    localJg.brn();
    localJg.rV();
    NK localNK = NK.checkOut();
    localNK.setElementMap(localcpa);
    localNK.setLocal(true);
    localNK.setAttribute("text");
    localNK.setName("countdown");
    localcaF1.bb(localNK);
    localNK.brn();
    localNK.rV();
    localcaF1.rV();
    localdRq.rV();
    return localdRq;
  }
}