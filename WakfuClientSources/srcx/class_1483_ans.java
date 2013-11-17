import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public final class ans
{
  private static final Logger K = Logger.getLogger(ans.class);
  private final doA drb;

  public ans()
  {
    this.drb = null;
  }

  public ans(doA paramdoA) {
    this.drb = paramdoA;
  }

  public List a(dpI paramdpI, alr paramalr, cOE paramcOE, int paramInt1, int paramInt2, short paramShort) {
    if (paramcOE == null) {
      K.error("On ne peut pas determiner les cibles sans contexte");
      return Collections.emptyList();
    }

    HashMap localHashMap = new HashMap();
    ArrayList localArrayList = new ArrayList();

    for (Iterator localIterator1 = paramdpI.aui().eO().iterator(); localIterator1.hasNext(); ) { localObject1 = (bbH)localIterator1.next();
      localObject2 = dtf.cZk().a(paramalr, paramcOE.LE(), (bbH)localObject1, paramInt1, paramInt2, paramShort, paramdpI.atZ());

      for (dle localdle : (Iterable)localObject2) {
        if (a(paramdpI, localdle, paramalr))
        {
          if (!a(localHashMap, localdle)) {
            localHashMap.put(Long.valueOf(localdle.getId()), localdle);
            localArrayList.add(localdle);
          }
        }
      }
    }
    a(localArrayList, paramdpI, paramInt1, paramInt2, paramShort);

    byte b = paramdpI.ben();
    Object localObject1 = a(localArrayList, b);

    Object localObject2 = new ArrayList();
    ((ArrayList)localObject2).add(localObject1);
    return localObject2;
  }

  private void a(List paramList, dpI paramdpI, int paramInt1, int paramInt2, short paramShort) {
    Comparator localComparator = Zl.a(paramdpI, paramInt1, paramInt2, paramShort);
    if (localComparator == null)
      return;
    Collections.sort(paramList, localComparator);
  }

  private boolean a(HashMap paramHashMap, dle paramdle) {
    return paramHashMap.containsKey(Long.valueOf(paramdle.getId()));
  }

  private boolean a(dpI paramdpI, dle paramdle, alr paramalr) {
    if (!(paramdle instanceof aTa)) {
      return true;
    }

    if (paramalr == paramdle) {
      return true;
    }
    dRh localdRh = paramdpI.atZ();
    int i = (localdRh != null) && (localdRh.bt(8192L)) ? 1 : 0;

    aTa localaTa = (aTa)paramdle;
    if (i != 0) {
      return true;
    }

    return !localaTa.Vj();
  }

  private List a(List paramList, byte paramByte) {
    if (paramByte <= 0) {
      return paramList;
    }
    if (paramList.size() > paramByte) {
      return paramList.subList(0, paramByte);
    }
    return paramList;
  }
}