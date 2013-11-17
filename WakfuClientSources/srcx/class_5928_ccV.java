import org.apache.log4j.Logger;

public final class ccV extends bxG
{
  private static final int hvH = 5000;
  private final long aXW;
  private final cYk cGk;

  public ccV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong, cYk paramcYk)
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

    cew localcew = localSu.aeL();
    if (localcew.J("AnimMouvementTeleport-Debut")) {
      localcew.a(new WB(this, localSu));

      localcew.eq("AnimMouvementTeleport-Debut");
    } else {
      aP(localSu);
    }

    int i = Math.min(Math.abs(localcew.H("AnimMouvementTeleport-Debut") + localcew.H("AnimMouvementTeleport-Fin")), 5000);

    return i;
  }

  private void aP(Su paramSu) {
    paramSu.q(this.cGk.getX(), this.cGk.getY(), this.cGk.IB());
    cew localcew = paramSu.aeL();
    if (localcew.J("AnimMouvementTeleport-Fin"))
      localcew.eq("AnimMouvementTeleport-Fin");
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