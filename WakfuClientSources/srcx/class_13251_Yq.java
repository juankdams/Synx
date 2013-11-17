class Yq extends cho
{
  private static final aee aOr = new bOO(new UO());
  protected long cJd;

  public long ck(long paramLong)
  {
    this.hFE = (paramLong + this.cJd);
    return this.hFE;
  }

  protected aee Bq() {
    return aOr;
  }

  public void aJ() {
    super.aJ();
    this.cJd = -1L;
  }

  public void bc() {
    super.bc();
    this.cJd = -1L;
  }

  static Yq cl(long paramLong) {
    Yq localYq;
    try {
      localYq = (Yq)aOr.Mm();
      localYq.gkh = true;
    }
    catch (Exception localException) {
      localYq = new Yq();
      localYq.gkh = false;
    }
    localYq.cJd = paramLong;
    return localYq;
  }
}