import org.apache.log4j.Logger;

public abstract class boB extends aPH
{
  protected boB(int paramInt, dTw paramdTw, UG paramUG)
  {
    super(paramInt, paramdTw, paramUG);
  }

  public bIC aDG()
  {
    return this.eMH;
  }

  public void qw(int paramInt) {
    if (aDG() != null)
      aDG().cR(byj());
  }

  public void qx(int paramInt)
  {
    if (aDG() != null)
      aDG().qx(paramInt);
  }

  public int byj()
  {
    if (aDG() != null)
      return aDG().AL();
    return -1;
  }

  public void byk()
  {
    if ((aDG() != null) && (aDG().isRunning()))
      aDG().AV();
  }

  public boolean aJ(dhJ paramdhJ)
  {
    if (!byl())
      return false;
    boolean bool = aDG().aj(paramdhJ.getId());
    if (!bool)
      K.error(ha("Impossible de débuter le tour de " + paramdhJ.getId()));
    return bool;
  }

  protected boolean byl() {
    if ((aDG() == null) || (!aDG().isRunning())) {
      K.error(ha("timeline null ou arretée"));
      return false;
    }
    return true;
  }

  public boolean aK(dhJ paramdhJ)
  {
    return (paramdhJ != null) && (fP(paramdhJ.getId()));
  }

  public boolean fP(long paramLong)
  {
    if (!byl())
      return false;
    boolean bool = aDG().ak(paramLong);
    if (!bool)
      K.error(ha("Impossible de terminer le tour de " + paramLong));
    return bool;
  }

  protected final void fQ(long paramLong)
  {
    dhJ localdhJ = eu(paramLong);

    if (localdhJ != null)
      e(localdhJ);
  }

  protected void e(dhJ paramdhJ) {
    paramdhJ.a(new cHi());
  }

  protected void fR(long paramLong) {
    dhJ localdhJ = eu(paramLong);

    if (localdhJ != null)
      f(localdhJ);
  }

  protected void f(dhJ paramdhJ) {
    try {
      paramdhJ.a(new bwU());
    } catch (Exception localException) {
      K.error("Exception levee", localException);
    }
  }

  public void aDx() {
    aDz();

    for (dhJ localdhJ : this.eMF.b(new cGB[] { cGB.cBC() }))
      if (localdhJ != null) {
        localdhJ.a(new aev());
        Rx localRx = localdhJ.d(eu.ayX);
        localRx.gw(1);
      }
  }

  public void Ml()
  {
    aDz();
  }
}