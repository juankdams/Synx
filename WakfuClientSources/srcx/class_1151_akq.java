import org.apache.log4j.Logger;

public class akq extends dfN
{
  public static bOO bf = new bOO(new ckb());
  private final dFN dln;

  public akq(dFN paramdFN)
  {
    this.dln = paramdFN;
  }

  public cMb av()
  {
    cAK localcAK;
    try {
      localcAK = (cAK)bf.Mm();
      cAK.a(localcAK, bf);
    } catch (Exception localException) {
      cAK.i().error("Erreur lors de l'extraction d'une DistributionMachine du pool", localException);
      localcAK = new cAK();
    }
    localcAK.dln = this.dln;
    return localcAK;
  }
}