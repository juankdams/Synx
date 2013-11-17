import java.util.ArrayList;
import java.util.List;

public final class acr extends akN
{
  private static final ArrayList ayr = new ArrayList();
  private static final int cSf = 0;
  private short aSi;

  public acr(ArrayList paramArrayList)
  {
    int i = u(paramArrayList);
    this.aSi = 0;
    if (i == 1)
      this.aSi = ((short)(int)((aOw)paramArrayList.get(0)).b(null, null, null, null));
  }

  protected List kM()
  {
    return ayr;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if ((paramObject1 == null) || (!(paramObject1 instanceof axQ))) {
      throw new aIh("on essaie de savoir si la cible est une invoc d'un user invalide " + paramObject1);
    }
    axQ localaxQ = aAw.b(true, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localaxQ == null) {
      return -1;
    }
    if (this.aSi != 0) {
      bhh localbhh = localaxQ.aJp();
      if (localbhh == null)
        return -1;
      if (localbhh.uO() != this.aSi) {
        return -1;
      }
    }
    if ((localaxQ.aJr()) && (localaxQ.aJq() == ((axQ)paramObject1).getId())) {
      return 0;
    }
    return -1;
  }

  public Enum gm()
  {
    return Bz.bxQ;
  }

  static
  {
    ayr.add(zT.buX);
    ayr.add(zT.bva);
  }
}