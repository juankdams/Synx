public class kl extends bZA
{
  private bZA aNJ;
  private bZA aNK;
  private bZA aNL;

  public static dKY a(dKY paramdKY1, dKY paramdKY2, dKY paramdKY3)
  {
    if ((paramdKY1 == null) || (paramdKY1.aNE() != Pq.chw))
      throw new ddQ("La condition d'un if doit être un booléen");
    if ((paramdKY2 == null) || (paramdKY3 == null) || (paramdKY2.aNE() != paramdKY3.aNE()))
      throw new ddQ("Les deux branches d'un if doivent exister et avoir le même type ");
    if (paramdKY2.aNE() == Pq.chw) {
      if (((bZA)paramdKY1).sc()) {
        if (((bZA)paramdKY1).i(null, null, null, null)) {
          if (((bZA)paramdKY2).sc()) {
            return new bBB(((bZA)paramdKY2).i(null, null, null, null));
          }
          return paramdKY2;
        }
        if (((bZA)paramdKY3).sc()) {
          return new bBB(((bZA)paramdKY3).i(null, null, null, null));
        }
        return paramdKY3;
      }
      return new kl((bZA)paramdKY1, (bZA)paramdKY2, (bZA)paramdKY3);
    }
    if ((paramdKY2.aNE() == Pq.chv) || ((paramdKY2.aNE() == Pq.chz) && (paramdKY2.aNE() == paramdKY3.aNE()))) {
      if (((bZA)paramdKY1).sc()) {
        if (((bZA)paramdKY1).i(null, null, null, null)) {
          return paramdKY2;
        }
        return paramdKY3;
      }

      return new cGL((bZA)paramdKY1, (aOw)paramdKY2, (aOw)paramdKY3);
    }
    throw new ddQ("Les deux branches d'un if doivent être soit booléennes soit numériques");
  }

  public kl(bZA parambZA1, bZA parambZA2, bZA parambZA3) {
    this.aNJ = parambZA1;
    this.aNK = parambZA2;
    this.aNL = parambZA3;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if (this.aNJ.i(paramObject1, paramObject2, paramObject3, paramObject4))
      return this.aNK.a(paramObject1, paramObject2, paramObject3, paramObject4);
    return this.aNL.a(paramObject1, paramObject2, paramObject3, paramObject4);
  }

  public boolean sc() {
    return false;
  }

  public Enum gm() {
    return apd.duL;
  }
}