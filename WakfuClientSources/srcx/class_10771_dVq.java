public class dVq extends drU
{
  private aOw boW;
  private aOw boX;

  private dVq(aOw paramaOw1, aOw paramaOw2)
  {
    this.boW = paramaOw1;
    this.boX = paramaOw2;
  }

  public static aOw b(dKY paramdKY1, dKY paramdKY2) {
    a(new dKY[] { paramdKY1, paramdKY2 });
    aOw localaOw1 = (aOw)paramdKY1;
    aOw localaOw2 = (aOw)paramdKY2;
    if ((localaOw1.sc()) && (localaOw2.sc())) {
      return new bOn((localaOw1.pH() ? localaOw1.b(null, null, null, null) : localaOw1.c(null, null, null, null)) / (localaOw2.pH() ? localaOw2.b(null, null, null, null) : localaOw2.c(null, null, null, null)));
    }

    return new dVq(localaOw1, localaOw2);
  }

  public boolean pH()
  {
    return false;
  }

  public double c(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    double d = (this.boW.pH() ? this.boW.b(paramObject1, paramObject2, paramObject3, paramObject4) : this.boW.c(paramObject1, paramObject2, paramObject3, paramObject4)) / (this.boX.pH() ? this.boX.b(paramObject1, paramObject2, paramObject3, paramObject4) : this.boX.c(paramObject1, paramObject2, paramObject3, paramObject4));

    if (cYD()) {
      return -1.0D * d;
    }
    return d;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    throw new UnsupportedOperationException("Pas de division entière pour le moment");
  }

  public boolean sc() {
    return false;
  }

  public Enum gm() {
    return apd.duJ;
  }
}