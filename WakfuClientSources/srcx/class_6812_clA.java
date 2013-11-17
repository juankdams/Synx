public class clA
{
  private int hNt;
  private bCo hNu;
  private final boolean hNv;

  public clA()
  {
    this(false);
  }

  public clA(boolean paramBoolean) {
    this.hNv = paramBoolean;
  }

  public boolean isMainWindow() {
    return this.hNv;
  }

  public int cmW() {
    return this.hNt;
  }

  public void vJ(int paramInt) {
    this.hNt = paramInt;
  }

  public bCo cmX() {
    return this.hNu;
  }

  public void a(bCo parambCo) {
    this.hNu = parambCo;
  }
}