public class bdC extends Yi
{
  private final Su dUZ;
  private final Rx fpr;
  private final boolean fps;

  public bdC(Rx paramRx1, cdz paramcdz, Su paramSu, Rx paramRx2, boolean paramBoolean)
  {
    super(paramRx1, paramcdz);
    this.dUZ = paramSu;
    this.fpr = paramRx2;
    this.fps = paramBoolean;
  }

  public bdC(Rx paramRx1, cdz paramcdz, byte paramByte, Su paramSu, Rx paramRx2, boolean paramBoolean) {
    super(paramRx1, paramcdz, paramByte);
    this.dUZ = paramSu;
    this.fpr = paramRx2;
    this.fps = paramBoolean;
  }

  protected Object Co() {
    return eC(false);
  }

  protected Object Cn() {
    return eC(true);
  }

  private String eC(boolean paramBoolean)
  {
    int k;
    int i;
    int j;
    if (!this.dUZ.c(cfY.hBZ)) {
      k = this.fps ? this.dUZ.e(eu.azc) : this.dUZ.e(eu.azj);
      i = this.beP.value() + k;
      j = this.beP.max() + k;
    } else {
      k = !this.fps ? this.dUZ.e(eu.azc) : this.dUZ.e(eu.azj);
      i = this.fpr.value() + k;
      j = this.fpr.max() + k;
    }
    return bPe.f(i, j, paramBoolean);
  }
}