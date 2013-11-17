import org.apache.log4j.Logger;

public enum lX
  implements ccI
{
  private static final Logger K = Logger.getLogger(lX.class);

  public boolean a(lX paramlX) {
    return ordinal() <= paramlX.ordinal();
  }

  public static lX u(byte paramByte) {
    for (lX locallX : values()) {
      if (locallX.ordinal() == paramByte)
        return locallX;
    }
    K.error("Rang inconnu " + paramByte);
    return aPY;
  }

  public String bK() {
    return String.valueOf(ordinal());
  }

  public String bL() {
    return name();
  }

  public String bN() {
    return name();
  }
}