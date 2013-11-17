import java.util.ArrayList;
import java.util.List;

public class zr extends akN
{
  private int btQ;
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public zr()
  {
  }

  public zr(ArrayList paramArrayList) {
    int i = (short)u(paramArrayList);
    if (i == 0)
      this.btQ = ((int)((aOw)paramArrayList.get(0)).b(null, null, null, null));
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
      throw new aIh("Utilisation du critère IsAchievementObjectiveComplete hors d'un contexte d'achievement");
    }
    if (localaDQ.lZ(this.btQ)) {
      return localaDQ.ma(this.btQ) ? 0 : -1;
    }
    ajv localajv = localaDQ.mh(this.btQ);
    if (localajv == null) {
      throw new aIh("Récupération d'un objectif d'achievement inconnu id=" + this.btQ);
    }
    int i = localajv.avv().getId();
    if (localaDQ.mb(i)) {
      return localaDQ.md(i) ? 0 : -1;
    }
    return -1;
  }

  public Enum gm()
  {
    return Bz.bzU;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chv;
    aAG.add(arrayOfPq);
  }
}