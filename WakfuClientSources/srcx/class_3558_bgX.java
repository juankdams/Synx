import org.apache.log4j.Logger;

public class bgX extends dfN
{
  private static bOO bf = new bOO(new dhd());

  public cMb av()
  {
    daI localdaI;
    try
    {
      localdaI = (daI)bf.Mm();
      daI.a(localdaI, bf);
    } catch (Exception localException) {
      daI.i().error("Erreur lors de l'extraction d'un " + daI.class.getName() + " du pool", localException);
      localdaI = new daI();
    }
    return localdaI;
  }
}