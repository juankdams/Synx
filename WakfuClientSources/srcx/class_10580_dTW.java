import org.apache.log4j.Logger;

public class dTW extends dKc
{
  private static final Logger K = Logger.getLogger(dTW.class);
  private final cUQ gSn;
  private final aND mrg;

  public dTW(cUQ paramcUQ, aND paramaND)
  {
    this.gSn = paramcUQ;
    this.mrg = paramaND;
  }

  public short fU() {
    return 17;
  }

  public boolean fV() {
    return this.bSY.bSe() == null;
  }

  public void begin() {
    K.info("Lancement de l'occupation BROWSE_COLLECTOR");

    this.bSY.a(this);

    byv.bFN().a(DM.bIC);
  }

  public boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    K.info("On cancel l'occupation BROWSE_COLLECTOR");
    if (paramBoolean2)
      this.gSn.bPj().b(dJO.lVI, byv.bFN().bFO());
    return fW();
  }

  public boolean fW() {
    K.info("On fini l'occupation BROWSE_COLLECTOR");

    if (byv.bFN().c(dqF.cXV())) {
      byv.bFN().b(dqF.cXV());
    }

    byv.bFN().b(DM.bIC);

    return true;
  }

  public void aR(byte[] paramArrayOfByte)
  {
    this.gSn.al(paramArrayOfByte);
    if (this.mrg != null)
      this.mrg.B();
  }

  public void a(dFu paramdFu, int paramInt)
  {
    or localor = new or();
    localor.a(paramdFu);
    localor.bR(paramInt);
    byv.bFN().aJK().d(localor);
  }
}