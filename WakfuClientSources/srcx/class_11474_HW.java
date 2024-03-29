public class HW extends bLN
{
  byte kT;
  byte kU;
  byte kV;
  byte kW;

  public HW()
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
    paramaxM2.dNd = paramaxM1.dNd;
    paramaxM2.dMX = paramaxM1.dMX;
    paramaxM2.dMZ = paramaxM1.dMZ;
    paramaxM2.dMY = paramaxM1.dMY;
    paramaxM2.dNa = paramaxM1.dNa;

    paramaxM2.dNe = paramaxM1.dNe;
    paramaxM2.dNb = paramaxM1.dNb;
    paramaxM2.dNc = paramaxM1.dNc;

    paramaxM2.bOZ = (paramaxM1.bOZ * (this.kT / 127.0F) + this.cxC / 256.0F);
    paramaxM2.bPa = (paramaxM1.bPa * (this.kU / 127.0F) + this.cxD / 256.0F);
    paramaxM2.bPb = (paramaxM1.bPb * (this.kV / 127.0F) + this.cxE / 256.0F);
    paramaxM2.bPc = (paramaxM1.bPc * (this.kW / 127.0F) + this.cxF / 256.0F);
  }
}