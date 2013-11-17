import org.apache.log4j.Logger;

public class bws extends dKc
{
  private static final Logger K = Logger.getLogger(bws.class);
  private dMt ggP;

  public bws(dMt paramdMt)
  {
    this.ggP = paramdMt;
  }

  public short fU() {
    return 22;
  }

  public boolean fV()
  {
    dKc localdKc = this.bSY.bSe();
    return (localdKc == null) || (localdKc == this);
  }

  public void begin() {
    K.info("[COIN_MACHINE] Lancement de l'occupation");

    this.bSY.a(this);
  }

  public boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    K.info("[COIN_MACHINE] On cancel l'occupation");
    if (paramBoolean2)
      this.ggP.b(dJO.lVK, byv.bFN().bFO());
    return fW();
  }

  public boolean fW() {
    K.info("[COIN_MACHINE] On fini l'occupation");

    return true;
  }
}