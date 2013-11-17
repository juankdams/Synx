import org.apache.log4j.Logger;

public class bZf extends cHP
{
  private static final Logger K = Logger.getLogger(aNk.class);
  private String hpy;
  private String[] hpz;
  private int dmf;

  protected boolean aM(String paramString)
  {
    try
    {
      boolean bool = paramString.endsWith("!");
      if (bool) {
        paramString = paramString.substring(0, paramString.length() - 1);
      }
      String[] arrayOfString = dzp.c(paramString, ';');
      if ((arrayOfString != null) && (arrayOfString.length >= 1)) {
        this.hpy = arrayOfString[0].intern();
        int i = 1 + w(arrayOfString);
        this.hpz = (bool ? null : j(arrayOfString, i));
        return true;
      }

      K.error("Impossible d'initialiser un " + getClass().getName() + ", pas assez de paramètres (il en faut au moins 2 : AppearanceId;parts...., ou un seul, mais avec un ! à la fin) : " + paramString);

      return false;
    }
    catch (NumberFormatException localNumberFormatException) {
      K.error("Impossible d'initialiser un " + getClass().getName() + ", mauvaise saisi des paramètres  : " + paramString);
    }return false;
  }

  private static String[] j(String[] paramArrayOfString, int paramInt)
  {
    String[] arrayOfString = new String[paramArrayOfString.length - paramInt];
    for (int i = 0; i < arrayOfString.length; i++) {
      String str = paramArrayOfString[(i + paramInt)];
      arrayOfString[i] = (str != null ? str.intern() : null);
    }
    return arrayOfString;
  }

  private int w(String[] paramArrayOfString)
  {
    if (paramArrayOfString.length <= 1)
      return 0;
    try
    {
      this.dmf = Integer.parseInt(paramArrayOfString[1].replace("!", ""));
      return 1;
    }
    catch (NumberFormatException localNumberFormatException) {
    }
    return 0;
  }

  public cVZ Ds()
  {
    return cVZ.kIP;
  }

  public String cdK() {
    return this.hpy;
  }

  public String[] cdL() {
    return this.hpz;
  }

  public int ayf() {
    return this.dmf;
  }
}