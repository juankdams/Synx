public enum aOR
{
  private final int bQS;

  private aOR(int arg3)
  {
    int j;
    this.bQS = j;
  }

  public int intValue() {
    return this.bQS;
  }

  public static aOR nt(int paramInt)
  {
    for (aOR localaOR : values()) {
      if (localaOR.bQS == paramInt) {
        return localaOR;
      }
    }
    return null;
  }
}