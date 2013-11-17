import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class ZM extends akN
{
  private aOw bMh;
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public ZM(ArrayList paramArrayList) {
    u(paramArrayList);
    this.bMh = ((aOw)paramArrayList.get(0));
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if (!(paramObject1 instanceof dhJ)) {
      throw new aIh("Le user d'un critère IsMonsterBreed doit être un player.");
    }
    dhJ localdhJ1 = (dhJ)paramObject1;

    aPH localaPH = localdhJ1.afv();
    if (localaPH == null) {
      return -1;
    }
    Collection localCollection = localaPH.bgF();
    for (Iterator localIterator = localCollection.iterator(); localIterator.hasNext(); ) {
      dhJ localdhJ2 = (dhJ)localIterator.next();
      if ((localdhJ2 != localdhJ1) && 
        (localdhJ2.afw() == localdhJ1))
      {
        if (localdhJ2.uO() == this.bMh.b(paramObject1, paramObject2, paramObject3, paramObject4))
          return 0;
      }
    }
    return -1;
  }

  public short uO() {
    if ((this.bMh.sc()) && (this.bMh.pH())) {
      return (short)(int)this.bMh.b(null, null, null, null);
    }
    return -1;
  }

  public Enum gm() {
    return Bz.bBr;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chv;
    aAG.add(arrayOfPq);
  }
}