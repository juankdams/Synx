import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

public class cPl extends cIX
{
  private static final List aWC = Collections.singletonList(Pq.chC);

  protected List kM()
  {
    return aWC;
  }

  public cPl(ArrayList paramArrayList) {
    J(paramArrayList);
  }

  public boolean pH()
  {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if (!(paramObject1 instanceof alr)) {
      K.error("Le critère d'effet est employé pour autre chose qu'un targetFinder.Target : " + paramObject1 + " - " + paramObject2 + " - " + paramObject3 + " - " + paramObject4);

      return 0L;
    }

    if (paramObject1 == null)
      return 0L;
    return ((alr)paramObject1).getId();
  }

  public Enum gm()
  {
    return Bz.byr;
  }
}