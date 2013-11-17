public class dUr
{
  public static final String PACKAGE = "wakfu.gazette";

  public static void displayGazette(cEv paramcEv)
  {
    asY localasY = (asY)paramcEv.getItemValue();
    if (localasY.VC()) {
      bzu localbzu = new bzu();
      localbzu.d(16880);
      localbzu.e(localasY.getId());
      cjO.clE().j(localbzu);
    }
  }
}