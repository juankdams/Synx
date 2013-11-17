public class cOw
  implements IL
{
  private final Su dUZ;
  private static final cbQ kxa = new cbQ(new long[] { 120L, 320L, 920L });

  private static final cbQ kxb = new cbQ(new long[] { 100L, 300L, 400L, 410L, 502L });

  private static final cbQ kxc = new cbQ(new long[] { 130L, 330L, 502L, 930L });

  public cOw(Su paramSu)
  {
    this.dUZ = paramSu;
  }

  public boolean Si() {
    int i = byv.bFN().bFO().bGw();
    return (i != 0) && (i == this.dUZ.aeR());
  }

  public boolean bD(long paramLong) {
    int i = byv.bFN().bFO().bGw();
    long l = beq.fq(paramLong);

    if (i != -1)
    {
      return (i == this.dUZ.aeR()) && (!kxa.N(l));
    }

    if (this.dUZ.aeR() != -1) {
      return kxb.N(l);
    }

    return kxc.N(l);
  }

  static
  {
    kxc.o(kxa.cfv());
  }
}