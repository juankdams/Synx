import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class Ig
  implements aqm
{
  protected static Logger K = Logger.getLogger(Ig.class);
  private final int aw;

  protected Ig(int paramInt)
  {
    this.aw = paramInt;
  }

  public abstract void execute();

  protected abstract void j(ArrayList paramArrayList);

  public boolean k(ArrayList paramArrayList) {
    if (awA.a(this, paramArrayList)) {
      j(paramArrayList);
      return true;
    }
    K.error("L'action client (" + getClass() + ") n'a pas les paramètres du bon type id=" + this.aw);
    return false;
  }

  public int getId()
  {
    return this.aw;
  }
}