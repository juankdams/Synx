import org.apache.log4j.Logger;

public class dun extends csx
  implements bye
{
  private cVf lyh;

  public dun(cVf paramcVf)
  {
    this.lyh = paramcVf;
  }

  public aiI pW() {
    return aiI.dfW;
  }

  public void run() {
    if (!pZ()) {
      return;
    }
    dae();
  }

  public boolean pZ() {
    if ((this.dvI instanceof byo)) {
      byo localbyo = (byo)this.dvI;

      if (localbyo.Rw() == 132) {
        return false;
      }
      byz localbyz = byv.bFN().bFO();
      return (localbyo.c(dKm.lWV)) && (!localbyo.adF()) && (!localbyz.adF()) && (!aYP.feK.bnQ());
    }

    K.error("[RESURRECTION] On essaye de rez un " + this.dvI.getClass().getSimpleName());
    return false;
  }

  private void dae()
  {
    byz localbyz = byv.bFN().bFO();
    cew localcew = localbyz.aeL();

    byo localbyo = (byo)this.dvI;

    int i = localcew.atB().ac(localbyo.ML());
    if (i <= 1) {
      CG localCG = localcew.atB().Z(localbyo.ML());
      if (localCG != null) {
        localcew.c(localCG);
      }
      dxJ localdxJ = new dxJ(localbyo.getId(), this.lyh);
      byv.bFN().aJK().d(localdxJ);
    } else {
      localcew.b(this);
      if (!localbyz.b(localbyo.ML(), true, false)) {
        localcew.c(this);
        avW.aIb().a(2, 3, new Object[0]);
      }
    }
  }

  public void b(dMM paramdMM, int paramInt1, int paramInt2, short paramShort) {
    paramdMM.c(this);
    dae();
  }

  public String qa()
  {
    switch (cVD.kHY[this.lyh.ordinal()]) {
    case 1:
      return "resurrect";
    case 2:
      return "resurrectPest";
    }
    return "unknown resurrection type";
  }

  public csx qb()
  {
    return new dun(this.lyh);
  }

  protected int qc()
  {
    return coH.hWO.aw;
  }
}