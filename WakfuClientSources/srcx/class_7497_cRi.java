abstract class cRi extends pV
{
  private dCA hyW;

  public void a(Wj paramWj)
  {
    this.hyW = dCA.a(paramWj, gl(), "blason", "blason_bg");
  }

  public void b(Wj paramWj)
  {
    if (this.hyW != null) {
      this.hyW.chv();
      this.hyW = null;
    }
  }

  protected abstract long gl();
}