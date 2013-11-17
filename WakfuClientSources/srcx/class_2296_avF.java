import com.ankamagames.framework.graphics.engine.entity.Entity3D;

public class avF extends pH
{
  public avF()
  {
    super(new GY());
    this.aVW = 1.0F;
    this.aVV = 0.0F;
  }

  public void C(float paramFloat1, float paramFloat2)
  {
    L(true);
    this.aVW = paramFloat1;
    this.aVV = (paramFloat2 * 0.001F);

    ayc localayc = dHL.lSB.dhZ();
    uz localuz = tq.Bg().a(localayc, -1296775008915292148L, byn.bFr().bFt() + "textures/raindrop.tga", false);

    this.aVX.a(0, localuz);
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

    paramcpz.aOR = (f1 + bCO.U(this.aWk.cwT(), this.aWk.cwS()));
    paramcpz.aOS = (f2 + bCO.U(this.aWk.cwV(), this.aWk.cwU()));
    paramcpz.aOT = (f3 + this.aWk.cwX());

    paramcpz.gFJ = 0.33F;
    paramcpz.gFI = 0.0F;

    paramcpz.bOZ = 1.0F;
    paramcpz.bPa = 1.0F;
    paramcpz.bPb = 1.0F;
    paramcpz.bPc = 1.0F;

    paramcpz.eVG = 0.0F;
    paramcpz.eVH = 0.0F;
    paramcpz.hYN = 1.0F;
    paramcpz.hYM = 1.0F;

    float f4 = bCO.U(7.0F, 11.0F);
    paramcpz.buN = (f4 * 2.0F);
    paramcpz.hYO = f4;
  }

  protected void a(cpz paramcpz, float paramFloat)
  {
    paramcpz.M(paramFloat);
  }
}