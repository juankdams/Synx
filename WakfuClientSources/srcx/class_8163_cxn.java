import com.ankamagames.framework.kernel.core.maths.Matrix44;

public final class cxn extends dFe
{
  private final cEh ikf;
  private final cEh ikg;
  private final aIn ikh;
  private final Matrix44 iki;
  private boolean Vm;

  public cxn()
  {
    this.ikf = new cEh();
    this.ikh = new aIn();
    this.ikg = new cEh();
    this.iki = Matrix44.Lr();
    Ls();
  }

  public void Ls()
  {
    this.ikf.h(1.0F, 1.0F, 1.0F, 1.0F);
    this.ikg.h(0.0F, 0.0F, 0.0F, 1.0F);
    this.ikh.Ls();
    this.gzo.Ls();
    this.iki.Ls();
    this.Vm = false;
  }

  public Matrix44 aGp()
  {
    update();
    return this.gzo;
  }

  public float ahn()
  {
    return this.ikg.aOR;
  }

  public float aho()
  {
    return this.ikg.aOS;
  }

  public float aGq()
  {
    return this.ikf.aOR;
  }

  public float aGr()
  {
    return this.ikf.aOS;
  }

  public void d(cEh paramcEh) {
    this.ikg.a(paramcEh);
    this.Vm = true;
  }

  public void b(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.ikg.m(paramFloat1, paramFloat2, paramFloat3);
    this.Vm = true;
  }

  public void e(cEh paramcEh) {
    this.ikg.k(paramcEh);
    this.Vm = true;
  }

  public void w(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.ikg.o(paramFloat1, paramFloat2, paramFloat3, 0.0F);
    this.Vm = true;
  }

  public cEh cuI() {
    return new cEh(this.ikg);
  }

  public cEh cuJ() {
    return this.ikg;
  }

  public void f(aIn paramaIn) {
    this.ikh.a(paramaIn);
    this.Vm = true;
  }

  public void g(aIn paramaIn) {
    this.ikh.d(paramaIn);
    this.Vm = true;
  }

  public aIn cuK() {
    return new aIn(this.ikh);
  }

  public aIn cuL() {
    return this.ikh;
  }

  public void f(cEh paramcEh) {
    this.ikf.a(paramcEh);
    this.Vm = true;
  }

  public void c(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.ikf.m(paramFloat1, paramFloat2, paramFloat3);
    this.Vm = true;
  }

  public void g(cEh paramcEh) {
    this.ikf.k(paramcEh);
    this.Vm = true;
  }

  public cEh cuM() {
    return new cEh(this.ikf);
  }

  public cEh cuN() {
    return this.ikf;
  }

  public Matrix44 cuO() {
    return this.iki;
  }

  public void bMH() {
    this.Vm = true;
  }

  private void update()
  {
    if (!this.Vm) {
      return;
    }

    this.gzo.a(this.ikh);

    if (!this.iki.isIdentity()) {
      this.gzo.c(this.iki);
    }

    this.gzo.d(this.ikg);

    this.gzo.f(this.ikf);

    this.Vm = false;
  }

  public void a(cxn paramcxn) {
    this.ikh.a(paramcxn.ikh);
    this.ikf.a(paramcxn.ikf);
    this.ikg.a(paramcxn.ikg);
    this.gzo.a(paramcxn.gzo);
    this.iki.a(paramcxn.iki);
    this.Vm = paramcxn.Vm;
  }
}