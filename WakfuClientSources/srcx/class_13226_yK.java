public enum yK
  implements ccI
{
  private final int aw;
  private final String aLm;

  private yK(int arg3, String arg4)
  {
    int i;
    this.aw = i;
    Object localObject;
    this.aLm = localObject;
  }

  public static yK dH(int paramInt)
  {
    yK[] arrayOfyK = values();
    for (int i = 0; i < arrayOfyK.length; i++) {
      yK localyK = arrayOfyK[i];
      if (localyK.aw == paramInt)
        return localyK;
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