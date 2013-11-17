public class djb
{
  private static final djb lfh = new djb();

  private final cSR lfi = new cSR();

  public static djb cRJ()
  {
    return lfh;
  }

  public void a(dKM paramdKM)
  {
    this.lfi.put(paramdKM.getId(), paramdKM);
  }

  public dKM Ak(int paramInt) {
    return (dKM)this.lfi.get(paramInt);
  }
}