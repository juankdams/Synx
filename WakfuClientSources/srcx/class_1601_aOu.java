import org.apache.log4j.Logger;

public class aOu extends dfN
{
  private static bOO bf = new bOO(new nZ());

  public cMb av()
  {
    VE localVE;
    try
    {
      localVE = (VE)bf.Mm();
      VE.a(localVE, bf);
    } catch (Exception localException) {
      VE.i().error("Erreur lors de l'extraction d'un Lever du pool", localException);
      localVE = new VE();
    }
    return localVE;
  }
}