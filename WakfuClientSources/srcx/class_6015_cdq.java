public class cdq extends bTb
{
  protected double hwD;
  protected double hwE;
  protected double hwF;
  protected double hwG;
  protected boolean hwH;
  protected double hwI;
  protected static cdq hwJ = new cdq(0.0D, 1.0D, hp());

  public cdq(double paramDouble1, double paramDouble2, cji paramcji)
  {
    a(paramcji);
    n(paramDouble1, paramDouble2);
  }

  public double J(double paramDouble)
  {
    return cma.m(this.hwD, this.hwE, paramDouble);
  }

  public double nextDouble()
  {
    return m(this.hwD, this.hwF);
  }

  public double m(double paramDouble1, double paramDouble2)
  {
    if ((this.hwH) && (this.hwD == paramDouble1) && (this.hwF == paramDouble2))
    {
      this.hwH = false;
      return this.hwG;
    }
    double d1;
    double d2;
    double d3;
    do
    {
      d1 = 2.0D * this.TN.ckZ() - 1.0D;
      d2 = 2.0D * this.TN.ckZ() - 1.0D;
      d3 = d1 * d1 + d2 * d2;
    }
    while (d3 >= 1.0D);
    double d4 = Math.sqrt(-2.0D * Math.log(d3) / d3);
    this.hwG = (paramDouble1 + paramDouble2 * d1 * d4);
    this.hwH = true;
    return paramDouble1 + paramDouble2 * d2 * d4;
  }

  public double u(double paramDouble)
  {
    double d = paramDouble - this.hwD;
    return this.hwI * Math.exp(-(d * d) / (2.0D * this.hwE));
  }

  protected void a(cji paramcji)
  {
    super.a(paramcji);
    this.hwH = false;
  }

  public void n(double paramDouble1, double paramDouble2)
  {
    if ((paramDouble1 != this.hwD) || (paramDouble2 != this.hwF))
    {
      this.hwD = paramDouble1;
      this.hwF = paramDouble2;
      this.hwE = (paramDouble2 * paramDouble2);
      this.hwH = false;
      this.hwI = (1.0D / Math.sqrt(6.283185307179586D * this.hwE));
    }
  }

  public static double o(double paramDouble1, double paramDouble2)
  {
    synchronized (hwJ)
    {
      return hwJ.m(paramDouble1, paramDouble2);
    }
  }

  public String toString()
  {
    return getClass().getName() + "(" + this.hwD + "," + this.hwF + ")";
  }

  private static void b(cji paramcji)
  {
    synchronized (hwJ)
    {
      hwJ.a(paramcji);
    }
  }
}