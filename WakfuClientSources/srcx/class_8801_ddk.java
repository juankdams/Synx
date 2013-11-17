import org.apache.log4j.Logger;

public class ddk extends dKc
{
  protected static final Logger K = Logger.getLogger(ddk.class);
  private final Su Rl;

  public ddk(Su paramSu)
  {
    this.Rl = paramSu;
  }

  public short fU() {
    return 1;
  }

  public boolean fV() {
    return true;
  }

  public void begin() {
    K.trace("Lancement de l'occupation REST pour le joueur " + this.Rl.getId());
    this.Rl.q(false, true);
    cew localcew = this.Rl.aeL();
    if (!localcew.E().LP())
      localcew.c(localcew.E().ew(1));
    localcew.eq("AnimEmote-Repos");
    this.Rl.a(this);
  }

  public boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean2) {
      ayC localayC = new ayC();
      localayC.bt((byte)3);
      localayC.aS(fU());
      byv.bFN().aJK().d(localayC);
    }

    return fW();
  }

  public boolean fW()
  {
    K.trace("On arrete l'occupation REST pour le joueur " + this.Rl.getId());
    cew localcew = this.Rl.aeL();
    if (!localcew.E().LP())
      localcew.c(localcew.E().ew(1));
    if (localcew.ata().startsWith("AnimPosingAssis")) {
      String str = aDO.v(localcew.ata(), true);
      localcew.eq(str);
    }

    return true;
  }
}