import java.util.Random;

public class btz
{
  protected final double gcf;
  protected final double gcg;
  protected final double gch;
  protected final Random aFu;

  public btz(double paramDouble1, double paramDouble2)
  {
    this(paramDouble1, paramDouble2, System.currentTimeMillis());
  }

  public btz(double paramDouble1, double paramDouble2, long paramLong) {
    this.gcf = paramDouble1;
    this.gcg = paramDouble2;
    this.gch = (this.gcg * this.gcg);
    this.aFu = new yb(paramLong);
  }

  public double u(double paramDouble)
  {
    double d1 = paramDouble - this.gcf;
    double d2 = 1.0D / Math.sqrt(6.283185307179586D * this.gch);
    return d2 * Math.exp(-(d1 * d1) / (2.0D * this.gch));
  }

  public double nextDouble()
  {
    double d = this.aFu.nextGaussian();

    return this.gcf + this.gcg * d;
  }

  public String toString()
  {
    return "CraftDistribution{m_mean=" + this.gcf + ", m_deviation=" + this.gcg + ", m_variance=" + this.gch + '}';
  }
}