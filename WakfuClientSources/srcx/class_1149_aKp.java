public enum aKp
{
  private final int aw;

  public static aKp mO(int paramInt)
  {
    for (aKp localaKp : values()) {
      if (localaKp.aw == paramInt) {
        return localaKp;
      }
    }
    return null;
  }

  private aKp(int arg3)
  {
    int j;
    this.aw = j;
  }

  public int getId() {
    return this.aw;
  }
}