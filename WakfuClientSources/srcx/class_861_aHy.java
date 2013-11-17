import java.util.ListIterator;

class aHy extends dKS
{
  protected aHy(ListIterator paramListIterator)
  {
    super(paramListIterator);
  }
  public void remove() {
    throw new UnsupportedOperationException("List is fixed size");
  }
  public void add(Object paramObject) {
    throw new UnsupportedOperationException("List is fixed size");
  }
}