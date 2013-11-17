import org.apache.log4j.Logger;

public class cIj
{
  private static final Logger K = Logger.getLogger(cIj.class);
  public static final int iDC = 20;
  private float iDD = (0.0F / 0.0F);
  private float iDE = (0.0F / 0.0F);
  private float iDF = (0.0F / 0.0F);
  private float iDG = (0.0F / 0.0F);
  private float iDH = (0.0F / 0.0F);
  private float iDI = (0.0F / 0.0F);

  private int iDJ = 1000;
  private float dka;

  public void xX(int paramInt)
  {
    this.iDJ = paramInt;
  }

  public void setZoom(float paramFloat) {
    this.dka = paramFloat;
  }

  public float getIsoCenterX() {
    return this.iDD;
  }

  public float getIsoCenterY() {
    return this.iDE;
  }

  public float getIsoCenterZ() {
    return this.iDF;
  }

  public void setIsoCenterX(float paramFloat) {
    if (Float.isNaN(this.iDG)) {
      this.iDD = paramFloat;
      this.iDG = paramFloat;
    } else {
      this.iDG = paramFloat;
    }
    if ((!bB) && (Float.isNaN(this.iDD))) throw new AssertionError(); 
  }

  public void setIsoCenterY(float paramFloat)
  {
    if (Float.isNaN(this.iDH)) {
      this.iDE = paramFloat;
      this.iDH = paramFloat;
    } else {
      this.iDH = paramFloat;
    }
    if ((!bB) && (Float.isNaN(this.iDE))) throw new AssertionError(); 
  }

  public void setIsoCenterZ(float paramFloat)
  {
    if (Float.isNaN(this.iDI)) {
      this.iDF = paramFloat;
      this.iDI = paramFloat;
    } else {
      this.iDI = paramFloat;
    }
    if ((!bB) && (Float.isNaN(this.iDF))) throw new AssertionError(); 
  }

  public void reset()
  {
    this.iDD = 0.0F;
    this.iDE = 0.0F;
    this.iDF = 0.0F;
  }

  public float i(adG paramadG) {
    return paramadG.r(this.iDD, this.iDE);
  }

  public float j(adG paramadG) {
    return paramadG.g(this.iDD, this.iDE, this.iDF);
  }

  public int k(adG paramadG) {
    return (int)paramadG.r(this.iDG, this.iDH);
  }

  public int l(adG paramadG) {
    return (int)paramadG.s(this.iDG, this.iDH);
  }

  public cYm b(adG paramadG, int paramInt1, int paramInt2) {
    float f1 = paramadG.t(paramInt1, paramInt2) + this.iDD;
    float f2 = paramadG.u(paramInt1, paramInt2) + this.iDE;
    return new cYm(f1, f2);
  }

  public cYm a(adG paramadG, int paramInt1, int paramInt2, boolean paramBoolean) {
    float f1 = paramInt1 - (paramBoolean ? this.iDG : this.iDD);
    float f2 = paramInt2 - (paramBoolean ? this.iDH : this.iDE);

    float f3 = paramadG.r(f1, f2);
    float f4 = paramadG.s(f1, f2);

    return new cYm(f3, f4);
  }

  public cYm m(adG paramadG) {
    float f1 = this.iDD;
    float f2 = this.iDE;
    float f3 = this.iDF;

    ih(true);

    float f4 = this.iDD - f1;
    float f5 = this.iDE - f2;
    float f6 = paramadG.r(f4, f5);
    float f7 = paramadG.g(f4, f5, this.iDF - f3);

    return new cYm(f6, f7);
  }

  public cYm a(adG paramadG, boolean paramBoolean) {
    ih(paramBoolean);

    float f1 = i(paramadG);
    float f2 = j(paramadG);

    return new cYm(f1, f2);
  }

  public float getIsoValue(float paramFloat1, float paramFloat2, boolean paramBoolean) {
    return paramBoolean ? paramFloat2 : ah(paramFloat1, paramFloat2);
  }

  private void ih(boolean paramBoolean) {
    this.iDD = getIsoValue(this.iDD, this.iDG, paramBoolean);
    this.iDE = getIsoValue(this.iDE, this.iDH, paramBoolean);
    this.iDF = getIsoValue(this.iDF, this.iDI, paramBoolean);
  }

  private float ah(float paramFloat1, float paramFloat2)
  {
    if ((!bB) && (Float.isNaN(paramFloat1))) throw new AssertionError("position is NaN");
    if ((!bB) && (Float.isNaN(paramFloat2))) throw new AssertionError("BadMoFo !!!");
    if (paramFloat1 == paramFloat2)
      return paramFloat1;
    float f1 = paramFloat2 - paramFloat1;
    float f2 = Math.abs(f1);
    if (f2 > this.iDJ)
      return paramFloat2;
    if (f2 > this.dka)
      return paramFloat1 + f1 / 20.0F;
    return paramFloat1;
  }

  public boolean isInitialized() {
    return (!Float.isNaN(this.iDD)) && (!Float.isNaN(this.iDE)) && (!Float.isNaN(this.iDF)) && (!Float.isNaN(this.iDG)) && (!Float.isNaN(this.iDH)) && (!Float.isNaN(this.iDI));
  }
}