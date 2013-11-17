import java.util.ArrayList;
import java.util.List;

public class EV extends akN
{
  private aOw bMh;
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public EV(ArrayList paramArrayList) {
    u(paramArrayList);
    this.bMh = ((aOw)paramArrayList.get(0));
  }

  public int Os() {
    if ((this.bMh.sc()) && (this.bMh.pH())) {
      return (int)this.bMh.b(null, null, null, null);
    }
    return -1;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if (!(paramObject1 instanceof dhJ)) {
      throw new aIh("Le user d'un critère IsMonsterBreed doit être un player.");
    }
    dhJ localdhJ = (dhJ)paramObject1;
    bhh localbhh = localdhJ.aJp();
    int i = Os();

    if (i == localbhh.uO()) {
      return 0;
    }
    return -1;
  }

  public Enum gm() {
    return Bz.byy;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chv;
    aAG.add(arrayOfPq);
  }
}