import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class cZK extends akN
{
  private static final List aWC = Collections.singletonList(Pq.chC);

  protected List kM()
  {
    return aWC;
  }

  public cZK(ArrayList paramArrayList) {
    int i = (short)u(paramArrayList);
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    dhJ localdhJ = aAw.e(paramObject1, paramObject2, paramObject3, paramObject4);
    if (!(localdhJ instanceof bWy)) {
      return -1;
    }

    bWy localbWy = (bWy)localdhJ;
    return localbWy.bSD().CD() == 0L ? -1 : 0;
  }

  public Enum gm()
  {
    return Bz.bDw;
  }
}