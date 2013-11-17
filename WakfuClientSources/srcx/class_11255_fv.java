import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class fv
  implements cSS
{
  private final int aCx;
  private final ArrayList aCy;

  public fv(int paramInt, Set paramSet)
  {
    this.aCx = paramInt;
    this.aCy = new ArrayList(paramSet.size());
    Iterator localIterator = paramSet.iterator();

    while (localIterator.hasNext()) {
      iK localiK = new iK();
      localiK.a((vL)localIterator.next());
      this.aCy.add(localiK);
    }

    Collections.sort(this.aCy);
  }

  public int mw() {
    return this.aCx;
  }

  public Object getContent() {
    return this.aCy;
  }
}