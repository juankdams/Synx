public class GH
{
  protected float bOZ;
  protected float bPa;
  protected float bPb;
  protected float bPc;

  public float QC()
  {
    return this.bOZ;
  }
  public float QD() {
    return this.bPa;
  }
  public float QE() {
    return this.bPb;
  }
  public float getAlpha() {
    return this.bPc;
  }

  public void a(bUT parambUT) {
    this.bOZ = parambUT.getFloat();
    this.bPa = parambUT.getFloat();
    this.bPb = parambUT.getFloat();
    this.bPc = parambUT.getFloat();
  }
}