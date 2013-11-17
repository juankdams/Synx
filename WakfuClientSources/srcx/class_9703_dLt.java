import java.util.ArrayList;
import java.util.List;

public class dLt extends akN
{
  private static final ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public dLt(ArrayList paramArrayList) {
    u(paramArrayList);
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if ((paramObject1 == null) || (!(paramObject1 instanceof dhJ))) {
      throw new aIh("on test l'appartenance d'une balise à autre chose qu'un perso");
    }
    if ((paramObject2 instanceof aho)) {
      if (((aho)paramObject2).axG() != paramObject1)
        return 0;
      return -1;
    }
    if (((paramObject2 instanceof cYk)) && ((paramObject4 instanceof dbE))) {
      dbE localdbE = (dbE)paramObject4;
      cYk localcYk = (cYk)paramObject2;
      for (dle localdle : localdbE.k(localcYk)) {
        if ((localdle instanceof aho)) {
          if (((aho)localdle).axG() != paramObject1)
            return 0;
          return -1;
        }
      }
    }
    throw new aIh("on test l'appartenance d'autre chose qu'une balise");
  }

  public Enum gm() {
    return Bz.bxR;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[0];
    aAG.add(arrayOfPq);
  }
}