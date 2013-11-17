import java.util.LinkedList;

public abstract class aTA extends cGF
{
  protected LinkedList dOe = new LinkedList();

  protected long aTz = -1L;

  public bJS eRN = new Nk(this, this, 8);

  protected aTA(long paramLong)
  {
    this.aTz = paramLong;
  }

  protected aTA() {
  }

  public void a(bxV parambxV) {
    this.dOe.add(parambxV);
  }

  public void clear() {
    this.aTz = -1L;
  }

  public boolean b(bxV parambxV) {
    return this.dOe.remove(parambxV);
  }

  public byte[] j()
  {
    return a(tn());
  }

  public long getId() {
    return this.aTz;
  }

  public void a(long paramLong) {
    this.aTz = paramLong;
  }
}