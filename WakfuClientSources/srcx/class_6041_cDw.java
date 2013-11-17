final class cDw
  implements dGy
{
  private static final int iwK = 1000000;
  private bSr iwL;
  private long iwM;
  private float iwN;

  float czs()
  {
    return this.iwN;
  }

  void u(bSr parambSr) {
    this.iwL = parambSr;
    this.iwM = System.nanoTime();
    this.iwN = 0.0F;
  }

  public boolean f(uz paramuz) {
    if ((paramuz == null) || (paramuz.gI())) {
      return true;
    }

    if (paramuz.c(this.iwL)) {
      this.iwN += paramuz.Dy();
      paramuz.bit = Qg.cpf;
    }
    return System.nanoTime() - this.iwM <= 1000000L;
  }
}