public final class atD extends cih
{
  private final int dFg;
  private final int dFh;
  private final cSi dFi = new cSi();

  public atD(int paramInt1, int paramInt2, aPb paramaPb, int paramInt3, int paramInt4, int paramInt5) {
    super(paramInt1, paramInt2, paramaPb, paramInt3);
    this.dFg = paramInt4;
    this.dFh = paramInt5;
  }

  public int aFP() {
    return this.dFg;
  }

  public int aFQ() {
    return this.dFh;
  }

  public void kl(int paramInt) {
    this.dFi.add(paramInt);
  }

  public cSi sf() {
    return this.dFi;
  }
}