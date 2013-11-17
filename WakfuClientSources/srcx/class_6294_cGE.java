import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class cGE extends cIX
{
  private static final List aWC = Collections.singletonList(Pq.chC);

  protected List kM()
  {
    return aWC;
  }

  public cGE(ArrayList paramArrayList) {
    J(paramArrayList);
  }

  public boolean pH()
  {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    cDW localcDW;
    Object localObject;
    if (((paramObject1 instanceof cDW)) && ((paramObject2 instanceof cDW))) {
      localcDW = (cDW)paramObject1;
      localObject = (cDW)paramObject2;
      return cqJ.c(localcDW, (cDW)localObject);
    }if (((paramObject1 instanceof cDW)) && ((paramObject2 instanceof cYk))) {
      localcDW = (cDW)paramObject1;
      localObject = (cYk)paramObject2;
      return cqJ.c(localcDW, (cYk)localObject);
    }
    return -1L;
  }

  public Enum gm()
  {
    return Bz.byA;
  }
}