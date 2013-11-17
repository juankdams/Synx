import com.ankamagames.framework.graphics.engine.entity.Entity3D;

public class cZv extends pH
{
  private float cxr;
  private float kMX;
  private float kMY;
  private float kMZ;
  private float kNa;
  private float kNb;
  private String SB;
  private float cxx = 1.0F; private float cxy = 1.0F; private float cxz = 1.0F; private float cxA = 0.1F;
  private float cxB = 0.0F;

  public cZv()
  {
    super(new fI());
    this.aVW = 128.0F;
    this.aVV = 100.0F;
    this.cxr = 300.0F;
    this.cxA = 0.25F;
    this.kMX = 40.0F;
    this.kMY = 60.0F;
    this.kMZ = 0.0F;
    this.kNa = -1.570796F;
    this.kNb = 0.3141593F;
    this.SB = "textures/rain.tga";
  }

  public void b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    L(true);
    this.aVW = paramFloat1;
    this.aVV = (paramFloat2 * 0.001F);
    this.cxr = (paramFloat3 * 0.001F);

    this.kMX = paramFloat4;
    this.kMY = paramFloat5;
    this.kMZ = paramFloat6;
    cMi();
  }

  private void cMi() {
    ayc localayc = dHL.lSB.dhZ();
    uz localuz = tq.Bg().a(localayc, -1296775008915292150L, byn.bFr().bFt() + this.SB, false);
    this.aVX.a(0, localuz);
  }

  public final void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5) {
    this.cxx = paramFloat1;
    this.cxy = paramFloat2;
    this.cxz = paramFloat3;
    this.cxA = paramFloat4;
    this.cxB = paramFloat5;
  }

  public void cZ(float paramFloat) {
    this.kMZ = paramFloat;
  }

  public final void an(float paramFloat1, float paramFloat2) {
    this.kNa = paramFloat1;
    this.kNb = paramFloat2;
  }

  protected boolean wW()
  {
    return true;
  }

  protected boolean wX()
  {
    return true;
  }

  protected void a(cpz paramcpz)
  {
    float f1 = bCO.bLk();
    float f2 = 1.0F;
    float f3 = 10.0F;
    float f4 = 1.0F + bCO.bH(f1 * f1 * 0.7853982F) * 9.0F;
    float f5 = bCO.U(1.0F, f4);
    float f6 = (f5 - 1.0F) / 9.0F;

    float f7 = this.cHC.xV();
    float f8 = this.cHC.xW();
    float f9 = this.cHC.getAltitude();
    paramcpz.aOR = (this.aWk.cwT() + bCO.bLk() * this.aWk.cwY() + f7);
    paramcpz.aOS = (this.aWk.cwV() + bCO.bLk() * this.aWk.cwZ() + f8);
    paramcpz.aOT = (this.aWk.cwW() + f9);

    paramcpz.gFE = 0.0F;
    paramcpz.gFF = 0.0F;
    paramcpz.gFG = (0.1F * this.kMY * (1.0F + f6));

    paramcpz.hYK = 0.0F;
    paramcpz.hYL = 0.0F;
    paramcpz.cxw = this.kMZ;

    paramcpz.hYO = (this.kMX * (2.0F + 2.0F * f6));
    paramcpz.buN = (f6 * 0.5F + 0.9F);

    paramcpz.gFJ = (this.cxr / (1.0F + f6));
    paramcpz.gFI = 0.0F;
    paramcpz.bOZ = this.cxx;
    paramcpz.bPa = this.cxy;
    paramcpz.bPb = this.cxz;
    paramcpz.bPc = (this.cxA + f6 * this.cxB);
    paramcpz.eVG = 0.0F;
    paramcpz.eVH = 0.0F;
    paramcpz.hYN = 1.0F;
    paramcpz.hYM = 1.0F;
    paramcpz.cAH = (this.kNa + bCO.U(-1.0F, 1.0F) * this.kNb);
    this.aVX.a(new GN(this));
  }

  protected final void a(cpz paramcpz, float paramFloat)
  {
    paramcpz.M(paramFloat);
  }
}