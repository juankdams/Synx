import org.apache.log4j.Logger;

public class dQy extends cHP
{
  private static final Logger K = Logger.getLogger(aNk.class);
  private String hpy;

  protected boolean aM(String paramString)
  {
    try
    {
      String[] arrayOfString = dzp.c(paramString, ';');
      if ((arrayOfString == null) || (arrayOfString.length != 1)) {
        K.error("Impossible d'initialiser un " + getClass().getName() + ", mauvais nombre de paramètres (il en faut 1 : AppearanceId) : " + paramString);
        return false;
      }
      this.hpy = arrayOfString[0];

      return true;
    } catch (NumberFormatException localNumberFormatException) {
      K.error("Impossible d'initialiser un " + getClass().getName() + ", mauvaise saisi des paramètres  : " + paramString);
    }return false;
  }

  public cVZ Ds()
  {
    return cVZ.kIN;
  }

  public String cdK() {
    return this.hpy;
  }
}