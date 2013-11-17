import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bsW extends cIX
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

  public bsW(ArrayList paramArrayList) {
    J(paramArrayList);
    this.brd = ((aOw)paramArrayList.get(0));
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    long l = 0L;

    if ((paramObject4 != null) && ((paramObject4 instanceof dbE))) {
      if (!(paramObject1 instanceof dHW)) {
        throw new aIh("On essaie de compter les éléments interactifs à portée d'autre chose qu'un BasicFighter");
      }
      dbE localdbE = (dbE)paramObject4;
      dHW localdHW = (dHW)paramObject1;

      Iterator localIterator = localdbE.bgV();
      while (localIterator.hasNext()) {
        dle localdle = (dle)localIterator.next();
        if ((localdle != localdHW) && (localdle != null) && (localdle.aLY() == 10))
        {
          int i = cqJ.c(localdle, localdHW);
          if (i <= this.brd.b(paramObject1, paramObject2, paramObject3, paramObject4))
            l += 1L;
        }
      }
    }
    return super.cDu() * l;
  }

  public Enum gm() {
    return Bz.bzo;
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