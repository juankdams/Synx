import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

class ayM
  implements Iterator
{
  private final long[] dPR = apl.b(this.dPS).aBb();
  private int index = 0;

  ayM(apl paramapl) {  } 
  public boolean hasNext() { return this.index < this.dPR.length; }

  public pq aKS()
  {
    if (!hasNext())
      throw new NoSuchElementException();
    pq localpq = (pq)apl.c(this.dPS).get(this.dPR[(this.index++)]);
    if (localpq == null)
      throw new ConcurrentModificationException();
    return localpq;
  }

  public void remove() {
    throw new UnsupportedOperationException();
  }
}