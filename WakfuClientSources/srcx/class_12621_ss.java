import java.awt.Insets;
import java.util.Stack;

public class ss
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
    czO localczO = new czO();
    localczO.aJ();
    localczO.setAdaptToContentSize(true);
    localbpn.bb(localczO);
    localczO.brn();
    localczO.rV();
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
    String str1 = "%dimensionalBagFleaRegister.title%";
    str1 = str1.replace("%dimensionalBagFleaRegister.title%", cBQ.cxL().mL("dimensionalBagFleaRegister.title"));
    localcaF1.setText(str1);
    localdRq6.bb(localcaF1);
    localcaF1.brn();
    caF localcaF2 = localcaF1;
    Jg localJg4 = localcaF2.getAppearance();
    localJg4.setElementMap(localcpa);
    ((cwJ)localJg4).setAlign(aFG.eck);
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
    dpm localdpm2 = new dpm();
    localdpm2.aJ();
    localdpm2.setElementMap(localcpa);
    localdpm2.setAlign(aFG.ech);
    localdRq9.bb(localdpm2);
    localdpm2.brn();
    localdpm2.rV();
    aId localaId3 = aId.checkOut();
    localaId3.setHorizontal(false);
    localdRq9.bb(localaId3);
    localaId3.brn();
    localaId3.rV();
    dRq localdRq10 = localdRq9;
    Jg localJg6 = localdRq10.getAppearance();
    localJg6.setElementMap(localcpa);
    localdRq9.bb(localJg6);
    localJg6.brn();
    bmv localbmv3 = bmv.checkOut();
    localbmv3.setElementMap(localcpa);
    localbmv3.setInsets(new Insets(0, 0, 0, 0));
    localJg6.bb(localbmv3);
    localbmv3.brn();
    localbmv3.rV();
    localJg6.rV();
    dRq localdRq11 = dRq.checkOut();
    localdRq11.setElementMap(localcpa);
    localdRq11.setStyle("flat");
    localdRq9.bb(localdRq11);
    localdRq11.brn();
    caF localcaF3 = new caF();
    localcaF3.aJ();
    localcaF3.setElementMap(localcpa);
    localcaF3.setStyle("bold");
    String str3 = "%market.location%";
    str3 = str3.replace("%market.location%", cBQ.cxL().mL("market.location"));
    localcaF3.setText(str3);
    localcaF3.setExpandable(false);
    localcaF3.setPrefSize(new Or(150, 0));
    localdRq11.bb(localcaF3);
    localcaF3.brn();
    caF localcaF4 = localcaF3;
    Jg localJg7 = localcaF4.getAppearance();
    localJg7.setElementMap(localcpa);
    localcaF3.bb(localJg7);
    localJg7.brn();
    bmv localbmv4 = bmv.checkOut();
    localbmv4.setElementMap(localcpa);
    localbmv4.setInsets(new Insets(0, 3, 0, 3));
    localJg7.bb(localbmv4);
    localbmv4.brn();
    localbmv4.rV();
    localJg7.rV();
    localcaF3.rV();
    dRq localdRq12 = dRq.checkOut();
    localdRq12.setElementMap(localcpa);
    localdRq12.setStyle("ShortcutRowBackgroundFull");
    localdRq12.setExpandable(true);
    localdRq12.setPrefSize(new Or(150, 0));
    localdRq11.bb(localdRq12);
    localdRq12.brn();
    dRq localdRq13 = localdRq12;
    Jg localJg8 = localdRq13.getAppearance();
    localJg8.setElementMap(localcpa);
    localdRq12.bb(localJg8);
    localJg8.brn();
    cuR localcuR3 = new cuR();
    localcuR3.aJ();
    localcuR3.setElementMap(localcpa);
    localcuR3.setInsets(new Insets(2, 5, 2, 5));
    localJg8.bb(localcuR3);
    localcuR3.brn();
    localcuR3.rV();
    localJg8.rV();
    caF localcaF5 = new caF();
    localcaF5.aJ();
    localcaF5.setElementMap(localcpa);
    localcaF5.setStyle("bold");
    localdRq12.bb(localcaF5);
    localcaF5.brn();
    caF localcaF6 = localcaF5;
    Jg localJg9 = localcaF6.getAppearance();
    localJg9.setElementMap(localcpa);
    ((cwJ)localJg9).setAlign(aFG.ecl);
    localcaF5.bb(localJg9);
    localJg9.brn();
    localJg9.rV();
    NK localNK1 = NK.checkOut();
    localNK1.setElementMap(localcpa);
    localNK1.setName("market.flea.register");
    localNK1.setAttribute("text");
    localNK1.setField("marketName");
    localcaF5.bb(localNK1);
    localNK1.brn();
    localNK1.rV();
    localcaF5.rV();
    localdRq12.rV();
    localdRq11.rV();
    dRq localdRq14 = dRq.checkOut();
    localdRq14.setElementMap(localcpa);
    localdRq14.setStyle("flat");
    localdRq9.bb(localdRq14);
    localdRq14.brn();
    caF localcaF7 = new caF();
    localcaF7.aJ();
    localcaF7.setElementMap(localcpa);
    localcaF7.setStyle("bold");
    String str4 = "%market.taxPercentage%";
    str4 = str4.replace("%market.taxPercentage%", cBQ.cxL().mL("market.taxPercentage"));
    localcaF7.setText(str4);
    localcaF7.setExpandable(false);
    localcaF7.setPrefSize(new Or(150, 0));
    localdRq14.bb(localcaF7);
    localcaF7.brn();
    caF localcaF8 = localcaF7;
    Jg localJg10 = localcaF8.getAppearance();
    localJg10.setElementMap(localcpa);
    localcaF7.bb(localJg10);
    localJg10.brn();
    bmv localbmv5 = bmv.checkOut();
    localbmv5.setElementMap(localcpa);
    localbmv5.setInsets(new Insets(0, 3, 0, 3));
    localJg10.bb(localbmv5);
    localbmv5.brn();
    localbmv5.rV();
    localJg10.rV();
    localcaF7.rV();
    dRq localdRq15 = dRq.checkOut();
    localdRq15.setElementMap(localcpa);
    localdRq15.setStyle("ShortcutRowBackgroundFull");
    localdRq15.setExpandable(true);
    localdRq15.setPrefSize(new Or(150, 0));
    localdRq14.bb(localdRq15);
    localdRq15.brn();
    dRq localdRq16 = localdRq15;
    Jg localJg11 = localdRq16.getAppearance();
    localJg11.setElementMap(localcpa);
    localdRq15.bb(localJg11);
    localJg11.brn();
    cuR localcuR4 = new cuR();
    localcuR4.aJ();
    localcuR4.setElementMap(localcpa);
    localcuR4.setInsets(new Insets(2, 5, 2, 5));
    localJg11.bb(localcuR4);
    localcuR4.brn();
    localcuR4.rV();
    localJg11.rV();
    caF localcaF9 = new caF();
    localcaF9.aJ();
    localcaF9.setElementMap(localcpa);
    localcaF9.setStyle("bold");
    localdRq15.bb(localcaF9);
    localcaF9.brn();
    caF localcaF10 = localcaF9;
    Jg localJg12 = localcaF10.getAppearance();
    localJg12.setElementMap(localcpa);
    ((cwJ)localJg12).setAlign(aFG.ecl);
    localcaF9.bb(localJg12);
    localJg12.brn();
    localJg12.rV();
    NK localNK2 = NK.checkOut();
    localNK2.setElementMap(localcpa);
    localNK2.setName("market.flea.register");
    localNK2.setAttribute("text");
    localNK2.setField("taxPercentage");
    localcaF9.bb(localNK2);
    localNK2.brn();
    localNK2.rV();
    localcaF9.rV();
    localdRq15.rV();
    localdRq14.rV();
    dRq localdRq17 = dRq.checkOut();
    localdRq17.setElementMap(localcpa);
    localdRq17.setStyle("flat");
    localdRq9.bb(localdRq17);
    localdRq17.brn();
    caF localcaF11 = new caF();
    localcaF11.aJ();
    localcaF11.setElementMap(localcpa);
    localcaF11.setStyle("bold");
    String str5 = "%market.fleaValue%";
    str5 = str5.replace("%market.fleaValue%", cBQ.cxL().mL("market.fleaValue"));
    localcaF11.setText(str5);
    localcaF11.setExpandable(false);
    localcaF11.setPrefSize(new Or(150, 0));
    localdRq17.bb(localcaF11);
    localcaF11.brn();
    caF localcaF12 = localcaF11;
    Jg localJg13 = localcaF12.getAppearance();
    localJg13.setElementMap(localcpa);
    localcaF11.bb(localJg13);
    localJg13.brn();
    bmv localbmv6 = bmv.checkOut();
    localbmv6.setElementMap(localcpa);
    localbmv6.setInsets(new Insets(0, 3, 0, 3));
    localJg13.bb(localbmv6);
    localbmv6.brn();
    localbmv6.rV();
    localJg13.rV();
    localcaF11.rV();
    dRq localdRq18 = dRq.checkOut();
    localdRq18.setElementMap(localcpa);
    localdRq18.setStyle("ShortcutRowBackgroundFull");
    localdRq18.setExpandable(true);
    localdRq18.setPrefSize(new Or(150, 0));
    localdRq17.bb(localdRq18);
    localdRq18.brn();
    dRq localdRq19 = localdRq18;
    Jg localJg14 = localdRq19.getAppearance();
    localJg14.setElementMap(localcpa);
    localdRq18.bb(localJg14);
    localJg14.brn();
    cuR localcuR5 = new cuR();
    localcuR5.aJ();
    localcuR5.setElementMap(localcpa);
    localcuR5.setInsets(new Insets(2, 5, 2, 5));
    localJg14.bb(localcuR5);
    localcuR5.brn();
    localcuR5.rV();
    localJg14.rV();
    caF localcaF13 = new caF();
    localcaF13.aJ();
    localcaF13.setElementMap(localcpa);
    localcaF13.setStyle("bold");
    localdRq18.bb(localcaF13);
    localcaF13.brn();
    caF localcaF14 = localcaF13;
    Jg localJg15 = localcaF14.getAppearance();
    localJg15.setElementMap(localcpa);
    ((cwJ)localJg15).setAlign(aFG.ecl);
    localcaF13.bb(localJg15);
    localJg15.brn();
    bmv localbmv7 = bmv.checkOut();
    localbmv7.setElementMap(localcpa);
    localbmv7.setInsets(new Insets(0, 0, 0, 2));
    localJg15.bb(localbmv7);
    localbmv7.brn();
    localbmv7.rV();
    localJg15.rV();
    NK localNK3 = NK.checkOut();
    localNK3.setElementMap(localcpa);
    localNK3.setName("market.flea.register");
    localNK3.setAttribute("text");
    localNK3.setField("totalValue");
    localcaF13.bb(localNK3);
    localNK3.brn();
    localNK3.rV();
    localcaF13.rV();
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
    dRq localdRq20 = dRq.checkOut();
    localdRq20.setElementMap(localcpa);
    localdRq20.setStyle("flat");
    localdRq9.bb(localdRq20);
    localdRq20.brn();
    caF localcaF15 = new caF();
    localcaF15.aJ();
    localcaF15.setElementMap(localcpa);
    localcaF15.setStyle("bold");
    String str6 = "%duration.short%";
    str6 = str6.replace("%duration.short%", cBQ.cxL().mL("duration.short"));
    localcaF15.setText(str6);
    localcaF15.setExpandable(false);
    localcaF15.setPrefSize(new Or(150, 0));
    localdRq20.bb(localcaF15);
    localcaF15.brn();
    caF localcaF16 = localcaF15;
    Jg localJg16 = localcaF16.getAppearance();
    localJg16.setElementMap(localcpa);
    localcaF15.bb(localJg16);
    localJg16.brn();
    bmv localbmv8 = bmv.checkOut();
    localbmv8.setElementMap(localcpa);
    localbmv8.setInsets(new Insets(0, 3, 0, 3));
    localJg16.bb(localbmv8);
    localbmv8.brn();
    localbmv8.rV();
    localJg16.rV();
    localcaF15.rV();
    ddG localddG = new ddG();
    localddG.aJ();
    localddG.setElementMap(localcpa);
    localddG.setStyle("blue");
    localddG.setExpandable(true);
    localddG.setPrefSize(new Or(150, 15));
    dTZ localdTZ = new dTZ();
    localdTZ.hg("wakfu.dimensionalBagFleaRegister:selectDuration");
    localddG.setOnListSelectionChange(localdTZ);
    localdRq20.bb(localddG);
    localddG.brn();
    NK localNK4 = NK.checkOut();
    localNK4.setElementMap(localcpa);
    localNK4.setName("market.flea.register");
    localNK4.setAttribute("content");
    localNK4.setField("availableDurations");
    localddG.bb(localNK4);
    localNK4.brn();
    localNK4.rV();
    NK localNK5 = NK.checkOut();
    localNK5.setElementMap(localcpa);
    localNK5.setName("market.flea.register");
    localNK5.setAttribute("selectedValue");
    localNK5.setField("selectedDuration");
    localddG.bb(localNK5);
    localNK5.brn();
    localNK5.rV();
    axU localaxU = new axU();
    localaxU.aJ();
    localaxU.setElementMap(localcpa);
    localddG.bb(localaxU);
    localaxU.brn();
    eR localeR = new eR();
    localeR.aJ();
    localeR.setElementMap(localcpa);
    localaxU.bb(localeR);
    localeR.brn();
    caF localcaF17 = new caF();
    localcaF17.aJ();
    localcaF17.setElementMap(localcpa);
    localcaF17.setNonBlocking(true);
    localcaF17.setStyle("whiteBold");
    localeR.bb(localcaF17);
    localcaF17.brn();
    caF localcaF18 = localcaF17;
    Jg localJg17 = localcaF18.getAppearance();
    localJg17.setElementMap(localcpa);
    ((cwJ)localJg17).setAlign(aFG.ecl);
    localcaF17.bb(localJg17);
    localJg17.brn();
    bmv localbmv9 = bmv.checkOut();
    localbmv9.setElementMap(localcpa);
    localbmv9.setInsets(new Insets(0, 0, 0, 3));
    localJg17.bb(localbmv9);
    localbmv9.brn();
    localbmv9.rV();
    localJg17.rV();
    dpm localdpm3 = new dpm();
    localdpm3.aJ();
    localdpm3.setElementMap(localcpa);
    localdpm3.setAlign(aFG.eck);
    localcaF17.bb(localdpm3);
    localdpm3.brn();
    localdpm3.rV();
    a(localcaF17);
    localcaF17.rV();
    localeR.rV();
    localaxU.rV();
    b(localddG);
    localddG.rV();
    localdRq20.rV();
    d(localdRq9);
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
    aaE localaaE = new aaE();
    localaaE.aJ();
    localaaE.setElementMap(localcpa);
    localaaE.setAttribute("text");
    localaaE.setField("description");
    parambdj.bb(localaaE);
    localaaE.brn();
    localaaE.rV();
    return localaaE;
  }

  public bdj b(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    ccG localccG = new ccG();
    localccG.aJ();
    localccG.setElementMap(localcpa);
    localccG.setHorizontal(false);
    localccG.setCellSize(new Or(100.0F, 16));
    parambdj.bb(localccG);
    localccG.brn();
    eR localeR = new eR();
    localeR.aJ();
    localeR.setElementMap(localcpa);
    localccG.bb(localeR);
    localeR.brn();
    caF localcaF1 = new caF();
    localcaF1.aJ();
    localcaF1.setElementMap(localcpa);
    localcaF1.setNonBlocking(true);
    localcaF1.setStyle("whiteBold");
    localeR.bb(localcaF1);
    localcaF1.brn();
    aaE localaaE = new aaE();
    localaaE.aJ();
    localaaE.setElementMap(localcpa);
    localaaE.setAttribute("text");
    localaaE.setField("description");
    localcaF1.bb(localaaE);
    localaaE.brn();
    localaaE.rV();
    caF localcaF2 = localcaF1;
    Jg localJg = localcaF2.getAppearance();
    localJg.setElementMap(localcpa);
    ((cwJ)localJg).setAlign(aFG.eck);
    localcaF1.bb(localJg);
    localJg.brn();
    localJg.rV();
    localcaF1.rV();
    localeR.rV();
    localccG.rV();
    return localccG;
  }

  public bdj d(bdj parambdj)
  {
    cpa localcpa = (cpa)this.X.peek();
    dRq localdRq1 = dRq.checkOut();
    localdRq1.setElementMap(localcpa);
    localdRq1.setStyle("flat");
    parambdj.bb(localdRq1);
    localdRq1.brn();
    caF localcaF1 = new caF();
    localcaF1.aJ();
    localcaF1.setElementMap(localcpa);
    localcaF1.setStyle("bold");
    String str = "%market.registerCost%";
    str = str.replace("%market.registerCost%", cBQ.cxL().mL("market.registerCost"));
    localcaF1.setText(str);
    localcaF1.setExpandable(false);
    localcaF1.setPrefSize(new Or(150, 0));
    localdRq1.bb(localcaF1);
    localcaF1.brn();
    caF localcaF2 = localcaF1;
    Jg localJg1 = localcaF2.getAppearance();
    localJg1.setElementMap(localcpa);
    localcaF1.bb(localJg1);
    localJg1.brn();
    bmv localbmv1 = bmv.checkOut();
    localbmv1.setElementMap(localcpa);
    localbmv1.setInsets(new Insets(0, 3, 0, 3));
    localJg1.bb(localbmv1);
    localbmv1.brn();
    localbmv1.rV();
    localJg1.rV();
    localcaF1.rV();
    dRq localdRq2 = dRq.checkOut();
    localdRq2.setElementMap(localcpa);
    localdRq2.setStyle("ShortcutRowBackgroundFull");
    localdRq2.setExpandable(true);
    localdRq2.setPrefSize(new Or(150, 0));
    localdRq1.bb(localdRq2);
    localdRq2.brn();
    dRq localdRq3 = localdRq2;
    Jg localJg2 = localdRq3.getAppearance();
    localJg2.setElementMap(localcpa);
    localdRq2.bb(localJg2);
    localJg2.brn();
    cuR localcuR = new cuR();
    localcuR.aJ();
    localcuR.setElementMap(localcpa);
    localcuR.setInsets(new Insets(2, 5, 2, 5));
    localJg2.bb(localcuR);
    localcuR.brn();
    localcuR.rV();
    localJg2.rV();
    cWk localcWk1 = new cWk();
    localcWk1.aJ();
    localcWk1.setElementMap(localcpa);
    localcWk1.setStyle("bold");
    localdRq2.bb(localcWk1);
    localcWk1.brn();
    cWk localcWk2 = localcWk1;
    Jg localJg3 = localcWk2.getAppearance();
    localJg3.setElementMap(localcpa);
    ((cwJ)localJg3).setAlign(aFG.ecl);
    localcWk1.bb(localJg3);
    localJg3.brn();
    bmv localbmv2 = bmv.checkOut();
    localbmv2.setElementMap(localcpa);
    localbmv2.setInsets(new Insets(0, 0, 0, 2));
    localJg3.bb(localbmv2);
    localbmv2.brn();
    localbmv2.rV();
    localJg3.rV();
    NK localNK = NK.checkOut();
    localNK.setElementMap(localcpa);
    localNK.setName("market.flea.register");
    localNK.setAttribute("text");
    localNK.setField("dutyDescription");
    localcWk1.bb(localNK);
    localNK.brn();
    localNK.rV();
    localcWk1.rV();
    czv localczv = new czv();
    localczv.aJ();
    localczv.setElementMap(localcpa);
    localczv.setStyle("kamas");
    localczv.setExpandable(false);
    localdRq2.bb(localczv);
    localczv.brn();
    localczv.rV();
    localdRq2.rV();
    localdRq1.rV();
    return localdRq1;
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
    biy localbiy1 = new biy();
    localbiy1.aJ();
    localbiy1.setElementMap(localcpa);
    localbiy1.setStyle("yellow");
    localbiy1.setExpandable(false);
    csA localcsA = new csA();
    localcsA.hg("wakfu.dimensionalBagFleaRegister:validate");
    localbiy1.setOnClick(localcsA);
    localdRq.bb(localbiy1);
    localbiy1.brn();
    NK localNK = NK.checkOut();
    localNK.setElementMap(localcpa);
    localNK.setName("market.flea.register");
    localNK.setAttribute("enabled");
    localNK.setField("hasEnoughMoney");
    localbiy1.bb(localNK);
    localNK.brn();
    localNK.rV();
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
    localcuR.setInsets(new Insets(3, 3, 3, 3));
    localJg.bb(localcuR);
    localcuR.brn();
    localcuR.rV();
    localJg.rV();
    localbiy1.rV();
    czv localczv = new czv();
    localczv.aJ();
    localczv.setElementMap(localcpa);
    localczv.setStyle("apply");
    localczv.setDisplaySize(new Or(16, 16));
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
    localcsA.hg("wakfu.dimensionalBagFleaRegister:cancel");
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
    localcwP.setAlign(ajb.dhZ);
    parambdj.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    return localcwP;
  }
}