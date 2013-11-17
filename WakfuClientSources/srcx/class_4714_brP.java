import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class brP
{
  private static final Logger K = Logger.getLogger(brP.class);

  private final ArrayList dMa = new ArrayList();
  protected final Object fNP;

  protected brP(Object paramObject)
  {
    this.fNP = paramObject;
  }

  protected final void j(bNi parambNi) {
    b(new bdZ(parambNi));
  }

  protected final void b(Gz paramGz) {
    for (Gz localGz : this.dMa) {
      if (localGz.a(paramGz)) {
        return;
      }
    }
    this.dMa.add(paramGz);
  }

  public final ArrayList aIy() {
    return this.dMa;
  }

  public final Gz a(cLT paramcLT) {
    for (int i = 0; i < this.dMa.size(); i++) {
      if (((Gz)this.dMa.get(i)).yE() == paramcLT) {
        return (Gz)this.dMa.get(i);
      }
    }
    return null;
  }

  public final boolean bzZ() {
    return !this.dMa.isEmpty();
  }

  public final boolean b(cLT paramcLT) {
    for (int i = 0; i < this.dMa.size(); i++) {
      if (((Gz)this.dMa.get(i)).yE() == paramcLT) {
        return true;
      }
    }
    return false;
  }

  protected void bAa() {
    this.dMa.clear();
  }
}