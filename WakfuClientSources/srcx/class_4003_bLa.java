import org.apache.log4j.Logger;

public class bLa extends dfN
{
  private static final bOO bf = new bOO(new bYC());

  public chz bTh()
  {
    chz localchz;
    try
    {
      localchz = (chz)bf.Mm();
      chz.a(localchz, bf);
    } catch (Exception localException) {
      chz.K.error("Erreur lors de l'extraction d'un LootChest du pool", localException);
      localchz = new chz();
    }
    return localchz;
  }
}