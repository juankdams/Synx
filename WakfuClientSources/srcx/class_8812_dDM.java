import org.apache.log4j.Logger;

public class dDM extends dfN
{
  private static bOO bf = new bOO(new aQN());

  public cMb av()
  {
    ckG localckG;
    try
    {
      localckG = (ckG)bf.Mm();
      ckG.a(localckG, bf);
    } catch (Exception localException) {
      ckG.i().error("Erreur lors de l'extraction d'un SeedSpreader du pool", localException);
      localckG = new ckG();
    }
    return localckG;
  }
}