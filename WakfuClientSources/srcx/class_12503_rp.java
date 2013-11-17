import org.apache.log4j.Logger;

public class rp extends cuA
  implements dNN
{
  private static final Logger K = Logger.getLogger("camera");
  private final float aZn;
  private final float aZo;
  private boolean aZp;
  private final cyd aZq = new cyd();
  private final dub aZr = new dub();
  private float aZs;
  private float aZt;
  private float aZu;
  private bSl aZv = new bCF();

  private final cHA aZw = new cHA(null);
  private Tr aZx = new dur();
  private final bRS aZy = new bRS(new aOd(this));

  private final cEi aZz = new cEi();

  public rp(adG paramadG, float paramFloat1, float paramFloat2)
  {
    super(paramadG);
    this.aZn = paramFloat1;
    this.aZo = paramFloat2;
    this.aZq.setSpeed(2.1F);
    this.aZr.setSpeed(2.1F);
    this.aZq.cs(0.01F);
    this.aZr.cs(0.01F);
    this.aZq.set(adG.cUf);
  }

  public rp(adG paramadG) {
    this(paramadG, 1.0F, 3.0F);
  }

  public void cz(int paramInt)
  {
    reset();
    cA(paramInt);

    float f1 = this.aZv.getWorldX();
    float f2 = this.aZv.getWorldY();
    float f3 = this.aZv.getAltitude();

    this.aZw.m(f1, f2, f3);
    cYm localcYm = this.aZx.a(this.dkk, this);
    this.aZr.at(localcYm.aOR, localcYm.aOS);

    boolean bool = this.aZr.q(paramInt, 1.0F / getZoomFactor());
    yb();

    if (bool)
      csS();
    else if (!cHA.a(this.aZw)) {
      ya();
    }

    if (csR())
      csQ();
  }

  protected final void cA(int paramInt)
  {
    float f = this.aZq.getValue();
    if (f != this.aZq.xd(paramInt))
      csS();
  }

  public void a(aZs paramaZs)
  {
    this.aZr.b(paramaZs);
  }

  public final void xS() {
    cYm localcYm = up.a(this.dkk, this.aZv);
    this.aZr.ae(localcYm.aOR, localcYm.aOS);
    yb();
    csS();
    cHA.a(this.aZw, false);
  }

  public final void xT() {
    xS();
    csQ();
  }

  public float xU() {
    return this.aZq.cvi();
  }

  public void B(float paramFloat)
  {
    this.aZq.cu(bCO.t(paramFloat, this.aZn, this.aZo));
  }

  public void C(float paramFloat)
  {
    this.aZq.set(paramFloat);
    csQ();
  }

  public float getZoomFactor()
  {
    return this.aZq.getValue();
  }

  public float xV()
  {
    return this.dkk.h(this.aZr.daa(), this.aZr.dab(), this.aZv.getAltitude());
  }

  public float xW()
  {
    return this.dkk.i(this.aZr.daa(), this.aZr.dab(), this.aZv.getAltitude());
  }

  public float xX() {
    return this.aZn;
  }

  public float xY() {
    return this.aZo;
  }

  public bSl xZ()
  {
    return this.aZv;
  }

  public void a(bSl parambSl) {
    this.aZv = parambSl;
    cHA.a(this.aZw, false);
    K.info("changement de target de la camera " + parambSl, new Exception());
  }

  public void a(Tr paramTr) {
    this.aZx = paramTr;
  }

  public float[] a(aVn paramaVn) {
    return dxv.lDD;
  }

  public final void a(aEN paramaEN) {
    this.aZy.aP(paramaEN);
  }

  public final void b(aEN paramaEN) {
    this.aZy.aQ(paramaEN);
  }

  private void ya() {
    cHA.a(this.aZw, true);
    this.aZy.notifyListeners();
  }

  public final void D(float paramFloat) {
    if (!this.aZp)
      B(xU() - paramFloat);
  }

  public final void R(boolean paramBoolean)
  {
    this.aZp = paramBoolean;
  }

  public void E(float paramFloat) {
    this.aZq.setSpeed(2.1F * paramFloat);
  }

  public void F(float paramFloat) {
    this.aZr.setSpeed(2.1F * paramFloat);
  }

  public void g(float paramFloat1, float paramFloat2) {
    h(this.aZs + paramFloat1, this.aZt + paramFloat2);
  }

  public void reset() {
    h(0.0F, 0.0F);
    this.aZu = 0.0F;
  }

  private void h(float paramFloat1, float paramFloat2) {
    if ((this.aZs != paramFloat1) || (this.aZt != paramFloat2)) {
      this.aZs = paramFloat1;
      this.aZt = paramFloat2;
      csS();
    }
  }

  private void yb()
  {
    float f1 = this.aZv.getWorldX();
    float f2 = this.aZv.getWorldY();
    float f3 = this.aZv.getAltitude();
    this.aZz.m(f1 - f2, -(f1 + f2), f3 / 4.8F);
  }

  public cEi yc() {
    return this.aZz;
  }

  public float yd() {
    return csO();
  }

  public int ye() {
    return 0;
  }

  public float yf()
  {
    return this.aZr.daa() + this.aZs;
  }

  public float yg()
  {
    return this.aZr.dab() + this.aZt;
  }

  public float yh()
  {
    return this.aZu;
  }

  public float getWorldX() {
    return this.aZv.getWorldX();
  }

  public float getWorldY() {
    return this.aZv.getWorldY();
  }

  public float getAltitude() {
    return this.aZv.getAltitude();
  }

  public int fa() {
    return bCO.bC(getWorldX());
  }

  public int fb() {
    return bCO.bC(getWorldY());
  }

  public short fc() {
    return (short)bCO.bC(getAltitude());
  }

  public void G(float paramFloat) {
    this.aZu = paramFloat;
  }
}