import org.apache.log4j.Logger;

public class bNB extends dfN
{
  static final bOO bf = new bOO(dbW.kUB);

  public cMb av()
  {
    dbW localdbW;
    try {
      localdbW = (dbW)bf.Mm();
      dbW.a(localdbW, bf);
    } catch (Exception localException) {
      dbW.an().error("Erreur lors de l'extraction d'une DistributionMachine du pool", localException);
      localdbW = new dbW();
    }
    return localdbW;
  }
}