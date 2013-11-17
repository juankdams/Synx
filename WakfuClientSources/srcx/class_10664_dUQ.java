import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class dUQ extends cIX
{
  private static final ArrayList aAG = new ArrayList();
  boolean aMu;
  private final aOw cYI;
  private final aOw dva;
  private final aOw brd;
  private final boolean msU;

  protected List kM()
  {
    return aAG;
  }

  public boolean pH()
  {
    return true;
  }

  public dUQ(ArrayList paramArrayList) {
    J(paramArrayList);

    this.aMu = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");
    this.cYI = ((aOw)paramArrayList.get(1));
    this.dva = ((aOw)paramArrayList.get(2));
    this.brd = ((aOw)paramArrayList.get(3));
    if (paramArrayList.size() >= 5)
      this.msU = ((bZA)paramArrayList.get(4)).i(null, null, null, null);
    else
      this.msU = false;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if (paramObject4 == null) {
      throw new aIh("Pas de contexte...");
    }
    boolean bool1 = paramObject4 instanceof dbE;
    boolean bool2 = paramObject4 instanceof dMC;
    if ((!bool1) && (!bool2))
      throw new aIh("On essaie de compter les fighters en dehors d'un combat...");
    dbE localdbE;
    if (bool1)
      localdbE = (dbE)paramObject4;
    else {
      localdbE = ((dMC)paramObject4).dps();
    }

    axQ localaxQ1 = aAw.b(false, paramObject1, paramObject2, paramObject4, paramObject3);

    cYk localcYk = null;
    if (!this.aMu) {
      if (localaxQ1 != null)
        localcYk = localaxQ1.ML();
    }
    else if ((paramObject2 instanceof cYk)) {
      localcYk = (cYk)paramObject2;
    } else {
      axQ localaxQ2 = aAw.b(true, paramObject1, paramObject2, paramObject4, paramObject3);
      if (localaxQ2 != null) {
        localcYk = localaxQ2.ML();
      }
    }

    if (localcYk == null) {
      return 0L;
    }
    long l1 = 0L;

    long l2 = this.cYI.b(paramObject1, paramObject2, paramObject3, paramObject4);
    long l3 = this.dva.b(paramObject1, paramObject2, paramObject3, paramObject4);
    long l4 = this.brd.b(paramObject1, paramObject2, paramObject3, paramObject4);

    Iterator localIterator = localdbE.LC().bbj().iterator();
    while (localIterator.hasNext()) {
      cjK localcjK = (cjK)localIterator.next();
      if ((localcjK != localaxQ1) && (localcjK != null) && (!a(l2, localcjK)) && (
        (!this.msU) || (localcjK.axG() == localaxQ1)))
      {
        int i = cqJ.c(localcjK, localcYk);
        if ((l4 < 0L) || ((i <= l4) && (i >= l3)))
          l1 += 1L;
      }
    }
    return super.cDu() * l1;
  }

  protected boolean a(long paramLong, cjK paramcjK) {
    return paramcjK.getType() != paramLong;
  }

  public Enum gm()
  {
    return Bz.bBV;
  }

  static
  {
    aAG.add(new Pq[] { Pq.chu, Pq.chv, Pq.chv, Pq.chv });
    aAG.add(new Pq[] { Pq.chu, Pq.chv, Pq.chv, Pq.chv, Pq.chw });
  }
}