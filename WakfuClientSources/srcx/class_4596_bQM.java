import java.util.Iterator;

public class bQM extends bly
  implements Ae
{
  public bQM()
  {
  }

  protected bQM(bQM parambQM)
  {
    super(parambQM);
  }

  public Object clone()
  {
    if (cum()) {
      return ((bQM)z(Ga())).clone();
    }
    return super.clone();
  }

  public Iterator iterator()
  {
    if (cum()) {
      return ((bQM)z(Ga())).iterator();
    }
    return new CJ(Ga(), c(Ga()), y(Ga()).kU());
  }

  public int size()
  {
    if (cum()) {
      return ((bQM)z(Ga())).size();
    }
    return y(Ga()).bzj();
  }

  public boolean Jm()
  {
    return true;
  }
}