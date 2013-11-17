public class abV extends dqt
{
  private final long iI;
  private final cYk cQE;
  private final CG cQF;

  public abV(long paramLong, cYk paramcYk, CG paramCG)
  {
    super(cXz(), dPD.mie.bJ(), 0);
    this.iI = paramLong;
    this.cQE = paramcYk;
    this.cQF = paramCG;
  }

  protected long mC()
  {
    aog();
    return 0L;
  }

  protected void kO()
  {
  }

  private void aog() {
    Su localSu = CA.Lv().bj(this.iI);
    if (localSu == null) {
      return;
    }
    asf.aED().a(localSu, this.cQE, this.cQF);
  }
}