import org.apache.log4j.Logger;

public class dtL extends dfN
{
  private static bOO bf = new bOO(new bJF());

  public bVU bRl()
  {
    bVU localbVU;
    try
    {
      localbVU = (bVU)bf.Mm();
      bVU.a(localbVU, bf);
    } catch (Exception localException) {
      Ff.K.error("Erreur lors de l'extraction d'un Lever du pool", localException);
      localbVU = new bVU(null);
    }

    cPP localcPP = new cPP();
    abc localabc = (abc)localcPP.p();
    localabc.bP(1);
    localabc.bQ(0);
    localabc.y((byte)3);
    localbVU.c(localabc);
    return localbVU;
  }
}