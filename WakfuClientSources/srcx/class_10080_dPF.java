import org.apache.log4j.Logger;

public class dPF extends dfN
{
  public static bOO bf = new bOO(new ZU());

  public cMb av()
  {
    brT localbrT;
    try
    {
      localbrT = (brT)bf.Mm();
      brT.a(localbrT, bf);
    } catch (Exception localException) {
      brT.an().error("Erreur lors de l'extraction d'une DistributionMachine du pool", localException);
      localbrT = new brT();
    }
    return localbrT;
  }
}