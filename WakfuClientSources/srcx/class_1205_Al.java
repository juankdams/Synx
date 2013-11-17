import java.util.ArrayList;
import java.util.List;

public class Al extends akN
{
  private static final ArrayList aAG = new ArrayList();
  private final boolean bvJ;
  private final boolean aXA;

  protected List kM()
  {
    return aAG;
  }

  public Al(ArrayList paramArrayList) {
    u(paramArrayList);
    if (paramArrayList.isEmpty()) {
      this.bvJ = false;
      this.aXA = true;
    } else if (paramArrayList.size() == 1) {
      this.bvJ = ((bBB)paramArrayList.get(0)).i(null, null, null, null);
      this.aXA = true;
    } else {
      this.bvJ = ((bBB)paramArrayList.get(0)).i(null, null, null, null);
      this.aXA = ((bBB)paramArrayList.get(1)).i(null, null, null, null);
    }
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    axQ localaxQ = aAw.b(this.aXA, paramObject1, paramObject2, paramObject4, paramObject3);

    if (localaxQ == null) {
      return -1;
    }
    if (!(paramObject1 instanceof dhJ)) {
      return -1;
    }
    dbE localdbE = null;

    if ((paramObject4 instanceof dbE))
      localdbE = (dbE)paramObject4;
    else if ((paramObject4 instanceof dMC)) {
      localdbE = ((dMC)paramObject4).dps();
    }
    if (localdbE == null) {
      return -1;
    }
    cYk localcYk = null;

    if ((localaxQ instanceof dhJ))
      localcYk = ((dhJ)localaxQ).aKb();
    else if ((localaxQ instanceof cYk)) {
      localcYk = (cYk)localaxQ;
    }
    if (localcYk != null) {
      UG localUG = localdbE.LB();
      if (a(localUG, localcYk.getX() + 1, localcYk.getY(), this.bvJ))
        return 0;
      if (a(localUG, localcYk.getX() - 1, localcYk.getY(), this.bvJ))
        return 0;
      if (a(localUG, localcYk.getX(), localcYk.getY() + 1, this.bvJ))
        return 0;
      if (a(localUG, localcYk.getX(), localcYk.getY() - 1, this.bvJ))
        return 0;
      return -1;
    }
    return -2;
  }

  private boolean a(UG paramUG, int paramInt1, int paramInt2, boolean paramBoolean) {
    if (paramUG.au(paramInt1, paramInt2) != null)
      return false;
    if (paramBoolean) {
      return paramUG.aq(paramInt1, paramInt2);
    }
    return paramUG.am(paramInt1, paramInt2);
  }

  public Enum gm()
  {
    return Bz.bAJ;
  }

  static
  {
    aAG.add(zT.buX);
    aAG.add(zT.buZ);
    aAG.add(new Pq[] { Pq.chw, Pq.chw });
  }
}