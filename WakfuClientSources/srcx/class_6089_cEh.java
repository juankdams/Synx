public final class cEh extends aDx
{
  public cEh()
  {
  }

  public cEh(cEh paramcEh)
  {
    super(paramcEh);
  }

  public cEh(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    m(paramFloat1, paramFloat2, paramFloat3);
  }

  public cEh(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    super(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }

  public void m(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.aOR = paramFloat1;
    this.aOS = paramFloat2;
    this.aOT = paramFloat3;
  }

  public float czK() {
    return getX() * getX() + getY() * getY() + aCv() * aCv();
  }

  public float czL() {
    return czK() + aPI() * aPI();
  }

  public float aUn() {
    return (float)Math.sqrt(czK());
  }

  public float czM() {
    return (float)Math.sqrt(czL());
  }

  public float czN() {
    float f1 = aUn();
    if (f1 != 0.0F) {
      float f2 = 1.0F / f1;
      this.aOR *= f2;
      this.aOS *= f2;
      this.aOT *= f2;
      this.dYq *= f2;
    }
    return f1;
  }

  public float h(cEh paramcEh)
  {
    return getX() * paramcEh.getX() + getY() * paramcEh.getY() + aCv() * paramcEh.aCv();
  }

  public void c(cEh paramcEh1, cEh paramcEh2)
  {
    h(paramcEh1.getY() * paramcEh2.aCv() - paramcEh1.aCv() * paramcEh2.getY(), paramcEh1.aCv() * paramcEh2.getX() - paramcEh1.getX() * paramcEh2.aCv(), paramcEh1.getX() * paramcEh2.getY() - paramcEh1.getY() * paramcEh2.getX(), 0.0F);
  }

  public cEh cD(float paramFloat)
  {
    return new cEh(getX() * paramFloat, getY() * paramFloat, aCv() * paramFloat, aPI() * paramFloat);
  }

  public cEh cE(float paramFloat)
  {
    if ((!bB) && (paramFloat == 0.0F)) throw new AssertionError();
    return new cEh(getX() / paramFloat, getY() / paramFloat, aCv() / paramFloat, aPI() / paramFloat);
  }

  public cEh i(cEh paramcEh)
  {
    return new cEh(getX() + paramcEh.getX(), getY() + paramcEh.getY(), aCv() + paramcEh.aCv(), aPI() + paramcEh.aPI());
  }

  public cEh j(cEh paramcEh)
  {
    return new cEh(getX() - paramcEh.getX(), getY() - paramcEh.getY(), aCv() - paramcEh.aCv(), aPI() - paramcEh.aPI());
  }

  public cEh czO()
  {
    return new cEh(-getX(), -getY(), -aCv(), -aPI());
  }

  public void P(float paramFloat)
  {
    h(getX() * paramFloat, getY() * paramFloat, aCv() * paramFloat, aPI() * paramFloat);
  }

  public void cF(float paramFloat)
  {
    if ((!bB) && (paramFloat == 0.0F)) throw new AssertionError();
    h(getX() / paramFloat, getY() / paramFloat, aCv() / paramFloat, aPI() / paramFloat);
  }

  public void k(cEh paramcEh)
  {
    h(paramcEh.getX(), paramcEh.getY(), paramcEh.aCv(), paramcEh.aPI());
  }

  public void o(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    h(getX() + paramFloat1, getY() + paramFloat2, aCv() + paramFloat3, aPI() + paramFloat4);
  }

  public void l(cEh paramcEh)
  {
    h(getX() - paramcEh.getX(), getY() - paramcEh.getY(), aCv() - paramcEh.aCv(), aPI() - paramcEh.aPI());
  }

  public void a(float paramFloat, cEh paramcEh)
  {
    h(getX() + paramFloat * paramcEh.getX(), getY() + paramFloat * paramcEh.getY(), aCv() + paramFloat * paramcEh.aCv(), aPI() + paramFloat * paramcEh.aPI());
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer("V4{x=");
    localStringBuffer.append(this.aOR).append(", y=").append(this.aOS).append(", z=").append(this.aOT).append(", w=").append(this.dYq).append("}");
    return localStringBuffer.toString();
  }
}