import org.apache.log4j.Logger;

public class chP extends dfN
{
  public static final bOO cZr = new bOO(new bta());

  public cMb av()
  {
    aAO localaAO;
    try
    {
      localaAO = (aAO)cZr.Mm();
      aAO.a(localaAO, cZr);
    } catch (Exception localException) {
      aAO.asu().error("Erreur lors de l'extraction d'une CharacterStatue du pool", localException);
      localaAO = new aAO();
    }
    return localaAO;
  }
}