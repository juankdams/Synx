public final class SK extends bBO
{
  private final int cuh;
  private int cui;

  public SK(azp paramazp, eu parameu, float paramFloat, int paramInt1, int paramInt2)
  {
    super(paramazp, parameu, paramFloat, paramInt1);
    this.cuh = paramInt2;
  }

  public void b(Xh paramXh, int paramInt)
  {
    Rx localRx = (Rx)this.cza.a(this.czc);
    if (localRx == null)
      return;
    int i;
    switch (fX.aDr[paramXh.ordinal()]) {
    case 1:
      i = (int)Math.floor(this.aN * paramInt);
      i = Math.min(i, this.cuh - this.cui);
      if (i <= 0) {
        return;
      }
      switch (this.gwc) {
      case 0:
        this.cui += localRx.gv(i);

        break;
      case 1:
        localRx.setMax(localRx.acV() + i);
      }

      break;
    case 2:
      i = (int)Math.floor(this.aN * paramInt);
      i = Math.min(i, this.cui);
      if (i <= 0) {
        return;
      }
      switch (this.gwc) {
      case 0:
        this.cui -= localRx.gw(i);

        break;
      case 1:
        localRx.setMax(localRx.acV() - i);
      }
      break;
    }
  }
}