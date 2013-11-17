import org.apache.log4j.Logger;

public class bOk extends cHP
{
  private static final Logger K = Logger.getLogger(aNk.class);
  private String cQS;

  protected boolean aM(String paramString)
  {
    try
    {
      String[] arrayOfString = dzp.c(paramString, ';');
      if ((arrayOfString == null) || (arrayOfString.length != 1)) {
        K.error("Impossible d'initialiser un " + getClass().getName() + ", pas assez de paramètres (il en faut 1 : AnimSuffix) : " + paramString);
        return false;
      }
      this.cQS = arrayOfString[0];

      return true;
    } catch (NumberFormatException localNumberFormatException) {
      K.error("Impossible d'initialiser un " + getClass().getName() + ", mauvaise saisi des paramètres  : " + paramString);
    }return false;
  }

  public cVZ Ds()
  {
    return cVZ.kIR;
  }

  public String bVt() {
    return this.cQS;
  }
}