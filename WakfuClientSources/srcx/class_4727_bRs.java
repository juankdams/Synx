import java.util.ArrayList;
import java.util.List;

public class bRs extends cIX
{
  private String hbd;
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public boolean pH() {
    return true;
  }

  public bRs()
  {
  }

  public bRs(ArrayList paramArrayList) {
    int i = (short)J(paramArrayList);
    if (i == 0)
      this.hbd = ((cic)paramArrayList.get(0)).getValue();
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    aDQ localaDQ = null;

    if ((paramObject4 instanceof aDQ))
      localaDQ = (aDQ)paramObject4;
    else if ((paramObject1 instanceof bEg)) {
      localaDQ = ((bEg)paramObject1).bHs();
    }

    if (localaDQ == null) {
      throw new aIh("Utilisation du critère GetAchievementVariable hors d'un contexte d'achievement");
    }
    aTX localaTX = localaDQ.gn(this.hbd);
    if (localaTX == null) {
      throw new aIh("Récupération d'une variable d'achievement de nom inconnu name=" + this.hbd);
    }
    return super.cDu() * localaDQ.mi(localaTX.getId());
  }

  public Enum gm() {
    return Bz.bzT;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chu;
    aAG.add(arrayOfPq);
  }
}