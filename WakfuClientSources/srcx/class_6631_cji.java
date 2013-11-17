public abstract class cji extends acA
  implements awP, drO
{
  public double a(double paramDouble)
  {
    return ckZ();
  }

  public int ao(int paramInt)
  {
    return nextInt();
  }

  public static cji ckY()
  {
    return new cwS((int)System.currentTimeMillis());
  }

  public double nextDouble()
  {
    double d;
    do
      d = (nextLong() - -9.223372036854776E+018D) * 5.421010862427522E-020D;
    while ((d <= 0.0D) || (d >= 1.0D));
    return d;
  }

  public float nextFloat()
  {
    float f;
    do
      f = (float)ckZ();
    while (f >= 1.0F);
    return f;
  }

  public abstract int nextInt();

  public long nextLong()
  {
    return (nextInt() & 0xFFFFFFFF) << 32 | nextInt() & 0xFFFFFFFF;
  }

  public double ckZ()
  {
    int i;
    do
      i = nextInt();
    while (i == 0);
    return (i & 0xFFFFFFFF) * 2.328306436538696E-010D;
  }
}