public abstract class daW
{
  protected Integer kSQ;
  protected Integer kSR;
  protected Long kSS;
  protected Long kST;
  protected Double kSU;

  int cMQ()
  {
    return this.kSQ == null ? 1 : this.kSQ.intValue();
  }

  abstract int PY();

  long cMR() {
    return this.kSS == null ? 0L : this.kSS.longValue();
  }

  long cMS() {
    return this.kST == null ? 9223372036854775807L : this.kST.longValue();
  }

  double cMT() {
    return this.kSU == null ? 1.0D : this.kSU.doubleValue();
  }

  abstract long[] PZ();

  public daW zy(int paramInt) {
    this.kSQ = Integer.valueOf(paramInt);
    return this;
  }

  public daW zz(int paramInt) {
    this.kSR = Integer.valueOf(paramInt);
    return this;
  }

  public daW js(long paramLong) {
    this.kSS = Long.valueOf(paramLong);
    return this;
  }

  public daW jt(long paramLong) {
    this.kST = Long.valueOf(paramLong);
    return this;
  }

  public daW U(double paramDouble) {
    this.kSU = Double.valueOf(paramDouble);
    return this;
  }
}