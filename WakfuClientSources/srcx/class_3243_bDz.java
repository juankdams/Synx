import org.apache.log4j.Logger;

final class bDz extends dcW
{
  private static final Logger K = Logger.getLogger(bDz.class);

  public boolean a(aTf paramaTf)
  {
    Su localSu = (Su)((arl)this.kLP).eu(paramaTf.bix());
    if (localSu == null) {
      K.error("Impossible de téléporter un personnage qui n'est pas dans le combat " + paramaTf.bix());
      return true;
    }

    if (bGN.gDt.gDs) {
      bGN.gDt.fHf.a(localSu, new cYk(paramaTf.getX(), paramaTf.getY(), paramaTf.biy()));
      return false;
    }if ((bGN.gDt.gDr) || (((arl)this.kLP).aEu() == dzm.lFJ) || (((arl)this.kLP).aEu() == dzm.lFL))
    {
      ZH localZH = ZH.a(dqt.cXz(), dPD.mhD.bJ(), 0, localSu, new cYk(paramaTf.getX(), paramaTf.getY(), paramaTf.biy()), paramaTf.biz());
      bnc.bxw().a((arl)this.kLP, localZH);
      bnc.bxw().d(this.kLP);
      return false;
    }
    K.error("Impossible de téléporter un personnage du combat " + paramaTf.bix());
    return true;
  }
}