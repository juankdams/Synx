final class dRs
  implements dnL
{
  private final dEv mmD;
  private final bcz hQS;
  private int ifA = 0;

  dRs(dEv paramdEv, bcz parambcz) {
    this.mmD = paramdEv;
    this.hQS = parambcz;
  }

  public dEv dsm() {
    return this.mmD;
  }

  public bcz cYc() {
    return this.hQS;
  }

  public int ctb() {
    return this.ifA;
  }

  public void wT(int paramInt) {
    if (paramInt > 100)
      this.ifA = 100;
    if (paramInt < 0)
      this.ifA = 0;
    this.ifA = paramInt;
  }
}