final class cUO extends Yi
{
  private Su dUZ;

  cUO(Rx paramRx, cdz paramcdz, Su paramSu)
  {
    super(paramRx, paramcdz, (byte)1);
    this.dUZ = paramSu;
  }

  protected int Cc() {
    if (this.dUZ.c(cfY.hBW))
      return 0;
    return super.Cc();
  }

  protected int Cd() {
    if (this.dUZ.c(cfY.hBW))
      return 0;
    return super.Cd();
  }
}