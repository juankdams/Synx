import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class drd extends cIX
{
  private static final List aWC = Collections.singletonList(Pq.chC);

  protected List kM()
  {
    return aWC;
  }

  public drd(ArrayList paramArrayList) {
    J(paramArrayList);
  }

  public drd()
  {
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    dhJ localdhJ;
    if (paramObject1 == null) {
      if ((paramObject3 instanceof apn))
        localdhJ = ((apn)paramObject3).aBv();
      else
        throw new aIh("on cherche l'équipement d'un user null"); 
    } else { if (!(paramObject1 instanceof dhJ)) {
        throw new aIh("on cherche l'équipement d'autre chose qu'un character");
      }
      localdhJ = (dhJ)paramObject1;
    }
    cKT localcKT = localdhJ.bHr();
    cHu localcHu = localcKT.cEg();
    long l = 0L;
    while (localcHu.hasNext()) {
      localcHu.fl();
      cRs localcRs = (cRs)localcHu.value();
      l += localcRs.cFy() - localcRs.size();
    }
    return l;
  }

  public boolean pH()
  {
    return true;
  }

  public Enum gm()
  {
    return Bz.bxK;
  }
}