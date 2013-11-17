import org.apache.log4j.Logger;

public abstract class bNz
  implements bWU, bXd
{
  protected static final Logger K = Logger.getLogger(bNz.class);
  protected dzF gSF;
  protected dno gSG;
  protected aee aOr;

  protected bNz()
  {
    this.gSF = null;
    this.gSG = null;
  }

  protected void a(dno paramdno, dzF paramdzF)
  {
    this.gSG = paramdno;
    this.gSF = paramdzF;
  }

  public void release()
  {
    if (this.aOr != null) {
      this.aOr.y(this);
      this.aOr = null;
    } else {
      K.error("Double release de " + getClass().toString());
      bc();
    }
  }

  public dzF bVg()
  {
    return this.gSF;
  }

  public dno bVh()
  {
    return this.gSG;
  }

  public void aJ() {
  }

  public void bc() {
    this.gSG = null;
    this.gSF = null;
  }
}