import java.util.Iterator;

public class aOg
  implements Iterator
{
  private dmn euA;

  public aOg(cSR paramcSR)
  {
    this.euA = paramcSR.yF();
  }

  public boolean hasNext()
  {
    return this.euA.hasNext();
  }

  public Object next()
  {
    this.euA.fl();
    return this.euA.value();
  }

  public void remove()
  {
    this.euA.remove();
  }
}