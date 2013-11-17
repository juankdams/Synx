public class bET extends TS
{
  byte gzR;
  byte gzS;

  public void d(aYQ paramaYQ)
  {
    super.d(paramaYQ);

    this.gzR = paramaYQ.readByte();
    this.gzS = paramaYQ.readByte();
  }

  public final float ahn()
  {
    return this.gzR * 16.0F / 127.0F;
  }

  public final float aho()
  {
    return this.gzS * 16.0F / 127.0F;
  }

  public void a(axM paramaxM1, axM paramaxM2)
  {
    paramaxM2.dNd = false;
    if (paramaxM1.dNd) {
      paramaxM2.dMX = (this.cxe / 127.0F);
      paramaxM2.dMY = (this.cxf / 127.0F);
      paramaxM2.dMZ = (this.cxg / 127.0F);
      paramaxM2.dNa = (this.cxh / 127.0F);
    } else {
      paramaxM2.dMX = (this.cxe / 127.0F * paramaxM1.dMX + this.cxf / 127.0F * paramaxM1.dMZ);
      paramaxM2.dMY = (this.cxe / 127.0F * paramaxM1.dMY + this.cxf / 127.0F * paramaxM1.dNa);
      paramaxM2.dMZ = (this.cxg / 127.0F * paramaxM1.dMX + this.cxh / 127.0F * paramaxM1.dMZ);
      paramaxM2.dNa = (this.cxg / 127.0F * paramaxM1.dMY + this.cxh / 127.0F * paramaxM1.dNa);
    }

    paramaxM2.dNe = false;
    float f1 = this.gzR * 16.0F / 127.0F;
    float f2 = this.gzS * 16.0F / 127.0F;
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