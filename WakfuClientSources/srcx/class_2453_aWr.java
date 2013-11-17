public class aWr
{
  public static final String PACKAGE = "wakfu.guildManagement";

  public static void closeDialog(cSx paramcSx)
  {
    byv.bFN().b(vt.Ek());
  }

  public static void switchRank(arS paramarS, Long paramLong) {
    if (paramarS.getSelected()) {
      yi localyi = new yi(paramLong.longValue(), ((agw)paramarS.getValue()).getId());
      cjO.clE().j(localyi);
    }
  }

  public static void addToGuild(cSx paramcSx, aTp paramaTp) {
    if ((paramcSx.mp() == CH.bGh) && (((ctH)paramcSx).getKeyCode() != 10)) {
      return;
    }
    String str = paramaTp.getText();
    if ((str != null) && (str.length() > 0)) {
      bzu localbzu = new bzu();
      localbzu.d(18206);
      localbzu.a(str);
      cjO.clE().j(localbzu);
      paramaTp.setText("");
      zC.Ip().e(null);
    }
  }

  public static void excludeCharacter(cSx paramcSx, Long paramLong) {
    bzu localbzu = new bzu();
    localbzu.d(18207);
    localbzu.c(paramLong.longValue());
    cjO.clE().j(localbzu);
  }

  public static void leaveGuild(cSx paramcSx) {
    bzu.cf((short)(dqB.cXD().cXP() ? 18210 : 18208));
  }

  public static void createRank(cSx paramcSx) {
    bzu.cf((short)18211);
  }

  public static void deleteRank(cSx paramcSx, agw paramagw) {
    bzu localbzu = new bzu();
    localbzu.c(paramagw.getId());
    localbzu.d(18212);
    cjO.clE().j(localbzu);
  }

  public static void applyRankModifications(cSx paramcSx) {
    bzu.cf((short)18213);
  }

  public static void displayDisconnectedMembers(dbi paramdbi) {
    bzu localbzu = new bzu();
    localbzu.d(18209);
    localbzu.c(paramdbi.isSelected());
    cjO.clE().j(localbzu);
  }

  public static void addToParty(cSx paramcSx, Long paramLong) {
    bxW localbxW = dqB.cXD().jZ(paramLong.longValue());
    if (localbxW == null) {
      return;
    }

    djK localdjK = new djK();
    localdjK.a(go.aEq);
    localdjK.setName(localbxW.getName());
    cjO.clE().j(localdjK);
  }

  public static void addToFriendlist(cSx paramcSx, Long paramLong) {
    bxW localbxW = dqB.cXD().jZ(paramLong.longValue());
    if (localbxW == null) {
      return;
    }

    dqv localdqv = new dqv();
    localdqv.mA(localbxW.getName());
    byv.bFN().aJK().d(localdqv);

    dOc localdOc = (dOc)paramcSx.cIl();
    localdOc.setEnabled(false);
  }

  public static void addPrivatePipe(cSx paramcSx, Long paramLong) {
    bxW localbxW = dqB.cXD().jZ(paramLong.longValue());
    if (localbxW == null) {
      return;
    }

    adU.addPrivatePipe(paramcSx, localbxW.getName());
  }

  public static void editPersonalNote(cSx paramcSx)
  {
  }

  public static void changeRankName(ctH paramctH) {
    if ((paramctH.getKeyCode() == 10) && (checkRankModificationDirty())) {
      applyRankModifications(paramctH);
      return;
    }
    sP localsP = (sP)dLE.doY().rv("selectedGuildRank");
    if (localsP == null) {
      return;
    }
    aTp localaTp = (aTp)paramctH.cIk().getElementMap().fi("guildName");
    localsP.setName(localaTp.getText());
    checkRankModificationDirty();
  }

  public static void checkAuthorisation(dMr paramdMr, en paramen) {
    br localbr = (br)paramdMr.cIk();
    paramen.setChecked(localbr.getSelected());
    checkRankModificationDirty();
  }

  public static boolean checkRankModificationDirty() {
    agw localagw = (agw)dLE.doY().rv("selectedGuildRank");
    if (localagw == null) {
      return false;
    }
    boolean bool = !localagw.equals(dqB.cXD().jX(localagw.getId()));
    dLE.doY().t("rankModificationDirty", Boolean.valueOf(bool));
    return bool;
  }

  public static void selectRank(cEv paramcEv) {
    agw localagw = (agw)paramcEv.getItemValue();
    aTp localaTp = (aTp)paramcEv.cIl().getElementMap().fi("guildName");
    localaTp.setText(localagw.getName());
    dLE.doY().t("selectedGuildRank", localagw.arX());
  }

  public static void displayPage(dbi paramdbi) {
    if (paramdbi.isSelected()) {
      aHd localaHd = (aHd)paramdbi.cIl();
      int i = Integer.valueOf(localaHd.getValue()).intValue();
      dLE.doY().a("currentPage", Integer.valueOf(i), localaHd.getElementMap());
    }
  }

  public static void openMessagesEditionDialog(cSx paramcSx)
  {
    dLE.doY().t("isEditingGuildDescs", Boolean.valueOf(true));
    cBQ.cxL().a("guildTextEditorDialog", VV.dJ("guildTextEditorDialog"), 257L, (short)10000);
  }

  public static void onKeyEvent(cSx paramcSx, biy parambiy)
  {
    if (paramcSx.mp() == CH.bGh) {
      aTp localaTp = (aTp)paramcSx.cIl();
      ctH localctH = (ctH)paramcSx;
      if (aTm.checkText(localaTp, localctH.getKeyChar() == '\n'));
      String str = localaTp.getText();
      if ((str != null) && (str.length() > 0))
        parambiy.setEnabled(true);
    }
  }

  private static void a(String paramString, aTp paramaTp)
  {
    cKX localcKX = cBQ.cxL().a(paramString, Cn.et(1), 1027L, 102, 1);

    localcKX.a(new azU(paramaTp));
  }

  public static void applyGuildDescription(cSx paramcSx, aTp paramaTp)
  {
    String str1 = paramaTp.getText();
    String str2 = aYD.hD(str1);
    paramaTp.setText(str2);
    if ((str2.length() == 0) && (str1.length() != 0)) {
      a(bU.fH().getString("error.censoredSentence"), paramaTp);
      return;
    }

    bzu localbzu = new bzu();
    localbzu.d(18216);
    localbzu.a(str2);
    cjO.clE().j(localbzu);
    ((biy)paramcSx.cIl()).setEnabled(false);
  }

  public static void applyGuildMessage(cSx paramcSx, aTp paramaTp) {
    String str1 = paramaTp.getText();
    String str2 = aYD.hD(str1);
    paramaTp.setText(str2);
    if ((str2.length() == 0) && (str1.length() != 0)) {
      a(bU.fH().getString("error.censoredSentence"), paramaTp);
      return;
    }

    bzu localbzu = new bzu();
    localbzu.d(18217);
    localbzu.a(str2);
    cjO.clE().j(localbzu);
    ((biy)paramcSx.cIl()).setEnabled(false);
  }

  public static void applyGuildPersonalDescription(cSx paramcSx, aTp paramaTp) {
    bzu localbzu = new bzu();
    localbzu.d(18218);
    localbzu.a(paramaTp.getText());
    cjO.clE().j(localbzu);
    ((biy)paramcSx.cIl()).setEnabled(false);
  }

  public static void chooseSmiley(arS paramarS) {
    if (paramarS.getSelected()) {
      bzu localbzu = new bzu();
      localbzu.a((byte)((AI)paramarS.getValue()).JV());
      localbzu.d(18219);
      cjO.clE().j(localbzu);
    }
  }

  public static void acceptQuest(cSx paramcSx, ckJ paramckJ) {
    bzu localbzu = new bzu();
    localbzu.d(16140);
    localbzu.e(paramckJ.getId());
    cjO.clE().j(localbzu);
  }

  public static void switchContainerVisibility(cSx paramcSx, dRq paramdRq, biy parambiy) {
    boolean bool = !paramdRq.isVisible();
    paramdRq.setVisible(bool);
    parambiy.setStyle(bool ? "YellowUpArrow" : "YellowDownArrow");
  }

  public static void selectUpgradeSubCategory(cSx paramcSx, mt parammt) {
    parammt.ub();
  }
}