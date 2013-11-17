public class Ak extends csx
{
  public aiI pW()
  {
    return aiI.dfU;
  }

  public csx qb() {
    return new Ak();
  }

  private boolean Ju() {
    byz localbyz = byv.bFN().bFO();
    return localbyz.bHa() == localbyz.bHb();
  }

  private boolean Jv() {
    byz localbyz = byv.bFN().bFO();
    short s = localbyz.Lk();
    dUx localdUx = bDk.bLI().cr(s);
    return localdUx.bMr();
  }

  private TM Jw() {
    if (Ju()) {
      return cHX.cCk();
    }
    return OX.aaQ();
  }

  public void run()
  {
    if (!pZ()) {
      return;
    }
    byv.bFN().bFO().q(false, true);

    TM localTM = Jw();
    cMb localcMb = (cMb)this.dvI;
    EA localEA = localcMb.xN();
    localTM.a(localEA);
    localTM.b(new zc(this, localEA));

    localTM.a(new zb(this, localEA));

    byv.bFN().a(localTM);
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

    return true;
  }

  public String qa()
  {
    return "move";
  }

  protected int qc()
  {
    return coH.hWq.aw;
  }
}