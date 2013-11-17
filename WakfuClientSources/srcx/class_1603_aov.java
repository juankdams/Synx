class aov extends cpz
{
  protected float cxu;
  protected boolean dtD;
  protected float cxt;
  protected float dtE;

  public void M(float paramFloat)
  {
    if (!this.dtD) {
      this.hYK = (this.cxt / this.cxu);
      this.cxw = this.dtE;

      this.gFE += this.hYK * paramFloat;
      this.gFF += this.hYL * paramFloat;
      this.gFG += this.cxw * paramFloat;

      this.aOR += this.gFE * paramFloat;
      this.aOS += this.gFF * paramFloat;
      this.aOT += this.gFG * paramFloat;

      if (this.bPc < 0.3F) {
        this.bPc += 0.005F;
      }

      this.hYK = 0.0F;
      this.hYL = 0.0F;
      this.cxw = 0.0F;
    }
    else
    {
      this.buN *= 1.0025F;
      this.hYO = this.buN;
      this.bPc *= 0.99F;
      if (this.bPc < 0.01F) {
        this.gFI = this.gFJ;
      }
    }

    this.gFI += paramFloat;
  }
}