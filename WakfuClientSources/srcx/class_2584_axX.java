import java.util.Collection;
import java.util.Iterator;

public abstract class axX
  implements Collection
{
  protected Collection dNw;

  protected axX()
  {
  }

  protected axX(Collection paramCollection)
  {
    if (paramCollection == null) {
      throw new IllegalArgumentException("Collection must not be null");
    }
    this.dNw = paramCollection;
  }

  protected Collection getCollection()
  {
    return this.dNw;
  }

  public boolean add(Object paramObject)
  {
    return this.dNw.add(paramObject);
  }

  public boolean addAll(Collection paramCollection) {
    return this.dNw.addAll(paramCollection);
  }

  public void clear() {
    this.dNw.clear();
  }

  public boolean contains(Object paramObject) {
    return this.dNw.contains(paramObject);
  }

  public boolean isEmpty() {
    return this.dNw.isEmpty();
  }

  public Iterator iterator() {
    return this.dNw.iterator();
  }

  public boolean remove(Object paramObject) {
    return this.dNw.remove(paramObject);
  }

  public int size() {
    return this.dNw.size();
  }

  public Object[] toArray() {
    return this.dNw.toArray();
  }

  public Object[] toArray(Object[] paramArrayOfObject) {
    return this.dNw.toArray(paramArrayOfObject);
  }

  public boolean containsAll(Collection paramCollection) {
    return this.dNw.containsAll(paramCollection);
  }

  public boolean removeAll(Collection paramCollection) {
    return this.dNw.removeAll(paramCollection);
  }

  public boolean retainAll(Collection paramCollection) {
    return this.dNw.retainAll(paramCollection);
  }

  public boolean equals(Object paramObject) {
    if (paramObject == this) {
      return true;
    }
    return this.dNw.equals(paramObject);
  }

  public int hashCode() {
    return this.dNw.hashCode();
  }

  public String toString() {
    return this.dNw.toString();
  }
}