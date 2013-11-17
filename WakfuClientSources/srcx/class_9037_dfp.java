import java.util.ArrayList;
import java.util.List;

public final class dfp extends akN
{
  private static final ArrayList aAG = new ArrayList();

  public dfp(ArrayList paramArrayList)
  {
    u(paramArrayList);
  }

  protected List kM() {
    return aAG;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if ((paramObject1 == null) || (!(paramObject1 instanceof axQ))) {
      throw new aIh("on essaie de savoir si la cible est une invoc d'un user invalide " + paramObject1);
    }
    List localList = aAw.c(true, paramObject1, paramObject2, paramObject4, paramObject3);
    int i = 0; for (int j = localList.size(); i < j; i++) {
      axQ localaxQ = (axQ)localList.get(i);

      if (localaxQ != null)
      {
        if (localaxQ.getId() == ((axQ)paramObject1).aJq())
          return 0;
      }
    }
    return -1;
  }

  public Enum gm() {
    return Bz.bCs;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[0];
    aAG.add(arrayOfPq);
  }
}