class bTS extends cpz
{
  public void M(float paramFloat)
  {
    this.gFE += this.hYK;
    this.gFF += this.hYL;
    this.gFG += this.cxw;

    if (this.cAH != 0.0F) {
      float f1 = bCO.bI(this.cAH);
      float f2 = bCO.bH(this.cAH);

      this.aOR += (this.gFE + f1 * 0.125F * this.gFG) * paramFloat;
      this.aOS += (this.gFF - f1 * 0.125F * this.gFG) * paramFloat;
      this.aOT += f2 * this.gFG * paramFloat;
    } else {
      this.aOR += this.gFE * paramFloat;
      this.aOS += this.gFF * paramFloat;
      this.aOT += this.gFG * paramFloat;
    }
    this.gFI += paramFloat;
  }
}