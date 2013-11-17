import org.apache.log4j.Logger;

final class cMv extends dcW
{
  private static Logger K = Logger.getLogger(cMv.class);

  public boolean a(Ia paramIa) {
    if (this.kLP != null) {
      bGN.gDt.gDs = true;
      bGN.gDt.fHf.e((arl)this.kLP);
      byv.bFN().a(aUK.bjU());
      bnR localbnR = new bnR(dqt.cXz(), dPD.mih.bJ(), 0, (arl)this.kLP, paramIa, bGN.gDt.fHf);

      bnc.bxw().a((arl)this.kLP, localbnR);
      bnc.bxw().d(this.kLP);
    } else {
      K.error(String.format("Impossible de crer le fight typeId=%d fightId=%d !", new Object[] { Byte.valueOf(paramIa.Rp()), Integer.valueOf(paramIa.a()) }));
    }
    return false;
  }
}