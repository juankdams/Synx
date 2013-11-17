public class dM
{
  public static final dM Uk = new dM();

  private final cSR Ul = new cSR();

  public void a(KJ paramKJ)
  {
    this.Ul.put(paramKJ.mP(), paramKJ);
  }

  public KJ ap(int paramInt) {
    return (KJ)this.Ul.get(paramInt);
  }
}