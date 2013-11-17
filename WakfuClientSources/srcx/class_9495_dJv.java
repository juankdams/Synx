public class dJv extends ul
{
  private bZA aWz;
  private bZA aWA;

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if ((this.aWz.i(paramObject1, paramObject2, paramObject3, paramObject4)) || (this.aWA.i(paramObject1, paramObject2, paramObject3, paramObject4))) {
      return 0;
    }
    return -1;
  }

  private dJv(bZA parambZA1, bZA parambZA2) {
    this.aWz = parambZA1;
    this.aWA = parambZA2;
  }

  public bZA xd() {
    return this.aWz;
  }

  public bZA xe() {
    return this.aWA;
  }

  public boolean sc() {
    return false;
  }

  public static bZA a(dKY paramdKY1, dKY paramdKY2) {
    a(new dKY[] { paramdKY1, paramdKY2 });
    bZA localbZA1 = (bZA)paramdKY1;
    bZA localbZA2 = (bZA)paramdKY2;
    if (localbZA1.sc()) {
      if (localbZA1.i(null, null, null, null)) {
        return new bBB(true);
      }
      return localbZA2;
    }
    if (localbZA2.sc()) {
      if (localbZA2.i(null, null, null, null)) {
        return new bBB(true);
      }
      return localbZA1;
    }
    return new dJv(localbZA1, localbZA2);
  }

  public Enum gm() {
    return apd.duP;
  }
}