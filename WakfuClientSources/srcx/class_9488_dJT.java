import org.apache.log4j.Logger;

public class dJT extends csx
{
  public aiI pW()
  {
    return aiI.dfS;
  }

  public csx qb() {
    return new dJT();
  }

  public void run()
  {
    if (!pZ()) {
      return;
    }
    byv.bFN().bFO().q(false, true);

    if ((this.dvI instanceof cMb)) {
      cMb localcMb = (cMb)this.dvI;
      localcMb.b(dJO.lVS, byv.bFN().bFO());
    } else {
      K.error("Cannot REPACK a non-itemizable element of type " + getClass().getName());
    }
  }

  public boolean pZ()
  {
    byz localbyz = byv.bFN().bFO();
    if ((localbyz.bGK()) || (localbyz.adF()) || (aYP.feK.bnQ())) {
      return false;
    }

    if (!(this.dvI instanceof cMb)) {
      return false;
    }

    EA localEA = ((cMb)this.dvI).abI();
    if ((localEA.sN() != localbyz.getId()) && (!deV.jF(localEA.sN()))) {
      return false;
    }

    setEnabled(localEA.sI());

    return true;
  }

  public String qa()
  {
    if (isEnabled()) {
      return "repack";
    }
    return "repack.impossible";
  }

  protected int qc()
  {
    return coH.hWL.aw;
  }
}