import java.util.Stack;

public class aLO
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
    localdRq.setStyle("popup");
    localdRq.brn();
    cba localcba = cba.checkOut();
    localcba.setElementMap(localcpa);
    localcba.setData(cFu.izR);
    localdRq.bb(localcba);
    localcba.brn();
    localcba.rV();
    aId localaId = aId.checkOut();
    localaId.setHorizontal(false);
    localdRq.bb(localaId);
    localaId.brn();
    localaId.rV();
    caF localcaF1 = new caF();
    localcaF1.aJ();
    localcaF1.setElementMap(localcpa);
    localcaF1.setStyle("whiteSubTitle");
    localdRq.bb(localcaF1);
    localcaF1.brn();
    caF localcaF2 = localcaF1;
    Jg localJg = localcaF2.getAppearance();
    localJg.setElementMap(localcpa);
    ((cwJ)localJg).setAlign(aFG.ecg);
    localcaF1.bb(localJg);
    localJg.brn();
    localJg.rV();
    NK localNK = NK.checkOut();
    localNK.setElementMap(localcpa);
    localNK.setName("itemPopupDetail");
    localNK.setAttribute("text");
    localNK.setField("name");
    localcaF1.bb(localNK);
    localNK.brn();
    localNK.rV();
    localcaF1.rV();
    localdRq.rV();
    return localdRq;
  }
}