public abstract class cQd
  implements XF
{
  private boolean kBc = false;

  public boolean ajF() {
    return this.kBc;
  }

  public void iF(boolean paramBoolean) {
    this.kBc = paramBoolean;
  }

  public void d(aYQ paramaYQ) {
    this.kBc = paramaYQ.bnT();
    k(paramaYQ);
  }

  public void b(dSw paramdSw) {
    paramdSw.lu(this.kBc);
    e(paramdSw);
  }

  public boolean isValid() {
    if (this.kBc) {
      return !aOX();
    }
    return aOX();
  }

  public String toString() {
    String str = aOY();
    if (this.kBc) {
      str = "[NON] " + str;
    }

    return str;
  }

  public abstract XF ajE();

  protected abstract boolean aOX();

  protected abstract void k(aYQ paramaYQ);

  protected abstract void e(dSw paramdSw);

  protected abstract String aOY();
}