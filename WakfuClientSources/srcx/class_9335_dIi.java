public enum dIi
{
  public static final dnm lTg = new dnr();
  public final byte ewr;
  private final ccY bUz;

  private dIi(byte arg3, ccY arg4)
  {
    byte b;
    this.ewr = b;
    Object localObject;
    this.bUz = localObject;
  }

  public dnm Ri() {
    return (dnm)this.bUz.gy();
  }

  public static dIi fK(byte paramByte) {
    dIi[] arrayOfdIi = values();
    int i = 0; for (int j = arrayOfdIi.length; i < j; i++) {
      dIi localdIi = arrayOfdIi[i];
      if (localdIi.ewr == paramByte) {
        return localdIi;
      }
    }
    throw new IllegalArgumentException("Impossible de traiter le type " + paramByte);
  }
}