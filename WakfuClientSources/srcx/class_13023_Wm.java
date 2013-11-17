import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.Vector;

public final class Wm extends Vector
{
  private static final long serialVersionUID = 1L;
  private final HashSet cGl = new HashSet();

  public Wm() {
  }
  public Wm(int paramInt) { super(paramInt); }

  public Wm(int paramInt1, int paramInt2) {
    super(paramInt1, paramInt2);
  }

  public Wm(Collection paramCollection)
  {
    Iterator localIterator;
    if (paramCollection != null)
      for (localIterator = paramCollection.iterator(); localIterator.hasNext(); ) { Object localObject = localIterator.next();
        add(localObject);
      }
  }

  public synchronized boolean add(Object paramObject)
  {
    if (!this.cGl.contains(paramObject)) {
      d(size(), paramObject);
      return true;
    }
    return false;
  }

  public void add(int paramInt, Object paramObject)
  {
    d(paramInt, paramObject);
  }

  private synchronized void d(int paramInt, Object paramObject)
  {
    if (this.cGl.add(paramObject)) {
      int i = size();
      ensureCapacity(i + 1);
      if (paramInt != i) {
        System.arraycopy(this.elementData, paramInt, this.elementData, paramInt + 1, i - paramInt);
      }

      this.elementData[paramInt] = paramObject;
      this.elementCount += 1;
    }
  }

  public synchronized void addElement(Object paramObject) {
    d(size(), paramObject);
  }

  public synchronized boolean addAll(Collection paramCollection) {
    boolean bool = false;
    for (Iterator localIterator = paramCollection.iterator(); localIterator.hasNext(); ) { Object localObject = localIterator.next();
      bool |= add(localObject);
    }
    return bool;
  }

  public synchronized boolean addAll(int paramInt, Collection paramCollection)
  {
    boolean bool = false;
    for (Iterator localIterator = paramCollection.iterator(); localIterator.hasNext(); ) { Object localObject = localIterator.next();
      if (!this.cGl.contains(localObject)) {
        d(paramInt++, localObject);
        bool = true;
      }
    }
    return bool;
  }

  public synchronized void clear() {
    super.clear();
    this.cGl.clear();
  }

  public Object clone()
  {
    Wm localWm = (Wm)super.clone();
    localWm.cGl.addAll(this.cGl);
    return localWm;
  }

  public synchronized boolean contains(Object paramObject) {
    return this.cGl.contains(paramObject);
  }

  public synchronized boolean containsAll(Collection paramCollection) {
    return this.cGl.containsAll(paramCollection);
  }

  public void insertElementAt(Object paramObject, int paramInt) {
    d(paramInt, paramObject);
  }

  public synchronized Object remove(int paramInt) {
    Object localObject = get(paramInt);
    remove(localObject);
    return localObject;
  }

  public boolean remove(Object paramObject) {
    return P(paramObject);
  }

  private synchronized boolean P(Object paramObject)
  {
    if (this.cGl.remove(paramObject)) {
      int i = indexOf(paramObject);
      if (i < this.elementData.length - 1) {
        System.arraycopy(this.elementData, i + 1, this.elementData, i, this.elementData.length - i - 1);
      }

      this.elementCount -= 1;
      return true;
    }
    return false;
  }

  public synchronized boolean removeAll(Collection paramCollection) {
    boolean bool = false;
    for (Iterator localIterator = paramCollection.iterator(); localIterator.hasNext(); ) { Object localObject = localIterator.next();
      bool |= remove(localObject);
    }
    return bool;
  }

  public synchronized void removeAllElements() {
    this.cGl.clear();
    super.removeAllElements();
  }

  public boolean removeElement(Object paramObject) {
    return P(paramObject);
  }

  public synchronized void removeElementAt(int paramInt) {
    remove(get(paramInt));
  }

  public synchronized void removeRange(int paramInt1, int paramInt2) {
    while (paramInt2 > paramInt1)
      remove(--paramInt2);
  }

  public synchronized boolean retainAll(Collection paramCollection)
  {
    if (!(paramCollection instanceof Set)) {
      paramCollection = new HashSet(paramCollection);
    }
    LinkedList localLinkedList = new LinkedList();
    for (Iterator localIterator = iterator(); localIterator.hasNext(); ) { Object localObject = localIterator.next();
      if (!paramCollection.contains(localObject)) {
        localLinkedList.addLast(localObject);
      }
    }
    if (!localLinkedList.isEmpty()) {
      removeAll(localLinkedList);
      return true;
    }
    return false;
  }

  public synchronized Object set(int paramInt, Object paramObject) {
    Object localObject = get(paramInt);
    if (this.cGl.add(paramObject)) {
      this.elementData[paramInt] = paramObject;
      this.cGl.remove(localObject);
    } else {
      int i = indexOf(paramObject);
      remove(paramObject);
      remove(localObject);
      add(i > paramInt ? paramInt : paramInt - 1, paramObject);
    }
    return localObject;
  }

  public void setElementAt(Object paramObject, int paramInt) {
    set(paramInt, paramObject);
  }
}