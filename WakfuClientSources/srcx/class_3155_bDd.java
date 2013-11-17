import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class bDd extends cIX
{
  private static final List aWC = new ArrayList();

  protected List kM()
  {
    return Collections.unmodifiableList(aWC);
  }

  public boolean pH()
  {
    return true;
  }

  public bDd(List paramList) {
    J(paramList);
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if ((paramObject1 instanceof bHJ)) {
      dsl localdsl = ((bHJ)paramObject1).bPn();
      return localdsl.bDx();
    }
    return -1L;
  }

  public Enum gm()
  {
    return Bz.bDf;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[0];
    aWC.add(arrayOfPq);
  }
}