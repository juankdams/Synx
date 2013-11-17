import org.apache.log4j.Logger;

public class cZD extends csx
{
  public csx qb()
  {
    return new cZD();
  }

  public aiI pW()
  {
    return aiI.dfv;
  }

  public void run()
  {
    if (!pZ()) {
      K.error("Tentative de lancement de l'action '" + pW().bL() + "' alors que isRunnable retourne que l'action est impossible");
      return;
    }
    dPm.dqv().dqw();
  }

  public boolean pZ()
  {
    if (!(this.dvI instanceof bKm)) {
      return false;
    }

    if (!((bKm)this.dvI).aeI()) {
      return false;
    }
    if (byv.bFN().bFO().bGK()) {
      return false;
    }
    return true;
  }

  public String qa()
  {
    if (byv.bFN().c(dPm.dqv())) {
      return "tabletClose";
    }
    return "tabletOpen";
  }

  public boolean isEnabled()
  {
    return true;
  }

  protected int qc()
  {
    return coH.hWi.aw;
  }
}