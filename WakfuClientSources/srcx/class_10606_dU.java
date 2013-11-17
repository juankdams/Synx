public class dU
{
  public static final String PACKAGE = "wakfu.voteInformation";

  public static void voteFor(cSx paramcSx, cLP paramcLP)
  {
    byz localbyz = byv.bFN().bFO();
    Object localObject;
    if ((localbyz == null) || (localbyz.getId() != paramcLP.cEO().getId())) {
      localObject = cBQ.cxL().a(bU.fH().getString("nation.vote.voteFor.warning"), Cn.et(0), 25L, 102, 1);

      ((cKX)localObject).a(new dSN(paramcLP));
    }
    else
    {
      localObject = new bcO();
      ((bcO)localObject).d(18401);
      ((bcO)localObject).a(paramcLP);
      cjO.clE().j((cWG)localObject);
    }
  }

  public static void closeDialog(cSx paramcSx) {
    byv.bFN().b(aUy.bjB());
  }

  public static void validate(cSx paramcSx, aTp paramaTp) {
    String str1 = paramaTp.getText();
    String str2 = aYD.hD(str1);
    if ((str2.length() == 0) && (str1.length() != 0)) {
      cBQ.cxL().a(bU.fH().getString("error.censoredSentence"), Cn.et(1), 2L, 102, 1);

      return;
    }
    paramaTp.setText(str2);

    cKX localcKX = cBQ.cxL().a(bU.fH().getString("nation.vote.candidateRegistration.warning"), Cn.et(0), 25L, 102, 1);

    localcKX.a(new dSM(paramaTp));
  }

  public static void onKeyPress(cSx paramcSx)
  {
    if (paramcSx.mp() == CH.bGh) {
      aTp localaTp = (aTp)paramcSx.cIl();
      if (!localaTp.getEditable())
        return;
      ctH localctH = (ctH)paramcSx;
      String str = localaTp.getText();
      int i = localctH.getKeyChar() == '\n' ? 1 : 0;
      for (int j = 0; j < str.length(); j++) {
        if (str.charAt(j) == '\n') {
          i++;
          if (i > 3)
            str = str.substring(0, j) + " " + str.substring(j + 1, str.length());
        }
      }
      if (i > 3) {
        localaTp.setText(str);
        cKX localcKX = cBQ.cxL().a(bU.fH().getString("carriageReturnLimitError"), Cn.et(1), 1027L, 102, 1);

        localcKX.a(new dSL(localaTp));
      }

      dLE.doY().t("electionSloganLength", bU.fH().getString("remainingLetters", new Object[] { Integer.valueOf(200 - localaTp.getText().length()) }));

      dLE.doY().t("electionSloganDirty", Boolean.valueOf(true));
    }
  }

  public static void previousPage(cSx paramcSx) {
    bzu.cf((short)16161);
  }

  public static void nextPage(cSx paramcSx) {
    bzu.cf((short)16162);
  }
}