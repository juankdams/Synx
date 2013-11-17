import java.util.ArrayList;
import java.util.List;

public final class cIz extends akN
{
  private static ArrayList aAG = new ArrayList();
  private aOw iFX;
  private aOw aUQ;

  public cIz()
  {
  }

  public cIz(ArrayList paramArrayList)
  {
    u(paramArrayList);
    this.aUQ = ((aOw)paramArrayList.get(0));
  }

  protected List kM()
  {
    return aAG;
  }

  public Enum gm() {
    return Bz.bAY;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    dhJ localdhJ = aAw.e(paramObject1, paramObject2, paramObject3, paramObject4);

    if ((localdhJ == null) || (!(localdhJ instanceof aHi))) {
      throw new aIh("Impossible de récupérer la cible du critère");
    }
    int i = (int)this.aUQ.b(paramObject1, paramObject2, paramObject3, paramObject4);
    return ((aHi)localdhJ).aTn().contains(i) ? 0 : -1;
  }

  public int axX() {
    if (this.aUQ.pH()) {
      return (int)this.aUQ.b(null, null, null, null);
    }
    return -1;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chv;
    aAG.add(arrayOfPq);
  }
}