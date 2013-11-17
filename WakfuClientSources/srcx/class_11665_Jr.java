import org.apache.log4j.Logger;

public class Jr
{
  public static final String PACKAGE = "wakfu.protectorManagement";
  private static final Logger K = Logger.getLogger(Jr.class);

  public static void selectMerchantItem(cEv paramcEv) {
    dLE.doY().t("selectedProtectorMerchantItem", paramcEv.getItemValue());
  }

  public static void validateBudgetAllocation(ctH paramctH, biy parambiy) {
    aTp localaTp = (aTp)paramctH.cIl();
    int i = bUD.f(localaTp.getText(), -1);
    boolean bool = i <= bWW.ccf().FB().aKi().bDx();
    parambiy.setEnabled(bool);
  }

  public static void allocateBudget(cSx paramcSx, aTp paramaTp, cgB paramcgB) {
    int i = bUD.f(paramaTp.getText(), -1);
    if (i == -1) {
      K.warn("Impossible d'allouer le budget : " + paramaTp.getText() + " n'est pas une valeur valide.");
      return;
    }

    if (i > paramcgB.ciE().bDx()) {
      K.warn("Impossible d'allouer le budget : on demande " + i + "alors qu'il ne reste que " + paramcgB.ciE().bDx());
      return;
    }

    bzu localbzu = new bzu();
    localbzu.d(16011);
    localbzu.e(i);
    localbzu.a(paramcgB.ciD().bUy);
    cjO.clE().j(localbzu);

    cBQ.cxL().mW("protectorBudgetAllocateDialog");
  }

  public static void openAllocateBudget(cSx paramcSx, cgB paramcgB) {
    dLE.doY().t("selectedProtectorBudget", paramcgB);
    cBQ.cxL().a("protectorBudgetAllocateDialog", VV.dJ("protectorBudgetAllocateDialog"), 256L, (short)10000);
  }

  public static void validateBudgetTransfer(ctH paramctH, biy parambiy)
  {
    aTp localaTp = (aTp)paramctH.cIl();
    int i = bUD.f(localaTp.getText(), -1);
    boolean bool = i <= bWW.ccf().FB().aKi().bDx();
    parambiy.setEnabled(bool);
  }

  public static void transferBudget(cSx paramcSx, aTp paramaTp, ddG paramddG) {
    int i = bUD.f(paramaTp.getText(), -1);
    if (i == -1) {
      K.warn("Impossible de transférer le budget : " + paramaTp.getText() + " n'est pas une valeur valide.");
      return;
    }

    bxH localbxH = bWW.ccf().FB().aKi();
    if (i > localbxH.bDx()) {
      K.warn("Impossible de transférer le budget : on demande " + i + "alors qu'il ne reste que " + localbxH.bDx());
      return;
    }

    aoB localaoB = (aoB)paramddG.getSelectedValue();

    bzu localbzu = new bzu();
    localbzu.d(16012);
    localbzu.c(localaoB.CB());
    localbzu.e(i);
    cjO.clE().j(localbzu);

    paramaTp.setText("0");
  }

  public static void openTransferBudget(cSx paramcSx) {
    aNL localaNL = cBQ.cxL().a("protectorBudgetTransferDialog", VV.dJ("protectorBudgetTransferDialog"), 256L, (short)10000);

    ddG localddG = (ddG)localaNL.getElementMap().fi("territoryCombo");
    localddG.getList().setListFilter(new cWK());
  }

  public static void changeChallengeCategory(dbi paramdbi, FD paramFD)
  {
    if (paramdbi.isSelected()) {
      aHd localaHd = (aHd)paramdbi.cIl();
      byte b = bUD.getByte(localaHd.getValue());
      aF localaF = aF.c(b);

      paramFD.a(localaF);
    }
  }

  public static void changeZoologyCategory(dbi paramdbi, dEw paramdEw) {
    if (paramdbi.isSelected()) {
      aHd localaHd = (aHd)paramdbi.cIl();
      boolean bool = bUD.getBoolean(localaHd.getValue());

      paramdEw.setSelected(bool);
    }
  }

