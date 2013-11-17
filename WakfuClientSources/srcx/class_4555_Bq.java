public class Bq extends cSH
{
  private static final String bxp = "receiveArenaSSO";

  public boolean a(tg paramtg)
  {
    hx localhx = this.aGZ.bis();

    String str1 = byv.bFN().bFQ().cNV();
    String str2 = paramtg.bI();
    Object[] arrayOfObject = { str1, str2, Integer.valueOf(aSW.eQm) };

    localhx.b("receiveArenaSSO", arrayOfObject);
    localhx.pz();

    return false;
  }

  public int vN() {
    return 14001;
  }
}