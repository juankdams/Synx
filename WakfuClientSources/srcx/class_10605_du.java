public abstract class du extends acA
  implements awP, drO
{
  protected cji TN;

  public double a(double paramDouble)
  {
    return nextDouble();
  }

  public int ao(int paramInt)
  {
    return nextInt();
  }

  public Object clone()
  {
    du localdu = (du)super.clone();
    if (this.TN != null)
      localdu.TN = ((cji)this.TN.clone());
    return localdu;
  }

  protected cji ho()
  {
    return this.TN;
  }

  public static cji hp()
  {
    return cji.ckY();
  }

  public abstract double nextDouble();

  public int nextInt()
  {
    return (int)Math.round(nextDouble());
  }

  protected void a(cji paramcji)
  {
    this.TN = paramcji;
  }
}