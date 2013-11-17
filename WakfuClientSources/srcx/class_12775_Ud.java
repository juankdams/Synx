import com.ankamagames.framework.graphics.engine.entity.Entity3D;

public class Ud extends pH
{
  private float cxr;
  private float cxs;
  private float cxt;
  private float cxu;
  private float cxv;
  private float cxw;
  private float cxx = 1.0F; private float cxy = 1.0F; private float cxz = 1.0F; private float cxA = 0.6F;
  private float cxB = 0.0F;

  public Ud()
  {
    super(new dVK());
    this.aVW = 10.0F;
    this.aVV = 0.3F;
    this.cxr = 15.0F;
    this.cxs = 1.0F;
    this.cxu = 0.5F;
    this.cxv = 0.5F;
    this.cxw = -3.0F;
  }

  public void e(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    L(true);
    this.aVW = paramFloat1;
    this.aVV = (paramFloat2 * 0.001F);
    this.cxr = (paramFloat3 * 0.001F);
    this.cxs = paramFloat4;
    dF("textures/snow.tga");
  }

  public void dF(String paramString) {
    paramString = "textures/snow.tga";
    ayc localayc = dHL.lSB.dhZ();
    uz localuz = tq.Bg().a(localayc, -1296775008915292151L, byn.bFr().bFt() + paramString, false);
    this.aVX.a(0, localuz);
  }

  public final void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5) {
    this.cxx = paramFloat1;
    this.cxy = paramFloat2;
    this.cxz = paramFloat3;
    this.cxA = paramFloat4;
    this.cxB = paramFloat5;
  }

  public void W(float paramFloat) {
    this.cxw = paramFloat;
  }

  public void X(float paramFloat) {
    this.cxt = paramFloat;
  }

  public void p(float paramFloat1, float paramFloat2) {
    this.cxu = paramFloat1;
    this.cxv = paramFloat2;
  }

  protected boolean wW()
  {
    return false;
  }

  protected boolean wX()
  {
    return true;
  }

  protected void a(cpz paramcpz)
  {
    float f1 = this.cHC.xV();
    float f2 = this.cHC.xW();
    float f3 = this.cHC.getAltitude();

    paramcpz.aOR = (this.aWk.cwT() + bCO.bLk() * this.aWk.cwY() + f1);
    paramcpz.aOS = (this.aWk.cwV() + bCO.bLk() * this.aWk.cwZ() + f2);
    paramcpz.aOT = (this.aWk.cwW() - bCO.bLk() * ((this.aWk.cwW() + this.aWk.cwX()) * 0.5F) + f3);

    paramcpz.gFE = 0.0F;
    paramcpz.gFF = 0.0F;
    paramcpz.gFG = 0.0F;
    paramcpz.gFJ = this.cxr;
    paramcpz.gFI = 0.0F;
    paramcpz.bOZ = this.cxx;
    paramcpz.bPa = this.cxy;
    paramcpz.bPb = this.cxz;
    paramcpz.bPc = (this.cxA + bCO.bLh() * this.cxB);
    paramcpz.buN = (this.cxs + this.cxs * bCO.bLk() * 1.5F);
    paramcpz.hYO = paramcpz.buN;
    paramcpz.eVG = 0.0F;
    paramcpz.eVH = 0.0F;
    paramcpz.hYN = 1.0F;
    paramcpz.hYM = 1.0F;

    aov localaov = (aov)paramcpz;
    localaov.cxu = (this.cxu + bCO.bLk() * this.cxv);
    localaov.dtD = false;
    localaov.cxt = this.cxt;
    localaov.dtE = this.cxw;
  }

  protected final void a(cpz paramcpz, float paramFloat)
  {
    aov localaov = (aov)paramcpz;

    if (paramcpz.aOT <= this.cHC.getAltitude() + 0.1F) {
      localaov.dtD = true;
    }
    localaov.cxt += this.cxt;

    paramcpz.M(paramFloat);
  }
}