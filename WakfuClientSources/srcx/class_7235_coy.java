import org.apache.log4j.Logger;

public class coy
{
  public static final String PACKAGE = "wakfu.roomManager";
  protected static final Logger K = Logger.getLogger(coy.class);

  public static void addUser(cSx paramcSx, dwN paramdwN, aTp paramaTp)
  {
    K.error("DimensionalBagRoomManagerDialogAction.addUser()");
  }

  public static void removeUser(cSx paramcSx, dso paramdso, dwN paramdwN)
  {
    K.error("DimensionalBagRoomManagerDialogAction.removeUser()");
  }

  public void a(cSx paramcSx, dso paramdso)
  {
    dlX localdlX = new dlX();

    byv.bFN().aJK().d(localdlX);
  }

  public static void changeUserPermission(cSx paramcSx, dso paramdso, dwN paramdwN)
  {
    K.error("DimensionalBagRoomManagerDialogAction.changeUserPermission()");
  }

  public void b(cSx paramcSx, dso paramdso)
  {
    aU localaU = new aU();
    byv.bFN().aJK().d(localaU);
  }

  public static void onClicktRoom(cSx paramcSx, dwN paramdwN, String paramString) {
    K.error("DimensionalBagRoomManagerDialog.onClicktRoom()");
  }

  public static void changeGroupePermission(cSx paramcSx, dso paramdso, dwN paramdwN)
  {
    K.error("DimensionalBagRoomManagerDialogAction.changeGroupePermission()");
  }

  public static void closeDimensionalBagRoomManagerDialog(cSx paramcSx)
  {
    if (cBQ.cxL().mZ("dimensionalBagRoomManagerDialog")) {
      dLE.doY().t("showRoomBagDetails", Boolean.valueOf(false));
      byv.bFN().b(dFk.dgK());
    }
  }

  public static void changeBagName(cSx paramcSx, dwN paramdwN, aTp paramaTp)
  {
    K.error("DimensionalBagRoomManagerDialogActiob.changeBagRoom()");
  }

  public static void showInfos(cSx paramcSx, bpn parambpn, String paramString)
  {
    if (paramcSx.mp() == CH.bGw) {
      dOc localdOc1 = (dOc)parambpn.getElementMap().fi(paramString + "Info");
      localdOc1.setVisible(!localdOc1.getVisible());
      dOc localdOc2 = (dOc)parambpn.getElementMap().fi(paramString + "Button");
      if (localdOc2.getStyle().equals("add"))
        localdOc2.setStyle("remove");
      else
        localdOc2.setStyle("add");
    }
  }

  public static void closeRoomDetail(dMr paramdMr)
  {
    dLE.doY().t("showRoomBagDetails", Boolean.valueOf(false));
  }

  public static void emptyTextEditor(dMr paramdMr, bpn parambpn, aTp paramaTp)
  {
    if (paramdMr.mp() == CH.bGv)
    {
      if ((paramaTp.getId().equals("tempAccessTextEditor")) && 
        (dLE.doY().getBooleanProperty("isTempAccessTexteditorDefault"))) {
        paramaTp.setText("");
        dLE.doY().t("isTempAccessTexteditorDefault", Boolean.valueOf(true));
      }
    }
  }

  public static void setTempAccessTexteditorProperty(ctH paramctH, dwN paramdwN, aTp paramaTp)
  {
    K.error("DimensionalBagRoomManagerDialogAction.setTempAccessTexteditorProperty()");
  }

  public static void setPermissionsToDefault(dMr paramdMr)
  {
    K.warn("(pas fait : ) Remise des permissions aux valeurs par défaut ");
  }

  public static void dropItem(Qa paramQa, String paramString) {
    Object localObject1 = paramQa.sq();
    Object localObject2;
    if ((localObject1 instanceof dui)) {
      localObject2 = (dui)localObject1;
      czW localczW = new czW();
      localczW.setItem(((dui)localObject2).bYK());
      localczW.c(true);
      localczW.a(bUD.getByte(paramString));
      localczW.e(((dui)localObject2).dad());
      localczW.d(17007);
      cjO.clE().j(localczW);
    } else if ((localObject1 instanceof gA)) {
      localObject2 = new czW();
      ((czW)localObject2).setSourceUniqueId(aTs.getSourceUniqueId());
      ((czW)localObject2).setSourcePosition(aTs.getSourcePosition());
      ((czW)localObject2).setSourceUniqueId(aTs.getSourceUniqueId());
      ((czW)localObject2).setItem((gA)localObject1);
      ((czW)localObject2).c(false);
      ((czW)localObject2).a(bUD.getByte(paramString));
      ((czW)localObject2).d(17007);
      cjO.clE().j((cWG)localObject2);
    }
  }

  public static void closeDialog(cSx paramcSx) {
    byv.bFN().b(dFk.dgK());
  }
}