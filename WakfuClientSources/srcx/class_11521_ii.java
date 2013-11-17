import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class ii extends csx
{
  public aiI pW()
  {
    return aiI.dfZ;
  }

  public void run() {
    if (!pZ()) {
      return;
    }
    byo localbyo = (byo)this.dvI;
    ayn localayn = localbyo.FB();

    if (localayn != null) {
      byz localbyz = byv.bFN().bFO();

      if (!localbyz.q(false, true)) {
        return;
      }
      pY();
    }
  }

  private void pX() {
    byo localbyo = (byo)this.dvI;
    ayn localayn = localbyo.FB();

    if (localayn != null) {
      BJ localBJ = new BJ();
      localBJ.aM(localayn.getId());
      WakfuClientInstance.awy().awz().aJK().d(localBJ);
    } else {
      K.error("Tentative de management d'un protecteur inconnu source=" + this.dvI);
    }
  }

  private void pY() {
    if (!byv.bFN().c(drM.cYz()))
      byv.bFN().a(drM.cYz());
  }

  public boolean pZ()
  {
    byz localbyz = byv.bFN().bFO();
    if (localbyz.adF()) {
      return false;
    }
    if (aYP.feK.bnQ()) {
      return false;
    }

    cvY localcvY = localbyz.cJf();

    if (!(this.dvI instanceof byo)) {
      return false;
    }
    ayn localayn = ((byo)this.dvI).FB();
    if (localayn == null) {
      return false;
    }
    int i = localayn.avc();
    if ((i == 0) || (i != localcvY.bP())) {
      return false;
    }

    return true;
  }

  public String qa()
  {
    cjH localcjH = bPE.bWu().UI().aNd();
    dpE localdpE = localcjH.hv(byv.bFN().bFO().getId());
    return (localdpE != null) && (bfi.d(localdpE.HK())) ? "manageProtector" : "seeProtector";
  }

  public csx qb()
  {
    return new ii();
  }

  protected int qc()
  {
    return coH.hWw.aw;
  }
}