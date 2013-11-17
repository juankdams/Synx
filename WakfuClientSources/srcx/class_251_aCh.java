import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class aCh extends cIX
{
  private static final List aWC = Collections.singletonList(Pq.chC);

  protected List kM()
  {
    return aWC;
  }

  public aCh(ArrayList paramArrayList) {
    J(paramArrayList);
  }

  public boolean pH()
  {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if (paramObject1 == null)
      return 0L;
    if (!(paramObject1 instanceof dle))
      throw new aIh("Le critère d'effet est employé pour autre chose qu'un effet");
    return ((dle)paramObject1).getId();
  }

  public Enum gm()
  {
    return Bz.bys;
  }
}