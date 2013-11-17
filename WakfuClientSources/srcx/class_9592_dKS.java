import java.util.ListIterator;

public class dKS
  implements ListIterator
{
  protected final ListIterator kED;

  public dKS(ListIterator paramListIterator)
  {
    if (paramListIterator == null) {
      throw new IllegalArgumentException("ListIterator must not be null");
    }
    this.kED = paramListIterator;
  }

  protected ListIterator djG()
  {
    return this.kED;
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
    this.kED.remove();
  }

  public void set(Object paramObject) {
    this.kED.set(paramObject);
  }

  public void add(Object paramObject) {
    this.kED.add(paramObject);
  }
}