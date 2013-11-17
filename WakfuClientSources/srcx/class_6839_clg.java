import java.util.Iterator;
import java.util.NoSuchElementException;

class clg
  implements Iterator
{
  private Iterator hMQ;
  private boolean cLT;

  clg(dDP paramdDP, Iterable paramIterable)
  {
    this.hMQ = paramIterable.iterator();
  }

  public boolean hasNext()
  {
    boolean bool = (!this.cLT) && (this.hMQ.hasNext());
    if (!bool)
      this.hMR.lMw = null;
    return bool;
  }

  public Object next() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    return this.hMQ.next();
  }

  public void remove() {
    if (this.hMQ != null)
      this.hMQ.remove();
  }

  public void stop() {
    this.cLT = true;
    this.hMQ = null;
  }
}