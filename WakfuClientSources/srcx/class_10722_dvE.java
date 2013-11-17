import java.util.Iterator;

public class dvE extends bly
  implements Ae
{
  public dvE()
  {
  }

  protected dvE(dvE paramdvE)
  {
    super(paramdvE);
  }

  public Object clone()
  {
    if (cum()) {
      return ((dvE)z(Ga())).clone();
    }
    return super.clone();
  }

  public Iterator iterator()
  {
    if (cum()) {
      return ((dvE)z(Ga())).iterator();
    }
    return new CJ(Ga(), c(Ga()), y(Ga()).kT());
  }

  public int size()
  {
    if (cum()) {
      return ((dvE)z(Ga())).size();
    }
    return y(Ga()).bzl();
  }

  public boolean Jm()
  {
    return true;
  }

  public String toString()
  {
    bqf localbqf = y(Ga());
    String[] arrayOfString = localbqf.kT();
    StringBuffer localStringBuffer = new StringBuffer();

    for (int i = 0; i < arrayOfString.length; i++) {
      if (i > 0) {
        localStringBuffer.append(';');
      }
      localStringBuffer.append(arrayOfString[i]);
    }
    return localStringBuffer.toString();
  }
}