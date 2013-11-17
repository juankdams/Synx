import java.util.ArrayList;
import org.apache.log4j.Logger;

public class lR
{
  private static final Logger K = Logger.getLogger(lR.class);
  private final Vu aPC;
  private final bFi aPD;
  private final cjx aPE;

  public lR(Vu paramVu, bFi parambFi, cjx paramcjx)
  {
    this.aPC = paramVu;
    this.aPD = parambFi;
    this.aPE = paramcjx;
  }

  void tq() {
    this.aPC.d(new dfU(this.aPD));
  }

  public static cRT a(cEG paramcEG) {
    cRT localcRT = new cRT();
    localcRT.aDe = paramcEG.tc();
    localcRT.aDf = paramcEG.nP();
    return localcRT;
  }

  public void tr() {
    dHi localdHi = (dHi)this.aPC;
    localdHi.clear();
    int i = 0; for (int j = this.aPD.bED.size(); i < j; i++) {
      cRT localcRT = (cRT)this.aPD.bED.get(i);
      try {
        cEG localcEG = a(localcRT, this.aPE);
        localdHi.f(localcEG);
      } catch (wR localwR) {
        K.error("Problème à la dé-serialisation de l'item " + localcRT, localwR);
      }
    }
  }

  public static cEG a(cRT paramcRT, cjx paramcjx) {
    anX localanX = paramcjx.di(paramcRT.aDe);
    if (localanX == null) {
      throw new wR("Impossible de trouver le refItem " + paramcRT.aDe);
    }
    aLK localaLK = new aLK(localanX);
    localaLK.l(paramcRT.aDf);
    return localaLK;
  }

  public String toString()
  {
    return "QuestInventorySerializer{m_inventory=" + this.aPC + '}';
  }
}