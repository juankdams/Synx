import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class bsl extends awD
  implements cmN
{
  private static final long serialVersionUID = 6595182819922443652L;

  public static List u(List paramList)
  {
    if ((paramList instanceof cmN)) {
      return paramList;
    }
    return new bsl(paramList);
  }

  private bsl(List paramList)
  {
    super(paramList);
  }

  public Iterator iterator()
  {
    return bMm.d(getCollection().iterator());
  }

  public boolean add(Object paramObject) {
    throw new UnsupportedOperationException();
  }

  public boolean addAll(Collection paramCollection) {
    throw new UnsupportedOperationException();
  }

  public void clear() {
    throw new UnsupportedOperationException();
  }

  public boolean remove(Object paramObject) {
    throw new UnsupportedOperationException();
  }

  public boolean removeAll(Collection paramCollection) {
    throw new UnsupportedOperationException();
  }

  public boolean retainAll(Collection paramCollection) {
    throw new UnsupportedOperationException();
  }

  public ListIterator listIterator()
  {
    return cSn.c(getList().listIterator());
  }

  public ListIterator listIterator(int paramInt) {
    return cSn.c(getList().listIterator(paramInt));
  }

  public void add(int paramInt, Object paramObject) {
    throw new UnsupportedOperationException();
  }

  public boolean addAll(int paramInt, Collection paramCollection) {
    throw new UnsupportedOperationException();
  }

  public Object remove(int paramInt) {
    throw new UnsupportedOperationException();
  }

  public Object set(int paramInt, Object paramObject) {
    throw new UnsupportedOperationException();
  }

  public List subList(int paramInt1, int paramInt2) {
    List localList = getList().subList(paramInt1, paramInt2);
    return new bsl(localList);
  }
}