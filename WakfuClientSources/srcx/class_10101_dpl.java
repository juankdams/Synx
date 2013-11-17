public enum dpl
  implements Vc
{
  private final int aw;
  private final String aLm;

  private dpl(int arg3, String arg4)
  {
    int i;
    this.aw = i;
    Object localObject;
    this.aLm = localObject;
  }

  public String bK() {
    return String.valueOf(this.aw);
  }

  public String bL() {
    return this.aLm;
  }

  public String bN() {
    return this.aLm;
  }

  public int getId() {
    return this.aw;
  }

  public static dpl AY(int paramInt) {
    for (int i = 0; i < values().length; i++) {
      dpl localdpl = values()[i];
      if (localdpl.aw == paramInt)
        return localdpl;
    }
    throw new UnsupportedOperationException("Impossible de trouver le type d'élément Dynamique " + paramInt);
  }
}