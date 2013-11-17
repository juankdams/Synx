public class TS extends dMA
{
  byte cxe;
  byte cxf;
  byte cxg;
  byte cxh;

  public TS()
  {
    this.cxe = 127;
    this.cxf = 0;
    this.cxg = 0;
    this.cxh = 127;
  }

  public void d(aYQ paramaYQ)
  {
    this.cxe = paramaYQ.readByte();
    this.cxf = paramaYQ.readByte();
    this.cxg = paramaYQ.readByte();
    this.cxh = paramaYQ.readByte();
  }

  public final float ahj()
  {
    return this.cxe / 127.0F;
  }

  public final float ahk()
  {
    return this.cxf / 127.0F;
  }

  public final float ahl()
  {
    return this.cxg / 127.0F;
  }

  public final float ahm()
  {
    return this.cxh / 127.0F;
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

    paramaxM2.dNe = paramaxM1.dNe;
    paramaxM2.dNb = paramaxM1.dNb;
    paramaxM2.dNc = paramaxM1.dNc;

    paramaxM2.bOZ = paramaxM1.bOZ;
    paramaxM2.bPa = paramaxM1.bPa;
    paramaxM2.bPb = paramaxM1.bPb;
    paramaxM2.bPc = paramaxM1.bPc;
  }
}