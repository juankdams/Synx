import org.apache.log4j.Logger;

public class cLU extends dfN
{
  private static final bOO bf = new bOO(new cTc());

  public aYN cER()
  {
    aYN localaYN;
    try
    {
      localaYN = (aYN)bf.Mm();
      aYN.a(localaYN, bf);
    } catch (Exception localException) {
      aYN.K.error("Erreur lors de l'extraction d'un LootChest du pool", localException);
      localaYN = new aYN();
    }
    return localaYN;
  }
}