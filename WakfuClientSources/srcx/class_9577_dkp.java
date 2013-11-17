import java.util.Iterator;
import java.util.NoSuchElementException;

class dkp
  implements Iterator
{
  private final bFN ggO;
  private final boolean lhw;
  private final int lhx;
  private final int lhy;
  private int lhz;

  public dkp(bFN parambFN)
  {
    this.ggO = parambFN;
    this.lhw = parambFN.bEf();
    if (this.lhw)
    {
      this.lhz = parambFN.bNZ().getX();
      this.lhy = parambFN.bOa().getX();
      this.lhx = parambFN.bOa().getY();
    }
    else
    {
      this.lhz = parambFN.bNZ().getY();
      this.lhy = parambFN.bOa().getY();
      this.lhx = parambFN.bOa().getX();
    }
  }

  public boolean hasNext() {
    return this.lhz <= this.lhy;
  }

  public cYk cSS() {
    if (this.lhz > this.lhy)
      throw new NoSuchElementException();
    if (this.lhw) {
      return new cYk(this.lhz++, this.lhx);
    }
    return new cYk(this.lhx, this.lhz++);
  }

  public void remove() {
    throw new UnsupportedOperationException();
  }
}