import java.util.EnumSet;
import java.util.Iterator;

public enum dLC
{
  private static final dPx gws;
  private final byte hV;
  private long mbO;
  private final Yp mbP;

  private dLC(int arg3, Yp arg4)
  {
    int i;
    this.hV = ((byte)i);
    this.mbO = (1 << this.hV);
    Object localObject;
    this.mbP = localObject;
  }

  public byte bJ() {
    return this.hV;
  }

  public long doW() {
    return this.mbO;
  }

  public Yp doX() {
    return this.mbP;
  }

  public static long c(EnumSet paramEnumSet) {
    long l = 0L;
    for (Iterator localIterator = paramEnumSet.iterator(); localIterator.hasNext(); ) {
      l |= ((dLC)localIterator.next()).mbO;
    }
    return l;
  }

  public static EnumSet kI(long paramLong) {
    EnumSet localEnumSet = EnumSet.noneOf(dLC.class);
    dLC[] arrayOfdLC = values();
    for (int i = 0; i < arrayOfdLC.length; i++) {
      dLC localdLC = arrayOfdLC[i];
      if ((paramLong & localdLC.mbO) == localdLC.mbO)
        localEnumSet.add(localdLC);
    }
    return localEnumSet;
  }

  public static dLC fQ(byte paramByte) {
    return (dLC)gws.bf(paramByte);
  }

  static
  {
    gws = new dPx();

    dLC[] arrayOfdLC = values();
    for (int i = 0; i < arrayOfdLC.length; i++) {
      dLC localdLC = arrayOfdLC[i];
      gws.c(localdLC.hV, localdLC);
    }
  }
}