import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class crn extends cIX
{
  private static final ArrayList aAG;

  protected List kM()
  {
    return aAG;
  }

  public crn(ArrayList paramArrayList)
  {
  }

  public boolean pH()
  {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    axQ localaxQ = aAw.f(paramObject1, paramObject2, paramObject3, paramObject4);
    dbE localdbE = aAw.i(paramObject1, paramObject4);
    if (localdbE == null) {
      throw new aIh("Impossible de récupérer le combat");
    }

    if (!(localaxQ instanceof bWy)) {
      throw new aIh("Impossible de récupérer la cible du critère");
    }

    bWy localbWy1 = (bWy)localaxQ;
    long l = localbWy1.bSD().CD();
    if (l == 0L) {
      return 0L;
    }

    Collection localCollection = localdbE.ch(localaxQ.Fx());
    int i = -1;
    for (dhJ localdhJ : localCollection) {
      if ((localdhJ instanceof bWy)) {
        bWy localbWy2 = (bWy)localdhJ;
        if (localbWy2.bSD().CD() == l) {
          i++;
        }
      }
    }
    if ((!bB) && (i < 0)) throw new AssertionError();
    return i;
  }

  public Enum gm()
  {
    return Bz.bDx;
  }

  static
  {
    aAG = new ArrayList();

    aAG.add(new Pq[0]);
  }
}