import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class adj extends akN
{
  private static ArrayList aAG = new ArrayList();
  private boolean aMu;

  protected List kM()
  {
    return aAG;
  }

  public adj(ArrayList paramArrayList) {
    this.aMu = ((u(paramArrayList) == 0) && (((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target")));
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    dhJ localdhJ1 = aAw.a(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localdhJ1 == null) {
      return -1;
    }
    aPH localaPH = localdhJ1.afv();
    if (localaPH == null) {
      return -1;
    }
    Collection localCollection = localaPH.bgG();
    for (dhJ localdhJ2 : localCollection) {
      if (localdhJ2.boT() != null) {
        return 0;
      }
    }
    return -1;
  }

  public Enum gm() {
    return Bz.bBw;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chu;
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[0];
    aAG.add(arrayOfPq);
  }
}