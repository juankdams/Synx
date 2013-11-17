import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class dQF extends dWf
{
  private static final cWh aGJ = new cWh(new ec[] { new bpq("Nothing", new dou[0]) });

  public static final aBW aGK = new ckw();

  private dQF(long paramLong, int paramInt1, int paramInt2, boolean paramBoolean, Iterable paramIterable)
  {
    super(paramLong, paramInt1, paramInt2, paramBoolean, paramIterable);
  }

  public void b(List paramList)
  {
  }

  public cQY pt()
  {
    return cQY.kCX;
  }

  public boolean a(En paramEn)
  {
    if (paramEn.MZ() != dTw.mpT) {
      return false;
    }

    dhJ localdhJ1 = (dhJ)paramEn.bDq();
    dhJ localdhJ2 = paramEn.Nb();
    if (localdhJ1 == localdhJ2) {
      return false;
    }

    Collection localCollection = paramEn.Nc();
    for (Iterator localIterator = localCollection.iterator(); localIterator.hasNext(); ) { Object localObject = localIterator.next();
      dHW localdHW = (dHW)localObject;
      if (localdHW.getType() == 1) {
        return true;
      }
    }
    return false;
  }
}