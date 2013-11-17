public class dMu
{
  private static cOB cih = null;
  static final long mcy = 100L;
  static final long mcz = 1000L;

  private static long[] dpm()
  {
    cOB localcOB = PF.abu();

    long[] arrayOfLong = new long['É'];

    arrayOfLong[0] = 0L;
    arrayOfLong[1] = 100L;
    for (int i = 1; i < localcOB.nV(); i++) {
      arrayOfLong[(i + 1)] = (arrayOfLong[i] + 1000L * i);
    }
    return arrayOfLong;
  }

  public static cOB abu()
  {
    if (cih == null) {
      cih = drH.a(drH.p(dpm()).zy(0).zz(200));
    }
    return cih;
  }
}