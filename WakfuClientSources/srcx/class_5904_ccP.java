import org.apache.log4j.Logger;

public class ccP extends dfN
{
  public static bOO bf = new bOO(new qf());

  public cMb av()
  {
    SY localSY;
    try
    {
      localSY = (SY)bf.Mm();
      SY.a(localSY, bf);
    } catch (Exception localException) {
      SY.i().error("Erreur lors de l'extraction d'une GuildMachine du pool", localException);
      localSY = new SY();
    }
    return localSY;
  }
}