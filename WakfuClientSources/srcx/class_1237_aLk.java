import java.awt.Insets;
import java.util.Stack;

public class aLk
  implements cEa
{
  private Stack X = new Stack();
  private cDA Y;

  public bdj a(cDA paramcDA, cpa paramcpa)
  {
    this.Y = paramcDA;
    this.X.push(paramcpa);
    cpa localcpa1 = (cpa)this.X.peek();
    String str1 = "mainWindow";
    bpn localbpn = new bpn();
    localbpn.aJ();
    localbpn.setElementMap(localcpa1);
    if ((localcpa1 != null) && (str1 != null))
      localcpa1.a(str1, localbpn);
    localbpn.setPack(true);
    localbpn.brn();
    cwP localcwP1 = new cwP();
    localcwP1.aJ();
    localcwP1.setElementMap(localcpa1);
    localcwP1.setInitValue(true);
    localcwP1.setSize(new Or(-2, -2));
    localcwP1.setAlign(ajb.dhV);
    localbpn.bb(localcwP1);
    localcwP1.brn();
    localcwP1.rV();
    czO localczO = new czO();
    localczO.aJ();
    localczO.setAdaptToContentSize(true);
    localbpn.bb(localczO);
    localczO.brn();
    localczO.rV();
    dqa localdqa = new dqa();
    localdqa.aJ();
    localdqa.setElementMap(localcpa1);
    localbpn.bb(localdqa);
    localdqa.brn();
    cwP localcwP2 = new cwP();
    localcwP2.aJ();
    localcwP2.setElementMap(localcpa1);
    localcwP2.setSize(new Or(100.0F, 100.0F));
    localdqa.bb(localcwP2);
    localcwP2.brn();
    localcwP2.rV();
    dRq localdRq1 = dRq.checkOut();
    localdRq1.setElementMap(localcpa1);
    localdRq1.setStyle("popup");
    localdRq1.setPack(true);
    localdqa.bb(localdRq1);
    localdRq1.brn();
    String str2 = "stateDetailPopup";
    anG localanG = new anG();
    localanG.aJ();
    localanG.setElementMap(localcpa1);
    if ((localcpa1 != null) && (str2 != null))
      localcpa1.a(str2, localanG);
    localanG.setAlign(aFG.eci);
    localanG.setHotSpotPosition(aFG.ecg);
    localdRq1.bb(localanG);
    localanG.brn();
    cpa localcpa2 = localcpa1;
    localcpa1 = this.Y.nd((localcpa1 != null ? localcpa1.getId() : "") + ".itemDetailPopupInc");
    localcpa1.d(localcpa2);
    this.X.push(localcpa1);
    dRq localdRq2 = dRq.checkOut();
    localdRq2.setElementMap(localcpa1);
    localdRq2.setStyle("popup");
    localanG.bb(localdRq2);
    localdRq2.brn();
    aId localaId1 = aId.checkOut();
    localaId1.setHorizontal(false);
    localaId1.setAlign(aFG.ech);
    localdRq2.bb(localaId1);
    localaId1.brn();
    localaId1.rV();
    dRq localdRq3 = dRq.checkOut();
    localdRq3.setElementMap(localcpa1);
    localdRq3.setExpandable(false);
    localdRq3.setVisible(false);
    localdRq2.bb(localdRq3);
    localdRq3.brn();
    NK localNK1 = NK.checkOut();
    localNK1.setElementMap(localcpa1);
    localNK1.setName("describedIcon");
    localNK1.setAttribute("visible");
    localdRq3.bb(localNK1);
    localNK1.brn();
    anQ localanQ1 = new anQ();
    localanQ1.aJ();
    localanQ1.setElementMap(localcpa1);
    localNK1.bb(localanQ1);
    localanQ1.brn();
    anE localanE1 = new anE();
    localanE1.aJ();
    localanE1.setElementMap(localcpa1);
    localanQ1.bb(localanE1);
    localanE1.brn();
    localanE1.rV();
    localanQ1.rV();
    localNK1.rV();
    cWk localcWk1 = new cWk();
    localcWk1.aJ();
    localcWk1.setElementMap(localcpa1);
    localcWk1.setStyle("white11");
    localcWk1.setMultiline(false);
    localdRq3.bb(localcWk1);
    localcWk1.brn();
    NK localNK2 = NK.checkOut();
    localNK2.setElementMap(localcpa1);
    localNK2.setName("describedIcon");
    localNK2.setAttribute("text");
    localcWk1.bb(localNK2);
    localNK2.brn();
    localNK2.rV();
    localcWk1.rV();
    localdRq3.rV();
    dRq localdRq4 = dRq.checkOut();
    localdRq4.setElementMap(localcpa1);
    localdRq4.setExpandable(false);
    localdRq2.bb(localdRq4);
    localdRq4.brn();
    NK localNK3 = NK.checkOut();
    localNK3.setElementMap(localcpa1);
    localNK3.setName("describedState");
    localNK3.setAttribute("visible");
    localdRq4.bb(localNK3);
    localNK3.brn();
    anQ localanQ2 = new anQ();
    localanQ2.aJ();
    localanQ2.setElementMap(localcpa1);
    localNK3.bb(localanQ2);
    localanQ2.brn();
    anE localanE2 = new anE();
    localanE2.aJ();
    localanE2.setElementMap(localcpa1);
    localanQ2.bb(localanE2);
    localanE2.brn();
    localanE2.rV();
    localanQ2.rV();
    localNK3.rV();
    aId localaId2 = aId.checkOut();
    localaId2.setHorizontal(false);
    localdRq4.bb(localaId2);
    localaId2.brn();
    localaId2.rV();
    dRq localdRq5 = dRq.checkOut();
    localdRq5.setElementMap(localcpa1);
    localdRq4.bb(localdRq5);
    localdRq5.brn();
    aId localaId3 = aId.checkOut();
    localaId3.setAlign(aFG.ecj);
    localdRq5.bb(localaId3);
    localaId3.brn();
    localaId3.rV();
    czv localczv1 = new czv();
    localczv1.aJ();
    localczv1.setElementMap(localcpa1);
    localczv1.setExpandable(false);
    localczv1.setDisplaySize(new Or(32, 32));
    localdRq5.bb(localczv1);
    localczv1.brn();
    dpm localdpm1 = new dpm();
    localdpm1.aJ();
    localdpm1.setElementMap(localcpa1);
    localdpm1.setAlign(aFG.ecj);
    localczv1.bb(localdpm1);
    localdpm1.brn();
    localdpm1.rV();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa1);
    localczv1.bb(localaAR);
    localaAR.brn();
    NK localNK4 = NK.checkOut();
    localNK4.setElementMap(localcpa1);
    localNK4.setName("describedState");
    localNK4.setAttribute("texture");
    localNK4.setField("iconUrl");
    localaAR.bb(localNK4);
    localNK4.brn();
    localNK4.rV();
    localaAR.rV();
    localczv1.rV();
    dRq localdRq6 = dRq.checkOut();
    localdRq6.setElementMap(localcpa1);
    localdRq5.bb(localdRq6);
    localdRq6.brn();
    dRq localdRq7 = localdRq6;
    Jg localJg1 = localdRq7.getAppearance();
    localJg1.setElementMap(localcpa1);
    localdRq6.bb(localJg1);
    localJg1.brn();
    bmv localbmv1 = bmv.checkOut();
    localbmv1.setElementMap(localcpa1);
    localbmv1.setInsets(new Insets(0, 5, 0, 0));
    localJg1.bb(localbmv1);
    localbmv1.brn();
    localbmv1.rV();
    localJg1.rV();
    aId localaId4 = aId.checkOut();
    localaId4.setHorizontal(false);
    localdRq6.bb(localaId4);
    localaId4.brn();
    localaId4.rV();
    dRq localdRq8 = dRq.checkOut();
    localdRq8.setElementMap(localcpa1);
    localdRq8.setExpandable(false);
    localdRq6.bb(localdRq8);
    localdRq8.brn();
    aId localaId5 = aId.checkOut();
    localaId5.setAlign(aFG.ecj);
    localdRq8.bb(localaId5);
    localaId5.brn();
    localaId5.rV();
    cWk localcWk2 = new cWk();
    localcWk2.aJ();
    localcWk2.setElementMap(localcpa1);
    localcWk2.setStyle("bigTitle");
    localcWk2.setExpandable(false);
    localcWk2.setMinWidth(190);
    localcWk2.setNonBlocking(true);
    localdRq8.bb(localcWk2);
    localcWk2.brn();
    cWk localcWk3 = localcWk2;
    Jg localJg2 = localcWk3.getAppearance();
    localJg2.setElementMap(localcpa1);
    ((cwJ)localJg2).setAlign(aFG.ecg);
    localcWk2.bb(localJg2);
    localJg2.brn();
    localJg2.rV();
    NK localNK5 = NK.checkOut();
    localNK5.setElementMap(localcpa1);
    localNK5.setName("describedState");
    localNK5.setAttribute("text");
    localNK5.setField("nameWithFormat");
    localcWk2.bb(localNK5);
    localNK5.brn();
    localNK5.rV();
    localcWk2.rV();
    dAS localdAS = new dAS();
    localdAS.aJ();
    localdAS.setElementMap(localcpa1);
    localdRq8.bb(localdAS);
    localdAS.brn();
    localdAS.rV();
    caF localcaF1 = new caF();
    localcaF1.aJ();
    localcaF1.setElementMap(localcpa1);
    localcaF1.setStyle("11light");
    localcaF1.setExpandable(false);
    localdRq8.bb(localcaF1);
    localcaF1.brn();
    caF localcaF2 = localcaF1;
    Jg localJg3 = localcaF2.getAppearance();
    localJg3.setElementMap(localcpa1);
    localcaF1.bb(localJg3);
    localJg3.brn();
    bmv localbmv2 = bmv.checkOut();
    localbmv2.setElementMap(localcpa1);
    localbmv2.setInsets(new Insets(0, 5, 0, 0));
    localJg3.bb(localbmv2);
    localbmv2.brn();
    localbmv2.rV();
    cAf localcAf1 = cAf.checkOut();
    localcAf1.setElementMap(localcpa1);
    localcAf1.setColor(new bNa(1.0F, 1.0F, 1.0F, 1.0F));
    localJg3.bb(localcAf1);
    localcAf1.brn();
    localcAf1.rV();
    localJg3.rV();
    NK localNK6 = NK.checkOut();
    localNK6.setElementMap(localcpa1);
    localNK6.setAttribute("visible");
    localNK6.setName("describedState");
    localNK6.setField("maxLevelValue");
    localcaF1.bb(localNK6);
    localNK6.brn();
    anQ localanQ3 = new anQ();
    localanQ3.aJ();
    localanQ3.setElementMap(localcpa1);
    localNK6.bb(localanQ3);
    localanQ3.brn();
    aEJ localaEJ = new aEJ();
    localaEJ.aJ();
    localaEJ.setElementMap(localcpa1);
    localaEJ.setValue("1");
    localanQ3.bb(localaEJ);
    localaEJ.brn();
    localaEJ.rV();
    localanQ3.rV();
    localNK6.rV();
    NK localNK7 = NK.checkOut();
    localNK7.setElementMap(localcpa1);
    localNK7.setName("describedState");
    localNK7.setAttribute("text");
    localNK7.setField("level");
    localcaF1.bb(localNK7);
    localNK7.brn();
    localNK7.rV();
    localcaF1.rV();
    localdRq8.rV();
    czv localczv2 = new czv();
    localczv2.aJ();
    localczv2.setElementMap(localcpa1);
    localczv2.setStyle("stateCumulable");
    localdRq6.bb(localczv2);
    localczv2.brn();
    dpm localdpm2 = new dpm();
    localdpm2.aJ();
    localdpm2.setElementMap(localcpa1);
    localdpm2.setAlign(aFG.ecj);
    localczv2.bb(localdpm2);
    localdpm2.brn();
    localdpm2.rV();
    NK localNK8 = NK.checkOut();
    localNK8.setElementMap(localcpa1);
    localNK8.setName("describedState");
    localNK8.setAttribute("visible");
    localNK8.setField("isCumulable");
    localczv2.bb(localNK8);
    localNK8.brn();
    localNK8.rV();
    localczv2.rV();
    localdRq6.rV();
    localdRq5.rV();
    dRq localdRq9 = dRq.checkOut();
    localdRq9.setElementMap(localcpa1);
    localdRq4.bb(localdRq9);
    localdRq9.brn();
    aId localaId6 = aId.checkOut();
    localaId6.setHorizontal(false);
    localdRq9.bb(localaId6);
    localaId6.brn();
    localaId6.rV();
    NK localNK9 = NK.checkOut();
    localNK9.setElementMap(localcpa1);
    localNK9.setName("describedState");
    localNK9.setAttribute("visible");
    localNK9.setField("description");
    localdRq9.bb(localNK9);
    localNK9.brn();
    anQ localanQ4 = new anQ();
    localanQ4.aJ();
    localanQ4.setElementMap(localcpa1);
    localNK9.bb(localanQ4);
    localanQ4.brn();
    bJJ localbJJ1 = new bJJ();
    localbJJ1.aJ();
    localbJJ1.setElementMap(localcpa1);
    localanQ4.bb(localbJJ1);
    localbJJ1.brn();
    anE localanE3 = new anE();
    localanE3.aJ();
    localanE3.setElementMap(localcpa1);
    localbJJ1.bb(localanE3);
    localanE3.brn();
    localanE3.rV();
    jA localjA1 = new jA();
    localjA1.aJ();
    localjA1.setElementMap(localcpa1);
    localjA1.setValue("");
    localbJJ1.bb(localjA1);
    localjA1.brn();
    localjA1.rV();
    localbJJ1.rV();
    localanQ4.rV();
    localNK9.rV();
    dRq localdRq10 = dRq.checkOut();
    localdRq10.setElementMap(localcpa1);
    localdRq10.setExpandable(false);
    localdRq10.setStyle("lineSeparator2");
    localdRq10.setPrefSize(new Or(50, 1));
    localdRq9.bb(localdRq10);
    localdRq10.brn();
    dRq localdRq11 = localdRq10;
    Jg localJg4 = localdRq11.getAppearance();
    localJg4.setElementMap(localcpa1);
    localdRq10.bb(localJg4);
    localJg4.brn();
    bmv localbmv3 = bmv.checkOut();
    localbmv3.setElementMap(localcpa1);
    localbmv3.setInsets(new Insets(5, 20, 5, 20));
    localJg4.bb(localbmv3);
    localbmv3.brn();
    localbmv3.rV();
    localJg4.rV();
    localdRq10.rV();
    cWk localcWk4 = new cWk();
    localcWk4.aJ();
    localcWk4.setElementMap(localcpa1);
    localcWk4.setExpandable(false);
    localcWk4.setStyle("narrow12");
    localcWk4.setMinWidth(230);
    localdRq9.bb(localcWk4);
    localcWk4.brn();
    dpm localdpm3 = new dpm();
    localdpm3.aJ();
    localdpm3.setElementMap(localcpa1);
    localdpm3.setAlign(aFG.ecj);
    localcWk4.bb(localdpm3);
    localdpm3.brn();
    localdpm3.rV();
    cWk localcWk5 = localcWk4;
    Jg localJg5 = localcWk5.getAppearance();
    localJg5.setElementMap(localcpa1);
    localcWk4.bb(localJg5);
    localJg5.brn();
    bmv localbmv4 = bmv.checkOut();
    localbmv4.setElementMap(localcpa1);
    localbmv4.setInsets(new Insets(0, 10, 0, 0));
    localJg5.bb(localbmv4);
    localbmv4.brn();
    localbmv4.rV();
    cAf localcAf2 = cAf.checkOut();
    localcAf2.setElementMap(localcpa1);
    localcAf2.setColor(new bNa(0.98F, 0.77F, 0.0F, 1.0F));
    localJg5.bb(localcAf2);
    localcAf2.brn();
    localcAf2.rV();
    localJg5.rV();
    NK localNK10 = NK.checkOut();
    localNK10.setElementMap(localcpa1);
    localNK10.setName("describedState");
    localNK10.setAttribute("text");
    localNK10.setField("description");
    localcWk4.bb(localNK10);
    localNK10.brn();
    localNK10.rV();
    localcWk4.rV();
    localdRq9.rV();
    dRq localdRq12 = dRq.checkOut();
    localdRq12.setElementMap(localcpa1);
    localdRq4.bb(localdRq12);
    localdRq12.brn();
    aId localaId7 = aId.checkOut();
    localaId7.setHorizontal(false);
    localdRq12.bb(localaId7);
    localaId7.brn();
    localaId7.rV();
    NK localNK11 = NK.checkOut();
    localNK11.setElementMap(localcpa1);
    localNK11.setName("describedState");
    localNK11.setAttribute("visible");
    localNK11.setField("effectDescription");
    localdRq12.bb(localNK11);
    localNK11.brn();
    anQ localanQ5 = new anQ();
    localanQ5.aJ();
    localanQ5.setElementMap(localcpa1);
    localNK11.bb(localanQ5);
    localanQ5.brn();
    bJJ localbJJ2 = new bJJ();
    localbJJ2.aJ();
    localbJJ2.setElementMap(localcpa1);
    localanQ5.bb(localbJJ2);
    localbJJ2.brn();
    anE localanE4 = new anE();
    localanE4.aJ();
    localanE4.setElementMap(localcpa1);
    localbJJ2.bb(localanE4);
    localanE4.brn();
    localanE4.rV();
    jA localjA2 = new jA();
    localjA2.aJ();
    localjA2.setElementMap(localcpa1);
    localjA2.setValue("");
    localbJJ2.bb(localjA2);
    localjA2.brn();
    localjA2.rV();
    localbJJ2.rV();
    localanQ5.rV();
    localNK11.rV();
    dRq localdRq13 = dRq.checkOut();
    localdRq13.setElementMap(localcpa1);
    localdRq13.setExpandable(false);
    localdRq13.setStyle("lineSeparator2");
    localdRq13.setPrefSize(new Or(50, 1));
    localdRq12.bb(localdRq13);
    localdRq13.brn();
    dRq localdRq14 = localdRq13;
    Jg localJg6 = localdRq14.getAppearance();
    localJg6.setElementMap(localcpa1);
    localdRq13.bb(localJg6);
    localJg6.brn();
    bmv localbmv5 = bmv.checkOut();
    localbmv5.setElementMap(localcpa1);
    localbmv5.setInsets(new Insets(5, 20, 5, 20));
    localJg6.bb(localbmv5);
    localbmv5.brn();
    localbmv5.rV();
    localJg6.rV();
    localdRq13.rV();
    at localat = new at();
    localat.aJ();
    localat.setElementMap(localcpa1);
    localat.setHorizontal(false);
    localdRq12.bb(localat);
    localat.brn();
    NK localNK12 = NK.checkOut();
    localNK12.setElementMap(localcpa1);
    localNK12.setName("describedState");
    localNK12.setAttribute("content");
    localNK12.setField("effectDescription");
    localat.bb(localNK12);
    localNK12.brn();
    localNK12.rV();
    eR localeR = new eR();
    localeR.aJ();
    localeR.setElementMap(localcpa1);
    localat.bb(localeR);
    localeR.brn();
    a(localeR);
    b(localeR);
    localeR.rV();
    localat.rV();
    localdRq12.rV();
    localdRq4.rV();
    localdRq2.rV();
    this.X.pop();
    localcpa1 = (cpa)this.X.peek();
    localanG.rV();
    d(localdRq1);
    localdRq1.rV();
    localdqa.rV();
    localbpn.rV();
    return localbpn;
  }

  public bdj a(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    anQ localanQ = new anQ();
    localanQ.aJ();
    localanQ.setElementMap(localcpa);
    parambdj.bb(localanQ);
    localanQ.brn();
    bxx localbxx = new bxx();
    localbxx.aJ();
    localbxx.setElementMap(localcpa);
    localanQ.bb(localbxx);
    localbxx.brn();
    anE localanE = new anE();
    localanE.aJ();
    localanE.setElementMap(localcpa);
    localbxx.bb(localanE);
    localanE.brn();
    localanE.rV();
    localbxx.rV();
    localanQ.rV();
    return localanQ;
  }

  public bdj b(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    dRq localdRq = dRq.checkOut();
    localdRq.setElementMap(localcpa);
    parambdj.bb(localdRq);
    localdRq.brn();
    cWk localcWk1 = new cWk();
    localcWk1.aJ();
    localcWk1.setElementMap(localcpa);
    localcWk1.setStyle("white11");
    localcWk1.setMinWidth(230);
    localcWk1.setMaxWidth(230);
    localcWk1.setExpandable(false);
    localcWk1.setEnableOnlySelectablePartInteraction(true);
    bDy localbDy = new bDy();
    localbDy.hg("wakfu.spellDetails:processText(container,stateDetailPopup)");
    localcWk1.setOnMouseEnter(localbDy);
    DY localDY = new DY();
    localDY.hg("xulor:closePopup");
    localcWk1.setOnMouseExit(localDY);
    localdRq.bb(localcWk1);
    localcWk1.brn();
    cWk localcWk2 = localcWk1;
    Jg localJg = localcWk2.getAppearance();
    localJg.setElementMap(localcpa);
    localcWk1.bb(localJg);
    localJg.brn();
    bmv localbmv = bmv.checkOut();
    localbmv.setElementMap(localcpa);
    localbmv.setInsets(new Insets(0, 5, 0, 0));
    localJg.bb(localbmv);
    localbmv.brn();
    localbmv.rV();
    localJg.rV();
    aaE localaaE = new aaE();
    localaaE.aJ();
    localaaE.setElementMap(localcpa);
    localaaE.setAttribute("text");
    localcWk1.bb(localaaE);
    localaaE.brn();
    localaaE.rV();
    localcWk1.rV();
    localdRq.rV();
    return localdRq;
  }

  public bdj d(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    String str = "container";
    dRq localdRq1 = dRq.checkOut();
    localdRq1.setElementMap(localcpa);
    if ((localcpa != null) && (str != null))
      localcpa.a(str, localdRq1);
    parambdj.bb(localdRq1);
    localdRq1.brn();
    aId localaId1 = aId.checkOut();
    localaId1.setHorizontal(false);
    localdRq1.bb(localaId1);
    localaId1.brn();
    localaId1.rV();
    dRq localdRq2 = dRq.checkOut();
    localdRq2.setElementMap(localcpa);
    localdRq1.bb(localdRq2);
    localdRq2.brn();
    aId localaId2 = aId.checkOut();
    localaId2.setAlign(aFG.ecj);
    localdRq2.bb(localaId2);
    localaId2.brn();
    localaId2.rV();
    czv localczv = new czv();
    localczv.aJ();
    localczv.setElementMap(localcpa);
    localczv.setExpandable(false);
    localczv.setDisplaySize(new Or(32, 32));
    localczv.setNonBlocking(true);
    localdRq2.bb(localczv);
    localczv.brn();
    dpm localdpm1 = new dpm();
    localdpm1.aJ();
    localdpm1.setElementMap(localcpa);
    localdpm1.setAlign(aFG.ecj);
    localczv.bb(localdpm1);
    localdpm1.brn();
    localdpm1.rV();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localczv.bb(localaAR);
    localaAR.brn();
    NK localNK1 = NK.checkOut();
    localNK1.setElementMap(localcpa);
    localNK1.setLocal(true);
    localNK1.setName("describedState");
    localNK1.setAttribute("texture");
    localNK1.setField("iconUrl");
    localaAR.bb(localNK1);
    localNK1.brn();
    localNK1.rV();
    localaAR.rV();
    localczv.rV();
    dRq localdRq3 = dRq.checkOut();
    localdRq3.setElementMap(localcpa);
    localdRq2.bb(localdRq3);
    localdRq3.brn();
    aId localaId3 = aId.checkOut();
    localaId3.setHorizontal(false);
    localdRq3.bb(localaId3);
    localaId3.brn();
    localaId3.rV();
    dRq localdRq4 = localdRq3;
    Jg localJg1 = localdRq4.getAppearance();
    localJg1.setElementMap(localcpa);
    localdRq3.bb(localJg1);
    localJg1.brn();
    bmv localbmv1 = bmv.checkOut();
    localbmv1.setElementMap(localcpa);
    localbmv1.setInsets(new Insets(0, 5, 0, 0));
    localJg1.bb(localbmv1);
    localbmv1.brn();
    localbmv1.rV();
    localJg1.rV();
    dRq localdRq5 = dRq.checkOut();
    localdRq5.setElementMap(localcpa);
    localdRq5.setExpandable(false);
    localdRq3.bb(localdRq5);
    localdRq5.brn();
    aId localaId4 = aId.checkOut();
    localaId4.setAlign(aFG.ecj);
    localdRq5.bb(localaId4);
    localaId4.brn();
    localaId4.rV();
    cWk localcWk1 = new cWk();
    localcWk1.aJ();
    localcWk1.setElementMap(localcpa);
    localcWk1.setStyle("bigTitle");
    localcWk1.setExpandable(false);
    localcWk1.setMinWidth(190);
    localcWk1.setNonBlocking(true);
    localdRq5.bb(localcWk1);
    localcWk1.brn();
    cWk localcWk2 = localcWk1;
    Jg localJg2 = localcWk2.getAppearance();
    localJg2.setElementMap(localcpa);
    ((cwJ)localJg2).setAlign(aFG.ecg);
    localcWk1.bb(localJg2);
    localJg2.brn();
    localJg2.rV();
    NK localNK2 = NK.checkOut();
    localNK2.setElementMap(localcpa);
    localNK2.setLocal(true);
    localNK2.setName("describedState");
    localNK2.setAttribute("text");
    localNK2.setField("nameWithFormat");
    localcWk1.bb(localNK2);
    localNK2.brn();
    localNK2.rV();
    localcWk1.rV();
    dAS localdAS = new dAS();
    localdAS.aJ();
    localdAS.setElementMap(localcpa);
    localdRq5.bb(localdAS);
    localdAS.brn();
    localdAS.rV();
    caF localcaF1 = new caF();
    localcaF1.aJ();
    localcaF1.setElementMap(localcpa);
    localcaF1.setStyle("11light");
    localcaF1.setExpandable(false);
    localcaF1.setPrefSize(new Or(40, 0));
    localdRq5.bb(localcaF1);
    localcaF1.brn();
    caF localcaF2 = localcaF1;
    Jg localJg3 = localcaF2.getAppearance();
    localJg3.setElementMap(localcpa);
    localcaF1.bb(localJg3);
    localJg3.brn();
    bmv localbmv2 = bmv.checkOut();
    localbmv2.setElementMap(localcpa);
    localbmv2.setInsets(new Insets(0, 5, 0, 0));
    localJg3.bb(localbmv2);
    localbmv2.brn();
    localbmv2.rV();
    cAf localcAf = cAf.checkOut();
    localcAf.setElementMap(localcpa);
    localcAf.setColor(new bNa(1.0F, 1.0F, 1.0F, 1.0F));
    localJg3.bb(localcAf);
    localcAf.brn();
    localcAf.rV();
    localJg3.rV();
    NK localNK3 = NK.checkOut();
    localNK3.setElementMap(localcpa);
    localNK3.setLocal(true);
    localNK3.setName("describedState");
    localNK3.setAttribute("text");
    localNK3.setField("level");
    localcaF1.bb(localNK3);
    localNK3.brn();
    localNK3.rV();
    localcaF1.rV();
    localdRq5.rV();
    localdRq3.rV();
    biy localbiy = new biy();
    localbiy.aJ();
    localbiy.setElementMap(localcpa);
    localbiy.setStyle("close");
    localbiy.setExpandable(false);
    csA localcsA1 = new csA();
    localcsA1.hg("unloadDialog");
    localbiy.setOnClick(localcsA1);
    localdRq2.bb(localbiy);
    localbiy.brn();
    dpm localdpm2 = new dpm();
    localdpm2.aJ();
    localdpm2.setElementMap(localcpa);
    localdpm2.setAlign(aFG.ech);
    localbiy.bb(localdpm2);
    localdpm2.brn();
    localdpm2.rV();
    localbiy.rV();
    localdRq2.rV();
    dRq localdRq6 = dRq.checkOut();
    localdRq6.setElementMap(localcpa);
    localdRq1.bb(localdRq6);
    localdRq6.brn();
    aId localaId5 = aId.checkOut();
    localaId5.setHorizontal(false);
    localdRq6.bb(localaId5);
    localaId5.brn();
    localaId5.rV();
    NK localNK4 = NK.checkOut();
    localNK4.setElementMap(localcpa);
    localNK4.setLocal(true);
    localNK4.setName("describedState");
    localNK4.setAttribute("visible");
    localNK4.setField("effectDescription");
    localdRq6.bb(localNK4);
    localNK4.brn();
    anQ localanQ1 = new anQ();
    localanQ1.aJ();
    localanQ1.setElementMap(localcpa);
    localNK4.bb(localanQ1);
    localanQ1.brn();
    bJJ localbJJ = new bJJ();
    localbJJ.aJ();
    localbJJ.setElementMap(localcpa);
    localanQ1.bb(localbJJ);
    localbJJ.brn();
    anE localanE1 = new anE();
    localanE1.aJ();
    localanE1.setElementMap(localcpa);
    localbJJ.bb(localanE1);
    localanE1.brn();
    localanE1.rV();
    jA localjA = new jA();
    localjA.aJ();
    localjA.setElementMap(localcpa);
    localjA.setValue("");
    localbJJ.bb(localjA);
    localjA.brn();
    localjA.rV();
    localbJJ.rV();
    localanQ1.rV();
    localNK4.rV();
    dRq localdRq7 = dRq.checkOut();
    localdRq7.setElementMap(localcpa);
    localdRq7.setExpandable(false);
    localdRq7.setStyle("lineSeparator2");
    localdRq7.setPrefSize(new Or(50, 1));
    localdRq7.setNonBlocking(true);
    localdRq6.bb(localdRq7);
    localdRq7.brn();
    dRq localdRq8 = localdRq7;
    Jg localJg4 = localdRq8.getAppearance();
    localJg4.setElementMap(localcpa);
    localdRq7.bb(localJg4);
    localJg4.brn();
    bmv localbmv3 = bmv.checkOut();
    localbmv3.setElementMap(localcpa);
    localbmv3.setInsets(new Insets(5, 20, 5, 20));
    localJg4.bb(localbmv3);
    localbmv3.brn();
    localbmv3.rV();
    localJg4.rV();
    localdRq7.rV();
    at localat = new at();
    localat.aJ();
    localat.setElementMap(localcpa);
    localat.setHorizontal(false);
    localdRq6.bb(localat);
    localat.brn();
    NK localNK5 = NK.checkOut();
    localNK5.setElementMap(localcpa);
    localNK5.setLocal(true);
    localNK5.setName("describedState");
    localNK5.setAttribute("content");
    localNK5.setField("effectDescription");
    localat.bb(localNK5);
    localNK5.brn();
    localNK5.rV();
    eR localeR = new eR();
    localeR.aJ();
    localeR.setElementMap(localcpa);
    localat.bb(localeR);
    localeR.brn();
    anQ localanQ2 = new anQ();
    localanQ2.aJ();
    localanQ2.setElementMap(localcpa);
    localeR.bb(localanQ2);
    localanQ2.brn();
    bxx localbxx = new bxx();
    localbxx.aJ();
    localbxx.setElementMap(localcpa);
    localanQ2.bb(localbxx);
    localbxx.brn();
    anE localanE2 = new anE();
    localanE2.aJ();
    localanE2.setElementMap(localcpa);
    localbxx.bb(localanE2);
    localanE2.brn();
    localanE2.rV();
    localbxx.rV();
    localanQ2.rV();
    dRq localdRq9 = dRq.checkOut();
    localdRq9.setElementMap(localcpa);
    localeR.bb(localdRq9);
    localdRq9.brn();
    cWk localcWk3 = new cWk();
    localcWk3.aJ();
    localcWk3.setElementMap(localcpa);
    localcWk3.setStyle("white11");
    localcWk3.setMinWidth(230);
    localcWk3.setMaxWidth(230);
    localcWk3.setExpandable(false);
    localcWk3.setEnableOnlySelectablePartInteraction(true);
    localcWk3.setNonBlocking(false);
    csA localcsA2 = new csA();
    localcsA2.hg("wakfu.itemDetails:processText(container,stateDetailPopup)");
    localcWk3.setOnClick(localcsA2);
    bDy localbDy = new bDy();
    localbDy.hg("wakfu.itemDetails:processText(container,stateDetailPopup)");
    localcWk3.setOnMouseEnter(localbDy);
    DY localDY = new DY();
    localDY.hg("xulor:closePopup");
    localcWk3.setOnMouseExit(localDY);
    localdRq9.bb(localcWk3);
    localcWk3.brn();
    cWk localcWk4 = localcWk3;
    Jg localJg5 = localcWk4.getAppearance();
    localJg5.setElementMap(localcpa);
    localcWk3.bb(localJg5);
    localJg5.brn();
    bmv localbmv4 = bmv.checkOut();
    localbmv4.setElementMap(localcpa);
    localbmv4.setInsets(new Insets(0, 5, 0, 0));
    localJg5.bb(localbmv4);
    localbmv4.brn();
    localbmv4.rV();
    localJg5.rV();
    aaE localaaE = new aaE();
    localaaE.aJ();
    localaaE.setElementMap(localcpa);
    localaaE.setAttribute("text");
    localcWk3.bb(localaaE);
    localaaE.brn();
    localaaE.rV();
    localcWk3.rV();
    localdRq9.rV();
    localeR.rV();
    localat.rV();
    localdRq6.rV();
    localdRq1.rV();
    return localdRq1;
  }
}