public class czT
{
  float ipR = 1.4E-45F;
  float ipS = 3.4028235E+38F;
  float ipT = 1.4E-45F;
  float ipU = 3.4028235E+38F;
  float ipV = 1.4E-45F;
  float ipW = 3.4028235E+38F;

  public czT(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
  }

  public czT()
  {
  }

  public static czT cwR() {
    return new czT();
  }

  public final void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    cw(paramFloat1);
    cv(paramFloat2);
    cy(paramFloat3);
    cx(paramFloat4);
    cA(paramFloat5);
    cz(paramFloat6);
  }

  public final float cwS() {
    return this.ipS;
  }

  public final void cv(float paramFloat) {
    if (this.ipR > paramFloat) {
      this.ipS = this.ipR;
      this.ipR = paramFloat;
    } else {
      this.ipS = paramFloat;
    }
  }

  public final float cwT() { return this.ipR; }

  public final void cw(float paramFloat)
  {
    if (this.ipS < paramFloat) {
      this.ipR = this.ipS;
      this.ipS = paramFloat;
    } else {
      this.ipR = paramFloat;
    }
  }

  public final float cwU() { return this.ipU; }

  public final void cx(float paramFloat)
  {
    if (this.ipT > paramFloat) {
      this.ipU = this.ipT;
      this.ipT = paramFloat;
    } else {
      this.ipU = paramFloat;
    }
  }

  public final float cwV() { return this.ipT; }

  public final void cy(float paramFloat)
  {
    if (this.ipU < paramFloat) {
      this.ipT = this.ipU;
      this.ipU = paramFloat;
    } else {
      this.ipT = paramFloat;
    }
  }

  public final float cwW() { return this.ipW; }

  public final void cz(float paramFloat)
  {
    if (this.ipV > paramFloat) {
      this.ipW = this.ipV;
      this.ipV = paramFloat;
    } else {
      this.ipW = paramFloat;
    }
  }

  public final float cwX() { return this.ipV; }

  public final void cA(float paramFloat)
  {
    if (this.ipW < paramFloat) {
      this.ipV = this.ipW;
      this.ipW = paramFloat;
    } else {
      this.ipV = paramFloat;
    }
  }

  public final boolean x(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return (this.ipR <= paramFloat1) && (paramFloat1 <= this.ipS) && (this.ipT <= paramFloat2) && (paramFloat2 <= this.ipU) && (this.ipV <= paramFloat3) && (paramFloat3 <= this.ipW);
  }

  public final boolean b(czT paramczT)
  {
    if (paramczT == null) {
      return false;
    }
    return (this.ipR <= paramczT.cwS()) && (paramczT.cwT() <= this.ipS) && (this.ipT <= paramczT.cwU()) && (paramczT.cwV() <= this.ipU) && (this.ipV <= paramczT.cwW()) && (paramczT.cwX() <= this.ipW);
  }

  public final boolean c(czT paramczT)
  {
    return (this.ipR <= paramczT.cwT()) && (paramczT.cwS() <= this.ipS) && (this.ipT <= paramczT.cwV()) && (paramczT.cwU() <= this.ipU) && (this.ipV <= paramczT.cwX()) && (paramczT.cwW() <= this.ipW);
  }

  public final float cwY()
  {
    return this.ipS - this.ipR;
  }

  public final float cwZ() {
    return this.ipU - this.ipR;
  }
}