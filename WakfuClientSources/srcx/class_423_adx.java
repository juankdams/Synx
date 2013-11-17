public abstract class adx
  implements amB
{
  private static final int cTG = 15188;
  private final int aw;
  protected boolean cTH;
  protected boolean cTI;
  protected boolean cTJ;
  protected bZA aB;
  private boolean cTK;
  private boolean cTL;

  protected adx(int paramInt)
  {
    this.aw = paramInt;
  }

  public int getId() {
    return this.aw;
  }

  public boolean apu() {
    return this.cTL;
  }

  public void bO(boolean paramBoolean) {
    this.cTL = paramBoolean;
  }

  public void bP(boolean paramBoolean) {
    this.cTH = paramBoolean;
  }

  public boolean apv() {
    return this.cTH;
  }

  public void bQ(boolean paramBoolean) {
    this.cTI = paramBoolean;
  }

  public boolean apw() {
    return this.cTI;
  }

  public void a(bZA parambZA) {
    this.aB = parambZA;
  }

  public bZA F() {
    return this.aB;
  }

  public boolean hK(int paramInt) {
    return paramInt == 15188;
  }

  public boolean apx() {
    return this.cTJ;
  }

  public void bR(boolean paramBoolean) {
    this.cTJ = paramBoolean;
  }

  public boolean apy() {
    return this.cTK;
  }

  public void bS(boolean paramBoolean) {
    this.cTK = paramBoolean;
  }
}