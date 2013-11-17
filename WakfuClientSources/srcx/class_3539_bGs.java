import org.apache.log4j.Logger;

public class bGs extends cHP
{
  private static final Logger K = Logger.getLogger(aNk.class);
  private boolean gCS;
  private String[] gCT;

  protected boolean aM(String paramString)
  {
    try
    {
      String[] arrayOfString = dzp.c(paramString, ';');
      if ((arrayOfString == null) || (arrayOfString.length < 2)) {
        K.error("Impossible d'initialiser un " + getClass().getName() + ", pas assez de paramètres (il en faut au moins 2 : visibility[true|false];parts....) : " + paramString);

        return false;
      }
      this.gCS = Boolean.parseBoolean(arrayOfString[0]);
      this.gCT = new String[arrayOfString.length - 1];
      System.arraycopy(arrayOfString, 1, this.gCT, 0, this.gCT.length);

      return true;
    } catch (NumberFormatException localNumberFormatException) {
      K.error("Impossible d'initialiser un " + getClass().getName() + ", mauvaise saisi des paramètres  : " + paramString);
    }return false;
  }

  public cVZ Ds()
  {
    return cVZ.kIT;
  }

  public boolean getVisibility() {
    return this.gCS;
  }

  public String[] bEZ() {
    return this.gCT;
  }
}