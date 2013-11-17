import java.util.Iterator;
import java.util.NoSuchElementException;

final class bOa
  implements Iterator
{
  public bFe Ef()
  {
    throw new NoSuchElementException();
  }
  public boolean hasNext() {
    return false;
  }
  public void remove() {
    throw new UnsupportedOperationException();
  }
}