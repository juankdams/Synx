import java.io.PrintStream;
import org.apache.log4j.Logger;

public class dyc
{
  public static final Logger K = Logger.getLogger(dyc.class);

  private static final double[] lEM = dcH();

  private static double[] dcH() {
    cOB localcOB1 = PF.abu();
    cOB localcOB2 = dMu.abu();

    double[] arrayOfDouble = new double['É'];

    for (short s = 1; s < 200; s = (short)(s + 1))
    {
      double d1 = localcOB2.aq(s);
      double d2 = 6.0D * d1;
      long l = localcOB1.aq(s);
      arrayOfDouble[s] = (d2 / l);
    }

    arrayOfDouble[0] = 0.0D;
    arrayOfDouble['È'] = 0.0D;
    return arrayOfDouble;
  }

  public static long a(dhJ paramdhJ, long paramLong, bTI parambTI)
  {
    double d = ks(paramLong);
    long l = Math.round(d / 3.0D);
    return h(0L, a(paramdhJ, parambTI), l);
  }

  public static long a(dhJ paramdhJ, bTI parambTI)
  {
    if ((paramdhJ == null) || (parambTI == null)) {
      return 0L;
    }
    dCi localdCi = paramdhJ.auK();
    if (localdCi == null) {
      return 0L;
    }
    long l = 0L;
    for (bfE localbfE : localdCi)
      if (localbfE.Cz() == parambTI)
      {
        l += localbfE.ayX();
      }
    return l;
  }

  public static long ew(short paramShort)
  {
    long l = PF.abu().hR(paramShort);
    return i(paramShort, l);
  }

  public static long ks(long paramLong)
  {
    short s = PF.abu().cF(paramLong);
    return i(s, paramLong);
  }

  public static double ex(short paramShort)
  {
    if (paramShort <= 0) {
      return 0.0D;
    }
    if (paramShort >= 200) {
      return 0.0D;
    }
    return lEM[paramShort];
  }

  private static long i(short paramShort, long paramLong)
  {
    cOB localcOB1 = PF.abu();
    cOB localcOB2 = dMu.abu();

    double d1 = 6.0D * localcOB2.hR(paramShort);
    long l = localcOB1.cH(paramLong);
    double d2 = l * lEM[paramShort];

    return Math.round(d2 + d1);
  }

  public static long h(long paramLong1, long paramLong2, long paramLong3)
  {
    if (paramLong2 == 0L) {
      return 0L;
    }

    if (paramLong2 > 0L) {
      if (paramLong1 > paramLong3) {
        return paramLong2 * 2L;
      }

      if (paramLong1 + paramLong2 <= paramLong3) {
        return paramLong2;
      }

      l1 = Math.max(paramLong3 - paramLong1, 0L);
      l2 = Math.max(0L, paramLong2 - l1) * 2L;
      return l1 + l2;
    }
    if (paramLong1 <= paramLong3) {
      return paramLong2;
    }

    long l1 = (paramLong1 - paramLong3) / 2L;

    if (l1 >= Math.abs(paramLong2)) {
      return paramLong2 * 2L;
    }

    long l2 = paramLong1 - paramLong3;
    long l3 = Math.abs(paramLong2) - l1;
    return -(l3 + l2);
  }

  public static double i(long paramLong1, long paramLong2, long paramLong3)
  {
    if (paramLong2 == 0L) {
      return 0.0D;
    }

    if (paramLong2 > 0L) {
      if (paramLong1 > paramLong3) {
        return paramLong2 / 2.0D;
      }

      if (paramLong1 + paramLong2 <= paramLong3) {
        return paramLong2;
      }

      d1 = Math.max(paramLong3 - paramLong1, 0L);
      d2 = Math.max(0.0D, paramLong2 - d1) / 2.0D;
      return d1 + d2;
    }
    if (paramLong1 <= paramLong3) {
      return paramLong2;
    }

    if (paramLong1 + paramLong2 > paramLong3) {
      return paramLong2 / 2.0D;
    }

    double d1 = Math.min(0L, paramLong1 - paramLong3 + paramLong2);
    double d2 = (paramLong3 - paramLong1) / 2.0D;
    return d1 + d2;
  }

  public static long bc(dhJ paramdhJ)
  {
    if (!(paramdhJ instanceof aVF)) {
      K.error("Trying to lock spell for a characterInfo without xp : " + paramdhJ);
      return 0L;
    }

    long l1 = ((aVF)paramdhJ).blf();
    long l2 = 0L;
    for (bTI localbTI : bTI.values())
      if (localbTI.bZV())
      {
        long l4 = a(paramdhJ, l1, localbTI);
        l2 += l4;
      }
    long l3 = ks(l1);
    return l3 - l2;
  }

  public static Mb bd(dhJ paramdhJ)
  {
    if (!(paramdhJ instanceof avm)) {
      K.error("Trying to lock spell for a characterInfo which is not a SpellXpLocker : " + paramdhJ);
      return Mb.bZe;
    }

    if (paramdhJ.adF()) {
      return Mb.bZf;
    }

    int i = paramdhJ.nU();
    if (i < 140) {
      return Mb.bZe;
    }

    long l = bc(paramdhJ);
    if (l > 1L) {
      return Mb.bZd;
    }

    return Mb.bZc;
  }

  public static Mb e(dhJ paramdhJ, int paramInt)
  {
    Mb localMb = bd(paramdhJ);
    if (localMb != Mb.bZc) {
      return localMb;
    }

    dCi localdCi = paramdhJ.auK();
    if (localdCi == null) {
      return Mb.bZg;
    }
    bfE localbfE = (bfE)localdCi.hh(paramInt);
    if (localbfE == null) {
      return Mb.bZg;
    }
    if (!localbfE.Cz().bZV()) {
      return Mb.bZi;
    }

    if (localbfE.ayX() == 0L) {
      return Mb.bZh;
    }

    return Mb.bZc;
  }

  public static boolean a(dHW paramdHW) {
    return !paramdHW.adF();
  }

  public static void main(String[] paramArrayOfString) {
    cOB localcOB = PF.abu();

    long l1 = localcOB.hR(4);
    long l2 = localcOB.aq((short)4);

    long l3 = l1 + 740L;
    long l4 = ks(l1);
    long l5 = ks(localcOB.hR(5));
    long l6 = ks(l3);
    System.out.println("coucou");
  }
}