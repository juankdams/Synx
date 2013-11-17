public enum cXa
  implements ccI
{
  private final byte hV;
  private final String aLm;
  private final boolean kJW;

  private cXa(byte paramBoolean, String arg4, boolean arg5)
  {
    this.hV = paramBoolean;
    Object localObject;
    this.aLm = localObject;
    boolean bool;
    this.kJW = bool;
  }

  public String bK()
  {
    return String.valueOf(this.hV);
  }

  public String bL() {
    return this.aLm;
  }

  public String bN() {
    return null;
  }

  public static cXa eK(byte paramByte) {
    for (cXa localcXa : values()) {
      if (localcXa.hV == paramByte) {
        return localcXa;
      }
    }

    return null;
  }

  public String cKT() {
    return bU.fH().getString("challenge.userType." + ordinal());
  }

  public byte bJ() {
    return this.hV;
  }

  public boolean cKU() {
    return this.kJW;
  }
}