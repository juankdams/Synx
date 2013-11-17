import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class aUb
{
  public static final String cBn = "MRU";
  private final HashSet eUD = new HashSet();
  private final LinkedList eUE = new LinkedList();
  private final ArrayList aBf = new ArrayList();

  public void hh(String paramString) {
    this.eUD.add(paramString);
  }

  public void hi(String paramString) {
    this.eUD.remove(paramString);
  }

  public void hj(String paramString) {
    hi(paramString);
    this.eUE.remove(paramString);
  }

  public void a(auP paramauP) {
    if (paramauP != null)
      this.aBf.add(paramauP);
  }

  public void b(auP paramauP)
  {
    if (paramauP != null)
      this.aBf.remove(paramauP);
  }

  public void y(String paramString, boolean paramBoolean)
  {
    if ((paramString != null) && (!this.eUE.contains(paramString))) {
      this.eUE.addFirst(paramString);
    }
    bjp();
  }

  private void bjp() {
    ArrayList localArrayList = new ArrayList(this.eUE.size());
    Iterator localIterator = bsP.getInstance().getLayeredContainer().getAllWidgetIterator();
    while (localIterator.hasNext()) {
      dOc localdOc = (dOc)localIterator.next();
      if (localdOc.getElementMap() != null)
      {
        String str = localdOc.getElementMap().getId();
        if (this.eUE.contains(str)) {
          localArrayList.add(str);
        }
      }
    }
    this.eUE.clear();
    this.eUE.addAll(localArrayList);
  }

  public int size() {
    return this.eUE.size();
  }

  public int bjq() {
    int i = this.eUE.size() - 1;
    for (int j = i; j >= 0; j--) {
      String str = (String)this.eUE.remove(j);
      if (str != null)
      {
        if (cBQ.cxL().mZ(str))
        {
          int k = 0;
          for (int m = this.aBf.size() - 1; m >= 0; m--) {
            int n = ((auP)this.aBf.get(m)).x(str);
            switch (n) {
            case 0:
              break;
            case 3:
              k = 1;
              this.eUE.addLast(str);
              break;
            default:
              this.eUE.addFirst(str);
              return n;
            }

          }

          if ((k == 0) && (!hk(str))) {
            cBQ.cxL().mW(str);
            return 0;
          }
        }
      }
    }
    return 1;
  }

  public boolean hk(String paramString)
  {
    return (paramString.startsWith("MRU")) || (this.eUD.contains(paramString));
  }
}