import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class Ln extends akN
{
  private static final ArrayList ayr = new ArrayList();
  private boolean bXV;
  private int hY;
  private int hZ;

  public Ln(ArrayList paramArrayList)
  {
    u(paramArrayList);
    this.bXV = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");
    this.hY = ((int)((aOw)paramArrayList.get(1)).b(null, null, null, null));
    this.hZ = ((int)((aOw)paramArrayList.get(2)).b(null, null, null, null));
  }

  protected List kM()
  {
    return ayr;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    cYk localcYk1 = aAw.d(this.bXV, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localcYk1 == null)
      return -1;
    cYk localcYk2 = aAw.d(!this.bXV, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localcYk2 == null) {
      return -1;
    }
    dbE localdbE = aAw.ah(paramObject4);
    if (localdbE == null) {
      return -1;
    }
    CG localCG = localcYk1.aa(localcYk2);
    if (localCG == null) {
      return -1;
    }
    int i = localCG.hY * this.hY - localCG.hZ * this.hZ;
    int j = localCG.hZ * this.hY + localCG.hY * this.hZ;

    cYk localcYk3 = new cYk(localcYk1);
    localcYk3.add(i, j);

    if (!localdbE.LB().aq(localcYk3.getX(), localcYk3.getY())) {
      return -1;
    }
    Collection localCollection = localdbE.LC().bbj();
    for (Object localObject = localCollection.iterator(); ((Iterator)localObject).hasNext(); ) { cjK localcjK = (cjK)((Iterator)localObject).next();
      if ((localcjK.ML().bg(localcYk3)) && 
        (localcjK.aeH())) {
        return -1;
      }
    }
    localObject = localdbE.LB().au(localcYk3.getX(), localcYk3.getY());
    if (localObject != null) {
      return -1;
    }
    return 0;
  }

  public Enum gm()
  {
    return Bz.bCS;
  }

  static
  {
    ayr.add(new Pq[] { Pq.chu, Pq.chv, Pq.chv });
  }
}