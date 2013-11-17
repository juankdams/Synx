public enum brV
  implements ccI
{
  private final int aw;

  private brV(int arg3)
  {
    int j;
    this.aw = j;
  }

  public static brV qG(int paramInt)
  {
    for (brV localbrV : values()) {
      if (localbrV.aw == paramInt) {
        return localbrV;
      }
    }

    return fNZ;
  }

  public int getId() {
    return this.aw;
  }

  public String bK() {
    return String.valueOf(this.aw);
  }

  public String bL() {
    return toString();
  }

  public String bN() {
    return null;
  }
}