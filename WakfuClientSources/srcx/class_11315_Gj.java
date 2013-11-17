public enum Gj
{
  private final byte hV;

  private Gj(byte arg3)
  {
    byte b;
    this.hV = b;
  }

  public byte bJ() {
    return this.hV;
  }

  public static Gj U(byte paramByte) {
    for (Gj localGj : values()) {
      if (localGj.hV == paramByte)
        return localGj;
    }
    return bOx;
  }
}