import java.awt.Insets;
import java.util.Stack;

public class cLz
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
    czO localczO1 = new czO();
    localczO1.aJ();
    localczO1.setAdaptToContentSize(true);
    localbpn.bb(localczO1);
    localczO1.brn();
    localczO1.rV();
    dRq localdRq1 = dRq.checkOut();
    localdRq1.setElementMap(localcpa);
    localbpn.bb(localdRq1);
    localdRq1.brn();
    cwP localcwP1 = new cwP();
    localcwP1.aJ();
    localcwP1.setElementMap(localcpa);
    localcwP1.setSize(new Or(100.0F, 100.0F));
    localdRq1.bb(localcwP1);
    localcwP1.brn();
    localcwP1.rV();
    localdRq1.rV();
    dRq localdRq2 = dRq.checkOut();
    localdRq2.setElementMap(localcpa);
    localdRq2.setStyle("windowNew");
    localbpn.bb(localdRq2);
    localdRq2.brn();
    dRq localdRq3 = localdRq2;
    Jg localJg1 = localdRq3.getAppearance();
    localJg1.setElementMap(localcpa);
    localdRq2.bb(localJg1);
    localJg1.brn();
    cuR localcuR1 = new cuR();
    localcuR1.aJ();
    localcuR1.setElementMap(localcpa);
    localcuR1.setInsets(new Insets(10, 5, 12, 5));
    localJg1.bb(localcuR1);
    localcuR1.brn();
    localcuR1.rV();
    localJg1.rV();
    cwP localcwP2 = new cwP();
    localcwP2.aJ();
    localcwP2.setElementMap(localcpa);
    localcwP2.setSize(new Or(100.0F, 100.0F));
    localdRq2.bb(localcwP2);
    localcwP2.brn();
    localcwP2.rV();
    aId localaId1 = aId.checkOut();
    localaId1.setHorizontal(false);
    localaId1.setAlign(aFG.ech);
    localdRq2.bb(localaId1);
    localaId1.brn();
    localaId1.rV();
    dqa localdqa1 = new dqa();
    localdqa1.aJ();
    localdqa1.setElementMap(localcpa);
    localdqa1.setExpandable(false);
    localdRq2.bb(localdqa1);
    localdqa1.brn();
    dqa localdqa2 = localdqa1;
    Jg localJg2 = localdqa2.getAppearance();
    localJg2.setElementMap(localcpa);
    localdqa1.bb(localJg2);
    localJg2.brn();
    bmv localbmv1 = bmv.checkOut();
    localbmv1.setElementMap(localcpa);
    localbmv1.setInsets(new Insets(0, 10, 0, 10));
    localJg2.bb(localbmv1);
    localbmv1.brn();
    localbmv1.rV();
    localJg2.rV();
    dRq localdRq4 = dRq.checkOut();
    localdRq4.setElementMap(localcpa);
    localdRq4.setStyle("titleBar");
    localdqa1.bb(localdRq4);
    localdRq4.brn();
    dRq localdRq5 = localdRq4;
    Jg localJg3 = localdRq5.getAppearance();
    localJg3.setElementMap(localcpa);
    localdRq4.bb(localJg3);
    localJg3.brn();
    cuR localcuR2 = new cuR();
    localcuR2.aJ();
    localcuR2.setElementMap(localcpa);
    localcuR2.setInsets(new Insets(2, 20, 3, 20));
    localJg3.bb(localcuR2);
    localcuR2.brn();
    localcuR2.rV();
    localJg3.rV();
    aId localaId2 = aId.checkOut();
    localaId2.setHorizontal(false);
    localdRq4.bb(localaId2);
    localaId2.brn();
    localaId2.rV();
    dRq localdRq6 = dRq.checkOut();
    localdRq6.setElementMap(localcpa);
    localdRq6.setExpandable(false);
    localdRq4.bb(localdRq6);
    localdRq6.brn();
    dpm localdpm = new dpm();
    localdpm.aJ();
    localdpm.setElementMap(localcpa);
    localdpm.setAlign(aFG.eck);
    localdRq6.bb(localdpm);
    localdpm.brn();
    localdpm.rV();
    caF localcaF1 = new caF();
    localcaF1.aJ();
    localcaF1.setElementMap(localcpa);
    localcaF1.setStyle("StyledBold16White");
    localcaF1.setNonBlocking(true);
    String str1 = "%archipelagoChoice.title%";
    str1 = str1.replace("%archipelagoChoice.title%", cBQ.cxL().mL("archipelagoChoice.title"));
    localcaF1.setText(str1);
    localdRq6.bb(localcaF1);
    localcaF1.brn();
    caF localcaF2 = localcaF1;
    Jg localJg4 = localcaF2.getAppearance();
    localJg4.setElementMap(localcpa);
    ((cwJ)localJg4).setAlignment(aFG.eck);
    localcaF1.bb(localJg4);
    localJg4.brn();
    localJg4.rV();
    localcaF1.rV();
    localdRq6.rV();
    localdRq4.rV();
    localdqa1.rV();
    dRq localdRq7 = dRq.checkOut();
    localdRq7.setElementMap(localcpa);
    localdRq2.bb(localdRq7);
    localdRq7.brn();
    dRq localdRq8 = localdRq7;
    Jg localJg5 = localdRq8.getAppearance();
    localJg5.setElementMap(localcpa);
    localdRq7.bb(localJg5);
    localJg5.brn();
    bmv localbmv2 = bmv.checkOut();
    localbmv2.setElementMap(localcpa);
    localbmv2.setInsets(new Insets(0, 12, 0, 12));
    localJg5.bb(localbmv2);
    localbmv2.brn();
    localbmv2.rV();
    localJg5.rV();
    String str2 = "windowContentContainer";
    dRq localdRq9 = dRq.checkOut();
    localdRq9.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localdRq9);
    localdRq7.bb(localdRq9);
    localdRq9.brn();
    aId localaId3 = aId.checkOut();
    localaId3.setHorizontal(false);
    localdRq9.bb(localaId3);
    localaId3.brn();
    localaId3.rV();
    dRq localdRq10 = dRq.checkOut();
    localdRq10.setElementMap(localcpa);
    localdRq10.setExpandable(false);
    localdRq9.bb(localdRq10);
    localdRq10.brn();
    ccG localccG = new ccG();
    localccG.aJ();
    localccG.setElementMap(localcpa);
    localccG.setCellSize(new Or(140, 380));
    localccG.setPrefSize(new Or(700, 380));
    localdRq10.bb(localccG);
    localccG.brn();
    NK localNK1 = NK.checkOut();
    localNK1.setElementMap(localcpa);
    localNK1.setAttribute("content");
    localNK1.setName("archipelagoList");
    localccG.bb(localNK1);
    localNK1.brn();
    localNK1.rV();
    eR localeR = new eR();
    localeR.aJ();
    localeR.setElementMap(localcpa);
    aqC localaqC = new aqC();
    localaqC.hg("wakfu.archipelagoChoice:selectArchipelago");
    localeR.setOnItemClick(localaqC);
    bpP localbpP = new bpP();
    localbpP.hg("wakfu.archipelagoChoice:selectDoubleClickArchipelago");
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
    String str3 = "archipelago";
    avo localavo = new avo();
    localavo.aJ();
    localavo.setElementMap(localcpa);
    if ((localcpa != null) && (str3 != null))
      localcpa.a(str3, localavo);
    localeR.bb(localavo);
    localavo.brn();
    aaE localaaE1 = new aaE();
    localaaE1.aJ();
    localaaE1.setElementMap(localcpa);
    localaaE1.setAttribute("value");
    localavo.bb(localaaE1);
    localaaE1.brn();
    localaaE1.rV();
    localavo.rV();
    dRq localdRq11 = dRq.checkOut();
    localdRq11.setElementMap(localcpa);
    localdRq11.setStyle("white");
    bDy localbDy = new bDy();
    localbDy.hg("wakfu.archipelagoChoice:overArchipelago(multipleImage,archipelago);popup(archipelagoPopup,label)");
    localdRq11.setOnMouseEnter(localbDy);
    DY localDY = new DY();
    localDY.hg("wakfu.archipelagoChoice:outArchipelago(multipleImage,archipelago);closePopup");
    localdRq11.setOnMouseExit(localDY);
    localeR.bb(localdRq11);
    localdRq11.brn();
    dRq localdRq12 = localdRq11;
    Jg localJg6 = localdRq12.getAppearance();
    localJg6.setElementMap(localcpa);
    localdRq11.bb(localJg6);
    localJg6.brn();
    NK localNK2 = NK.checkOut();
    localNK2.setElementMap(localcpa);
    localNK2.setAttribute("modulationColor");
    localNK2.setName("selectedArchipelago");
    localJg6.bb(localNK2);
    localNK2.brn();
    anQ localanQ2 = new anQ();
    localanQ2.aJ();
    localanQ2.setElementMap(localcpa);
    localanQ2.setValue("0.153,0.714,0.557,0.5");
    localanQ2.setElseValue("1,1,1,1");
    localNK2.bb(localanQ2);
    localanQ2.brn();
    bSP localbSP1 = new bSP();
    localbSP1.aJ();
    localbSP1.setElementMap(localcpa);
    localanQ2.bb(localbSP1);
    localbSP1.brn();
    aaE localaaE2 = new aaE();
    localaaE2.aJ();
    localaaE2.setElementMap(localcpa);
    localaaE2.setAttribute("value");
    localbSP1.bb(localaaE2);
    localaaE2.brn();
    localaaE2.rV();
    localbSP1.rV();
    localanQ2.rV();
    localNK2.rV();
    localJg6.rV();
    czO localczO2 = new czO();
    localczO2.aJ();
    localdRq11.bb(localczO2);
    localczO2.brn();
    localczO2.rV();
    String str4 = "multipleImage";
    bhd localbhd = new bhd();
    localbhd.aJ();
    localbhd.setElementMap(localcpa);
    if ((localcpa != null) && (str4 != null))
      localcpa.a(str4, localbhd);
    localbhd.setShrinkToImageHeight(true);
    localdRq11.bb(localbhd);
    localbhd.brn();
    cwP localcwP3 = new cwP();
    localcwP3.aJ();
    localcwP3.setElementMap(localcpa);
    localcwP3.setAlign(ajb.dhZ);
    localcwP3.setSize(new Or(126, 363));
    localcwP3.setXOffset(-1);
    localbhd.bb(localcwP3);
    localcwP3.brn();
    localcwP3.rV();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localbhd.bb(localaAR);
    localaAR.brn();
    aaE localaaE3 = new aaE();
    localaaE3.aJ();
    localaaE3.setElementMap(localcpa);
    localaaE3.setAttribute("texture");
    localaaE3.setField("iconUrl");
    localaAR.bb(localaaE3);
    localaaE3.brn();
    localaaE3.rV();
    localaAR.rV();
    String str5 = "internalPopup";
    dRq localdRq13 = dRq.checkOut();
    localdRq13.setElementMap(localcpa);
    if ((localcpa != null) && (str5 != null))
      localcpa.a(str5, localdRq13);
    localdRq13.setStyle("popup");
    localbhd.bb(localdRq13);
    localdRq13.brn();
    String str6 = "internalPopupTextView";
    cWk localcWk = new cWk();
    localcWk.aJ();
    localcWk.setElementMap(localcpa);
    if ((localcpa != null) && (str6 != null))
      localcpa.a(str6, localcWk);
    localcWk.setStyle("white");
    localdRq13.bb(localcWk);
    localcWk.brn();
    localcWk.rV();
    localdRq13.rV();
    localbhd.rV();
    String str7 = "label";
    caF localcaF3 = new caF();
    localcaF3.aJ();
    localcaF3.setElementMap(localcpa);
    if ((localcpa != null) && (str7 != null))
      localcpa.a(str7, localcaF3);
    localcaF3.setStyle("CharacterCreationTitle");
    localcaF3.setNonBlocking(true);
    localcaF3.setExpandable(false);
    localdRq11.bb(localcaF3);
    localcaF3.brn();
    caF localcaF4 = localcaF3;
    Jg localJg7 = localcaF4.getAppearance();
    localJg7.setElementMap(localcpa);
    ((cwJ)localJg7).setAlignment(aFG.eck);
    localcaF3.bb(localJg7);
    localJg7.brn();
    cAf localcAf = cAf.checkOut();
    localcAf.setElementMap(localcpa);
    localcAf.setName("text");
    localcAf.setColor(new bNa(1.0F, 1.0F, 1.0F, 1.0F));
    localJg7.bb(localcAf);
    localcAf.brn();
    localcAf.rV();
    localJg7.rV();
    aaE localaaE4 = new aaE();
    localaaE4.aJ();
    localaaE4.setElementMap(localcpa);
    localaaE4.setAttribute("text");
    localaaE4.setField("name");
    localcaF3.bb(localaaE4);
    localaaE4.brn();
    localaaE4.rV();
    cwP localcwP4 = new cwP();
    localcwP4.aJ();
    localcwP4.setElementMap(localcpa);
    localcwP4.setAlign(ajb.dif);
    localcwP4.setYOffset(20);
    localcaF3.bb(localcwP4);
    localcwP4.brn();
    localcwP4.rV();
    localcaF3.rV();
    dRq localdRq14 = dRq.checkOut();
    localdRq14.setElementMap(localcpa);
    localdRq11.bb(localdRq14);
    localdRq14.brn();
    cwP localcwP5 = new cwP();
    localcwP5.aJ();
    localcwP5.setElementMap(localcpa);
    localcwP5.setAlign(ajb.dhZ);
    localcwP5.setSize(new Or(126, 363));
    localdRq14.bb(localcwP5);
    localcwP5.brn();
    localcwP5.rV();
    dRq localdRq15 = localdRq14;
    Jg localJg8 = localdRq15.getAppearance();
    localJg8.setElementMap(localcpa);
    localdRq14.bb(localJg8);
    localJg8.brn();
    jO localjO1 = new jO();
    localjO1.aJ();
    localjO1.setElementMap(localcpa);
    localjO1.setColor(new bNa(0.1F, 0.1F, 0.1F, 0.8F));
    localJg8.bb(localjO1);
    localjO1.brn();
    localjO1.rV();
    localJg8.rV();
    aaE localaaE5 = new aaE();
    localaaE5.aJ();
    localaaE5.setElementMap(localcpa);
    localaaE5.setAttribute("visible");
    localaaE5.setField("enabled");
    localdRq14.bb(localaaE5);
    localaaE5.brn();
    anQ localanQ3 = new anQ();
    localanQ3.aJ();
    localanQ3.setElementMap(localcpa);
    localaaE5.bb(localanQ3);
    localanQ3.brn();
    bqW localbqW1 = new bqW();
    localbqW1.aJ();
    localbqW1.setElementMap(localcpa);
    localanQ3.bb(localbqW1);
    localbqW1.brn();
    localbqW1.rV();
    localanQ3.rV();
    localaaE5.rV();
    localdRq14.rV();
    dRq localdRq16 = dRq.checkOut();
    localdRq16.setElementMap(localcpa);
    localdRq11.bb(localdRq16);
    localdRq16.brn();
    cwP localcwP6 = new cwP();
    localcwP6.aJ();
    localcwP6.setElementMap(localcpa);
    localcwP6.setAlign(ajb.dhZ);
    localcwP6.setSize(new Or(126, 363));
    localdRq16.bb(localcwP6);
    localcwP6.brn();
    localcwP6.rV();
    dRq localdRq17 = localdRq16;
    Jg localJg9 = localdRq17.getAppearance();
    localJg9.setElementMap(localcpa);
    localdRq16.bb(localJg9);
    localJg9.brn();
    jO localjO2 = new jO();
    localjO2.aJ();
    localjO2.setElementMap(localcpa);
    localjO2.setColor(new bNa(0.1F, 0.1F, 0.1F, 0.2F));
    localJg9.bb(localjO2);
    localjO2.brn();
    localjO2.rV();
    localJg9.rV();
    NK localNK3 = NK.checkOut();
    localNK3.setElementMap(localcpa);
    localNK3.setAttribute("visible");
    localNK3.setName("selectedArchipelago");
    localdRq16.bb(localNK3);
    localNK3.brn();
    anQ localanQ4 = new anQ();
    localanQ4.aJ();
    localanQ4.setElementMap(localcpa);
    localNK3.bb(localanQ4);
    localanQ4.brn();
    bJJ localbJJ = new bJJ();
    localbJJ.aJ();
    localbJJ.setElementMap(localcpa);
    localanQ4.bb(localbJJ);
    localbJJ.brn();
    dDu localdDu = new dDu();
    localdDu.aJ();
    localdDu.setElementMap(localcpa);
    localbJJ.bb(localdDu);
    localdDu.brn();
    bSP localbSP2 = new bSP();
    localbSP2.aJ();
    localbSP2.setElementMap(localcpa);
    localdDu.bb(localbSP2);
    localbSP2.brn();
    aaE localaaE6 = new aaE();
    localaaE6.aJ();
    localaaE6.setElementMap(localcpa);
    localaaE6.setAttribute("value");
    localbSP2.bb(localaaE6);
    localaaE6.brn();
    localaaE6.rV();
    localbSP2.rV();
    localdDu.rV();
    bqW localbqW2 = new bqW();
    localbqW2.aJ();
    localbqW2.setElementMap(localcpa);
    localbJJ.bb(localbqW2);
    localbqW2.brn();
    NK localNK4 = NK.checkOut();
    localNK4.setElementMap(localcpa);
    localNK4.setAttribute("comparedValue");
    localNK4.setName("overArchipelago");
    localbqW2.bb(localNK4);
    localNK4.brn();
    anQ localanQ5 = new anQ();
    localanQ5.aJ();
    localanQ5.setElementMap(localcpa);
    localNK4.bb(localanQ5);
    localanQ5.brn();
    bSP localbSP3 = new bSP();
    localbSP3.aJ();
    localbSP3.setElementMap(localcpa);
    localanQ5.bb(localbSP3);
    localbSP3.brn();
    aaE localaaE7 = new aaE();
    localaaE7.aJ();
    localaaE7.setElementMap(localcpa);
    localaaE7.setAttribute("value");
    localbSP3.bb(localaaE7);
    localaaE7.brn();
    localaaE7.rV();
    localbSP3.rV();
    localanQ5.rV();
    localNK4.rV();
    localbqW2.rV();
    localbJJ.rV();
    localanQ4.rV();
    localNK3.rV();
    localdRq16.rV();
    localdRq11.rV();
    localeR.rV();
    localccG.rV();
    localdRq10.rV();
    localdRq9.rV();
    localdRq7.rV();
    localdRq2.rV();
    a(localbpn);
    b(localbpn);
    d(localbpn);
    e(localbpn);
    localbpn.rV();
    return localbpn;
  }

  public bdj a(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    dRq localdRq = dRq.checkOut();
    localdRq.setElementMap(localcpa);
    parambdj.bb(localdRq);
    localdRq.brn();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setElementMap(localcpa);
    localcwP.setSize(new Or(100.0F, 100.0F));
    localdRq.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    localdRq.rV();
    return localdRq;
  }

  public bdj b(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    String str = "archipelagoCloseButton";
    biy localbiy = new biy();
    localbiy.aJ();
    localbiy.setElementMap(localcpa);
    if ((localcpa != null) && (str != null))
      localcpa.a(str, localbiy);
    localbiy.setStyle("close");
    localbiy.setExpandable(false);
    csA localcsA = new csA();
    localcsA.hg("wakfu.archipelagoChoice:unloadDialog");
    localbiy.setOnClick(localcsA);
    parambdj.bb(localbiy);
    localbiy.brn();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setElementMap(localcpa);
    localcwP.setSize(new Or(-2, -2));
    localcwP.setAlign(ajb.dhV);
    localcwP.setXOffset(-18);
    localcwP.setYOffset(-12);
    localbiy.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    localbiy.rV();
    return localbiy;
  }

  public bdj d(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setElementMap(localcpa);
    localcwP.setSize(new Or(-2, -2));
    localcwP.setAlign(ajb.dhZ);
    localcwP.setInitValue(true);
    parambdj.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    return localcwP;
  }

  public bdj e(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    String str1 = "archipelagoPopup";
    anG localanG = new anG();
    localanG.aJ();
    localanG.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localanG);
    localanG.setAlign(aFG.ech);
    localanG.setHotSpotPosition(aFG.ecn);
    parambdj.bb(localanG);
    localanG.brn();
    dRq localdRq1 = dRq.checkOut();
    localdRq1.setElementMap(localcpa);
    localdRq1.setPrefSize(new Or(112, 50));
    localdRq1.setStyle("popup");
    localanG.bb(localdRq1);
    localdRq1.brn();
    NK localNK1 = NK.checkOut();
    localNK1.setElementMap(localcpa);
    localNK1.setAttribute("visible");
    localNK1.setName("overArchipelago");
    localNK1.setField("enabled");
    localdRq1.bb(localNK1);
    localNK1.brn();
    localNK1.rV();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setElementMap(localcpa);
    localcwP.setResizeOnce(true);
    localdRq1.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    dRq localdRq2 = localdRq1;
    Jg localJg1 = localdRq2.getAppearance();
    localJg1.setElementMap(localcpa);
    localdRq1.bb(localJg1);
    localJg1.brn();
    bmv localbmv1 = bmv.checkOut();
    localbmv1.setElementMap(localcpa);
    localbmv1.setInsets(new Insets(0, 5, 0, 5));
    localJg1.bb(localbmv1);
    localbmv1.brn();
    localbmv1.rV();
    localJg1.rV();
    aId localaId = aId.checkOut();
    localaId.setAlign(aFG.ech);
    localaId.setHorizontal(false);
    localdRq1.bb(localaId);
    localaId.brn();
    localaId.rV();
    dRq localdRq3 = dRq.checkOut();
    localdRq3.setElementMap(localcpa);
    localdRq1.bb(localdRq3);
    localdRq3.brn();
    caF localcaF1 = new caF();
    localcaF1.aJ();
    localcaF1.setElementMap(localcpa);
    localcaF1.setStyle("BigTitle");
    localcaF1.setMinWidth(150);
    localcaF1.setMaxWidth(150);
    localcaF1.setNonBlocking(true);
    localdRq3.bb(localcaF1);
    localcaF1.brn();
    NK localNK2 = NK.checkOut();
    localNK2.setElementMap(localcpa);
    localNK2.setAttribute("text");
    localNK2.setName("overArchipelago");
    localNK2.setField("name");
    localcaF1.bb(localNK2);
    localNK2.brn();
    localNK2.rV();
    caF localcaF2 = localcaF1;
    Jg localJg2 = localcaF2.getAppearance();
    localJg2.setElementMap(localcpa);
    ((cwJ)localJg2).setAlignment(aFG.eck);
    localcaF1.bb(localJg2);
    localJg2.brn();
    localJg2.rV();
    localcaF1.rV();
    localdRq3.rV();
    dRq localdRq4 = dRq.checkOut();
    localdRq4.setElementMap(localcpa);
    localdRq4.setExpandable(false);
    localdRq4.setStyle("lineSeparator");
    localdRq4.setPrefSize(new Or(0, 7));
    localdRq1.bb(localdRq4);
    localdRq4.brn();
    dRq localdRq5 = localdRq4;
    Jg localJg3 = localdRq5.getAppearance();
    localJg3.setElementMap(localcpa);
    localdRq4.bb(localJg3);
    localJg3.brn();
    bmv localbmv2 = bmv.checkOut();
    localbmv2.setElementMap(localcpa);
    localbmv2.setInsets(new Insets(5, 0, 2, 0));
    localJg3.bb(localbmv2);
    localbmv2.brn();
    localbmv2.rV();
    localJg3.rV();
    localdRq4.rV();
    cWk localcWk1 = new cWk();
    localcWk1.aJ();
    localcWk1.setElementMap(localcpa);
    localcWk1.setStyle("white");
    localcWk1.setMinWidth(150);
    localcWk1.setMaxWidth(150);
    localcWk1.setNonBlocking(true);
    localdRq1.bb(localcWk1);
    localcWk1.brn();
    NK localNK3 = NK.checkOut();
    localNK3.setElementMap(localcpa);
    localNK3.setAttribute("text");
    localNK3.setName("overArchipelago");
    localNK3.setField("description");
    localcWk1.bb(localNK3);
    localNK3.brn();
    localNK3.rV();
    cWk localcWk2 = localcWk1;
    Jg localJg4 = localcWk2.getAppearance();
    localJg4.setElementMap(localcpa);
    ((cwJ)localJg4).setAlignment(aFG.eck);
    localcWk1.bb(localJg4);
    localJg4.brn();
    localJg4.rV();
    localcWk1.rV();
    dRq localdRq6 = dRq.checkOut();
    localdRq6.setElementMap(localcpa);
    localdRq6.setStyle("lineSeparator");
    localdRq6.setPrefSize(new Or(0, 7));
    localdRq1.bb(localdRq6);
    localdRq6.brn();
    dRq localdRq7 = localdRq6;
    Jg localJg5 = localdRq7.getAppearance();
    localJg5.setElementMap(localcpa);
    localdRq6.bb(localJg5);
    localJg5.brn();
    bmv localbmv3 = bmv.checkOut();
    localbmv3.setElementMap(localcpa);
    localbmv3.setInsets(new Insets(5, 0, 2, 0));
    localJg5.bb(localbmv3);
    localbmv3.brn();
    localbmv3.rV();
    localJg5.rV();
    localdRq6.rV();
    caF localcaF3 = new caF();
    localcaF3.aJ();
    localcaF3.setElementMap(localcpa);
    localcaF3.setNonBlocking(true);
    String str2 = "%doubleClickToValid%";
    str2 = str2.replace("%doubleClickToValid%", cBQ.cxL().mL("doubleClickToValid"));
    localcaF3.setText(str2);
    localcaF3.setStyle("PopupInformation");
    localdRq1.bb(localcaF3);
    localcaF3.brn();
    caF localcaF4 = localcaF3;
    Jg localJg6 = localcaF4.getAppearance();
    localJg6.setElementMap(localcpa);
    ((cwJ)localJg6).setAlignment(aFG.eck);
    localcaF3.bb(localJg6);
    localJg6.brn();
    localJg6.rV();
    localcaF3.rV();
    localdRq1.rV();
    localanG.rV();
    return localanG;
  }
}