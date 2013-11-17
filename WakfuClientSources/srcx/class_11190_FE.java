import java.util.Iterator;

class FE
  implements Iterator
{
  FE(cex paramcex, Iterator paramIterator, Jf paramJf)
  {
  }

  public boolean hasNext()
  {
    return this.bNa.hasNext();
  }
  public bFe Ef() {
    JI localJI = new JI(this.bNc.Ga(), (String)this.bNa.next());
    return this.bNb == null ? localJI : new crq(localJI, this.bNb);
  }
  public void remove() {
    throw new UnsupportedOperationException();
  }
}