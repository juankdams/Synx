public final class aIn extends aDx
{
  public aIn()
  {
  }

  public aIn(aIn paramaIn)
  {
    super(paramaIn);
  }

  public aIn(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    super(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }

  public aIn(cEi paramcEi, float paramFloat) {
    a(paramcEi, paramFloat);
  }

  public float aUn() {
    return (float)Math.sqrt(getX() * getX() + getY() * getY() + aCv() * aCv() + aPI() * aPI());
  }

  public void normalize() {
    if ((!bB) && (aUn() <= 0.0F)) throw new AssertionError("Unable to normalize the quaternion since the norme is null");

    float f = aUn();
    this.aOR /= f;
    this.aOS /= f;
    this.aOT /= f;
    this.dYq /= f;
  }

  public void Ls()
  {
    h(0.0F, 0.0F, 0.0F, 1.0F);
  }

  public void a(cEi paramcEi, float paramFloat)
  {
    float f1 = paramFloat * 0.5F;
    float f2 = bCO.bF(f1);
    h(paramcEi.getX() * f2, paramcEi.getY() * f2, paramcEi.aCv() * f2, bCO.bG(f1));
    normalize();
  }

  public void m(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    aIn localaIn1 = new aIn(new cEi(bCO.bF(paramFloat1 * 0.5F), 0.0F, 0.0F), bCO.bG(paramFloat1 * 0.5F));
    aIn localaIn2 = new aIn(new cEi(0.0F, bCO.bF(paramFloat2 * 0.5F), 0.0F), bCO.bG(paramFloat2 * 0.5F));
    aIn localaIn3 = new aIn(new cEi(0.0F, 0.0F, bCO.bF(paramFloat3 * 0.5F)), bCO.bG(paramFloat3 * 0.5F));

    a(localaIn1.b(localaIn2).b(localaIn3));
  }

  public aIn aUo()
  {
    return new aIn(-getX(), -getY(), -aCv(), aPI());
  }

  public aIn aUp()
  {
    aIn localaIn = aUo();
    float f = localaIn.getX() * localaIn.getX() + localaIn.getY() * localaIn.getY() + localaIn.aCv() * localaIn.aCv() + localaIn.aPI() * localaIn.aPI();
    localaIn.aOR /= f;
    localaIn.aOS /= f;
    localaIn.aOT /= f;
    localaIn.dYq /= f;
    return localaIn;
  }

  public aIn b(aIn paramaIn)
  {
    return new aIn(aPI() * paramaIn.getX() + getX() * paramaIn.aPI() + getY() * paramaIn.aCv() - aCv() * paramaIn.getY(), aPI() * paramaIn.getY() + getY() * paramaIn.aPI() + aCv() * paramaIn.getX() - getX() * paramaIn.aCv(), aPI() * paramaIn.aCv() + aCv() * paramaIn.aPI() + getX() * paramaIn.getY() - getY() * paramaIn.getX(), aPI() * paramaIn.aPI() - getX() * paramaIn.getX() - getY() * paramaIn.getY() - aCv() * paramaIn.aCv());
  }

  public aIn c(aIn paramaIn)
  {
    return b(paramaIn.aUp());
  }

  public void d(aIn paramaIn)
  {
    a(b(paramaIn));
  }

  public void e(aIn paramaIn)
  {
    a(c(paramaIn));
  }

  public void a(aIn paramaIn1, aIn paramaIn2, float paramFloat)
  {
    float f1 = paramaIn1.getX() * paramaIn2.getX() + paramaIn1.getY() * paramaIn2.getY() + paramaIn1.aCv() * paramaIn2.aCv() + paramaIn1.aPI() * paramaIn2.aPI();
    float f2;
    float f3;
    if (1.0F + f1 > 1.0E-005F)
    {
      if (1.0F - f1 > 1.0E-005F)
      {
        float f4 = bCO.bJ(f1);
        float f5 = bCO.bF(f4);
        f2 = bCO.bF((1.0F - paramFloat) * f4) / f5;
        f3 = bCO.bF(paramFloat * f4) / f5;
      }
      else {
        f2 = 1.0F - paramFloat;
        f3 = paramFloat;
      }
      h(f2 * paramaIn1.getX() + f3 * paramaIn2.getX(), f2 * paramaIn1.getY() + f3 * paramaIn2.getY(), f2 * paramaIn1.aCv() + f3 * paramaIn2.aCv(), f2 * paramaIn1.aPI() + f3 * paramaIn2.aPI());
    }
    else
    {
      f2 = bCO.bF((1.0F - paramFloat) * 1.570796F);
      f3 = bCO.bF(paramFloat * 1.570796F);
      h(f2 * paramaIn1.getX() - f3 * paramaIn2.getY(), f2 * paramaIn1.getY() + f3 * paramaIn2.getX(), f2 * paramaIn1.aCv() - f3 * paramaIn2.aPI(), f2 * paramaIn1.aPI() + f3 * paramaIn2.aCv());
    }
  }
}