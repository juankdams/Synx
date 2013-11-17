public class ajK extends UD
{
  short cxC;
  short cxD;
  short cxE;
  short cxF;

  public ajK()
  {
    this.cxC = 0;
    this.cxD = 0;
    this.cxE = 0;
    this.cxF = 0;
  }

  public void d(aYQ paramaYQ)
  {
    super.d(paramaYQ);

    this.cxC = paramaYQ.readShort();
    this.cxD = paramaYQ.readShort();
    this.cxE = paramaYQ.readShort();
    this.cxF = paramaYQ.readShort();
  }

  public final float ahs()
  {
    return this.cxC / 256.0F;
  }

  public final float aht()
  {
    return this.cxD / 256.0F;
  }

  public final float ahu()
  {
    return this.cxE / 256.0F;
  }

  public final float ahv()
  {
    return this.cxF / 256.0F;
  }

  public void a(axM paramaxM1, axM paramaxM2)
  {
    paramaxM2.dNd = false;
    paramaxM2.dNe = false;

    float f1 = this.cxi / 16.0F;
    float f2 = this.cxj / 16.0F;
    float f3 = this.gPC / 256.0F;
    float f4 = this.gPD / 256.0F;
    float f5 = this.gPE / 256.0F;
    float f6 = this.gPF / 256.0F;

    if (paramaxM1.dNd) {
      paramaxM2.dMX = f3;
      paramaxM2.dMY = f4;
      paramaxM2.dMZ = f5;
      paramaxM2.dNa = f6;

      paramaxM2.dNb = (f1 + paramaxM1.dNb);
      paramaxM2.dNc = (f2 + paramaxM1.dNc);
    } else {
      paramaxM2.dMX = (f3 * paramaxM1.dMX + f4 * paramaxM1.dMZ);
      paramaxM2.dMY = (f3 * paramaxM1.dMY + f4 * paramaxM1.dNa);
      paramaxM2.dMZ = (f5 * paramaxM1.dMX + f6 * paramaxM1.dMZ);
      paramaxM2.dNa = (f5 * paramaxM1.dMY + f6 * paramaxM1.dNa);

      paramaxM2.dNb = (f1 * paramaxM1.dMX + f2 * paramaxM1.dMZ + paramaxM1.dNb);
      paramaxM2.dNc = (f1 * paramaxM1.dMY + f2 * paramaxM1.dNa + paramaxM1.dNc);
    }

    paramaxM1.bOZ += this.cxC / 256.0F;
    paramaxM1.bPa += this.cxD / 256.0F;
    paramaxM1.bPb += this.cxE / 256.0F;
    paramaxM1.bPc += this.cxF / 256.0F;
  }
}