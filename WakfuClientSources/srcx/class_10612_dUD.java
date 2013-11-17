import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class dUD extends akN
{
  private static ArrayList aAG = new ArrayList();
  private final long kTb;
  private boolean aMu = true;

  protected List kM()
  {
    return aAG;
  }

  public dUD(ArrayList paramArrayList) {
    u(paramArrayList);
    this.kTb = ((aOw)paramArrayList.get(0)).b(null, null, null, null);
    if (paramArrayList.size() == 2) {
      String str = ((cic)paramArrayList.get(1)).getValue();
      if (str.equalsIgnoreCase("caster"))
        this.aMu = false;
    } else {
      this.aMu = true;
    }
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    dle localdle1 = aAw.ai(paramObject1);
    dle localdle2 = aAw.ai(paramObject2);
    if (paramObject1 == null)
      return -1;
    Object localObject1;
    if (this.aMu)
      localObject1 = paramObject2;
    else {
      localObject1 = paramObject1;
    }
    if ((localObject1 instanceof cSG)) {
      localObject2 = ((cSG)localObject1).clB();
      if (localObject2 == null)
        return -1;
      if ((((cjK)localObject2).clt() == this.kTb) && (localdle2 == localdle1))
        return 0;
      return -1;
    }
    Object localObject3;
    if (localObject1 == null)
    {
      for (localObject2 = ((dbE)paramObject4).LC().bbj().iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (cjK)((Iterator)localObject2).next();
        if ((((cjK)localObject3).clt() == this.kTb) && (aAw.ai(localObject3) == localdle1)) {
          return 0;
        }
      }
      return -1;
    }

    Object localObject2 = aAw.ah(paramObject4);
    if (((paramObject2 instanceof cYk)) && (localObject2 != null)) {
      for (localObject3 = ((dbE)localObject2).LC().bbj().iterator(); ((Iterator)localObject3).hasNext(); ) { cjK localcjK = (cjK)((Iterator)localObject3).next();
        cYk localcYk = (cYk)paramObject2;
        if ((localcjK.clt() == this.kTb) && (localcjK.P(localcYk.getX(), localcYk.getY(), localcYk.IB())) && (aAw.ai(localcjK) == localdle1))
        {
          return 0;
        }
      }
      return -1;
    }
    return -2;
  }

  public Enum gm()
  {
    return Bz.bBo;
  }

  static
  {
    aAG.add(new Pq[] { Pq.chv });
    aAG.add(new Pq[] { Pq.chv, Pq.chu });
  }
}