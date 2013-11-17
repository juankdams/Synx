import java.util.ArrayList;
import java.util.List;

public class nP extends akN
{
  private static final ArrayList aAG = new ArrayList();

  public nP(ArrayList paramArrayList)
  {
    u(paramArrayList);
  }

  protected List kM() {
    return aAG;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if (paramObject1 == null)
      throw new aIh("On cherche les summons d'un user null");
    if (!(paramObject1 instanceof ajF))
      throw new aIh("On cherche les summons d'un user qui n'a pas de symbiote");
    NQ localNQ = ((ajF)paramObject1).awq();
    if (localNQ == null)
      throw new aIh("On cherche les summons d'un user qui n'a pas de symbiote");
    int i = localNQ.aaa();
    int k;
    for (int j = 0; j < i; k = (byte)(j + 1)) {
      if (localNQ.an(j))
        return 0;
    }
    return -2;
  }

  public Enum gm() {
    return Bz.bAT;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[0];
    aAG.add(arrayOfPq);
  }
}