import java.util.ArrayList;
import java.util.List;

public final class bum extends cIX
{
  private static ArrayList aAG = new ArrayList();

  public bum()
  {
  }

  public bum(ArrayList paramArrayList)
  {
    J(paramArrayList);
  }

  protected List kM()
  {
    return aAG;
  }

  public Enum gm() {
    return Bz.bBa;
  }

  public boolean pH() {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    axQ localaxQ = aAw.f(paramObject1, paramObject2, paramObject3, paramObject4);

    if (!(localaxQ instanceof bWy)) {
      throw new aIh("Impossible de récupérer la cible du critère");
    }
    bWy localbWy = (bWy)localaxQ;
    return localbWy.bSD().nU();
  }

  static
  {
    aAG.add(new Pq[0]);
  }
}