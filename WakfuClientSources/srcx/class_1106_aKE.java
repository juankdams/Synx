import java.awt.Insets;
import java.util.Stack;

public class aKE
  implements cEa
{
  private Stack X = new Stack();
  private cDA Y;

  public bdj a(cDA paramcDA, cpa paramcpa)
  {
    this.Y = paramcDA;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    String str1 = "fightBar";
    bpn localbpn = new bpn();
    localbpn.aJ();
    localbpn.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localbpn);
    aFU localaFU = new aFU();
    localaFU.hg("wakfu.windowStick:stickWindow");
    localbpn.setOnStick(localaFU);
    localbpn.brn();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setElementMap(localcpa);
    localcwP.setAlign(ajb.dhY);
    localcwP.setInitValue(true);
    localcwP.setYOffset(-30);
    localbpn.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    dqa localdqa = new dqa();
    localdqa.aJ();
    localdqa.setElementMap(localcpa);
    localbpn.bb(localdqa);
    localdqa.brn();
    dRq localdRq1 = dRq.checkOut();
    localdRq1.setElementMap(localcpa);
    localdRq1.setStyle("VerticalMainBackground");
    localdqa.bb(localdRq1);
    localdRq1.brn();
    String str2 = "giveUpButton";
    biy localbiy1 = new biy();
    localbiy1.aJ();
    localbiy1.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localbiy1);
    localbiy1.setStyle("fightBar2");
    localbiy1.setExpandable(false);
    csA localcsA1 = new csA();
    localcsA1.hg("wakfu.fightAction:giveUpFight");
    localbiy1.setOnClick(localcsA1);
    cCu localcCu1 = new cCu();
    localcCu1.hg("popup(descGiveUpFightPopup)");
    localbiy1.setOnPopupDisplay(localcCu1);
    jL localjL1 = new jL();
    localjL1.hg("closePopup");
    localbiy1.setOnPopupHide(localjL1);
    localbiy1.setPrefSize(new Or(33, 35));
    localdRq1.bb(localbiy1);
    localbiy1.brn();
    String str3 = "descGiveUpFightPopup";
    anG localanG1 = new anG();
    localanG1.aJ();
    localanG1.setElementMap(localcpa);
    if ((localcpa != null) && (str3 != null))
      localcpa.a(str3, localanG1);
    localanG1.setAlign(aFG.ech);
    localanG1.setHotSpotPosition(aFG.ecn);
    localbiy1.bb(localanG1);
    localanG1.brn();
    dRq localdRq2 = dRq.checkOut();
    localdRq2.setElementMap(localcpa);
    localdRq2.setPrefSize(new Or(10, 0));
    localdRq2.setStyle("popup");
    localanG1.bb(localdRq2);
    localdRq2.brn();
    cba localcba1 = cba.checkOut();
    localcba1.setElementMap(localcpa);
    localcba1.setData(cFu.izR);
    localdRq2.bb(localcba1);
    localcba1.brn();
    localcba1.rV();
    caF localcaF1 = new caF();
    localcaF1.aJ();
    localcaF1.setElementMap(localcpa);
    localcaF1.setStyle("PopupInformation");
    String str4 = "%desc.giveUpFight% (";
    str4 = str4.replace("%desc.giveUpFight%", cBQ.cxL().mL("desc.giveUpFight"));
    localcaF1.setText(str4);
    localdRq2.bb(localcaF1);
    localcaF1.brn();
    caF localcaF2 = localcaF1;
    Jg localJg1 = localcaF2.getAppearance();
    localJg1.setElementMap(localcpa);
    ((cwJ)localJg1).setAlignment(aFG.ecj);
    localcaF1.bb(localJg1);
    localJg1.brn();
    localJg1.rV();
    localcaF1.rV();
    caF localcaF3 = new caF();
    localcaF3.aJ();
    localcaF3.setElementMap(localcpa);
    localcaF3.setStyle("PopupInformation");
    localdRq2.bb(localcaF3);
    localcaF3.brn();
    caF localcaF4 = localcaF3;
    Jg localJg2 = localcaF4.getAppearance();
    localJg2.setElementMap(localcpa);
    ((cwJ)localJg2).setAlignment(aFG.ecj);
    localcaF3.bb(localJg2);
    localJg2.brn();
    localJg2.rV();
    NK localNK1 = NK.checkOut();
    localNK1.setElementMap(localcpa);
    localNK1.setAttribute("text");
    localNK1.setName("shortcutsList");
    localNK1.setField("giveUp/key");
    localcaF3.bb(localNK1);
    localNK1.brn();
    localNK1.rV();
    localcaF3.rV();
    caF localcaF5 = new caF();
    localcaF5.aJ();
    localcaF5.setElementMap(localcpa);
    localcaF5.setStyle("PopupInformation");
    localcaF5.setText(")");
    localdRq2.bb(localcaF5);
    localcaF5.brn();
    caF localcaF6 = localcaF5;
    Jg localJg3 = localcaF6.getAppearance();
    localJg3.setElementMap(localcpa);
    ((cwJ)localJg3).setAlignment(aFG.ecj);
    localcaF5.bb(localJg3);
    localJg3.brn();
    localJg3.rV();
    localcaF5.rV();
    localdRq2.rV();
    localanG1.rV();
    NK localNK2 = NK.checkOut();
    localNK2.setElementMap(localcpa);
    localNK2.setAttribute("enabled");
    localNK2.setName("canGiveUpFight");
    localbiy1.bb(localNK2);
    localNK2.brn();
    anQ localanQ1 = new anQ();
    localanQ1.aJ();
    localanQ1.setElementMap(localcpa);
    localNK2.bb(localanQ1);
    localanQ1.brn();
    bJJ localbJJ1 = new bJJ();
    localbJJ1.aJ();
    localbJJ1.setElementMap(localcpa);
    localanQ1.bb(localbJJ1);
    localbJJ1.brn();
    cOk localcOk1 = new cOk();
    localcOk1.aJ();
    localcOk1.setElementMap(localcpa);
    localbJJ1.bb(localcOk1);
    localcOk1.brn();
    localcOk1.rV();
    bqW localbqW1 = new bqW();
    localbqW1.aJ();
    localbqW1.setElementMap(localcpa);
    localbJJ1.bb(localbqW1);
    localbqW1.brn();
    NK localNK3 = NK.checkOut();
    localNK3.setElementMap(localcpa);
    localNK3.setAttribute("comparedValue");
    localNK3.setName("giveUpDisabled");
    localbqW1.bb(localNK3);
    localNK3.brn();
    localNK3.rV();
    localbqW1.rV();
    localbJJ1.rV();
    localanQ1.rV();
    localNK2.rV();
    czv localczv1 = new czv();
    localczv1.aJ();
    localczv1.setElementMap(localcpa);
    localczv1.setNonBlocking(true);
    localczv1.setStyle("giveUpFlag");
    localbiy1.bb(localczv1);
    localczv1.brn();
    localczv1.rV();
    localbiy1.rV();
    String str5 = "hideFightersButton";
    br localbr1 = new br();
    localbr1.aJ();
    localbr1.setElementMap(localcpa);
    if ((localcpa != null) && (str5 != null))
      localcpa.a(str5, localbr1);
    localbr1.setStyle("fightBar2");
    localbr1.setExpandable(false);
    csA localcsA2 = new csA();
    localcsA2.hg("wakfu.fightAction:hideFighters");
    localbr1.setOnClick(localcsA2);
    cCu localcCu2 = new cCu();
    localcCu2.hg("popup(descHideFightersPopup)");
    localbr1.setOnPopupDisplay(localcCu2);
    jL localjL2 = new jL();
    localjL2.hg("closePopup");
    localbr1.setOnPopupHide(localjL2);
    localbr1.setPrefSize(new Or(33, 35));
    localdRq1.bb(localbr1);
    localbr1.brn();
    NK localNK4 = NK.checkOut();
    localNK4.setElementMap(localcpa);
    localNK4.setAttribute("selected");
    localNK4.setName("gamePreferences");
    localNK4.setField("hideFightOccludersActivated");
    localbr1.bb(localNK4);
    localNK4.brn();
    localNK4.rV();
    NK localNK5 = NK.checkOut();
    localNK5.setElementMap(localcpa);
    localNK5.setAttribute("enabled");
    localNK5.setName("hideFightersDisabled");
    localbr1.bb(localNK5);
    localNK5.brn();
    anQ localanQ2 = new anQ();
    localanQ2.aJ();
    localanQ2.setElementMap(localcpa);
    localNK5.bb(localanQ2);
    localanQ2.brn();
    bqW localbqW2 = new bqW();
    localbqW2.aJ();
    localbqW2.setElementMap(localcpa);
    localanQ2.bb(localbqW2);
    localbqW2.brn();
    localbqW2.rV();
    localanQ2.rV();
    localNK5.rV();
    String str6 = "descHideFightersPopup";
    anG localanG2 = new anG();
    localanG2.aJ();
    localanG2.setElementMap(localcpa);
    if ((localcpa != null) && (str6 != null))
      localcpa.a(str6, localanG2);
    localanG2.setAlign(aFG.ech);
    localanG2.setHotSpotPosition(aFG.ecn);
    localbr1.bb(localanG2);
    localanG2.brn();
    dRq localdRq3 = dRq.checkOut();
    localdRq3.setElementMap(localcpa);
    localdRq3.setPrefSize(new Or(10, 0));
    localdRq3.setStyle("popup");
    localanG2.bb(localdRq3);
    localdRq3.brn();
    cba localcba2 = cba.checkOut();
    localcba2.setElementMap(localcpa);
    localcba2.setData(cFu.izR);
    localdRq3.bb(localcba2);
    localcba2.brn();
    localcba2.rV();
    caF localcaF7 = new caF();
    localcaF7.aJ();
    localcaF7.setElementMap(localcpa);
    localcaF7.setStyle("PopupInformation");
    String str7 = "%desc.hideFighters% (";
    str7 = str7.replace("%desc.hideFighters%", cBQ.cxL().mL("desc.hideFighters"));
    localcaF7.setText(str7);
    localdRq3.bb(localcaF7);
    localcaF7.brn();
    caF localcaF8 = localcaF7;
    Jg localJg4 = localcaF8.getAppearance();
    localJg4.setElementMap(localcpa);
    ((cwJ)localJg4).setAlignment(aFG.ecj);
    localcaF7.bb(localJg4);
    localJg4.brn();
    localJg4.rV();
    localcaF7.rV();
    caF localcaF9 = new caF();
    localcaF9.aJ();
    localcaF9.setElementMap(localcpa);
    localcaF9.setStyle("PopupInformation");
    localdRq3.bb(localcaF9);
    localcaF9.brn();
    caF localcaF10 = localcaF9;
    Jg localJg5 = localcaF10.getAppearance();
    localJg5.setElementMap(localcpa);
    ((cwJ)localJg5).setAlignment(aFG.ecj);
    localcaF9.bb(localJg5);
    localJg5.brn();
    localJg5.rV();
    NK localNK6 = NK.checkOut();
    localNK6.setElementMap(localcpa);
    localNK6.setAttribute("text");
    localNK6.setName("shortcutsList");
    localNK6.setField("fighterTransparency/key");
    localcaF9.bb(localNK6);
    localNK6.brn();
    localNK6.rV();
    localcaF9.rV();
    caF localcaF11 = new caF();
    localcaF11.aJ();
    localcaF11.setElementMap(localcpa);
    localcaF11.setStyle("PopupInformation");
    localcaF11.setText(")");
    localdRq3.bb(localcaF11);
    localcaF11.brn();
    caF localcaF12 = localcaF11;
    Jg localJg6 = localcaF12.getAppearance();
    localJg6.setElementMap(localcpa);
    ((cwJ)localJg6).setAlignment(aFG.ecj);
    localcaF11.bb(localJg6);
    localJg6.brn();
    localJg6.rV();
    localcaF11.rV();
    localdRq3.rV();
    localanG2.rV();
    czv localczv2 = new czv();
    localczv2.aJ();
    localczv2.setElementMap(localcpa);
    localczv2.setNonBlocking(true);
    localczv2.setStyle("invisibleGuy");
    localbr1.bb(localczv2);
    localczv2.brn();
    localczv2.rV();
    localbr1.rV();
    String str8 = "reportCellBtn";
    biy localbiy2 = new biy();
    localbiy2.aJ();
    localbiy2.setElementMap(localcpa);
    if ((localcpa != null) && (str8 != null))
      localcpa.a(str8, localbiy2);
    localbiy2.setStyle("fightBar2");
    localbiy2.setExpandable(false);
    csA localcsA3 = new csA();
    localcsA3.hg("wakfu.fightAction:reportCell(reportCellBtn)");
    localbiy2.setOnClick(localcsA3);
    cCu localcCu3 = new cCu();
    localcCu3.hg("popup(descReportCellPopup)");
    localbiy2.setOnPopupDisplay(localcCu3);
    jL localjL3 = new jL();
    localjL3.hg("closePopup");
    localbiy2.setOnPopupHide(localjL3);
    localbiy2.setPrefSize(new Or(33, 35));
    localdRq1.bb(localbiy2);
    localbiy2.brn();
    NK localNK7 = NK.checkOut();
    localNK7.setElementMap(localcpa);
    localNK7.setAttribute("enabled");
    localNK7.setName("cellReportDisabled");
    localbiy2.bb(localNK7);
    localNK7.brn();
    anQ localanQ3 = new anQ();
    localanQ3.aJ();
    localanQ3.setElementMap(localcpa);
    localNK7.bb(localanQ3);
    localanQ3.brn();
    bqW localbqW3 = new bqW();
    localbqW3.aJ();
    localbqW3.setElementMap(localcpa);
    localanQ3.bb(localbqW3);
    localbqW3.brn();
    localbqW3.rV();
    localanQ3.rV();
    localNK7.rV();
    String str9 = "descReportCellPopup";
    anG localanG3 = new anG();
    localanG3.aJ();
    localanG3.setElementMap(localcpa);
    if ((localcpa != null) && (str9 != null))
      localcpa.a(str9, localanG3);
    localanG3.setAlign(aFG.ech);
    localanG3.setHotSpotPosition(aFG.ecn);
    localbiy2.bb(localanG3);
    localanG3.brn();
    dRq localdRq4 = dRq.checkOut();
    localdRq4.setElementMap(localcpa);
    localdRq4.setPrefSize(new Or(10, 0));
    localdRq4.setStyle("popup");
    localanG3.bb(localdRq4);
    localdRq4.brn();
    cba localcba3 = cba.checkOut();
    localcba3.setElementMap(localcpa);
    localcba3.setData(cFu.izR);
    localdRq4.bb(localcba3);
    localcba3.brn();
    localcba3.rV();
    caF localcaF13 = new caF();
    localcaF13.aJ();
    localcaF13.setElementMap(localcpa);
    localcaF13.setStyle("PopupInformation");
    String str10 = "%desc.reportCell% (";
    str10 = str10.replace("%desc.reportCell%", cBQ.cxL().mL("desc.reportCell"));
    localcaF13.setText(str10);
    localdRq4.bb(localcaF13);
    localcaF13.brn();
    caF localcaF14 = localcaF13;
    Jg localJg7 = localcaF14.getAppearance();
    localJg7.setElementMap(localcpa);
    ((cwJ)localJg7).setAlignment(aFG.ecj);
    localcaF13.bb(localJg7);
    localJg7.brn();
    localJg7.rV();
    localcaF13.rV();
    caF localcaF15 = new caF();
    localcaF15.aJ();
    localcaF15.setElementMap(localcpa);
    localcaF15.setStyle("PopupInformation");
    localdRq4.bb(localcaF15);
    localcaF15.brn();
    caF localcaF16 = localcaF15;
    Jg localJg8 = localcaF16.getAppearance();
    localJg8.setElementMap(localcpa);
    ((cwJ)localJg8).setAlignment(aFG.ecj);
    localcaF15.bb(localJg8);
    localJg8.brn();
    localJg8.rV();
    NK localNK8 = NK.checkOut();
    localNK8.setElementMap(localcpa);
    localNK8.setAttribute("text");
    localNK8.setName("shortcutsList");
    localNK8.setField("reportCell/key");
    localcaF15.bb(localNK8);
    localNK8.brn();
    localNK8.rV();
    localcaF15.rV();
    caF localcaF17 = new caF();
    localcaF17.aJ();
    localcaF17.setElementMap(localcpa);
    localcaF17.setStyle("PopupInformation");
    localcaF17.setText(")");
    localdRq4.bb(localcaF17);
    localcaF17.brn();
    caF localcaF18 = localcaF17;
    Jg localJg9 = localcaF18.getAppearance();
    localJg9.setElementMap(localcpa);
    ((cwJ)localJg9).setAlignment(aFG.ecj);
    localcaF17.bb(localJg9);
    localJg9.brn();
    localJg9.rV();
    localcaF17.rV();
    localdRq4.rV();
    localanG3.rV();
    czv localczv3 = new czv();
    localczv3.aJ();
    localczv3.setElementMap(localcpa);
    localczv3.setNonBlocking(true);
    localczv3.setStyle("showTile");
    localbiy2.bb(localczv3);
    localczv3.brn();
    localczv3.rV();
    localbiy2.rV();
    String str11 = "lockFightBtn";
    br localbr2 = new br();
    localbr2.aJ();
    localbr2.setElementMap(localcpa);
    if ((localcpa != null) && (str11 != null))
      localcpa.a(str11, localbr2);
    localbr2.setStyle("fightBar2");
    localbr2.setExpandable(false);
    adV localadV = new adV();
    localadV.hg("wakfu.fightCreationOrPlacement:lockFight(lockFightBtn)");
    localbr2.setOnMouseRelease(localadV);
    cCu localcCu4 = new cCu();
    localcCu4.hg("popup(descPadLocksPopup)");
    localbr2.setOnPopupDisplay(localcCu4);
    jL localjL4 = new jL();
    localjL4.hg("closePopup");
    localbr2.setOnPopupHide(localjL4);
    localbr2.setPrefSize(new Or(33, 35));
    localdRq1.bb(localbr2);
    localbr2.brn();
    NK localNK9 = NK.checkOut();
    localNK9.setElementMap(localcpa);
    localNK9.setAttribute("selected");
    localNK9.setName("currentFightLocked");
    localbr2.bb(localNK9);
    localNK9.brn();
    localNK9.rV();
    NK localNK10 = NK.checkOut();
    localNK10.setElementMap(localcpa);
    localNK10.setAttribute("enabled");
    localNK10.setName("isInFightCreationOrPlacement");
    localbr2.bb(localNK10);
    localNK10.brn();
    anQ localanQ4 = new anQ();
    localanQ4.aJ();
    localanQ4.setElementMap(localcpa);
    localNK10.bb(localanQ4);
    localanQ4.brn();
    bJJ localbJJ2 = new bJJ();
    localbJJ2.aJ();
    localbJJ2.setElementMap(localcpa);
    localanQ4.bb(localbJJ2);
    localbJJ2.brn();
    cOk localcOk2 = new cOk();
    localcOk2.aJ();
    localcOk2.setElementMap(localcpa);
    localbJJ2.bb(localcOk2);
    localcOk2.brn();
    localcOk2.rV();
    bqW localbqW4 = new bqW();
    localbqW4.aJ();
    localbqW4.setElementMap(localcpa);
    localbJJ2.bb(localbqW4);
    localbqW4.brn();
    NK localNK11 = NK.checkOut();
    localNK11.setElementMap(localcpa);
    localNK11.setAttribute("comparedValue");
    localNK11.setName("lockFightDisabled");
    localbqW4.bb(localNK11);
    localNK11.brn();
    localNK11.rV();
    localbqW4.rV();
    localbJJ2.rV();
    localanQ4.rV();
    localNK10.rV();
    a(localbr2);
    b(localbr2);
    localbr2.rV();
    d(localdRq1);
    e(localdRq1);
    f(localdRq1);
    localdRq1.rV();
    localdqa.rV();
    localbpn.rV();
    return localbpn;
  }

  public bdj a(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    String str1 = "descPadLocksPopup";
    anG localanG = new anG();
    localanG.aJ();
    localanG.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localanG);
    localanG.setAlign(aFG.ech);
    localanG.setHotSpotPosition(aFG.ecn);
    parambdj.bb(localanG);
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
    localdRq.bb(localcaF1);
    localcaF1.brn();
    caF localcaF2 = localcaF1;
    Jg localJg1 = localcaF2.getAppearance();
    localJg1.setElementMap(localcpa);
    ((cwJ)localJg1).setAlignment(aFG.ecj);
    localcaF1.bb(localJg1);
    localJg1.brn();
    localJg1.rV();
    NK localNK1 = NK.checkOut();
    localNK1.setElementMap(localcpa);
    localNK1.setAttribute("text");
    localNK1.setName("currentFightLocked");
    localcaF1.bb(localNK1);
    localNK1.brn();
    anQ localanQ = new anQ();
    localanQ.aJ();
    localanQ.setElementMap(localcpa);
    String str2 = "%desc.unlockFight% (";
    str2 = str2.replace("%desc.unlockFight%", cBQ.cxL().mL("desc.unlockFight"));
    localanQ.setValue(str2);
    String str3 = "%desc.lockFight% (";
    str3 = str3.replace("%desc.lockFight%", cBQ.cxL().mL("desc.lockFight"));
    localanQ.setElseValue(str3);
    localNK1.bb(localanQ);
    localanQ.brn();
    cOk localcOk = new cOk();
    localcOk.aJ();
    localcOk.setElementMap(localcpa);
    localanQ.bb(localcOk);
    localcOk.brn();
    localcOk.rV();
    localanQ.rV();
    localNK1.rV();
    localcaF1.rV();
    caF localcaF3 = new caF();
    localcaF3.aJ();
    localcaF3.setElementMap(localcpa);
    localcaF3.setStyle("PopupInformation");
    localdRq.bb(localcaF3);
    localcaF3.brn();
    caF localcaF4 = localcaF3;
    Jg localJg2 = localcaF4.getAppearance();
    localJg2.setElementMap(localcpa);
    ((cwJ)localJg2).setAlignment(aFG.ecj);
    localcaF3.bb(localJg2);
    localJg2.brn();
    localJg2.rV();
    NK localNK2 = NK.checkOut();
    localNK2.setElementMap(localcpa);
    localNK2.setAttribute("text");
    localNK2.setName("shortcutsList");
    localNK2.setField("lockFight/key");
    localcaF3.bb(localNK2);
    localNK2.brn();
    localNK2.rV();
    localcaF3.rV();
    caF localcaF5 = new caF();
    localcaF5.aJ();
    localcaF5.setElementMap(localcpa);
    localcaF5.setStyle("PopupInformation");
    localcaF5.setText(")");
    localdRq.bb(localcaF5);
    localcaF5.brn();
    caF localcaF6 = localcaF5;
    Jg localJg3 = localcaF6.getAppearance();
    localJg3.setElementMap(localcpa);
    ((cwJ)localJg3).setAlignment(aFG.ecj);
    localcaF5.bb(localJg3);
    localJg3.brn();
    localJg3.rV();
    localcaF5.rV();
    localdRq.rV();
    localanG.rV();
    return localanG;
  }

  public bdj b(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    czv localczv = new czv();
    localczv.aJ();
    localczv.setElementMap(localcpa);
    localczv.setNonBlocking(true);
    localczv.setStyle("lock");
    parambdj.bb(localczv);
    localczv.brn();
    localczv.rV();
    return localczv;
  }

  public bdj d(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    String str1 = "callHelpBtn";
    biy localbiy = new biy();
    localbiy.aJ();
    localbiy.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localbiy);
    localbiy.setStyle("fightBar2");
    localbiy.setExpandable(false);
    csA localcsA = new csA();
    localcsA.hg("wakfu.fightAction:callHelp(callHelpBtn)");
    localbiy.setOnClick(localcsA);
    cCu localcCu = new cCu();
    localcCu.hg("popup(descCallHelpPopup)");
    localbiy.setOnPopupDisplay(localcCu);
    jL localjL = new jL();
    localjL.hg("closePopup");
    localbiy.setOnPopupHide(localjL);
    localbiy.setPrefSize(new Or(33, 35));
    parambdj.bb(localbiy);
    localbiy.brn();
    NK localNK1 = NK.checkOut();
    localNK1.setElementMap(localcpa);
    localNK1.setAttribute("enabled");
    localNK1.setName("isInFightCreationOrPlacement");
    localbiy.bb(localNK1);
    localNK1.brn();
    anQ localanQ = new anQ();
    localanQ.aJ();
    localanQ.setElementMap(localcpa);
    localNK1.bb(localanQ);
    localanQ.brn();
    bJJ localbJJ = new bJJ();
    localbJJ.aJ();
    localbJJ.setElementMap(localcpa);
    localanQ.bb(localbJJ);
    localbJJ.brn();
    cOk localcOk = new cOk();
    localcOk.aJ();
    localcOk.setElementMap(localcpa);
    localbJJ.bb(localcOk);
    localcOk.brn();
    localcOk.rV();
    bqW localbqW = new bqW();
    localbqW.aJ();
    localbqW.setElementMap(localcpa);
    localbJJ.bb(localbqW);
    localbqW.brn();
    NK localNK2 = NK.checkOut();
    localNK2.setElementMap(localcpa);
    localNK2.setAttribute("comparedValue");
    localNK2.setName("callHelpDisabled");
    localbqW.bb(localNK2);
    localNK2.brn();
    localNK2.rV();
    localbqW.rV();
    localbJJ.rV();
    localanQ.rV();
    localNK1.rV();
    String str2 = "descCallHelpPopup";
    anG localanG = new anG();
    localanG.aJ();
    localanG.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localanG);
    localanG.setAlign(aFG.ech);
    localanG.setHotSpotPosition(aFG.ecn);
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
    String str3 = "%desc.callHelp% (";
    str3 = str3.replace("%desc.callHelp%", cBQ.cxL().mL("desc.callHelp"));
    localcaF1.setText(str3);
    localdRq.bb(localcaF1);
    localcaF1.brn();
    caF localcaF2 = localcaF1;
    Jg localJg1 = localcaF2.getAppearance();
    localJg1.setElementMap(localcpa);
    ((cwJ)localJg1).setAlignment(aFG.ecj);
    localcaF1.bb(localJg1);
    localJg1.brn();
    localJg1.rV();
    localcaF1.rV();
    caF localcaF3 = new caF();
    localcaF3.aJ();
    localcaF3.setElementMap(localcpa);
    localcaF3.setStyle("PopupInformation");
    localdRq.bb(localcaF3);
    localcaF3.brn();
    caF localcaF4 = localcaF3;
    Jg localJg2 = localcaF4.getAppearance();
    localJg2.setElementMap(localcpa);
    ((cwJ)localJg2).setAlignment(aFG.ecj);
    localcaF3.bb(localJg2);
    localJg2.brn();
    localJg2.rV();
    NK localNK3 = NK.checkOut();
    localNK3.setElementMap(localcpa);
    localNK3.setAttribute("text");
    localNK3.setName("shortcutsList");
    localNK3.setField("callHelp/key");
    localcaF3.bb(localNK3);
    localNK3.brn();
    localNK3.rV();
    localcaF3.rV();
    caF localcaF5 = new caF();
    localcaF5.aJ();
    localcaF5.setElementMap(localcpa);
    localcaF5.setStyle("PopupInformation");
    localcaF5.setText(")");
    localdRq.bb(localcaF5);
    localcaF5.brn();
    caF localcaF6 = localcaF5;
    Jg localJg3 = localcaF6.getAppearance();
    localJg3.setElementMap(localcpa);
    ((cwJ)localJg3).setAlignment(aFG.ecj);
    localcaF5.bb(localJg3);
    localJg3.brn();
    localJg3.rV();
    localcaF5.rV();
    localdRq.rV();
    localanG.rV();
    czv localczv = new czv();
    localczv.aJ();
    localczv.setElementMap(localcpa);
    localczv.setNonBlocking(true);
    localczv.setStyle("exclamationMark");
    localbiy.bb(localczv);
    localczv.brn();
    localczv.rV();
    localbiy.rV();
    return localbiy;
  }

  public bdj e(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    dOc localdOc = (dOc)parambdj;
    Jg localJg = localdOc.getAppearance();
    localJg.setElementMap(localcpa);
    parambdj.bb(localJg);
    localJg.brn();
    cuR localcuR = new cuR();
    localcuR.aJ();
    localcuR.setElementMap(localcpa);
    localcuR.setInsets(new Insets(10, 7, 10, 7));
    localJg.bb(localcuR);
    localcuR.brn();
    localcuR.rV();
    localJg.rV();
    return localJg;
  }

  public bdj f(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    aId localaId = aId.checkOut();
    localaId.setHorizontal(false);
    localaId.setAlign(aFG.ech);
    parambdj.bb(localaId);
    localaId.brn();
    localaId.rV();
    return null;
  }
}