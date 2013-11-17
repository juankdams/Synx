public class aTm
{
  public static final String PACKAGE = "wakfu.nation";
  public static final byte eQJ = 0;
  public static final byte eQK = 1;
  public static final byte eQL = 2;
  public static final byte eQM = 3;
  private static boolean eQN;

  public static void onKeyPress(cSx paramcSx)
  {
    if (paramcSx.mp() == CH.bGh) {
      aTp localaTp = (aTp)paramcSx.cIl();
      ctH localctH = (ctH)paramcSx;
      if (checkText(localaTp, localctH.getKeyChar() == '\n'));
      String str = localaTp.getText();
      if ((str != null) && (str.length() > 0))
        dLE.doY().t("speechDirty", Boolean.valueOf(true));
    }
  }

  public static boolean checkText(aTp paramaTp, boolean paramBoolean) {
    boolean bool = true;
    String str = paramaTp.getText();
    int i = paramBoolean ? 1 : 0;
    for (int j = 0; j < str.length(); j++) {
      if (str.charAt(j) == '\n') {
        i++;
        if (i > 3)
          str = str.substring(0, j) + " " + str.substring(j + 1, str.length());
      }
    }
    if (i > 3) {
      bool = false;
      paramaTp.setText(str);
      a(bU.fH().getString("carriageReturnLimitError"), paramaTp);
    }
    return bool;
  }

  private static void a(String paramString, aTp paramaTp) {
    cKX localcKX = cBQ.cxL().a(paramString, Cn.et(1), 1027L, 102, 1);

    localcKX.a(new aUO(paramaTp));
  }

  public static void cancelGovernorSpeech(cSx paramcSx)
  {
    bPE.bWu().kk(null);
    bPE.bWu().bXf();
    dLE.doY().t("speechVisualisationMode", Boolean.valueOf(true));
    dLE.doY().t("speechDirty", Boolean.valueOf(false));
  }

  public static void cancelMarshalSpeech(cSx paramcSx) {
    bPE.bWu().kk(null);
    bPE.bWu().bWH();
    dLE.doY().t("speechVisualisationMode", Boolean.valueOf(true));
    dLE.doY().t("speechDirty", Boolean.valueOf(false));
  }

  public static void cancelGeneralSpeech(cSx paramcSx) {
    bPE.bWu().kk(null);
    bPE.bWu().bWI();
    dLE.doY().t("speechVisualisationMode", Boolean.valueOf(true));
    dLE.doY().t("speechDirty", Boolean.valueOf(false));
  }

  public static void validateGovernorSpeech(cSx paramcSx, aTp paramaTp) {
    validate(paramcSx, paramaTp, 18403, bPE.bWu().bXb());
  }

  public static void validateMarshalSpeech(cSx paramcSx, aTp paramaTp) {
    validate(paramcSx, paramaTp, 18417, bPE.bWu().bXc());
  }

  public static void validateGeneralSpeech(cSx paramcSx, aTp paramaTp) {
    validate(paramcSx, paramaTp, 18418, bPE.bWu().bXd());
  }

  public static void validate(cSx paramcSx, aTp paramaTp, int paramInt, aCe paramaCe) {
    if (!checkText(paramaTp, false)) {
      return;
    }
    String str1 = paramaTp.getText();
    String str2 = aYD.hD(str1);
    paramaTp.setText(str2);
    if ((str2.length() == 0) && (str1.length() != 0)) {
      a(bU.fH().getString("error.censoredSentence"), paramaTp);
      return;
    }

    cKX localcKX = cBQ.cxL().a(bU.fH().getString("nation.speechWarning"), Cn.et(0), 25L, 102, 1);

    localcKX.a(new aUQ(paramInt, paramaTp, paramaCe));
  }

  public static void changeTitle(arS paramarS)
  {
    if (paramarS.getSelected()) {
      bzu localbzu = new bzu();
      localbzu.d(18404);
      aon localaon = ((ase)paramarS.getValue()).aEC();
      localbzu.ar(localaon == null ? -1 : localaon.nc());
      cjO.clE().j(localbzu);
    }
  }

  public static void switchGovernmentVisibility(cSx paramcSx, biy parambiy, dRq paramdRq) {
    switchVisibility(parambiy, paramdRq);
  }

  public static void switchEconomyVisibility(cSx paramcSx, biy parambiy, dRq paramdRq) {
    if (switchVisibility(parambiy, paramdRq))
      bzu.cf((short)18406);
  }

  public static void switchGovernorPopularityVisibility(cSx paramcSx, biy parambiy, dRq paramdRq)
  {
    if (switchVisibility(parambiy, paramdRq))
      bzu.cf((short)18415);
  }

  public static void switchOtherNationLaws(cSx paramcSx, biy parambiy, dRq paramdRq, cuk paramcuk)
  {
    if (switchVisibility(parambiy, paramdRq)) {
      bPE.bWu().q(paramcuk.csJ());
      bzu localbzu = new bzu();
      localbzu.d(18414);
      localbzu.e(paramcuk.csJ().bP());
      cjO.clE().j(localbzu);
    } else {
      bPE.bWu().r(paramcuk.csJ());
    }
  }

  public static boolean switchVisibility(biy parambiy, dRq paramdRq) {
    boolean bool = !paramdRq.isVisible();
    paramdRq.setVisible(bool);
    parambiy.setStyle(bool ? "YellowUpArrow" : "YellowDownArrow");
    return bool;
  }

  public static void displayPage(cSx paramcSx, String paramString)
  {
    Byte localByte = Byte.valueOf(paramString);
    int i = dLE.doY().rr("nationCurrentPageIndex");
    if (localByte.byteValue() == i)
      return;
    dLE.doY().t("nationCurrentPageIndex", localByte);
    cvY localcvY = byv.bFN().bFO().cJf();
    ayn localayn = bWW.ccf().FB();
    int j = localayn == null ? -1 : localayn.ava().bP();
    Object localObject;
    if (localByte.byteValue() == 1)
    {
      localObject = new ej();
      byv.bFN().aJK().d((cWG)localObject);
      bTX.cah().gG(false);
      bPE.bWu().gA(false);
    } else if (localByte.byteValue() == 2) {
      bPE.bWu().bWT();
      dLE.doY().a(bPE.bWu(), new String[] { "laws" });
      if (localcvY.bP() != j)
      {
        localObject = new akK();
        ((akK)localObject).dc(localcvY.bP());
        byv.bFN().aJK().d((cWG)localObject);
        bTX.cah().gG(false);
      }
    } else if (localByte.byteValue() == 3) {
      bPE.bWu().gA(true);

      localObject = new bvV();
      byv.bFN().aJK().d((cWG)localObject);
      bTX.cah().gG(false);
    } else {
      bPE.bWu().gA(false);
    }
  }

  public static void detailRankMember(cSx paramcSx, dNp paramdNp) {
    bzu localbzu = new bzu();
    localbzu.d(18409);
    localbzu.c(paramdNp.Hc());
    cjO.clE().j(localbzu);
  }

  public static void revokeRankMember(cSx paramcSx, dNp paramdNp) {
    cjH localcjH = bPE.bWu().UI().aNd();
    dpE localdpE = localcjH.hv(byv.bFN().bFO().getId());
    cKX localcKX = cBQ.cxL().a(bU.fH().getString(localdpE.HK().getId() == paramdNp.Hc() ? "nation.governmentResignationConfirmation" : "nation.governmentRevokeConfirmation", new Object[] { paramdNp.getName() }), Cn.et(0), 25L, 102, 1);

    localcKX.a(new aUR(paramdNp));
  }

  public static void addToRank(cSx paramcSx, dNp paramdNp, aTp paramaTp)
  {
    if ((paramcSx.mp() == CH.bGh) && (((ctH)paramcSx).getKeyCode() != 10))
      return;
    String str = paramaTp.getText();
    if ((str != null) && (str.length() > 0)) {
      bzu localbzu = new bzu();
      localbzu.d(18407);
      localbzu.c(paramdNp.Hc());
      localbzu.a(str);
      cjO.clE().j(localbzu);
      paramaTp.setText("");
      zC.Ip().e(null);
    }
  }

  public static void switchVisualizeSpeech(cSx paramcSx, aTp paramaTp) {
    boolean bool = dLE.doY().getBooleanProperty("speechVisualisationMode");
    dLE.doY().t("speechVisualisationMode", Boolean.valueOf(!bool));
    if (!bool) {
      bPE.bWu().kk(paramaTp.getText());
      bPE.bWu().bXf();
    }
  }

  public static void switchVisualizeMarshalSpeech(cSx paramcSx, aTp paramaTp) {
    boolean bool = dLE.doY().getBooleanProperty("speechVisualisationMode");
    dLE.doY().t("speechVisualisationMode", Boolean.valueOf(!bool));
    if (!bool) {
      bPE.bWu().kk(paramaTp.getText());
      bPE.bWu().bWH();
    }
  }

  public static void switchVisualizeGeneralSpeech(cSx paramcSx, aTp paramaTp) {
    boolean bool = dLE.doY().getBooleanProperty("speechVisualisationMode");
    dLE.doY().t("speechVisualisationMode", Boolean.valueOf(!bool));
    if (!bool) {
      bPE.bWu().kk(paramaTp.getText());
      bPE.bWu().bWI();
    }
  }

  public static void cancelLawPoints(cSx paramcSx) {
    bzu.cf((short)18411);
  }

  public static void validateLawPoints(cSx paramcSx) {
    cKX localcKX = cBQ.cxL().a(bU.fH().getString(bPE.bWu().UI().bnz().cKO() ? "nation.firstLawChangesConfirmation" : "nation.lawChangesConfirmation"), Cn.et(0), 537L, 102, 1);

    localcKX.a(new aUS());
  }

  public static void chooseLaw(dbi paramdbi, apD paramapD)
  {
    if (paramdbi.isSelected() == paramapD.aBz())
      return;
    if ((paramdbi.isSelected()) && (paramapD.aBy().TN() + bPE.bWu().bWC() > 50)) {
      if (eQN)
        return;
      localObject = paramdbi.cIk().getElementMap();
      if (localObject == null)
        return;
      br localbr = (br)paramdbi.cIk();
      caF localcaF = (caF)((cpa)localObject).fi("lawPointsLabel");
      bNa localbNa1 = new bNa(1.0F, 0.2F, 0.2F, 1.0F);
      bNa localbNa2 = bNa.gRx;
      localcaF.J(gm.class);
      localbr.J(gm.class);
      gm localgm1 = new gm(localbNa1, localbNa2, localcaF, 0, 250, 5, ddp.kWG);
      localcaF.a(localgm1);
      gm localgm2 = new gm(localbNa1, localbNa2, localbr, 0, 250, 5, ddp.kWG);
      localbr.a(localgm2);
      eQN = true;

      localgm2.a(new aUT(localbr, localgm2));

      return;
    }

    paramapD.cG(paramdbi.isSelected());
    Object localObject = new bzu();
    ((bzu)localObject).c(paramapD.aBy().getId());
    ((bzu)localObject).d(18410);
    cjO.clE().j((cWG)localObject);
  }

  public static void suggestAlliance(cSx paramcSx, bdm parambdm) {
    cKX localcKX = cBQ.cxL().a(bU.fH().getString("nation.suggestAllianceConfirmation", new Object[] { parambdm.getName() }), Cn.et(0), 25L, 102, 1);

    localcKX.a(new aUW(parambdm));
  }

  public static void suggestTruce(cSx paramcSx, bdm parambdm)
  {
    cKX localcKX = cBQ.cxL().a(bU.fH().getString("nation.suggestTruceConfirmation", new Object[] { parambdm.getName() }), Cn.et(0), 25L, 102, 1);

    localcKX.a(new aUY(parambdm));
  }

  public static void breakAlliance(cSx paramcSx, bdm parambdm)
  {
    cKX localcKX = cBQ.cxL().a(bU.fH().getString("nation.breakAllianceConfirmation", new Object[] { parambdm.getName() }), Cn.et(0), 25L, 102, 1);

    localcKX.a(new aVa(parambdm));
  }

  public static void declareWar(cSx paramcSx, bdm parambdm)
  {
    cKX localcKX = cBQ.cxL().a(bU.fH().getString("nation.declareWarConfirmation", new Object[] { parambdm.getName() }), Cn.et(0), 25L, 102, 1);

    localcKX.a(new aUM(parambdm));
  }

  public static void validProposal(cSx paramcSx, bdm parambdm)
  {
    cjW localcjW = new cjW();
    localcjW.dc(parambdm.bP());
    localcjW.G(parambdm.bro() ? dqU.ltr.bJ() : dqU.ltq.bJ());
    cjO.clE().j(localcjW);
  }

  public static void cancelProposal(cSx paramcSx, bdm parambdm) {
    cjW localcjW = new cjW();
    localcjW.dc(parambdm.bP());
    localcjW.G(parambdm.brq().bJ());
    cjO.clE().j(localcjW);
  }

  public static void changeOpinion(cSx paramcSx, String paramString) {
    bPE.bWu().dv(Byte.parseByte(paramString));
  }

  public static void confirmOpinionChange(cSx paramcSx) {
    bzu.cf((short)18416);
  }

  public static void onZoneOver(aZO paramaZO, aoB paramaoB) {
    dLE.doY().t("protectorInList", paramaoB);
  }

  public static void onZoneOut(aZO paramaZO) {
    dLE.doY().removeProperty("protectorInList");
  }

  public static void onFocusGain(Gy paramGy, biy parambiy) {
    parambiy.setEnabled(true);
  }
}