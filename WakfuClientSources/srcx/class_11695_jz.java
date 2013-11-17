import java.util.Stack;

public class jz
  implements cEa
{
  private Stack X = new Stack();
  private cDA Y;

  public bdj a(cDA paramcDA, cpa paramcpa)
  {
    this.Y = paramcDA;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    biy localbiy = new biy();
    localbiy.aJ();
    localbiy.setElementMap(localcpa);
    localbiy.setStyle("bug");
    csA localcsA = new csA();
    localcsA.hg("wakfu:openReportBugDialog");
    localbiy.setOnClick(localcsA);
    cCu localcCu = new cCu();
    localcCu.hg("popup(descBugReportPopup)");
    localbiy.setOnPopupDisplay(localcCu);
    jL localjL = new jL();
    localjL.hg("closePopup");
    localbiy.setOnPopupHide(localjL);
    localbiy.setExpandable(false);
    localbiy.brn();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setElementMap(localcpa);
    localcwP.setAlign(ajb.dhR);
    localcwP.setSize(new Or(-2, -2));
    localbiy.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    NK localNK = NK.checkOut();
    localNK.setElementMap(localcpa);
    localNK.setName("reportBug");
    localNK.setAttribute("visible");
    localbiy.bb(localNK);
    localNK.brn();
    localNK.rV();
    String str1 = "descBugReportPopup";
    anG localanG = new anG();
    localanG.aJ();
    localanG.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localanG);
    localanG.setAlign(aFG.ecg);
    localanG.setHotSpotPosition(aFG.eci);
    localbiy.bb(localanG);
    localanG.brn();
    dRq localdRq = dRq.checkOut();
    localdRq.setElementMap(localcpa);
    localdRq.setPrefSize(new Or(10, 0));
    localdRq.setStyle("popup");
    localanG.bb(localdRq);
    localdRq.brn();
    cba localcba = cba.checkOut();
    localcba.setElementMap(localcpa);
    localcba.setData(cFu.izR);
    localdRq.bb(localcba);
    localcba.brn();
    localcba.rV();
    caF localcaF1 = new caF();
    localcaF1.aJ();
    localcaF1.setElementMap(localcpa);
    localcaF1.setStyle("PopupInformation");
    String str2 = "%desc.bugReport%";
    str2 = str2.replace("%desc.bugReport%", cBQ.cxL().mL("desc.bugReport"));
    localcaF1.setText(str2);
    localdRq.bb(localcaF1);
    localcaF1.brn();
    caF localcaF2 = localcaF1;
    Jg localJg = localcaF2.getAppearance();
    localJg.setElementMap(localcpa);
    ((cwJ)localJg).setAlignment(aFG.ecj);
    localcaF1.bb(localJg);
    localJg.brn();
    localJg.rV();
    localcaF1.rV();
    localdRq.rV();
    localanG.rV();
    localbiy.rV();
    return localbiy;
  }
}