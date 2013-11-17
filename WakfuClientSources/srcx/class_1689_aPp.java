import org.apache.log4j.Logger;

public class aPp extends cHP
{
  private static final Logger K = Logger.getLogger(aPp.class);
  private float eLq;

  protected boolean aM(String paramString)
  {
    try
    {
      String[] arrayOfString = dzp.c(paramString, ';');
      if ((arrayOfString == null) || (arrayOfString.length != 1)) {
        K.error("Impossible d'initialiser un " + getClass().getName() + ", pas assez de paramètres (il en faut 1 : deltaAltitude) : " + paramString);

        return false;
      }
      this.eLq = Float.parseFloat(arrayOfString[0]);
      return true;
    } catch (Exception localException) {
      K.error("Impossible d'initialiser un " + getClass().getName() + " : " + paramString + " n'est pas valide");
    }return false;
  }

  public cVZ Ds()
  {
    return cVZ.kIX;
  }

  public float bgi() {
    return this.eLq;
  }
}