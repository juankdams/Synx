public enum atG
{
  private final int bQS;

  private atG(int arg3)
  {
    int j;
    this.bQS = j;
  }

  public int intValue() {
    return this.bQS;
  }

  public static atG km(int paramInt) {
    for (atG localatG : values()) {
      if (localatG.bQS == paramInt) {
        return localatG;
      }
    }
    throw new IllegalArgumentException("No such value " + paramInt);
  }
}