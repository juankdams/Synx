import org.apache.log4j.Logger;

public final class cve extends bLe
{
  private long aXW;

  public cve(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  protected void kN()
  {
    ckT localckT = mD();

    czN localczN = (czN)localckT;
    Su localSu = CA.Lv().bj(this.aXW);
    if (localSu == null) {
      K.error("[_FL_] Le fighter inconnu id=" + this.aXW + " quitte le fight externe id=" + localckT.getId());
      return;
    }

    localczN.aY(localSu);
    localSu.aeK();
  }

  protected void kO()
  {
  }

  public void X(long paramLong) {
    this.aXW = paramLong;
  }
}