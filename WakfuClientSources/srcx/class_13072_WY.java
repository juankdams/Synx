import java.util.Comparator;
import java.util.Vector;

class WY
  implements Comparator
{
  final Comparator cGV;
  final int cGW;

  private WY(Comparator paramComparator, boolean paramBoolean)
  {
    this.cGV = paramComparator;
    this.cGW = (paramBoolean ? 1 : -1);
  }

  public int compare(Object paramObject1, Object paramObject2) {
    if (paramObject1 == paramObject2)
      return 0;
    if (paramObject1 == null)
      return -1 * this.cGW;
    if (paramObject2 == null)
      return 1 * this.cGW;
    if ((!(paramObject1 instanceof Vector)) || (!(paramObject2 instanceof Vector)))
      return 0;
    Vector localVector1 = (Vector)paramObject1;
    Vector localVector2 = (Vector)paramObject2;
    if (localVector1.size() < 1)
      return 1 * this.cGW;
    if (localVector2.size() < 1)
      return -1 * this.cGW;
    return this.cGV.compare(localVector1.get(0), localVector2.get(0)) * this.cGW;
  }
}