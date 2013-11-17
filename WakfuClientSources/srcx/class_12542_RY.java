public class RY
{
  int crA = 2048;
  float crB = 64.0F;
  float crC = 100.0F;
  float crD = 2000.0F;
  float crE = 40.0F;
  float crF = 18.0F;
  float crG = 1.5F;
  float crH = 0.1F;
  float crI = -1.570796F;
  float crJ = 0.07853982F;

  protected final void a(cZv paramcZv) {
    paramcZv.initialize(this.crA);
    paramcZv.a(1.0F, 1.0F, 1.0F, this.crH, 0.1F);
    paramcZv.an(this.crI, this.crJ);
    paramcZv.b(this.crB, this.crC, this.crD, this.crE, this.crF, this.crG);
  }

  protected final void a(avF paramavF) {
    paramavF.initialize(this.crA);
    paramavF.C(this.crB, this.crC);
  }
}