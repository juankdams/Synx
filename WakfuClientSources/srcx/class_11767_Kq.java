import org.apache.log4j.Logger;

public class Kq extends csx
{
  public csx qb()
  {
    return new Kq();
  }

  public boolean pZ()
  {
    if (!(this.dvI instanceof bKm)) {
      return false;
    }
    byz localbyz = byv.bFN().bFO();
    if (localbyz.bGK()) {
      return false;
    }
    if (localbyz.c(dKm.lXC)) {
      return false;
    }
    bKm localbKm = (bKm)this.dvI;
    if (localbKm.c(dKm.lXC)) {
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
    bzu localbzu = new bzu();
    localbzu.d(19061);
    localbzu.a(localbKm.getName());
    cjO.clE().j(localbzu);
  }

  public aiI pW()
  {
    return aiI.dfR;
  }

  public String qa()
  {
    return "createPrivateChat";
  }

  public String getLabel()
  {
    if (!(this.dvI instanceof bKm)) {
      return null;
    }
    return bU.fH().getString("desc.mru." + qa(), new Object[] { ((bKm)this.dvI).getName() });
  }

  protected int qc()
  {
    return coH.hWk.aw;
  }
}