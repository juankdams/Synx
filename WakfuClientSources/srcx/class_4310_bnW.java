public class bnW
{
  public static final String PACKAGE = "wakfu.debugAnm";

  public static void updateLinkageList(cSx paramcSx)
  {
    dd.gW().gX();
  }

  public static void selectionChanged(arS paramarS) {
    if (paramarS.getSelected())
      dd.gW().D((String)paramarS.getValue());
  }

  public static void play(cSx paramcSx)
  {
    dd.gW().play();
  }

  public static void setSkin(cSx paramcSx, aTp paramaTp) {
    dd.gW().C(paramaTp.getText());
  }

  public static void setType(cSx paramcSx, String paramString) {
    dd.gW().setType(paramString);
  }
}