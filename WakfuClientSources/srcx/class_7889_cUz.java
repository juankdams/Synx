public class cUz
  implements Comparable
{
  private int gfd;
  private short bdn;
  private boolean gfe;
  private static cUz kHf = new cUz(0, (short)-1, false);

  public cUz(int paramInt, short paramShort, boolean paramBoolean) {
    this.gfe = paramBoolean;
    this.gfd = paramInt;
    this.bdn = paramShort;
  }

  public static cUz cJL() {
    return kHf;
  }

  public int a(cUz paramcUz)
  {
    if (this == paramcUz)
      return 0;
    if (paramcUz == null) {
      return -1;
    }
    int i = Integer.signum(this.bdn - paramcUz.bdn);
    if (i != 0) {
      return i;
    }
    int j = Integer.signum(this.gfd - paramcUz.gfd);
    if (j != 0) {
      return j;
    }
    return (this.gfe ? 1 : 0) - (paramcUz.gfe ? 1 : 0);
  }
}