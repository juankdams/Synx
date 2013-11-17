import org.apache.log4j.Logger;

public class dPA
{
  protected static final Logger K = Logger.getLogger(dPA.class);
  public static final String PACKAGE = "wakfu.chatOptions";

  public static void createView(cSx paramcSx)
  {
    ddG localddG = (ddG)paramcSx.cIk().getElementMap().fi("windowsComboBox");
    try {
      aAx localaAx = aAx.aMd();
      localaAx.lu(((Integer)localddG.getSelectedValue()).intValue()).aur();
      dLE.doY().a(aAx.aMd(), aAx.bF);
      aAx.aMd().aMt();
    } catch (Exception localException) {
      K.error("Exception", localException);
    }
  }

  public static void selectView(cEv paramcEv) {
    dLE.doY().t("chat.editedView", paramcEv.getItemValue());
  }

  public static void transferView(arS paramarS) {
    dju localdju = (dju)dLE.doY().rv("chat.editedView");
    int i = ((Integer)paramarS.aEv().getItemValue()).intValue();
    int j = aAx.aMd().d(localdju);
    if (i == j)
      return;
    aAx.aMd().a(localdju, j, i);
    dLE.doY().bk("chat.editedView", "windowId");
    aAx.aMd().aMt();
  }

  public static void changeChannel(arS paramarS) {
    dju localdju = (dju)dLE.doY().rv("chat.editedView");
    cgv localcgv = (cgv)paramarS.aEv().getItemValue();
    localdju.a(abi.dW(localcgv.getCommand()), true);
    aAx.aMd().aMt();
  }
}