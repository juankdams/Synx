public class lK extends Zx
{
  private int aPq;

  private lK(Gx paramGx, int paramInt)
  {
    this.aPq = paramInt;
  }

  public Object getFieldValue(String paramString) {
    Object localObject = super.getFieldValue(paramString);
    if (localObject != null) {
      return localObject;
    }
    return ((bVw)Hh.QM().dh(this.aPq)).getFieldValue(paramString);
  }

  public int tb() {
    return Math.min(akF(), sz());
  }

  public int sz() {
    return byv.bFN().bFO().bGP().tj(this.aPq);
  }

  public int getMaxQuantity() {
    Qb localQb = this.aOK.bVc().bPi();
    return localQb == null ? 0 : localQb.gn(this.aPq);
  }

  public int sA() {
    jK localjK = (jK)this.aOK.bVc().bPk();
    return localjK == null ? 0 : localjK.nd(this.aPq);
  }

  public int tc() {
    return this.aPq;
  }
}