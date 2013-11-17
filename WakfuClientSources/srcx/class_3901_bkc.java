import java.util.ConcurrentModificationException;

public class bkc extends PI
{
  private final dxQ fAu;

  public bkc(dxQ paramdxQ)
  {
    super(paramdxQ);
    this.fAu = paramdxQ;
  }

  protected final int nextIndex()
  {
    if (this.cil != this.cik.size()) {
      throw new ConcurrentModificationException();
    }

    Object[] arrayOfObject = this.fAu.iuG;
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
    return this.fAu.iuG[this._index];
  }

  public long bid()
  {
    return this.fAu.eiO[this._index];
  }

  public long eD(long paramLong)
  {
    long l = bid();
    this.fAu.eiO[this._index] = paramLong;
    return l;
  }
}