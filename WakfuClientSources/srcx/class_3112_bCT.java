import org.apache.log4j.Logger;

public class bCT extends csx
  implements bye
{
  public aiI pW()
  {
    return aiI.dfL;
  }

  public void run()
  {
    if (!pZ()) {
      return;
    }
    XQ localXQ = (XQ)this.dvI;

    byz localbyz = byv.bFN().bFO();
    cew localcew = localbyz.aeL();

    if (((!localXQ.cFe()) && (localXQ.V(localcew.atB()))) || ((localXQ.cFe()) && (localcew.atB().Z(localXQ.fa(), localXQ.fb(), localXQ.fc()))))
    {
      bLx();
    } else {
      cuB localcuB = Rl.a(localcew, localXQ);
      if (localcuB.csX()) {
        localcew.b(this);
        localbyz.a(localcuB, true);
      } else {
        K.warn("Impossible de trouver un chemin jusqu'à la vitrine " + this.dvI);
      }
    }
  }

  public boolean pZ()
  {
    if (!(this.dvI instanceof XQ)) {
      return false;
    }

    byz localbyz = byv.bFN().bFO();
    if ((aYP.feK.bnQ()) || (localbyz.bGK())) {
      return false;
    }

    XQ localXQ = (XQ)this.dvI;
    if (localXQ.sN() == localbyz.getId()) {
      return false;
    }

    setEnabled(true);
    dwN localdwN = localbyz.bHa();
    if ((localdwN != null) && (!localdwN.a(localbyz, localXQ.fa(), localXQ.fb()))) {
      setEnabled(false);
    }

    dKc localdKc = localbyz.bSe();
    if ((localdKc != null) && ((localdKc instanceof dvD))) {
      dvD localdvD = (dvD)localdKc;
      if (localdvD.daZ() == localXQ.aiQ()) {
        return false;
      }

    }

    return true;
  }

  public String qa()
  {
    return "browseFlea";
  }

  public csx qb()
  {
    return new bCT();
  }

  public void b(dMM paramdMM, int paramInt1, int paramInt2, short paramShort)
  {
    paramdMM.c(this);
    bLx();
  }

  private void bLx() {
    byz localbyz = byv.bFN().bFO();
    XQ localXQ = (XQ)this.dvI;
    cew localcew = localbyz.aeL();

    if (localXQ.cFe())
    {
      if (localcew.atB().Z(localXQ.fa(), localXQ.fb(), localXQ.fc()));
    }
    else if (!localXQ.V(localcew.atB())) {
      return;
    }

    dvD localdvD = new dvD(localbyz.bHa(), localXQ);
    if (localdvD.fV())
    {
      int i = localXQ.fa() - localcew.fa();
      int j = localXQ.fb() - localcew.fb();
      CG localCG = CG.T(i, j);
      if (localcew.E() != localCG) {
        localcew.c(localCG);
      }

      localdvD.begin();

      rX.yA().a(this.dvI, localdvD);
    }
  }

  protected int qc()
  {
    return coH.hWw.aw;
  }
}