import org.apache.log4j.Logger;

public class ckk extends cHP
{
  private static final Logger K = Logger.getLogger(aNk.class);

  private float[] bRQ = new float[4];
  private String hLn;

  protected boolean aM(String paramString)
  {
    try
    {
      String[] arrayOfString = dzp.c(paramString, ';');
      if ((arrayOfString == null) || ((arrayOfString.length != 4) && (arrayOfString.length != 5))) {
        K.error("Impossible d'initialiser un " + getClass().getName() + ", pas assez de paramètres (il en faut 5 : R;G;B;A;partName (couleur entre [0-1]) : " + paramString);

        return false;
      }
      this.hLn = arrayOfString[0];
      float f1 = Float.parseFloat(arrayOfString[1]);
      float f2 = Float.parseFloat(arrayOfString[2]);
      float f3 = Float.parseFloat(arrayOfString[3]);
      float f4 = arrayOfString.length == 4 ? 1.0F : Float.parseFloat(arrayOfString[4]);
      this.bRQ = new float[] { f1 * f4, f2 * f4, f3 * f4, f4 };

      return true;
    } catch (NumberFormatException localNumberFormatException) {
      K.error("Impossible d'initialiser un " + getClass().getName() + ", mauvaise saisi des paramètres  : " + paramString);
    }return false;
  }

  public cVZ Ds()
  {
    return cVZ.kIQ;
  }

  public float[] ckE() {
    return this.bRQ;
  }

  public String getPartName() {
    return this.hLn;
  }
}