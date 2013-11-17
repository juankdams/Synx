public class bwL extends R
{
  private int ghk;
  private int ghl;
  private int ghm;
  private int ghn;

  public bwL(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(bqc.fKA);
    this.ghk = paramInt1;
    this.ghl = paramInt2;
    this.ghm = paramInt3;
    this.ghn = paramInt4;
  }

  public int bEp() {
    return this.ghk;
  }

  public int bEq() {
    return this.ghl;
  }

  public int bEr() {
    return this.ghm;
  }

  public int bEs() {
    return this.ghn;
  }

  public String toString() {
    return '{' + getClass().getSimpleName() + " : OpenGL version " + this.ghk + '.' + this.ghl + " not available : " + this.ghm + '.' + this.ghn + " present on system}";
  }
}