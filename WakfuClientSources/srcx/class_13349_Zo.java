import java.util.ArrayList;
import java.util.List;

public class Zo extends akN
{
  private static ArrayList aAG = new ArrayList();
  private aOw cKy;

  public Zo(ArrayList paramArrayList)
  {
    u(paramArrayList);
    this.cKy = ((aOw)paramArrayList.get(0));
  }

  public long akx() {
    return (this.cKy.sc()) && (this.cKy.pH()) ? this.cKy.b(null, null, null, null) * 1000L : -1L;
  }

  protected List kM()
  {
    return aAG;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if (!(paramObject1 instanceof bQH)) {
      throw new aIh("Le user d'un critère HasWorldProperty doit être un character.");
    }
    bQH localbQH = (bQH)paramObject1;

    if (this.cKy != null) {
      long l = akx();
      if (System.currentTimeMillis() - localbQH.bXF() >= l) {
        return 0;
      }
    }
    return -1;
  }

  public Enum gm()
  {
    return Bz.bDc;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chv;
    aAG.add(arrayOfPq);
  }
}