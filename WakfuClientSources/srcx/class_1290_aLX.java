import org.apache.log4j.Logger;

public final class aLX extends bxG
{
  private long aXW;
  private cYk cGk;

  public aLX(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong, cYk paramcYk)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
    this.aXW = paramLong;
    this.cGk = paramcYk;
  }

  protected long mC()
  {
    Su localSu = dX(this.aXW);
    if (localSu == null) {
      K.warn("[Fight] Reception d'un message de teleportpour un fighter inconnu du client, qui devrait pourtant etre dans son combat.  FightID = " + a() + ", FighterID = " + this.aXW);

      return 0L;
    }

    localSu.q(this.cGk.getX(), this.cGk.getY(), this.cGk.IB());
    return 0L;
  }

  protected void kO()
  {
    ckT localckT = mD();
    if ((localckT instanceof arl)) {
      Su localSu = ((arl)localckT).aDp().Ia();
      if ((localSu != null) && (localSu.getId() == byv.bFN().bFO().getId())) {
        aYX.bnY().bob();
        aYX.bnY().boa();
      }
    }
    super.kO();
  }
}