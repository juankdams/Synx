public abstract class rP
{
  private final Oo aZR;
  private final cbI aZS;

  protected rP(Oo paramOo)
  {
    this.aZR = paramOo;
    this.aZS = null;
  }

  public rP(Oo paramOo, cbI paramcbI) {
    this.aZR = paramOo;
    this.aZS = paramcbI;
  }

  public Oo yl() {
    return this.aZR;
  }

  public byte xH() {
    return this.aZR.bJ();
  }

  public boolean ym() {
    return this.aZS != null;
  }

  public cbI yn() {
    return this.aZS;
  }

  public abstract byte yo();

  public abstract int yp();

  public abstract String yq();

  public abstract String yr();

  public String toString() {
    return yq() + " : " + yr();
  }
}