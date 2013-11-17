import java.util.ArrayList;
import java.util.List;

public class cKj extends akN
{
  private static ArrayList aAG = new ArrayList();
  private aOw iJb;
  private aOw cKy;
  private boolean aMu;

  public cKj(ArrayList paramArrayList)
  {
    int i = u(paramArrayList);
    this.iJb = ((aOw)paramArrayList.get(0));
    if (i == 1)
      this.cKy = ((aOw)paramArrayList.get(1));
    if (i == 2)
      this.aMu = ((cic)paramArrayList.get(1)).getValue().equalsIgnoreCase("target");
  }

  public long akx()
  {
    return (this.cKy.sc()) && (this.cKy.pH()) ? this.cKy.b(null, null, null, null) : -1L;
  }

  public int cDX()
  {
    if ((this.iJb.sc()) && (this.iJb.pH())) {
      return (int)this.iJb.b(null, null, null, null);
    }
    return -1;
  }

  protected List kM() {
    return aAG;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    axQ localaxQ = aAw.b(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);

    int i = (byte)cDX();
    dKm localdKm = dKm.CM(i);

    if (localdKm == null) {
      throw new aIh("Le paramètre du critère HasWorldProperty doit être un id de WorldPropertyType valide (id=" + i + " n'existe pas)");
    }

    boolean bool = localaxQ.i(localdKm);
    if (!bool) {
      return -1;
    }
    if (this.cKy == null) {
      return 0;
    }
    long l = akx() * 1000L;
    if (System.currentTimeMillis() - cFA.b(localaxQ.getId(), localdKm) < l) {
      return -1;
    }
    return 0;
  }

  public Enum gm()
  {
    return Bz.byL;
  }

  static
  {
    aAG.add(zT.bva);
    aAG.add(new Pq[] { Pq.chv, Pq.chv });
    aAG.add(new Pq[] { Pq.chv, Pq.chu });
  }
}