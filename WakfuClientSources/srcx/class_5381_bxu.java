public abstract class bxu
{
  private static int ghP = 1;

  protected int aw = 0;
  protected final bWV ghQ = new bWV(bWV.hlj);
  protected final bWV ghR = new bWV(bWV.hlk);
  protected float duj;
  protected final float[] ghS = { 0.0F, 1.0F, 0.0F };
  protected cEi gfU;
  protected boolean duk;
  protected float ghT = 1.0F;
  protected boolean bur;
  protected boolean ghU;
  protected int bmM;
  protected int ghV;
  private Rk ghW;

  protected bxu()
  {
    this(new cEi(0.0F, 0.0F, 0.0F));
  }

  protected bxu(cEi paramcEi) {
    this(paramcEi, 3.0F);
  }

  protected bxu(cEi paramcEi, float paramFloat) {
    this.aw = (ghP++);
    this.bur = true;
    this.ghV = 0;
    this.gfU = paramcEi;
    this.duj = paramFloat;
  }

  public int getId() {
    return this.aw;
  }

  public void o(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.ghS[0] = paramFloat1;
    this.ghS[1] = paramFloat2;
    this.ghS[2] = paramFloat3;
  }

  public float bEK()
  {
    return this.ghT;
  }

  public void bx(float paramFloat) {
    this.ghT = paramFloat;
  }

  public boolean aBe() {
    return this.duk;
  }

  public void fw(boolean paramBoolean) {
    this.duk = paramBoolean;
  }

  public void update(int paramInt) {
    if (this.ghQ.ib()) {
      this.ghQ.update(paramInt);
    }
    if (this.ghR.ib()) {
      this.ghR.update(paramInt);
    }
    this.bmM += paramInt;
    if ((this.ghV > 0) && 
      (this.bmM > this.ghV)) {
      this.bmM = (this.ghV = 0);
      this.ghU = true;
      if (this.ghW != null)
        this.ghW.acM();
    }
  }

  public float bEL()
  {
    return this.ghQ.QC();
  }

  public float bEM() {
    return this.ghQ.QD();
  }

  public float bEN() {
    return this.ghQ.QE();
  }

  public float bEO() {
    return this.ghR.QC();
  }

  public float bEP() {
    return this.ghR.QD();
  }

  public float bEQ() {
    return this.ghR.QE();
  }

  public void p(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.ghQ.m(paramFloat1, paramFloat2, paramFloat3);
  }

  public void q(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.ghR.m(paramFloat1, paramFloat2, paramFloat3);
  }

  public void r(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.ghR.m(paramFloat1, paramFloat2, paramFloat3);
  }

  public void a(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt) {
    this.ghQ.c(paramFloat1, paramFloat2, paramFloat3, paramInt);
  }

  public void b(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt) {
    this.ghR.c(paramFloat1, paramFloat2, paramFloat3, paramInt);
  }

  public cEi bDo() {
    return this.gfU;
  }

  public void e(cEi paramcEi) {
    this.gfU.k(paramcEi);
  }

  public float aBd() {
    return this.duj;
  }

  public void aG(float paramFloat) {
    if ((!bB) && (paramFloat < 0.0F)) throw new AssertionError();
    this.duj = paramFloat;
  }

  public bWV bER() {
    return this.ghQ;
  }

  public bWV bES() {
    return this.ghR;
  }

  public boolean isEnabled() {
    return this.bur;
  }

  public void setEnabled(boolean paramBoolean) {
    this.bur = paramBoolean;
  }

  public void shutdown(int paramInt) {
    if (this.bur) {
      this.bmM = 0;
      this.ghV = paramInt;
      a(0.0F, 0.0F, 0.0F, paramInt);
      b(0.0F, 0.0F, 0.0F, paramInt);
    } else {
      this.ghU = true;
    }
  }

  public boolean isShutdown() {
    return this.ghU;
  }

  public Rk bET() {
    return this.ghW;
  }

  public void a(Rk paramRk) {
    this.ghW = paramRk;
  }
}