import java.util.Random;

public final class Yc
{
  public static boolean a(dib paramdib, bci parambci, dKM paramdKM, float paramFloat)
  {
    return a(paramdib, parambci, paramdKM, paramFloat, bCO.bLm());
  }

  public static boolean a(dib paramdib, bci parambci, dKM paramdKM, float paramFloat, Random paramRandom) {
    int i = paramdKM.K(parambci.getId(), parambci.bqt());
    return (i > 0) && (paramRandom.nextDouble() < a(paramdib, parambci, i, paramFloat));
  }

  public static double b(dib paramdib, bci parambci, dKM paramdKM, float paramFloat) {
    int i = paramdKM.K(parambci.getId(), parambci.bqt());
    return a(paramdib, parambci, i, paramFloat);
  }

  private static double a(dib paramdib, bci parambci, int paramInt, float paramFloat) {
    double d1 = hn(paramInt);
    double d2 = a(parambci, paramFloat);
    double d3 = a(paramdib, parambci);
    return bCO.f(d1 * d2 * d3, 0.0D, 1.0D);
  }

  private static double hn(int paramInt) {
    return paramInt / 100.0D;
  }

  private static double a(bci parambci, float paramFloat) {
    if (paramFloat == -1.0F) {
      return 1.0D;
    }
    float f = paramFloat;
    return (f >= parambci.bqv()) && (f <= parambci.bqw()) ? 1.25D : 1.0D;
  }

  private static double a(dib paramdib, bci parambci) {
    return 1.0D + paramdib.a(bcz.bH(parambci.bqt()));
  }
}