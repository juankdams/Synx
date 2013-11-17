import org.apache.log4j.Logger;

public class cgK extends dfN
{
  private static bOO bf = new bOO(new dSZ());

  public cMb av()
  {
    Em localEm;
    try
    {
      localEm = (Em)bf.Mm();
      Em.a(localEm, bf);
    } catch (Exception localException) {
      Em.an().error("Erreur lors de l'extraction d'un AudioMarker du pool", localException);
      localEm = new Em(null);
    }
    return localEm;
  }
}