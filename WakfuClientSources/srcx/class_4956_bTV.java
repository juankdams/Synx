import java.util.ConcurrentModificationException;
import java.util.Iterator;

abstract class bTV extends PI
  implements Iterator
{
  private final cCi hfI;

  public bTV(cCi paramcCi)
  {
    super(paramcCi);
    this.hfI = paramcCi;
  }

  public Object next()
  {
    abv();
    return uc(this._index);
  }

  protected final int nextIndex()
  {
    if (this.cil != this.cik.size()) {
      throw new ConcurrentModificationException();
    }

    Object[] arrayOfObject = this.hfI.iuG;
    int i = this._index;
    while ((i-- > 0) && ((arrayOfObject[i] == cCi.iuJ) || (arrayOfObject[i] == cCi.iuI)));
    return i;
  }

  protected abstract Object uc(int paramInt);
}