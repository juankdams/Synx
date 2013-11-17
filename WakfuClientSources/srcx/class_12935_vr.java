public class vr extends bLe
{
  private final long bjy;

  public vr(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
    this.bjy = paramLong;
  }

  protected void kN()
  {
    ckT localckT = mD();
    if (!(localckT instanceof arl)) {
      return;
    }
    arl localarl = (arl)localckT;

    Su localSu = (Su)localarl.eu(this.bjy);

    localSu.jl(true);
    localarl.ev(this.bjy);
    localarl.T(localSu);

    if ((localSu instanceof bKm))
      localSu.aeK();
  }

  protected void kO()
  {
  }
}