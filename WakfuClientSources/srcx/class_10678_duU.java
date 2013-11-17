import org.apache.log4j.Logger;

public class duU extends dfN
{
  private static bOO bf = new bOO(new bVR());

  public drQ cbo()
  {
    drQ localdrQ;
    try
    {
      localdrQ = (drQ)bf.Mm();
      drQ.a(localdrQ, bf);
    } catch (Exception localException) {
      drQ.i().error("Erreur lors de l'extraction d'un DimensionalBagView du pool", localException);
      localdrQ = new drQ();
    }
    return localdrQ;
  }
}