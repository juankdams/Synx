import java.util.ArrayList;
import java.util.List;

public class Ya extends akN
{
  private static final ArrayList aAG = new ArrayList();
  private aOw cIC;

  public Ya()
  {
  }

  public Ya(ArrayList paramArrayList)
  {
    u(paramArrayList);
    this.cIC = ((aOw)paramArrayList.get(0));
  }

  protected List kM()
  {
    return aAG;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    axQ localaxQ = aAw.f(paramObject1, paramObject2, paramObject4, paramObject3);
    if (localaxQ == null)
      throw new aIh("Impossible de récupérer la cible du critère");
    if (!(localaxQ instanceof bWy)) {
      throw new aIh("Mauvais utilisateur du critère");
    }
    bWy localbWy = (bWy)localaxQ;
    alW localalW = localbWy.bSD();

    int i = (int)this.cIC.b(paramObject1, paramObject2, paramObject3, paramObject4);
    return (localalW.CD() > 0L) && (localalW.xf().contains(i)) ? 0 : -1;
  }

  public int ajL() {
    if (this.cIC.pH()) {
      return (int)this.cIC.b(null, null, null, null);
    }
    return -1;
  }

  public Enum gm()
  {
    return Bz.byM;
  }

  public String toString()
  {
    return "HasGuildBonus{m_bonusId=" + this.cIC + '}';
  }

  static
  {
    aAG.add(new Pq[] { Pq.chv });
  }
}