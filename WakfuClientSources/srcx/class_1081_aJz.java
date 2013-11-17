import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class aJz extends awD
  implements cCs
{
  private static final long serialVersionUID = -2218010673611160319L;

  public static List u(List paramList)
  {
    return new aJz(paramList);
  }

  protected aJz(List paramList)
  {
    super(paramList);
  }

  public boolean add(Object paramObject)
  {
    throw new UnsupportedOperationException("List is fixed size");
  }

  public void add(int paramInt, Object paramObject) {
    throw new UnsupportedOperationException("List is fixed size");
  }

  public boolean addAll(Collection paramCollection) {
    throw new UnsupportedOperationException("List is fixed size");
  }

  public boolean addAll(int paramInt, Collection paramCollection) {
    throw new UnsupportedOperationException("List is fixed size");
  }

  public void clear() {
    throw new UnsupportedOperationException("List is fixed size");
  }

  public Object get(int paramInt) {
    return getList().get(paramInt);
  }

  public int indexOf(Object paramObject) {
    return getList().indexOf(paramObject);
  }

  public Iterator iterator() {
    return bMm.d(getCollection().iterator());
  }

  public int lastIndexOf(Object paramObject) {
    return getList().lastIndexOf(paramObject);
  }

  public ListIterator listIterator() {
    return new aHy(getList().listIterator(0));
  }

  public ListIterator listIterator(int paramInt) {
    return new aHy(getList().listIterator(paramInt));
  }

  public Object remove(int paramInt) {
    throw new UnsupportedOperationException("List is fixed size");
  }

  public boolean remove(Object paramObject) {
    throw new UnsupportedOperationException("List is fixed size");
  }

  public boolean removeAll(Collection paramCollection) {
    throw new UnsupportedOperationException("List is fixed size");
  }

  public boolean retainAll(Collection paramCollection) {
    throw new UnsupportedOperationException("List is fixed size");
  }

  public Object set(int paramInt, Object paramObject) {
    return getList().set(paramInt, paramObject);
  }

  public List subList(int paramInt1, int paramInt2) {
    List localList = getList().subList(paramInt1, paramInt2);
    return new aJz(localList);
  }

  public boolean isFull()
  {
    return true;
  }

  public int bbf() {
    return size();
  }
}