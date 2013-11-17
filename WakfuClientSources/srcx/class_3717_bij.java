public final class bij
{
  private int fyd;
  private int fye;
  private int fyf;
  private int fyg;
  private int dkP;

  public void pJ(int paramInt)
  {
    this.fyf += paramInt;
  }

  public void pK(int paramInt) {
    this.fyg = paramInt;
  }

  public void pL(int paramInt) {
    this.fyd += paramInt;
  }

  public void pM(int paramInt) {
    this.fye += paramInt;
  }

  public int btY() {
    return bCO.a(-100, this.fyf + this.fyg, new int[0]);
  }

  public int btZ() {
    return this.fyg;
  }

  public int bua() {
    return this.fyd;
  }

  public int bub() {
    return this.fye;
  }

  public void pN(int paramInt) {
    this.dkP = paramInt;
  }

  public int axv() {
    return this.dkP;
  }
}