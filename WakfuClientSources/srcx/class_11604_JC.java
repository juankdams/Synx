public enum JC
{
  public final byte bUy = (byte)ordinal();
  private final ccY bUz;

  private JC(ccY arg3)
  {
    Object localObject;
    this.bUz = localObject;
  }

  public jI TT() {
    return (jI)this.bUz.gy();
  }

  public static JC af(byte paramByte)
  {
    JC[] arrayOfJC = values();
    int i = 0; for (int j = arrayOfJC.length; i < j; i++) {
      JC localJC = arrayOfJC[i];
      if (localJC.bUy == paramByte)
        return localJC;
    }
    return null;
  }

  public String toString()
  {
    return "PetChangeType{idx=" + this.bUy + ", factory=" + this.bUz + '}';
  }
}