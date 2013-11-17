import org.apache.log4j.Logger;

public class bHU extends dfN
{
  private static final bOO cZr = new bOO(new cXS());

  public Od bPr()
  {
    Od localOd;
    try
    {
      localOd = (Od)cZr.Mm();
      Od.a(localOd, cZr);
    } catch (Exception localException) {
      Od.K.error("Erreur lors de l'extraction d'un LootChest du pool", localException);
      localOd = new Od();
    }
    return localOd;
  }
}