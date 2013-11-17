public final class UL
  implements bmw
{
  private final azp cza;
  private final eu czb;
  private final eu czc;
  private final float aN;
  private int czd = 0;

  public UL(azp paramazp, eu parameu1, eu parameu2, float paramFloat) {
    this.cza = paramazp;
    this.czb = parameu1;
    this.czc = parameu2;
    this.aN = paramFloat;
  }

  public void b(Xh paramXh, int paramInt)
  {
    if (paramInt == 0) {
      return;
    }
    Rx localRx1 = (Rx)this.cza.a(this.czb);
    Rx localRx2 = (Rx)this.cza.a(this.czc);
    localRx2.gw(this.czd);
    int i = localRx1.value();
    int j = (int)Math.floor(this.aN * i);
    this.czd = localRx2.gv(j);
  }
}