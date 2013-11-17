import java.util.Stack;

public class Ms
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
    localdRq1.setStyle("popup");
    localdRq1.brn();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setElementMap(localcpa);
    localcwP.setAlign(ajb.dhZ);
    localcwP.setSize(new Or(-2, -2));
    localdRq1.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    aId localaId = aId.checkOut();
    localaId.setHorizontal(false);
    localdRq1.bb(localaId);
    localaId.brn();
    localaId.rV();
    caF localcaF = new caF();
    localcaF.aJ();
    localcaF.setElementMap(localcpa);
    localcaF.setStyle("whiteTitle");
    String str1 = "%group.party.invite.action%";
    str1 = str1.replace("%group.party.invite.action%", cBQ.cxL().mL("group.party.invite.action"));
    localcaF.setText(str1);
    localdRq1.bb(localcaF);
    localcaF.brn();
    localcaF.rV();
    String str2 = "name";
    aTp localaTp = new aTp();
    localaTp.aJ();
    localaTp.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localaTp);
    localdRq1.bb(localaTp);
    localaTp.brn();
    localaTp.rV();
    dRq localdRq2 = dRq.checkOut();
    localdRq2.setElementMap(localcpa);
    localdRq1.bb(localdRq2);
    localdRq2.brn();
    biy localbiy1 = new biy();
    localbiy1.aJ();
    localbiy1.setElementMap(localcpa);
    String str3 = "%ok%";
    str3 = str3.replace("%ok%", cBQ.cxL().mL("ok"));
    localbiy1.setText(str3);
    csA localcsA1 = new csA();
    localcsA1.hg("wakfu.partyList:invite(name)");
    localbiy1.setOnClick(localcsA1);
    localdRq2.bb(localbiy1);
    localbiy1.brn();
    localbiy1.rV();
    biy localbiy2 = new biy();
    localbiy2.aJ();
    localbiy2.setElementMap(localcpa);
    String str4 = "%cancel%";
    str4 = str4.replace("%cancel%", cBQ.cxL().mL("cancel"));
    localbiy2.setText(str4);
    csA localcsA2 = new csA();
    localcsA2.hg("unloadDialog");
    localbiy2.setOnClick(localcsA2);
    localdRq2.bb(localbiy2);
    localbiy2.brn();
    localbiy2.rV();
    localdRq2.rV();
    localdRq1.rV();
    return localdRq1;
  }
}