import org.apache.log4j.Logger;

public abstract class cuA
{
  private static final Logger K = Logger.getLogger(cuA.class);
  protected final adG dkk;
  private final dQx iff = new dQx();
  private boolean ifg = true;

  private float ifh = 1.0F;
  private int ifi;
  private int kQ;
  private bRS ifj;

  protected cuA(adG paramadG)
  {
    this.dkk = paramadG;
    csS();
  }

  public final float csO() {
    return this.ifh * getZoomFactor();
  }

  public final float csP() {
    return this.ifh;
  }

  public final int getScreenWidth() {
    return this.ifi;
  }

  public final int getScreenHeight() {
    return this.kQ;
  }

  public final boolean B(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (paramInt4 >= this.iff.hqu) && (paramInt2 <= this.iff.hqv) && (paramInt1 >= this.iff.hqw) && (paramInt3 <= this.iff.hqx);
  }

  public final void dL(int paramInt1, int paramInt2)
  {
    this.ifi = paramInt1;
    this.kQ = paramInt2;
    float f1 = paramInt1 / 1024.0F;
    float f2 = paramInt2 / 768.0F;

    this.ifh = Math.max(1.0F, Math.min(f1, f2));
    csS();
  }

  protected final void csQ() {
    a(yf(), yg(), this.iff);
    this.ifg = false;
    csT();
  }

  public final void a(float paramFloat1, float paramFloat2, dQx paramdQx) {
    float f1 = Math.abs(1.0F / (2.0F * csO()));
    float f2 = getScreenWidth() * f1;
    float f3 = getScreenHeight() * f1;

    paramdQx.hqu = bCO.bD(paramFloat1 - f2);
    paramdQx.hqv = bCO.aB(paramFloat1 + f2);
    paramdQx.hqw = bCO.bD(paramFloat2 - f3);
    paramdQx.hqx = bCO.aB(paramFloat2 + f3);
  }

  public final boolean csR() {
    return this.ifg;
  }

  protected final void csS() {
    this.ifg = true;
  }

  public final void b(dSn paramdSn) {
    if (this.ifj == null) {
      this.ifj = new bRS(new gF(this));
    }

    this.ifj.aP(paramdSn);
  }

  public final void c(dSn paramdSn) {
    this.ifj.aQ(paramdSn);
  }

  private void csT() {
    if (this.ifj != null)
      this.ifj.notifyListeners();
  }

  public final dQx csU()
  {
    return this.iff;
  }

  public final int getScreenX() {
    return bCO.bC(yf());
  }

  public final int getScreenY() {
    return bCO.bC(yg());
  }

  public abstract float xV();

  public abstract float xW();

  public abstract float yf();

  public abstract float yg();

  public abstract float yh();

  public abstract float getZoomFactor();

  public abstract void cz(int paramInt);

  public bSl csV() {
    return new gC(this);
  }
}