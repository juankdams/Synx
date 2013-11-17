public final class azo
  implements bmw
{
  private final air dQC;
  private final float dQD;

  public azo(air paramair, float paramFloat)
  {
    this.dQC = paramair;
    this.dQD = paramFloat;
  }

  public void b(Xh paramXh, int paramInt) {
    Rx localRx1 = this.dQC.d(eu.ayM);
    Rx localRx2 = this.dQC.d(eu.aAj);
    Rx localRx3 = this.dQC.d(eu.azE);

    if ((localRx1 == null) || (localRx3 == null) || (localRx2 == null)) {
      return;
    }
    int i = localRx1.max() + localRx2.max();

    int j = (int)(i * this.dQD);
    int k = i - (localRx1.value() + localRx2.value());

    float f = Math.min(k / j * 100.0F, 100.0F);

    localRx3.set((int)Math.ceil(f));
  }
}