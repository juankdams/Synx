public class ajM
{
  public static final String PACKAGE = "wakfu.contactList";

  public static void openContactPopupMenu(cEv paramcEv)
  {
    if (paramcEv.getButton() == 3) {
      Object localObject = paramcEv.getItemValue();
      if ((localObject != null) && ((localObject instanceof dbV))) {
        aMj localaMj = new aMj();
        localaMj.a((dbV)localObject);
        localaMj.d(19003);
        cjO.clE().j(localaMj);
      }
    }
  }

  public static void closeContactList(cSx paramcSx) {
    bzu.cf((short)19002);
  }

  public static void checkNotify(cSx paramcSx, dbV paramdbV)
  {
    if (paramdbV != null)
    {
      aMj localaMj = new aMj();
      localaMj.a(paramdbV);
      localaMj.d(19005);
      cjO.clE().j(localaMj);
    }
  }

  public static void enableDisableFriendFilter(cSx paramcSx)
  {
    bzu.cf((short)19009);
  }

  public static void enableDisableIgnoreFilter(cSx paramcSx)
  {
    bzu.cf((short)19010);
  }

  public static void addFriend(cSx paramcSx) {
    if ((paramcSx.mp() == CH.bGw) || ((paramcSx.mp() == CH.bGh) && (((ctH)paramcSx).getKeyCode() == 10)))
      a(paramcSx, (short)1, true);
  }

  public static void addIgnore(cSx paramcSx)
  {
    if ((paramcSx.mp() == CH.bGw) || ((paramcSx.mp() == CH.bGh) && (((ctH)paramcSx).getKeyCode() == 10)))
      a(paramcSx, (short)2, true);
  }

  public static void removeIgnore(cSx paramcSx)
  {
    a(paramcSx, (short)2, false);
  }

  public static void addToGroup(cSx paramcSx) {
    a(paramcSx, (short)4, true);
  }

  private static void a(cSx paramcSx, short paramShort, boolean paramBoolean) {
    dpR localdpR = new dpR();
    localdpR.d(paramBoolean ? 19020 : 19021);
    localdpR.setType(paramShort);

    cpa localcpa = paramcSx.cIl().getElementMap();
    aTp localaTp = (aTp)localcpa.fi(paramShort == 1 ? "customFriendName" : "customIgnoreName");
    if (localaTp != null) {
      String str = localaTp.getText();
      if ((str == null) || (str.equals("")))
        return;
      dbV localdbV = dmY.cUs().px(str);
      if (localdbV == null) {
        localdbV = dmY.cUs().py(str);
        if (localdbV == null) {
          localdbV = new dbV(-1L, str, str);
        }
      }
      localdpR.b(localdbV);
      localaTp.setText("");
    }

    cjO.clE().j(localdpR);
  }

  public static void selectUnselectUser(dbi paramdbi, Short paramShort) {
    String str = paramdbi.cIl().getId();
    dbV localdbV = dmY.cUs().px(str);
    if (localdbV == null) {
      return;
    }
    aMj localaMj = new aMj();
    localaMj.a(localdbV);
    localaMj.ar(paramShort.shortValue());
    if (paramdbi.isSelected())
      localaMj.d(19016);
    else {
      localaMj.d(19017);
    }

    cjO.clE().j(localaMj);
  }

  public static void addCommentary(cSx paramcSx, dbV paramdbV) {
    if (paramdbV == null) {
      return;
    }
    aMj localaMj = new aMj();
    localaMj.a(paramdbV);
    localaMj.d(19060);

    cjO.clE().j(localaMj);
  }

  public static void validCommentary(cSx paramcSx, dbV paramdbV, aTp paramaTp) {
    if (paramdbV == null) {
      return;
    }
    if ((paramcSx.mp() == CH.bGw) || ((paramcSx.mp() == CH.bGh) && (((ctH)paramcSx).getKeyCode() == 10))) {
      cpa localcpa = cBQ.cxL().coO().nf("contactListDialog");
      aMj localaMj = new aMj();
      localaMj.a(paramdbV);
      String str1 = paramaTp.getText();
      String str2 = aYD.hD(str1);
      paramaTp.setText("");
      if ((str2.length() == 0) && (str1.length() != 0)) {
        a(bU.fH().getString("error.censoredSentence"), paramaTp);
        return;
      }
      localaMj.a(str2);
      localaMj.d(19028);

      cjO.clE().j(localaMj);
    }
  }

  private static void a(String paramString, aTp paramaTp) {
    cKX localcKX = cBQ.cxL().a(paramString, Cn.et(1), 1027L, 102, 1);

    localcKX.a(new afO(paramaTp));
  }

  public static void playListSound(boolean paramBoolean)
  {
    aWc.blo().eO(paramBoolean ? 600117L : 600118L);
  }

  public static void showIgnored(cSx paramcSx) {
    cpa localcpa = cBQ.cxL().coO().nf("contactListDialog");
    dOc localdOc1 = (dOc)localcpa.fi("ignoreList");
    boolean bool = !localdOc1.getVisible();
    localdOc1.setVisible(bool);
    dOc localdOc2 = (dOc)localcpa.fi("ignoreButton");
    if (bool)
      localdOc2.setStyle("remove");
    else {
      localdOc2.setStyle("add");
    }
    localdOc1 = (dOc)localcpa.fi("friendsOfflineList");
    localdOc1.setVisible(!bool);
    localdOc2 = (dOc)localcpa.fi("friendsOfflineButton");
    if (!bool)
      localdOc2.setStyle("remove");
    else {
      localdOc2.setStyle("add");
    }
    playListSound(bool);
  }

  public static void showOffline(cSx paramcSx) {
    cpa localcpa = cBQ.cxL().coO().nf("contactListDialog");
    dOc localdOc1 = (dOc)localcpa.fi("friendsOfflineList");
    boolean bool = !localdOc1.getVisible();
    localdOc1.setVisible(bool);
    dOc localdOc2 = (dOc)localcpa.fi("friendsOfflineButton");
    if (bool)
      localdOc2.setStyle("remove");
    else {
      localdOc2.setStyle("add");
    }
    localdOc1 = (dOc)localcpa.fi("ignoreList");
    localdOc1.setVisible(!bool);
    localdOc2 = (dOc)localcpa.fi("ignoreButton");
    if (!bool)
      localdOc2.setStyle("remove");
    else {
      localdOc2.setStyle("add");
    }
    playListSound(bool);
  }

  public static void removeFriend(cSx paramcSx, dbV paramdbV) {
    dpR localdpR = new dpR();
    localdpR.d(19021);
    localdpR.setType((short)1);
    localdpR.b(paramdbV);
    cjO.clE().j(localdpR);
  }

  public static void addFriendToGroup(cSx paramcSx, dbV paramdbV) {
    djK localdjK = new djK();
    localdjK.a(go.aEq);
    localdjK.setName(paramdbV.aJm());
    cjO.clE().j(localdjK);
  }

  public static void removeIgnore(cSx paramcSx, dbV paramdbV) {
    dpR localdpR = new dpR();
    localdpR.d(19021);
    localdpR.setType((short)2);
    localdpR.b(paramdbV);
    cjO.clE().j(localdpR);
  }

  public static void displayDisconnectedPlayers(cSx paramcSx) {
    dmY.cUs().jC(((br)paramcSx.cIk()).getSelected());
  }
}