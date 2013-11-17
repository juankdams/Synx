public enum cQn
{
  private static final dPx kBj;
  private byte gBM;
  private int kBk;

  private cQn(byte arg3, int arg4)
  {
    byte b;
    this.gBM = b;
    int i;
    this.kBk = i;
  }

  public byte xH() {
    return this.gBM;
  }

  public int cHg() {
    return this.kBk;
  }

  public static cQn eA(byte paramByte) {
    return (cQn)kBj.bf(paramByte);
  }

  static
  {
    kBj = new dPx();

    for (cQn localcQn : values())
      kBj.c(localcQn.xH(), localcQn);
  }
}