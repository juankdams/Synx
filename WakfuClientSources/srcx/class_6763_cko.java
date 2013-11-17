public enum cko
  implements ccI
{
  private final int aw;
  private final String aLm;

  private cko(int arg3, String arg4)
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
    return null;
  }

  public static cko vC(int paramInt) {
    cko[] arrayOfcko = values();
    for (int i = 0; i < arrayOfcko.length; i++) {
      cko localcko = arrayOfcko[i];
      if (localcko.aw == paramInt)
        return localcko;
    }
    return null;
  }
}