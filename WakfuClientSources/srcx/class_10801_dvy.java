import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class dvy extends dWf
{
  private static final cWh aGJ = new cWh(new ec[] { new bpq("Empty", new dou[0]) });
  public static final aBW aGK = new cqA();

  private dvy(long paramLong, int paramInt1, int paramInt2, boolean paramBoolean, Iterable paramIterable)
  {
    super(paramLong, paramInt1, paramInt2, paramBoolean, paramIterable);
  }

  public void b(List paramList)
  {
  }

  public cQY pt()
  {
    return cQY.kCP;
  }

  public boolean a(En paramEn)
  {
    if (paramEn.MZ() != dTw.mpS) {
      return false;
    }

    dhJ localdhJ = (dhJ)paramEn.bDq();
    if (localdhJ == paramEn.Nb()) {
      return false;
    }

    aYr localaYr = ((dhJ)paramEn.bDq()).cQs();
    if (localdhJ == paramEn.Na()) {
      localObject1 = paramEn.Nb().cJf();
      if (((cvY)localObject1).UI() == localaYr)
        return false;
      if (!((cvY)localObject1).HL()) {
        return true;
      }
    }

    Object localObject1 = paramEn.Nc();
    for (Iterator localIterator = ((Collection)localObject1).iterator(); localIterator.hasNext(); ) { Object localObject2 = localIterator.next();
      cTK localcTK = (cTK)localObject2;
      cvY localcvY = localcTK.cJf();
      if (localcvY.UI() != localaYr)
      {
        if (!localcvY.HL())
          return true;
      } }
    return false;
  }
}