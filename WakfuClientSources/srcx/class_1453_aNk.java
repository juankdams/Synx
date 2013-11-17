import org.apache.log4j.Logger;

public class aNk extends cHP
{
  private static final Logger K = Logger.getLogger(aNk.class);
  private int aPt;
  private boolean aEI;
  private bBr aEJ = bBr.guh;

  protected boolean aM(String paramString)
  {
    try {
      if (!paramString.contains(";")) {
        this.aPt = Integer.parseInt(paramString);
      }
      else if (!gV(paramString)) {
        return false;
      }

      return true;
    } catch (IllegalArgumentException localIllegalArgumentException) {
      K.error("Impossible d'initialiser un " + getClass().getName() + " : " + paramString + " invalid  " + localIllegalArgumentException.getMessage());
    }return false;
  }

  private boolean gV(String paramString)
  {
    String[] arrayOfString = dzp.c(paramString, ';');
    if ((arrayOfString.length != 2) && (arrayOfString.length != 3)) {
      K.error("Impossible d'initialiser un " + getClass().getName() + " nombre de paramètre invalide: " + paramString + "(attendu: idParticule(int)[;alwaysActivated(boolean)][;localisation(string)])");

      return false;
    }

    this.aPt = Integer.parseInt(arrayOfString[0]);
    String str1 = arrayOfString[1];
    String str2 = null;
    if (arrayOfString.length == 3) {
      str2 = arrayOfString[2];
    }

    if ((str1.equalsIgnoreCase("true")) || (str1.equalsIgnoreCase("false")))
      this.aEI = Boolean.parseBoolean(str1);
    else if (arrayOfString.length == 2) {
      str2 = str1;
    }

    if (str2 == null) {
      return true;
    }

    if (str2.equalsIgnoreCase("tete")) {
      this.aEJ = bBr.guk;
    } else if (str2.equalsIgnoreCase("corps")) {
      this.aEJ = bBr.guj;
    } else if (str2.equalsIgnoreCase("pied")) {
      this.aEJ = bBr.gui;
    } else {
      K.error("Erreur de parametre, localisation inconnue " + str2 + ", " + toString());
      return false;
    }

    return true;
  }

  public cVZ Ds()
  {
    return cVZ.kIL;
  }

  public int bec() {
    return this.aPt;
  }

  public boolean bed() {
    return this.aEI;
  }

  public bBr bee() {
    return this.aEJ;
  }

  public String toString() {
    return "HMIParticleSystemAction{m_particleSystemId=" + this.aPt + ", m_alwaysActivated=" + this.aEI + ", m_localisation=" + this.aEJ + "} " + super.toString();
  }
}