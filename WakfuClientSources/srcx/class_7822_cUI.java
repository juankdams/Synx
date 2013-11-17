import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

class cUI extends AbstractCollection
{
  private Collection kHs;

  cUI(bbA parambbA)
  {
  }

  public int size()
  {
    return cJQ().size();
  }
  public Iterator iterator() {
    return cJQ().iterator();
  }
  private synchronized Collection cJQ() {
    Collection localCollection = this.kHs;
    if (localCollection == null) {
      localCollection = dst.h(new aUc(this, null));
      if (bbA.a(this.kHt)) {
        this.kHs = localCollection;
      }
    }
    return localCollection;
  }
}