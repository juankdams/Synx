public class bdl extends csx
{
  private String dqd;

  public aiI pW()
  {
    return aiI.dfN;
  }

  public void run()
  {
    bKm localbKm = (bKm)this.dvI;
    byv.bFN().bFO().bHj().ch(localbKm.getName());
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

    if (localbyz.cJf().UI().aMP().jq(localbKm.cJf().bP()) == dqU.ltp) {
      this.dqd = "invitToJoinGroupErrorNationEnemy";
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

    if (localbyz.c(dKm.lXB))
      return false;
    if (localbKm.c(dKm.lXB)) {
      return false;
    }
    if (localbyz.bHj().Td()) {
      Fs localFs = localbyz.bHj().Ta();
      if (localFs.N(localbKm.getId())) {
        return false;
      }
    }
    return true;
  }

  public String qa()
  {
    return "invitToJoinGroup";
  }

  public String getLabel()
  {
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

  public csx qb()
  {
    return new bdl();
  }

  protected int qc()
  {
    return coH.hWv.aw;
  }
}