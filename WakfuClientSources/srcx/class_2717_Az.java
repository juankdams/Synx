import java.util.ArrayList;
import java.util.List;

public class Az extends akN
{
  private int aPh;
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public Az()
  {
  }

  public Az(ArrayList paramArrayList) {
    int i = (short)u(paramArrayList);
    if (i == 0)
      this.aPh = ((int)((aOw)paramArrayList.get(0)).b(null, null, null, null));
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    aDQ localaDQ = null;

    if ((paramObject4 instanceof aDQ))
      localaDQ = (aDQ)paramObject4;
    else if ((paramObject1 instanceof bEg)) {
      localaDQ = ((bEg)paramObject1).bHs();
    }

    if (localaDQ == null) {
      throw new aIh("Utilisation du critère IsAchievementComplete hors d'un contexte d'achievement");
    }
    if (localaDQ.mb(this.aPh)) {
      return localaDQ.md(this.aPh) ? 0 : -1;
    }
    throw new aIh("Utilisation du critère IsAchievementComplete sur un achievement d'id inexistant id=" + this.aPh);
  }

  public Enum gm()
  {
    return Bz.bzV;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chv;
    aAG.add(arrayOfPq);
  }
}