public class aPB
  implements asq
{
  private static aPB eMl = new aPB();

  public static aPB bgv()
  {
    return eMl;
  }

  public String getName()
  {
    return bU.fH().getString("contentLoader.console");
  }

  public void a(dnq paramdnq)
  {
    cth.cqP().a(aSC.bii());
    cth.cqP().a(new coY());
    if (clP.hOm != null) {
      cth.cqP().f(clP.hOm);
      cth.cqP().f(clP.hOn);
    } else {
      throw new Exception("Impossible de trouver la définition des commandes de console.");
    }

    paramdnq.c(this);
  }
}