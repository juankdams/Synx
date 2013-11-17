import java.util.ConcurrentModificationException;

public class cmp extends PI
{
  private final bKB hRi;

  public cmp(bKB parambKB)
  {
    super(parambKB);
    this.hRi = parambKB;
  }

  protected final int nextIndex()
  {
    if (this.cil != this.cik.size()) {
      throw new ConcurrentModificationException();
    }

    Object[] arrayOfObject = this.hRi.iuG;
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
    return this.hRi.iuG[this._index];
  }

  public float zZ()
  {
    return this.hRi.gBL[this._index];
  }

  public float H(float paramFloat)
  {
    float f = zZ();
    this.hRi.gBL[this._index] = paramFloat;
    return f;
  }
}