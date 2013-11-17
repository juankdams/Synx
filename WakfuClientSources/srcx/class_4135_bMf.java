public class bMf extends dMA
{
  short cxi;
  short cxj;

  public bMf()
  {
    this.cxi = 0;
    this.cxj = 0;
  }

  public void d(aYQ paramaYQ)
  {
    this.cxi = ((short)(int)(paramaYQ.readFloat() * 16.0F));
    this.cxj = ((short)(int)(paramaYQ.readFloat() * 16.0F));
  }

  public final float ahn()
  {
    return this.cxi / 16.0F;
  }

  public final float aho()
  {
    return this.cxj / 16.0F;
  }

  public void a(axM paramaxM1, axM paramaxM2)
  {
    paramaxM2.dNd = paramaxM1.dNd;
    paramaxM2.dMX = paramaxM1.dMX;
    paramaxM2.dMZ = paramaxM1.dMZ;
    paramaxM2.dMY = paramaxM1.dMY;
    paramaxM2.dNa = paramaxM1.dNa;

    paramaxM2.dNe = false;
    float f1 = this.cxi / 16.0F;
    float f2 = this.cxj / 16.0F;
    if (paramaxM1.dNd) {
      paramaxM2.dNb = (f1 + paramaxM1.dNb);
      paramaxM2.dNc = (f2 + paramaxM1.dNc);
    } else {
      paramaxM2.dNb = (f1 * paramaxM1.dMX + f2 * paramaxM1.dMZ + paramaxM1.dNb);
      paramaxM2.dNc = (f1 * paramaxM1.dMY + f2 * paramaxM1.dNa + paramaxM1.dNc);
    }

    paramaxM2.bOZ = paramaxM1.bOZ;
    paramaxM2.bPa = paramaxM1.bPa;
    paramaxM2.bPb = paramaxM1.bPb;
    paramaxM2.bPc = paramaxM1.bPc;
  }
}