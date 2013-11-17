import java.util.Iterator;

public final class bMm
  implements cmN, Iterator
{
  private Iterator gPG;

  public static Iterator d(Iterator paramIterator)
  {
    if (paramIterator == null) {
      throw new IllegalArgumentException("Iterator must not be null");
    }
    if ((paramIterator instanceof Iterator)) {
      return paramIterator;
    }
    return new bMm(paramIterator);
  }

  private bMm(Iterator paramIterator)
  {
    this.gPG = paramIterator;
  }

  public boolean hasNext()
  {
    return this.gPG.hasNext();
  }

  public Object next() {
    return this.gPG.next();
  }

  public void remove() {
    throw new UnsupportedOperationException("remove() is not supported");
  }
}