import org.apache.log4j.Logger;

public final class aDU extends bxG
{
  private long aXW;
  private cYk cGk;

  public aDU(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong, cYk paramcYk)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
    this.aXW = paramLong;
    this.cGk = paramcYk;
  }

  protected long mC()
  {
    Su localSu = dX(this.aXW);
    if (localSu == null) {
      K.warn("[Fight] Reception d'un message de synchronisation de position pour un fighter inconnu du client, qui devrait pourtant etre dans son combat.  FightID = " + a() + ", FighterID = " + this.aXW);

      return 0L;
    }

    K.info("Resynchronisation de la position d'un fighter dans notre combat.  FightID = " + a() + ", FighterID = " + this.aXW + " à la position " + this.cGk);

    localSu.n(this.cGk);
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