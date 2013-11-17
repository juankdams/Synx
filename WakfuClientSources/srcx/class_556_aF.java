import org.apache.log4j.Logger;

public enum aF
  implements ccI
{
  private static final Logger K = Logger.getLogger(aF.class);
  private final byte hV;

  public static aF c(byte paramByte)
  {
    for (aF localaF : values()) {
      if (localaF.hV == paramByte) {
        return localaF;
      }
    }
    return null;
  }

  private aF(byte arg3)
  {
    byte b;
    this.hV = b;
  }

  public byte bJ() {
    return this.hV;
  }

  public String bK() {
    return Byte.toString(this.hV);
  }

  public String bL() {
    return toString();
  }

  public String bM() {
    return bU.fH().getString("challenge.type." + ordinal());
  }

  public String getIconURL() {
    try {
      return String.format(ay.bd().getString("challengeCategoryIconsPath"), new Object[] { Byte.valueOf(bJ()) });
    } catch (bdh localbdh) {
      K.error("Exception", localbdh);
    }
    return null;
  }

  public String bN() {
    return null;
  }
}