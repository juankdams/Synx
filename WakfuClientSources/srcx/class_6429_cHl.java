import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

class cHl
  implements Iterator
{
  int iCl = 0;
  private final Iterator iCm;

  public cHl(cGk paramcGk, Iterator paramIterator)
  {
    this.iCm = paramIterator;
  }

  public boolean hasNext() {
    synchronized (cGk.a(this.iCn))
    {
      if (cGk.a(this.iCn).size() > this.iCl) {
        return true;
      }

      if (!this.iCm.hasNext()) {
        return false;
      }

      bFe localbFe = (bFe)this.iCm.next();
      cGk.a(this.iCn).add(localbFe);
    }
    return true;
  }

  public bFe Ef()
  {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    synchronized (cGk.a(this.iCn))
    {
      return (bFe)cGk.a(this.iCn).get(this.iCl++);
    }
  }

  public void remove() {
    throw new UnsupportedOperationException();
  }
}