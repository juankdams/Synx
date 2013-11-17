import java.util.Iterator;
import java.util.NoSuchElementException;

class vq
  implements Iterator
{
  private boolean bjw = false;

  vq(bFe parambFe) {  } 
  public boolean hasNext() { return !this.bjw; }

  public bFe Ef() {
    if (this.bjw) {
      throw new NoSuchElementException();
    }
    this.bjw = true;
    return this.bjx;
  }
  public void remove() {
    throw new UnsupportedOperationException();
  }
}