  public static void reintroduce(cSx paramcSx, dEw paramdEw, btY parambtY) {
    bzu localbzu = new bzu();
    localbzu.d(16010);
    localbzu.e(parambtY.nn());
    localbzu.c(parambtY.fM());
    cjO.clE().j(localbzu);
  }

  public static void protect(cSx paramcSx, dEw paramdEw, btY parambtY) {
    bzu localbzu = new bzu();
    localbzu.d(16008);
    localbzu.e(parambtY.nn());
    localbzu.c(parambtY.fM());
    cjO.clE().j(localbzu);
  }

  public static void unprotect(cSx paramcSx, dEw paramdEw, btY parambtY) {
    bzu localbzu = new bzu();
    localbzu.d(16009);
    localbzu.e(parambtY.nn());
    localbzu.c(parambtY.fM());
    cjO.clE().j(localbzu);
  }

  public static void validMerchantItemPurchase(dMr paramdMr, bFg parambFg, bYT parambYT) {
    if (paramdMr.getButton() != 1)
      return;
    dLE.doY().t("selectedProtectorMerchantItem", parambYT);
    IQ localIQ = new IQ();
    localIQ.d(16004);
    localIQ.a(parambFg);
    cjO.clE().j(localIQ);
  }

  public static void tabSelected(cSx paramcSx)
  {
    if ((paramcSx.cIl() instanceof aHd))
      dLE.doY().t("selectedProtectorMerchantItem", null);
  }

  public static void setTaxValue(bXo parambXo)
  {
    a(parambXo.getValue(), bWW.ccf().b(cVE.kIa));
    aBu localaBu = bWW.ccf().b(cVE.kHZ);
    a(parambXo.getValue(), localaBu);

    dLE.doY().a(localaBu, new String[] { "taxValue", "taxPercentage", "taxPercentageLongDesc" });
  }

  private static void a(float paramFloat, aBu paramaBu)
  {
    baR localbaR = paramaBu.aNH();
    localbaR.setValue(paramFloat * 5.0F / 100.0F);
  }

  public static void applyTaxes(cSx paramcSx) {
    bzu.cf((short)16005);
  }

  public static void onBoughtChallengeSelectionChange(dbi paramdbi, vD paramvD) {
    bzu localbzu = new bzu();
    localbzu.d(16006);
    localbzu.e(paramvD.EE().getId());
    localbzu.c(paramdbi.isSelected());
    cjO.clE().j(localbzu);
  }

  public static void applyLaws(cSx paramcSx) {
    bzu.cf((short)16007);
    b(paramcSx, false);
  }

  public static void openChallengeDescription(dMr paramdMr, dBv paramdBv) {
    if (paramdMr.getButton() == 1) {
      return;
    }
    ceQ localceQ = null;
    if ((paramdBv instanceof ceQ)) {
      localceQ = (ceQ)paramdBv;
    } else if ((paramdBv instanceof cod)) {
      cod localcod = (cod)paramdBv;
      localceQ = aUi.eUP.nW(localcod.yC());
    }

    if (localceQ != null)
      bMK.bUv().a(localceQ);
  }

  public static void openClimateBonusDescription(dMr paramdMr, OR paramOR)
  {
    if (paramdMr.getButton() == 1) {
      return;
    }
    if (paramOR != null) {
      aNL localaNL = cBQ.cxL().a("climateBonusDetailDialog" + paramOR.aaO(), VV.dJ("climateBonusDetailDialog"), 17L, (short)10000);

      dLE.doY().a("climateDetail", paramOR, localaNL.getElementMap());
    }
  }

  private static void b(cSx paramcSx, boolean paramBoolean) {
    biy localbiy = (biy)paramcSx.cIk().getElementMap().fi("applyLawsButton");
    localbiy.setEnabled(paramBoolean);
  }

  public static void displayPage(dbi paramdbi) {
    if (paramdbi.isSelected()) {
      aHd localaHd = (aHd)paramdbi.cIl();
      dLE.doY().a("currentPage", localaHd.getValue(), localaHd.getElementMap());
    }
  }
}