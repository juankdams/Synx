import org.apache.log4j.Logger;

public class coW extends csx
{
  private static final Logger K = Logger.getLogger(coW.class);

  public aiI pW()
  {
    return aiI.dgy;
  }

  public String getLabel()
  {
    if (!(this.dvI instanceof Su)) {
      return null;
    }

    Su localSu = (Su)this.dvI;
    lZ locallZ = new lZ().tz().a(bU.fH().getString("desc.mru." + qa(), new Object[] { localSu.getName() })).tA();

    return locallZ.tP();
  }

  public String qa()
  {
    return "followPlayer";
  }

  protected int qc()
  {
    return coH.hXC.aw;
  }

  public void run()
  {
    if (!pZ()) {
      K.error("Tentative de lancement de l'action '" + pW().bL() + "' alors que isRunnable retourne que l'action est impossible");
      return;
    }

    bKm localbKm = (bKm)this.dvI;
    byv.bFN().a(new dRP(localbKm));
  }

  public boolean isEnabled()
  {
    return super.isEnabled();
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
    if (localbyz.c(dKm.lXD)) {
      return false;
    }
    bKm localbKm = (bKm)this.dvI;
    if (localbKm.adF())
      return false;
    if (localbKm.c(dKm.lXD)) {
      return false;
    }
    return true;
  }

  public csx qb()
  {
    return new coW();
  }
}