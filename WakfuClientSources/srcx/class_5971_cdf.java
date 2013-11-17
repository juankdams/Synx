import java.util.ArrayList;
import java.util.Iterator;

public class cdf
{
  private final int aw;
  private final ArrayList hwr = new ArrayList();

  public cdf(int paramInt) {
    this.aw = paramInt;
  }

  public void a(cwR paramcwR) {
    if (!this.hwr.contains(paramcwR))
      this.hwr.add(paramcwR);
  }

  public cwR uN(int paramInt)
  {
    for (int i = 0; i < this.hwr.size(); i++) {
      cwR localcwR = (cwR)this.hwr.get(i);
      if (localcwR.getId() == paramInt)
        return localcwR;
    }
    return null;
  }

  public int cgc() {
    return this.hwr.size();
  }

  public Iterator cgd() {
    return this.hwr.iterator();
  }

  public int getId() {
    return this.aw;
  }
}