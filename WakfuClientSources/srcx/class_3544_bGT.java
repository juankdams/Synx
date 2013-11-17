public class bGT
{
  private float gDP = 1000.0F;
  private boolean gDQ = false;
  private int bmM;
  private float bOZ = 1.0F;
  private float bPa = 1.0F;
  private float bPb = 1.0F;
  private float bPc = 1.0F;
  private float goD = 1.0F;
  private float goE = 1.0F;
  private float goF = 1.0F;
  private float gDR = 1.0F;
  private float gDS = 1.0F;
  private float gDT = 1.0F;
  private float gDU = 1.0F;
  private float gDV = 1.0F;

  private final aoL gDW = new aoL();
  private final baC gDX = new baC(this, null);

  private static final bGT gDY = new bGT();

  public static bGT bOB() {
    return gDY;
  }

  public final dvR gF(long paramLong) {
    return this.gDW.isEmpty() ? null : (dvR)this.gDW.get(paramLong);
  }

  public void a(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    a(paramLong, paramFloat1, paramFloat2, paramFloat3, paramFloat4, 1000.0F);
  }

  public void a(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5) {
    dvR localdvR = (dvR)this.gDW.get(paramLong);
    if (localdvR == null) {
      localdvR = new dvR(null);
      this.gDW.put(paramLong, localdvR);
    }
    localdvR.b(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5);
  }

  public final void clear() {
    this.gDW.clear();
  }

  public void f(boolean paramBoolean, int paramInt)
  {
    this.gDP = paramInt;

    if (this.gDQ != paramBoolean) {
      this.gDS = this.bOZ;
      this.gDT = this.bPa;
      this.gDU = this.bPb;
      this.gDV = this.bPc;
    }
    if (!paramBoolean) {
      this.goD = 1.0F;
      this.goE = 1.0F;
      this.goF = 1.0F;
      this.gDR = 1.0F;
    }
    this.gDQ = paramBoolean;
    this.bmM = 0;
  }

  public boolean bOC() {
    return this.bmM < this.gDP;
  }

  public void update(int paramInt) {
    if (!this.gDW.isEmpty()) {
      this.gDX.fiL = paramInt;
      this.gDW.b(this.gDX);
      this.gDX.clean();
    }

    if (this.bmM == 2147483647) {
      return;
    }
    this.bmM += paramInt;
    if (this.bmM > this.gDP) {
      this.bmM = 2147483647;
      this.bOZ = (this.gDS = this.goD);
      this.bPa = (this.gDT = this.goE);
      this.bPb = (this.gDU = this.goF);
      this.bPc = (this.gDV = this.gDR);
      return;
    }

    float f = this.bmM / this.gDP;

    this.bOZ = (this.gDS + (this.goD - this.gDS) * f);
    this.bPa = (this.gDT + (this.goE - this.gDT) * f);
    this.bPb = (this.gDU + (this.goF - this.gDU) * f);
    this.bPc = (this.gDV + (this.gDR - this.gDV) * f);
  }

  public void y(float[] paramArrayOfFloat)
  {
    if ((!bB) && (paramArrayOfFloat.length != 4)) throw new AssertionError();

    paramArrayOfFloat[0] *= this.bOZ;
    paramArrayOfFloat[1] *= this.bPa;
    paramArrayOfFloat[2] *= this.bPb;
    paramArrayOfFloat[3] *= this.bPc;
  }

  public void bR(float paramFloat) {
    this.goD = (0.3F * paramFloat);
    this.goE = (0.3F * paramFloat);
    this.goF = (0.3F * paramFloat);
    this.gDR = paramFloat;
  }
}