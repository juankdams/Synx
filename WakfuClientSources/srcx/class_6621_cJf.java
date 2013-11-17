public class cJf extends bQP
{
  private aOw boW;
  private aOw boX;

  private cJf(aOw paramaOw1, aOw paramaOw2)
  {
    this.boW = paramaOw1;
    this.boX = paramaOw2;
  }

  public aOw Ma() {
    return this.boW;
  }

  public aOw Mb() {
    return this.boX;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if ((this.boW.pH() ? this.boW.b(paramObject1, paramObject2, paramObject3, paramObject4) : this.boW.c(paramObject1, paramObject2, paramObject3, paramObject4)) != (this.boX.pH() ? this.boX.b(paramObject1, paramObject2, paramObject3, paramObject4) : this.boX.c(paramObject1, paramObject2, paramObject3, paramObject4)))
    {
      return 0;
    }
    return -1;
  }

  public boolean sc() {
    return false;
  }

  public static bZA a(dKY paramdKY1, dKY paramdKY2) {
    a(new dKY[] { paramdKY1, paramdKY2 });
    aOw localaOw1 = (aOw)paramdKY1;
    aOw localaOw2 = (aOw)paramdKY2;
    if ((localaOw1.sc()) && (localaOw2.sc())) {
      return new bBB((localaOw1.pH() ? localaOw1.b(null, null, null, null) : localaOw1.c(null, null, null, null)) != (localaOw2.pH() ? localaOw2.b(null, null, null, null) : localaOw2.c(null, null, null, null)));
    }

    return new cJf(localaOw1, localaOw2);
  }

  public Enum gm() {
    return apd.duK;
  }
}