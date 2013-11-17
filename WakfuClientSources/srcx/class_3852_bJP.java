public class bJP
{
  public static double gLD = 4.0D;

  public static double gLE = 4.0D;

  private final bFJ gLF = new bFJ(0.0D, 0.0D);
  private bFJ gLG;
  private bFJ gLH;

  public bJP()
  {
  }

  public bJP(double paramDouble1, double paramDouble2)
  {
    this.gLF.x = paramDouble1;
    this.gLF.y = paramDouble2;
  }

  public void D(double paramDouble) {
    this.gLF.x = paramDouble;
  }

  public void E(double paramDouble) {
    this.gLF.y = paramDouble;
  }

  public bJP h(double paramDouble1, double paramDouble2) {
    this.gLF.x = paramDouble1;
    this.gLF.y = paramDouble2;
    return this;
  }

  public double getX() {
    return this.gLF.x;
  }

  public double getY() {
    return this.gLF.y;
  }

  public double bRr() {
    return this.gLG == null ? this.gLF.x : this.gLG.x;
  }

  public double bRs() {
    return this.gLG == null ? this.gLF.y : this.gLG.y;
  }

  public double bRt() {
    return this.gLH == null ? this.gLF.x : this.gLH.x;
  }

  public double bRu() {
    return this.gLH == null ? this.gLF.y : this.gLH.y;
  }

  public void bRv() {
    this.gLG = null;
  }

  public bJP i(double paramDouble1, double paramDouble2) {
    if ((Math.abs(getX() - paramDouble1) < gLD) && (Math.abs(getY() - paramDouble2) < gLE))
      this.gLG = null;
    else {
      this.gLG = new bFJ(paramDouble1, paramDouble2);
    }
    return this;
  }

  public boolean bRw() {
    return this.gLG != null;
  }

  public boolean bRx() {
    return this.gLH != null;
  }

  public void bRy() {
    this.gLH = null;
  }

  public bJP j(double paramDouble1, double paramDouble2) {
    if ((Math.abs(getX() - paramDouble1) < gLD) && (Math.abs(getY() - paramDouble2) < gLE))
      this.gLH = null;
    else {
      this.gLH = new bFJ(paramDouble1, paramDouble2);
    }
    return this;
  }

  public void k(double paramDouble1, double paramDouble2) {
    if (bRw()) {
      this.gLG.x += paramDouble1;
      this.gLG.y += paramDouble2;
    }
  }

  public void l(double paramDouble1, double paramDouble2) {
    if (bRx()) {
      this.gLH.x += paramDouble1;
      this.gLH.y += paramDouble2;
    }
  }

  public bJP bRz() {
    bJP localbJP = new bJP(getX(), getY());
    if (bRw())
      localbJP.i(bRr(), bRs());
    if (bRx())
      localbJP.j(bRt(), bRu());
    return localbJP;
  }

  public boolean d(bJP parambJP) {
    if ((getX() != parambJP.getX()) || (getY() != parambJP.getY()))
      return false;
    if ((bRr() != parambJP.bRr()) || (bRs() != parambJP.bRs()))
      return false;
    if ((bRt() != parambJP.bRt()) || (bRu() != parambJP.bRu()))
      return false;
    return true;
  }
}