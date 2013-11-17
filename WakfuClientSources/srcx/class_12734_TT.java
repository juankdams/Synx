public class TT extends dMA
{
  short cxi;
  short cxj;

  public void d(aYQ paramaYQ)
  {
    this.cxi = paramaYQ.readShort();
    this.cxj = paramaYQ.readShort();
  }

  public final float ahn()
  {
    return this.cxi / 256.0F;
  }

  public final float aho()
  {
    return this.cxj / 256.0F;
  }

  public void a(axM paramaxM1, axM paramaxM2)
  {
    paramaxM2.dNd = paramaxM1.dNd;
    paramaxM2.dMX = paramaxM1.dMX;
    paramaxM2.dMZ = paramaxM1.dMZ;
    paramaxM2.dMY = paramaxM1.dMY;
    paramaxM2.dNa = paramaxM1.dNa;

    paramaxM2.dNe = false;
    if (paramaxM1.dNd) {
      paramaxM2.dNb = (this.cxi / 256.0F + paramaxM1.dNb);
      paramaxM2.dNc = (this.cxj / 256.0F + paramaxM1.dNc);
    } else {
      paramaxM2.dNb = (this.cxi / 256.0F * paramaxM1.dMX + this.cxj / 256.0F * paramaxM1.dMZ + paramaxM1.dNb);

      paramaxM2.dNc = (this.cxi / 256.0F * paramaxM1.dMY + this.cxj / 256.0F * paramaxM1.dNa + paramaxM1.dNc);
    }

    paramaxM2.bOZ = paramaxM1.bOZ;
    paramaxM2.bPa = paramaxM1.bPa;
    paramaxM2.bPb = paramaxM1.bPb;
    paramaxM2.bPc = paramaxM1.bPc;
  }
}