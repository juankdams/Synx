import java.util.Enumeration;
import java.util.Iterator;

final class dQP
  implements Iterator
{
  dQP(Enumeration paramEnumeration)
  {
  }

  public boolean hasNext()
  {
    return this.mlF.hasMoreElements();
  }
  public Object next() {
    return this.mlF.nextElement();
  }
  public void remove() {
    throw new UnsupportedOperationException();
  }
}