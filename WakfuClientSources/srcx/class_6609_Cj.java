import java.util.ConcurrentModificationException;

public class Cj extends PI
{
  private final bEw bEP;

  public Cj(bEw parambEw)
  {
    super(parambEw);
    this.bEP = parambEw;
  }

  protected final int nextIndex()
  {
    if (this.cil != this.cik.size()) {
      throw new ConcurrentModificationException();
    }

    Object[] arrayOfObject = this.bEP.iuG;
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
    return this.bEP.iuG[this._index];
  }

  public byte Gh()
  {
    return this.bEP.aZY[this._index];
  }

  public byte L(byte paramByte)
  {
    byte b = Gh();
    this.bEP.aZY[this._index] = paramByte;
    return b;
  }
}