import org.apache.log4j.Logger;

public class bCz extends cHP
{
  private static final Logger K = Logger.getLogger(bCz.class);
  private String ki;
  private String kj;

  protected boolean aM(String paramString)
  {
    try
    {
      String[] arrayOfString = dzp.c(paramString, ';');
      if ((arrayOfString == null) || ((arrayOfString.length != 1) && (arrayOfString.length != 2))) {
        K.error("Impossible d'initialiser un " + getClass().getName() + ", pas assez de paramètres (il en faut 2 : AppearanceId;AnimName(facultatif)) : " + paramString);

        return false;
      }
      this.ki = arrayOfString[0];
      if (arrayOfString.length == 2) {
        this.kj = arrayOfString[1];
      }
      return true;
    } catch (Exception localException) {
      K.error("Impossible d'initialiser un " + getClass().getName() + " : " + paramString + " n'est pas valide");
    }return false;
  }

  public cVZ Ds()
  {
    return cVZ.kIV;
  }

  public String asS() {
    return this.ki;
  }

  public String bKX() {
    return this.kj;
  }
}