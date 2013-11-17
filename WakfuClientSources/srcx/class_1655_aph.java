import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

abstract class aph extends cIX
{
  private static ArrayList aAG = new ArrayList();
  aOw brd;
  aOw dva;
  boolean aMu;
  bBB dvb;
  bBB dvc;

  protected List kM()
  {
    return aAG;
  }

  aph() {
  }

  aph(ArrayList paramArrayList) {
    J(paramArrayList);
    if (paramArrayList.size() == 1) {
      this.brd = ((aOw)paramArrayList.get(0));
    } else if (paramArrayList.size() == 2) {
      this.brd = ((aOw)paramArrayList.get(0));
      this.aMu = ((cic)paramArrayList.get(1)).getValue().equalsIgnoreCase("target");
    } else if (paramArrayList.size() == 3) {
      this.dva = ((aOw)paramArrayList.get(0));
      this.brd = ((aOw)paramArrayList.get(1));
      this.aMu = ((cic)paramArrayList.get(2)).getValue().equalsIgnoreCase("target");
    } else if (paramArrayList.size() == 4) {
      this.dva = ((aOw)paramArrayList.get(0));
      this.brd = ((aOw)paramArrayList.get(1));
      this.aMu = ((cic)paramArrayList.get(2)).getValue().equalsIgnoreCase("target");
      this.dvb = ((bBB)paramArrayList.get(3));
    } else if (paramArrayList.size() == 5) {
      this.dva = ((aOw)paramArrayList.get(0));
      this.brd = ((aOw)paramArrayList.get(1));
      this.aMu = ((cic)paramArrayList.get(2)).getValue().equalsIgnoreCase("target");
      this.dvb = ((bBB)paramArrayList.get(3));
      this.dvc = ((bBB)paramArrayList.get(4));
    }
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if (paramObject4 == null) {
      throw new aIh("Pas de contexte...");
    }
    dbE localdbE = aAw.i(paramObject1, paramObject4);
    if (localdbE == null) {
      throw new aIh("Impossible de récupérer le combat");
    }
    d(paramObject1, paramObject2, paramObject4, paramObject3);
    axQ localaxQ1 = aAw.b(false, paramObject1, paramObject2, paramObject4, paramObject3);

    cYk localcYk1 = null;
    axQ localaxQ2 = null;

    if (!this.aMu) {
      if (localaxQ1 != null)
        localcYk1 = localaxQ1.ML();
    }
    else if ((paramObject2 instanceof cYk)) {
      localcYk1 = (cYk)paramObject2;
    } else {
      localaxQ2 = aAw.b(true, paramObject1, paramObject2, paramObject4, paramObject3);
      if (localaxQ2 != null) {
        localcYk1 = localaxQ2.ML();
      }
    }

    if (localcYk1 == null) {
      return 0L;
    }
    Collection localCollection = a(localdbE, localaxQ1);

    Iterator localIterator1 = localCollection.iterator();
    while (localIterator1.hasNext()) {
      dle localdle1 = (dle)localIterator1.next();
      if (localdle1.c(cfY.hBO)) {
        localIterator1.remove();
      }
    }
    long l1 = this.brd.b(paramObject1, paramObject2, paramObject3, paramObject4);
    if (l1 <= 0L) {
      return super.cDu() * localCollection.size();
    }
    long l2 = this.dva == null ? 0L : this.dva.b(paramObject1, paramObject2, paramObject3, paramObject4);

    int i = (this.dvb != null) && (this.dvb.i(paramObject1, paramObject2, paramObject3, paramObject4)) ? 1 : 0;
    int j = (this.dvc != null) && (this.dvc.i(paramObject1, paramObject2, paramObject3, paramObject4)) ? 1 : 0;

    long l3 = 0L;
    for (dle localdle2 : localCollection)
    {
      int k;
      if (localaxQ2 != null)
        k = cqJ.c(localdle2, localaxQ2);
      else
        k = cqJ.c(localdle2, localcYk1);
      if ((k <= l1) && (k >= l2)) {
        cYk localcYk2 = localdle2.ML();
        if ((i == 0) || (localcYk1.getX() == localcYk2.getX()) || (localcYk1.getY() == localcYk2.getY()))
        {
          if (j != 0) {
            if (!(paramObject4 instanceof aPH)) {
              throw new aIh("On essaye de tester une LoS dans un contexte qui n'est pas un combat");
            }UG localUG = ((aPH)paramObject4).LB();

            bcy localbcy = bcy.bqD();
            localbcy.a(localUG);
            localbcy.F(localcYk1.getX(), localcYk1.getY(), localcYk1.IB());
            localbcy.G(localcYk2.getX(), localcYk2.getY(), localcYk2.IB());

            if (!localbcy.bqG()); } else { l3 += 1L; }
        }
      }
    }
    return super.cDu() * l3;
  }

  protected void d(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
  }

  protected abstract Collection a(dbE paramdbE, axQ paramaxQ);

  public boolean pH() {
    return true;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[0];
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[] { Pq.chv };
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[] { Pq.chv, Pq.chu };
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[] { Pq.chv, Pq.chv, Pq.chu };
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[] { Pq.chv, Pq.chv, Pq.chu, Pq.chw };
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[] { Pq.chv, Pq.chv, Pq.chu, Pq.chw, Pq.chw };
    aAG.add(arrayOfPq);
  }
}