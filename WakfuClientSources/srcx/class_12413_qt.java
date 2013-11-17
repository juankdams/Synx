import java.util.ArrayList;
import java.util.List;

public final class qt extends akN
{
  private static ArrayList aAG = new ArrayList();

  private boolean aXA = false;

  public qt(ArrayList paramArrayList)
  {
    u(paramArrayList);
    this.aXA = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");
  }

  protected List kM() {
    return aAG;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    axQ localaxQ = aAw.b(this.aXA, paramObject1, paramObject2, paramObject4, paramObject3);
    cYk localcYk = null;
    if (localaxQ != null) {
      localcYk = localaxQ.ML();
    }
    else if ((this.aXA) && ((paramObject2 instanceof cYk))) {
      localcYk = (cYk)paramObject2;
    }

    if (localcYk == null) {
      return -1;
    }
    dbE localdbE = aAw.ah(paramObject4);
    if (localdbE.LB().ap(localcYk.getX(), localcYk.getY())) {
      return 0;
    }
    return -1;
  }

  public Enum gm() {
    return Bz.bCi;
  }

  static
  {
    aAG.add(new Pq[] { Pq.chu });
  }
}