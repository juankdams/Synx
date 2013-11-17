public enum bzo
{
  private final int aw;

  private bzo(int arg3)
  {
    int j;
    this.aw = j;
  }

  public int getId()
  {
    return this.aw;
  }

  public static bzo rN(int paramInt) {
    for (bzo localbzo : values()) {
      if (localbzo.aw == paramInt) {
        return localbzo;
      }
    }
    return null;
  }
}