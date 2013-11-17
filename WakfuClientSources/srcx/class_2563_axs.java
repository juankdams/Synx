import org.apache.log4j.Logger;

public class axs extends dfN
{
  private static bOO bf = new bOO(new ajm());

  public cyj awg()
  {
    cyj localcyj;
    try
    {
      localcyj = (cyj)bf.Mm();
      cyj.a(localcyj, bf);
    } catch (Exception localException) {
      cyj.asu().error("Erreur lors de l'extraction d'un Destructible du pool", localException);
      localcyj = new cyj();
    }
    return localcyj;
  }
}