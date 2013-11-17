import org.apache.log4j.Logger;

public enum cwv
{
  private final int iig;
  private final String dcJ;
  private final byte beQ;
  private static final Logger K = Logger.getLogger(cwv.class);

  private cwv(int paramByte, String arg4, byte arg5) {
    this.iig = paramByte;
    Object localObject;
    this.dcJ = localObject;
    byte b;
    this.beQ = b;
  }

  public static cwv dN(int paramInt1, int paramInt2) {
    int i = paramInt2 - paramInt1;
    Object localObject = null;
    for (cwv localcwv : values()) {
      if (localcwv.iig <= i)
        localObject = localcwv;
      else if (localcwv.iig > i)
        {
          break;
        }
    }
    return localObject;
  }

  public static cwv dO(int paramInt1, int paramInt2) {
    if (paramInt1 <= paramInt2 / 2)
      return iia;
    if (paramInt1 <= paramInt2 * 3 / 4)
      return iib;
    if (paramInt1 <= paramInt2) {
      return iic;
    }
    return null;
  }

  public String ctS() {
    return this.dcJ;
  }

  public String wW(int paramInt) {
    switch (dAa.lGJ[ordinal()]) {
    case 1:
      try {
        return ay.bd().getString("groupDifficultyChallengeIconPath");
      } catch (bdh localbdh1) {
        K.warn(localbdh1.getMessage());
      }
    default:
      try
      {
        return String.format(ay.bd().getString("groupDifficultyIconsPath"), new Object[] { Integer.valueOf(paramInt), Byte.valueOf(this.beQ) });
      } catch (bdh localbdh2) {
        K.warn(localbdh2.getMessage());

        return null;
      }
    }
    return null;
  }
}