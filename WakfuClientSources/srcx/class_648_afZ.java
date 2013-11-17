import org.apache.log4j.Logger;

public class afZ extends dfN
{
  public static final bOO cZr = new bOO(new azQ());

  public cMb av()
  {
    cz localcz;
    try {
      localcz = (cz)cZr.Mm();
      cz.a(localcz, cZr);
    } catch (Exception localException) {
      cz.i().error("Erreur lors de l'extraction du pool", localException);
      localcz = new cz();
    }
    return localcz;
  }
}