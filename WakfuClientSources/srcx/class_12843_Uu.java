public class Uu extends bMj
{
  short cxC;
  short cxD;
  short cxE;
  short cxF;

  public Uu()
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
    if (paramaxM1.dNd) {
      paramaxM2.dMX = (this.gPC / 256.0F);
      paramaxM2.dMY = (this.gPD / 256.0F);
      paramaxM2.dMZ = (this.gPE / 256.0F);
      paramaxM2.dNa = (this.gPF / 256.0F);
    } else {
      paramaxM2.dMX = (this.gPC / 256.0F * paramaxM1.dMX + this.gPD / 256.0F * paramaxM1.dMZ);
      paramaxM2.dMY = (this.gPC / 256.0F * paramaxM1.dMY + this.gPD / 256.0F * paramaxM1.dNa);
      paramaxM2.dMZ = (this.gPE / 256.0F * paramaxM1.dMX + this.gPF / 256.0F * paramaxM1.dMZ);
      paramaxM2.dNa = (this.gPE / 256.0F * paramaxM1.dMY + this.gPF / 256.0F * paramaxM1.dNa);
    }

    paramaxM2.dNe = paramaxM1.dNe;
    paramaxM2.dNb = paramaxM1.dNb;
    paramaxM2.dNc = paramaxM1.dNc;

    paramaxM1.bOZ += this.cxC / 256.0F;
    paramaxM1.bPa += this.cxD / 256.0F;
    paramaxM1.bPb += this.cxE / 256.0F;
    paramaxM1.bPc += this.cxF / 256.0F;
  }
}