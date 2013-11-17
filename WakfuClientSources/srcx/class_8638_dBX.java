import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

abstract class dBX extends AbstractSet
  implements Iterable, Set
{
  private dBX(akR paramakR)
  {
  }

  public abstract Iterator iterator();

  public abstract boolean removeElement(Object paramObject);

  public abstract boolean az(Object paramObject);

  public boolean contains(Object paramObject)
  {
    return az(paramObject);
  }

  public boolean remove(Object paramObject) {
    return removeElement(paramObject);
  }

  public boolean containsAll(Collection paramCollection) {
    for (Iterator localIterator = paramCollection.iterator(); localIterator.hasNext(); ) {
      if (!contains(localIterator.next())) {
        return false;
      }
    }
    return true;
  }

  public void clear() {
    this.cVT.clear();
  }

  public boolean add(Object paramObject) {
    throw new UnsupportedOperationException();
  }

  public int size() {
    return this.cVT.size();
  }

  public Object[] toArray() {
    Object[] arrayOfObject = new Object[size()];
    Iterator localIterator = iterator();
    for (int i = 0; localIterator.hasNext(); i++)
      arrayOfObject[i] = localIterator.next();
    return arrayOfObject;
  }

  public Object[] toArray(Object[] paramArrayOfObject) {
    int i = size();
    if (paramArrayOfObject.length < i) {
      paramArrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), i);
    }
    Iterator localIterator = iterator();
    Object[] arrayOfObject = paramArrayOfObject;
    for (int j = 0; j < i; j++) {
      arrayOfObject[j] = localIterator.next();
    }

    if (paramArrayOfObject.length > i) {
      paramArrayOfObject[i] = null;
    }

    return paramArrayOfObject;
  }

  public boolean isEmpty() {
    return this.cVT.isEmpty();
  }

  public boolean addAll(Collection paramCollection) {
    throw new UnsupportedOperationException();
  }

  public boolean retainAll(Collection paramCollection) {
    boolean bool = false;
    Iterator localIterator = iterator();
    while (localIterator.hasNext()) {
      if (!paramCollection.contains(localIterator.next())) {
        localIterator.remove();
        bool = true;
      }
    }
    return bool;
  }
}