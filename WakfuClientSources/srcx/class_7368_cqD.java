import org.apache.log4j.Logger;

public class cqD extends dfN
{
  private static bOO bf = new bOO(new cEf());

  public cMb av()
  {
    Ff localFf;
    try
    {
      localFf = (Ff)bf.Mm();
      Ff.a(localFf, bf);
    } catch (Exception localException) {
      Ff.K.error("Erreur lors de l'extraction d'un Lever du pool", localException);
      localFf = new Ff();
    }

    cPP localcPP = new cPP();
    abc localabc = (abc)localcPP.p();
    localabc.bP(1);
    localabc.bQ(0);
    localabc.y((byte)3);
    localFf.c(localabc);
    return localFf;
  }
}