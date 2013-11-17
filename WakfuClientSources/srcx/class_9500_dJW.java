import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class dJW extends akN
{
  private static ArrayList aAG = new ArrayList();
  private final boolean aMu;
  private final aOw dsO;
  private final aOw ddu;
  private final bBB cYJ;

  protected List kM()
  {
    return aAG;
  }

  public dJW(ArrayList paramArrayList) {
    u(paramArrayList);
    u(paramArrayList);
    this.aMu = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");
    this.dsO = ((aOw)paramArrayList.get(1));
    this.cYJ = ((bBB)paramArrayList.get(2));
    this.ddu = ((aOw)paramArrayList.get(3));
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
    boolean bool = this.cYJ.i(paramObject1, paramObject2, paramObject3, paramObject4);
    long l1 = this.dsO.b(paramObject1, paramObject2, paramObject3, paramObject4);
    long l2 = this.ddu.b(paramObject1, paramObject2, paramObject3, paramObject4);

    if ((localObject1 instanceof cSG)) {
      localObject2 = ((cSG)localObject1).clB();
      if (localObject2 == null)
        return -1;
      if (((cjK)localObject2).clt() != l1)
        return -1;
      if ((bool) && (localdle2 != localdle1))
        return -1;
      if (!(localObject2 instanceof axQ))
        return -1;
      if (!((axQ)localObject2).du(l2))
        return -1;
      return 0;
    }
    Object localObject3;
    if (localObject1 == null)
    {
      for (localObject2 = ((dbE)paramObject4).LC().bbj().iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (cjK)((Iterator)localObject2).next();
        if ((((cjK)localObject3).clt() == l1) && 
          ((!bool) || (aAw.ai(localObject3) == localdle1)) && 
          ((localObject3 instanceof axQ)))
        {
          if (((axQ)localObject3).du(l2))
            return 0;
        } }
      return -1;
    }

    Object localObject2 = aAw.ah(paramObject4);
    if (((paramObject2 instanceof cYk)) && (localObject2 != null)) {
      for (localObject3 = ((dbE)localObject2).LC().bbj().iterator(); ((Iterator)localObject3).hasNext(); ) { cjK localcjK = (cjK)((Iterator)localObject3).next();
        cYk localcYk = (cYk)paramObject2;
        if ((localcjK.clt() == l1) && 
          ((!bool) || (aAw.ai(localcjK) == localdle1)) && 
          (localcjK.B(localcYk)) && 
          ((localcjK instanceof axQ)))
        {
          if (((axQ)localcjK).du(l2))
            return 0;
        } }
      return -1;
    }
    return -2;
  }

  public Enum gm()
  {
    return Bz.byx;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[4];
    arrayOfPq[0] = Pq.chu;
    arrayOfPq[1] = Pq.chv;
    arrayOfPq[2] = Pq.chw;
    arrayOfPq[3] = Pq.chv;
    aAG.add(arrayOfPq);
  }
}