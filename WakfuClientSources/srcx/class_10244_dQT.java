import java.util.Enumeration;
import java.util.Iterator;

final class dQT
  implements Enumeration
{
  dQT(Iterator paramIterator)
  {
  }

  public boolean hasMoreElements()
  {
    return this.bNa.hasNext();
  }
  public Object nextElement() {
    return this.bNa.next();
  }
}