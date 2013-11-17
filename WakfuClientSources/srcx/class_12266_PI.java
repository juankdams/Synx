import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

abstract class PI
{
  protected final bGb cik;
  protected int cil;
  protected int _index;

  public PI(bGb parambGb)
  {
    this.cik = parambGb;
    this.cil = this.cik.size();
    this._index = this.cik.capacity();
  }

  public boolean hasNext()
  {
    return nextIndex() >= 0;
  }

  public void remove()
  {
    if (this.cil != this.cik.size()) {
      throw new ConcurrentModificationException();
    }

    try
    {
      this.cik.bOl();
      this.cik.aQ(this._index);
    }
    finally {
      this.cik.fY(false);
    }

    this.cil -= 1;
  }

  protected final void abv()
  {
    if ((this._index = nextIndex()) < 0)
      throw new NoSuchElementException();
  }

  protected abstract int nextIndex();
}