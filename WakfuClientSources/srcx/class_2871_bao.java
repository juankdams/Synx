import java.util.Iterator;
import java.util.List;

public class bao
  implements Ce
{
  private List fii;

  public bao(List paramList)
  {
    if ((!bB) && ((paramList == null) || (paramList.contains(null)))) throw new AssertionError();
    this.fii = paramList;
  }

  public int nS() {
    return 0;
  }

  public long nT() {
    return 0L;
  }

  public Iterator iterator() {
    return this.fii.iterator();
  }
}