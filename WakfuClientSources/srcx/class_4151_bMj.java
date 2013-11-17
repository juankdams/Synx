public class bMj extends dMA
{
  short gPC;
  short gPD;
  short gPE;
  short gPF;

  public bMj()
  {
    this.gPC = 256;
    this.gPD = 0;
    this.gPE = 0;
    this.gPF = 256;
  }

  public void d(aYQ paramaYQ)
  {
    this.gPC = paramaYQ.readShort();
    this.gPD = paramaYQ.readShort();
    this.gPE = paramaYQ.readShort();
    this.gPF = paramaYQ.readShort();
  }

  public final float ahj()
  {
    return this.gPC / 256.0F;
  }

  public final float ahk()
  {
    return this.gPD / 256.0F;
  }

  public final float ahl()
  {
    return this.gPE / 256.0F;
  }

  public final float ahm()
  {
    return this.gPF / 256.0F;
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

    paramaxM2.bOZ = paramaxM1.bOZ;
    paramaxM2.bPa = paramaxM1.bPa;
    paramaxM2.bPb = paramaxM1.bPb;
    paramaxM2.bPc = paramaxM1.bPc;
  }
}