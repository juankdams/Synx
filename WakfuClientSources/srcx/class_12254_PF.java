import java.io.PrintStream;

public class PF
{
  static final short cif = 1;
  static final long[] cig = new long['È'];

  private static cOB cih = null;

  private static double gj(int paramInt)
  {
    if (paramInt < 1) {
      paramInt = 1;
    }
    return paramInt * 100 + 1.5D * Math.pow(paramInt, 2.2D);
  }

  private static double gk(int paramInt) {
    if (paramInt == 1) {
      return 1.0D;
    }
    if (paramInt < 100) {
      return paramInt + 2 + 0.0005D * Math.pow(paramInt, 2.7D);
    }

    double d = 300.0D;
    int i = paramInt - 100;
    while (i > 0) {
      d += i * 10;
      i -= 10;
    }

    if (paramInt >= 110) {
      d *= 2.5D;
    }

    return d;
  }

  public static cOB abu()
  {
    if (cih == null) {
      cih = drH.a(drH.p(cig).zy(1).zz(200));
    }
    return cih;
  }

  public static void main(String[] paramArrayOfString)
  {
    cOB localcOB = abu();

    for (int i = 100; i < 150; i++) {
      System.err.println(gk(i));
    }

    System.err.println("Niveau;Xp depuis niveau precedent;Xp totale");

    for (i = 1; i <= 200; i = (short)(i + 1))
      System.err.println(i + ";" + localcOB.aq((short)(i - 1)) + ";" + localcOB.hR(i));
  }

  static
  {
    cig[0] = 0L;
    double d1 = 0.0D;
    for (int i = 1; i < cig.length; i++) {
      double d2 = gj(i);
      double d3 = Math.max(1.0D, gk(i));
      double d4 = d2 * d3;
      d1 += d4;
      cig[i] = (()bCO.b(d1, -1));
    }
  }
}