import java.util.Iterator;
import java.util.NoSuchElementException;

class bOG
  implements Iterator
{
  private Iterator gPG;
  private KN Vx;
  private Object gTO;
  private static final String bdh = "@(#) $RCSfile: FilterIterator.java,v $ $Revision: 1.5 $ $Date: 2004/08/31 19:36:12 $ $Name: jdom_1_0 $";

  public bOG(Iterator paramIterator, KN paramKN)
  {
    if ((paramIterator == null) || (paramKN == null)) {
      throw new IllegalArgumentException("null parameter");
    }
    this.gPG = paramIterator;
    this.Vx = paramKN;
  }

  public boolean hasNext() {
    if (this.gTO != null) {
      return true;
    }

    while (this.gPG.hasNext()) {
      Object localObject = this.gPG.next();
      if (this.Vx.matches(localObject)) {
        this.gTO = localObject;
        return true;
      }
    }
    return false;
  }

  public Object next() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }

    Object localObject = this.gTO;
    this.gTO = null;
    return localObject;
  }

  public void remove()
  {
    this.gPG.remove();
  }
}