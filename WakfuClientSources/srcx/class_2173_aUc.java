import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

class aUc
  implements Iterator
{
  private Iterator eUF = bbA.b(this.eUH.kHt).iterator();
  private Iterator eUG = null;

  private aUc(cUI paramcUI) {  } 
  public boolean hasNext() { boolean bool = (this.eUG != null) && (this.eUG.hasNext());
    while ((!bool) && (this.eUF.hasNext())) {
      this.eUG = ((Ae)this.eUF.next()).iterator();
      bool = this.eUG.hasNext();
    }
    return bool; }

  public bFe Ef() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    return (bFe)this.eUG.next();
  }
  public void remove() {
    throw new UnsupportedOperationException();
  }
}