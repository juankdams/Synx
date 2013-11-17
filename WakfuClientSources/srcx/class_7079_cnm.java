import java.util.EnumSet;
import java.util.Iterator;

public enum cnm
{
  public static final long hTG = d(EnumSet.allOf(cnm.class));
  public static final long hTH = d(EnumSet.noneOf(cnm.class));
  public final byte ewr;

  private cnm(int arg3)
  {
    int j;
    this.ewr = ((byte)j);
  }

  public static long d(Iterable paramIterable) {
    long l = 0L;
    for (Iterator localIterator = paramIterable.iterator(); localIterator.hasNext(); ) {
      int i = 1 << ((cnm)localIterator.next()).ewr;
      l |= i;
    }
    return l;
  }

  public static EnumSet hC(long paramLong) {
    EnumSet localEnumSet = EnumSet.noneOf(cnm.class);
    cnm[] arrayOfcnm = values();
    int i = 0; for (int j = arrayOfcnm.length; i < j; i++) {
      cnm localcnm = arrayOfcnm[i];
      int k = 1 << localcnm.ewr;
      if ((paramLong & k) == k) {
        localEnumSet.add(localcnm);
      }
    }
    return localEnumSet;
  }
}