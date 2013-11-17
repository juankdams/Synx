public enum cQy
{
  public final byte bUy = (byte)ordinal();
  private final ccY bUz;

  private cQy(ccY arg3)
  {
    Object localObject;
    this.bUz = localObject;
  }

  public dMx cHn() {
    return (dMx)this.bUz.gy();
  }

  public static cQy eD(byte paramByte)
  {
    cQy[] arrayOfcQy = values();
    int i = 0; for (int j = arrayOfcQy.length; i < j; i++) {
      cQy localcQy = arrayOfcQy[i];
      if (localcQy.bUy == paramByte)
        return localcQy;
    }
    return null;
  }

  public String toString()
  {
    return "PetChangeType{idx=" + this.bUy + ", factory=" + this.bUz + '}';
  }
}