import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class cEI extends akN
{
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public cEI(ArrayList paramArrayList) {
    u(paramArrayList);
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if (paramObject2 == null) {
      return 0;
    }
    if ((paramObject1 == null) || (!(paramObject1 instanceof axQ))) {
      return -1;
    }
    axQ localaxQ = (axQ)paramObject1;
    if ((paramObject2 instanceof axQ)) {
      if (localaxQ.Fx() == ((axQ)paramObject2).Fx()) {
        return -1;
      }
      return 0;
    }

    if (((paramObject2 instanceof cYk)) && ((paramObject4 instanceof dbE))) {
      dbE localdbE = (dbE)paramObject4;
      cYk localcYk = (cYk)paramObject2;
      Collection localCollection = localdbE.cd(localaxQ.Fx());
      for (dhJ localdhJ : localCollection) {
        if (localcYk.equals(localdhJ.ML()))
          return 0;
      }
      return -1;
    }
    return -2;
  }

  public Enum gm() {
    return Bz.bxy;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[0];
    aAG.add(arrayOfPq);
  }
}