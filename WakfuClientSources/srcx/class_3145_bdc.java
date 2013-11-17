import java.util.ArrayList;
import java.util.List;

public class bdc extends akN
{
  private static final ArrayList aAG = new ArrayList();

  public bdc(ArrayList paramArrayList)
  {
    u(paramArrayList);
  }

  protected List kM() {
    return aAG;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if ((paramObject1 == null) || (paramObject2 == null) || (!(paramObject1 instanceof dhJ)) || (!(paramObject2 instanceof dle)))
      throw new aIh("On cherche les summons d'un user null");
    if (((dhJ)paramObject1).bW(((dle)paramObject2).getId()) != null) {
      return 0;
    }
    return -1;
  }

  public Enum gm() {
    return Bz.bzd;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[0];
    aAG.add(arrayOfPq);
  }
}