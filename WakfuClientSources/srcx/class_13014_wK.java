public enum wK
  implements ccI
{
  private final int bot;
  private final String aLm;

  private wK(int arg3, String arg4)
  {
    int i;
    this.bot = i;
    Object localObject;
    this.aLm = localObject;
  }

  public static wK dq(int paramInt) {
    for (wK localwK : values()) {
      if (localwK.bot == paramInt) {
        return localwK;
      }
    }
    return null;
  }

  public int getId() {
    return this.bot;
  }

  public String bK() {
    return String.valueOf(this.bot);
  }

  public String bL() {
    return this.aLm;
  }

  public String bN() {
    return null;
  }

  public String toString() {
    return bL();
  }
}