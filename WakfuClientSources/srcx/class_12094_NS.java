import java.util.ArrayList;
import java.util.List;

public final class NS extends cIX
{
  private static ArrayList aAG = new ArrayList();

  public NS(List paramList)
  {
    J(paramList);
  }

  protected ArrayList Vs()
  {
    return aAG;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    dle localdle = aAw.ak(paramObject3);
    if (localdle == null)
      return -1L;
    if (!(localdle instanceof dhJ))
      return -1L;
    return localdle.getId();
  }

  public boolean pH()
  {
    return true;
  }

  public Enum gm()
  {
    return Bz.bCK;
  }

  static
  {
    aAG.add(new Pq[0]);
  }
}