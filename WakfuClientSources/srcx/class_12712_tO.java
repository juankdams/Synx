public class tO extends bIU
{
  public static double a(double paramDouble, double[] paramArrayOfDouble, int paramInt)
  {
    double d = paramDouble + paramArrayOfDouble[0];
    for (int i = 1; i < paramInt; i++)
      d = d * paramDouble + paramArrayOfDouble[i];
    return d;
  }

  public static double b(double paramDouble, double[] paramArrayOfDouble, int paramInt)
  {
    double d = paramArrayOfDouble[0];
    for (int i = 1; i <= paramInt; i++)
      d = d * paramDouble + paramArrayOfDouble[i];
    return d;
  }
}