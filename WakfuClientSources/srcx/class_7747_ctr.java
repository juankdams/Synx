public enum ctr
  implements aik
{
  private final byte hV;

  private ctr(int arg3)
  {
    int j;
    this.hV = ((byte)j);
  }

  public byte bJ() {
    return this.hV;
  }

  public String hJ(long paramLong) {
    return name().toLowerCase() + paramLong;
  }

  public static ctr dU(byte paramByte)
  {
    ctr[] arrayOfctr = values();
    for (int i = 0; i < arrayOfctr.length; i++) {
      ctr localctr = arrayOfctr[i];
      if (localctr.hV == paramByte)
        return localctr;
    }
    return idj;
  }
}