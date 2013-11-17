import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

public class bnS
  implements Serializable, Collection
{
  private static final long serialVersionUID = 2412805092710877986L;
  protected final Collection dNw;
  protected final Object lock;

  public static Collection p(Collection paramCollection)
  {
    return new bnS(paramCollection);
  }

  protected bnS(Collection paramCollection)
  {
    if (paramCollection == null) {
      throw new IllegalArgumentException("Collection must not be null");
    }
    this.dNw = paramCollection;
    this.lock = this;
  }

  protected bnS(Collection paramCollection, Object paramObject)
  {
    if (paramCollection == null) {
      throw new IllegalArgumentException("Collection must not be null");
    }
    this.dNw = paramCollection;
    this.lock = paramObject;
  }

  public boolean add(Object paramObject)
  {
    synchronized (this.lock) {
      return this.dNw.add(paramObject);
    }
  }

  public boolean addAll(Collection paramCollection) {
    synchronized (this.lock) {
      return this.dNw.addAll(paramCollection);
    }
  }

  public void clear() {
    synchronized (this.lock) {
      this.dNw.clear();
    }
  }

  public boolean contains(Object paramObject) {
    synchronized (this.lock) {
      return this.dNw.contains(paramObject);
    }
  }

  public boolean containsAll(Collection paramCollection) {
    synchronized (this.lock) {
      return this.dNw.containsAll(paramCollection);
    }
  }

  public boolean isEmpty() {
    synchronized (this.lock) {
      return this.dNw.isEmpty();
    }
  }

  public Iterator iterator()
  {
    return this.dNw.iterator();
  }

  public Object[] toArray() {
    synchronized (this.lock) {
      return this.dNw.toArray();
    }
  }

  public Object[] toArray(Object[] paramArrayOfObject) {
    synchronized (this.lock) {
      return this.dNw.toArray(paramArrayOfObject);
    }
  }

  public boolean remove(Object paramObject) {
    synchronized (this.lock) {
      return this.dNw.remove(paramObject);
    }
  }

  public boolean removeAll(Collection paramCollection) {
    synchronized (this.lock) {
      return this.dNw.removeAll(paramCollection);
    }
  }

  public boolean retainAll(Collection paramCollection) {
    synchronized (this.lock) {
      return this.dNw.retainAll(paramCollection);
    }
  }

  public int size() {
    synchronized (this.lock) {
      return this.dNw.size();
    }
  }

  public boolean equals(Object paramObject) {
    synchronized (this.lock) {
      if (paramObject == this) {
        return true;
      }
      return this.dNw.equals(paramObject);
    }
  }

  public int hashCode() {
    synchronized (this.lock) {
      return this.dNw.hashCode();
    }
  }

  public String toString() {
    synchronized (this.lock) {
      return this.dNw.toString();
    }
  }
}