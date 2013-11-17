public class oi
{
  public static final String PACKAGE = "wakfu.guildHavenWorld";
  private static final String aTq = "havenWorldElementContainer";

  public static void openLinkedBook(cSx paramcSx)
  {
    bBn localbBn = Hh.QM().dh(17426);
    ((dDX)localbBn.bKr()).display();
  }

  public static void selectTab(dbi paramdbi) {
    if (!paramdbi.isSelected()) {
      return;
    }

    aHd localaHd = (aHd)paramdbi.cIl();
    String str = localaHd.getValue();

    cpa localcpa = localaHd.getElementMap();
    a(localcpa);
    a(localcpa, "havenWorldElementContainer" + str, true);
  }

  private static void a(cpa paramcpa) {
    a(paramcpa, "havenWorldElementContainer1", false);
    a(paramcpa, "havenWorldElementContainer2", false);
    a(paramcpa, "havenWorldElementContainer3", false);
    a(paramcpa, "havenWorldElementContainer4", false);
  }

  private static void a(cpa paramcpa, String paramString, boolean paramBoolean) {
    dOc localdOc = (dOc)paramcpa.fi(paramString);
    if (localdOc != null)
      localdOc.setVisible(paramBoolean);
  }
}