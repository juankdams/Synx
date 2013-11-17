import org.apache.log4j.Logger;

public class dcl extends dfN
{
  private static bOO bf = new bOO(new aTn());

  public cMb av()
  {
    cQt localcQt;
    try
    {
      localcQt = (cQt)bf.Mm();
      cQt.a(localcQt, bf);
    } catch (Exception localException) {
      cQt.i().error("Erreur lors de l'extraction d'un Board du pool", localException);
      localcQt = new cQt();
    }
    return localcQt;
  }
}