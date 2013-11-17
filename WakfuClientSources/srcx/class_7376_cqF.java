import org.apache.log4j.Logger;

public class cqF extends cHP
{
  private static final Logger K = Logger.getLogger(aNk.class);
  private final float[] iar = new float[3];
  private float duj;

  protected boolean aM(String paramString)
  {
    try
    {
      String[] arrayOfString = dzp.c(paramString, ';');
      if ((arrayOfString == null) || (arrayOfString.length != 4)) {
        K.error("Impossible d'initialiser un " + getClass().getName() + ", pas assez de paramètres (il en faut 4 : R G B Range) : " + paramString);
        return false;
      }
      this.iar[0] = Float.parseFloat(arrayOfString[0]);
      this.iar[1] = Float.parseFloat(arrayOfString[1]);
      this.iar[2] = Float.parseFloat(arrayOfString[2]);
      this.duj = Float.parseFloat(arrayOfString[3]);

      return true;
    } catch (NumberFormatException localNumberFormatException) {
      K.error("Impossible d'initialiser un " + getClass().getName() + ", mauvaise saisi des paramètres  : " + paramString);
    }return false;
  }

  public cVZ Ds()
  {
    return cVZ.kIM;
  }

  public float[] cpI() {
    return this.iar;
  }

  public float aBd() {
    return this.duj;
  }
}