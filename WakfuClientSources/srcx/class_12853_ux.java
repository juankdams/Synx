import org.apache.log4j.Logger;

public final class ux extends cHP
{
  private static final Logger K = Logger.getLogger(ux.class);
  private String bih;
  private String bii;

  protected boolean aM(String paramString)
  {
    try
    {
      String[] arrayOfString = dzp.c(paramString, ';');
      if ((arrayOfString == null) || (arrayOfString.length != 2)) {
        K.error("Impossible d'initialiser un " + getClass().getName() + ", pas assez de paramètres (il en faut 1 : deltaAltitude) : " + paramString);

        return false;
      }
      this.bih = arrayOfString[0];
      this.bii = arrayOfString[1];
      return true;
    } catch (Exception localException) {
      K.error("Impossible d'initialiser un " + getClass().getName() + " : " + paramString + " n'est pas valide");
    }return false;
  }

  public String Dq()
  {
    return this.bih;
  }

  public String Dr() {
    return this.bii;
  }

  public cVZ Ds()
  {
    return cVZ.kIY;
  }
}