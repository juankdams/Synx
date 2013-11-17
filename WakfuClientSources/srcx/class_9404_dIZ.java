import java.util.ConcurrentModificationException;

public class dIZ extends PI
{
  private final cYR lUD;

  public dIZ(cYR paramcYR)
  {
    super(paramcYR);
    this.lUD = paramcYR;
  }

  protected final int nextIndex()
  {
    if (this.cil != this.cik.size()) {
      throw new ConcurrentModificationException();
    }

    Object[] arrayOfObject = this.lUD.iuG;
    int i = this._index;
    while ((i-- > 0) && ((arrayOfObject[i] == null) || (arrayOfObject[i] == cCi.iuI) || (arrayOfObject[i] == cCi.iuJ)));
    return i;
  }

  public void fl()
  {
    abv();
  }

  public Object Ln()
  {
    return this.lUD.iuG[this._index];
  }

  public int value()
  {
    return this.lUD.bXB[this._index];
  }

  public int bf(int paramInt)
  {
    int i = value();
    this.lUD.bXB[this._index] = paramInt;
    return i;
  }
}