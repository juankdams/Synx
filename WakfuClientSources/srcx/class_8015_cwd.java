import org.apache.log4j.Logger;

public class cwd extends csx
{
  protected csx ctI()
  {
    return new cwd();
  }

  public csx qb() {
    return new cwd();
  }

  public boolean pZ()
  {
    if (this.dvI == null) {
      return false;
    }
    if (!(this.dvI instanceof bKm)) {
      return false;
    }
    byz localbyz = byv.bFN().bFO();

    if (localbyz.bGK()) {
      return false;
    }
    if (localbyz.adF()) {
      return false;
    }

    if (aYP.feK.bnQ()) {
      return false;
    }
    return true;
  }

  public void run()
  {
    if (!pZ()) {
      K.error("Tentative de lancement de l'action '" + pW().bL() + "' alors que isRunnable retourne que l'action est impossible");
      return;
    }
    bKm localbKm = (bKm)this.dvI;
    duf.b(localbKm, bSH.bZs());
  }

  public aiI pW()
  {
    return aiI.dfM;
  }

  public String qa()
  {
    return "followCharacterWithCompass";
  }

  protected int qc()
  {
    return coH.hWA.aw;
  }
}