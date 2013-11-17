import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.WeakHashMap;

class dri
  implements Iterator
{
  private static final WeakHashMap ltG = new WeakHashMap();
  private final Object dTF;
  private Iterator ltH;

  static synchronized void bp(Object paramObject)
  {
    Set localSet = (Set)ltG.get(paramObject);
    if (localSet != null)
      localSet.clear();
  }

  private static synchronized void a(dri paramdri)
  {
    Object localObject = (Set)ltG.get(paramdri.dTF);
    if (localObject == null) {
      localObject = new HashSet();
      ltG.put(paramdri.dTF, localObject);
    }
    ((Set)localObject).add(paramdri);
  }

  private static synchronized void b(dri paramdri) {
    Set localSet = (Set)ltG.get(paramdri.dTF);
    if (localSet != null)
      localSet.remove(paramdri);
  }

  private static synchronized void c(dri paramdri)
  {
    Set localSet = (Set)ltG.get(paramdri.dTF);
    if (!localSet.contains(paramdri))
      throw new ConcurrentModificationException();
  }

  dri(Object paramObject, Iterator paramIterator)
  {
    if (paramObject == null) {
      throw new IllegalArgumentException("parent object is null");
    }
    if (paramIterator == null) {
      throw new IllegalArgumentException("cannot wrap null iterator");
    }
    this.dTF = paramObject;
    if (paramIterator.hasNext()) {
      this.ltH = paramIterator;
      a(this);
    }
  }

  public boolean hasNext()
  {
    if (this.ltH == null) {
      return false;
    }
    c(this);
    return this.ltH.hasNext();
  }

  public bFe Ef()
  {
    if ((this.ltH == null) || (!this.ltH.hasNext())) {
      throw new NoSuchElementException();
    }
    c(this);
    try {
      return (bFe)this.ltH.next();
    } finally {
      if (!this.ltH.hasNext()) {
        this.ltH = null;
        b(this);
      }
    }
  }

  public void remove()
  {
    throw new UnsupportedOperationException();
  }
}