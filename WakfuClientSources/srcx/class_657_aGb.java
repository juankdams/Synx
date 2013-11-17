public abstract class aGb
{
  private static aGb ede;
  private final btQ edf = new btQ();
  private static final int edg = 1000;
  private final long[] edh = bPR.eWh;

  public static aGb aSn() {
    return ede;
  }

  public static void a(aGb paramaGb) {
    ede = paramaGb;
  }

  public boolean i(long paramLong1, long paramLong2) {
    dS(paramLong1);

    long l1 = beq.fq(paramLong2);
    if (!aUP.c(this.edh, l1)) {
      return true;
    }
    long l2 = this.edf.gd(paramLong2);
    return 1000L <= Math.abs(paramLong1 - l2);
  }

  private void dS(long paramLong) {
    if (this.edf.size() > 10)
      for (int i = this.edf.size() - 1; i >= 0; i--) {
        long l = this.edf.qU(i);
        if (1000L <= Math.abs(paramLong - l))
          this.edf.qT(i);
      }
  }

  public void v(long paramLong1, long paramLong2)
  {
    this.edf.B(paramLong2, paramLong1);
  }

  public void a(bjC parambjC, long paramLong) {
    b(parambjC, paramLong);
  }

  protected abstract void b(bjC parambjC, long paramLong);
}