import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ni extends cIX
{
  private static final List aWC = Collections.singletonList(Pq.chC);

  protected List kM()
  {
    return aWC;
  }

  public boolean pH()
  {
    return true;
  }

  public Ni(ArrayList paramArrayList)
  {
  }

  public Ni()
  {
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    dhJ localdhJ;
    if (paramObject1 == null) {
      if ((paramObject3 instanceof apn))
        localdhJ = ((apn)paramObject3).aBv();
      else
        throw new aIh("on cherche le nombre de kamas d'un user null"); 
    } else { if (!(paramObject1 instanceof dhJ)) {
        throw new aIh("on cherche le nombre de kamas d'autre chose qu'un character");
      }
      localdhJ = (dhJ)paramObject1;
    }
    return localdhJ.JE();
  }

  public Enum gm()
  {
    return Bz.byv;
  }
}