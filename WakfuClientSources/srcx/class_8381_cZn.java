import java.awt.Insets;
import java.util.Stack;

public class cZn
  implements cEa
{
  private Stack X = new Stack();
  private cDA Y;

  public bdj a(cDA paramcDA, cpa paramcpa)
  {
    this.Y = paramcDA;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    String str1 = "resourcesCollectorWindow";
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
    caF localcaF1 = new caF();
    localcaF1.aJ();
    localcaF1.setElementMap(localcpa);
    localcaF1.setStyle("StyledBold16White");
    localcaF1.setNonBlocking(true);
    String str2 = "%seedSpreader%";
    str2 = str2.replace("%seedSpreader%", cBQ.cxL().mL("seedSpreader"));
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
    dRq localdRq10 = dRq.checkOut();
    localdRq10.setElementMap(localcpa);
    localdRq9.bb(localdRq10);
    localdRq10.brn();
    aId localaId3 = aId.checkOut();
    localaId3.setHorizontal(false);
    localaId3.setAlign(aFG.ech);
    localdRq10.bb(localaId3);
    localaId3.brn();
    localaId3.rV();
    dRq localdRq11 = dRq.checkOut();
    localdRq11.setElementMap(localcpa);
    localdRq10.bb(localdRq11);
    localdRq11.brn();
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
    cuR localcuR3 = new cuR();
    localcuR3.aJ();
    localcuR3.setElementMap(localcpa);
    localcuR3.setInsets(new Insets(5, 0, 0, 0));
    localJg6.bb(localcuR3);
    localcuR3.brn();
    localcuR3.rV();
    localJg6.rV();
    dRq localdRq13 = dRq.checkOut();
    localdRq13.setElementMap(localcpa);
    localdRq13.setExpandable(false);
    localdRq11.bb(localdRq13);
    localdRq13.brn();
    cwP localcwP3 = new cwP();
    localcwP3.aJ();
    localcwP3.setElementMap(localcpa);
    localcwP3.setSize(new Or(100.0F, 100.0F));
    localcwP3.setAlign(ajb.dhZ);
    localdRq13.bb(localcwP3);
    localcwP3.brn();
    localcwP3.rV();
    dRq localdRq14 = localdRq13;
    Jg localJg7 = localdRq14.getAppearance();
    localJg7.setElementMap(localcpa);
    localdRq13.bb(localJg7);
    localJg7.brn();
    cuR localcuR4 = new cuR();
    localcuR4.aJ();
    localcuR4.setElementMap(localcpa);
    localcuR4.setInsets(new Insets(20, 0, 20, 0));
    localJg7.bb(localcuR4);
    localcuR4.brn();
    localcuR4.rV();
    bmv localbmv3 = bmv.checkOut();
    localbmv3.setElementMap(localcpa);
    localbmv3.setInsets(new Insets(0, 20, 0, 20));
    localJg7.bb(localbmv3);
    localbmv3.brn();
    localbmv3.rV();
    localJg7.rV();
    dRq localdRq15 = dRq.checkOut();
    localdRq15.setElementMap(localcpa);
    localdRq15.setStyle("tiledScroll");
    localdRq15.setExpandable(false);
    localdRq13.bb(localdRq15);
    localdRq15.brn();
    dRq localdRq16 = localdRq15;
    Jg localJg8 = localdRq16.getAppearance();
    localJg8.setElementMap(localcpa);
    localdRq15.bb(localJg8);
    localJg8.brn();
    cuR localcuR5 = new cuR();
    localcuR5.aJ();
    localcuR5.setElementMap(localcpa);
    localcuR5.setInsets(new Insets(5, 20, 10, 20));
    localJg8.bb(localcuR5);
    localcuR5.brn();
    localcuR5.rV();
    bmv localbmv4 = bmv.checkOut();
    localbmv4.setElementMap(localcpa);
    localbmv4.setInsets(new Insets(0, 0, 0, 0));
    localJg8.bb(localbmv4);
    localbmv4.brn();
    localbmv4.rV();
    localJg8.rV();
    dRq localdRq17 = dRq.checkOut();
    localdRq17.setElementMap(localcpa);
    localdRq15.bb(localdRq17);
    localdRq17.brn();
    aId localaId4 = aId.checkOut();
    localaId4.setAlign(aFG.ech);
    localaId4.setHorizontal(false);
    localdRq17.bb(localaId4);
    localaId4.brn();
    localaId4.rV();
    dRq localdRq18 = dRq.checkOut();
    localdRq18.setElementMap(localcpa);
    localdRq18.setStyle("EncyclopediaSplashTitle");
    localdRq18.setPrefSize(new Or(0, 30));
    localdRq18.setExpandable(false);
    localdRq17.bb(localdRq18);
    localdRq18.brn();
    dpm localdpm2 = new dpm();
    localdpm2.aJ();
    localdpm2.setElementMap(localcpa);
    localdpm2.setAlign(aFG.eck);
    localdRq18.bb(localdpm2);
    localdpm2.brn();
    localdpm2.rV();
    dRq localdRq19 = localdRq18;
    Jg localJg9 = localdRq19.getAppearance();
    localJg9.setElementMap(localcpa);
    localdRq18.bb(localJg9);
    localJg9.brn();
    cuR localcuR6 = new cuR();
    localcuR6.aJ();
    localcuR6.setElementMap(localcpa);
    localcuR6.setInsets(new Insets(0, 0, 3, 0));
    localJg9.bb(localcuR6);
    localcuR6.brn();
    localcuR6.rV();
    localJg9.rV();
    aId localaId5 = aId.checkOut();
    localaId5.setAlign(aFG.eck);
    localdRq18.bb(localaId5);
    localaId5.brn();
    localaId5.rV();
    czv localczv1 = new czv();
    localczv1.aJ();
    localczv1.setElementMap(localcpa);
    localczv1.setDisplaySize(new Or(83, 39));
    localczv1.setStyle("NationLeftDecorator");
    localczv1.setExpandable(false);
    localdRq18.bb(localczv1);
    localczv1.brn();
    localczv1.rV();
    cWk localcWk1 = new cWk();
    localcWk1.aJ();
    localcWk1.setElementMap(localcpa);
    localcWk1.setStyle("StyledBold16White");
    localcWk1.setNonBlocking(true);
    localcWk1.setExpandable(false);
    String str4 = "%seedSpreaderDescTitle%";
    str4 = str4.replace("%seedSpreaderDescTitle%", cBQ.cxL().mL("seedSpreaderDescTitle"));
    localcWk1.setText(str4);
    localcWk1.setMinWidth(1);
    localcWk1.setMaxWidth(250);
    localdRq18.bb(localcWk1);
    localcWk1.brn();
    localcWk1.rV();
    czv localczv2 = new czv();
    localczv2.aJ();
    localczv2.setElementMap(localcpa);
    localczv2.setDisplaySize(new Or(83, 39));
    localczv2.setStyle("NationRightDecorator");
    localczv2.setExpandable(false);
    localdRq18.bb(localczv2);
    localczv2.brn();
    localczv2.rV();
    localdRq18.rV();
    dRq localdRq20 = dRq.checkOut();
    localdRq20.setElementMap(localcpa);
    localdRq20.setExpandable(false);
    localdRq17.bb(localdRq20);
    localdRq20.brn();
    czv localczv3 = new czv();
    localczv3.aJ();
    localczv3.setElementMap(localcpa);
    localczv3.setExpandable(false);
    localczv3.setStyle("ResourcesCollectorIllu");
    localdRq20.bb(localczv3);
    localczv3.brn();
    localczv3.rV();
    cWk localcWk2 = new cWk();
    localcWk2.aJ();
    localcWk2.setElementMap(localcpa);
    localcWk2.setStyle("darkBold");
    String str5 = "%seedSpreaderDesc%";
    str5 = str5.replace("%seedSpreaderDesc%", cBQ.cxL().mL("seedSpreaderDesc"));
    localcWk2.setText(str5);
    localcWk2.setMultiline(true);
    localcWk2.setMinWidth(1);
    localcWk2.setMaxWidth(283);
    localcWk2.setExpandable(false);
    localdRq20.bb(localcWk2);
    localcWk2.brn();
    localcWk2.rV();
    localdRq20.rV();
    localdRq17.rV();
    localdRq15.rV();
    localdRq13.rV();
    dRq localdRq21 = dRq.checkOut();
    localdRq21.setElementMap(localcpa);
    localdRq21.setStyle("EncyclopediaPane");
    localdRq21.setNonBlocking(true);
    localdRq11.bb(localdRq21);
    localdRq21.brn();
    cwP localcwP4 = new cwP();
    localcwP4.aJ();
    localcwP4.setElementMap(localcpa);
    localcwP4.setAlign(ajb.dhT);
    localcwP4.setSize(new Or(100.0F, 100.0F));
    localdRq21.bb(localcwP4);
    localcwP4.brn();
    localcwP4.rV();
    localdRq21.rV();
    localdRq11.rV();
    dRq localdRq22 = dRq.checkOut();
    localdRq22.setElementMap(localcpa);
    localdRq22.setStyle("titleBar");
    localdRq10.bb(localdRq22);
    localdRq22.brn();
    dRq localdRq23 = localdRq22;
    Jg localJg10 = localdRq23.getAppearance();
    localJg10.setElementMap(localcpa);
    localdRq22.bb(localJg10);
    localJg10.brn();
    bmv localbmv5 = bmv.checkOut();
    localbmv5.setElementMap(localcpa);
    localbmv5.setInsets(new Insets(0, 10, 0, 10));
    localJg10.bb(localbmv5);
    localbmv5.brn();
    localbmv5.rV();
    cuR localcuR7 = new cuR();
    localcuR7.aJ();
    localcuR7.setElementMap(localcpa);
    localcuR7.setInsets(new Insets(2, 20, 0, 20));
    localJg10.bb(localcuR7);
    localcuR7.brn();
    localcuR7.rV();
    localJg10.rV();
    caF localcaF3 = new caF();
    localcaF3.aJ();
    localcaF3.setElementMap(localcpa);
    localcaF3.setStyle("StyledBold16White");
    localcaF3.setNonBlocking(true);
    String str6 = "%desc.storageZone%";
    str6 = str6.replace("%desc.storageZone%", cBQ.cxL().mL("desc.storageZone"));
    localcaF3.setText(str6);
    localcaF3.setExpandable(false);
    localdRq22.bb(localcaF3);
    localcaF3.brn();
    caF localcaF4 = localcaF3;
    Jg localJg11 = localcaF4.getAppearance();
    localJg11.setElementMap(localcpa);
    ((cwJ)localJg11).setAlign(aFG.eck);
    localcaF3.bb(localJg11);
    localJg11.brn();
    localJg11.rV();
    localcaF3.rV();
    localdRq22.rV();
    dRq localdRq24 = dRq.checkOut();
    localdRq24.setElementMap(localcpa);
    localdRq10.bb(localdRq24);
    localdRq24.brn();
    dRq localdRq25 = localdRq24;
    Jg localJg12 = localdRq25.getAppearance();
    localJg12.setElementMap(localcpa);
    localdRq24.bb(localJg12);
    localJg12.brn();
    bmv localbmv6 = bmv.checkOut();
    localbmv6.setElementMap(localcpa);
    localbmv6.setInsets(new Insets(0, 10, 0, 10));
    localJg12.bb(localbmv6);
    localbmv6.brn();
    localbmv6.rV();
    localJg12.rV();
    czO localczO3 = new czO();
    localczO3.aJ();
    localczO3.setAdaptToContentSize(true);
    localdRq24.bb(localczO3);
    localczO3.brn();
    localczO3.rV();
    dRq localdRq26 = dRq.checkOut();
    localdRq26.setElementMap(localcpa);
    localdRq26.setStyle("caracs");
    localdRq24.bb(localdRq26);
    localdRq26.brn();
    cwP localcwP5 = new cwP();
    localcwP5.aJ();
    localcwP5.setElementMap(localcpa);
    localcwP5.setAlign(ajb.dhZ);
    localcwP5.setSize(new Or(100.0F, 100.0F));
    localdRq26.bb(localcwP5);
    localcwP5.brn();
    localcwP5.rV();
    dRq localdRq27 = localdRq26;
    Jg localJg13 = localdRq27.getAppearance();
    localJg13.setElementMap(localcpa);
    localJg13.setModulationColor(new bNa(0.9F, 0.9F, 0.9F, 1.0F));
    localdRq26.bb(localJg13);
    localJg13.brn();
    bmv localbmv7 = bmv.checkOut();
    localbmv7.setElementMap(localcpa);
    localbmv7.setInsets(new Insets(0, 0, 0, 0));
    localJg13.bb(localbmv7);
    localbmv7.brn();
    localbmv7.rV();
    localJg13.rV();
    localdRq26.rV();
    dRq localdRq28 = dRq.checkOut();
    localdRq28.setElementMap(localcpa);
    localdRq28.setExpandable(false);
    localdRq24.bb(localdRq28);
    localdRq28.brn();
    cwP localcwP6 = new cwP();
    localcwP6.aJ();
    localcwP6.setElementMap(localcpa);
    localcwP6.setAlign(ajb.dhZ);
    localcwP6.setSize(new Or(100.0F, 100.0F));
    localcwP6.setXOffset(3);
    localdRq28.bb(localcwP6);
    localcwP6.brn();
    localcwP6.rV();
    dRq localdRq29 = localdRq28;
    Jg localJg14 = localdRq29.getAppearance();
    localJg14.setElementMap(localcpa);
    localdRq28.bb(localJg14);
    localJg14.brn();
    bmv localbmv8 = bmv.checkOut();
    localbmv8.setElementMap(localcpa);
    localbmv8.setInsets(new Insets(7, 1, 5, 0));
    localJg14.bb(localbmv8);
    localbmv8.brn();
    localbmv8.rV();
    localJg14.rV();
    dRq localdRq30 = dRq.checkOut();
    localdRq30.setElementMap(localcpa);
    localdRq30.setExpandable(false);
    localdRq28.bb(localdRq30);
    localdRq30.brn();
    czO localczO4 = new czO();
    localczO4.aJ();
    localczO4.setAdaptToContentSize(true);
    localdRq30.bb(localczO4);
    localczO4.brn();
    localczO4.rV();
    czv localczv4 = new czv();
    localczv4.aJ();
    localczv4.setElementMap(localcpa);
    localczv4.setNonBlocking(true);
    localczv4.setStyle("FrontManualDecorator");
    localdRq30.bb(localczv4);
    localczv4.brn();
    a(localczv4);
    localczv4.rV();
    b(localdRq30);
    d(localdRq30);
    localdRq30.rV();
    localdRq28.rV();
    localdRq24.rV();
    e(localdRq10);
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
    localcwP.setXOffset(-50);
    parambdj.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    return localcwP;
  }

  public bdj b(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    String str = "seedSlot";
    dRq localdRq = dRq.checkOut();
    localdRq.setElementMap(localcpa);
    if ((localcpa != null) && (str != null))
      localcpa.a(str, localdRq);
    localdRq.setStyle("itemBackground");
    localdRq.setPrefSize(new Or(55, 55));
    parambdj.bb(localdRq);
    localdRq.brn();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setElementMap(localcpa);
    localcwP.setAlign(ajb.dhZ);
    localdRq.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    localdRq.rV();
    return localdRq;
  }

  public bdj d(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    axU localaxU = new axU();
    localaxU.aJ();
    localaxU.setElementMap(localcpa);
    parambdj.bb(localaxU);
    localaxU.brn();
    NK localNK = NK.checkOut();
    localNK.setElementMap(localcpa);
    localNK.setAttribute("content");
    localNK.setName("seedSpreaderItem");
    localaxU.bb(localNK);
    localNK.brn();
    localNK.rV();
    cwP localcwP1 = new cwP();
    localcwP1.aJ();
    localcwP1.setElementMap(localcpa);
    localcwP1.setAlign(ajb.dhZ);
    localcwP1.setSize(new Or(55, 55));
    localaxU.bb(localcwP1);
    localcwP1.brn();
    localcwP1.rV();
    eR localeR = new eR();
    localeR.aJ();
    localeR.setElementMap(localcpa);
    localaxU.bb(localeR);
    localeR.brn();
    bXx localbXx = new bXx();
    localbXx.aJ();
    localbXx.setElementMap(localcpa);
    bQa localbQa = new bQa();
    localbQa.hg("wakfu.seedSpreader:dropSeed");
    localbXx.setOnDrop(localbQa);
    dVA localdVA = new dVA();
    localdVA.hg("wakfu.seedSpreader:removeSeed");
    localbXx.setOnDrag(localdVA);
    localbXx.setNonBlocking(false);
    cCu localcCu = new cCu();
    localcCu.hg("popup(seedPopup)");
    localbXx.setOnPopupDisplay(localcCu);
    jL localjL = new jL();
    localjL.hg("closePopup");
    localbXx.setOnPopupHide(localjL);
    localeR.bb(localbXx);
    localbXx.brn();
    String str1 = "seedPopup";
    anG localanG = new anG();
    localanG.aJ();
    localanG.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localanG);
    localanG.setAlign(aFG.ech);
    localanG.setHotSpotPosition(aFG.ecn);
    localbXx.bb(localanG);
    localanG.brn();
    dRq localdRq1 = dRq.checkOut();
    localdRq1.setElementMap(localcpa);
    localdRq1.setStyle("popup");
    localanG.bb(localdRq1);
    localdRq1.brn();
    cba localcba = cba.checkOut();
    localcba.setElementMap(localcpa);
    localcba.setData(cFu.izR);
    localdRq1.bb(localcba);
    localcba.brn();
    localcba.rV();
    aId localaId = aId.checkOut();
    localaId.setHorizontal(false);
    localdRq1.bb(localaId);
    localaId.brn();
    localaId.rV();
    caF localcaF1 = new caF();
    localcaF1.aJ();
    localcaF1.setElementMap(localcpa);
    localcaF1.setStyle("whiteBold");
    localcaF1.setExpandable(false);
    String str2 = "%seedSpreader.seed%";
    str2 = str2.replace("%seedSpreader.seed%", cBQ.cxL().mL("seedSpreader.seed"));
    localcaF1.setText(str2);
    localdRq1.bb(localcaF1);
    localcaF1.brn();
    caF localcaF2 = localcaF1;
    Jg localJg1 = localcaF2.getAppearance();
    localJg1.setElementMap(localcpa);
    ((cwJ)localJg1).setAlignment(aFG.ecj);
    localcaF1.bb(localJg1);
    localJg1.brn();
    localJg1.rV();
    localcaF1.rV();
    localdRq1.rV();
    localanG.rV();
    dRq localdRq2 = dRq.checkOut();
    localdRq2.setElementMap(localcpa);
    localdRq2.setNonBlocking(true);
    localbXx.bb(localdRq2);
    localdRq2.brn();
    czO localczO = new czO();
    localczO.aJ();
    localczO.setAdaptToContentSize(true);
    localdRq2.bb(localczO);
    localczO.brn();
    localczO.rV();
    czv localczv = new czv();
    localczv.aJ();
    localczv.setElementMap(localcpa);
    localczv.setNonBlocking(true);
    localczv.setDisplaySize(new Or(40, 40));
    localdRq2.bb(localczv);
    localczv.brn();
    cwP localcwP2 = new cwP();
    localcwP2.aJ();
    localcwP2.setElementMap(localcpa);
    localcwP2.setAlign(ajb.dhZ);
    localcwP2.setSize(new Or(100.0F, 100.0F));
    localczv.bb(localcwP2);
    localcwP2.brn();
    localcwP2.rV();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localczv.bb(localaAR);
    localaAR.brn();
    aaE localaaE1 = new aaE();
    localaaE1.aJ();
    localaaE1.setElementMap(localcpa);
    localaaE1.setAttribute("texture");
    localaaE1.setField("iconUrl");
    localaAR.bb(localaaE1);
    localaaE1.brn();
    localaaE1.rV();
    localaAR.rV();
    localczv.rV();
    caF localcaF3 = new caF();
    localcaF3.aJ();
    localcaF3.setElementMap(localcpa);
    localcaF3.setNonBlocking(true);
    localcaF3.setStyle("White10Bordered");
    localdRq2.bb(localcaF3);
    localcaF3.brn();
    aaE localaaE2 = new aaE();
    localaaE2.aJ();
    localaaE2.setElementMap(localcpa);
    localaaE2.setAttribute("visible");
    localaaE2.setField("quantity");
    localcaF3.bb(localaaE2);
    localaaE2.brn();
    anQ localanQ = new anQ();
    localanQ.aJ();
    localanQ.setElementMap(localcpa);
    localaaE2.bb(localanQ);
    localanQ.brn();
    aEJ localaEJ = new aEJ();
    localaEJ.aJ();
    localaEJ.setElementMap(localcpa);
    localaEJ.setValue("1");
    localanQ.bb(localaEJ);
    localaEJ.brn();
    localaEJ.rV();
    localanQ.rV();
    localaaE2.rV();
    cwP localcwP3 = new cwP();
    localcwP3.aJ();
    localcwP3.setElementMap(localcpa);
    localcwP3.setAlign(ajb.did);
    localcaF3.bb(localcwP3);
    localcwP3.brn();
    localcwP3.rV();
    caF localcaF4 = localcaF3;
    Jg localJg2 = localcaF4.getAppearance();
    localJg2.setElementMap(localcpa);
    localcaF3.bb(localJg2);
    localJg2.brn();
    bmv localbmv = bmv.checkOut();
    localbmv.setElementMap(localcpa);
    localbmv.setInsets(new Insets(0, 6, 6, 0));
    localJg2.bb(localbmv);
    localbmv.brn();
    localbmv.rV();
    localJg2.rV();
    aaE localaaE3 = new aaE();
    localaaE3.aJ();
    localaaE3.setElementMap(localcpa);
    localaaE3.setAttribute("text");
    localaaE3.setField("quantity");
    localcaF3.bb(localaaE3);
    localaaE3.brn();
    localaaE3.rV();
    localcaF3.rV();
    localdRq2.rV();
    localbXx.rV();
    localeR.rV();
    localaxU.rV();
    return localaxU;
  }

  public bdj e(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    biy localbiy = new biy();
    localbiy.aJ();
    localbiy.setElementMap(localcpa);
    localbiy.setExpandable(false);
    csA localcsA = new csA();
    localcsA.hg("wakfu.seedSpreader:valid");
    localbiy.setOnClick(localcsA);
    String str = "%valid%";
    str = str.replace("%valid%", cBQ.cxL().mL("valid"));
    localbiy.setText(str);
    parambdj.bb(localbiy);
    localbiy.brn();
    dpm localdpm = new dpm();
    localdpm.aJ();
    localdpm.setElementMap(localcpa);
    localdpm.setAlign(aFG.eck);
    localbiy.bb(localdpm);
    localdpm.brn();
    localdpm.rV();
    NK localNK = NK.checkOut();
    localNK.setElementMap(localcpa);
    localNK.setAttribute("enabled");
    localNK.setName("seedSpreaderDirty");
    localbiy.bb(localNK);
    localNK.brn();
    localNK.rV();
    localbiy.rV();
    return localbiy;
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
    localcsA.hg("wakfu.seedSpreader:closeWindow");
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
    localcwP.setSize(new Or(-2, -2));
    localcwP.setAlign(ajb.dhY);
    localcwP.setInitValue(true);
    parambdj.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    return localcwP;
  }
}