import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class xZ extends cIX
{
  private static ArrayList aAG = new ArrayList();
  private aOw brd;

  protected List kM()
  {
    return aAG;
  }

  public boolean pH() {
    return true;
  }

  public xZ(ArrayList paramArrayList) {
    J(paramArrayList);
    this.brd = ((aOw)paramArrayList.get(0));
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    long l = 0L;

    if ((paramObject4 != null) && ((paramObject4 instanceof dbE))) {
      if (!(paramObject1 instanceof dHW)) {
        throw new aIh("On essaie de compter les walls à portée d'autre chose qu'un BasicFighter");
      }
      dbE localdbE = (dbE)paramObject4;
      dHW localdHW = (dHW)paramObject1;

      Iterator localIterator = localdbE.LC().bbj().iterator();
      while (localIterator.hasNext()) {
        cjK localcjK = (cjK)localIterator.next();
        if ((localcjK != localdHW) && (localcjK != null) && (localcjK.getType() == xj.bpq.xj()))
        {
          int i = cqJ.c(localcjK, localdHW);
          if (i <= this.brd.b(paramObject1, paramObject2, paramObject3, paramObject4))
            l += 1L;
        }
      }
    }
    return super.cDu() * l;
  }

  public Enum gm() {
    return Bz.bBu;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[0];
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chv;
    aAG.add(arrayOfPq);
  }
}