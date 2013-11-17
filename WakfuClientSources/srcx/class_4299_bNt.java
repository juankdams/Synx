import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

class bNt
  implements Iterator
{
  private final long[] dPR = Wr.a(this.gSc).aBb();
  private int index = 0;

  bNt(Wr paramWr) {  } 
  public boolean hasNext() { return this.index < this.dPR.length; }

  public aKw bVd()
  {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    aKw localaKw = (aKw)Wr.a(this.gSc).get(this.dPR[(this.index++)]);
    if (localaKw == null) {
      throw new ConcurrentModificationException();
    }
    return localaKw;
  }

  public void remove() {
    throw new UnsupportedOperationException();
  }
}