public enum aMh
  implements ccI
{
  private int aw;

  private aMh(int arg3)
  {
    int j;
    this.aw = j;
  }

  public int getId() {
    return this.aw;
  }

  public String bK() {
    return Integer.toString(this.aw);
  }

  public String bL() {
    return toString();
  }

  public String bN() {
    return null;
  }

  public static aMh bR(byte paramByte) {
    for (aMh localaMh : values())
      if (localaMh.aw == paramByte)
        return localaMh;
    return erd;
  }
}