import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

class cgk
  implements Iterator
{
  private Iterator gPG;
  private Iterator hDO;
  private List hDP = new ArrayList();
  private static final String bdh = "@(#) $RCSfile: DescendantIterator.java,v $ $Revision: 1.5 $ $Date: 2004/02/27 11:32:57 $ $Name: jdom_1_0 $";

  cgk(aTe paramaTe)
  {
    if (paramaTe == null) {
      throw new IllegalArgumentException("parent parameter was null");
    }
    this.gPG = paramaTe.getContent().iterator();
  }

  public boolean hasNext()
  {
    if ((this.gPG != null) && (this.gPG.hasNext())) return true;
    if ((this.hDO != null) && (this.hDO.hasNext())) return true;
    if (ciw()) return true;
    return false;
  }

  public Object next()
  {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }

    if (this.hDO != null) {
      e(this.gPG);
      this.gPG = this.hDO;
      this.hDO = null;
    }

    while (!this.gPG.hasNext()) {
      if (this.hDP.size() > 0) {
        this.gPG = civ();
      }
      else {
        throw new NoSuchElementException("Somehow we lost our iterator");
      }
    }

    djh localdjh = (djh)this.gPG.next();
    if ((localdjh instanceof dRW)) {
      this.hDO = ((dRW)localdjh).getContent().iterator();
    }
    return localdjh;
  }

  private Iterator civ()
  {
    int i = this.hDP.size();
    if (i == 0) {
      throw new NoSuchElementException("empty stack");
    }
    return (Iterator)this.hDP.remove(i - 1);
  }

  private void e(Iterator paramIterator) {
    this.hDP.add(paramIterator);
  }

  public void remove()
  {
    this.gPG.remove();
  }

  private boolean ciw()
  {
    int i = this.hDP.size();
    for (int j = 0; j < i; j++) {
      Iterator localIterator = (Iterator)this.hDP.get(j);
      if (localIterator.hasNext()) {
        return true;
      }
    }
    return false;
  }
}