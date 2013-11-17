public class Pl extends bMf
{
  byte kT;
  byte kU;
  byte kV;
  byte kW;

  public Pl()
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
    return this.kT * 0.007874016F;
  }

  public final float fi()
  {
    return this.kU * 0.007874016F;
  }

  public final float fj()
  {
    return this.kV * 0.007874016F;
  }

  public final float fk()
  {
    return this.kW * 0.007874016F;
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

    paramaxM1.bOZ *= this.kT * 0.007874016F;
    paramaxM1.bPa *= this.kU * 0.007874016F;
    paramaxM1.bPb *= this.kV * 0.007874016F;
    paramaxM1.bPc *= this.kW * 0.007874016F;
  }
}