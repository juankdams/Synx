import org.apache.log4j.Logger;

final class Ds extends dcW
{
  private static final Logger K = Logger.getLogger(Ds.class);

  public boolean a(dCX paramdCX)
  {
    byz localbyz = byv.bFN().bFO();

    arl localarl = localbyz.aeQ();
    if (localarl == null) {
      K.warn("on reçoit un message de sélection de pointEffect hors combat !?");
      return false;
    }

    Su localSu = localarl.aDp().aX(paramdCX.AD());
    anY localanY = new anY(dqt.cXz(), 0, dPD.mip.bJ(), localSu);

    bnc.bxw().a((arl)this.kLP, localanY);

    return false;
  }
}