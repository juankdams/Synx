public final class Wk extends bLe
{
  private long cGi;
  private long cGj;

  public Wk(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void cb(long paramLong) {
    this.cGi = paramLong;
  }

  public void cc(long paramLong) {
    this.cGj = paramLong;
  }

  protected void kN() {
    Su localSu1 = CA.Lv().bj(this.cGi);
    Su localSu2 = CA.Lv().bj(this.cGj);

    localSu1.c(new La(localSu1.ML(), localSu2.ML()).d(localSu1.E()));

    localSu1.aeL().eq("AnimHit");
    localSu2.aeL().eq("AnimHit");
  }

  protected void kO()
  {
  }
}