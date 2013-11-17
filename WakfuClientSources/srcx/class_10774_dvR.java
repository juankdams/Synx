public class dvR
{
  public float bOZ = 1.0F;
  public float bPa = 1.0F;
  public float bPb = 1.0F;
  public float bPc = 1.0F;
  private float gDS = 0.0F;
  private float gDT = 0.0F;
  private float gDU = 0.0F;
  private float gDV = 0.0F;
  private float goD = 0.0F;
  private float goE = 0.0F;
  private float goF = 0.0F;
  private float gDR = 0.0F;
  private float lBh;
  private float lBi;

  void b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    this.goD = paramFloat1;
    this.goE = paramFloat2;
    this.goF = paramFloat3;
    this.gDR = paramFloat4;
    this.gDS = this.bOZ;
    this.gDT = this.bPa;
    this.gDU = this.bPb;
    this.gDV = this.bPc;
    this.lBi = (this.lBh = paramFloat5);
  }

  public boolean dT(int paramInt)
  {
    if (this.lBh < 0.0F) {
      if (this.lBh == (1.0F / -1.0F))
        return false;
      this.bOZ = (this.gDS = this.goD);
      this.bPa = (this.gDT = this.goE);
      this.bPb = (this.gDU = this.goF);
      this.bPc = (this.gDV = this.gDR);
      this.lBh = (1.0F / -1.0F);
      if ((this.bOZ == 1.0F) && (this.bPa == 1.0F) && (this.bPb == 1.0F) && (this.bPc == 1.0F))
        return true;
      return false;
    }
    this.lBh -= paramInt;

    float f = 1.0F - this.lBh / this.lBi;
    this.bOZ = (this.gDS + (this.goD - this.gDS) * f);
    this.bPa = (this.gDT + (this.goE - this.gDT) * f);
    this.bPb = (this.gDU + (this.goF - this.gDU) * f);
    this.bPc = (this.gDV + (this.gDR - this.gDV) * f);
    return false;
  }
}