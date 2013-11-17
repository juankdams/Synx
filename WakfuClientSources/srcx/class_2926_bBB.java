public class bBB extends bZA
{
  public static final bBB gus = new bBB(true);
  public static final bBB gut = new bBB(false);
  private final boolean bHf;

  public boolean sc()
  {
    return true;
  }

  public bBB(boolean paramBoolean) {
    this.bHf = paramBoolean;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if (this.bHf) {
      return 0;
    }
    return -1;
  }

  public Enum gm() {
    return apd.duG;
  }
}