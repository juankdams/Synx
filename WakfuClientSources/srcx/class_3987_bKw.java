public final class bKw
{
  public static final int gNo = 10;
  public static final int gNp = 8;
  private dle gNq;
  private dle gNr;
  private cYk gNs;
  private cYk gNt;

  public boolean bSG()
  {
    if ((this.gNq == null) || (this.gNr == null)) {
      return false;
    }
    int i = bSH();

    if (i <= 0) {
      return true;
    }
    int j = bCO.sf(100);
    return j > i;
  }

  public int bSH()
  {
    cYk localcYk1 = this.gNs != null ? this.gNs : new cYk(this.gNq.fa(), this.gNq.fb());
    cYk localcYk2 = this.gNt != null ? this.gNt : new cYk(this.gNr.fa(), this.gNr.fb());

    int i = localcYk1.ac(localcYk2);

    int j = this.gNq.e(eu.azY);
    int k = this.gNr.e(eu.azY);

    adr localadr = this.gNr.atN().E(this.gNq.fa(), this.gNq.fb(), this.gNq.fc());

    int m = localadr.aps() == 2 ? 0 : (8 - i) * 10;

    return j - (k + m);
  }

  public void w(dle paramdle) {
    this.gNq = paramdle;
  }

  public void x(dle paramdle) {
    this.gNr = paramdle;
  }

  public void H(cYk paramcYk) {
    this.gNs = paramcYk;
  }

  public void I(cYk paramcYk) {
    this.gNt = paramcYk;
  }

  public void reset() {
    this.gNq = null;
    this.gNs = null;
    this.gNt = null;
    this.gNr = null;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Invisible character = ").append(this.gNq).append("\n");
    localStringBuilder.append("Invisible position = ").append(this.gNs).append("\n");
    localStringBuilder.append("Watching character = ").append(this.gNr).append("\n");
    localStringBuilder.append("Watching position = ").append(this.gNt).append("\n");
    localStringBuilder.append("Camouflage Value = ").append(bSH()).append("\n");
    return localStringBuilder.toString();
  }
}