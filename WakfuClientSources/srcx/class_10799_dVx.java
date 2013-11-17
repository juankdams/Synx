public enum dVx
{
  private final byte hV;

  private dVx(int arg3)
  {
    int j;
    this.hV = ((byte)j);
  }

  public byte bJ() {
    return this.hV;
  }

  public static dVx fZ(byte paramByte) {
    for (dVx localdVx : values()) {
      if (paramByte == localdVx.hV)
        return localdVx;
    }
    throw new IllegalArgumentException("Invalid " + dVx.class.getName() + " id");
  }
}