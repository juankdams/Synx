public abstract class dDv
  implements adQ
{
  protected static final float cAe = 43.0F;
  protected static final float cAf = 21.5F;
  protected static final float lLE = 10.0F;
  private static int iDl = 1;

  private final int aw = dfo();
  private boolean dpT;
  protected rp cHC;
  private coZ lLF;

  static int dfo()
  {
    if (iDl == 2147483647)
      iDl = 0;
    return iDl++;
  }

  public dDv()
  {
    reset();
  }

  public final int getId()
  {
    return this.aw;
  }

  public float xP() {
    return this.lLF.xP();
  }

  public void L(boolean paramBoolean) {
    this.dpT = paramBoolean;
  }

  public boolean apR() {
    return this.dpT;
  }

  public void a(rp paramrp) {
    this.cHC = paramrp;
  }

  public abstract void clear();

  public void reset() {
    this.lLF = new coZ(1.0F);
  }

  public void update(int paramInt) {
    if (!this.lLF.dT(paramInt))
      L(false);
  }

  public abstract void a(bSr parambSr);

  public void e(coZ paramcoZ) {
    this.lLF = paramcoZ;
    L(true);
  }

  public void stop(int paramInt) {
    this.lLF = new adC(paramInt, xP());
  }
}