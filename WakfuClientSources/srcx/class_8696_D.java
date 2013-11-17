public class D extends alw
{
  private final aiJ aM;

  public D(aiJ paramaiJ)
  {
    this.aM = paramaiJ;
  }

  protected long P() {
    bCP localbCP = byv.bFN().bFO().bGa();
    try {
      dpg[] arrayOfdpg = this.aM.avx();
      if (arrayOfdpg == null)
        return -1L;
      int i = arrayOfdpg[0].getId();
      return (localbCP.sm(i) ? Long.valueOf(localbCP.mi(i)) : null).longValue(); } catch (Exception localException) {
    }
    return -1L;
  }

  public int getId()
  {
    return this.aM.getId();
  }

  protected String getDescription() {
    return bU.fH().b(64, this.aM.getId(), new Object[0]);
  }

  protected boolean Q() {
    bCP localbCP = byv.bFN().bFO().bGa();
    int i = this.aM.getId();
    return (!localbCP.lZ(i)) || (localbCP.ma(i));
  }

  protected boolean R() {
    return cHT.iDr.xW(this.aM.getId());
  }

  protected boolean S() {
    return this.aM.avz();
  }

  protected boolean T() {
    return byv.bFN().bFO().Lk() == this.aM.D();
  }

  public void U() {
    dLE.doY().a(this, new String[] { "isCompleted" });
  }

  public void V()
  {
    dLE.doY().a(this, new String[] { "progressionText" });
  }
}