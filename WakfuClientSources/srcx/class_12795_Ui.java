public class Ui extends bMf
{
  short cxC;
  short cxD;
  short cxE;
  short cxF;

  public Ui()
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
    return this.cxC * 0.0039063F;
  }

  public final float aht()
  {
    return this.cxD * 0.0039063F;
  }

  public final float ahu()
  {
    return this.cxE * 0.0039063F;
  }

  public final float ahv()
  {
    return this.cxF * 0.0039063F;
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

    paramaxM1.bOZ += this.cxC * 0.0039063F;
    paramaxM1.bPa += this.cxD * 0.0039063F;
    paramaxM1.bPb += this.cxE * 0.0039063F;
    paramaxM1.bPc += this.cxF * 0.0039063F;
  }
}