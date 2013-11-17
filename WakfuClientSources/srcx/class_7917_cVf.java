public enum cVf
{
  private static final dPx kBj;
  private byte hV;

  private cVf(byte arg3)
  {
    byte b;
    this.hV = b;
  }

  public byte bJ() {
    return this.hV;
  }

  public static cVf eG(byte paramByte) {
    return (cVf)kBj.bf(paramByte);
  }

  static
  {
    kBj = new dPx();

    for (cVf localcVf : values())
      kBj.c(localcVf.bJ(), localcVf);
  }
}