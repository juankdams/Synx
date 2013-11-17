import java.util.Iterator;

public class dAI
  implements Iterator
{
  private final cHu fFF;

  public dAI(aoL paramaoL)
  {
    this.fFF = paramaoL.aBa();
  }

  public boolean hasNext()
  {
    return this.fFF.hasNext();
  }

  public Object next()
  {
    this.fFF.fl();
    return this.fFF.value();
  }

  public void remove()
  {
    this.fFF.remove();
  }
}