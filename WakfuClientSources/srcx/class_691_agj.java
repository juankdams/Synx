import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class agj extends cTd
{
  private static final List aWC = Collections.singletonList(Pq.chC);

  protected List kM()
  {
    return aWC;
  }

  public agj(ArrayList paramArrayList) {
    u(paramArrayList);
  }

  public boolean pH()
  {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    dhJ localdhJ;
    if ((paramObject1 instanceof dhJ))
      localdhJ = (dhJ)paramObject1;
    else if ((paramObject2 instanceof dhJ))
      localdhJ = (dhJ)paramObject2;
    else if ((paramObject3 instanceof apn))
      localdhJ = ((apn)paramObject3).aBv();
    else
      localdhJ = aAw.a(false, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localdhJ == null) {
      throw new aIh("On cherche la position dans un contexte sans Personnage");
    }
    return super.n(paramObject1, paramObject2, paramObject3, paramObject4) * aUG.y(localdhJ.ML());
  }

  public double c(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    return Double.longBitsToDouble(aUG.y(((dhJ)paramObject1).ML()));
  }

  public Enum gm()
  {
    return Bz.byg;
  }
}