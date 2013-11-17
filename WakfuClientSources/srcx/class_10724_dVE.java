import java.util.ArrayList;
import java.util.List;

public class dVE extends cTd
{
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public dVE(ArrayList paramArrayList) {
    u(paramArrayList);
  }

  public boolean pH() {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    aZK localaZK;
    if ((paramObject1 instanceof aZK))
      localaZK = (aZK)paramObject1;
    else if ((paramObject2 instanceof aZK))
      localaZK = (aZK)paramObject2;
    else if (((paramObject3 instanceof LA)) && ((((LA)paramObject3).Wc() instanceof aZK)))
      localaZK = (aZK)((LA)paramObject3).Wc();
    else {
      throw new aIh("On cherche la position dans un contexte sans ie");
    }
    return super.n(paramObject1, paramObject2, paramObject3, paramObject4) * aUG.y(localaZK.ML());
  }

  public double c(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    return Double.longBitsToDouble(aUG.y(((dhJ)paramObject1).ML()));
  }

  public Enum gm() {
    return Bz.byh;
  }

  static
  {
    aAG.add(new Pq[0]);
  }
}