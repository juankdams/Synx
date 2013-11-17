import org.apache.log4j.Logger;

public class dMC
  implements b
{
  protected static final Logger K = Logger.getLogger(dMC.class);
  protected dbE iKX;
  private final adf hyE;

  public dMC(dbE paramdbE, adf paramadf)
  {
    this.iKX = paramdbE;
    this.hyE = paramadf;
  }

  public byte LA() {
    return 1;
  }

  public bxA LF() {
    return this.iKX.LF();
  }

  public adf LG() {
    return this.hyE;
  }

  public bcJ LE() {
    return this.iKX;
  }

  public tl LH() {
    return this.iKX != null ? this.iKX.aDG() : null;
  }

  public UG LB() {
    return this.iKX != null ? this.iKX.LB() : null;
  }

  public aYF LD() {
    return this.iKX;
  }

  public aJD LC() {
    return this.iKX != null ? this.iKX.LC() : null;
  }

  public dbE dps() {
    return this.iKX;
  }

  public int a() {
    return this.iKX.getId();
  }

  public void a(aAn paramaAn) {
    this.iKX.a(paramaAn);
  }

  public void z(dle paramdle) {
    this.iKX.z(paramdle);
  }

  public dkv agb() {
    return this.iKX.agb();
  }

  public bxO agc() {
    return this.iKX.agc();
  }

  public boolean bbU() {
    if (this.iKX == null) {
      return false;
    }

    return this.iKX.aEt().bbU();
  }
}