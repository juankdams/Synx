import org.apache.log4j.Logger;

public class aZO extends cSx
{
  private static Logger K = Logger.getLogger(aZO.class);

  private static final aee aOr = new bOO(new acC());

  public static aZO boR()
  {
    aZO localaZO;
    try
    {
      localaZO = (aZO)aOr.Mm();
      localaZO.fnG = aOr;
    } catch (Exception localException) {
      K.error("Problème au borrowObject.");
      localaZO = new aZO();
      localaZO.aJ();
    }
    return localaZO;
  }
}