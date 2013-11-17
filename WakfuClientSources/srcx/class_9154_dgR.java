public enum dgR
{
  private byte hV;

  private dgR(byte arg3)
  {
    byte b;
    this.hV = b;
  }

  public byte bJ() {
    return this.hV;
  }

  public static dgR eY(byte paramByte) {
    for (dgR localdgR : values()) {
      if (localdgR.hV == paramByte) {
        return localdgR;
      }
    }

    return lbX;
  }
}