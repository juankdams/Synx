public enum adY
{
  public final byte bUy = (byte)ordinal();
  private final ccY bUz;

  private adY(ccY arg3)
  {
    Object localObject;
    this.bUz = localObject;
  }

  public ddz apU() {
    return (ddz)this.bUz.gy();
  }

  public static adY aM(byte paramByte)
  {
    adY[] arrayOfadY = values();
    int i = 0; for (int j = arrayOfadY.length; i < j; i++) {
      adY localadY = arrayOfadY[i];
      if (localadY.bUy == paramByte)
        return localadY;
    }
    return null;
  }

  public String toString()
  {
    return "TemporaryInventoryChangeType{idx=" + this.bUy + ", factory=" + this.bUz + '}';
  }
}