import org.apache.log4j.Logger;

public abstract class bxG extends dqt
{
  protected static final ddt ehE = new ddt();
  private ckT aCI;
  private final int bdj;

  public bxG(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramInt1, paramInt2, paramInt3);
    this.bdj = paramInt4;
  }

  private void aUM()
  {
    if (this.aCI == null)
      this.aCI = cjS.clP().vz(this.bdj);
  }

  public ckT mD()
  {
    aUM();

    return this.aCI;
  }

  protected int a() {
    return this.bdj;
  }

  public boolean Ij() {
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      return false;
    }
    aUM();

    if ((localbyz.aeQ() == null) || (this.aCI == null)) {
      return false;
    }
    return localbyz.aeQ() == this.aCI;
  }

  public Su dX(long paramLong) {
    aUM();

    if (this.aCI != null) {
      return this.aCI.dg(paramLong);
    }

    return null;
  }

  public aJD LC()
  {
    aUM();

    if (this.aCI == null) {
      K.error("combat non trouvé : " + this.bdj);
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

  protected void kO() {
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null)
      return;
    Su localSu = dX(bwv());
    if ((localbyz == localSu) || ((localSu != null) && (localSu.adL() == localbyz)) || (localbyz == dX(gA())))
      localbyz.bGI();
  }
}