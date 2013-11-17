import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class cEk
{
  protected static final Logger K = Logger.getLogger(cEk.class);

  private final cSR aj = new cSR();

  private final List ixO = new ArrayList();
  private final List ixP = new ArrayList();

  public void a(cLC paramcLC)
  {
    if (!this.ixO.contains(paramcLC))
      this.ixO.add(paramcLC);
  }

  public void b(cLC paramcLC) {
    this.ixP.add(paramcLC);
  }

  private void czV() {
    this.ixO.removeAll(this.ixP);
    this.ixP.clear();
  }

  public boolean r(aid paramaid)
  {
    int i = paramaid.getId();
    aid localaid = (aid)this.aj.get(i);
    if ((localaid != null) && (localaid != paramaid)) {
      K.error("Un protecteur avec cet ID (" + i + ") est déjà présent enregistré, et n'est pas celui-ci.");
      return false;
    }

    if (paramaid.avb() == null) {
      K.error("Tentative d'enregistrement d'un protecteur avec des données incorrectes : " + paramaid);
      return false;
    }

    this.aj.put(i, paramaid);
    try
    {
      czV();
      int j = 0; for (int k = this.ixO.size(); j < k; j++)
        ((cLC)this.ixO.get(j)).s(paramaid);
      czV();
    } catch (Exception localException) {
      K.error("Exception levée par un observer lors de l'enregistrement d'un protecteur (ID=" + i + ')', localException);
    }

    return true;
  }

  public void a(aYB paramaYB, Collection paramCollection)
  {
    this.aj.a(new SV(this, paramaYB, paramCollection));
  }

  public aid xz(int paramInt)
  {
    return (aid)this.aj.get(paramInt);
  }

  public void clear() {
    if (!this.ixO.isEmpty()) {
      czV();
      this.aj.s(new SU(this));

      czV();
    }
    this.aj.clear();
  }

  public dmn czW() {
    return this.aj.yF();
  }

  public aid czX() {
    aid[] arrayOfaid = (aid[])this.aj.d(new aid[this.aj.size()]);

    return arrayOfaid[bCO.sf(arrayOfaid.length)];
  }
}