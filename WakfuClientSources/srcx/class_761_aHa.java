import java.util.ArrayList;
import java.util.List;

public final class aHa extends cIX
{
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public aHa(ArrayList paramArrayList) {
    J(paramArrayList);
  }

  public boolean pH() {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if (paramObject3 == null)
      return 0L;
    if (!(paramObject3 instanceof aVc))
      throw new aIh("Le critère d'effet est employé pour autre chose qu'un effet");
    dle localdle = ((aVc)paramObject3).bkf();
    if ((localdle == null) || (!(localdle instanceof axQ)))
      return 0L;
    return ((axQ)localdle).aJq();
  }

  public Enum gm() {
    return Bz.bCp;
  }

  static
  {
    aAG.add(new Pq[0]);
  }
}