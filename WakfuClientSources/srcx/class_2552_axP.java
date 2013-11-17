import java.util.Iterator;

class axP
  implements Iterable, Iterator
{
  private final djj le;
  private final bEv dNg;
  private final int count;
  private int index = -1;
  private jJ dNh;

  axP(djj paramdjj, bEv parambEv)
  {
    this.le = paramdjj;
    this.dNg = parambEv;
    this.count = (parambEv != null ? paramdjj.e(parambEv) : 0);
  }

  public Iterator iterator()
  {
    return this;
  }

  public boolean hasNext()
  {
    if (this.dNh != null) {
      this.le.g(this.dNh);
      this.dNh = null;
    }
    return (this.dNg != null) && (this.index + 1 < this.count);
  }

  public jJ aJo()
  {
    this.dNh = this.le.b(this.dNg, ++this.index);
    return this.dNh;
  }

  public void remove()
  {
    throw new UnsupportedOperationException();
  }
}