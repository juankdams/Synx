import java.awt.Insets;
import java.util.Stack;

public class apR
  implements cEa
{
  private Stack X = new Stack();
  private cDA Y;

  public bdj a(cDA paramcDA, cpa paramcpa)
  {
    this.Y = paramcDA;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    String str1 = "equipInventWindow";
    bpn localbpn = new bpn();
    localbpn.aJ();
    localbpn.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localbpn);
    localbpn.setPrefSize(new Or(200, 200));
    localbpn.brn();
    cwP localcwP1 = new cwP();
    localcwP1.aJ();
    localcwP1.setElementMap(localcpa);
    localcwP1.setAlign(ajb.dhZ);
    localcwP1.setInitValue(true);
    localbpn.bb(localcwP1);
    localcwP1.brn();
    localcwP1.rV();
    cwP localcwP2 = new cwP();
    localcwP2.aJ();
    localcwP2.setElementMap(localcpa);
    localcwP2.setSize(new Or(824, 500));
    localcwP2.setAlign(ajb.dhR);
    localcwP2.setXOffset(100);
    localcwP2.setYOffset(-100);
    localcwP2.setInitValue(true);
    localbpn.bb(localcwP2);
    localcwP2.brn();
    localcwP2.rV();
    dRq localdRq1 = dRq.checkOut();
    localdRq1.setElementMap(localcpa);
    localdRq1.setExpandable(false);
    localdRq1.setStyle("itemInventoryBarBackground");
    localdRq1.setPrefSize(new Or(18, 100));
    localdRq1.setNonBlocking(false);
    localbpn.bb(localdRq1);
    localdRq1.brn();
    bTm localbTm1 = new bTm();
    localbTm1.aJ();
    localdRq1.bb(localbTm1);
    localbTm1.brn();
    dqa localdqa = new dqa();
    localdqa.aJ();
    localdqa.setElementMap(localcpa);
    localbTm1.bb(localdqa);
    localdqa.brn();
    cba localcba1 = cba.checkOut();
    localcba1.setElementMap(localcpa);
    localcba1.setData(cFu.izR);
    localdqa.bb(localcba1);
    localcba1.brn();
    localcba1.rV();
    bTm localbTm2 = new bTm();
    localbTm2.aJ();
    localdqa.bb(localbTm2);
    localbTm2.brn();
    aId localaId1 = aId.checkOut();
    localaId1.setHorizontal(false);
    localbTm2.bb(localaId1);
    localaId1.brn();
    caF localcaF1 = new caF();
    localcaF1.aJ();
    localcaF1.setElementMap(localcpa);
    localcaF1.setText("Admin Monitor");
    localcaF1.setOrientation(Pw.chV);
    localcaF1.setNonBlocking(true);
    localcaF1.setStyle("bold");
    localaId1.bb(localcaF1);
    localcaF1.brn();
    cba localcba2 = cba.checkOut();
    localcba2.setElementMap(localcpa);
    localcba2.setData(cFu.izR);
    localcaF1.bb(localcba2);
    localcba2.brn();
    localcba2.rV();
    localcaF1.rV();
    localaId1.rV();
    localbTm2.rV();
    localdqa.rV();
    localbTm1.rV();
    localdRq1.rV();
    dRq localdRq2 = dRq.checkOut();
    localdRq2.setElementMap(localcpa);
    localdRq2.setStyle("brownInventoryBackground");
    localdRq2.setNonBlocking(false);
    localbpn.bb(localdRq2);
    localdRq2.brn();
    aId localaId2 = aId.checkOut();
    localaId2.setHorizontal(false);
    localdRq2.bb(localaId2);
    localaId2.brn();
    localaId2.rV();
    dRq localdRq3 = localdRq2;
    Jg localJg1 = localdRq3.getAppearance();
    localJg1.setElementMap(localcpa);
    localdRq2.bb(localJg1);
    localJg1.brn();
    cuR localcuR = new cuR();
    localcuR.aJ();
    localcuR.setElementMap(localcpa);
    localcuR.setInsets(new Insets(15, 0, 10, 7));
    localJg1.bb(localcuR);
    localcuR.brn();
    localcuR.rV();
    localJg1.rV();
    dRq localdRq4 = dRq.checkOut();
    localdRq4.setElementMap(localcpa);
    localdRq2.bb(localdRq4);
    localdRq4.brn();
    dRq localdRq5 = localdRq4;
    Jg localJg2 = localdRq5.getAppearance();
    localJg2.setElementMap(localcpa);
    localdRq4.bb(localJg2);
    localJg2.brn();
    bmv localbmv1 = bmv.checkOut();
    localbmv1.setElementMap(localcpa);
    localbmv1.setInsets(new Insets(0, 0, 5, 8));
    localJg2.bb(localbmv1);
    localbmv1.brn();
    localbmv1.rV();
    localJg2.rV();
    aId localaId3 = aId.checkOut();
    localaId3.setHorizontal(false);
    localdRq4.bb(localaId3);
    localaId3.brn();
    localaId3.rV();
    dRq localdRq6 = dRq.checkOut();
    localdRq6.setElementMap(localcpa);
    localdRq6.setExpandable(false);
    localdRq4.bb(localdRq6);
    localdRq6.brn();
    czO localczO = new czO();
    localczO.aJ();
    localczO.setAdaptToContentSize(true);
    localdRq6.bb(localczO);
    localczO.brn();
    localczO.rV();
    caF localcaF2 = new caF();
    localcaF2.aJ();
    localcaF2.setElementMap(localcpa);
    localcaF2.setStyle("whiteTitle");
    localcaF2.setText("Statistiques");
    localdRq6.bb(localcaF2);
    localcaF2.brn();
    cwP localcwP3 = new cwP();
    localcwP3.aJ();
    localcwP3.setElementMap(localcpa);
    localcwP3.setAlign(ajb.dhT);
    localcaF2.bb(localcwP3);
    localcwP3.brn();
    localcwP3.rV();
    caF localcaF3 = localcaF2;
    Jg localJg3 = localcaF3.getAppearance();
    localJg3.setElementMap(localcpa);
    ((cwJ)localJg3).setAlignment(aFG.eck);
    localcaF2.bb(localJg3);
    localJg3.brn();
    localJg3.rV();
    localcaF2.rV();
    biy localbiy1 = new biy();
    localbiy1.aJ();
    localbiy1.setElementMap(localcpa);
    localbiy1.setStyle("close");
    csA localcsA1 = new csA();
    localcsA1.hg("unloadDialog");
    localbiy1.setOnClick(localcsA1);
    localdRq6.bb(localbiy1);
    localbiy1.brn();
    cwP localcwP4 = new cwP();
    localcwP4.aJ();
    localcwP4.setElementMap(localcpa);
    localcwP4.setAlign(ajb.dhV);
    localbiy1.bb(localcwP4);
    localcwP4.brn();
    localcwP4.rV();
    localbiy1.rV();
    localdRq6.rV();
    dRq localdRq7 = dRq.checkOut();
    localdRq7.setElementMap(localcpa);
    localdRq7.setExpandable(false);
    localdRq7.setPrefSize(new Or(20, 10));
    localdRq4.bb(localdRq7);
    localdRq7.brn();
    aId localaId4 = aId.checkOut();
    localaId4.setAlign(aFG.ecl);
    localdRq7.bb(localaId4);
    localaId4.brn();
    localaId4.rV();
    br localbr1 = new br();
    localbr1.aJ();
    localbr1.setElementMap(localcpa);
    localbr1.setExpandable(false);
    csA localcsA2 = new csA();
    localcsA2.hg("wakfu.adminMonitor:changeInstancesDisplayStatus()");
    localbr1.setOnClick(localcsA2);
    localdRq7.bb(localbr1);
    localbr1.brn();
    NK localNK1 = NK.checkOut();
    localNK1.setElementMap(localcpa);
    localNK1.setAttribute("selected");
    localNK1.setName("statistics");
    localNK1.setField("isDisplayingInstances");
    localbr1.bb(localNK1);
    localNK1.brn();
    localNK1.rV();
    br localbr2 = localbr1;
    Jg localJg4 = localbr2.getAppearance();
    localJg4.setElementMap(localcpa);
    localbr1.bb(localJg4);
    localJg4.brn();
    bmv localbmv2 = bmv.checkOut();
    localbmv2.setElementMap(localcpa);
    localbmv2.setInsets(new Insets(0, 30, 0, 10));
    localJg4.bb(localbmv2);
    localbmv2.brn();
    localbmv2.rV();
    localJg4.rV();
    localbr1.rV();
    caF localcaF4 = new caF();
    localcaF4.aJ();
    localcaF4.setElementMap(localcpa);
    localcaF4.setStyle("white");
    localcaF4.setNonBlocking(true);
    localcaF4.setText("Afficher les stats d'instances");
    localdRq7.bb(localcaF4);
    localcaF4.brn();
    localcaF4.rV();
    dRq localdRq8 = localdRq7;
    Jg localJg5 = localdRq8.getAppearance();
    localJg5.setElementMap(localcpa);
    localdRq7.bb(localJg5);
    localJg5.brn();
    bmv localbmv3 = bmv.checkOut();
    localbmv3.setElementMap(localcpa);
    localbmv3.setInsets(new Insets(0, 30, 0, 10));
    localJg5.bb(localbmv3);
    localbmv3.brn();
    localbmv3.rV();
    localJg5.rV();
    localdRq7.rV();
    dRq localdRq9 = dRq.checkOut();
    localdRq9.setElementMap(localcpa);
    localdRq9.setExpandable(false);
    localdRq9.setPrefSize(new Or(20, 10));
    localdRq4.bb(localdRq9);
    localdRq9.brn();
    aId localaId5 = aId.checkOut();
    localaId5.setAlign(aFG.ecl);
    localdRq9.bb(localaId5);
    localaId5.brn();
    localaId5.rV();
    br localbr3 = new br();
    localbr3.aJ();
    localbr3.setElementMap(localcpa);
    localbr3.setExpandable(false);
    csA localcsA3 = new csA();
    localcsA3.hg("wakfu.adminMonitor:changeEcozonessDisplayStatus()");
    localbr3.setOnClick(localcsA3);
    localdRq9.bb(localbr3);
    localbr3.brn();
    NK localNK2 = NK.checkOut();
    localNK2.setElementMap(localcpa);
    localNK2.setAttribute("selected");
    localNK2.setName("statistics");
    localNK2.setField("isDisplayingEcozones");
    localbr3.bb(localNK2);
    localNK2.brn();
    localNK2.rV();
    br localbr4 = localbr3;
    Jg localJg6 = localbr4.getAppearance();
    localJg6.setElementMap(localcpa);
    localbr3.bb(localJg6);
    localJg6.brn();
    bmv localbmv4 = bmv.checkOut();
    localbmv4.setElementMap(localcpa);
    localbmv4.setInsets(new Insets(0, 30, 0, 10));
    localJg6.bb(localbmv4);
    localbmv4.brn();
    localbmv4.rV();
    localJg6.rV();
    localbr3.rV();
    caF localcaF5 = new caF();
    localcaF5.aJ();
    localcaF5.setElementMap(localcpa);
    localcaF5.setStyle("white");
    localcaF5.setNonBlocking(true);
    localcaF5.setText("Afficher les stats d'ecozones");
    localdRq9.bb(localcaF5);
    localcaF5.brn();
    localcaF5.rV();
    dRq localdRq10 = localdRq9;
    Jg localJg7 = localdRq10.getAppearance();
    localJg7.setElementMap(localcpa);
    localdRq9.bb(localJg7);
    localJg7.brn();
    bmv localbmv5 = bmv.checkOut();
    localbmv5.setElementMap(localcpa);
    localbmv5.setInsets(new Insets(0, 30, 0, 10));
    localJg7.bb(localbmv5);
    localbmv5.brn();
    localbmv5.rV();
    localJg7.rV();
    localdRq9.rV();
    dRq localdRq11 = dRq.checkOut();
    localdRq11.setElementMap(localcpa);
    localdRq11.setExpandable(false);
    localdRq11.setPrefSize(new Or(20, 10));
    localdRq4.bb(localdRq11);
    localdRq11.brn();
    aId localaId6 = aId.checkOut();
    localaId6.setAlign(aFG.ecl);
    localdRq11.bb(localaId6);
    localaId6.brn();
    localaId6.rV();
    br localbr5 = new br();
    localbr5.aJ();
    localbr5.setElementMap(localcpa);
    localbr5.setExpandable(false);
    csA localcsA4 = new csA();
    localcsA4.hg("wakfu.adminMonitor:changeChallengesDisplayStatus()");
    localbr5.setOnClick(localcsA4);
    localdRq11.bb(localbr5);
    localbr5.brn();
    NK localNK3 = NK.checkOut();
    localNK3.setElementMap(localcpa);
    localNK3.setAttribute("selected");
    localNK3.setName("statistics");
    localNK3.setField("isDisplayingChallenges");
    localbr5.bb(localNK3);
    localNK3.brn();
    localNK3.rV();
    br localbr6 = localbr5;
    Jg localJg8 = localbr6.getAppearance();
    localJg8.setElementMap(localcpa);
    localbr5.bb(localJg8);
    localJg8.brn();
    bmv localbmv6 = bmv.checkOut();
    localbmv6.setElementMap(localcpa);
    localbmv6.setInsets(new Insets(0, 30, 0, 10));
    localJg8.bb(localbmv6);
    localbmv6.brn();
    localbmv6.rV();
    localJg8.rV();
    localbr5.rV();
    caF localcaF6 = new caF();
    localcaF6.aJ();
    localcaF6.setElementMap(localcpa);
    localcaF6.setStyle("white");
    localcaF6.setNonBlocking(true);
    localcaF6.setText("Afficher les stats de challenges");
    localdRq11.bb(localcaF6);
    localcaF6.brn();
    localcaF6.rV();
    dRq localdRq12 = localdRq11;
    Jg localJg9 = localdRq12.getAppearance();
    localJg9.setElementMap(localcpa);
    localdRq11.bb(localJg9);
    localJg9.brn();
    bmv localbmv7 = bmv.checkOut();
    localbmv7.setElementMap(localcpa);
    localbmv7.setInsets(new Insets(0, 30, 10, 10));
    localJg9.bb(localbmv7);
    localbmv7.brn();
    localbmv7.rV();
    localJg9.rV();
    localdRq11.rV();
    dRq localdRq13 = dRq.checkOut();
    localdRq13.setElementMap(localcpa);
    localdRq4.bb(localdRq13);
    localdRq13.brn();
    bTm localbTm3 = new bTm();
    localbTm3.aJ();
    localdRq13.bb(localbTm3);
    localbTm3.brn();
    bbp localbbp = new bbp();
    localbbp.aJ();
    localbbp.setElementMap(localcpa);
    localbbp.setPrefSize(new Or(0, 100));
    localbbp.setVerticalScrollBarPosition(1.0F);
    localbbp.setHorizontalScrollBarBehaviour(dOf.mfK);
    localbbp.setVerticalScrollBarBehaviour(dOf.mfI);
    localbTm3.bb(localbbp);
    localbbp.brn();
    cba localcba3 = cba.checkOut();
    localcba3.setElementMap(localcpa);
    localcba3.setData(cFu.izR);
    localbbp.bb(localcba3);
    localcba3.brn();
    localcba3.rV();
    at localat = new at();
    localat.aJ();
    localat.setElementMap(localcpa);
    localat.setHorizontal(false);
    localat.setInnerExpandable(false);
    localbbp.bb(localat);
    localat.brn();
    aId localaId7 = aId.checkOut();
    localaId7.setHorizontal(false);
    localaId7.setAlign(aFG.ech);
    localat.bb(localaId7);
    localaId7.brn();
    localaId7.rV();
    NK localNK4 = NK.checkOut();
    localNK4.setElementMap(localcpa);
    localNK4.setName("statistics");
    localNK4.setAttribute("content");
    localNK4.setField("categories");
    localat.bb(localNK4);
    localNK4.brn();
    localNK4.rV();
    eR localeR = new eR();
    localeR.aJ();
    localeR.setElementMap(localcpa);
    localat.bb(localeR);
    localeR.brn();
    dRq localdRq14 = dRq.checkOut();
    localdRq14.setElementMap(localcpa);
    localeR.bb(localdRq14);
    localdRq14.brn();
    dRq localdRq15 = localdRq14;
    Jg localJg10 = localdRq15.getAppearance();
    localJg10.setElementMap(localcpa);
    localdRq14.bb(localJg10);
    localJg10.brn();
    bmv localbmv8 = bmv.checkOut();
    localbmv8.setElementMap(localcpa);
    localbmv8.setInsets(new Insets(0, 10, 20, 10));
    localJg10.bb(localbmv8);
    localbmv8.brn();
    localbmv8.rV();
    localJg10.rV();
    aId localaId8 = aId.checkOut();
    localaId8.setHorizontal(false);
    localdRq14.bb(localaId8);
    localaId8.brn();
    localaId8.rV();
    dRq localdRq16 = dRq.checkOut();
    localdRq16.setElementMap(localcpa);
    localdRq14.bb(localdRq16);
    localdRq16.brn();
    String str2 = "showHideButton";
    biy localbiy2 = new biy();
    localbiy2.aJ();
    localbiy2.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localbiy2);
    localbiy2.setExpandable(false);
    localbiy2.setStyle("remove");
    csA localcsA5 = new csA();
    localcsA5.hg("wakfu.adminMonitor:openCloseContainer(categoryView)");
    localbiy2.setOnClick(localcsA5);
    localdRq16.bb(localbiy2);
    localbiy2.brn();
    aaE localaaE1 = new aaE();
    localaaE1.aJ();
    localaaE1.setElementMap(localcpa);
    localaaE1.setAttribute("style");
    localaaE1.setField("isVisible");
    localbiy2.bb(localaaE1);
    localaaE1.brn();
    anQ localanQ = new anQ();
    localanQ.aJ();
    localanQ.setElementMap(localcpa);
    localanQ.setValue("remove");
    localanQ.setElseValue("add");
    localaaE1.bb(localanQ);
    localanQ.brn();
    cOk localcOk = new cOk();
    localcOk.aJ();
    localcOk.setElementMap(localcpa);
    localanQ.bb(localcOk);
    localcOk.brn();
    localcOk.rV();
    localanQ.rV();
    localaaE1.rV();
    localbiy2.rV();
    caF localcaF7 = new caF();
    localcaF7.aJ();
    localcaF7.setElementMap(localcpa);
    localcaF7.setStyle("whiteTitle");
    localdRq16.bb(localcaF7);
    localcaF7.brn();
    caF localcaF8 = localcaF7;
    Jg localJg11 = localcaF8.getAppearance();
    localJg11.setElementMap(localcpa);
    localcaF7.bb(localJg11);
    localJg11.brn();
    bmv localbmv9 = bmv.checkOut();
    localbmv9.setElementMap(localcpa);
    localbmv9.setInsets(new Insets(0, 5, 0, 0));
    localJg11.bb(localbmv9);
    localbmv9.brn();
    localbmv9.rV();
    localJg11.rV();
    aaE localaaE2 = new aaE();
    localaaE2.aJ();
    localaaE2.setElementMap(localcpa);
    localaaE2.setField("name");
    localaaE2.setAttribute("text");
    localcaF7.bb(localaaE2);
    localaaE2.brn();
    localaaE2.rV();
    localcaF7.rV();
    localdRq16.rV();
    a(localdRq14);
    localdRq14.rV();
    localeR.rV();
    localat.rV();
    localbbp.rV();
    localbTm3.rV();
    localdRq13.rV();
    localdRq4.rV();
    b(localdRq2);
    localdRq2.rV();
    localbpn.rV();
    return localbpn;
  }

  public bdj a(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    String str1 = "innerContainer";
    at localat1 = new at();
    localat1.aJ();
    localat1.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localat1);
    localat1.setHorizontal(false);
    localat1.setInnerExpandable(false);
    parambdj.bb(localat1);
    localat1.brn();
    String str2 = "categoryView";
    avo localavo = new avo();
    localavo.aJ();
    localavo.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localavo);
    localat1.bb(localavo);
    localavo.brn();
    aaE localaaE1 = new aaE();
    localaaE1.aJ();
    localaaE1.setElementMap(localcpa);
    localaaE1.setAttribute("value");
    localavo.bb(localaaE1);
    localaaE1.brn();
    localaaE1.rV();
    localavo.rV();
    aaE localaaE2 = new aaE();
    localaaE2.aJ();
    localaaE2.setElementMap(localcpa);
    localaaE2.setAttribute("visible");
    localaaE2.setField("isVisible");
    localat1.bb(localaaE2);
    localaaE2.brn();
    localaaE2.rV();
    at localat2 = localat1;
    Jg localJg1 = localat2.getAppearance();
    localJg1.setElementMap(localcpa);
    localat1.bb(localJg1);
    localJg1.brn();
    bmv localbmv = bmv.checkOut();
    localbmv.setElementMap(localcpa);
    localbmv.setInsets(new Insets(0, 5, 0, 0));
    localJg1.bb(localbmv);
    localbmv.brn();
    localbmv.rV();
    localJg1.rV();
    aId localaId1 = aId.checkOut();
    localaId1.setHorizontal(false);
    localaId1.setAlign(aFG.ech);
    localat1.bb(localaId1);
    localaId1.brn();
    localaId1.rV();
    aaE localaaE3 = new aaE();
    localaaE3.aJ();
    localaaE3.setElementMap(localcpa);
    localaaE3.setAttribute("content");
    localaaE3.setField("elements");
    localat1.bb(localaaE3);
    localaaE3.brn();
    localaaE3.rV();
    eR localeR1 = new eR();
    localeR1.aJ();
    localeR1.setElementMap(localcpa);
    localat1.bb(localeR1);
    localeR1.brn();
    anQ localanQ1 = new anQ();
    localanQ1.aJ();
    localanQ1.setElementMap(localcpa);
    localeR1.bb(localanQ1);
    localanQ1.brn();
    bxx localbxx1 = new bxx();
    localbxx1.aJ();
    localbxx1.setElementMap(localcpa);
    localbxx1.setField("type");
    localanQ1.bb(localbxx1);
    localbxx1.brn();
    bSP localbSP1 = new bSP();
    localbSP1.aJ();
    localbSP1.setElementMap(localcpa);
    localbSP1.setValue("0");
    localbxx1.bb(localbSP1);
    localbSP1.brn();
    localbSP1.rV();
    localbxx1.rV();
    localanQ1.rV();
    dRq localdRq1 = dRq.checkOut();
    localdRq1.setElementMap(localcpa);
    localdRq1.setNonBlocking(false);
    localeR1.bb(localdRq1);
    localdRq1.brn();
    cJN localcJN1 = new cJN();
    localcJN1.aJ();
    localcJN1.setElementMap(localcpa);
    localdRq1.bb(localcJN1);
    localcJN1.brn();
    aaE localaaE4 = new aaE();
    localaaE4.aJ();
    localaaE4.setElementMap(localcpa);
    localaaE4.setAttribute("text");
    localaaE4.setField("tooltipText");
    localcJN1.bb(localaaE4);
    localaaE4.brn();
    localaaE4.rV();
    localcJN1.rV();
    cWk localcWk1 = new cWk();
    localcWk1.aJ();
    localcWk1.setElementMap(localcpa);
    localcWk1.setStyle("whiteBold");
    localcWk1.setNonBlocking(true);
    localdRq1.bb(localcWk1);
    localcWk1.brn();
    aaE localaaE5 = new aaE();
    localaaE5.aJ();
    localaaE5.setElementMap(localcpa);
    localaaE5.setAttribute("text");
    localaaE5.setField("name");
    localcWk1.bb(localaaE5);
    localaaE5.brn();
    localaaE5.rV();
    localcWk1.rV();
    cWk localcWk2 = new cWk();
    localcWk2.aJ();
    localcWk2.setElementMap(localcpa);
    localcWk2.setStyle("white");
    localcWk2.setNonBlocking(true);
    localdRq1.bb(localcWk2);
    localcWk2.brn();
    cWk localcWk3 = localcWk2;
    Jg localJg2 = localcWk3.getAppearance();
    localJg2.setElementMap(localcpa);
    ((cwJ)localJg2).setAlignment(aFG.ecl);
    localcWk2.bb(localJg2);
    localJg2.brn();
    localJg2.rV();
    aaE localaaE6 = new aaE();
    localaaE6.aJ();
    localaaE6.setElementMap(localcpa);
    localaaE6.setAttribute("text");
    localaaE6.setField("value");
    localcWk2.bb(localaaE6);
    localaaE6.brn();
    localaaE6.rV();
    localcWk2.rV();
    localdRq1.rV();
    localeR1.rV();
    eR localeR2 = new eR();
    localeR2.aJ();
    localeR2.setElementMap(localcpa);
    localat1.bb(localeR2);
    localeR2.brn();
    anQ localanQ2 = new anQ();
    localanQ2.aJ();
    localanQ2.setElementMap(localcpa);
    localeR2.bb(localanQ2);
    localanQ2.brn();
    bxx localbxx2 = new bxx();
    localbxx2.aJ();
    localbxx2.setElementMap(localcpa);
    localbxx2.setField("type");
    localanQ2.bb(localbxx2);
    localbxx2.brn();
    bSP localbSP2 = new bSP();
    localbSP2.aJ();
    localbSP2.setElementMap(localcpa);
    localbSP2.setValue("1");
    localbxx2.bb(localbSP2);
    localbSP2.brn();
    localbSP2.rV();
    localbxx2.rV();
    localanQ2.rV();
    dRq localdRq2 = dRq.checkOut();
    localdRq2.setElementMap(localcpa);
    localeR2.bb(localdRq2);
    localdRq2.brn();
    dRq localdRq3 = localdRq2;
    Jg localJg3 = localdRq3.getAppearance();
    localJg3.setElementMap(localcpa);
    localdRq2.bb(localJg3);
    localJg3.brn();
    ams localams1 = new ams();
    localams1.aJ();
    localams1.setElementMap(localcpa);
    localams1.setColor(new bNa(1.0F, 1.0F, 1.0F, 1.0F));
    localams1.setInsets(new Insets(1, 1, 1, 1));
    localJg3.bb(localams1);
    localams1.brn();
    localams1.rV();
    localJg3.rV();
    aId localaId2 = aId.checkOut();
    localaId2.setHorizontal(false);
    localdRq2.bb(localaId2);
    localaId2.brn();
    localaId2.rV();
    ccG localccG1 = new ccG();
    localccG1.aJ();
    localccG1.setElementMap(localcpa);
    localccG1.setHorizontal(false);
    localccG1.setAutoIdealSize(true);
    localdRq2.bb(localccG1);
    localccG1.brn();
    ccG localccG2 = localccG1;
    Jg localJg4 = localccG2.getAppearance();
    localJg4.setElementMap(localcpa);
    localccG1.bb(localJg4);
    localJg4.brn();
    ams localams2 = new ams();
    localams2.aJ();
    localams2.setElementMap(localcpa);
    localams2.setInsets(new Insets(1, 0, 2, 0));
    localams2.setColor(new bNa(1.0F, 1.0F, 1.0F, 1.0F));
    localJg4.bb(localams2);
    localams2.brn();
    localams2.rV();
    localJg4.rV();
    aaE localaaE7 = new aaE();
    localaaE7.aJ();
    localaaE7.setElementMap(localcpa);
    localaaE7.setAttribute("cellSize");
    localaaE7.setField("cellSize");
    localccG1.bb(localaaE7);
    localaaE7.brn();
    localaaE7.rV();
    aaE localaaE8 = new aaE();
    localaaE8.aJ();
    localaaE8.setElementMap(localcpa);
    localaaE8.setAttribute("content");
    localaaE8.setField("fieldNames");
    localccG1.bb(localaaE8);
    localaaE8.brn();
    localaaE8.rV();
    eR localeR3 = new eR();
    localeR3.aJ();
    localeR3.setElementMap(localcpa);
    localccG1.bb(localeR3);
    localeR3.brn();
    cWk localcWk4 = new cWk();
    localcWk4.aJ();
    localcWk4.setElementMap(localcpa);
    localcWk4.setStyle("whiteBold");
    localeR3.bb(localcWk4);
    localcWk4.brn();
    cWk localcWk5 = localcWk4;
    Jg localJg5 = localcWk5.getAppearance();
    localJg5.setElementMap(localcpa);
    localcWk4.bb(localJg5);
    localJg5.brn();
    ams localams3 = new ams();
    localams3.aJ();
    localams3.setElementMap(localcpa);
    localams3.setInsets(new Insets(0, 1, 0, 0));
    localams3.setColor(new bNa(1.0F, 1.0F, 1.0F, 1.0F));
    localJg5.bb(localams3);
    localams3.brn();
    localams3.rV();
    localJg5.rV();
    cWk localcWk6 = localcWk4;
    Jg localJg6 = localcWk6.getAppearance();
    localJg6.setElementMap(localcpa);
    ((cwJ)localJg6).setAlignment(aFG.eck);
    localcWk4.bb(localJg6);
    localJg6.brn();
    localJg6.rV();
    aaE localaaE9 = new aaE();
    localaaE9.aJ();
    localaaE9.setElementMap(localcpa);
    localaaE9.setAttribute("text");
    localcWk4.bb(localaaE9);
    localaaE9.brn();
    localaaE9.rV();
    cJN localcJN2 = new cJN();
    localcJN2.aJ();
    localcJN2.setElementMap(localcpa);
    localcWk4.bb(localcJN2);
    localcJN2.brn();
    aaE localaaE10 = new aaE();
    localaaE10.aJ();
    localaaE10.setElementMap(localcpa);
    localaaE10.setAttribute("text");
    localcJN2.bb(localaaE10);
    localaaE10.brn();
    localaaE10.rV();
    localcJN2.rV();
    localcWk4.rV();
    localeR3.rV();
    localccG1.rV();
    ccG localccG3 = new ccG();
    localccG3.aJ();
    localccG3.setElementMap(localcpa);
    localccG3.setHorizontal(false);
    localccG3.setAutoIdealSize(true);
    localdRq2.bb(localccG3);
    localccG3.brn();
    aaE localaaE11 = new aaE();
    localaaE11.aJ();
    localaaE11.setElementMap(localcpa);
    localaaE11.setAttribute("cellSize");
    localaaE11.setField("cellSize");
    localccG3.bb(localaaE11);
    localaaE11.brn();
    localaaE11.rV();
    aaE localaaE12 = new aaE();
    localaaE12.aJ();
    localaaE12.setElementMap(localcpa);
    localaaE12.setAttribute("content");
    localaaE12.setField("rows");
    localccG3.bb(localaaE12);
    localaaE12.brn();
    localaaE12.rV();
    eR localeR4 = new eR();
    localeR4.aJ();
    localeR4.setElementMap(localcpa);
    localccG3.bb(localeR4);
    localeR4.brn();
    dRq localdRq4 = dRq.checkOut();
    localdRq4.setElementMap(localcpa);
    localdRq4.setNonBlocking(false);
    localeR4.bb(localdRq4);
    localdRq4.brn();
    cJN localcJN3 = new cJN();
    localcJN3.aJ();
    localcJN3.setElementMap(localcpa);
    localdRq4.bb(localcJN3);
    localcJN3.brn();
    aaE localaaE13 = new aaE();
    localaaE13.aJ();
    localaaE13.setElementMap(localcpa);
    localaaE13.setAttribute("text");
    localaaE13.setField("tooltipText");
    localcJN3.bb(localaaE13);
    localaaE13.brn();
    localaaE13.rV();
    localcJN3.rV();
    cWk localcWk7 = new cWk();
    localcWk7.aJ();
    localcWk7.setElementMap(localcpa);
    localcWk7.setStyle("white");
    localcWk7.setNonBlocking(true);
    localdRq4.bb(localcWk7);
    localcWk7.brn();
    cWk localcWk8 = localcWk7;
    Jg localJg7 = localcWk8.getAppearance();
    localJg7.setElementMap(localcpa);
    ((cwJ)localJg7).setAlignment(aFG.eck);
    localcWk7.bb(localJg7);
    localJg7.brn();
    ams localams4 = new ams();
    localams4.aJ();
    localams4.setElementMap(localcpa);
    localams4.setColor(new bNa(1.0F, 1.0F, 1.0F, 1.0F));
    localams4.setInsets(new Insets(0, 1, 1, 0));
    localJg7.bb(localams4);
    localams4.brn();
    localams4.rV();
    localJg7.rV();
    aaE localaaE14 = new aaE();
    localaaE14.aJ();
    localaaE14.setElementMap(localcpa);
    localaaE14.setAttribute("text");
    localaaE14.setField("value");
    localcWk7.bb(localaaE14);
    localaaE14.brn();
    localaaE14.rV();
    localcWk7.rV();
    localdRq4.rV();
    localeR4.rV();
    localccG3.rV();
    localdRq2.rV();
    localeR2.rV();
    localat1.rV();
    return localat1;
  }

  public bdj b(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    WV localWV = new WV();
    localWV.aJ();
    localWV.setElementMap(localcpa);
    localWV.setExpandable(false);
    localWV.setPointAlign(aFG.eco);
    cCu localcCu = new cCu();
    localcCu.hg("popup(descChatWindowResizePopup)");
    localWV.setOnPopupDisplay(localcCu);
    jL localjL = new jL();
    localjL.hg("closePopup");
    localWV.setOnPopupHide(localjL);
    parambdj.bb(localWV);
    localWV.brn();
    dpm localdpm = new dpm();
    localdpm.aJ();
    localdpm.setElementMap(localcpa);
    localdpm.setAlign(aFG.eco);
    localWV.bb(localdpm);
    localdpm.brn();
    localdpm.rV();
    czv localczv = new czv();
    localczv.aJ();
    localczv.setElementMap(localcpa);
    localczv.setStyle("WRPSouthEast");
    localczv.setNonBlocking(true);
    localWV.bb(localczv);
    localczv.brn();
    localczv.rV();
    String str1 = "descChatWindowResizePopup";
    anG localanG = new anG();
    localanG.aJ();
    localanG.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localanG);
    localanG.setAlign(aFG.eci);
    localanG.setHotSpotPosition(aFG.ecm);
    localWV.bb(localanG);
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
    String str2 = "%desc.window.resize%";
    str2 = str2.replace("%desc.window.resize%", cBQ.cxL().mL("desc.window.resize"));
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
    localWV.rV();
    return localWV;
  }
}