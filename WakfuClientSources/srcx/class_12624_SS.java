import java.awt.Insets;
import java.util.Stack;

public class SS
  implements cEa
{
  private Stack X = new Stack();
  private cDA Y;

  public bdj a(cDA paramcDA, cpa paramcpa)
  {
    this.Y = paramcDA;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    String str1 = "mainContainer";
    dRq localdRq1 = dRq.checkOut();
    localdRq1.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localdRq1);
    localdRq1.setStyle("AchievementUnlockedSplashScaled");
    csA localcsA = new csA();
    localcsA.hg("wakfu.controlCenter:openAchievementsDialog(achievement)");
    localdRq1.setOnClick(localcsA);
    localdRq1.setPrefSize(new Or(311, 135));
    localdRq1.brn();
    String str2 = "achievement";
    avo localavo = new avo();
    localavo.aJ();
    localavo.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localavo);
    localdRq1.bb(localavo);
    localavo.brn();
    NK localNK1 = NK.checkOut();
    localNK1.setElementMap(localcpa);
    localNK1.setName("unlockedAchievement");
    localNK1.setAttribute("value");
    localavo.bb(localNK1);
    localNK1.brn();
    localNK1.rV();
    localavo.rV();
    cwP localcwP1 = new cwP();
    localcwP1.aJ();
    localcwP1.setElementMap(localcpa);
    localcwP1.setAlign(ajb.dhT);
    localcwP1.setYOffset(-50);
    localdRq1.bb(localcwP1);
    localcwP1.brn();
    localcwP1.rV();
    dRq localdRq2 = localdRq1;
    Jg localJg1 = localdRq2.getAppearance();
    localJg1.setElementMap(localcpa);
    localdRq1.bb(localJg1);
    localJg1.brn();
    cuR localcuR = new cuR();
    localcuR.aJ();
    localcuR.setElementMap(localcpa);
    localcuR.setInsets(new Insets(0, 25, 0, 75));
    localJg1.bb(localcuR);
    localcuR.brn();
    localcuR.rV();
    localJg1.rV();
    aId localaId1 = aId.checkOut();
    localaId1.setHorizontal(false);
    localdRq1.bb(localaId1);
    localaId1.brn();
    localaId1.rV();
    dRq localdRq3 = dRq.checkOut();
    localdRq3.setElementMap(localcpa);
    localdRq3.setNonBlocking(true);
    localdRq3.setExpandable(false);
    localdRq1.bb(localdRq3);
    localdRq3.brn();
    dpm localdpm = new dpm();
    localdpm.aJ();
    localdpm.setElementMap(localcpa);
    localdpm.setAlign(aFG.ecj);
    localdRq3.bb(localdpm);
    localdpm.brn();
    localdpm.rV();
    dRq localdRq4 = localdRq3;
    Jg localJg2 = localdRq4.getAppearance();
    localJg2.setElementMap(localcpa);
    localdRq3.bb(localJg2);
    localJg2.brn();
    bmv localbmv1 = bmv.checkOut();
    localbmv1.setElementMap(localcpa);
    localbmv1.setInsets(new Insets(0, 35, 0, 0));
    localJg2.bb(localbmv1);
    localbmv1.brn();
    localbmv1.rV();
    localJg2.rV();
    aId localaId2 = aId.checkOut();
    localaId2.setAlign(aFG.ecj);
    localdRq3.bb(localaId2);
    localaId2.brn();
    localaId2.rV();
    String str3 = "splashContainer";
    dRq localdRq5 = dRq.checkOut();
    localdRq5.setElementMap(localcpa);
    if ((localcpa != null) && (str3 != null))
      localcpa.a(str3, localdRq5);
    localdRq5.setExpandable(false);
    localdRq5.setPrefSize(new Or(45, 40));
    localdRq5.setNonBlocking(true);
    localdRq3.bb(localdRq5);
    localdRq5.brn();
    String str4 = "icon";
    czv localczv1 = new czv();
    localczv1.aJ();
    localczv1.setElementMap(localcpa);
    if ((localcpa != null) && (str4 != null))
      localcpa.a(str4, localczv1);
    localczv1.setNonBlocking(true);
    localczv1.setExpandable(false);
    localczv1.setDisplaySize(new Or(40, 40));
    localdRq5.bb(localczv1);
    localczv1.brn();
    cwP localcwP2 = new cwP();
    localcwP2.aJ();
    localcwP2.setElementMap(localcpa);
    localcwP2.setAlign(ajb.dhZ);
    localczv1.bb(localcwP2);
    localcwP2.brn();
    localcwP2.rV();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localczv1.bb(localaAR);
    localaAR.brn();
    NK localNK2 = NK.checkOut();
    localNK2.setElementMap(localcpa);
    localNK2.setName("unlockedAchievement");
    localNK2.setAttribute("texture");
    localNK2.setField("iconUrl");
    localaAR.bb(localNK2);
    localNK2.brn();
    localNK2.rV();
    localaAR.rV();
    localczv1.rV();
    localdRq5.rV();
    String str5 = "text";
    caF localcaF1 = new caF();
    localcaF1.aJ();
    localcaF1.setElementMap(localcpa);
    if ((localcpa != null) && (str5 != null))
      localcpa.a(str5, localcaF1);
    localcaF1.setStyle("title");
    localcaF1.setExpandable(false);
    localcaF1.setNonBlocking(true);
    localdRq3.bb(localcaF1);
    localcaF1.brn();
    caF localcaF2 = localcaF1;
    Jg localJg3 = localcaF2.getAppearance();
    localJg3.setElementMap(localcpa);
    ((cwJ)localJg3).setAlignment(aFG.eck);
    localcaF1.bb(localJg3);
    localJg3.brn();
    cAf localcAf1 = cAf.checkOut();
    localcAf1.setElementMap(localcpa);
    localcAf1.setColor(new bNa(1.0F, 1.0F, 1.0F, 1.0F));
    localJg3.bb(localcAf1);
    localcAf1.brn();
    localcAf1.rV();
    bmv localbmv2 = bmv.checkOut();
    localbmv2.setElementMap(localcpa);
    localbmv2.setInsets(new Insets(0, 10, 0, 0));
    localJg3.bb(localbmv2);
    localbmv2.brn();
    localbmv2.rV();
    localJg3.rV();
    NK localNK3 = NK.checkOut();
    localNK3.setElementMap(localcpa);
    localNK3.setName("unlockedAchievement");
    localNK3.setAttribute("text");
    localNK3.setField("isQuest");
    localcaF1.bb(localNK3);
    localNK3.brn();
    anQ localanQ = new anQ();
    localanQ.aJ();
    localanQ.setElementMap(localcpa);
    String str6 = "%achievement.questUnlocked%";
    str6 = str6.replace("%achievement.questUnlocked%", cBQ.cxL().mL("achievement.questUnlocked"));
    localanQ.setValue(str6);
    String str7 = "%achievement.achievementUnlocked%";
    str7 = str7.replace("%achievement.achievementUnlocked%", cBQ.cxL().mL("achievement.achievementUnlocked"));
    localanQ.setElseValue(str7);
    localNK3.bb(localanQ);
    localanQ.brn();
    cOk localcOk = new cOk();
    localcOk.aJ();
    localcOk.setElementMap(localcpa);
    localanQ.bb(localcOk);
    localcOk.brn();
    localcOk.rV();
    localanQ.rV();
    localNK3.rV();
    localcaF1.rV();
    localdRq3.rV();
    dRq localdRq6 = dRq.checkOut();
    localdRq6.setElementMap(localcpa);
    localdRq6.setNonBlocking(true);
    localdRq6.setExpandable(false);
    localdRq1.bb(localdRq6);
    localdRq6.brn();
    aId localaId3 = aId.checkOut();
    localaId3.setAlign(aFG.ecj);
    localdRq6.bb(localaId3);
    localaId3.brn();
    localaId3.rV();
    dRq localdRq7 = localdRq6;
    Jg localJg4 = localdRq7.getAppearance();
    localJg4.setElementMap(localcpa);
    localdRq6.bb(localJg4);
    localJg4.brn();
    bmv localbmv3 = bmv.checkOut();
    localbmv3.setElementMap(localcpa);
    localbmv3.setInsets(new Insets(5, 25, 0, 0));
    localJg4.bb(localbmv3);
    localbmv3.brn();
    localbmv3.rV();
    localJg4.rV();
    String str8 = "starIcon";
    czv localczv2 = new czv();
    localczv2.aJ();
    localczv2.setElementMap(localcpa);
    if ((localcpa != null) && (str8 != null))
      localcpa.a(str8, localczv2);
    localczv2.setExpandable(false);
    localczv2.setStyle("valid");
    localczv2.setNonBlocking(true);
    localdRq6.bb(localczv2);
    localczv2.brn();
    localczv2.rV();
    String str9 = "nameText";
    caF localcaF3 = new caF();
    localcaF3.aJ();
    localcaF3.setElementMap(localcpa);
    if ((localcpa != null) && (str9 != null))
      localcpa.a(str9, localcaF3);
    localcaF3.setStyle("bold");
    localcaF3.setExpandable(false);
    localcaF3.setNonBlocking(true);
    localdRq6.bb(localcaF3);
    localcaF3.brn();
    caF localcaF4 = localcaF3;
    Jg localJg5 = localcaF4.getAppearance();
    localJg5.setElementMap(localcpa);
    ((cwJ)localJg5).setAlignment(aFG.ecj);
    localcaF3.bb(localJg5);
    localJg5.brn();
    bmv localbmv4 = bmv.checkOut();
    localbmv4.setElementMap(localcpa);
    localbmv4.setInsets(new Insets(0, 5, 0, 0));
    localJg5.bb(localbmv4);
    localbmv4.brn();
    localbmv4.rV();
    cAf localcAf2 = cAf.checkOut();
    localcAf2.setElementMap(localcpa);
    localcAf2.setColor(new bNa(1.0F, 1.0F, 1.0F, 1.0F));
    localJg5.bb(localcAf2);
    localcAf2.brn();
    localcAf2.rV();
    localJg5.rV();
    NK localNK4 = NK.checkOut();
    localNK4.setElementMap(localcpa);
    localNK4.setName("unlockedAchievement");
    localNK4.setAttribute("text");
    localNK4.setField("name");
    localcaF3.bb(localNK4);
    localNK4.brn();
    localNK4.rV();
    localcaF3.rV();
    localdRq6.rV();
    localdRq1.rV();
    return localdRq1;
  }
}