import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class iy
  implements zz
{
  private final List aIj = new ArrayList();

  public static zz qn() {
    return new iy();
  }

  public void a(dpI paramdpI)
  {
    if (paramdpI == null)
      return;
    this.aIj.add(paramdpI);
  }

  public List qo() {
    return Collections.unmodifiableList(this.aIj);
  }

  public dpI aE(int paramInt) {
    for (int i = 0; i < this.aIj.size(); i++) {
      dpI localdpI = (dpI)this.aIj.get(i);
      if (localdpI.yR() == paramInt)
        return localdpI;
    }
    return null;
  }

  public int a(dpI paramdpI, boolean paramBoolean) {
    return this.aIj.indexOf(paramdpI);
  }

  public void a(Comparator paramComparator)
  {
    Collections.sort(this.aIj, paramComparator);
  }
}