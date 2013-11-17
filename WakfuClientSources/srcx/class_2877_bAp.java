public enum bAp
{
  public final byte ewr;
  public final long gpg;
  public final kb gph;
  public final double gpi;

  private bAp(int arg3, long paramDouble, double arg6)
  {
    this.ewr = ((byte)???);
    this.gpg = paramDouble;
    this.gph = new kb(paramDouble / 1000L);
    Object localObject;
    this.gpi = localObject;
  }

  public static bAp dh(byte paramByte)
  {
    bAp[] arrayOfbAp = values();
    int i = 0; for (int j = arrayOfbAp.length; i < j; i++) {
      bAp localbAp = arrayOfbAp[i];
      if (localbAp.ewr == paramByte)
        return localbAp;
    }
    return null;
  }
}