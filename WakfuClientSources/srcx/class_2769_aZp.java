public class aZp extends drU
{
  private aOw boW;
  private aOw boX;

  private aZp(aOw paramaOw1, aOw paramaOw2)
  {
    this.boW = paramaOw1;
    this.boX = paramaOw2;
  }

  public static aOw b(dKY paramdKY1, dKY paramdKY2) {
    a(new dKY[] { paramdKY1, paramdKY2 });
    aOw localaOw1 = (aOw)paramdKY1;
    aOw localaOw2 = (aOw)paramdKY2;
    if ((localaOw1.sc()) && (localaOw2.sc())) {
      if ((localaOw1.pH()) && (localaOw2.pH()))
        return new ciM(localaOw1.b(null, null, null, null) * localaOw2.b(null, null, null, null));
      return new bOn(localaOw1.c(null, null, null, null) * localaOw2.c(null, null, null, null));
    }
    return new aZp(localaOw1, localaOw2);
  }

  public boolean pH()
  {
    return (this.boW.pH()) && (this.boX.pH());
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    long l = this.boW.b(paramObject1, paramObject2, paramObject3, paramObject4) * this.boX.b(paramObject1, paramObject2, paramObject3, paramObject4);

    if (cYD()) {
      return -1L * l;
    }
    return l;
  }

  public double c(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    double d = this.boW.c(paramObject1, paramObject2, paramObject3, paramObject4) * this.boX.c(paramObject1, paramObject2, paramObject3, paramObject4);

    if (cYD()) {
      return -1.0D * d;
    }
    return d;
  }

  public boolean sc() {
    return false;
  }

  public Enum gm() {
    return apd.duO;
  }
}