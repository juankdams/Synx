import java.util.Iterator;
import java.util.NoSuchElementException;

final class dnI
  implements Iterator
{
  public boolean hasNext()
  {
    return false;
  }

  public dIN cVs() {
    throw new NoSuchElementException();
  }

  public void remove() {
    throw new UnsupportedOperationException();
  }
}