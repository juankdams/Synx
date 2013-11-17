import org.apache.log4j.Logger;

public abstract class cFA
{
  protected static final Logger K = Logger.getLogger(cFA.class);

  private static final aoL iAb = new aoL();

  protected long a(dhJ paramdhJ, dKm paramdKm) {
    if (paramdhJ != null) {
      long l1 = paramdhJ.getId();
      aIX localaIX = (aIX)iAb.get(l1);
      if (localaIX == null) {
        localaIX = new aIX(3);
        iAb.put(l1, localaIX);
      }
      long l2 = localaIX.c(paramdKm.bJ(), System.currentTimeMillis());
      iAb.put(l1, localaIX);

      paramdhJ.a(paramdKm);
      return l2;
    }

    return 0L;
  }

  public byte[] is(long paramLong)
  {
    aIX localaIX = (aIX)iAb.get(paramLong);
    if (localaIX != null) {
      return localaIX.yv();
    }
    return null;
  }

  public static boolean a(long paramLong, dKm paramdKm) {
    aIX localaIX = (aIX)iAb.get(paramLong);
    return (localaIX != null) && (localaIX.D(paramdKm.bJ()));
  }

  public static long b(long paramLong, dKm paramdKm) {
    aIX localaIX = (aIX)iAb.get(paramLong);
    long l = 0L;
    if (localaIX != null) {
      l = localaIX.bO(paramdKm.bJ());
    }
    return l;
  }

  public void it(long paramLong) {
    aIX localaIX = (aIX)iAb.get(paramLong);
    if (localaIX != null)
      localaIX.clear();
  }

  public long b(dhJ paramdhJ, dKm paramdKm) {
    if (paramdhJ != null) {
      aIX localaIX = (aIX)iAb.get(paramdhJ.getId());
      long l = 0L;
      if (localaIX != null) {
        l = localaIX.bP(paramdKm.bJ());
      }

      paramdhJ.b(paramdKm);
      return l;
    }

    return 0L;
  }

  public aIX iu(long paramLong)
  {
    return (aIX)iAb.remove(paramLong);
  }

  public void removeAll() {
    iAb.clear();
  }
}