import org.apache.log4j.Logger;

public class dTt extends csx
  implements bye
{
  public aiI pW()
  {
    return aiI.dfH;
  }

  public csx qb()
  {
    return new dTt();
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
      cRC();
    } else {
      localcew.b(this);
      K.info("Serching path to " + localXQ.ML());
      localbyz.a(Rl.a(localcew, localXQ), true);
    }
  }

  public boolean pZ()
  {
    if (!(this.dvI instanceof XQ)) {
      return false;
    }

    XQ localXQ = (XQ)this.dvI;

    byz localbyz = byv.bFN().bFO();
    if (localXQ.sN() != localbyz.getId()) {
      return false;
    }

    if ((localbyz.bGK()) || (localbyz.adF()) || (aYP.feK.bnQ())) {
      return false;
    }

    dKc localdKc = localbyz.bSe();
    if ((localdKc != null) && ((localdKc instanceof Du))) {
      Du localDu = (Du)localdKc;
      if (localDu.MF() == this.dvI) {
        return false;
      }
    }

    return true;
  }

  public String qa()
  {
    return "manageFlea";
  }

  public void b(dMM paramdMM, int paramInt1, int paramInt2, short paramShort)
  {
    paramdMM.c(this);
    cRC();
  }

  private void cRC() {
    Du localDu = new Du((XQ)this.dvI);
    if (localDu.fV())
      localDu.begin();
  }

  protected int qc()
  {
    return coH.hWf.aw;
  }
}