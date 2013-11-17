public class cGL extends aOw
{
  private bZA aNJ;
  private aOw iBO;
  private aOw iBP;
  private boolean iBQ = false;

  public cGL(bZA parambZA, aOw paramaOw1, aOw paramaOw2) {
    this.aNJ = parambZA;
    this.iBO = paramaOw1;
    this.iBP = paramaOw2;
  }

  public double c(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if (this.aNJ.i(paramObject1, paramObject2, paramObject3, paramObject4)) {
      return (this.iBQ ? -1 : 1) * (this.iBO.pH() ? this.iBO.b(paramObject1, paramObject2, paramObject3, paramObject4) : this.iBO.c(paramObject1, paramObject2, paramObject3, paramObject4));
    }
    return (this.iBQ ? -1 : 1) * (this.iBP.pH() ? this.iBP.b(paramObject1, paramObject2, paramObject3, paramObject4) : this.iBP.c(paramObject1, paramObject2, paramObject3, paramObject4));
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if (!pH())
      throw new UnsupportedOperationException("Cant't get integer value of a double");
    if (this.aNJ.i(paramObject1, paramObject2, paramObject3, paramObject4))
      return (this.iBQ ? -1 : 1) * this.iBO.b(paramObject1, paramObject2, paramObject3, paramObject4);
    return (this.iBQ ? -1 : 1) * this.iBP.b(paramObject1, paramObject2, paramObject3, paramObject4);
  }

  public boolean pH() {
    return (this.iBO.pH()) && (this.iBP.pH());
  }

  public void bfq() {
    this.iBQ = (!this.iBQ);
  }

  public boolean sc() {
    return false;
  }

  public Enum gm() {
    return apd.duL;
  }

  public Pq aNE() {
    return this.iBO.aNE();
  }
}