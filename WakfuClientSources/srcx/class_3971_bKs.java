class bKs
{
  private agk gNm;
  private final bWV gNn = new bWV(bWV.hlj);

  public void start() {
    this.gNn.c(0.9F, 0.87F, 0.8F, 1000);
    this.gNm = new py(this);

    btL.gcv.a(this.gNm);
  }

  public void stop(int paramInt) {
    this.gNn.c(1.0F, 1.0F, 1.0F, paramInt);
    dka.cSF().a(new px(this), paramInt);
  }
}