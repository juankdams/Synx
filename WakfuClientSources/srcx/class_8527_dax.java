public enum dax
{
  private final cig kSo;

  private dax(cig arg3)
  {
    Object localObject;
    this.kSo = localObject;
  }

  public cig cMJ() {
    return this.kSo;
  }

  public static dax zx(int paramInt) {
    for (dax localdax : values()) {
      if (localdax.cMJ().getId() == paramInt) {
        return localdax;
      }
    }

    return null;
  }
}