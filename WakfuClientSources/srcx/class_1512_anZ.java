import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class anZ
  implements Iterator
{
  private final List dsw = new ArrayList(2);
  private Iterator dsx;
  private int dsy = -1;

  public anZ(Collection paramCollection)
  {
    this.dsw.addAll(paramCollection);
    if (!this.dsw.isEmpty()) {
      this.dsx = ((Iterator)this.dsw.get(0));
      this.dsy = 0;
    }
  }

  public anZ() {
    this(Collections.emptyList());
  }

  public anZ(Iterator[] paramArrayOfIterator) {
    this(Arrays.asList(paramArrayOfIterator));
  }

  public anZ(Iterator paramIterator) {
    this(Arrays.asList(new Iterator[] { paramIterator }));
  }

  public anZ(Iterator paramIterator1, Iterator paramIterator2) {
    this(Arrays.asList(new Iterator[] { paramIterator1, paramIterator2 }));
  }

  public void b(Iterator paramIterator)
  {
    if (this.dsx == null) {
      this.dsx = paramIterator;
      this.dsy = this.dsw.size();
    }
    this.dsw.add(paramIterator);
  }

  public boolean hasNext() {
    if (this.dsx == null) {
      return false;
    }
    if (this.dsx.hasNext()) {
      return true;
    }
    int i = this.dsw.size();
    for (int j = this.dsy + 1; j < i; j++) {
      if (((Iterator)this.dsw.get(j)).hasNext())
        return true;
    }
    return false;
  }

  public Object next()
  {
    if (this.dsx.hasNext()) {
      return this.dsx.next();
    }

    int i = this.dsw.size();
    for (int j = this.dsy + 1; j < i; j++) {
      this.dsy = j;
      this.dsx = ((Iterator)this.dsw.get(j));
      if (this.dsx.hasNext()) {
        return this.dsx.next();
      }
    }

    throw new NoSuchElementException();
  }

  public void remove() {
    throw new UnsupportedOperationException();
  }
}