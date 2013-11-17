import java.util.ArrayList;
import java.util.List;

public class djF extends akN
  implements azn
{
  private static ArrayList aAG = new ArrayList();
  protected aOw ddu;
  protected aOw lgI = null;
  protected String bUJ;

  protected List kM()
  {
    return aAG;
  }

  public djF(ArrayList paramArrayList) {
    int i = u(paramArrayList);
    this.ddu = ((aOw)paramArrayList.get(0));
    if ((i == 1) || (i == 3))
      this.lgI = ((aOw)paramArrayList.get(1));
    if (i == 2)
      this.bUJ = ((cic)paramArrayList.get(1)).getValue();
    if (i == 3)
      this.bUJ = ((cic)paramArrayList.get(2)).getValue();
  }

  public int cSx() {
    if ((this.ddu.sc()) && (this.ddu.pH())) {
      return (int)this.ddu.b(null, null, null, null);
    }
    return -1;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    Object localObject = aAw.a(this.bUJ, paramObject1, paramObject2, paramObject4, paramObject3);
    if ((localObject == null) && ((paramObject3 instanceof apn))) {
      localObject = ((apn)paramObject3).aBv();
    }
    if (localObject == null)
      return -1;
    boolean bool;
    if (this.lgI == null)
      bool = ((axQ)localObject).du(this.ddu.b(paramObject1, paramObject2, paramObject3, paramObject4));
    else {
      bool = ((axQ)localObject).r(this.ddu.b(paramObject1, paramObject2, paramObject3, paramObject4), this.lgI.b(paramObject1, paramObject2, paramObject3, paramObject4));
    }

    if (bool)
      return 0;
    return -1;
  }

  public Enum gm()
  {
    return Bz.bxL;
  }

  public boolean akL() {
    return this.bUJ.equalsIgnoreCase("target");
  }

  public int cSy() {
    if ((this.lgI != null) && (this.lgI.sc()) && (this.lgI.pH())) {
      return (int)this.lgI.b(null, null, null, null);
    }
    return -1;
  }

  static
  {
    aAG.add(new Pq[] { Pq.chv });
    aAG.add(new Pq[] { Pq.chv, Pq.chv });
    aAG.add(new Pq[] { Pq.chv, Pq.chu });
    aAG.add(new Pq[] { Pq.chv, Pq.chv, Pq.chu });
  }
}