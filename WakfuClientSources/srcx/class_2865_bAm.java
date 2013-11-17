import org.apache.log4j.Logger;

public class bAm extends cHP
{
  private static final Logger K = Logger.getLogger(aNk.class);
  private String goY;
  private String goZ;
  private String gpa;

  protected boolean aM(String paramString)
  {
    try
    {
      String[] arrayOfString = dzp.c(paramString, ';');
      if ((arrayOfString == null) || (arrayOfString.length != 3)) {
        K.error("Impossible d'initialiser un " + getClass().getName() + ", pas assez de paramètres (il en faut 3) : " + paramString);

        return false;
      }
      this.goY = arrayOfString[0];
      this.goZ = arrayOfString[1];
      this.gpa = arrayOfString[2];

      return true;
    } catch (NumberFormatException localNumberFormatException) {
      K.error("Impossible d'initialiser un " + getClass().getName() + ", mauvaise saisi des paramètres  : " + paramString);
    }return false;
  }

  public cVZ Ds()
  {
    return cVZ.kIU;
  }

  public String bIE() {
    return this.goY;
  }

  public String getPropertyName() {
    return this.goZ;
  }

  public String bIF() {
    return this.gpa;
  }
}