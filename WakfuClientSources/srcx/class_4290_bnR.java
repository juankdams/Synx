import org.apache.log4j.Logger;

public final class bnR extends dqt
{
  private final arl aXG;
  private final Ia fHe;
  private final aqc fHf;

  public bnR(int paramInt1, int paramInt2, int paramInt3, arl paramarl, Ia paramIa, aqc paramaqc)
  {
    super(paramInt1, paramInt2, paramInt3);
    this.aXG = paramarl;
    this.fHe = paramIa;
    this.fHf = paramaqc;
  }

  protected long mC() {
    K.info("CREATION DU COMBAT");
    qv localqv = new qv();
    localqv.a(this.fHe, this.aXG);
    c(this.fHe);
    bOJ.aE(byv.bFN().bFO());
    Su localSu = (Su)this.aXG.eu(this.fHe.Rs());
    int i = this.aXG.ad(localSu);
    int j = this.aXG.ad(byv.bFN().bFO());

    if ((dTw.DY(this.fHe.Rp()) == dTw.mpS) && (i != j)) {
      String str = bU.fH().getString("pvp.aggroChatMessage", new Object[] { localSu.getName() });
      CM.LV().f(str, 4);
    }
    return 0L;
  }

  private void c(Ia paramIa)
  {
    byz localbyz = byv.bFN().bFO();

    this.aXG.L(paramIa.Rn());

    this.aXG.aDq();
    this.aXG.start();

    dLE.doY().t("fight", this.aXG);
    dLE.doY().t("fight.timeline", this.aXG.aDp());
    dLE.doY().t("isInFightCreationOrPlacement", Boolean.valueOf(true));

    localbyz.q(false, false);

    byv.bFN().b(aDI.aPQ());
    byv.bFN().b(duO.dax());
    byv.bFN().b(bLT.bTA());
    byv.bFN().b(rX.yA());
    byv.bFN().b(zJ.IC());
    byv.bFN().b(Nj.Xh());
    byv.bFN().b(Rl.acN());

    byv.bFN().b(dME.dpt());

    aWc.blo().g(this.aXG);

    if (this.aXG.bo(localbyz.Fx())) {
      String str = bU.fH().getString("fight.locked.at.creation");
      aEe localaEe = new aEe(str);
      localaEe.mm(4);
      CM.LV().a(localaEe);
    }
  }

  protected void kO()
  {
  }
}