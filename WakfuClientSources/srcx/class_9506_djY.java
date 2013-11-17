import org.apache.log4j.Logger;

public class djY extends cHP
{
  private static final Logger K = Logger.getLogger(aNk.class);
  private String leU;
  private boolean leV;

  protected boolean aM(String paramString)
  {
    try
    {
      String[] arrayOfString = dzp.c(paramString, ';');
      if ((arrayOfString == null) || (arrayOfString.length != 2)) {
        K.error("Impossible d'initialiser un " + getClass().getName() + ", pas assez de paramètres (il en faut 2 : monsterBreedId, displayEquipment) : " + paramString);

        return false;
      }
      this.leU = arrayOfString[0];
      this.leV = bUD.getBoolean(arrayOfString[1]);

      return true;
    } catch (NumberFormatException localNumberFormatException) {
      K.error("Impossible d'initialiser un " + getClass().getName() + ", mauvaise saisi des paramètres  : " + paramString);
    }return false;
  }

  public cVZ Ds()
  {
    return cVZ.kIZ;
  }

  public boolean cSD() {
    return this.leV;
  }

  public String cSE() {
    return this.leU;
  }
}