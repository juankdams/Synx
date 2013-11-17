import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class qG extends cIX
{
  private static final List aWC = new ArrayList();
  public static final Pq[] aXV = new Pq[0];

  public qG(ArrayList paramArrayList)
  {
  }

  protected List kM()
  {
    return Collections.unmodifiableList(aWC);
  }

  public boolean pH()
  {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    Object localObject = aAw.ah(paramObject4);
    if ((localObject == null) && (paramObject3 != null) && ((paramObject3 instanceof apn)))
      localObject = ((apn)paramObject3).aBv().afv();
    if (localObject == null)
      return 0L;
    return ((aPH)localObject).aEt().xH();
  }

  public Enum gm()
  {
    return Bz.bBM;
  }

  static
  {
    aWC.add(aXV);
  }
}