import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public abstract class qM
  implements Iterable
{
  private final HashMap aYb = new HashMap();

  protected qM(ec[] paramArrayOfec)
  {
    for (ec localec : paramArrayOfec) {
      if (this.aYb.containsKey(Integer.valueOf(localec.it())))
        throw new RuntimeException("Définition des listes de paramètres impossibles : liste à " + localec.it() + " paramètres déjà définie");
      this.aYb.put(Integer.valueOf(localec.it()), localec);
    }
  }

  public ec cs(int paramInt) {
    return (ec)this.aYb.get(Integer.valueOf(paramInt));
  }

  public final Iterator iterator()
  {
    return this.aYb.values().iterator();
  }

  public final boolean ct(int paramInt)
  {
    if (paramInt > 0) {
      return this.aYb.containsKey(Integer.valueOf(paramInt));
    }

    return (this.aYb.isEmpty()) || (this.aYb.containsKey(Integer.valueOf(0)));
  }

  public int size() {
    return this.aYb.size();
  }

  public abstract boolean cu(int paramInt);
}