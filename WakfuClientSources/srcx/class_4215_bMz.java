import java.util.ArrayList;
import java.util.List;

public abstract class bMz extends aUe
  implements Qh
{
  protected final List gQf;

  protected bMz()
  {
    this.gQf = new ArrayList();
  }

  protected abstract bSl aJW();

  public final boolean a(bcG parambcG)
  {
    return this.gQf.contains(parambcG);
  }

  public final void b(bcG parambcG)
  {
    this.gQf.add(parambcG);
  }

  public final void c(bcG parambcG)
  {
    this.gQf.remove(parambcG);
  }

  public final void bTY()
  {
    this.gQf.clear();
  }

  public void b(bSl parambSl, bdK parambdK1, bdK parambdK2)
  {
    for (int i = 0; i < this.gQf.size(); i++)
      ((bcG)this.gQf.get(i)).a(parambSl, parambdK1, parambdK2);
  }
}