public class dec
{
  public static void bcC()
  {
    cOU();
  }

  private static void cOU() {
    dLE.doY().t("almanachUnlocked", Boolean.valueOf(false));

    lZ locallZ = new lZ();
    String str = bU.fH().getString("openCloseAlmanachDialog");
    locallZ.a(str);
    locallZ.tH();
    locallZ.a(bU.fH().getString("unlocked.the", new Object[] { bU.fH().c(cGN.iBV) }));
    dLE.doY().t("almanachTooltipDescription", locallZ.toString());

    dDE.dft().b(new dnD(cGN.iBV, "almanachUnlocked", Boolean.valueOf(true)));
    dDE.dft().b(new dnD(cGN.iBV, "almanachTooltipDescription", str));
  }
}