import org.apache.log4j.Logger;

public class dEq extends csx
  implements bye
{
  public aiI pW()
  {
    return aiI.dfD;
  }

  public void run()
  {
    if (!pZ()) {
      return;
    }
    czr localczr = (czr)this.dvI;
    byz localbyz = byv.bFN().bFO();
    cew localcew = localbyz.aeL();

    if (localczr.V(localcew.atB())) {
      bLx();
    } else {
      cuB localcuB = Rl.a(localcew, localczr);
      if (localcuB.csX()) {
        localcew.b(this);
        localbyz.a(localcuB, true);
      } else {
        K.warn("Impossible de trouver un chemin jusqu'au sac " + this.dvI);
      }
    }
  }

  public boolean pZ()
  {
    if (!(this.dvI instanceof czr)) {
      return false;
    }

    byz localbyz = byv.bFN().bFO();
    if ((aYP.feK.bnQ()) || (localbyz.bGK())) {
      return false;
    }

    return true;
  }

  public String qa()
  {
    return "browseDimBagFlea";
  }

  public csx qb()
  {
    return new dEq();
  }

  public void b(dMM paramdMM, int paramInt1, int paramInt2, short paramShort)
  {
    paramdMM.c(this);
    bLx();
  }

  private void bLx() {
    byz localbyz = byv.bFN().bFO();
    czr localczr = (czr)this.dvI;
    cew localcew = localbyz.aeL();

    if (!localczr.V(localcew.atB())) {
      return;
    }

    nT localnT = new nT(localczr);
    if (localnT.fV())
    {
      int i = localczr.fa() - localcew.fa();
      int j = localczr.fb() - localcew.fb();
      CG localCG = CG.T(i, j);
      if (localcew.E() != localCG) {
        localcew.c(localCG);
      }

      localnT.begin();

      dtN.cZR().a(this.dvI, localnT);
    }
  }

  protected int qc()
  {
    return coH.hWw.aw;
  }
}