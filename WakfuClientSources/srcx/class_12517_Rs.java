import java.util.HashMap;

public enum Rs
{
  private static final dPx cqQ;
  private static final HashMap cqR;
  private final byte hV;
  private final String cqS;

  private Rs(byte arg3, String arg4)
  {
    byte b;
    this.hV = b;
    Object localObject;
    this.cqS = localObject;
  }

  public byte bJ() {
    return this.hV;
  }

  public String acS() {
    return this.cqS;
  }

  public static Rs ar(byte paramByte) {
    return (Rs)cqQ.bf(paramByte);
  }

  public static Rs dv(String paramString) {
    return (Rs)cqR.get(paramString);
  }

  static
  {
    cqQ = new dPx();
    cqR = new HashMap();

    for (Rs localRs : values()) {
      cqQ.c(localRs.bJ(), localRs);
      cqR.put(localRs.acS(), localRs);
    }
  }
}