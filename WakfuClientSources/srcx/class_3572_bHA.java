public class bHA extends csx
{
  public aiI pW()
  {
    return aiI.dfV;
  }

  public csx qb() {
    return new bHA();
  }

  public void run()
  {
    if (!pZ()) {
      return;
    }
    cMb localcMb = (cMb)this.dvI;
    localcMb.b(dJO.lVY, byv.bFN().bFO());

    aWc.blo().eO(600044L);
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
    return "rotate";
  }

  protected int qc()
  {
    return coH.hXy.aw;
  }
}