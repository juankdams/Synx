import org.apache.log4j.Logger;

public class aDs
{
  protected static final Logger K = Logger.getLogger(aDs.class);
  private static boolean dYd;
  private dfN dYe;
  private final bHc dYf;
  private cOT dYg;
  private DL dYh;
  private boolean dYi;
  private int bvv = 1000;
  private int bvu;
  private bcT dYj;

  public aDs()
  {
    this.dYf = new bHc("ProxyClient");

    this.dYe = null;
    this.dYh = null;
    this.dYg = null;

    this.dYi = false;

    if (!dYd) {
      cAo.cxf().start();
      dYd = true;
    }
  }

  private void aPz()
  {
    this.dYf.c(this.dYe);
    this.dYf.b(this.dYg);
    this.dYf.d(this.dYh);

    this.dYf.dS(this.bvv);
    this.dYf.dR(this.bvu);

    this.dYf.initialize();

    this.dYi = true;
  }

  private boolean aPA() {
    if (this.dYe == null) {
      return false;
    }
    if (this.dYh == null) {
      return false;
    }
    if (this.dYg == null) {
      return false;
    }
    return true;
  }

  public bHc aPB()
  {
    return this.dYf;
  }

  public boolean a(String paramString, int paramInt, aye paramaye)
  {
    if ((!this.dYi) && (aPA())) {
      aPz();
      this.dYf.ak(null);
    }

    if (this.dYj != null) {
      if (!this.dYj.isConnected()) {
        this.dYj = null;
      } else {
        K.error("Une connexion est toujours active");
        return false;
      }
    }

    K.info("Tentative de connexion " + paramString + " : " + paramInt);

    int i = 3;
    int j = 1000;
    this.dYj = this.dYf.a(paramString, paramInt, 1000, 3);
    if (this.dYj == null) {
      K.error("La connexion au proxy (" + paramString + " : " + paramInt + ") n'a pas pu etre établie en " + 3000 + " ms");
      return false;
    }

    return true;
  }

  public dfN aPC() {
    return this.dYe;
  }

  public void a(dfN paramdfN) {
    this.dYe = paramdfN;
  }

  public cOT aPD() {
    return this.dYg;
  }

  public void a(cOT paramcOT) {
    this.dYg = paramcOT;
  }

  public DL aPE() {
    return this.dYh;
  }

  public void a(DL paramDL) {
    this.dYh = paramDL;
  }

  public void dS(int paramInt)
  {
    this.bvv = paramInt;
  }

  public void dR(int paramInt) {
    this.bvu = paramInt;
  }
}