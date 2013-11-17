import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;

public final class ET
{
  protected static final Logger K = Logger.getLogger(ET.class);

  private final ArrayList bLW = new ArrayList();
  private final ArrayList bLX = new ArrayList(1);
  private long aPT;

  public final void a(cZT paramcZT)
  {
    this.bLX.add(paramcZT);
  }

  public final void b(cZT paramcZT) {
    this.bLX.remove(paramcZT);
  }

  public final void a(bjU parambjU) {
    this.bLW.add(parambjU);
    if (!parambjU.buX().isInfinite())
      Oi();
  }

  public final void b(bjU parambjU)
  {
    this.bLW.remove(parambjU);
    if (!Oh())
      Oj();
  }

  public final void Of()
  {
    this.bLW.clear();
    Oj();
  }

  public final Collection Og() {
    return this.bLW;
  }

  private boolean Oh() {
    int i = 0; for (int j = this.bLW.size(); i < j; i++) {
      bjU localbjU = (bjU)this.bLW.get(i);
      if (!localbjU.buX().isInfinite()) {
        return true;
      }
    }
    return false;
  }

  private void Oi() {
    if (this.aPT == 0L) {
      this.aPT = cAo.cxf().a(new uj(this), 1000L, 1);

      notifyObservers();
    }
  }

  private void Oj() {
    if (this.aPT != 0L) {
      cAo.cxf().ia(this.aPT);
      this.aPT = 0L;
      notifyObservers();
    }
  }

  private void notifyObservers() {
    int i = 0; for (int j = this.bLX.size(); i < j; i++) {
      cZT localcZT = (cZT)this.bLX.get(i);
      localcZT.cMx();
    }
  }
}