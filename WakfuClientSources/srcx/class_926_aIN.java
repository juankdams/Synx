import org.apache.log4j.Logger;

public abstract class aIN extends atX
{
  protected static final ddt ehE = new ddt();
  private ckT aCI;
  private final int bdj;

  public aIN(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramInt1, paramInt2, paramInt3);

    this.bdj = paramInt4;
    akR localakR = new akR(1);
    localakR.put("fightId", Integer.valueOf(this.bdj));
    d(localakR);
    aUM();
  }

  private void aUM() {
    if (this.aCI == null)
      this.aCI = cjS.clP().vz(this.bdj);
  }

  protected ckT mD()
  {
    aUM();
    return this.aCI;
  }

  public int a() {
    return this.bdj;
  }

  public boolean Ij() {
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      return false;
    }
    aUM();

    arl localarl = localbyz.bGv();
    if ((localarl == null) || (this.aCI == null)) {
      return false;
    }
    return localarl == this.aCI;
  }

  public Su dX(long paramLong) {
    aUM();
    Su localSu = null;
    if (this.aCI != null) {
      localSu = this.aCI.dg(paramLong);
    }

    if (localSu == null) {
      localSu = CA.Lv().bj(paramLong);
    }
    return localSu;
  }

  public aJD LC() {
    aUM();
    if (this.aCI == null) {
      K.error("combat non trouvé : " + this.bdj);
      return null;
    }
    return this.aCI.LC();
  }

  protected void kO()
  {
    super.kO();
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null)
      return;
    Su localSu = dX(bwv());
    if ((localbyz == localSu) || ((localSu != null) && (localSu.adL() == localbyz)) || (localbyz == dX(gA())))
      localbyz.bGI();
  }
}