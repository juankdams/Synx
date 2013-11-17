import java.util.Enumeration;
import java.util.NoSuchElementException;

public final class dkH
  implements Enumeration
{
  public boolean hasMoreElements()
  {
    return false;
  }

  public Object nextElement()
  {
    throw new NoSuchElementException();
  }
}