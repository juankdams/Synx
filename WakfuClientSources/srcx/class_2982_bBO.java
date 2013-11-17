public class bBO
  implements bmw
{
  public static final int gwa = 0;
  public static final int gwb = 1;
  protected final azp cza;
  protected final float aN;
  protected final eu czc;
  protected final int gwc;

  public bBO(azp paramazp, eu parameu, float paramFloat, int paramInt)
  {
    this.cza = paramazp;
    this.aN = paramFloat;
    this.czc = parameu;
    this.gwc = paramInt;
  }

  public void b(Xh paramXh, int paramInt)
  {
    Rx localRx = (Rx)this.cza.a(this.czc);
    int i;
    switch (dIw.aDr[paramXh.ordinal()]) {
    case 1:
      i = (int)Math.floor(this.aN * paramInt);
      if (localRx != null) {
        switch (this.gwc) {
        case 0:
          localRx.gv(i);

          break;
        case 1:
          localRx.setMax(localRx.acV() + i);
        }

      }

      break;
    case 2:
      if (localRx != null) {
        i = (int)Math.floor(this.aN * paramInt);
        switch (this.gwc) {
        case 0:
          localRx.gw(i);

          break;
        case 1:
          localRx.setMax(localRx.acV() - i);
        }
      }
      break;
    }
  }
}