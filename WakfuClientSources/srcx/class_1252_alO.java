import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public abstract class alO
  implements Iterable
{
  private static final Logger K = Logger.getLogger(alO.class);

  protected final ArrayList dmN = new ArrayList();

  public final boolean isEmpty() {
    return this.dmN.isEmpty();
  }

  public void b(cew paramcew, bXI parambXI) {
    a(paramcew, parambXI);
    this.dmN.add(parambXI);
    parambXI.a(paramcew);
  }

  public final bXI ayx() {
    if (isEmpty()) {
      return null;
    }
    return (bXI)this.dmN.get(this.dmN.size() - 1);
  }

  public final bXI b(bXI parambXI) {
    return a(parambXI, true);
  }

  public final Iterator iterator() {
    return this.dmN.iterator();
  }

  public final bXI a(bXI parambXI, boolean paramBoolean) {
    if (isEmpty()) {
      K.error("changement d'apparance mais liste vide");
      return null;
    }

    bXI localbXI1 = ayx();
    if ((!bB) && (localbXI1 == null)) throw new AssertionError();
    Object localObject = null;
    int i = 0;

    Iterator localIterator = this.dmN.iterator();
    while (localIterator.hasNext()) {
      bXI localbXI2 = (bXI)localIterator.next();
      if (localbXI2.a(parambXI)) {
        i++;
        localIterator.remove();
        localObject = localbXI2;
        if (!paramBoolean) {
          break;
        }
      }
    }
    if (i == 0) {
      K.error("Appearance change remove requested, but no entry found for the linked Object");
    }
    if (i > 1) {
      K.warn("Appearance change remove requested, but several entries found for the linked Object");
    }
    return localObject;
  }

  public void c(cew paramcew, bXI parambXI) {
    a(paramcew, parambXI, true);
  }

  public void a(cew paramcew, bXI parambXI, boolean paramBoolean) {
    bXI localbXI1 = ayx();
    bXI localbXI2 = a(parambXI, paramBoolean);
    a(localbXI1, localbXI2, paramcew);
  }

  public void b(cew paramcew) {
    this.dmN.clear();
  }

  public int size() {
    return this.dmN.size();
  }

  public bXI ayy() {
    return b((bXI)this.dmN.get(0));
  }

  protected abstract void a(cew paramcew, bXI parambXI);

  public abstract void a(bXI parambXI1, bXI parambXI2, cew paramcew);

  public void a(cew paramcew, alO paramalO)
  {
    a(paramcew, paramalO, null);
  }

  public void a(cew paramcew, alO paramalO, aKy paramaKy) {
    try {
      if (paramcew == null) {
        return;
      }

      for (bXI localbXI : this)
        if ((paramaKy == null) || (paramaKy.c(localbXI)))
        {
          paramalO.b(paramcew, localbXI.eu());
        }
    } catch (Exception localException) {
      K.error("Error while recopying HMIActions of type " + this + " : ", localException);
    }
  }
}