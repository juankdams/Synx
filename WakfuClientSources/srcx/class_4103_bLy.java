import java.awt.Insets;
import java.util.Stack;

public class bLy
  implements cEa
{
  private Stack X = new Stack();
  private cDA Y;

  public bdj a(cDA paramcDA, cpa paramcpa)
  {
    this.Y = paramcDA;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    String str1 = "itemGemWindow";
    bpn localbpn = new bpn();
    localbpn.aJ();
    localbpn.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localbpn);
    localbpn.setPack(true);
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
    localdRq2.setStyle("challengeCurrent");
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
    localcuR1.setInsets(new Insets(9, 16, 22, 16));
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
    localbmv1.setInsets(new Insets(0, 12, 0, 12));
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
    dpm localdpm1 = new dpm();
    localdpm1.aJ();
    localdpm1.setElementMap(localcpa);
    localdpm1.setAlign(aFG.eck);
    localdRq6.bb(localdpm1);
    localdpm1.brn();
    localdpm1.rV();
    caF localcaF1 = new caF();
    localcaF1.aJ();
    localcaF1.setElementMap(localcpa);
    localcaF1.setStyle("StyledBold16White");
    localcaF1.setNonBlocking(true);
    String str2 = "%socketGems%";
    str2 = str2.replace("%socketGems%", cBQ.cxL().mL("socketGems"));
    localcaF1.setText(str2);
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
    String str3 = "windowContentContainer";
    dRq localdRq9 = dRq.checkOut();
    localdRq9.setElementMap(localcpa);
    if ((localcpa != null) && (str3 != null))
      localcpa.a(str3, localdRq9);
    localdRq7.bb(localdRq9);
    localdRq9.brn();
    aId localaId3 = aId.checkOut();
    localaId3.setAlign(aFG.ech);
    localaId3.setHorizontal(false);
    localdRq9.bb(localaId3);
    localaId3.brn();
    localaId3.rV();
    dRq localdRq10 = dRq.checkOut();
    localdRq10.setElementMap(localcpa);
    localdRq10.setExpandable(false);
    localdRq9.bb(localdRq10);
    localdRq10.brn();
    dpm localdpm2 = new dpm();
    localdpm2.aJ();
    localdpm2.setElementMap(localcpa);
    localdpm2.setAlign(aFG.ecj);
    localdRq10.bb(localdpm2);
    localdpm2.brn();
    localdpm2.rV();
    czO localczO2 = new czO();
    localczO2.aJ();
    localczO2.setAdaptToContentSize(true);
    localdRq10.bb(localczO2);
    localczO2.brn();
    localczO2.rV();
    dRq localdRq11 = dRq.checkOut();
    localdRq11.setElementMap(localcpa);
    localdRq11.setExpandable(false);
    localdRq11.setPrefSize(new Or(0, 0));
    localdRq10.bb(localdRq11);
    localdRq11.brn();
    cwP localcwP3 = new cwP();
    localcwP3.aJ();
    localcwP3.setElementMap(localcpa);
    localcwP3.setAlign(ajb.dhR);
    localcwP3.setSize(new Or(-2, -2));
    localcwP3.setYOffset(-15);
    localdRq11.bb(localcwP3);
    localcwP3.brn();
    localcwP3.rV();
    dRq localdRq12 = localdRq11;
    Jg localJg6 = localdRq12.getAppearance();
    localJg6.setElementMap(localcpa);
    localdRq11.bb(localJg6);
    localJg6.brn();
    bmv localbmv3 = bmv.checkOut();
    localbmv3.setElementMap(localcpa);
    localbmv3.setInsets(new Insets(0, 75, 0, 10));
    localJg6.bb(localbmv3);
    localbmv3.brn();
    localbmv3.rV();
    localJg6.rV();
    czO localczO3 = new czO();
    localczO3.aJ();
    localczO3.setAdaptToContentSize(true);
    localdRq11.bb(localczO3);
    localczO3.brn();
    localczO3.rV();
    dRq localdRq13 = dRq.checkOut();
    localdRq13.setElementMap(localcpa);
    localdRq13.setStyle("TiledScrollCenter");
    localdRq13.setPrefSize(new Or(0, 30));
    localdRq11.bb(localdRq13);
    localdRq13.brn();
    cwP localcwP4 = new cwP();
    localcwP4.aJ();
    localcwP4.setElementMap(localcpa);
    localcwP4.setAlign(ajb.dhY);
    localcwP4.setSize(new Or(100.0F, -2));
    localdRq13.bb(localcwP4);
    localcwP4.brn();
    localcwP4.rV();
    localdRq13.rV();
    czv localczv1 = new czv();
    localczv1.aJ();
    localczv1.setElementMap(localcpa);
    localczv1.setStyle("TiledScrollTop");
    localczv1.setDisplaySize(new Or(150, 4));
    localdRq11.bb(localczv1);
    localczv1.brn();
    cwP localcwP5 = new cwP();
    localcwP5.aJ();
    localcwP5.setElementMap(localcpa);
    localcwP5.setAlign(ajb.dhR);
    localczv1.bb(localcwP5);
    localcwP5.brn();
    localcwP5.rV();
    localczv1.rV();
    czv localczv2 = new czv();
    localczv2.aJ();
    localczv2.setElementMap(localcpa);
    localczv2.setStyle("TiledScrollBottom");
    localczv2.setDisplaySize(new Or(150, 4));
    localdRq11.bb(localczv2);
    localczv2.brn();
    cwP localcwP6 = new cwP();
    localcwP6.aJ();
    localcwP6.setElementMap(localcpa);
    localcwP6.setAlign(ajb.did);
    localczv2.bb(localcwP6);
    localcwP6.brn();
    localcwP6.rV();
    localczv2.rV();
    caF localcaF3 = new caF();
    localcaF3.aJ();
    localcaF3.setElementMap(localcpa);
    localcaF3.setStyle("styledDark12");
    localcaF3.setExpandable(false);
    localdRq11.bb(localcaF3);
    localcaF3.brn();
    cwP localcwP7 = new cwP();
    localcwP7.aJ();
    localcwP7.setElementMap(localcpa);
    localcwP7.setAlign(ajb.dhY);
    localcaF3.bb(localcwP7);
    localcwP7.brn();
    localcwP7.rV();
    caF localcaF4 = localcaF3;
    Jg localJg7 = localcaF4.getAppearance();
    localJg7.setElementMap(localcpa);
    ((cwJ)localJg7).setAlignment(aFG.ecj);
    localcaF3.bb(localJg7);
    localJg7.brn();
    bmv localbmv4 = bmv.checkOut();
    localbmv4.setElementMap(localcpa);
    localbmv4.setInsets(new Insets(0, 15, 0, 0));
    localJg7.bb(localbmv4);
    localbmv4.brn();
    localbmv4.rV();
    cuR localcuR3 = new cuR();
    localcuR3.aJ();
    localcuR3.setElementMap(localcpa);
    localcuR3.setInsets(new Insets(7, 0, 7, 0));
    localJg7.bb(localcuR3);
    localcuR3.brn();
    localcuR3.rV();
    localJg7.rV();
    NK localNK1 = NK.checkOut();
    localNK1.setElementMap(localcpa);
    localNK1.setLocal(true);
    localNK1.setAttribute("text");
    localNK1.setName("itemDetail");
    localNK1.setField("name");
    localcaF3.bb(localNK1);
    localNK1.brn();
    localNK1.rV();
    localcaF3.rV();
    localdRq11.rV();
    czv localczv3 = new czv();
    localczv3.aJ();
    localczv3.setElementMap(localcpa);
    localczv3.setStyle("GemBackgroundBrown");
    localdRq10.bb(localczv3);
    localczv3.brn();
    cwP localcwP8 = new cwP();
    localcwP8.aJ();
    localcwP8.setElementMap(localcpa);
    localcwP8.setSize(new Or(-2, -2));
    localcwP8.setAlign(ajb.did);
    localcwP8.setXOffset(78);
    localcwP8.setYOffset(15);
    localczv3.bb(localcwP8);
    localcwP8.brn();
    localcwP8.rV();
    localczv3.rV();
    dRq localdRq14 = dRq.checkOut();
    localdRq14.setElementMap(localcpa);
    localdRq14.setExpandable(false);
    localdRq14.setPrefSize(new Or(90, 85));
    localdRq10.bb(localdRq14);
    localdRq14.brn();
    cwP localcwP9 = new cwP();
    localcwP9.aJ();
    localcwP9.setElementMap(localcpa);
    localcwP9.setAlign(ajb.dhY);
    localcwP9.setSize(new Or(-2, -2));
    localdRq14.bb(localcwP9);
    localcwP9.brn();
    localcwP9.rV();
    czO localczO4 = new czO();
    localczO4.aJ();
    localczO4.setAdaptToContentSize(true);
    localdRq14.bb(localczO4);
    localczO4.brn();
    localczO4.rV();
    dRq localdRq15 = localdRq14;
    Jg localJg8 = localdRq15.getAppearance();
    localJg8.setElementMap(localcpa);
    localdRq14.bb(localJg8);
    localJg8.brn();
    bmv localbmv5 = bmv.checkOut();
    localbmv5.setElementMap(localcpa);
    localbmv5.setInsets(new Insets(0, 0, 0, 0));
    localJg8.bb(localbmv5);
    localbmv5.brn();
    localbmv5.rV();
    localJg8.rV();
    String str4 = "petPortrait";
    czv localczv4 = new czv();
    localczv4.aJ();
    localczv4.setElementMap(localcpa);
    if ((localcpa != null) && (str4 != null))
      localcpa.a(str4, localczv4);
    localczv4.setStyle("Portrait");
    localdRq14.bb(localczv4);
    localczv4.brn();
    cwP localcwP10 = new cwP();
    localcwP10.aJ();
    localcwP10.setElementMap(localcpa);
    localcwP10.setAlign(ajb.dhZ);
    localcwP10.setSize(new Or(100.0F, 100.0F));
    localczv4.bb(localcwP10);
    localcwP10.brn();
    localcwP10.rV();
    localczv4.rV();
    czv localczv5 = new czv();
    localczv5.aJ();
    localczv5.setElementMap(localcpa);
    localczv5.setDisplaySize(new Or(48, 48));
    localdRq14.bb(localczv5);
    localczv5.brn();
    cwP localcwP11 = new cwP();
    localcwP11.aJ();
    localcwP11.setElementMap(localcpa);
    localcwP11.setAlign(ajb.dhZ);
    localcwP11.setSize(new Or(-2, -2));
    localczv5.bb(localcwP11);
    localcwP11.brn();
    localcwP11.rV();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localczv5.bb(localaAR);
    localaAR.brn();
    NK localNK2 = NK.checkOut();
    localNK2.setElementMap(localcpa);
    localNK2.setName("itemDetail");
    localNK2.setLocal(true);
    localNK2.setAttribute("texture");
    localNK2.setField("iconUrl");
    localaAR.bb(localNK2);
    localNK2.brn();
    localNK2.rV();
    localaAR.rV();
    localczv5.rV();
    localdRq14.rV();
    String str5 = "gemsList";
    ccG localccG1 = new ccG();
    localccG1.aJ();
    localccG1.setElementMap(localcpa);
    if ((localcpa != null) && (str5 != null))
      localcpa.a(str5, localccG1);
    localccG1.setCellSize(new Or(26, 24));
    localccG1.setHorizontal(false);
    localccG1.setAutoIdealSize(true);
    localccG1.setIdealSizeMinRows(1);
    localccG1.setIdealSizeMaxRows(1);
    localccG1.setIdealSizeMinColumns(1);
    localccG1.setIdealSizeMaxColumns(3);
    localdRq10.bb(localccG1);
    localccG1.brn();
    cwP localcwP12 = new cwP();
    localcwP12.aJ();
    localcwP12.setElementMap(localcpa);
    localcwP12.setSize(new Or(-2, -2));
    localcwP12.setAlign(ajb.did);
    localcwP12.setXOffset(85);
    localcwP12.setYOffset(20);
    localccG1.bb(localcwP12);
    localcwP12.brn();
    localcwP12.rV();
    ccG localccG2 = localccG1;
    Jg localJg9 = localccG2.getAppearance();
    localJg9.setElementMap(localcpa);
    localccG1.bb(localJg9);
    localJg9.brn();
    bmv localbmv6 = bmv.checkOut();
    localbmv6.setElementMap(localcpa);
    localbmv6.setInsets(new Insets(10, 0, 0, 10));
    localJg9.bb(localbmv6);
    localbmv6.brn();
    localbmv6.rV();
    localJg9.rV();
    NK localNK3 = NK.checkOut();
    localNK3.setElementMap(localcpa);
    localNK3.setName("itemDetail");
    localNK3.setLocal(true);
    localNK3.setAttribute("content");
    localNK3.setField("gems/gemsList");
    localccG1.bb(localNK3);
    localNK3.brn();
    localNK3.rV();
    eR localeR = new eR();
    localeR.aJ();
    localeR.setElementMap(localcpa);
    localccG1.bb(localeR);
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
    anE localanE = new anE();
    localanE.aJ();
    localanE.setElementMap(localcpa);
    localbxx.bb(localanE);
    localanE.brn();
    localanE.rV();
    localbxx.rV();
    localanQ.rV();
    String str6 = "gemSlot";
    avo localavo = new avo();
    localavo.aJ();
    localavo.setElementMap(localcpa);
    if ((localcpa != null) && (str6 != null))
      localcpa.a(str6, localavo);
    localeR.bb(localavo);
    localavo.brn();
    aaE localaaE = new aaE();
    localaaE.aJ();
    localaaE.setElementMap(localcpa);
    localaaE.setAttribute("value");
    localavo.bb(localaaE);
    localaaE.brn();
    localaaE.rV();
    localavo.rV();
    dRq localdRq16 = dRq.checkOut();
    localdRq16.setElementMap(localcpa);
    localeR.bb(localdRq16);
    localdRq16.brn();
    czO localczO5 = new czO();
    localczO5.aJ();
    localczO5.setAdaptToContentSize(true);
    localdRq16.bb(localczO5);
    localczO5.brn();
    localczO5.rV();
    String str7 = "slotImage";
    czv localczv6 = new czv();
    localczv6.aJ();
    localczv6.setElementMap(localcpa);
    if ((localcpa != null) && (str7 != null))
      localcpa.a(str7, localczv6);
    localczv6.setNonBlocking(true);
    localczv6.setScaled(true);
    localczv6.setDisplaySize(new Or(24, 24));
    localdRq16.bb(localczv6);
    localczv6.brn();
    a(localczv6);
    b(localczv6);
    localczv6.rV();
    d(localdRq16);
    localdRq16.rV();
    localeR.rV();
    localccG1.rV();
    localdRq10.rV();
    e(localdRq9);
    localdRq9.rV();
    localdRq7.rV();
    localdRq2.rV();
    f(localbpn);
    g(localbpn);
    h(localbpn);
    localbpn.rV();
    return localbpn;
  }

  public bdj a(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setElementMap(localcpa);
    localcwP.setAlign(ajb.dhZ);
    localcwP.setSize(new Or(-2, -2));
    parambdj.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    return localcwP;
  }

  public bdj b(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    aaE localaaE = new aaE();
    localaaE.aJ();
    localaaE.setElementMap(localcpa);
    localaaE.setAttribute("style");
    localaaE.setField("gemStyle2");
    parambdj.bb(localaaE);
    localaaE.brn();
    localaaE.rV();
    return localaaE;
  }

  public bdj d(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    bXx localbXx = new bXx();
    localbXx.aJ();
    localbXx.setElementMap(localcpa);
    bQa localbQa = new bQa();
    localbQa.hg("wakfu.gemItems:drop(gemSlot)");
    localbXx.setOnDrop(localbQa);
    localbXx.setDragEnabled(false);
    localbXx.setNonBlocking(false);
    cCu localcCu = new cCu();
    localcCu.hg("popup(itemPopup)");
    localbXx.setOnPopupDisplay(localcCu);
    jL localjL = new jL();
    localjL.hg("closePopup");
    localbXx.setOnPopupHide(localjL);
    parambdj.bb(localbXx);
    localbXx.brn();
    cwP localcwP1 = new cwP();
    localcwP1.aJ();
    localcwP1.setElementMap(localcpa);
    localcwP1.setAlign(ajb.dhZ);
    localcwP1.setSize(new Or(100.0F, 100.0F));
    localbXx.bb(localcwP1);
    localcwP1.brn();
    localcwP1.rV();
    String str1 = "itemPopup";
    anG localanG = new anG();
    localanG.aJ();
    localanG.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localanG);
    localanG.setAlign(aFG.ech);
    localanG.setHotSpotPosition(aFG.ecn);
    localbXx.bb(localanG);
    localanG.brn();
    dRq localdRq = dRq.checkOut();
    localdRq.setElementMap(localcpa);
    localdRq.setPrefSize(new Or(10, 0));
    localdRq.setStyle("popup");
    localanG.bb(localdRq);
    localdRq.brn();
    aId localaId = aId.checkOut();
    localaId.setHorizontal(false);
    localdRq.bb(localaId);
    localaId.brn();
    localaId.rV();
    cWk localcWk1 = new cWk();
    localcWk1.aJ();
    localcWk1.setElementMap(localcpa);
    localcWk1.setStyle("whiteBold11");
    localdRq.bb(localcWk1);
    localcWk1.brn();
    cWk localcWk2 = localcWk1;
    Jg localJg1 = localcWk2.getAppearance();
    localJg1.setElementMap(localcpa);
    ((cwJ)localJg1).setAlign(aFG.ecj);
    localcWk1.bb(localJg1);
    localJg1.brn();
    localJg1.rV();
    aaE localaaE1 = new aaE();
    localaaE1.aJ();
    localaaE1.setElementMap(localcpa);
    localaaE1.setAttribute("text");
    localaaE1.setField("gemTypeDescription");
    localcWk1.bb(localaaE1);
    localaaE1.brn();
    localaaE1.rV();
    aaE localaaE2 = new aaE();
    localaaE2.aJ();
    localaaE2.setElementMap(localcpa);
    localaaE2.setAttribute("visible");
    localaaE2.setField("hasGem");
    localcWk1.bb(localaaE2);
    localaaE2.brn();
    anQ localanQ1 = new anQ();
    localanQ1.aJ();
    localanQ1.setElementMap(localcpa);
    localaaE2.bb(localanQ1);
    localanQ1.brn();
    bqW localbqW = new bqW();
    localbqW.aJ();
    localbqW.setElementMap(localcpa);
    localanQ1.bb(localbqW);
    localbqW.brn();
    localbqW.rV();
    localanQ1.rV();
    localaaE2.rV();
    localcWk1.rV();
    cWk localcWk3 = new cWk();
    localcWk3.aJ();
    localcWk3.setElementMap(localcpa);
    localcWk3.setStyle("whiteBold11");
    localcWk3.setMaxWidth(150);
    localcWk3.setMinWidth(1);
    localcWk3.setMultiline(true);
    localdRq.bb(localcWk3);
    localcWk3.brn();
    cWk localcWk4 = localcWk3;
    Jg localJg2 = localcWk4.getAppearance();
    localJg2.setElementMap(localcpa);
    ((cwJ)localJg2).setAlign(aFG.ecj);
    localcWk3.bb(localJg2);
    localJg2.brn();
    localJg2.rV();
    aaE localaaE3 = new aaE();
    localaaE3.aJ();
    localaaE3.setElementMap(localcpa);
    localaaE3.setAttribute("text");
    localaaE3.setField("name");
    localcWk3.bb(localaaE3);
    localaaE3.brn();
    localaaE3.rV();
    aaE localaaE4 = new aaE();
    localaaE4.aJ();
    localaaE4.setElementMap(localcpa);
    localaaE4.setAttribute("visible");
    localaaE4.setField("hasGem");
    localcWk3.bb(localaaE4);
    localaaE4.brn();
    localaaE4.rV();
    localcWk3.rV();
    cWk localcWk5 = new cWk();
    localcWk5.aJ();
    localcWk5.setElementMap(localcpa);
    localcWk5.setStyle("white11");
    localcWk5.setMultiline(false);
    localcWk5.setMinWidth(1);
    localcWk5.setMaxWidth(215);
    localcWk5.setExpandable(false);
    localcWk5.setEnableOnlySelectablePartInteraction(true);
    localdRq.bb(localcWk5);
    localcWk5.brn();
    cWk localcWk6 = localcWk5;
    Jg localJg3 = localcWk6.getAppearance();
    localJg3.setElementMap(localcpa);
    localcWk5.bb(localJg3);
    localJg3.brn();
    bmv localbmv1 = bmv.checkOut();
    localbmv1.setElementMap(localcpa);
    localbmv1.setInsets(new Insets(0, 5, 0, 0));
    localJg3.bb(localbmv1);
    localbmv1.brn();
    localbmv1.rV();
    localJg3.rV();
    aaE localaaE5 = new aaE();
    localaaE5.aJ();
    localaaE5.setElementMap(localcpa);
    localaaE5.setAttribute("visible");
    localaaE5.setField("hasGem");
    localcWk5.bb(localaaE5);
    localaaE5.brn();
    localaaE5.rV();
    aaE localaaE6 = new aaE();
    localaaE6.aJ();
    localaaE6.setElementMap(localcpa);
    localaaE6.setAttribute("text");
    localaaE6.setField("caracteristic");
    localcWk5.bb(localaaE6);
    localaaE6.brn();
    localaaE6.rV();
    localcWk5.rV();
    caF localcaF1 = new caF();
    localcaF1.aJ();
    localcaF1.setElementMap(localcpa);
    localcaF1.setStyle("white");
    localcaF1.setMultiline(true);
    String str2 = "%dragAGemToSocket%";
    str2 = str2.replace("%dragAGemToSocket%", cBQ.cxL().mL("dragAGemToSocket"));
    localcaF1.setText(str2);
    localdRq.bb(localcaF1);
    localcaF1.brn();
    caF localcaF2 = localcaF1;
    Jg localJg4 = localcaF2.getAppearance();
    localJg4.setElementMap(localcpa);
    ((cwJ)localJg4).setAlign(aFG.ecj);
    localcaF1.bb(localJg4);
    localJg4.brn();
    bmv localbmv2 = bmv.checkOut();
    localbmv2.setElementMap(localcpa);
    localbmv2.setInsets(new Insets(3, 0, 0, 0));
    localJg4.bb(localbmv2);
    localbmv2.brn();
    localbmv2.rV();
    localJg4.rV();
    localcaF1.rV();
    localdRq.rV();
    localanG.rV();
    czO localczO = new czO();
    localczO.aJ();
    localczO.setAdaptToContentSize(true);
    localbXx.bb(localczO);
    localczO.brn();
    localczO.rV();
    String str3 = "gemImage";
    czv localczv1 = new czv();
    localczv1.aJ();
    localczv1.setElementMap(localcpa);
    if ((localcpa != null) && (str3 != null))
      localcpa.a(str3, localczv1);
    localczv1.setNonBlocking(true);
    localczv1.setScaled(true);
    localbXx.bb(localczv1);
    localczv1.brn();
    czv localczv2 = localczv1;
    Jg localJg5 = localczv2.getAppearance();
    localJg5.setElementMap(localcpa);
    localczv1.bb(localJg5);
    localJg5.brn();
    bmv localbmv3 = bmv.checkOut();
    localbmv3.setElementMap(localcpa);
    localbmv3.setInsets(new Insets(0, 1, 0, 1));
    localJg5.bb(localbmv3);
    localbmv3.brn();
    localbmv3.rV();
    localJg5.rV();
    cwP localcwP2 = new cwP();
    localcwP2.aJ();
    localcwP2.setElementMap(localcpa);
    localcwP2.setAlign(ajb.dhZ);
    localcwP2.setSize(new Or(24, 24));
    localczv1.bb(localcwP2);
    localcwP2.brn();
    localcwP2.rV();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localczv1.bb(localaAR);
    localaAR.brn();
    aaE localaaE7 = new aaE();
    localaaE7.aJ();
    localaaE7.setElementMap(localcpa);
    localaaE7.setAttribute("texture");
    localaaE7.setField("iconUrl");
    localaAR.bb(localaaE7);
    localaaE7.brn();
    localaaE7.rV();
    localaAR.rV();
    aaE localaaE8 = new aaE();
    localaaE8.aJ();
    localaaE8.setElementMap(localcpa);
    localaaE8.setAttribute("visible");
    localczv1.bb(localaaE8);
    localaaE8.brn();
    anQ localanQ2 = new anQ();
    localanQ2.aJ();
    localanQ2.setElementMap(localcpa);
    localaaE8.bb(localanQ2);
    localanQ2.brn();
    anE localanE = new anE();
    localanE.aJ();
    localanE.setElementMap(localcpa);
    localanQ2.bb(localanE);
    localanE.brn();
    localanE.rV();
    localanQ2.rV();
    localaaE8.rV();
    localczv1.rV();
    localbXx.rV();
    return localbXx;
  }

  public bdj e(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    dRq localdRq1 = dRq.checkOut();
    localdRq1.setElementMap(localcpa);
    localdRq1.setExpandable(false);
    parambdj.bb(localdRq1);
    localdRq1.brn();
    aId localaId1 = aId.checkOut();
    localaId1.setHorizontal(false);
    localaId1.setAlign(aFG.ech);
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
    localbmv1.setInsets(new Insets(3, 0, 0, 0));
    localJg1.bb(localbmv1);
    localbmv1.brn();
    localbmv1.rV();
    localJg1.rV();
    dRq localdRq3 = dRq.checkOut();
    localdRq3.setElementMap(localcpa);
    localdRq3.setStyle("encyclopediaSplashTitle");
    localdRq3.setExpandable(false);
    localdRq1.bb(localdRq3);
    localdRq3.brn();
    dRq localdRq4 = localdRq3;
    Jg localJg2 = localdRq4.getAppearance();
    localJg2.setElementMap(localcpa);
    localdRq3.bb(localJg2);
    localJg2.brn();
    cuR localcuR1 = new cuR();
    localcuR1.aJ();
    localcuR1.setElementMap(localcpa);
    localcuR1.setInsets(new Insets(6, 10, 7, 10));
    localJg2.bb(localcuR1);
    localcuR1.brn();
    localcuR1.rV();
    bmv localbmv2 = bmv.checkOut();
    localbmv2.setElementMap(localcpa);
    localbmv2.setInsets(new Insets(0, 5, 0, 0));
    localJg2.bb(localbmv2);
    localbmv2.brn();
    localbmv2.rV();
    localJg2.rV();
    caF localcaF1 = new caF();
    localcaF1.aJ();
    localcaF1.setElementMap(localcpa);
    localcaF1.setStyle("smallTitle");
    String str = "%gemEffects%";
    str = str.replace("%gemEffects%", cBQ.cxL().mL("gemEffects"));
    localcaF1.setText(str);
    localdRq3.bb(localcaF1);
    localcaF1.brn();
    caF localcaF2 = localcaF1;
    Jg localJg3 = localcaF2.getAppearance();
    localJg3.setElementMap(localcpa);
    localcaF1.bb(localJg3);
    localJg3.brn();
    cAf localcAf = cAf.checkOut();
    localcAf.setElementMap(localcpa);
    localcAf.setColor(new bNa(1.0F, 1.0F, 1.0F, 1.0F));
    localcAf.setName("text");
    localJg3.bb(localcAf);
    localcAf.brn();
    localcAf.rV();
    localJg3.rV();
    localcaF1.rV();
    localdRq3.rV();
    bbp localbbp = new bbp();
    localbbp.aJ();
    localbbp.setElementMap(localcpa);
    localbbp.setVerticalScrollBarPosition(1.0F);
    localbbp.setPrefSize(new Or(240, 60));
    localbbp.setHorizontalScrollBarBehaviour(dOf.mfK);
    localbbp.setMaxSize(new Or(338, 60));
    localbbp.setExpandable(false);
    localdRq1.bb(localbbp);
    localbbp.brn();
    ccG localccG = new ccG();
    localccG.aJ();
    localccG.setElementMap(localcpa);
    localccG.setCellSize(new Or(100.0F, 15));
    localccG.setHorizontal(false);
    localbbp.bb(localccG);
    localccG.brn();
    NK localNK = NK.checkOut();
    localNK.setElementMap(localcpa);
    localNK.setLocal(true);
    localNK.setName("itemDetail");
    localNK.setAttribute("content");
    localNK.setField("gems/gemsEffects");
    localccG.bb(localNK);
    localNK.brn();
    localNK.rV();
    eR localeR1 = new eR();
    localeR1.aJ();
    localeR1.setElementMap(localcpa);
    localccG.bb(localeR1);
    localeR1.brn();
    anQ localanQ1 = new anQ();
    localanQ1.aJ();
    localanQ1.setElementMap(localcpa);
    localeR1.bb(localanQ1);
    localanQ1.brn();
    bJJ localbJJ1 = new bJJ();
    localbJJ1.aJ();
    localbJJ1.setElementMap(localcpa);
    localanQ1.bb(localbJJ1);
    localbJJ1.brn();
    bxx localbxx1 = new bxx();
    localbxx1.aJ();
    localbxx1.setElementMap(localcpa);
    localbJJ1.bb(localbxx1);
    localbxx1.brn();
    anE localanE1 = new anE();
    localanE1.aJ();
    localanE1.setElementMap(localcpa);
    localbxx1.bb(localanE1);
    localanE1.brn();
    localanE1.rV();
    localbxx1.rV();
    dlQ localdlQ1 = new dlQ();
    localdlQ1.aJ();
    localdlQ1.setElementMap(localcpa);
    localdlQ1.setKey("evenIndex");
    localbJJ1.bb(localdlQ1);
    localdlQ1.brn();
    cOk localcOk1 = new cOk();
    localcOk1.aJ();
    localcOk1.setElementMap(localcpa);
    localdlQ1.bb(localcOk1);
    localcOk1.brn();
    localcOk1.rV();
    localdlQ1.rV();
    localbJJ1.rV();
    localanQ1.rV();
    dRq localdRq5 = dRq.checkOut();
    localdRq5.setElementMap(localcpa);
    localeR1.bb(localdRq5);
    localdRq5.brn();
    dRq localdRq6 = localdRq5;
    Jg localJg4 = localdRq6.getAppearance();
    localJg4.setElementMap(localcpa);
    localdRq5.bb(localJg4);
    localJg4.brn();
    jO localjO1 = new jO();
    localjO1.aJ();
    localjO1.setElementMap(localcpa);
    localjO1.setColor(new bNa(0.35F, 0.35F, 0.42F, 0.3F));
    localJg4.bb(localjO1);
    localjO1.brn();
    localjO1.rV();
    cuR localcuR2 = new cuR();
    localcuR2.aJ();
    localcuR2.setElementMap(localcpa);
    localcuR2.setInsets(new Insets(0, 5, 0, 0));
    localJg4.bb(localcuR2);
    localcuR2.brn();
    localcuR2.rV();
    localJg4.rV();
    aId localaId2 = aId.checkOut();
    localaId2.setHorizontal(false);
    localdRq5.bb(localaId2);
    localaId2.brn();
    localaId2.rV();
    cWk localcWk1 = new cWk();
    localcWk1.aJ();
    localcWk1.setElementMap(localcpa);
    localcWk1.setStyle("darkBold");
    localcWk1.setMultiline(false);
    localcWk1.setMinWidth(215);
    localcWk1.setMaxWidth(215);
    localcWk1.setExpandable(false);
    localcWk1.setEnableOnlySelectablePartInteraction(true);
    localdRq5.bb(localcWk1);
    localcWk1.brn();
    cWk localcWk2 = localcWk1;
    Jg localJg5 = localcWk2.getAppearance();
    localJg5.setElementMap(localcpa);
    localcWk1.bb(localJg5);
    localJg5.brn();
    bmv localbmv3 = bmv.checkOut();
    localbmv3.setElementMap(localcpa);
    localbmv3.setInsets(new Insets(0, 5, 0, 0));
    localJg5.bb(localbmv3);
    localbmv3.brn();
    localbmv3.rV();
    localJg5.rV();
    aaE localaaE1 = new aaE();
    localaaE1.aJ();
    localaaE1.setElementMap(localcpa);
    localaaE1.setAttribute("text");
    localcWk1.bb(localaaE1);
    localaaE1.brn();
    localaaE1.rV();
    localcWk1.rV();
    localdRq5.rV();
    localeR1.rV();
    eR localeR2 = new eR();
    localeR2.aJ();
    localeR2.setElementMap(localcpa);
    localccG.bb(localeR2);
    localeR2.brn();
    anQ localanQ2 = new anQ();
    localanQ2.aJ();
    localanQ2.setElementMap(localcpa);
    localeR2.bb(localanQ2);
    localanQ2.brn();
    bJJ localbJJ2 = new bJJ();
    localbJJ2.aJ();
    localbJJ2.setElementMap(localcpa);
    localanQ2.bb(localbJJ2);
    localbJJ2.brn();
    bxx localbxx2 = new bxx();
    localbxx2.aJ();
    localbxx2.setElementMap(localcpa);
    localbJJ2.bb(localbxx2);
    localbxx2.brn();
    anE localanE2 = new anE();
    localanE2.aJ();
    localanE2.setElementMap(localcpa);
    localbxx2.bb(localanE2);
    localanE2.brn();
    localanE2.rV();
    localbxx2.rV();
    dlQ localdlQ2 = new dlQ();
    localdlQ2.aJ();
    localdlQ2.setElementMap(localcpa);
    localdlQ2.setKey("oddIndex");
    localbJJ2.bb(localdlQ2);
    localdlQ2.brn();
    cOk localcOk2 = new cOk();
    localcOk2.aJ();
    localcOk2.setElementMap(localcpa);
    localdlQ2.bb(localcOk2);
    localcOk2.brn();
    localcOk2.rV();
    localdlQ2.rV();
    localbJJ2.rV();
    localanQ2.rV();
    dRq localdRq7 = dRq.checkOut();
    localdRq7.setElementMap(localcpa);
    localeR2.bb(localdRq7);
    localdRq7.brn();
    aId localaId3 = aId.checkOut();
    localaId3.setHorizontal(false);
    localdRq7.bb(localaId3);
    localaId3.brn();
    localaId3.rV();
    dRq localdRq8 = localdRq7;
    Jg localJg6 = localdRq8.getAppearance();
    localJg6.setElementMap(localcpa);
    localdRq7.bb(localJg6);
    localJg6.brn();
    cuR localcuR3 = new cuR();
    localcuR3.aJ();
    localcuR3.setElementMap(localcpa);
    localcuR3.setInsets(new Insets(0, 5, 0, 0));
    localJg6.bb(localcuR3);
    localcuR3.brn();
    localcuR3.rV();
    localJg6.rV();
    cWk localcWk3 = new cWk();
    localcWk3.aJ();
    localcWk3.setElementMap(localcpa);
    localcWk3.setStyle("darkBold");
    localcWk3.setMultiline(false);
    localcWk3.setMinWidth(215);
    localcWk3.setMaxWidth(215);
    localcWk3.setExpandable(false);
    localcWk3.setEnableOnlySelectablePartInteraction(true);
    localdRq7.bb(localcWk3);
    localcWk3.brn();
    cWk localcWk4 = localcWk3;
    Jg localJg7 = localcWk4.getAppearance();
    localJg7.setElementMap(localcpa);
    localcWk3.bb(localJg7);
    localJg7.brn();
    bmv localbmv4 = bmv.checkOut();
    localbmv4.setElementMap(localcpa);
    localbmv4.setInsets(new Insets(0, 5, 0, 0));
    localJg7.bb(localbmv4);
    localbmv4.brn();
    localbmv4.rV();
    localJg7.rV();
    aaE localaaE2 = new aaE();
    localaaE2.aJ();
    localaaE2.setElementMap(localcpa);
    localaaE2.setAttribute("text");
    localcWk3.bb(localaaE2);
    localaaE2.brn();
    localaaE2.rV();
    localcWk3.rV();
    localdRq7.rV();
    localeR2.rV();
    eR localeR3 = new eR();
    localeR3.aJ();
    localeR3.setElementMap(localcpa);
    localccG.bb(localeR3);
    localeR3.brn();
    anQ localanQ3 = new anQ();
    localanQ3.aJ();
    localanQ3.setElementMap(localcpa);
    localeR3.bb(localanQ3);
    localanQ3.brn();
    bJJ localbJJ3 = new bJJ();
    localbJJ3.aJ();
    localbJJ3.setElementMap(localcpa);
    localanQ3.bb(localbJJ3);
    localbJJ3.brn();
    bxx localbxx3 = new bxx();
    localbxx3.aJ();
    localbxx3.setElementMap(localcpa);
    localbJJ3.bb(localbxx3);
    localbxx3.brn();
    aIB localaIB1 = new aIB();
    localaIB1.aJ();
    localaIB1.setElementMap(localcpa);
    localbxx3.bb(localaIB1);
    localaIB1.brn();
    localaIB1.rV();
    localbxx3.rV();
    dlQ localdlQ3 = new dlQ();
    localdlQ3.aJ();
    localdlQ3.setElementMap(localcpa);
    localdlQ3.setKey("oddIndex");
    localbJJ3.bb(localdlQ3);
    localdlQ3.brn();
    cOk localcOk3 = new cOk();
    localcOk3.aJ();
    localcOk3.setElementMap(localcpa);
    localdlQ3.bb(localcOk3);
    localcOk3.brn();
    localcOk3.rV();
    localdlQ3.rV();
    localbJJ3.rV();
    localanQ3.rV();
    dRq localdRq9 = dRq.checkOut();
    localdRq9.setElementMap(localcpa);
    localeR3.bb(localdRq9);
    localdRq9.brn();
    localdRq9.rV();
    localeR3.rV();
    eR localeR4 = new eR();
    localeR4.aJ();
    localeR4.setElementMap(localcpa);
    localccG.bb(localeR4);
    localeR4.brn();
    anQ localanQ4 = new anQ();
    localanQ4.aJ();
    localanQ4.setElementMap(localcpa);
    localeR4.bb(localanQ4);
    localanQ4.brn();
    bJJ localbJJ4 = new bJJ();
    localbJJ4.aJ();
    localbJJ4.setElementMap(localcpa);
    localanQ4.bb(localbJJ4);
    localbJJ4.brn();
    bxx localbxx4 = new bxx();
    localbxx4.aJ();
    localbxx4.setElementMap(localcpa);
    localbJJ4.bb(localbxx4);
    localbxx4.brn();
    aIB localaIB2 = new aIB();
    localaIB2.aJ();
    localaIB2.setElementMap(localcpa);
    localbxx4.bb(localaIB2);
    localaIB2.brn();
    localaIB2.rV();
    localbxx4.rV();
    dlQ localdlQ4 = new dlQ();
    localdlQ4.aJ();
    localdlQ4.setElementMap(localcpa);
    localdlQ4.setKey("evenIndex");
    localbJJ4.bb(localdlQ4);
    localdlQ4.brn();
    cOk localcOk4 = new cOk();
    localcOk4.aJ();
    localcOk4.setElementMap(localcpa);
    localdlQ4.bb(localcOk4);
    localcOk4.brn();
    localcOk4.rV();
    localdlQ4.rV();
    localbJJ4.rV();
    localanQ4.rV();
    dRq localdRq10 = dRq.checkOut();
    localdRq10.setElementMap(localcpa);
    localeR4.bb(localdRq10);
    localdRq10.brn();
    dRq localdRq11 = localdRq10;
    Jg localJg8 = localdRq11.getAppearance();
    localJg8.setElementMap(localcpa);
    localdRq10.bb(localJg8);
    localJg8.brn();
    jO localjO2 = new jO();
    localjO2.aJ();
    localjO2.setElementMap(localcpa);
    localjO2.setColor(new bNa(0.35F, 0.35F, 0.42F, 0.3F));
    localJg8.bb(localjO2);
    localjO2.brn();
    localjO2.rV();
    localJg8.rV();
    localdRq10.rV();
    localeR4.rV();
    localccG.rV();
    localbbp.rV();
    localdRq1.rV();
    return localdRq1;
  }

  public bdj f(bdj parambdj)
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

  public bdj g(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    biy localbiy = new biy();
    localbiy.aJ();
    localbiy.setElementMap(localcpa);
    localbiy.setStyle("close");
    localbiy.setExpandable(false);
    csA localcsA = new csA();
    localcsA.hg("unloadDialog");
    localbiy.setOnClick(localcsA);
    parambdj.bb(localbiy);
    localbiy.brn();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setElementMap(localcpa);
    localcwP.setSize(new Or(-2, -2));
    localcwP.setAlign(ajb.dhV);
    localcwP.setXOffset(-32);
    localcwP.setYOffset(-10);
    localbiy.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    localbiy.rV();
    return localbiy;
  }

  public bdj h(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setElementMap(localcpa);
    localcwP.setSize(new Or(-2, -2));
    localcwP.setAlign(ajb.dhY);
    localcwP.setInitValue(true);
    localcwP.setXOffset(40);
    parambdj.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    return localcwP;
  }
}