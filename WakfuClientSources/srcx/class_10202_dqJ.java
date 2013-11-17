public class dqJ
{
  public static final dqJ ltl = new dqJ();
  private final cSR Ul;

  public dqJ()
  {
    this.Ul = new cSR();
  }

  public void a(int paramInt, lU paramlU) {
    this.Ul.put(paramInt, paramlU);
  }

  public lU Bg(int paramInt) {
    lU locallU = (lU)this.Ul.get(paramInt);
    if (locallU == null) {
      locallU = new lU();
      a(paramInt, locallU);
    }

    return locallU;
  }
}