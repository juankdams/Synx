import org.apache.log4j.Logger;

public class bxY extends cHP
{
  private static final Logger K = Logger.getLogger(bxY.class);

  private int fwI = 1000;
  private int gjw = 2000;
  private int cTU = 1000;
  private float bmK = 0.5F;
  private float bmL = 77.0F;
  private String gjx = "BOTH";

  protected boolean aM(String paramString)
  {
    try {
      String[] arrayOfString = dzp.c(paramString, ';');
      if ((arrayOfString == null) || (arrayOfString.length > 6)) {
        K.error("Impossible d'initialiser un " + getClass().getName() + ", pas assez de paramètres (il en faut au maximum: startDuration, midDuration, endDuration, amplitude, period, [X,Y,BOTH]) : " + paramString);

        return false;
      }

      int i = arrayOfString.length;
      if (i >= 1) {
        this.fwI = ((int)Float.parseFloat(arrayOfString[0]));
      }
      if (i >= 2) {
        this.gjw = ((int)Float.parseFloat(arrayOfString[1]));
      }
      if (i >= 3) {
        this.cTU = ((int)Float.parseFloat(arrayOfString[2]));
      }
      if (i >= 4) {
        this.bmK = Float.parseFloat(arrayOfString[3]);
      }
      if (i == 5) {
        this.bmL = Float.parseFloat(arrayOfString[4]);
      }
      if (i == 6) {
        this.gjx = arrayOfString[5].toUpperCase();
        if (this.gjx.equals("XY")) {
          this.gjx = "BOTH";
        }
      }

      return true;
    } catch (NumberFormatException localNumberFormatException) {
      K.error("Impossible d'initialiser un " + getClass().getName() + ", mauvaise saisi des paramètres  : " + paramString);
    }return false;
  }

  public cVZ Ds()
  {
    return cVZ.kIO;
  }

  public int bFm() {
    return this.fwI;
  }

  public int bFn() {
    return this.gjw;
  }

  public int bFo() {
    return this.cTU;
  }

  public float bFp() {
    return this.bmK;
  }

  public float bFq() {
    return this.bmL;
  }

  public String getDirection() {
    return this.gjx;
  }
}