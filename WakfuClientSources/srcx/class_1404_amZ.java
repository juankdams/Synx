import com.ankamagames.wakfu.client.WakfuClientInstance;

public class amZ extends csx
{
  private String dqd;

  public aiI pW()
  {
    return aiI.dgm;
  }

  public void run() {
    bKm localbKm = (bKm)this.dvI;
    WakfuClientInstance.awy().awZ().fY(localbKm.getId());
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

    if (localbyz == null) {
      return false;
    }
    return !bBc.f(byv.bFN().bFQ().bOR(), bBc.gto);
  }

  public boolean pZ() {
    if (!(this.dvI instanceof bKm)) {
      return false;
    }
    byz localbyz = byv.bFN().bFO();

    if (localbyz == null) {
      return false;
    }
    return !bBc.f(byv.bFN().bFQ().bOR(), bBc.gto);
  }

  public String qa() {
    return "openModerationPanel";
  }

  public String getLabel() {
    lZ locallZ = new lZ();
    if (!(this.dvI instanceof bKm))
      return null;
    locallZ.tz().am(icr);
    locallZ.a(bU.fH().getString("desc.mru." + qa(), new Object[] { ((bKm)this.dvI).getName() })).tA();
    if (!isEnabled()) {
      locallZ.tH().am(isEnabled() ? icr : ict);
      locallZ.a(bU.fH().getString(this.dqd));
    }
    return locallZ.tP();
  }

  public csx qb() {
    return new amZ();
  }

  protected int qc() {
    return coH.hWt.aw;
  }
}