public final class qX extends bNh
{
  private boolean aYH = true;

  public qX() {
    super(new bDx());
  }

  protected void a(gn paramgn)
  {
    if (this.aYH)
      paramgn.clear();
  }

  public void clear()
  {
    for (gn localgn : this.gRX) {
      localgn.clear();
    }
    super.clear();
  }

  public void Q(boolean paramBoolean) {
    this.aYH = paramBoolean;
  }
}