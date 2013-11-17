import java.util.ArrayList;
import java.util.List;

public final class YK extends cIX
{
  private static ArrayList aAG = new ArrayList();
  private aOw cJQ;

  protected List kM()
  {
    return aAG;
  }

  public YK(ArrayList paramArrayList) {
    J(paramArrayList);
    if (paramArrayList.size() == 1)
      this.cJQ = ((aOw)paramArrayList.get(0));
  }

  public int bP() {
    if ((this.cJQ != null) && (this.cJQ.sc()) && (this.cJQ.pH())) {
      return (int)this.cJQ.b(null, null, null, null);
    }
    return -1;
  }

  public boolean pH() {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    dhJ localdhJ = null;

    if ((paramObject1 instanceof dhJ))
      localdhJ = (dhJ)paramObject1;
    else if ((paramObject3 instanceof apn)) {
      localdhJ = ((apn)paramObject3).aBv();
    }
    if (localdhJ == null) {
      throw new aIh("Impossible de récupérer la cible du critère");
    }
    if (this.cJQ != null) {
      int i = (int)this.cJQ.b(paramObject1, paramObject2, paramObject3, paramObject4);
      return localdhJ.cJf().dJ(i);
    }
    return localdhJ.cJf().dJ(localdhJ.cJf().bP());
  }

  public Enum gm()
  {
    return Bz.bzD;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[0];
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chv;
    aAG.add(arrayOfPq);
  }
}