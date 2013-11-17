import java.util.ListIterator;

public final class cSn
  implements cmN, ListIterator
{
  private ListIterator kED;

  public static ListIterator c(ListIterator paramListIterator)
  {
    if (paramListIterator == null) {
      throw new IllegalArgumentException("ListIterator must not be null");
    }
    if ((paramListIterator instanceof ListIterator)) {
      return paramListIterator;
    }
    return new cSn(paramListIterator);
  }

  private cSn(ListIterator paramListIterator)
  {
    this.kED = paramListIterator;
  }

  public boolean hasNext()
  {
    return this.kED.hasNext();
  }

  public Object next() {
    return this.kED.next();
  }

  public int nextIndex() {
    return this.kED.nextIndex();
  }

  public boolean hasPrevious() {
    return this.kED.hasPrevious();
  }

  public Object previous() {
    return this.kED.previous();
  }

  public int previousIndex() {
    return this.kED.previousIndex();
  }

  public void remove() {
    throw new UnsupportedOperationException("remove() is not supported");
  }

  public void set(Object paramObject) {
    throw new UnsupportedOperationException("set() is not supported");
  }

  public void add(Object paramObject) {
    throw new UnsupportedOperationException("add() is not supported");
  }
}