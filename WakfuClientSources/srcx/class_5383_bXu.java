import org.apache.log4j.Logger;

public class bXu extends dKc
{
  private static final Logger K = Logger.getLogger(bXu.class);

  private final bbc hmn = new bbc();
  private final mp hmo;

  public bXu(mp parammp)
  {
    this.hmo = parammp;
  }

  public bbc ccJ() {
    return this.hmn;
  }

  public short fU() {
    return 25;
  }

  public boolean fV()
  {
    dKc localdKc = this.bSY.bSe();
    if ((localdKc != null) && (localdKc != this)) {
      return false;
    }

    dUx localdUx = bDk.bLI().cr(this.bSY.Lk());
    if (!localdUx.bMr()) {
      return false;
    }

    long l = this.bSY.bSt().CD();
    return l > 0L;
  }

  public void begin()
  {
    K.info("[HAVEN_WORLD] Lancement de l'occupation");

    this.bSY.a(this);

    byv.bFN().a(this.hmo);
  }

  public boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    K.info("[HAVEN_WORLD] On cancel l'occupation");

    if (paramBoolean2) {
      ayC localayC = new ayC();
      localayC.bt((byte)3);
      localayC.aS(fU());
      byv.bFN().aJK().d(localayC);
    }

    if (byv.bFN().c(this.hmo)) {
      byv.bFN().b(this.hmo);
    }

    aOo.euG.a(null);

    return true;
  }

  public boolean fW() {
    K.info("[HAVEN_WORLD] On fini l'occupation");

    if (byv.bFN().c(this.hmo)) {
      byv.bFN().b(this.hmo);
    }

    ayC localayC = new ayC();
    localayC.bt((byte)2);
    localayC.aS(fU());
    byv.bFN().aJK().d(localayC);

    aOo.euG.a(null);

    return true;
  }

  public mp ccK() {
    return this.hmo;
  }
}