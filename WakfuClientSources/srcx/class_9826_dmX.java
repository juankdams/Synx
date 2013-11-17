public enum dmX
  implements aqm, ccI
{
  private final byte hV;
  private final String aKM;
  private final qM aZl;
  private final boolean lmj;

  private dmX(int paramString, qM paramBoolean, String arg5, boolean arg6)
  {
    this.hV = ((byte)paramString);
    Object localObject;
    this.aKM = localObject;
    this.aZl = paramBoolean;
    boolean bool;
    this.lmj = bool;
  }

  public String bK() {
    return String.valueOf(this.hV);
  }

  public String bL() {
    return this.aKM;
  }

  public boolean cUr() {
    return this.lmj;
  }

  public static dmX AQ(int paramInt) {
    for (dmX localdmX : values()) {
      if (localdmX.hV == paramInt) {
        return localdmX;
      }
    }
    return null;
  }

  public qM aF() {
    return this.aZl;
  }

  public String bN() {
    return null;
  }

  public byte bJ() {
    return this.hV;
  }
}