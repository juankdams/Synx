public class aRq
{
  private final int aCU;
  private final int aCT;
  private final int aCS;
  private final int aCR;
  private final boolean eOr;

  public aRq(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    this.aCU = paramInt1;
    this.aCT = paramInt2;
    this.aCS = paramInt3;
    this.aCR = paramInt4;
    this.eOr = paramBoolean;
  }

  public lX a(G paramG) {
    int i = paramG.ac() + paramG.ad();

    if ((i >= this.aCU) && ((this.eOr) || (paramG.ad() >= i * 0.36F)))
      return lX.aPU;
    if ((i >= this.aCT) && ((this.eOr) || (paramG.ad() >= i * 0.24F)))
      return lX.aPV;
    if ((i >= this.aCS) && ((this.eOr) || (paramG.ad() >= i * 0.12F)))
      return lX.aPW;
    if (i >= this.aCR) {
      return lX.aPX;
    }
    return lX.aPY;
  }
}