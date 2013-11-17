class axM
{
  float dMX;
  float dMY;
  float dMZ;
  float dNa;
  float dNb;
  float dNc;
  boolean dNd;
  boolean dNe;
  float bOZ;
  float bPa;
  float bPb;
  float bPc;
  byte dNf;

  axM()
  {
    this.dNd = true;
    this.dNe = true;

    this.dMX = 1.0F;
    this.dMY = 0.0F;
    this.dMZ = 0.0F;
    this.dNa = 1.0F;
    this.dNb = 0.0F;
    this.dNc = 0.0F;
    this.bOZ = 1.0F;
    this.bPa = 1.0F;
    this.bPb = 1.0F;
    this.bPc = 1.0F;
    this.dNf = 0;
  }

  public final void aJn()
  {
    this.dNd = true;
    this.dMX = 1.0F;
    this.dMY = 0.0F;
    this.dMZ = 0.0F;
    this.dNa = 1.0F;
  }

  public final void g(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this.dNd = ((paramFloat1 == 1.0F) && (paramFloat2 == 0.0F) && (paramFloat3 == 0.0F) && (paramFloat4 == 1.0F));
    this.dMX = paramFloat1;
    this.dMY = paramFloat2;
    this.dMZ = paramFloat3;
    this.dNa = paramFloat4;
  }

  public final void D(float paramFloat1, float paramFloat2) {
    this.dNe = ((paramFloat1 == 0.0F) && (paramFloat2 == 0.0F));
    this.dNb = paramFloat1;
    this.dNc = paramFloat2;
  }
}