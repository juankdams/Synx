import java.util.ArrayList;
import java.util.List;

public final class ev extends akN
{
  private static ArrayList aAG = new ArrayList();
  private aOw aAH;

  public ev()
  {
  }

  public ev(ArrayList paramArrayList)
  {
    u(paramArrayList);
    this.aAH = ((aOw)paramArrayList.get(0));
  }

  protected List kM()
  {
    return aAG;
  }

  public Enum gm() {
    return Bz.bBb;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    dhJ localdhJ = aAw.e(paramObject1, paramObject2, paramObject3, paramObject4);

    if ((localdhJ == null) || (!(localdhJ instanceof awN))) {
      throw new aIh("Impossible de récupérer la cible du critère");
    }
    int i = (int)this.aAH.b(paramObject1, paramObject2, paramObject3, paramObject4);
    return ((awN)localdhJ).aIx().cC(i) ? 0 : -1;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chv;
    aAG.add(arrayOfPq);
  }
}