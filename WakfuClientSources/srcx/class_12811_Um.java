public class Um
{
  public static final String PACKAGE = "wakfu.appearanceManager";

  public static void selectAppearance(arS paramarS)
  {
    if (paramarS.getSelected()) {
      aJa localaJa = new aJa((aYn)paramarS.getValue());
      localaJa.d(17012);
      cjO.clE().j(localaJa);
    }
  }

  public static void next(cSx paramcSx) {
    beO.bsr().next();
  }

  public static void previous(cSx paramcSx) {
    beO.bsr().bss();
  }
}