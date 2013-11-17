import java.util.Iterator;
import java.util.NoSuchElementException;

public class tK
  implements Iterator
{
  private Object[] bew;
  private int bex;
  private boolean bey;
  private int bez = -1;

  public tK(Object[] paramArrayOfObject, boolean paramBoolean)
  {
    this.bew = paramArrayOfObject;
    this.bex = paramArrayOfObject.length;
    this.bey = paramBoolean;
    BZ();
  }

  public boolean hasNext() {
    return this.bez < this.bex;
  }

  public Object next() {
    if (!hasNext())
      throw new NoSuchElementException("Array end reached. Array Size : " + this.bex);
    Object localObject = this.bew[this.bez];
    BZ();
    return localObject;
  }

  public void remove() {
    throw new UnsupportedOperationException();
  }

  private void BZ() {
    if (this.bey) {
      this.bez += 1;
    }
    else
      for (this.bez += 1; (this.bez < this.bex) && (this.bew[this.bez] == null); this.bez += 1);
  }
}