public abstract class bJS extends cCH
  implements bTZ
{
  private cGF gLK;

  protected bJS(cGF paramcGF)
  {
    a(this);
    this.gLK = paramcGF;
  }

  protected bJS(cGF paramcGF, int paramInt) {
    super(paramInt);
    a(this);
    this.gLK = paramcGF;
  }

  public cGF bRA() {
    return this.gLK;
  }

  public void a(cGF paramcGF) {
    this.gLK = paramcGF;
  }
}