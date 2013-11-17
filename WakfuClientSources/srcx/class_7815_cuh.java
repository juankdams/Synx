public enum cuh
{
  private static final dPx iey;
  private final byte hV;

  private cuh(byte arg3)
  {
    byte b;
    this.hV = b;
  }

  public byte bJ() {
    return this.hV;
  }

  public static cuh dX(byte paramByte) {
    return (cuh)iey.bf(paramByte);
  }

  static
  {
    iey = new dPx();

    for (cuh localcuh : values())
      iey.c(localcuh.bJ(), localcuh);
  }
}