import org.apache.log4j.Logger;

public abstract class bdq extends aye
{
  private String fou;
  private String fov;
  private boolean fow;
  private String fox;
  private doh foy;

  public String brr()
  {
    return this.fou;
  }

  public void hY(String paramString) {
    this.fou = paramString;
  }

  public String getPassword() {
    return this.fov;
  }

  public void setPassword(String paramString) {
    this.fov = paramString;
  }

  public String brs() {
    return this.fox;
  }

  public void hZ(String paramString) {
    this.fox = paramString;
  }

  public boolean brt() {
    return this.fow;
  }

  public void eB(boolean paramBoolean) {
    this.fow = paramBoolean;
  }

  public doh bru() {
    return this.foy;
  }

  public void a(doh paramdoh) {
    this.foy = paramdoh;
  }

  public void awO()
  {
    super.awO();

    aaX.anG().reset();
  }

  public void cleanUp()
  {
    super.cleanUp();
    this.fou = null;
    this.fov = null;
    this.fow = false;
    this.foy = null;
    this.fox = null;
  }

  public boolean a(aDs paramaDs)
  {
    doh localdoh = bru();
    if (localdoh != null) {
      while (localdoh.cVx()) {
        acz localacz = localdoh.cVw();
        int i = !localdoh.cVx() ? 1 : 0;
        if (localacz != null) {
          try
          {
            bs((byte)20);
            K.info("Connexion au proxy :" + localacz.getHost() + ":" + localacz.getPort());
            boolean bool = paramaDs.a(localacz.getHost(), localacz.getPort(), this);
            if (bool)
              return bool;
          }
          catch (Exception localException) {
            K.error("connect :", localException);
          }
        }
      }
    }

    bs((byte)0);
    paramaDs.aPE().c(null, null);

    bry();
    K.error("Aucun proxy n'est disponible");

    bs((byte)0);
    return false;
  }

  public void brv()
  {
    if ((!this.fow) && (aJK() != null) && (aJK().Br().isConnected()))
      brz();
  }

  public void brw()
  {
    if ((this.fow) && (aJK() != null) && (aJK().Br().isConnected()))
      brA();
  }

  public void brx()
  {
    brB();
    K.error("La méthode gotoWorldSelection() ne devrait plus être utilisée.");
  }

  public void quit()
  {
    brC();
  }

  protected abstract void bry();

  protected abstract void brz();

  protected abstract void brA();

  protected abstract void brB();

  protected abstract void brC();
}