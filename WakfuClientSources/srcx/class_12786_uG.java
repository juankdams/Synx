import org.apache.log4j.Logger;

public class uG extends dfN
{
  private static bOO bf = new bOO(new bqs());

  public cMb av()
  {
    cQj localcQj;
    try
    {
      localcQj = (cQj)bf.Mm();
      cQj.a(localcQj, bf);
    } catch (Exception localException) {
      cQj.an().error("Erreur lors de l'extraction d'un WeatherBoard du pool", localException);
      localcQj = new cQj();
    }
    return localcQj;
  }
}