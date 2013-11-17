import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class blN
  implements Map
{
  private final ReferenceQueue fCY = new ReferenceQueue();
  private Map fCZ = new HashMap();

  public void clear()
  {
    this.fCZ.clear();
    bwP();
  }

  public boolean containsKey(Object paramObject) {
    bwP();
    return this.fCZ.containsKey(new dzq(this, paramObject));
  }

  public boolean containsValue(Object paramObject) {
    bwP();
    return this.fCZ.containsValue(paramObject);
  }

  public Set entrySet() {
    bwP();
    HashSet localHashSet = new HashSet();
    for (Iterator localIterator = this.fCZ.entrySet().iterator(); localIterator.hasNext(); ) {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Object localObject1 = ((dzq)localEntry.getKey()).get();
      Object localObject2 = localEntry.getValue();
      tQ localtQ = new tQ(this, localObject1, localObject2);

      localHashSet.add(localtQ);
    }
    return Collections.unmodifiableSet(localHashSet);
  }
  public Set keySet() {
    bwP();
    HashSet localHashSet = new HashSet();
    for (Iterator localIterator = this.fCZ.keySet().iterator(); localIterator.hasNext(); ) {
      dzq localdzq = (dzq)localIterator.next();
      localHashSet.add(localdzq.get());
    }
    return Collections.unmodifiableSet(localHashSet);
  }

  public boolean equals(Object paramObject) {
    return this.fCZ.equals(((blN)paramObject).fCZ);
  }

  public Object get(Object paramObject) {
    bwP();
    return this.fCZ.get(new dzq(this, paramObject));
  }
  public Object put(Object paramObject1, Object paramObject2) {
    bwP();
    return this.fCZ.put(new dzq(this, paramObject1), paramObject2);
  }

  public int hashCode() {
    bwP();
    return this.fCZ.hashCode();
  }
  public boolean isEmpty() {
    bwP();
    return this.fCZ.isEmpty();
  }
  public void putAll(Map paramMap) {
    throw new UnsupportedOperationException();
  }
  public Object remove(Object paramObject) {
    bwP();
    return this.fCZ.remove(new dzq(this, paramObject));
  }
  public int size() {
    bwP();
    return this.fCZ.size();
  }
  public Collection values() {
    bwP();
    return this.fCZ.values();
  }

  private synchronized void bwP() {
    Reference localReference = this.fCY.poll();

    while (localReference != null) {
      dzq localdzq = (dzq)localReference;
      this.fCZ.remove(localdzq);
      localReference = this.fCY.poll();
    }
  }

  static ReferenceQueue a(blN paramblN)
  {
    return paramblN.fCY;
  }
}