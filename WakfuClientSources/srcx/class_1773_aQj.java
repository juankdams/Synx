import java.util.ArrayList;
import java.util.List;

public final class aQj extends akN
{
  private static final ArrayList aAG = new ArrayList();

  public aQj(ArrayList paramArrayList)
  {
    u(paramArrayList);
  }

  protected List kM() {
    return aAG;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if ((paramObject1 == null) || (!(paramObject1 instanceof dhJ))) {
      throw new aIh("On essaie d'avoir une info sur une cible invalide " + paramObject1);
    }
    dhJ localdhJ1 = aAw.e(paramObject1, paramObject2, paramObject4, paramObject3);
    dhJ localdhJ2 = null;
    if ((paramObject2 instanceof dhJ)) {
      localdhJ2 = (dhJ)localdhJ1;
    }
    if (localdhJ2 == null) {
      return -1;
    }
    if (localdhJ2.cJf().HW()) {
      return 0;
    }
    return -1;
  }

  public Enum gm() {
    return Bz.bBd;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[0];
    aAG.add(arrayOfPq);
  }
}