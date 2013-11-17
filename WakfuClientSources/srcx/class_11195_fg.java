public class fg
  implements Comparable
{
  private final dSR aCd;
  private apX aCe;

  public fg(dSR paramdSR, apX paramapX)
  {
    this.aCd = paramdSR;
    this.aCe = paramapX;
  }

  public dSR mf() {
    return this.aCd;
  }

  public apX mg() {
    return this.aCe;
  }

  public void a(apX paramapX) {
    this.aCe = paramapX;
  }

  public int compareTo(Object paramObject) {
    if ((paramObject instanceof fg)) {
      return mf().vp() - ((fg)paramObject).mf().vp();
    }
    return 0;
  }
}