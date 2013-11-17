import java.util.Iterator;

class aDX
  implements Iterator
{
  private int dZm = 0;
  private final int m_size;
  private final int dZn;

  private aDX(dpr paramdpr, aFy paramaFy)
  {
    this.m_size = paramaFy.aRO();
    this.dZn = paramaFy.aRP();
  }

  public boolean hasNext() {
    return this.dZm < this.m_size;
  }

  public bJz aQi() {
    bJz localbJz = dpr.a(this.dZo)[(this.dZm + this.dZn)];
    this.dZm += 1;
    return localbJz;
  }

  public void remove() {
    throw new UnsupportedOperationException();
  }
}