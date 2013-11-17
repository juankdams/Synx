public class bWV
{
  public static final bWV hlj = new bWV(1.0F, 1.0F, 1.0F);
  public static final bWV hlk = new bWV(0.0F, 0.0F, 0.0F);
  protected float bOZ;
  protected float bPa;
  protected float bPb;
  protected float goD;
  protected float goE;
  protected float goF;
  protected int bmM;
  protected int hll;

  public bWV(bWV parambWV)
  {
    this(parambWV.bOZ, parambWV.bPa, parambWV.bPb);
  }

  public bWV(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.goD = (this.bOZ = paramFloat1);
    this.goE = (this.bPa = paramFloat2);
    this.goF = (this.bPb = paramFloat3);
    this.hll = 0;
    this.bmM = 0;
  }

  public float QC() {
    return this.bOZ;
  }

  public float QD() {
    return this.bPa;
  }

  public float QE() {
    return this.bPb;
  }

  public void c(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt) {
    this.goD = paramFloat1;
    this.goE = paramFloat2;
    this.goF = paramFloat3;
    this.hll = paramInt;
    this.bmM = 0;
  }

  public void m(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.bOZ = (this.goD = paramFloat1);
    this.bPa = (this.goE = paramFloat2);
    this.bPb = (this.goF = paramFloat3);
    this.hll = 0;
    this.bmM = 0;
  }

  public void update(int paramInt) {
    if (this.hll == 0) {
      return;
    }
    this.bmM += paramInt;

    if (this.bmM < this.hll) {
      float f = this.bmM / this.hll;
      this.bOZ = bCO.s(this.bOZ, this.goD, f);
      this.bPa = bCO.s(this.bPa, this.goE, f);
      this.bPb = bCO.s(this.bPb, this.goF, f);
    } else {
      this.bOZ = this.goD;
      this.bPa = this.goE;
      this.bPb = this.goF;
      this.hll = 0;
    }
  }

  public boolean ib() {
    return this.hll != 0;
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer("{");
    localStringBuffer.append(this.bOZ).append(" ; ");
    localStringBuffer.append(this.bPa).append(" ; ");
    localStringBuffer.append(this.bPb).append("}");
    return localStringBuffer.toString();
  }
}