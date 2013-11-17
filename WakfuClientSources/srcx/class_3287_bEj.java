import java.util.ConcurrentModificationException;

abstract class bEj extends PI
{
  protected final doX gzA;

  public bEj(doX paramdoX)
  {
    super(paramdoX);
    this.gzA = paramdoX;
  }

  protected final int nextIndex()
  {
    if (this.cil != this.gzA.size()) {
      throw new ConcurrentModificationException();
    }

    byte[] arrayOfByte = this.gzA.lpp;
    int i = this._index;
    while ((i-- > 0) && (arrayOfByte[i] != 1));
    return i;
  }
}