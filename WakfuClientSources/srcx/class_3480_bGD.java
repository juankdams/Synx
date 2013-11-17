public class bGD extends btz
{
  private static final double gDd = 30.0D;

  public bGD(short paramShort, cGx paramcGx)
  {
    super(a(paramShort, paramcGx), paramcGx.cBu() / 8.0D);
  }

  public static double a(short paramShort, cGx paramcGx) {
    double d = bCO.f(paramcGx.cig() - paramShort, 0.0D, 30.0D);
    return d * (paramcGx.cBu() - 1) / 30.0D;
  }
}