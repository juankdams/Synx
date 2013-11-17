import org.apache.log4j.Logger;

public class iD extends dfN
{
  public static bOO bf = new bOO(new aq());

  public cMb av()
  {
    dpH localdpH;
    try
    {
      localdpH = (dpH)bf.Mm();
      dpH.a(localdpH, bf);
    } catch (Exception localException) {
      dpH.i().error("Erreur lors de l'extraction d'une Mailbox du pool", localException);
      localdpH = new dpH();
    }
    return localdpH;
  }
}