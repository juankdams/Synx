import java.awt.Insets;
import java.util.Stack;

public class aKM
  implements cEa
{
  private Stack X = new Stack();
  private cDA Y;

  public bdj a(cDA paramcDA, cpa paramcpa)
  {
    this.Y = paramcDA;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    bpn localbpn = new bpn();
    localbpn.aJ();
    localbpn.setElementMap(localcpa);
    localbpn.brn();
    cwP localcwP1 = new cwP();
    localcwP1.aJ();
    localcwP1.setElementMap(localcpa);
    localcwP1.setSize(new Or(-2, -2));
    localcwP1.setAlign(ajb.dhY);
    localcwP1.setXOffset(20);
    localcwP1.setInitValue(true);
    localbpn.bb(localcwP1);
    localcwP1.brn();
    localcwP1.rV();
    dqa localdqa = new dqa();
    localdqa.aJ();
    localdqa.setElementMap(localcpa);
    localbpn.bb(localdqa);
    localdqa.brn();
    czO localczO1 = new czO();
    localczO1.aJ();
    localczO1.setAdaptToContentSize(true);
    localdqa.bb(localczO1);
    localczO1.brn();
    localczO1.rV();
    dRq localdRq1 = dRq.checkOut();
    localdRq1.setElementMap(localcpa);
    localdRq1.setStyle("tiledScroll");
    localdqa.bb(localdRq1);
    localdRq1.brn();
    aId localaId1 = aId.checkOut();
    localaId1.setHorizontal(false);
    localdRq1.bb(localaId1);
    localaId1.brn();
    localaId1.rV();
    dRq localdRq2 = localdRq1;
    Jg localJg1 = localdRq2.getAppearance();
    localJg1.setElementMap(localcpa);
    localdRq1.bb(localJg1);
    localJg1.brn();
    bmv localbmv1 = bmv.checkOut();
    localbmv1.setElementMap(localcpa);
    localbmv1.setInsets(new Insets(65, 10, 65, 10));
    localJg1.bb(localbmv1);
    localbmv1.brn();
    localbmv1.rV();
    cuR localcuR = new cuR();
    localcuR.aJ();
    localcuR.setElementMap(localcpa);
    localcuR.setInsets(new Insets(30, 15, 30, 15));
    localJg1.bb(localcuR);
    localcuR.brn();
    localcuR.rV();
    localJg1.rV();
    cwP localcwP2 = new cwP();
    localcwP2.aJ();
    localcwP2.setElementMap(localcpa);
    localcwP2.setSize(new Or(100.0F, 100.0F));
    localdRq1.bb(localcwP2);
    localcwP2.brn();
    localcwP2.rV();
    dRq localdRq3 = dRq.checkOut();
    localdRq3.setElementMap(localcpa);
    localdRq1.bb(localdRq3);
    localdRq3.brn();
    dRq localdRq4 = localdRq3;
    Jg localJg2 = localdRq4.getAppearance();
    localJg2.setElementMap(localcpa);
    localdRq3.bb(localJg2);
    localJg2.brn();
    bmv localbmv2 = bmv.checkOut();
    localbmv2.setElementMap(localcpa);
    localbmv2.setInsets(new Insets(0, 0, 5, 0));
    localJg2.bb(localbmv2);
    localbmv2.brn();
    localbmv2.rV();
    localJg2.rV();
    aId localaId2 = aId.checkOut();
    localaId2.setAlign(aFG.eck);
    localdRq3.bb(localaId2);
    localaId2.brn();
    localaId2.rV();
    biy localbiy1 = new biy();
    localbiy1.aJ();
    localbiy1.setElementMap(localcpa);
    localbiy1.setStyle("yellowLeftArrow");
    csA localcsA1 = new csA();
    localcsA1.hg("wakfu.krosmozCollection:previousSeason");
    localbiy1.setOnClick(localcsA1);
    localbiy1.setExpandable(false);
    localdRq3.bb(localbiy1);
    localbiy1.brn();
    biy localbiy2 = localbiy1;
    Jg localJg3 = localbiy2.getAppearance();
    localJg3.setElementMap(localcpa);
    localbiy1.bb(localJg3);
    localJg3.brn();
    bmv localbmv3 = bmv.checkOut();
    localbmv3.setElementMap(localcpa);
    localbmv3.setInsets(new Insets(1, 0, 0, 5));
    localJg3.bb(localbmv3);
    localbmv3.brn();
    localbmv3.rV();
    localJg3.rV();
    localbiy1.rV();
    cWk localcWk1 = new cWk();
    localcWk1.aJ();
    localcWk1.setElementMap(localcpa);
    localcWk1.setStyle("styledBoldDark12");
    localcWk1.setExpandable(false);
    localdRq3.bb(localcWk1);
    localcWk1.brn();
    NK localNK1 = NK.checkOut();
    localNK1.setElementMap(localcpa);
    localNK1.setName("krosmozCollection");
    localNK1.setAttribute("text");
    localNK1.setField("currentSeason/name");
    localcWk1.bb(localNK1);
    localNK1.brn();
    localNK1.rV();
    localcWk1.rV();
    biy localbiy3 = new biy();
    localbiy3.aJ();
    localbiy3.setElementMap(localcpa);
    localbiy3.setStyle("yellowRightArrow");
    csA localcsA2 = new csA();
    localcsA2.hg("wakfu.krosmozCollection:nextSeason");
    localbiy3.setOnClick(localcsA2);
    localbiy3.setExpandable(false);
    localdRq3.bb(localbiy3);
    localbiy3.brn();
    biy localbiy4 = localbiy3;
    Jg localJg4 = localbiy4.getAppearance();
    localJg4.setElementMap(localcpa);
    localbiy3.bb(localJg4);
    localJg4.brn();
    bmv localbmv4 = bmv.checkOut();
    localbmv4.setElementMap(localcpa);
    localbmv4.setInsets(new Insets(1, 5, 0, 0));
    localJg4.bb(localbmv4);
    localbmv4.brn();
    localbmv4.rV();
    localJg4.rV();
    localbiy3.rV();
    localdRq3.rV();
    String str1 = "itemList";
    ccG localccG = new ccG();
    localccG.aJ();
    localccG.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localccG);
    localccG.setCellSize(new Or(40, 40));
    localccG.setScrollBar(false);
    localccG.setHorizontal(false);
    localccG.setAutoIdealSize(true);
    localccG.setPrefSize(new Or(200, 0));
    localccG.setIdealSizeMaxColumns(8);
    localccG.setIdealSizeMinColumns(8);
    localccG.setSelectionTogglable(false);
    localccG.setExpandable(false);
    localdRq1.bb(localccG);
    localccG.brn();
    dpm localdpm1 = new dpm();
    localdpm1.aJ();
    localdpm1.setElementMap(localcpa);
    localdpm1.setAlign(aFG.eck);
    localccG.bb(localdpm1);
    localdpm1.brn();
    localdpm1.rV();
    NK localNK2 = NK.checkOut();
    localNK2.setElementMap(localcpa);
    localNK2.setName("krosmozCollection");
    localNK2.setAttribute("content");
    localNK2.setField("currentSeason/figures");
    localccG.bb(localNK2);
    localNK2.brn();
    localNK2.rV();
    eR localeR = new eR();
    localeR.aJ();
    localeR.setElementMap(localcpa);
    bpP localbpP = new bpP();
    localbpP.hg("wakfu.krosmozCollection:deleteFigure");
    localeR.setOnItemDoubleClick(localbpP);
    localccG.bb(localeR);
    localeR.brn();
    anQ localanQ1 = new anQ();
    localanQ1.aJ();
    localanQ1.setElementMap(localcpa);
    localeR.bb(localanQ1);
    localanQ1.brn();
    bxx localbxx = new bxx();
    localbxx.aJ();
    localbxx.setElementMap(localcpa);
    localanQ1.bb(localbxx);
    localbxx.brn();
    anE localanE = new anE();
    localanE.aJ();
    localanE.setElementMap(localcpa);
    localbxx.bb(localanE);
    localanE.brn();
    localanE.rV();
    localbxx.rV();
    localanQ1.rV();
    dRq localdRq5 = dRq.checkOut();
    localdRq5.setElementMap(localcpa);
    localeR.bb(localdRq5);
    localdRq5.brn();
    czO localczO2 = new czO();
    localczO2.aJ();
    localdRq5.bb(localczO2);
    localczO2.brn();
    localczO2.rV();
    czv localczv1 = new czv();
    localczv1.aJ();
    localczv1.setElementMap(localcpa);
    localczv1.setStyle("IconEmptyEmote");
    localczv1.setDisplaySize(new Or(36, 36));
    localdRq5.bb(localczv1);
    localczv1.brn();
    cwP localcwP3 = new cwP();
    localcwP3.aJ();
    localcwP3.setElementMap(localcpa);
    localcwP3.setSize(new Or(-2, -2));
    localcwP3.setAlign(ajb.dhZ);
    localczv1.bb(localcwP3);
    localcwP3.brn();
    localcwP3.rV();
    aaE localaaE1 = new aaE();
    localaaE1.aJ();
    localaaE1.setElementMap(localcpa);
    localaaE1.setAttribute("visible");
    localaaE1.setField("size");
    localczv1.bb(localaaE1);
    localaaE1.brn();
    anQ localanQ2 = new anQ();
    localanQ2.aJ();
    localanQ2.setElementMap(localcpa);
    localaaE1.bb(localanQ2);
    localanQ2.brn();
    jA localjA1 = new jA();
    localjA1.aJ();
    localjA1.setElementMap(localcpa);
    localjA1.setValue("0");
    localanQ2.bb(localjA1);
    localjA1.brn();
    localjA1.rV();
    localanQ2.rV();
    localaaE1.rV();
    localczv1.rV();
    czv localczv2 = new czv();
    localczv2.aJ();
    localczv2.setElementMap(localcpa);
    localczv2.setStyle("iconUnknownEmote");
    localczv2.setDisplaySize(new Or(36, 36));
    localdRq5.bb(localczv2);
    localczv2.brn();
    czv localczv3 = localczv2;
    Jg localJg5 = localczv3.getAppearance();
    localJg5.setElementMap(localcpa);
    localJg5.setModulationColor(new bNa(1.0F, 1.0F, 1.0F, 0.5F));
    localczv2.bb(localJg5);
    localJg5.brn();
    localJg5.rV();
    cwP localcwP4 = new cwP();
    localcwP4.aJ();
    localcwP4.setElementMap(localcpa);
    localcwP4.setSize(new Or(-2, -2));
    localcwP4.setAlign(ajb.dhZ);
    localczv2.bb(localcwP4);
    localcwP4.brn();
    localcwP4.rV();
    aaE localaaE2 = new aaE();
    localaaE2.aJ();
    localaaE2.setElementMap(localcpa);
    localaaE2.setAttribute("visible");
    localaaE2.setField("size");
    localczv2.bb(localaaE2);
    localaaE2.brn();
    anQ localanQ3 = new anQ();
    localanQ3.aJ();
    localanQ3.setElementMap(localcpa);
    localaaE2.bb(localanQ3);
    localanQ3.brn();
    bSP localbSP = new bSP();
    localbSP.aJ();
    localbSP.setElementMap(localcpa);
    localbSP.setValue("0");
    localanQ3.bb(localbSP);
    localbSP.brn();
    localbSP.rV();
    localanQ3.rV();
    localaaE2.rV();
    localczv2.rV();
    String str2 = "itemContainer";
    dRq localdRq6 = dRq.checkOut();
    localdRq6.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localdRq6);
    localdRq6.setNonBlocking(false);
    cCu localcCu = new cCu();
    localcCu.hg("popup(figurePopup)");
    localdRq6.setOnPopupDisplay(localcCu);
    jL localjL = new jL();
    localjL.hg("closePopup");
    localdRq6.setOnPopupHide(localjL);
    localdRq5.bb(localdRq6);
    localdRq6.brn();
    aaE localaaE3 = new aaE();
    localaaE3.aJ();
    localaaE3.setElementMap(localcpa);
    localaaE3.setAttribute("visible");
    localaaE3.setField("size");
    localdRq6.bb(localaaE3);
    localaaE3.brn();
    anQ localanQ4 = new anQ();
    localanQ4.aJ();
    localanQ4.setElementMap(localcpa);
    localaaE3.bb(localanQ4);
    localanQ4.brn();
    jA localjA2 = new jA();
    localjA2.aJ();
    localjA2.setElementMap(localcpa);
    localjA2.setValue("0");
    localanQ4.bb(localjA2);
    localjA2.brn();
    localjA2.rV();
    localanQ4.rV();
    localaaE3.rV();
    String str3 = "figurePopup";
    anG localanG = new anG();
    localanG.aJ();
    localanG.setElementMap(localcpa);
    if ((localcpa != null) && (str3 != null))
      localcpa.a(str3, localanG);
    localanG.setAlign(aFG.ech);
    localanG.setHotSpotPosition(aFG.ecn);
    localdRq6.bb(localanG);
    localanG.brn();
    dRq localdRq7 = dRq.checkOut();
    localdRq7.setElementMap(localcpa);
    localdRq7.setStyle("popup");
    localanG.bb(localdRq7);
    localdRq7.brn();
    czv localczv4 = new czv();
    localczv4.aJ();
    localczv4.setElementMap(localcpa);
    localdRq7.bb(localczv4);
    localczv4.brn();
    dpm localdpm2 = new dpm();
    localdpm2.aJ();
    localdpm2.setElementMap(localcpa);
    localdpm2.setAlign(aFG.ech);
    localczv4.bb(localdpm2);
    localdpm2.brn();
    localdpm2.rV();
    aAR localaAR1 = aAR.checkOut();
    localaAR1.setElementMap(localcpa);
    localczv4.bb(localaAR1);
    localaAR1.brn();
    aaE localaaE4 = new aaE();
    localaaE4.aJ();
    localaaE4.setElementMap(localcpa);
    localaaE4.setAttribute("texture");
    localaaE4.setField("iconUrl");
    localaAR1.bb(localaaE4);
    localaaE4.brn();
    localaaE4.rV();
    localaAR1.rV();
    localczv4.rV();
    dRq localdRq8 = dRq.checkOut();
    localdRq8.setElementMap(localcpa);
    localdRq7.bb(localdRq8);
    localdRq8.brn();
    dpm localdpm3 = new dpm();
    localdpm3.aJ();
    localdpm3.setElementMap(localcpa);
    localdpm3.setAlign(aFG.ech);
    localdRq8.bb(localdpm3);
    localdpm3.brn();
    localdpm3.rV();
    aId localaId3 = aId.checkOut();
    localaId3.setHorizontal(false);
    localdRq8.bb(localaId3);
    localaId3.brn();
    localaId3.rV();
    cWk localcWk2 = new cWk();
    localcWk2.aJ();
    localcWk2.setElementMap(localcpa);
    localcWk2.setStyle("styledBoldWhite12");
    localcWk2.setMinWidth(1);
    localcWk2.setMaxWidth(250);
    localcWk2.setExpandable(false);
    localdRq8.bb(localcWk2);
    localcWk2.brn();
    aaE localaaE5 = new aaE();
    localaaE5.aJ();
    localaaE5.setElementMap(localcpa);
    localaaE5.setAttribute("text");
    localaaE5.setField("name");
    localcWk2.bb(localaaE5);
    localaaE5.brn();
    localaaE5.rV();
    cWk localcWk3 = localcWk2;
    Jg localJg6 = localcWk3.getAppearance();
    localJg6.setElementMap(localcpa);
    localcWk2.bb(localJg6);
    localJg6.brn();
    cAf localcAf1 = cAf.checkOut();
    localcAf1.setElementMap(localcpa);
    localcAf1.setColor(new bNa(1.0F, 0.78F, 0.15F, 1.0F));
    localJg6.bb(localcAf1);
    localcAf1.brn();
    localcAf1.rV();
    localJg6.rV();
    localcWk2.rV();
    cWk localcWk4 = new cWk();
    localcWk4.aJ();
    localcWk4.setElementMap(localcpa);
    localcWk4.setStyle("bold");
    localcWk4.setMinWidth(1);
    localcWk4.setMaxWidth(250);
    localcWk4.setExpandable(false);
    localdRq8.bb(localcWk4);
    localcWk4.brn();
    aaE localaaE6 = new aaE();
    localaaE6.aJ();
    localaaE6.setElementMap(localcpa);
    localaaE6.setAttribute("text");
    localaaE6.setField("description");
    localcWk4.bb(localaaE6);
    localaaE6.brn();
    localaaE6.rV();
    cWk localcWk5 = localcWk4;
    Jg localJg7 = localcWk5.getAppearance();
    localJg7.setElementMap(localcpa);
    localcWk4.bb(localJg7);
    localJg7.brn();
    cAf localcAf2 = cAf.checkOut();
    localcAf2.setElementMap(localcpa);
    localcAf2.setColor(new bNa(0.94F, 0.86F, 0.66F, 1.0F));
    localJg7.bb(localcAf2);
    localcAf2.brn();
    localcAf2.rV();
    localJg7.rV();
    localcWk4.rV();
    localdRq8.rV();
    localdRq7.rV();
    localanG.rV();
    cwP localcwP5 = new cwP();
    localcwP5.aJ();
    localcwP5.setElementMap(localcpa);
    localcwP5.setAlign(ajb.dhZ);
    localcwP5.setSize(new Or(43, 43));
    localdRq6.bb(localcwP5);
    localcwP5.brn();
    localcwP5.rV();
    czO localczO3 = new czO();
    localczO3.aJ();
    localdRq6.bb(localczO3);
    localczO3.brn();
    localczO3.rV();
    czv localczv5 = new czv();
    localczv5.aJ();
    localczv5.setElementMap(localcpa);
    localczv5.setNonBlocking(true);
    localczv5.setDisplaySize(new Or(32, 32));
    localdRq6.bb(localczv5);
    localczv5.brn();
    cwP localcwP6 = new cwP();
    localcwP6.aJ();
    localcwP6.setElementMap(localcpa);
    localcwP6.setAlign(ajb.dhZ);
    localczv5.bb(localcwP6);
    localcwP6.brn();
    localcwP6.rV();
    aAR localaAR2 = aAR.checkOut();
    localaAR2.setElementMap(localcpa);
    localczv5.bb(localaAR2);
    localaAR2.brn();
    aaE localaaE7 = new aaE();
    localaaE7.aJ();
    localaaE7.setElementMap(localcpa);
    localaaE7.setAttribute("texture");
    localaaE7.setField("iconUrl");
    localaAR2.bb(localaaE7);
    localaaE7.brn();
    localaaE7.rV();
    localaAR2.rV();
    localczv5.rV();
    caF localcaF = new caF();
    localcaF.aJ();
    localcaF.setElementMap(localcpa);
    localcaF.setNonBlocking(true);
    localcaF.setStyle("White10Bordered");
    localdRq6.bb(localcaF);
    localcaF.brn();
    cwP localcwP7 = new cwP();
    localcwP7.aJ();
    localcwP7.setElementMap(localcpa);
    localcwP7.setAlign(ajb.did);
    localcaF.bb(localcwP7);
    localcwP7.brn();
    localcwP7.rV();
    a(localcaF);
    b(localcaF);
    localcaF.rV();
    localdRq6.rV();
    localdRq5.rV();
    localeR.rV();
    d(localccG);
    localccG.rV();
    localdRq1.rV();
    e(localdqa);
    f(localdqa);
    g(localdqa);
    localdqa.rV();
    localbpn.rV();
    return localbpn;
  }

  public bdj a(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    dOc localdOc = (dOc)parambdj;
    Jg localJg = localdOc.getAppearance();
    localJg.setElementMap(localcpa);
    parambdj.bb(localJg);
    localJg.brn();
    bmv localbmv = bmv.checkOut();
    localbmv.setElementMap(localcpa);
    localbmv.setInsets(new Insets(0, 6, 6, 0));
    localJg.bb(localbmv);
    localbmv.brn();
    localbmv.rV();
    localJg.rV();
    return localJg;
  }

  public bdj b(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    aaE localaaE = new aaE();
    localaaE.aJ();
    localaaE.setElementMap(localcpa);
    localaaE.setAttribute("text");
    localaaE.setField("size");
    parambdj.bb(localaaE);
    localaaE.brn();
    localaaE.rV();
    return localaaE;
  }

  public bdj d(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    eR localeR = new eR();
    localeR.aJ();
    localeR.setElementMap(localcpa);
    parambdj.bb(localeR);
    localeR.brn();
    anQ localanQ = new anQ();
    localanQ.aJ();
    localanQ.setElementMap(localcpa);
    localeR.bb(localanQ);
    localanQ.brn();
    bxx localbxx = new bxx();
    localbxx.aJ();
    localbxx.setElementMap(localcpa);
    localanQ.bb(localbxx);
    localbxx.brn();
    aIB localaIB = new aIB();
    localaIB.aJ();
    localaIB.setElementMap(localcpa);
    localbxx.bb(localaIB);
    localaIB.brn();
    localaIB.rV();
    localbxx.rV();
    localanQ.rV();
    dRq localdRq = dRq.checkOut();
    localdRq.setElementMap(localcpa);
    localeR.bb(localdRq);
    localdRq.brn();
    czO localczO = new czO();
    localczO.aJ();
    localdRq.bb(localczO);
    localczO.brn();
    localczO.rV();
    czv localczv1 = new czv();
    localczv1.aJ();
    localczv1.setElementMap(localcpa);
    localczv1.setStyle("IconEmptyEmote");
    localczv1.setDisplaySize(new Or(36, 36));
    localdRq.bb(localczv1);
    localczv1.brn();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setElementMap(localcpa);
    localcwP.setSize(new Or(-2, -2));
    localcwP.setAlign(ajb.dhZ);
    localczv1.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    czv localczv2 = localczv1;
    Jg localJg = localczv2.getAppearance();
    localJg.setElementMap(localcpa);
    localJg.setModulationColor(new bNa(1.0F, 1.0F, 1.0F, 0.3F));
    localczv1.bb(localJg);
    localJg.brn();
    localJg.rV();
    localczv1.rV();
    localdRq.rV();
    localeR.rV();
    return localeR;
  }

  public bdj e(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    czv localczv = new czv();
    localczv.aJ();
    localczv.setElementMap(localcpa);
    localczv.setStyle("ScrollBorderTop3");
    localczv.setDisplaySize(new Or(405, 100));
    localczv.setKeepAspectRatio(true);
    parambdj.bb(localczv);
    localczv.brn();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setElementMap(localcpa);
    localcwP.setAlign(ajb.dhT);
    localcwP.setSize(new Or(100.0F, -2));
    localczv.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    localczv.rV();
    return localczv;
  }

  public bdj f(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    czv localczv = new czv();
    localczv.aJ();
    localczv.setElementMap(localcpa);
    localczv.setStyle("ScrollBorderBottom3");
    localczv.setDisplaySize(new Or(405, 75));
    localczv.setKeepAspectRatio(true);
    parambdj.bb(localczv);
    localczv.brn();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setElementMap(localcpa);
    localcwP.setAlign(ajb.dif);
    localcwP.setSize(new Or(100.0F, -2));
    localczv.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    localczv.rV();
    return localczv;
  }

  public bdj g(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    biy localbiy = new biy();
    localbiy.aJ();
    localbiy.setElementMap(localcpa);
    localbiy.setStyle("close");
    csA localcsA = new csA();
    localcsA.hg("unloadDialog");
    localbiy.setOnClick(localcsA);
    parambdj.bb(localbiy);
    localbiy.brn();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setElementMap(localcpa);
    localcwP.setAlign(ajb.dhV);
    localcwP.setSize(new Or(-2, -2));
    localcwP.setXOffset(-31);
    localcwP.setYOffset(-6);
    localbiy.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    localbiy.rV();
    return localbiy;
  }
}