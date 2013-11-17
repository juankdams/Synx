import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class bHv extends dWf
{
  private static final cWh aGJ = new cWh(new ec[] { new bpq("Nothing", new dou[0]) });

  public static final aBW aGK = new bRw();

  private bHv(long paramLong, int paramInt1, int paramInt2, boolean paramBoolean, Iterable paramIterable)
  {
    super(paramLong, paramInt1, paramInt2, paramBoolean, paramIterable);
  }

  public void b(List paramList)
  {
  }

  public cQY pt()
  {
    return cQY.kCQ;
  }

  public boolean a(bkt parambkt)
  {
    if (parambkt.MZ() != dTw.mpS)
      return false;
    Collection localCollection = parambkt.bvq();
    for (Iterator localIterator = localCollection.iterator(); localIterator.hasNext(); ) { Object localObject = localIterator.next();
      cTK localcTK = (cTK)localObject;
      if (localcTK.cJf().HL())
        return true;
    }
    return false;
  }
}