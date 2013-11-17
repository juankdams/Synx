import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public final class yw
  implements aEm, azw
{
  private static final Logger K = Logger.getLogger(yw.class);
  public static final int brX = 2;
  private final List brY = new ArrayList();
  private Zj brZ;
  private boolean bsa = false;

  public void a(awr paramawr) {
    b(paramawr);
  }

  void b(awr paramawr) {
    if (paramawr == null)
      return;
    if (this.brY.isEmpty()) {
      e(paramawr);
      return;
    }
    if (c(paramawr)) {
      return;
    }
    List localList = d(paramawr);
    if (localList == null)
      e(paramawr);
    else
      d(localList);
  }

  private void d(List paramList) {
    Iterator localIterator = this.brY.iterator();
    while (localIterator.hasNext()) {
      List localList = (List)localIterator.next();
      if (localList != paramList)
      {
        if (a(paramList, localList))
          localIterator.remove();
      }
    }
  }

  private boolean a(List paramList1, List paramList2) {
    for (Iterator localIterator1 = paramList2.iterator(); localIterator1.hasNext(); ) { localawr1 = (awr)localIterator1.next();
      for (awr localawr2 : paramList1)
        if (a(localawr2, localawr1)) {
          paramList1.addAll(paramList2);
          e(paramList1);
          return true;
        }
    }
    awr localawr1;
    return false;
  }

  public boolean c(awr paramawr) {
    for (List localList : this.brY) {
      if (localList.contains(paramawr))
        return true;
    }
    return false;
  }

  private List d(awr paramawr) {
    for (Iterator localIterator1 = this.brY.iterator(); localIterator1.hasNext(); ) { localList = (List)localIterator1.next();
      for (awr localawr : localList)
        if (a(paramawr, localawr)) {
          localList.add(paramawr);
          e(localList);
          return localList;
        }
    }
    List localList;
    return null;
  }

  boolean a(awr paramawr1, awr paramawr2)
  {
    if (paramawr1.axG() != paramawr2.axG())
      return false;
    if ((paramawr1.fa() != paramawr2.fa()) && (paramawr1.fb() != paramawr2.fb()))
    {
      return false;
    }if (paramawr1.ML().ac(paramawr2.ML()) > 2) {
      return false;
    }
    return true;
  }

  private void e(awr paramawr) {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramawr);
    this.brY.add(localArrayList);
  }

  public void f(awr paramawr) {
    g(paramawr);
    b(paramawr);
    Ho();
  }

  void g(awr paramawr) {
    Iterator localIterator = this.brY.iterator();
    Object localObject1 = null;
    while (localIterator.hasNext()) {
      localObject2 = (List)localIterator.next();
      if (((List)localObject2).contains(paramawr))
      {
        localObject1 = localObject2;
        e((List)localObject2);
        ((List)localObject2).remove(paramawr);
        localIterator.remove();
      }
    }
    if (localObject1 == null) {
      return;
    }
    for (Object localObject2 = localObject1.iterator(); ((Iterator)localObject2).hasNext(); ) { awr localawr = (awr)((Iterator)localObject2).next();
      b(localawr);
    }

    Ho();
  }

  private void e(List paramList) {
    if (paramList.size() >= 3)
      this.bsa = true;
  }

  public List Hn() {
    return this.brY;
  }

  public void h(awr paramawr) {
    b(paramawr);
    Ho();
  }

  public void i(awr paramawr) {
    g(paramawr);
    Ho();
  }

  public void a(Zj paramZj) {
    this.brZ = paramZj;
  }

  private void Ho() {
    try {
      if ((this.brZ != null) && (this.bsa))
        this.brZ.a(this);
    } catch (Exception localException) {
      K.error("Exception levee", localException);
    } finally {
      this.bsa = false;
    }
  }
}