import org.apache.log4j.Logger;

public class bjV extends dfN
{
  public static bOO bf = new bOO(new aQa());

  public cMb av()
  {
    bal localbal;
    try
    {
      localbal = (bal)bf.Mm();
      bal.a(localbal, bf);
    } catch (Exception localException) {
      bal.i().error("Erreur lors de l'extraction d'une GuildMachine du pool", localException);
      localbal = new bal();
    }
    return localbal;
  }
}