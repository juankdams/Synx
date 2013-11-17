public class cJn
  implements adr, Comparable
{
  public static final int hnG = 0;
  public static final int hnH = 1;
  public static final int BACK = 2;
  public static final int hnI = 3;
  private int aw;

  cJn(int paramInt)
  {
    this.aw = paramInt;
  }

  public int aps() {
    return this.aw;
  }

  public int a(cJn paramcJn) {
    if (paramcJn.aw == this.aw) {
      return 0;
    }
    if (this.aw == 2) {
      return -1;
    }
    if (((this.aw == 1) || (this.aw == 3)) && 
      (paramcJn.aw != 2)) {
      return -1;
    }
    return 1;
  }
}