public class ajI extends UD
{
  byte kT;
  byte kU;
  byte kV;
  byte kW;

  public ajI()
  {
    this.kT = 127;
    this.kU = 127;
    this.kV = 127;
    this.kW = 127;
  }

  public void d(aYQ paramaYQ)
  {
    super.d(paramaYQ);
    this.kT = paramaYQ.readByte();
    this.kU = paramaYQ.readByte();
    this.kV = paramaYQ.readByte();
    this.kW = paramaYQ.readByte();
  }

  public final float fh()
  {
    return this.kT / 127.0F;
  }

  public final float fi()
  {
    return this.kU / 127.0F;
  }

  public final float fj()
  {
    return this.kV / 127.0F;
  }

  public final float fk()
  {
    return this.kW / 127.0F;
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

    paramaxM1.bOZ *= this.kT / 127.0F;
    paramaxM1.bPa *= this.kU / 127.0F;
    paramaxM1.bPb *= this.kV / 127.0F;
    paramaxM1.bPc *= this.kW / 127.0F;
  }
}