final class aBj extends Yi
{
  private Su dUZ;
  private int crh = 0;
  private int dVa = 0;

  aBj(Rx paramRx, cdz paramcdz, Su paramSu) {
    super(paramRx, paramcdz);
    this.dUZ = paramSu;
    this.crh = paramRx.value();
    this.dVa = paramRx.value();
  }

  protected int Cc() {
    return super.Cc();
  }

  protected int Cd() {
    return this.dVa;
  }

  public void a(cqm paramcqm) {
    if (paramcqm.adb() != Ce())
      return;
    if (paramcqm.value() > this.crh)
      this.dVa += paramcqm.value() - this.crh;
    else if (paramcqm.value() <= 0) {
      this.dVa = 0;
    }
    this.crh = paramcqm.value();
    super.a(paramcqm);
  }
}