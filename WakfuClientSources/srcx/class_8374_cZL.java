public class cZL
  implements Comparable
{
  public static final cZL kNw = new cZL(0, 0);
  public int kNx;
  public int kNy;

  public cZL()
  {
  }

  public cZL(int paramInt1, int paramInt2)
  {
    this.kNx = paramInt1;
    this.kNy = paramInt2;
  }

  public float cMw() {
    int i = this.kNx + this.kNy;
    if (i == 0)
      return 0.0F;
    return this.kNy / i;
  }

  public int compareTo(Object paramObject) {
    if (paramObject == null)
      return 1;
    if (paramObject == this)
      return 0;
    if (!(paramObject instanceof cZL))
      return 1;
    cZL localcZL = (cZL)paramObject;
    float f1 = cMw();
    float f2 = localcZL.cMw();
    if (f1 > f2)
      return 1;
    if (f1 < f2) {
      return -1;
    }
    return 0;
  }

  public boolean hasMark()
  {
    return false;
  }

  public int azp()
  {
    return -1;
  }

  public int azq()
  {
    return -1;
  }
}