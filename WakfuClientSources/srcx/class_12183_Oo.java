public enum Oo
{
  private final String aLm;
  private final byte hV;

  private Oo(byte arg3, String arg4)
  {
    Object localObject;
    this.aLm = localObject;
    byte b;
    this.hV = b;
  }

  public String getDescription() {
    return this.aLm;
  }

  public byte bJ() {
    return this.hV;
  }

  public String toString() {
    return this.aLm;
  }

  public static Oo ao(byte paramByte) {
    for (Oo localOo : values()) {
      if (localOo.hV == paramByte) {
        return localOo;
      }
    }

    return null;
  }
}