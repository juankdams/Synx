import java.util.LinkedList;

public abstract class aQo extends cGF
{
  protected LinkedList dOe = new LinkedList();

  public void a(bxV parambxV) {
    this.dOe.add(parambxV);
  }

  public boolean b(bxV parambxV) {
    return this.dOe.remove(parambxV);
  }

  public byte[] j()
  {
    return a(tn());
  }
}