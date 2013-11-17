import java.util.ArrayList;
import java.util.List;

public final class ahp extends akN
{
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public ahp(ArrayList paramArrayList) {
    u(paramArrayList);
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if (!(paramObject3 instanceof aVc)) {
      throw new aIh("Le critère d'effet est employé pour autre chose qu'un effet");
    }

    dle localdle = ((aVc)paramObject3).bke();
    if (aAw.al(paramObject3) != localdle) {
      return -1;
    }

    return 0;
  }

  public Enum gm() {
    return Bz.bCv;
  }

  static
  {
    aAG.add(new Pq[0]);
  }
}