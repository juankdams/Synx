import java.awt.Insets;
import java.util.Stack;

public class drV
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
    localcaF1.setMinWidth(250);
    localcaF1.setMaxWidth(250);
    localdRq6.bb(localcaF1);
    localcaF1.brn();
    caF localcaF2 = localcaF1;
    Jg localJg4 = localcaF2.getAppearance();
    localJg4.setElementMap(localcpa);
    ((cwJ)localJg4).setAlignment(aFG.eck);
    localcaF1.bb(localJg4);
    localJg4.brn();
    bmv localbmv2 = bmv.checkOut();
    localbmv2.setElementMap(localcpa);
    localbmv2.setInsets(new Insets(0, 0, 0, 5));
    localJg4.bb(localbmv2);
    localbmv2.brn();
    localbmv2.rV();
    localJg4.rV();
    NK localNK1 = NK.checkOut();
    localNK1.setElementMap(localcpa);
    localNK1.setLocal(true);
    localNK1.setAttribute("text");
    localNK1.setName("pet");
    localNK1.setField("name");
    localcaF1.bb(localNK1);
    localNK1.brn();
    localNK1.rV();
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
    bmv localbmv3 = bmv.checkOut();
    localbmv3.setElementMap(localcpa);
    localbmv3.setInsets(new Insets(0, 12, 0, 12));
    localJg5.bb(localbmv3);
    localbmv3.brn();
    localbmv3.rV();
    localJg5.rV();
    String str1 = "windowContentContainer";
    dRq localdRq9 = dRq.checkOut();
    localdRq9.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localdRq9);
    localdRq7.bb(localdRq9);
    localdRq9.brn();
    String str2 = "pet";
    avo localavo = new avo();
    localavo.aJ();
    localavo.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localavo);
    localdRq9.bb(localavo);
    localavo.brn();
    NK localNK2 = NK.checkOut();
    localNK2.setElementMap(localcpa);
    localNK2.setLocal(true);
    localNK2.setAttribute("value");
    localNK2.setName("pet");
    localavo.bb(localNK2);
    localNK2.brn();
    localNK2.rV();
    localavo.rV();
    dRq localdRq10 = dRq.checkOut();
    localdRq10.setElementMap(localcpa);
    localdRq9.bb(localdRq10);
    localdRq10.brn();
    aId localaId3 = aId.checkOut();
    localaId3.setAlign(aFG.ech);
    localaId3.setHorizontal(false);
    localdRq10.bb(localaId3);
    localaId3.brn();
    localaId3.rV();
    dRq localdRq11 = dRq.checkOut();
    localdRq11.setElementMap(localcpa);
    localdRq11.setExpandable(false);
    localdRq11.setNonBlocking(false);
    csA localcsA1 = new csA();
    localcsA1.hg("wakfu.pet:changeDirection(petDisplay)");
    localdRq11.setOnClick(localcsA1);
    localdRq11.setPrefSize(new Or(90, 85));
    localdRq10.bb(localdRq11);
    localdRq11.brn();
    dpm localdpm2 = new dpm();
    localdpm2.aJ();
    localdpm2.setElementMap(localcpa);
    localdpm2.setAlign(aFG.eck);
    localdRq11.bb(localdpm2);
    localdpm2.brn();
    localdpm2.rV();
    czO localczO2 = new czO();
    localczO2.aJ();
    localczO2.setAdaptToContentSize(true);
    localdRq11.bb(localczO2);
    localczO2.brn();
    localczO2.rV();
    dRq localdRq12 = localdRq11;
    Jg localJg6 = localdRq12.getAppearance();
    localJg6.setElementMap(localcpa);
    localdRq11.bb(localJg6);
    localJg6.brn();
    bmv localbmv4 = bmv.checkOut();
    localbmv4.setElementMap(localcpa);
    localbmv4.setInsets(new Insets(0, 5, 0, 5));
    localJg6.bb(localbmv4);
    localbmv4.brn();
    localbmv4.rV();
    localJg6.rV();
    dRq localdRq13 = dRq.checkOut();
    localdRq13.setElementMap(localcpa);
    localdRq13.setNonBlocking(false);
    localdRq11.bb(localdRq13);
    localdRq13.brn();
    cwP localcwP3 = new cwP();
    localcwP3.aJ();
    localcwP3.setElementMap(localcpa);
    localcwP3.setAlign(ajb.dhZ);
    localdRq13.bb(localcwP3);
    localcwP3.brn();
    localcwP3.rV();
    String str3 = "petDisplay";
    auC localauC = new auC();
    localauC.aJ();
    localauC.setElementMap(localcpa);
    if ((localcpa != null) && (str3 != null))
      localcpa.a(str3, localauC);
    localauC.setOffsetY(-20.0F);
    localauC.setOffsetX(0.0F);
    localauC.setScale(1.7F);
    localauC.setAnimName("AnimStatiqueCadre");
    localauC.setDirection(2);
    localdRq13.bb(localauC);
    localauC.brn();
    NK localNK3 = NK.checkOut();
    localNK3.setElementMap(localcpa);
    localNK3.setLocal(true);
    localNK3.setName("pet");
    localNK3.setAttribute("animatedElement");
    localNK3.setField("animatedElement");
    localauC.bb(localNK3);
    localNK3.brn();
    localNK3.rV();
    NK localNK4 = NK.checkOut();
    localNK4.setElementMap(localcpa);
    localNK4.setLocal(true);
    localNK4.setName("pet");
    localNK4.setAttribute("equipment");
    localNK4.setField("petAnimationEquipment");
    localauC.bb(localNK4);
    localNK4.brn();
    localNK4.rV();
    localauC.rV();
    localdRq13.rV();
    localdRq11.rV();
    cWk localcWk1 = new cWk();
    localcWk1.aJ();
    localcWk1.setElementMap(localcpa);
    localcWk1.setStyle("darkBold");
    localcWk1.setExpandable(false);
    localcWk1.setMultiline(true);
    localcWk1.setMinWidth(150);
    localcWk1.setMaxWidth(200);
    localdRq10.bb(localcWk1);
    localcWk1.brn();
    NK localNK5 = NK.checkOut();
    localNK5.setElementMap(localcpa);
    localNK5.setAttribute("text");
    localNK5.setName("petColorPreviewText");
    localcWk1.bb(localNK5);
    localNK5.brn();
    localNK5.rV();
    cWk localcWk2 = localcWk1;
    Jg localJg7 = localcWk2.getAppearance();
    localJg7.setElementMap(localcpa);
    ((cwJ)localJg7).setJustify(true);
    localcWk1.bb(localJg7);
    localJg7.brn();
    localJg7.rV();
    cWk localcWk3 = localcWk1;
    Jg localJg8 = localcWk3.getAppearance();
    localJg8.setElementMap(localcpa);
    localcWk1.bb(localJg8);
    localJg8.brn();
    bmv localbmv5 = bmv.checkOut();
    localbmv5.setElementMap(localcpa);
    localbmv5.setInsets(new Insets(0, 15, 0, 15));
    localJg8.bb(localbmv5);
    localbmv5.brn();
    localbmv5.rV();
    localJg8.rV();
    localcWk1.rV();
    dRq localdRq14 = dRq.checkOut();
    localdRq14.setElementMap(localcpa);
    localdRq14.setExpandable(false);
    localdRq10.bb(localdRq14);
    localdRq14.brn();
    dRq localdRq15 = localdRq14;
    Jg localJg9 = localdRq15.getAppearance();
    localJg9.setElementMap(localcpa);
    localdRq14.bb(localJg9);
    localJg9.brn();
    bmv localbmv6 = bmv.checkOut();
    localbmv6.setElementMap(localcpa);
    localbmv6.setInsets(new Insets(5, 0, 10, 0));
    localJg9.bb(localbmv6);
    localbmv6.brn();
    localbmv6.rV();
    localJg9.rV();
    cba localcba1 = cba.checkOut();
    localcba1.setElementMap(localcpa);
    localcba1.setData(cFu.izT);
    localdRq14.bb(localcba1);
    localcba1.brn();
    localcba1.rV();
    bTm localbTm = new bTm();
    localbTm.aJ();
    localdRq14.bb(localbTm);
    localbTm.brn();
    localbTm.rV();
    dRq localdRq16 = dRq.checkOut();
    localdRq16.setElementMap(localcpa);
    localdRq16.setExpandable(false);
    localdRq14.bb(localdRq16);
    localdRq16.brn();
    dRq localdRq17 = localdRq16;
    Jg localJg10 = localdRq17.getAppearance();
    localJg10.setElementMap(localcpa);
    localdRq16.bb(localJg10);
    localJg10.brn();
    bmv localbmv7 = bmv.checkOut();
    localbmv7.setElementMap(localcpa);
    localbmv7.setInsets(new Insets(0, 10, 0, 0));
    localJg10.bb(localbmv7);
    localbmv7.brn();
    localbmv7.rV();
    localJg10.rV();
    cba localcba2 = cba.checkOut();
    localcba2.setElementMap(localcpa);
    localcba2.setData(cFu.izV);
    localdRq16.bb(localcba2);
    localcba2.brn();
    localcba2.rV();
    czO localczO3 = new czO();
    localczO3.aJ();
    localczO3.setAdaptToContentSize(true);
    localdRq16.bb(localczO3);
    localczO3.brn();
    localczO3.rV();
    biy localbiy1 = new biy();
    localbiy1.aJ();
    localbiy1.setElementMap(localcpa);
    localbiy1.setStyle("yellow");
    localbiy1.setClickSoundId(600084);
    localbiy1.setExpandable(false);
    cCu localcCu1 = new cCu();
    localcCu1.hg("popup(cancelPopup)");
    localbiy1.setOnPopupDisplay(localcCu1);
    jL localjL1 = new jL();
    localjL1.hg("closePopup");
    localbiy1.setOnPopupHide(localjL1);
    csA localcsA2 = new csA();
    localcsA2.hg("wakfu.pet:cancelColorPreview");
    localbiy1.setOnClick(localcsA2);
    localdRq16.bb(localbiy1);
    localbiy1.brn();
    String str4 = "cancelPopup";
    anG localanG = new anG();
    localanG.aJ();
    localanG.setElementMap(localcpa);
    if ((localcpa != null) && (str4 != null))
      localcpa.a(str4, localanG);
    localanG.setAlign(aFG.ech);
    localanG.setHotSpotPosition(aFG.ecn);
    localbiy1.bb(localanG);
    localanG.brn();
    dRq localdRq18 = dRq.checkOut();
    localdRq18.setElementMap(localcpa);
    localdRq18.setPrefSize(new Or(10, 0));
    localdRq18.setStyle("popup");
    localanG.bb(localdRq18);
    localdRq18.brn();
    cba localcba3 = cba.checkOut();
    localcba3.setElementMap(localcpa);
    localcba3.setData(cFu.izV);
    localdRq18.bb(localcba3);
    localcba3.brn();
    localcba3.rV();
    caF localcaF3 = new caF();
    localcaF3.aJ();
    localcaF3.setElementMap(localcpa);
    localcaF3.setStyle("PopupInformation");
    String str5 = "%cancel%";
    str5 = str5.replace("%cancel%", cBQ.cxL().mL("cancel"));
    localcaF3.setText(str5);
    localdRq18.bb(localcaF3);
    localcaF3.brn();
    caF localcaF4 = localcaF3;
    Jg localJg11 = localcaF4.getAppearance();
    localJg11.setElementMap(localcpa);
    ((cwJ)localJg11).setAlign(aFG.ecj);
    localcaF3.bb(localJg11);
    localJg11.brn();
    localJg11.rV();
    localcaF3.rV();
    localdRq18.rV();
    localanG.rV();
    cwP localcwP4 = new cwP();
    localcwP4.aJ();
    localcwP4.setElementMap(localcpa);
    localcwP4.setAlign(ajb.dhZ);
    localcwP4.setSize(new Or(100.0F, 100.0F));
    localbiy1.bb(localcwP4);
    localcwP4.brn();
    localcwP4.rV();
    biy localbiy2 = localbiy1;
    Jg localJg12 = localbiy2.getAppearance();
    localJg12.setElementMap(localcpa);
    localbiy1.bb(localJg12);
    localJg12.brn();
    cuR localcuR3 = new cuR();
    localcuR3.aJ();
    localcuR3.setElementMap(localcpa);
    localcuR3.setInsets(new Insets(3, 3, 3, 3));
    localJg12.bb(localcuR3);
    localcuR3.brn();
    localcuR3.rV();
    localJg12.rV();
    localbiy1.rV();
    czv localczv = new czv();
    localczv.aJ();
    localczv.setElementMap(localcpa);
    localczv.setStyle("cancel");
    localczv.setDisplaySize(new Or(16, 16));
    localczv.setNonBlocking(true);
    localdRq16.bb(localczv);
    localczv.brn();
    cwP localcwP5 = new cwP();
    localcwP5.aJ();
    localcwP5.setElementMap(localcpa);
    localcwP5.setAlign(ajb.dhZ);
    localcwP5.setSize(new Or(100.0F, 100.0F));
    localczv.bb(localcwP5);
    localcwP5.brn();
    localcwP5.rV();
    localczv.rV();
    localdRq16.rV();
    dRq localdRq19 = dRq.checkOut();
    localdRq19.setElementMap(localcpa);
    localdRq19.setExpandable(false);
    localdRq14.bb(localdRq19);
    localdRq19.brn();
    dRq localdRq20 = localdRq19;
    Jg localJg13 = localdRq20.getAppearance();
    localJg13.setElementMap(localcpa);
    localdRq19.bb(localJg13);
    localJg13.brn();
    bmv localbmv8 = bmv.checkOut();
    localbmv8.setElementMap(localcpa);
    localbmv8.setInsets(new Insets(0, 0, 0, 10));
    localJg13.bb(localbmv8);
    localbmv8.brn();
    localbmv8.rV();
    localJg13.rV();
    cba localcba4 = cba.checkOut();
    localcba4.setElementMap(localcpa);
    localcba4.setData(cFu.izU);
    localdRq19.bb(localcba4);
    localcba4.brn();
    localcba4.rV();
    czO localczO4 = new czO();
    localczO4.aJ();
    localczO4.setAdaptToContentSize(true);
    localdRq19.bb(localczO4);
    localczO4.brn();
    localczO4.rV();
    biy localbiy3 = new biy();
    localbiy3.aJ();
    localbiy3.setElementMap(localcpa);
    localbiy3.setClickSoundId(600002);
    localbiy3.setStyle("yellow");
    localbiy3.setExpandable(false);
    cCu localcCu2 = new cCu();
    localcCu2.hg("popup(validPopup)");
    localbiy3.setOnPopupDisplay(localcCu2);
    jL localjL2 = new jL();
    localjL2.hg("closePopup");
    localbiy3.setOnPopupHide(localjL2);
    csA localcsA3 = new csA();
    localcsA3.hg("wakfu.pet:validColorPreview(pet)");
    localbiy3.setOnClick(localcsA3);
    localdRq19.bb(localbiy3);
    localbiy3.brn();
    a(localbiy3);
    b(localbiy3);
    d(localbiy3);
    localbiy3.rV();
    e(localdRq19);
    localdRq19.rV();
    localdRq14.rV();
    localdRq10.rV();
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
    String str1 = "validPopup";
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
    localcba.setData(cFu.izV);
    localdRq.bb(localcba);
    localcba.brn();
    localcba.rV();
    caF localcaF1 = new caF();
    localcaF1.aJ();
    localcaF1.setElementMap(localcpa);
    localcaF1.setStyle("PopupInformation");
    String str2 = "%valid%";
    str2 = str2.replace("%valid%", cBQ.cxL().mL("valid"));
    localcaF1.setText(str2);
    localdRq.bb(localcaF1);
    localcaF1.brn();
    caF localcaF2 = localcaF1;
    Jg localJg = localcaF2.getAppearance();
    localJg.setElementMap(localcpa);
    ((cwJ)localJg).setAlign(aFG.ecj);
    localcaF1.bb(localJg);
    localJg.brn();
    localJg.rV();
    localcaF1.rV();
    localdRq.rV();
    localanG.rV();
    return localanG;
  }

  public bdj b(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setElementMap(localcpa);
    localcwP.setAlign(ajb.dhZ);
    localcwP.setSize(new Or(100.0F, 100.0F));
    parambdj.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    return localcwP;
  }

  public bdj d(bdj parambdj)
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
    localcuR.setInsets(new Insets(3, 3, 3, 3));
    localJg.bb(localcuR);
    localcuR.brn();
    localcuR.rV();
    localJg.rV();
    return localJg;
  }

  public bdj e(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    czv localczv = new czv();
    localczv.aJ();
    localczv.setElementMap(localcpa);
    localczv.setStyle("apply");
    localczv.setDisplaySize(new Or(16, 16));
    localczv.setNonBlocking(true);
    parambdj.bb(localczv);
    localczv.brn();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setElementMap(localcpa);
    localcwP.setAlign(ajb.dhZ);
    localcwP.setSize(new Or(100.0F, 100.0F));
    localczv.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    localczv.rV();
    return localczv;
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
    localcwP.setAlign(ajb.dhZ);
    localcwP.setInitValue(true);
    parambdj.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    return localcwP;
  }
}