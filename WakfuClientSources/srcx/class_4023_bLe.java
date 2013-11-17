import org.apache.log4j.Logger;

public abstract class bLe extends bSR
{
  private ckT aCI;
  private final int bdj;

  protected bLe(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramInt1, paramInt2, paramInt3);
    this.bdj = paramInt4;
  }

  private void aUM() {
    if (this.aCI == null)
      this.aCI = cjS.clP().vz(this.bdj);
  }

  public ckT mD()
  {
    aUM();
    return this.aCI;
  }

  public boolean Ij()
  {
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      return false;
    }
    aUM();

    if ((localbyz.bGv() == null) && (this.aCI == null)) {
      return false;
    }
    return localbyz.bGv() == this.aCI;
  }

  public arl bTl()
  {
    byz localbyz = byv.bFN().bFO();
    if (localbyz != null)
      return localbyz.aeQ();
    return null;
  }

  public Su dX(long paramLong) {
    aUM();
    if (this.aCI != null) {
      return this.aCI.dg(paramLong);
    }
    return CA.Lv().bj(paramLong);
  }

  public aJD LC()
  {
    aUM();

    if (this.aCI == null) {
      return null;
    }
    return this.aCI.LC();
  }

  public cOE bEY() {
    aUM();

    if (this.aCI != null) {
      return this.aCI.aIq();
    }
    return SN.aga();
  }

  public final void run()
  {
    try {
      kN();
    }
    catch (Exception localException) {
      K.error(String.format("Erreur lors de l'exécution de la %s #%d: %s", new Object[] { getClass().getSimpleName(), Integer.valueOf(eo()), bBd.g(localException) }));
    }
    finally
    {
      bZw();
    }
  }

  protected abstract void kN();
}