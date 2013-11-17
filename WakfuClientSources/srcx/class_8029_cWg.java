import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class cWg extends cIX
{
  private static final List aWC = Collections.singletonList(Pq.chC);

  protected List kM()
  {
    return aWC;
  }

  public cWg(ArrayList paramArrayList) {
    J(paramArrayList);
  }

  public boolean pH()
  {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if ((paramObject1 == null) || (!(paramObject1 instanceof axQ))) {
      return -1L;
    }
    boolean bool1 = paramObject4 instanceof dbE;
    boolean bool2 = paramObject4 instanceof dMC;
    if ((!bool1) && (!bool2))
      throw new aIh("On essaie de compter récupérer la distance avec une balise en dehors d'un combat...");
    dbE localdbE;
    if (bool1)
      localdbE = (dbE)paramObject4;
    else {
      localdbE = ((dMC)paramObject4).dps();
    }

    axQ localaxQ = (axQ)paramObject1;
    int i = localaxQ.Fx();
    cYk localcYk;
    if ((paramObject2 instanceof cDW)) {
      localObject = (cDW)paramObject2;
      localcYk = new cYk(((cDW)localObject).fa(), ((cDW)localObject).fb(), ((cDW)localObject).fc());
    } else if ((paramObject2 instanceof cYk)) {
      localcYk = (cYk)paramObject2;
    } else {
      return -1L;
    }

    Object localObject = localdbE.bbj();

    int j = 32767;

    for (cjK localcjK : (Collection)localObject)
    {
      if ((localcjK.getType() == xj.bpl.xj()) && 
        (localcjK.Fx() == i))
      {
        int k = cqJ.c(localcjK, localcYk);

        if (k < j)
          j = k; 
      }
    }
    return j;
  }

  public Enum gm()
  {
    return Bz.byB;
  }
}