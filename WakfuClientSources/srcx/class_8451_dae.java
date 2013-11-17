import org.apache.log4j.Logger;

public class dae extends dfN
{
  private static final bOO cZr = new bOO(new dyW());

  public cMb av()
  {
    ape localape;
    try
    {
      localape = (ape)cZr.Mm();
      ape.a(localape, cZr);
    } catch (Exception localException) {
      ape.K.error("Erreur lors de l'extraction d'un Phenix du pool", localException);
      localape = new ape();
    }
    return localape;
  }
}