public enum aRk
  implements ccI
{
  private final int aw;
  private final String aLm;

  private aRk(int arg3, String arg4)
  {
    int i;
    this.aw = i;
    Object localObject;
    this.aLm = localObject;
  }

  public int getId() {
    return this.aw;
  }

  public String bK() {
    return String.valueOf(this.aw);
  }

  public String bL() {
    return this.aLm;
  }

  public String bN() {
    return null;
  }

  public static aRk nG(int paramInt) {
    aRk[] arrayOfaRk = values();
    for (int i = 0; i < arrayOfaRk.length; i++) {
      aRk localaRk = arrayOfaRk[i];
      if (localaRk.aw == paramInt)
        return localaRk;
    }
    return null;
  }
}