public class btk extends ahK
{
  private final double gbM;

  public btk(boolean paramBoolean, long paramLong, double paramDouble1, double paramDouble2)
  {
    this(paramBoolean, paramLong, paramDouble1, paramDouble2, false);
  }

  public btk(boolean paramBoolean1, long paramLong, double paramDouble1, double paramDouble2, boolean paramBoolean2) {
    super(paramBoolean1, paramLong, paramDouble1, paramBoolean2);
    this.gbM = paramDouble2;
  }

  public double cO(long paramLong)
  {
    return this.ddy + (paramLong - this.bYL) * this.gbM;
  }

  public void a(long paramLong, alP[] paramArrayOfalP) {
  }

  public void a(alP[] paramArrayOfalP) {
    long l = ()((1.0D - this.ddy) / this.gbM);
    for (alP localalP : paramArrayOfalP) {
      localalP.setInitialValue(this.ddx ? 1.0F - (float)this.ddy : (float)this.ddy);
      localalP.setTweenDuration(l);
      localalP.setValue(this.ddx ? 0.0F : 1.0F);
    }
  }
}