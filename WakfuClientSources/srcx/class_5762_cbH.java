import java.awt.Insets;
import java.util.Stack;

public class cbH
  implements cEa
{
  private Stack X = new Stack();
  private cDA Y;

  public bdj a(cDA paramcDA, cpa paramcpa)
  {
    this.Y = paramcDA;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    String str1 = "confirmPurchaseWindow";
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
    dpm localdpm1 = new dpm();
    localdpm1.aJ();
    localdpm1.setElementMap(localcpa);
    localdpm1.setAlign(aFG.eck);
    localdRq6.bb(localdpm1);
    localdpm1.brn();
    localdpm1.rV();
    cWk localcWk1 = new cWk();
    localcWk1.aJ();
    localcWk1.setElementMap(localcpa);
    localcWk1.setStyle("StyledBold16White");
    localcWk1.setNonBlocking(true);
    localcWk1.setMinWidth(250);
    localdRq6.bb(localcWk1);
    localcWk1.brn();
    NK localNK1 = NK.checkOut();
    localNK1.setElementMap(localcpa);
    localNK1.setName("fleaSelectedGood");
    localNK1.setAttribute("text");
    localNK1.setField("name");
    localcWk1.bb(localNK1);
    localNK1.brn();
    localNK1.rV();
    cWk localcWk2 = localcWk1;
    Jg localJg4 = localcWk2.getAppearance();
    localJg4.setElementMap(localcpa);
    ((cwJ)localJg4).setAlign(aFG.eck);
    localcWk1.bb(localJg4);
    localJg4.brn();
    bmv localbmv2 = bmv.checkOut();
    localbmv2.setElementMap(localcpa);
    localbmv2.setInsets(new Insets(0, 0, 0, 0));
    localJg4.bb(localbmv2);
    localbmv2.brn();
    localbmv2.rV();
    localJg4.rV();
    localcWk1.rV();
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
    String str2 = "windowContentContainer";
    dRq localdRq9 = dRq.checkOut();
    localdRq9.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localdRq9);
    localdRq7.bb(localdRq9);
    localdRq9.brn();
    dRq localdRq10 = dRq.checkOut();
    localdRq10.setElementMap(localcpa);
    localdRq9.bb(localdRq10);
    localdRq10.brn();
    aId localaId3 = aId.checkOut();
    localaId3.setHorizontal(true);
    localdRq10.bb(localaId3);
    localaId3.brn();
    localaId3.rV();
    dRq localdRq11 = dRq.checkOut();
    localdRq11.setElementMap(localcpa);
    localdRq10.bb(localdRq11);
    localdRq11.brn();
    aId localaId4 = aId.checkOut();
    localaId4.setHorizontal(true);
    localdRq11.bb(localaId4);
    localaId4.brn();
    localaId4.rV();
    dRq localdRq12 = dRq.checkOut();
    localdRq12.setElementMap(localcpa);
    localdRq12.setStyle("flat");
    localdRq12.setPrefSize(new Or(0, 35));
    localdRq11.bb(localdRq12);
    localdRq12.brn();
    dpm localdpm2 = new dpm();
    localdpm2.aJ();
    localdpm2.setElementMap(localcpa);
    localdpm2.setAlign(aFG.eck);
    localdRq12.bb(localdpm2);
    localdpm2.brn();
    localdpm2.rV();
    aId localaId5 = aId.checkOut();
    localaId5.setHorizontal(false);
    localdRq12.bb(localaId5);
    localaId5.brn();
    localaId5.rV();
    caF localcaF1 = new caF();
    localcaF1.aJ();
    localcaF1.setElementMap(localcpa);
    String str3 = "%quantity%%colon%";
    str3 = str3.replace("%quantity%", cBQ.cxL().mL("quantity"));
    str3 = str3.replace("%colon%", cBQ.cxL().mL("colon"));
    localcaF1.setText(str3);
    localcaF1.setStyle("bold");
    localdRq12.bb(localcaF1);
    localcaF1.brn();
    caF localcaF2 = localcaF1;
    Jg localJg6 = localcaF2.getAppearance();
    localJg6.setElementMap(localcpa);
    ((cwJ)localJg6).setAlign(aFG.eck);
    localcaF1.bb(localJg6);
    localJg6.brn();
    localJg6.rV();
    localcaF1.rV();
    dRq localdRq13 = dRq.checkOut();
    localdRq13.setElementMap(localcpa);
    localdRq13.setStyle("ShortcutRowBackgroundFull");
    localdRq13.setPrefSize(new Or(150, 0));
    localdRq12.bb(localdRq13);
    localdRq13.brn();
    dRq localdRq14 = localdRq13;
    Jg localJg7 = localdRq14.getAppearance();
    localJg7.setElementMap(localcpa);
    localdRq13.bb(localJg7);
    localJg7.brn();
    cuR localcuR3 = new cuR();
    localcuR3.aJ();
    localcuR3.setElementMap(localcpa);
    localcuR3.setInsets(new Insets(2, 5, 2, 5));
    localJg7.bb(localcuR3);
    localcuR3.brn();
    localcuR3.rV();
    localJg7.rV();
    biy localbiy1 = new biy();
    localbiy1.aJ();
    localbiy1.setElementMap(localcpa);
    localbiy1.setStyle("yellowLeftArrow");
    localbiy1.setExpandable(false);
    aMB localaMB1 = new aMB();
    localaMB1.hg("wakfu.flea:decreaseQuantity");
    localbiy1.setOnMousePress(localaMB1);
    localdRq13.bb(localbiy1);
    localbiy1.brn();
    biy localbiy2 = localbiy1;
    Jg localJg8 = localbiy2.getAppearance();
    localJg8.setElementMap(localcpa);
    localbiy1.bb(localJg8);
    localJg8.brn();
    bmv localbmv4 = bmv.checkOut();
    localbmv4.setElementMap(localcpa);
    localbmv4.setInsets(new Insets(0, 0, 0, 1));
    localJg8.bb(localbmv4);
    localbmv4.brn();
    localbmv4.rV();
    localJg8.rV();
    localbiy1.rV();
    String str4 = "qtyTextEditor";
    aTp localaTp1 = new aTp();
    localaTp1.aJ();
    localaTp1.setElementMap(localcpa);
    if ((localcpa != null) && (str4 != null))
      localcpa.a(str4, localaTp1);
    localaTp1.setStyle("dark");
    localaTp1.setPrefSize(new Or(30, 0));
    localaTp1.setMaxChars(3);
    localaTp1.setRestrict("[0-9]+");
    localaTp1.setFocused(true);
    localaTp1.setExpandable(false);
    dbp localdbp = new dbp();
    localdbp.hg("wakfu.flea:validQuantity(qtyTextEditor)");
    localaTp1.setOnKeyType(localdbp);
    localdRq13.bb(localaTp1);
    localaTp1.brn();
    aTp localaTp2 = localaTp1;
    Jg localJg9 = localaTp2.getAppearance();
    localJg9.setElementMap(localcpa);
    ((cwJ)localJg9).setAlign(aFG.ecl);
    localaTp1.bb(localJg9);
    localJg9.brn();
    bmv localbmv5 = bmv.checkOut();
    localbmv5.setElementMap(localcpa);
    localbmv5.setInsets(new Insets(0, 0, 0, 0));
    localJg9.bb(localbmv5);
    localbmv5.brn();
    localbmv5.rV();
    localJg9.rV();
    localaTp1.rV();
    biy localbiy3 = new biy();
    localbiy3.aJ();
    localbiy3.setElementMap(localcpa);
    localbiy3.setStyle("yellowRightArrow");
    localbiy3.setExpandable(false);
    aMB localaMB2 = new aMB();
    localaMB2.hg("wakfu.flea:increaseQuantity");
    localbiy3.setOnMousePress(localaMB2);
    localdRq13.bb(localbiy3);
    localbiy3.brn();
    biy localbiy4 = localbiy3;
    Jg localJg10 = localbiy4.getAppearance();
    localJg10.setElementMap(localcpa);
    localbiy3.bb(localJg10);
    localJg10.brn();
    bmv localbmv6 = bmv.checkOut();
    localbmv6.setElementMap(localcpa);
    localbmv6.setInsets(new Insets(0, 1, 0, 2));
    localJg10.bb(localbmv6);
    localbmv6.brn();
    localbmv6.rV();
    localJg10.rV();
    localbiy3.rV();
    dRq localdRq15 = dRq.checkOut();
    localdRq15.setElementMap(localcpa);
    localdRq15.setStyle("backgroundPopupLight");
    localdRq15.setExpandable(false);
    localdRq13.bb(localdRq15);
    localdRq15.brn();
    dRq localdRq16 = localdRq15;
    Jg localJg11 = localdRq16.getAppearance();
    localJg11.setElementMap(localcpa);
    localdRq15.bb(localJg11);
    localJg11.brn();
    cuR localcuR4 = new cuR();
    localcuR4.aJ();
    localcuR4.setElementMap(localcpa);
    localcuR4.setInsets(new Insets(0, 5, 0, 5));
    localJg11.bb(localcuR4);
    localcuR4.brn();
    localcuR4.rV();
    localJg11.rV();
    caF localcaF3 = new caF();
    localcaF3.aJ();
    localcaF3.setElementMap(localcpa);
    localcaF3.setExpandable(false);
    localcaF3.setStyle("whitebold");
    localdRq15.bb(localcaF3);
    localcaF3.brn();
    NK localNK2 = NK.checkOut();
    localNK2.setElementMap(localcpa);
    localNK2.setAttribute("text");
    localNK2.setName("currentItemStackQtyPlusTotal");
    localcaF3.bb(localNK2);
    localNK2.brn();
    localNK2.rV();
    localcaF3.rV();
    localdRq15.rV();
    localdRq13.rV();
    localdRq12.rV();
    dRq localdRq17 = dRq.checkOut();
    localdRq17.setElementMap(localcpa);
    localdRq17.setStyle("flat");
    localdRq17.setPrefSize(new Or(0, 35));
    localdRq11.bb(localdRq17);
    localdRq17.brn();
    dpm localdpm3 = new dpm();
    localdpm3.aJ();
    localdpm3.setElementMap(localcpa);
    localdpm3.setAlign(aFG.eck);
    localdRq17.bb(localdpm3);
    localdpm3.brn();
    localdpm3.rV();
    aId localaId6 = aId.checkOut();
    localaId6.setHorizontal(false);
    localdRq17.bb(localaId6);
    localaId6.brn();
    localaId6.rV();
    caF localcaF4 = new caF();
    localcaF4.aJ();
    localcaF4.setElementMap(localcpa);
    String str5 = "%totalPrice%";
    str5 = str5.replace("%totalPrice%", cBQ.cxL().mL("totalPrice"));
    localcaF4.setText(str5);
    localcaF4.setStyle("bold");
    localdRq17.bb(localcaF4);
    localcaF4.brn();
    caF localcaF5 = localcaF4;
    Jg localJg12 = localcaF5.getAppearance();
    localJg12.setElementMap(localcpa);
    ((cwJ)localJg12).setAlign(aFG.eck);
    localcaF4.bb(localJg12);
    localJg12.brn();
    localJg12.rV();
    localcaF4.rV();
    dRq localdRq18 = dRq.checkOut();
    localdRq18.setElementMap(localcpa);
    localdRq18.setStyle("ShortcutRowBackgroundFull");
    localdRq18.setPrefSize(new Or(100, 0));
    localdRq17.bb(localdRq18);
    localdRq18.brn();
    dRq localdRq19 = localdRq18;
    Jg localJg13 = localdRq19.getAppearance();
    localJg13.setElementMap(localcpa);
    localdRq18.bb(localJg13);
    localJg13.brn();
    cuR localcuR5 = new cuR();
    localcuR5.aJ();
    localcuR5.setElementMap(localcpa);
    localcuR5.setInsets(new Insets(2, 5, 2, 5));
    localJg13.bb(localcuR5);
    localcuR5.brn();
    localcuR5.rV();
    localJg13.rV();
    caF localcaF6 = new caF();
    localcaF6.aJ();
    localcaF6.setElementMap(localcpa);
    localcaF6.setStyle("bold");
    localdRq18.bb(localcaF6);
    localcaF6.brn();
    caF localcaF7 = localcaF6;
    Jg localJg14 = localcaF7.getAppearance();
    localJg14.setElementMap(localcpa);
    ((cwJ)localJg14).setAlign(aFG.ecl);
    localcaF6.bb(localJg14);
    localJg14.brn();
    bmv localbmv7 = bmv.checkOut();
    localbmv7.setElementMap(localcpa);
    localbmv7.setInsets(new Insets(0, 0, 0, 3));
    localJg14.bb(localbmv7);
    localbmv7.brn();
    localbmv7.rV();
    NK localNK3 = NK.checkOut();
    localNK3.setElementMap(localcpa);
    localNK3.setAttribute("textColor");
    localNK3.setName("currentItemTotalPrice");
    localJg14.bb(localNK3);
    localNK3.brn();
    anQ localanQ = new anQ();
    localanQ.aJ();
    localanQ.setElementMap(localcpa);
    localanQ.setValue("1,0,0");
    localanQ.setElseValue("0,0,0");
    localNK3.bb(localanQ);
    localanQ.brn();
    aEJ localaEJ = new aEJ();
    localaEJ.aJ();
    localaEJ.setElementMap(localcpa);
    localanQ.bb(localaEJ);
    localaEJ.brn();
    NK localNK4 = NK.checkOut();
    localNK4.setElementMap(localcpa);
    localNK4.setAttribute("value");
    localNK4.setName("kamas");
    localaEJ.bb(localNK4);
    localNK4.brn();
    localNK4.rV();
    localaEJ.rV();
    localanQ.rV();
    localNK3.rV();
    localJg14.rV();
    NK localNK5 = NK.checkOut();
    localNK5.setElementMap(localcpa);
    localNK5.setAttribute("text");
    localNK5.setName("currentItemTotalPrice");
    localcaF6.bb(localNK5);
    localNK5.brn();
    localNK5.rV();
    localcaF6.rV();
    czv localczv = new czv();
    localczv.aJ();
    localczv.setElementMap(localcpa);
    localczv.setStyle("kamas");
    localczv.setExpandable(false);
    localdRq18.bb(localczv);
    localczv.brn();
    localczv.rV();
    localdRq18.rV();
    localdRq17.rV();
    localdRq11.rV();
    dRq localdRq20 = dRq.checkOut();
    localdRq20.setElementMap(localcpa);
    localdRq10.bb(localdRq20);
    localdRq20.brn();
    aId localaId7 = aId.checkOut();
    localaId7.setAlign(aFG.ecl);
    localdRq20.bb(localaId7);
    localaId7.brn();
    localaId7.rV();
    dRq localdRq21 = dRq.checkOut();
    localdRq21.setElementMap(localcpa);
    localdRq21.setExpandable(false);
    localdRq20.bb(localdRq21);
    localdRq21.brn();
    czO localczO2 = new czO();
    localczO2.aJ();
    localczO2.setAdaptToContentSize(true);
    localdRq21.bb(localczO2);
    localczO2.brn();
    localczO2.rV();
    biy localbiy5 = new biy();
    localbiy5.aJ();
    localbiy5.setElementMap(localcpa);
    localbiy5.setStyle("yellow");
    csA localcsA = new csA();
    localcsA.hg("wakfu.flea:cancelPurchase");
    localbiy5.setOnClick(localcsA);
    localdRq21.bb(localbiy5);
    localbiy5.brn();
    a(localbiy5);
    b(localbiy5);
    localbiy5.rV();
    d(localdRq21);
    localdRq21.rV();
    e(localdRq20);
    localdRq20.rV();
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

  public bdj b(bdj parambdj)
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
    localcuR.setInsets(new Insets(7, 7, 7, 7));
    localJg.bb(localcuR);
    localcuR.brn();
    localcuR.rV();
    localJg.rV();
    return localJg;
  }

  public bdj d(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    czv localczv = new czv();
    localczv.aJ();
    localczv.setElementMap(localcpa);
    localczv.setStyle("cancel");
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

  public bdj e(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    dRq localdRq = dRq.checkOut();
    localdRq.setElementMap(localcpa);
    localdRq.setExpandable(false);
    parambdj.bb(localdRq);
    localdRq.brn();
    czO localczO = new czO();
    localczO.aJ();
    localczO.setAdaptToContentSize(true);
    localdRq.bb(localczO);
    localczO.brn();
    localczO.rV();
    String str = "confirmButton";
    biy localbiy1 = new biy();
    localbiy1.aJ();
    localbiy1.setElementMap(localcpa);
    if ((localcpa != null) && (str != null))
      localcpa.a(str, localbiy1);
    localbiy1.setStyle("yellow");
    localbiy1.setExpandable(false);
    csA localcsA = new csA();
    localcsA.hg("wakfu.flea:confirmPurchase");
    localbiy1.setOnClick(localcsA);
    localdRq.bb(localbiy1);
    localbiy1.brn();
    NK localNK1 = NK.checkOut();
    localNK1.setElementMap(localcpa);
    localNK1.setAttribute("enabled");
    localNK1.setName("currentItemTotalPrice");
    localbiy1.bb(localNK1);
    localNK1.brn();
    anQ localanQ = new anQ();
    localanQ.aJ();
    localanQ.setElementMap(localcpa);
    localNK1.bb(localanQ);
    localanQ.brn();
    dDu localdDu = new dDu();
    localdDu.aJ();
    localdDu.setElementMap(localcpa);
    localanQ.bb(localdDu);
    localdDu.brn();
    aEJ localaEJ = new aEJ();
    localaEJ.aJ();
    localaEJ.setElementMap(localcpa);
    localdDu.bb(localaEJ);
    localaEJ.brn();
    NK localNK2 = NK.checkOut();
    localNK2.setElementMap(localcpa);
    localNK2.setAttribute("value");
    localNK2.setName("kamas");
    localaEJ.bb(localNK2);
    localNK2.brn();
    localNK2.rV();
    localaEJ.rV();
    localdDu.rV();
    localanQ.rV();
    localNK1.rV();
    cwP localcwP1 = new cwP();
    localcwP1.aJ();
    localcwP1.setElementMap(localcpa);
    localcwP1.setAlign(ajb.dhZ);
    localcwP1.setSize(new Or(100.0F, 100.0F));
    localbiy1.bb(localcwP1);
    localcwP1.brn();
    localcwP1.rV();
    biy localbiy2 = localbiy1;
    Jg localJg = localbiy2.getAppearance();
    localJg.setElementMap(localcpa);
    localbiy1.bb(localJg);
    localJg.brn();
    cuR localcuR = new cuR();
    localcuR.aJ();
    localcuR.setElementMap(localcpa);
    localcuR.setInsets(new Insets(7, 7, 7, 7));
    localJg.bb(localcuR);
    localcuR.brn();
    localcuR.rV();
    localJg.rV();
    localbiy1.rV();
    czv localczv = new czv();
    localczv.aJ();
    localczv.setElementMap(localcpa);
    localczv.setStyle("apply");
    localczv.setNonBlocking(true);
    localdRq.bb(localczv);
    localczv.brn();
    cwP localcwP2 = new cwP();
    localcwP2.aJ();
    localcwP2.setElementMap(localcpa);
    localcwP2.setAlign(ajb.dhZ);
    localcwP2.setSize(new Or(100.0F, 100.0F));
    localczv.bb(localcwP2);
    localcwP2.brn();
    localcwP2.rV();
    localczv.rV();
    localdRq.rV();
    return localdRq;
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
    localcwP.setXOffset(-18);
    localcwP.setYOffset(-12);
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
    localcwP.setResizeOnce(true);
    parambdj.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    return localcwP;
  }
}