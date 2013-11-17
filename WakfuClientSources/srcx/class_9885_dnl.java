import java.lang.reflect.Constructor;
import java.util.Iterator;

class dnl
  implements Iterator
{
  private final Iterator lmC;
  private boolean empty = false;

  dnl(Iterator paramIterator) {
    this.lmC = paramIterator;
  }

  public boolean hasNext() {
    return (this.lmC.hasNext()) || (!this.empty);
  }

  public dhB cUF()
  {
    Constructor localConstructor;
    if (this.lmC.hasNext()) {
      localConstructor = (Constructor)this.lmC.next();
    }
    else {
      this.empty = true;
      localConstructor = azA.aLw();
    }
    try {
      return (dhB)localConstructor.newInstance(new Object[0]); } catch (Exception localException) {
    }
    throw new cJ("Failed to invoke no-arg constructor on " + localConstructor.getName());
  }

  public void remove()
  {
    throw new UnsupportedOperationException("remove is not supported");
  }
}