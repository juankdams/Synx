import java.util.Iterator;

class aQV
  implements Iterator
{
  private int eNL = -1;

  aQV(AS paramAS) {  } 
  public boolean hasNext() { return this.eNL < AS.b(this.eNM).size() - 1; }

  public Cs bhw()
  {
    this.eNL += 1;
    return new Cs(Integer.valueOf(AS.b(this.eNM).wm(this.eNL)), Short.valueOf(AS.c(this.eNM).sV(this.eNL)));
  }

  public void remove() {
    throw new UnsupportedOperationException();
  }
}