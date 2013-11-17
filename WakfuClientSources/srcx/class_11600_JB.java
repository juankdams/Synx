public enum JB
{
  private final byte hV;

  private JB(int arg3)
  {
    int j;
    this.hV = ((byte)j);
  }

  private byte bJ() {
    return this.hV;
  }

  private static JB ad(byte paramByte) {
    for (JB localJB : values()) {
      if (localJB.hV == paramByte)
        return localJB;
    }
    throw new IllegalArgumentException("Invalid State Id: " + paramByte);
  }
}