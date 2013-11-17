import java.util.Iterator;

public class dcc
  implements Iterable
{
  private final aoL kJr = new aoL();

  public dwq jo(long paramLong)
  {
    return (dwq)this.kJr.get(paramLong);
  }

  public void a(dwq paramdwq) {
    this.kJr.put(paramdwq.getId(), paramdwq);
  }

  public void b(dwq paramdwq) {
    this.kJr.remove(paramdwq.getId());
  }

  public void jp(long paramLong) {
    this.kJr.remove(paramLong);
  }

  public boolean isEmpty() {
    return this.kJr.isEmpty();
  }

  public Iterator iterator() {
    return new dAI(this.kJr);
  }
}