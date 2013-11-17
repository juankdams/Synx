public class Rn
{
  public static final String PACKAGE = "wakfu.crafts";

  public static void openLinkedBook(cSx paramcSx)
  {
    ((aIV)dLE.doY().br("craft", paramcSx.cIl().getElementMap().getId())).aEQ();
  }

  public static void checkOkFilter(cSx paramcSx) {
    ((aIV)dLE.doY().br("craft", paramcSx.cIl().getElementMap().getId())).aUZ();
  }

  public static void checkAlphabeticalSorter(cSx paramcSx) {
    ((aIV)dLE.doY().br("craft", paramcSx.cIl().getElementMap().getId())).aVa();
  }

  public static void checkLevelSorter(cSx paramcSx) {
    ((aIV)dLE.doY().br("craft", paramcSx.cIl().getElementMap().getId())).aVb();
  }

  public static void validNameFilter(cSx paramcSx, aTp paramaTp) {
    aIV localaIV = (aIV)dLE.doY().br("craft", paramcSx.cIl().getElementMap().getId());
    String str = paramaTp.getText();
    if (!str.equals(localaIV.aUY()))
      localaIV.gF(str);
  }

  public static void previousPage(cSx paramcSx, aIV paramaIV)
  {
    int i = paramaIV.sT() - 1;
    if (i < 0) {
      return;
    }

    paramaIV.bn(i);
  }

  public static void nextPage(cSx paramcSx, aIV paramaIV) {
    int i = paramaIV.sT() + 1;
    if (i >= paramaIV.aVg()) {
      return;
    }

    paramaIV.bn(i);
  }

  public static void displayRecipesWithIngredient(cSx paramcSx, dra paramdra) {
    bcN.bqJ().oT(paramdra.gw());
  }

  public static void displayRecipesWithIngredient(cSx paramcSx, cfm paramcfm) {
    bcN.bqJ().oT(paramcfm.cij().getId());
  }

  public static void onCraftTypeChanged(dbi paramdbi, aIV paramaIV) {
    byte b = paramdbi.isSelected() ? 0 : 1;
    paramaIV.a(ajP.ba(b));
    dLE.doY().t("craftDisplayType", Byte.valueOf(b));
  }

  public static void openProducedItemDescription(cEv paramcEv, bpn parambpn) {
    if ((paramcEv.getItemValue() instanceof cfm))
      openProducedItemDescription(paramcEv, (cfm)paramcEv.getItemValue(), parambpn);
    else if ((paramcEv.getItemValue() instanceof dra))
      openProducedItemDescription(paramcEv, (dra)paramcEv.getItemValue(), parambpn);
  }

  public static void openProducedItemDescription(dMr paramdMr, dra paramdra, bpn parambpn)
  {
    if (paramdMr.getButton() != 3) {
      return;
    }

    if (!byv.bFN().c(dGW.dhM())) {
      byv.bFN().a(dGW.dhM());
    }

    bBn localbBn = Hh.QM().dh(paramdra.gw());
    if (localbBn == null) {
      return;
    }

    gA localgA = new gA(localbBn.getId());
    localgA.b(localbBn);

    cER localcER = new cER();
    localcER.d(16415);
    localcER.dX(parambpn == null ? null : parambpn.getElementMap().getId());
    localcER.a(localgA);
    cjO.clE().j(localcER);
  }

  public static void openProducedItemDescription(dMr paramdMr, cfm paramcfm, bpn parambpn) {
    if (paramdMr.getButton() != 3) {
      return;
    }

    if (!byv.bFN().c(dGW.dhM())) {
      byv.bFN().a(dGW.dhM());
    }
    cpB localcpB = new cpB();
    localcpB.dX(parambpn == null ? null : parambpn.getElementMap().getId());
    localcpB.a(paramcfm);
    cjO.clE().j(localcpB);
  }

  public static void outRecipe(cSx paramcSx, czv paramczv) {
    outRecipe(paramcSx, paramczv, null);
  }

  public static void overRecipe(cSx paramcSx, czv paramczv) {
    overRecipe(paramcSx, paramczv, null);
  }

  public static void outRecipe(cSx paramcSx, czv paramczv, dOc paramdOc) {
    paramczv.setDisplaySize(new Or(46, 46));
    if (paramdOc != null)
      paramdOc.setVisible(false);
  }

  public static void overRecipe(cSx paramcSx, czv paramczv, dOc paramdOc)
  {
    paramczv.setDisplaySize(new Or(50, 50));
    if (paramdOc != null)
      paramdOc.setVisible(true);
  }

  public static void switchToFreeMode(dbi paramdbi)
  {
    bzu localbzu = new bzu();
    localbzu.d(16851);
    localbzu.c(paramdbi.isSelected());
    cjO.clE().j(localbzu);
  }
}