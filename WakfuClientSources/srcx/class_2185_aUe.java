import java.util.List;
import org.apache.log4j.Logger;

public abstract class aUe
{
  protected static final boolean aRN = false;
  protected static final Logger K = Logger.getLogger(aUe.class);
  protected bdK eUJ;

  protected abstract bdK b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean);

  private bdK bW(int paramInt1, int paramInt2)
  {
    return b(paramInt1, paramInt2, 18, 18, false);
  }

  private bdK bX(int paramInt1, int paramInt2) {
    return b(paramInt1, paramInt2, 18, 18, true);
  }

  public void E(int paramInt1, int paramInt2)
  {
    int i = asc.jT(paramInt1);
    int j = asc.jU(paramInt2);

    bdK localbdK = bX(i, j);
    localbdK.a(4, localbdK);

    a(localbdK, i, j);
    this.eUJ = localbdK;

    K.info(getClass().getSimpleName() + " initialisé, centré sur " + this.eUJ);
  }

  private void a(bdK parambdK, int paramInt1, int paramInt2) {
    parambdK.a(7, bW(paramInt1, paramInt2 + 1));
    parambdK.a(6, bW(paramInt1 - 1, paramInt2 + 1));
    parambdK.a(8, bW(paramInt1 + 1, paramInt2 + 1));
    parambdK.a(3, bW(paramInt1 - 1, paramInt2));
    parambdK.a(5, bW(paramInt1 + 1, paramInt2));
    parambdK.a(1, bW(paramInt1, paramInt2 - 1));
    parambdK.a(0, bW(paramInt1 - 1, paramInt2 - 1));
    parambdK.a(2, bW(paramInt1 + 1, paramInt2 - 1));
  }

  public boolean ais() {
    return this.eUJ != null;
  }

  public final List bjr()
  {
    if (this.eUJ != null) {
      return this.eUJ.brO();
    }
    return null;
  }

  public void clear()
  {
  }

  public final bdK bY(int paramInt1, int paramInt2)
  {
    if ((!bB) && (this.eUJ == null)) throw new AssertionError();
    bdK[] arrayOfbdK = this.eUJ.brP();
    int i = 0; for (int j = arrayOfbdK.length; i < j; i++) {
      bdK localbdK = arrayOfbdK[i];
      if ((localbdK.getX() == paramInt1) && (localbdK.getY() == paramInt2)) {
        return localbdK;
      }
    }
    return null;
  }

  public final bdK bZ(int paramInt1, int paramInt2)
  {
    if ((!bB) && (this.eUJ == null)) throw new AssertionError();
    bdK[] arrayOfbdK = this.eUJ.brP();
    int i = 0; for (int j = arrayOfbdK.length; i < j; i++) {
      bdK localbdK = arrayOfbdK[i];
      if (localbdK.cl(paramInt1, paramInt2)) {
        return localbdK;
      }
    }
    return null;
  }

  public final bdK bjs() {
    return this.eUJ.pa(4);
  }
}