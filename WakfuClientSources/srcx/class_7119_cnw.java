import org.apache.log4j.Logger;

public final class cnw extends cHP
{
  private static final Logger K = Logger.getLogger(cnw.class);
  private String UV;

  protected boolean aM(String paramString)
  {
    try
    {
      String[] arrayOfString = dzp.c(paramString, ';');
      if ((arrayOfString == null) || (arrayOfString.length != 1)) {
        K.error("Impossible d'initialiser un " + getClass().getName() + ", pas assez de paramètres (il en faut 1 : Animstatix) : " + paramString);
        return false;
      }
      this.UV = arrayOfString[0];
      return true;
    } catch (NumberFormatException localNumberFormatException) {
      K.error("Impossible d'initialiser un " + getClass().getName() + ", mauvaise saisi des paramètres  : " + paramString);
    }return false;
  }

  public cVZ Ds()
  {
    return cVZ.kIW;
  }

  public String getAnimName() {
    return this.UV;
  }
}