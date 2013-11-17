public class cuK extends ahK
{
  private static final short ifv = 500;
  private long ifw;
  private boolean cXr;
  private float ifx;
  private float ify;

  public cuK(boolean paramBoolean, long paramLong, double paramDouble)
  {
    super(paramBoolean, paramLong, paramDouble, false);
    this.ifx = (this.ddx ? 1.0F - (float)this.ddy : (float)this.ddy);
    this.ify = bCO.t(this.ddx ? this.ifx * 0.9F : this.ifx * 1.1F, 0.0F, 1.0F);
  }

  public void a(alP[] paramArrayOfalP) {
    for (alP localalP : paramArrayOfalP) {
      localalP.setTweenDuration(0L);
      localalP.setTweenFunction(ddp.kWG);
      localalP.setInitialValue(this.ifx);
    }
    this.ifw = (this.bYL - 500L);
    this.cXr = true;
  }

  public void a(long paramLong, alP[] paramArrayOfalP) {
    if (this.ifw + 500L <= paramLong) {
      this.ifw += 500L;
      for (alP localalP : paramArrayOfalP) {
        localalP.setTweenDuration(Math.max(0L, this.ifw - paramLong + 500L));
        localalP.setValue(this.cXr ? this.ify : this.ifx);
      }
      this.cXr = (!this.cXr);
    }
  }

  public double cO(long paramLong)
  {
    return this.ddy;
  }
}