public abstract class bkX
  implements cHj
{
  private double fBs;
  private double fBt;
  private double fBu;
  private int fBv;
  private int fBw;
  private boolean aQS;
  private double fBx;

  private static double n(double paramDouble)
  {
    return Math.pow(20.0D + paramDouble, 7.0D);
  }

  private static double o(double paramDouble) {
    return Math.pow(paramDouble, 0.1428571428571429D) - 20.0D;
  }

  protected final void bvC()
  {
    this.aQS = true;
  }

  private void bvD() {
    if (!this.aQS) {
      return;
    }
    this.aQS = false;

    short[] arrayOfShort1 = acn();
    if (arrayOfShort1.length == 0) {
      reset();
      return;
    }

    if (arrayOfShort1.length == 1) {
      this.fBs = arrayOfShort1[0];
      this.fBt = arrayOfShort1[0];
      this.fBu = 1.0D;
      this.fBx = n(arrayOfShort1[0]);
      this.fBw = arrayOfShort1[0];
      this.fBv = arrayOfShort1[0];
      return;
    }

    double d = 0.0D;
    this.fBw = 0;
    this.fBv = 0;
    for (int k : arrayOfShort1) {
      d += n(k);
      this.fBw += k;
      if (k > this.fBv) {
        this.fBv = k;
      }
    }

    this.fBs = o(d);
    this.fBt = o(d / getSize());
    this.fBu = (d / n(aco()));
    this.fBx = d;
  }

  private void reset()
  {
    this.fBs = 0.0D;
    this.fBu = 0.0D;
    this.fBt = 0.0D;
  }

  protected abstract short[] acn();

  protected abstract double aco();

  public abstract int getSize();

  public double bvE()
  {
    bvD();
    return this.fBs;
  }

  public double bvF() {
    bvD();
    return this.fBt;
  }

  public double bvG() {
    bvD();
    return this.fBu;
  }

  public double bQ(short paramShort) {
    bvD();
    return paramShort / this.fBv;
  }

  public int bvH() {
    bvD();
    return this.fBw;
  }

  public static double g(double paramDouble1, double paramDouble2) {
    return n(paramDouble2) / n(paramDouble1);
  }
}