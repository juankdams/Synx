public class bGh
{
  public static final bGh gCn = new bGh();

  private final cSR gCo = new cSR();
  private final dFu gCp = new dFu();

  public void b(PD paramPD) {
    this.gCo.put(paramPD.getId(), paramPD);

    paramPD.f(new aDP(this, paramPD));
  }

  public PD sK(int paramInt)
  {
    return (PD)this.gCo.get(paramInt);
  }

  public void M(dGy paramdGy) {
    this.gCo.s(paramdGy);
  }

  public PD sL(int paramInt) {
    return sK(this.gCp.get(paramInt));
  }
}