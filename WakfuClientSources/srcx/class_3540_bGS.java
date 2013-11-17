public enum bGS
  implements ccI
{
  private final int aw;
  private final String aLm;

  private bGS(int arg3, String arg4)
  {
    int i;
    this.aw = i;
    Object localObject;
    this.aLm = localObject;
  }

  public static bGS sT(int paramInt)
  {
    bGS[] arrayOfbGS = values();
    int i = 0; for (int j = arrayOfbGS.length; i < j; i++) {
      bGS localbGS = arrayOfbGS[i];
      if (localbGS.aw == paramInt)
        return localbGS;
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
    return this.aLm;
  }
}