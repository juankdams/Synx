import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class aic extends JY
{
  protected static final Logger K = Logger.getLogger(aic.class);

  private dVl dea = null;

  private final cSR deb = new cSR();

  private int dec = 0;

  private final List ded = new ArrayList();

  protected aic(aYr paramaYr) {
    super(paramaYr);
  }

  public void ir() {
  }

  void iv(int paramInt) {
    if (this.dec > 0) {
      return;
    }
    cUq[] arrayOfcUq = new cUq[this.ded.size()];
    this.ded.toArray(arrayOfcUq);
    for (int i = arrayOfcUq.length - 1; i >= 0; i--)
      arrayOfcUq[i].b(paramInt, UI());
  }

  public void a(cUq paramcUq)
  {
    if (paramcUq == null)
      return;
    this.ded.add(paramcUq);
  }

  public void b(cUq paramcUq)
  {
    this.ded.remove(paramcUq);
  }

  public abstract void b(int paramInt, int[] paramArrayOfInt);

  public abstract void iw(int paramInt);

  public abstract void c(int paramInt, int[] paramArrayOfInt);

  public abstract void d(int paramInt, int[] paramArrayOfInt);

  void auS()
  {
    this.dec += 1;
  }

  void auT() {
    this.dec -= 1;
  }

  public crV ix(int paramInt)
  {
    return (crV)this.deb.get(paramInt);
  }

  public crV auU()
  {
    if (this.deb.size() == 0)
      return null;
    crV localcrV = new crV(this.deb.size());
    for (dmn localdmn = this.deb.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      localcrV.a((crV)localdmn.value());
    }
    return localcrV;
  }

  protected void e(int paramInt, int[] paramArrayOfInt)
  {
    crV localcrV = iz(paramInt);
    int i = paramArrayOfInt.length;
    for (int j = 0; j < i; j++) {
      localcrV.wl(paramArrayOfInt[j]);
    }
    auV();
    iv(paramInt);
  }

  protected void f(int paramInt, int[] paramArrayOfInt)
  {
    crV localcrV = ix(paramInt);
    if (localcrV == null)
      return;
    int i = paramArrayOfInt.length;
    int j = localcrV.size();
    for (int k = j - 1; k >= 0; k--) {
      for (int m = 0; m < i; m++) {
        if (localcrV.wm(k) == paramArrayOfInt[m]) {
          localcrV.remove(k);
          break;
        }
      }
    }
    auV();
    iv(paramInt);
  }

  protected void iy(int paramInt)
  {
    crV localcrV = ix(paramInt);
    if ((localcrV == null) || (localcrV.size() == 0))
      return;
    localcrV.clear();

    auV();
    iv(paramInt);
  }

  protected void g(int paramInt, int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {
      iy(paramInt);
      return;
    }

    crV localcrV = iz(paramInt);

    if (a(paramArrayOfInt, localcrV)) {
      return;
    }
    localcrV.clear();
    int i = paramArrayOfInt.length;
    for (int j = 0; j < i; j++)
      localcrV.wl(paramArrayOfInt[j]);
    auV();
    iv(paramInt);
  }

  private boolean a(int[] paramArrayOfInt, crV paramcrV)
  {
    if (paramcrV.size() == 0) {
      return (paramArrayOfInt == null) || (paramArrayOfInt.length == 0);
    }
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length != paramcrV.size())) {
      return false;
    }
    boolean bool = true;
    for (int i = 0; i < paramcrV.size(); i++) {
      int j = paramcrV.get(i);
      int k = 0;
      for (int m = 0; m < paramArrayOfInt.length; m++) {
        if (paramArrayOfInt[m] == j) {
          k = 1;
          break;
        }
      }

      if (k == 0) {
        bool = false;
        break;
      }
    }

    return bool;
  }

  protected crV iz(int paramInt)
  {
    crV localcrV = (crV)this.deb.get(paramInt);

    if (localcrV != null) {
      return localcrV;
    }

    localcrV = new crV();
    this.deb.put(paramInt, localcrV);

    return localcrV;
  }

  private void auV() {
    if (this.dea != null)
      this.dea.dvn();
  }

  public hk auW()
  {
    if (this.dea == null)
      this.dea = new dVl(this);
    return this.dea;
  }
}