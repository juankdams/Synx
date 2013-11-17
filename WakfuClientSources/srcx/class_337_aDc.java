public enum aDc
  implements ccI
{
  private final int aw;
  private final String aLm;

  private aDc(int arg3, String arg4)
  {
    int i;
    this.aw = i;
    Object localObject;
    this.aLm = localObject;
  }

  public static aDc lY(int paramInt)
  {
    aDc[] arrayOfaDc = values();
    for (int i = 0; i < arrayOfaDc.length; i++) {
      aDc localaDc = arrayOfaDc[i];
      if (localaDc.aw == paramInt)
        return localaDc;
    }
    return null;
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
}