import org.apache.log4j.Logger;

public class aIO extends dfN
{
  private static final bOO bf = new bOO(new ckF());

  public cMb av()
  {
    czr localczr;
    try
    {
      localczr = (czr)bf.Mm();
      czr.a(localczr, bf);
    } catch (Exception localException) {
      czr.K.error("Erreur lors de l'extraction d'un " + czr.class.getName() + " du pool", localException);
      localczr = new czr();
    }
    return localczr;
  }
}