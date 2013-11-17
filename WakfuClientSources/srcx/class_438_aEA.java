public class aEA extends csx
{
  public aiI pW()
  {
    return aiI.dgc;
  }

  public void run() {
    bKm localbKm = (bKm)this.dvI;
    dqv localdqv = new dqv();
    localdqv.mA(localbKm.getName());
    byv.bFN().aJK().d(localdqv);
  }

  public boolean isEnabled()
  {
    if (!super.isEnabled()) {
      return false;
    }
    if (!(this.dvI instanceof bKm)) {
      return false;
    }
    bKm localbKm = (bKm)this.dvI;
    byz localbyz = byv.bFN().bFO();

    if ((localbKm == null) || (localbyz == null)) {
      return false;
    }
    return true;
  }

  public boolean pZ()
  {
    if (!(this.dvI instanceof bKm)) {
      return false;
    }
    bKm localbKm = (bKm)this.dvI;
    byz localbyz = byv.bFN().bFO();

    if (dmY.cUs().cUu().ky(localbKm.sN()) != null) {
      return false;
    }

    return true;
  }

  public String qa() {
    return "addToFriendList";
  }

  public String getLabel() {
    if (!(this.dvI instanceof bKm))
      return null;
    return bU.fH().getString("desc.mru." + qa(), new Object[] { ((bKm)this.dvI).getName() });
  }

  public csx qb() {
    return new aEA();
  }

  protected int qc() {
    return coH.hWv.aw;
  }
}